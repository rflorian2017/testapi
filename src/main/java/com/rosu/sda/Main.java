package com.rosu.sda;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        JsonUtils.getStudents(NetworkUtils.getResponseFromURL());
    }
}
