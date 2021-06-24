package com.example.demo4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, List<String>> userHobby;
    @Override
    public void init() {
        userHobby = new HashMap<>();
        List<String> putlist=new ArrayList<>();
        putlist.add("skiing");
        putlist.add("extreme");
        putlist.add("scuba");
        putlist.add("dating");
        userHobby.put("Bob",putlist);


        userHobby.put("Jim", putlist);
        userHobby.put("James", putlist);
        userHobby.put("Tom", putlist);
        userHobby.put("Fei", putlist);
        userHobby.put("Jone", putlist);
        userHobby.put("Fred", putlist);
        userHobby.put("Pradeep", putlist);
        userHobby.put("Philippe", putlist);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hobby = request.getParameter("hobby");
        List<String> names = new ArrayList<>();
//        userHobby.forEach((k, v) -> {
//            int i=0;
//            String A=v.get(v.size()-1);
//            while(!v.get(i).equals(A)){
//                if(v.get(i).equals(hobby)){
//                    names.add(k);
//                    i=v.size()-2;
//                }i++;
//            }
//
//        });

        userHobby.forEach((k, v) -> {
            if (v.contains(hobby)) {
                names.add(k);
            }
        });

        request.setAttribute("names", names);
        request.setAttribute("hobby", hobby);
        request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }

}
