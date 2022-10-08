package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i =0; i<height; i++){
            for (int j =0; j<height; j++){
                if (i==0){
                    System.out.print("8");
                }else if (i==height-1){
                    System.out.print("8");
                }else {
                    if (height%2!=0){
                        if (i>height/2){
                            int varX = height-1-i;
                            System.out.print(" ".repeat(varX)+"8".repeat(height-varX*2)+" ".repeat(varX));
                        }else System.out.print(" ".repeat(i)+"8".repeat(height-i*2)+" ".repeat(i));
                        break;
                    }else {
                        if (i>height/2){
                            int varX = height-1-i;
                            System.out.print(" ".repeat(varX)+"8".repeat(height-varX*2)+" ".repeat(varX));
                        }else if (i==height/2){
                            System.out.print(" ".repeat(i-1)+"8".repeat(height-(i-1)*2)+" ".repeat(i-1));
                        }else System.out.print(" ".repeat(i)+"8".repeat(height-i*2)+" ".repeat(i));
                        break;
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
    }
}
