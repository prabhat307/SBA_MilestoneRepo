class Palindrome
{
   public static void main(String args[])
   {
      String orginal="Prabhat" , reverse = "";
      int len = original.length();
      for ( int i = len - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string isn't a palindrome.");
   }
}
