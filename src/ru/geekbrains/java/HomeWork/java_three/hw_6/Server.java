package ru.geekbrains.java.HomeWork.java_three.hw_6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

import org.apache.log4j.Logger;

public class Server {
    private Vector<ClientHandler> clients;
    static Logger file = Logger.getLogger("file");
    Scanner scanner = new Scanner(System.in);

    public Server() {
        clients = new Vector<>();
        ServerSocket server = null;
        Socket socket = null;
        try {
            AuthService.connect();
            server = new ServerSocket(8181);
            System.out.println("Сервер запущен. Ожидаем клиентов...");
            file.info("ServerStart");
            while (true) {
                socket = server.accept();
                file.info("Client Connected");
                System.out.println("Клиент подключился");
                new ClientHandler(this, socket);
                if (scanner.nextLine().equals("/end")) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            file.error("Server: " + e.getMessage());
        } finally {
            try {
                file.warn("Server closed socket");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                file.warn("Server closed");
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            AuthService.disconnect();
        }
    }

    public void sendPersonalMsg(ClientHandler from, String nickTo, String msg) {
        for (ClientHandler o : clients) {
            if (o.getNick().equals(nickTo)) {
                o.sendMsg("from " + from.getNick() + ": " + msg);
                from.sendMsg("to " + nickTo + ": " + msg);
                return;
            }
        }
        from.sendMsg("Клиент с ником " + nickTo + " не найден в чате");
    }

    public void broadcastMsg(ClientHandler from, String msg) {
        for (ClientHandler o : clients) {
            if (!o.checkBlackList(from.getNick())) {
                o.sendMsg(msg);
            }
        }
    }

    public boolean isNickBusy(String nick) {
        for (ClientHandler o : clients) {
            if (o.getNick().equals(nick)) {
                return true;
            }
        }
        return false;
    }

    public void broadcastClientsList() {
        StringBuilder sb = new StringBuilder();
        sb.append("/clientslist ");
        for (ClientHandler o : clients) {
            sb.append(o.getNick() + " ");
        }
        String out = sb.toString();
        for (ClientHandler o : clients) {
            o.sendMsg(out);
        }
    }

    public void subscribe(ClientHandler client) {
        clients.add(client);
        broadcastClientsList();
    }

    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
        broadcastClientsList();
    }
}

