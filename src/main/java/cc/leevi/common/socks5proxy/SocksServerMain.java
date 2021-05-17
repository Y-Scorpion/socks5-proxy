package cc.leevi.common.socks5proxy;

import java.io.IOException;

public class SocksServerMain {

    public static void main(String[] args) {
        Socks5ProxyServer socks5ProxyServer = new Socks5ProxyServer();
        socks5ProxyServer.startServer();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
