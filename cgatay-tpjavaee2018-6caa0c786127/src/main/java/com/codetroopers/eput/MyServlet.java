/*
 * Copyright 2016 Code-Troopers.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codetroopers.eput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cgatay on 13/01/16.
 */
//tag::class[]
//tag::annot[]
@WebServlet(urlPatterns = "/counter")
//end::annot[]
public class MyServlet extends HttpServlet{

    static int count[] = new int[]{0,0};

    @Override
    //tag::get[]
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count[0]++;
        writeResponse(resp);
    }
    //end::get[]

    @Override
    //tag::post[]
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count[1]++;
        writeResponse(resp);
    }
    //end::post[]

    private void writeResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("Get count : " + count[0]);
        response.getWriter().println("Post count : " + count[1]);
    }
}
//end::class[]