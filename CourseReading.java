// --== CS400 File Header Information ==--
// Name: <Shutong Lin>
// Email: <slin326@wisc.edu>
// Team: <BB>
// Role: <Data Wrangler 1>
// TA: <Brianna (Bri) Cochran>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>
//------------------------------------------------------------------------------------------------------------------------------------------------------------------


//For this project, data wrangler 1 will create three class, CourseReading, ReadCSV, and WriteCSV class and share will other teeammates.
/**
 *	CourseReading Object
 */

class CourseReading {
	/**
	 * ISBN value
	 */
	private String ISBN;
	/**
	 * bookTitle value
	 */
	private String bookTitle;
	/**
	 * course value
	 */
	private String course;

	/**
	 * @param ISBN
	 * @param bookTitle
	 * @param course
	 */
	public CourseReading(String ISBN, String bookTitle, String course) {
		super();
		this.ISBN = ISBN;
		this.bookTitle = bookTitle;
		this.course = course;
	}

	/**
	 * @param csvLineContent : csvLineContent[0] is isbn , csvLineContent[1] is bookTitle, csvLineContent[0] is course
	 */
	public CourseReading(String[] csvLineContent) {
		this(Long.parseLong(csvLineContent[0]), csvLineContent[1], csvLineContent[2]);
	}

	
	/**
	 * isbn,bookTitle,course  getter and setter
	 * */

	public String getBookTitle() {
		return bookTitle;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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

	/**
	 * change to csv file style
	 * @return
	 */
	public String toCSVContent() {
		return String.join(",", String.valueOf(this.ISBN), this.bookTitle, this.course);
	}

}
