package project.star;


public class Triangle implements Star {

    @Override
    public void draw(int count) {
        for(int i = 0; i < count; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}