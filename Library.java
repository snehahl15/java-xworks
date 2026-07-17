class Library {

    static String studentName;
    static String bookTitle;
    static String authorName;
    static int bookId;
    static String issueDate;
    static String returnDate;
    static double fineAmount;
    static boolean isBookIssued;

    public static boolean issueBook(
            String sName,
            String bTitle,
            String aName,
            int bId,
            String iDate,
            String rDate,
            double fine,
            boolean issued) {

        isBookIssued = false;

        studentName = sName;
        bookTitle = bTitle;
        authorName = aName;
        bookId = bId;
        issueDate = iDate;
        returnDate = rDate;
        fineAmount = fine;

        isBookIssued = issued;

        return isBookIssued;
    }

    public static void fetchBookDetails() {

        System.out.println("Student Name : " + studentName);
        System.out.println("Book Title   : " + bookTitle);
        System.out.println("Author Name  : " + authorName);
        System.out.println("Book ID      : " + bookId);
        System.out.println("Issue Date   : " + issueDate);
        System.out.println("Return Date  : " + returnDate);
        System.out.println("Fine Amount  : " + fineAmount);
        System.out.println("Book Issued  : " + isBookIssued);
        System.out.println("--------------------------------------");
    }
}