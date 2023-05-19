class admin {
    static boolean enroll(String course, String student) {
      if (Data.students.contains(student) && Data.courses.contains(course)) {
        Data.enrollments.add(new String[] { student, course });
      }
      return false;
    }
   }
   
   
