package com.example.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


@WebServlet(name = "HomeServlet", value = "/index")

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession().getAttribute("user");
        String password=(String)request.getSession().getAttribute("password");
        int i=0;int a=0;

        FileReader fileReader =new FileReader("C:\\File.txt");
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        List<String> list =new ArrayList<String>();
        String str=null;
        // map.contains()
        //
        while((str=bufferedReader.readLine())!=null) {

                list.add(str);

        }
        FileReader fileReader2 =new FileReader("C:\\File2.txt");
        BufferedReader bufferedReader2 =new BufferedReader(fileReader2);
        List<String> list2 =new ArrayList<String>();
        String str2=null;
        // map.contains()
        //
        while((str2=bufferedReader2.readLine())!=null) {

            list2.add(str2);

        }
        if (user == null) {
            request.setAttribute("name", "Guest");
            request.setAttribute("buttonName", "Sign In");
            request.setAttribute("buttonLink", "sign-in");
        } else {
       while (!list.get(i).equals(list.get(list.size() - 1))) {
           if(user.length()!=list.get(i).length()){

           }else {
               if (user.equals(list.get(i)) && password.equals(list2.get(i))) {
                   a = 1;
               }
           }
            i++;
        }



                if (a==0) {
                    request.setAttribute("name", "Guest");
                    request.setAttribute("buttonName", "Sign In");
                    request.setAttribute("buttonLink", "sign-in");
                } else {
                    request.setAttribute("name", user);
                    request.setAttribute("buttonName", "Log Out");
                    request.setAttribute("buttonLink", "log-out");
                }
            }
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
