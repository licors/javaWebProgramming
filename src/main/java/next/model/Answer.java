package next.model;

import java.util.Date;

public class Answer {
	private long answerId;
	private String writer;
	private String contents;
	private Date timestamp;
	private long questionId;

	public Answer(long answerId, String writer, String contents, Date timestamp, long questionId) {
		super();
		this.answerId = answerId;
		this.writer = writer;
		this.contents = contents;
		this.timestamp = timestamp;
		this.questionId = questionId;
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
	public Date getTimestamp() {
		return timestamp;
	}
	public long getQuestionId() {
		return questionId;
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", writer=" + writer + ", contents=" + contents + ", timestamp="
				+ timestamp + ", questionId=" + questionId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (answerId ^ (answerId >>> 32));
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + (int) (questionId ^ (questionId >>> 32));
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
}
