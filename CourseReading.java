// --== CS400 File Header Information ==--
// Name: <Shutong Lin>
// Email: <slin326@wisc.edu>
// Team: <BB>
// Role: <Data Wrangler 1>
// TA: <Brianna (Bri) Cochran>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>
//-------------------------------------------------------------------------Not finish yet-----------------------------------------------------------------------------------------
class CourseReading {
	private int isbn;
	private String bookTitle;
	private String course;

	public CourseReading(int isbn, String bookTitle, String course) {
		super();
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.course = course;
	}

	public CourseReading(String[] csvLineContent) {
		this(Integer.parseInt(csvLineContent[0]), csvLineContent[1], csvLineContent[2]);
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String toCSVContent() {
		return String.join(",", String.valueOf(this.isbn), this.bookTitle, this.course);
	}

}
