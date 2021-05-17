package cc.leevi.common.socks5proxy;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Socks5ProxyServerTest {

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