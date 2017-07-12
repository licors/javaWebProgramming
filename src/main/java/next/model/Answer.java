package next.model;

import java.util.Date;

public class Answer {
	private long answerId;
	private String writer;
	private String contents;
	private Date createdDate;
	private long questionId;

	public Answer(long answerId, String writer, String contents, Date createdDate, long questionId) {
		super();
		this.answerId = answerId;
		this.writer = writer;
		this.contents = contents;
		this.createdDate = createdDate;
		this.questionId = questionId;
	}
	
	public Answer(String writer, String contents, long questionId) {
		// TODO Auto-generated constructor stub
		this(0,writer,contents,new Date(), questionId);
	}

	public long getAnswerId() {
		return answerId;
	}
	public String getWriter() {
		return writer;
	}
	public String getContents() {
		return contents;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public long getQuestionId() {
		return questionId;
	}
	public Long getTimeFromCreateDate() {
		// TODO Auto-generated method stub
		return this.createdDate.getTime();
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", writer=" + writer + ", contents=" + contents + ", timestamp="
				+ createdDate + ", questionId=" + questionId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (answerId ^ (answerId >>> 32));
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + (int) (questionId ^ (questionId >>> 32));
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		if (answerId != other.answerId)
			return false;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (questionId != other.questionId)
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
}
