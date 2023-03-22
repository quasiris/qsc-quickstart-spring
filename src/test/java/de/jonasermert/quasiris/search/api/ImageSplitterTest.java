package de.jonasermert.quasiris.search.api;

import org.junit.jupiter.api.Test;

public class ImageSplitterTest {

    @Test
    public void testWithTwoImages(){
        String url = "";
        String[] urlSplit = url.split("https://");
        String s = urlSplit[urlSplit.length - 1];
        System.out.println("https://"+s);
    }



}
