package com.example.demo2.utils;

public class AgentChecker {
    public static String getBrowser(String agent) {
        if (agent.contains("Chrome")) return "Chrome";
        else if (agent.contains("Firefox")) return "Firefox";
        else if (agent.contains("Safari")) return "Safari";
        else return "Unknown";
    }

    public static String getOS(String agent) {
        if (agent.contains("Windows")) return "Windows";
        else if (agent.contains("Mac")) return "Mac OS";
        else return "Linux";
    }
}
