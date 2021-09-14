import java.util.Scanner;

public class Troubleshooting_Car_Issues {
    public static void main(String [] arg){
        System.out.print("Is the car silent when you turn the key? ");
        Scanner InputInp = new Scanner(System.in);
        String Input = InputInp.nextLine();

        if(Input.equals("yes")){
            System.out.print("Are the battery terminals corroded? ");
            Scanner InputInp2 = new Scanner(System.in);
            String Input2 = InputInp2.nextLine();

            if(Input2.equals("yes")){
                System.out.print("Clean the terminals and try starting again.");
            }
            else{
                System.out.print("Replace the cables and try again.");
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            Scanner InputInp3 = new Scanner(System.in);
            String Input3 = InputInp3.nextLine();

            if (Input3.equals("yes")) {
                System.out.print("Replace the battery.");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                Scanner InputInp4 = new Scanner(System.in);
                String Input4 = InputInp4.nextLine();

                if(Input4.equals("yes")){
                    System.out.print("Check the spark plug connection.");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    Scanner InputInp5 = new Scanner(System.in);
                    String Input5 = InputInp5.nextLine();

                    if(Input5.equals("yes")){
                        System.out.print("Does your car have fuel injection? ");
                        Scanner InputInp6 = new Scanner(System.in);
                        String Input6 = InputInp6.nextLine();

                        if(Input6.equals("yes")){
                            System.out.print("Get it in for service!");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
        }
    }
