package com.news.news.Config;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
    public static void openHomePage() {
        try {
            URI homepage = new URI("http://localhost:8081/price");
            Desktop.getDesktop().browse(homepage);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
