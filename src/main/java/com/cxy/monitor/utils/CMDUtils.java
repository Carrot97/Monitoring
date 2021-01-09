package com.cxy.monitor.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CMDUtils {

    // 运行控制行命令
    public static String excuteCMDCommand(String cmdCommand) {
        StringBuilder stringBuilder = new StringBuilder();
//        Process process = null;
        try {
            Runtime.getRuntime().exec(cmdCommand);
//            BufferedReader bufferedReader = new BufferedReader(
//                    new InputStreamReader(process.getInputStream(), "GBK"));
//            String line = null;
//            while((line=bufferedReader.readLine()) != null)
//            {
//                stringBuilder.append(line+"\n");
//            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
