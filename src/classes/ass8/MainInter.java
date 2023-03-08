package classes.ass8;

public class MainInter {
    public static void main(String[] args) {
          AnInterface obj = new AnInterface() {
              @Override
              public void login() {

              }

              @Override
              public void logout() {

              }

              @Override
              public void singup() {
                  System.out.println("This is the best way...");
              }
          };

          obj.singup();
    }
}
