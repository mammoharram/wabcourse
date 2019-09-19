package mum.edu.lab12.servlets;

import mum.edu.lab12.domain.Quiz;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@WebServlet(value = "/quiz", loadOnStartup = 1)
public class QuizServlet extends HttpServlet {

    private Quiz quiz = new Quiz();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int answer = Integer.parseInt(req.getParameter("answer"));
        int index = quiz.getQuestions().indexOf(quiz.getRetrieveRandomQuestion());
        if (quiz.getAnswers()[index] == answer) {
            quiz.count++;
        }
        if (!quiz.getVisitedQuestions().contains(quiz.getRetrieveRandomQuestion()) && quiz.getVisitedQuestions().size() < 4) {
            quiz.getVisitedQuestions().add(quiz.getRetrieveRandomQuestion());
            quiz.setRetrieveRandomQuestion(retrieveRandomQuestion());
            while (quiz.getVisitedQuestions().contains(quiz.getRetrieveRandomQuestion())) {
                quiz.setRetrieveRandomQuestion(retrieveRandomQuestion());
            }
            StringBuilder builder = new StringBuilder();
            builder.append("<h1>The Number Quiz : </h1>\n" +
                    "    <h3>Your current score is " + quiz.count + ".</h3>\n" +
                    "    <p>Guess the next number in the sequence</p>\n" +
                    "    <h3>sequence is : " + quiz.getRetrieveRandomQuestion() + "</h3>\n" +
                    "    <form method=\"post\" action=\"quiz\">\n" +
                    "        <label>Your answer <input name=\"answer\" id=\"answer\"></label><br/><br/>\n" +
                    "        <input type=\"submit\" value=\"Submit\">\n" +
                    "    </form>");
            resp.getWriter().println(builder.toString());
        } else {
            quizFinished(resp);
        }

    }

    private void quizFinished(HttpServletResponse res) throws IOException {
        PrintWriter writer = res.getWriter();
        writer.println("your score is " + quiz.count);
        writer.println("you have completed quiz with score " + quiz.count + " out of " + quiz.getQuestions().size());
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        quiz.setRetrieveRandomQuestion(retrieveRandomQuestion());
        config.getServletContext().setInitParameter("question", quiz.getRetrieveRandomQuestion());
    }

    private String retrieveRandomQuestion() {
        return quiz.getQuestions().get(new Random().nextInt(quiz.getQuestions().size()));
    }
}
