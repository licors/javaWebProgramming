package next.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import core.jdbc.JdbcTemplate;
import core.jdbc.RowMapper;
import next.model.Answer;

public class AnswerDao {

	public List<Answer> findAllByQuestionId(Long questionId) {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String sql = "SELECT answerId, writer, contents, createdDate, questionId FROM ANSWERS WHERE questionId = ?";
		RowMapper<Answer> rm = new RowMapper<Answer>() {

			@Override
			public Answer mapRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				return new Answer(rs.getLong("answerId"), rs.getString("writer"), rs.getString("contents"), rs.getDate("createdDate"), rs.getLong("questionId"));
			}
		};
		return jdbcTemplate.query(sql, rm, questionId);
	}

}
