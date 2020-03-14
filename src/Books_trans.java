import java.util.Date;


public class Books_trans {
private int trans_id;
private String reader;
private String isbn;
private String contact_no;
private Date issue_date;
private Date expected_return_date;
private Date actual_date;


public int getTrans_id() {
	return trans_id;
}
public void setTrans_id(int trans_id) {
	this.trans_id = trans_id;
}
public String getReader() {
	return reader;
}
public void setReader(String reader) {
	this.reader = reader;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getContact_no() {
	return contact_no;
}
public void setContact_no(String contact_no) {
	this.contact_no = contact_no;
}
public Date getIssue_date() {
	return issue_date;
}
public void setIssue_date(Date issue_date) {
	this.issue_date = issue_date;
}
public Date getExpected_return_date() {
	return expected_return_date;
}
public void setExpected_return_date(Date expected_return_date) {
	this.expected_return_date = expected_return_date;
}
public Date getActual_date() {
	return actual_date;
}
public void setActual_date(Date actual_date) {
	this.actual_date = actual_date;
}

}
