package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.mvc.Controller;
import next.dao.AnswerDao;
import next.dao.QuestionDao;

public class ShowController implements Controller {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		Long questionId = Long.parseLong(req.getParameter("questionId"));
		QuestionDao questionDao = new QuestionDao();
		AnswerDao answerDao = new AnswerDao();
		req.setAttribute("question", questionDao.findById(questionId));
		req.setAttribute("answer", answerDao.findAllByQuestionId(questionId));
		return "/qna/show.jsp";
	}

}
