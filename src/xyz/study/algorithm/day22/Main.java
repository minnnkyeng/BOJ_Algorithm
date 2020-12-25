package xyz.study.algorithm.day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            int loopCnt = Integer.parseInt(reader.readLine());
            StringTokenizer st = null;
            for(int i=0; i<loopCnt; i++){
                st = new StringTokenizer(reader.readLine(), " ");
                writer.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
            }
            reader.close();
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}