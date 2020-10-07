
import java. util.Scanner;
class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название задачи и время на ее выполнение:");
        String input = scanner.nextLine();

        int startPos = input.indexOf("начинается в");
        String startTimeString = input.substring(startPos+12, startPos+15);

        int endPos = input.indexOf("заканчивается в");
        String endTimeString = input.substring(endPos+15, endPos + 18);

        startTimeString =  startTimeString.trim();
        endTimeString = endTimeString.trim();

        int startTime = Integer.parseInt(startTimeString);
        int endTime = Integer.parseInt(endTimeString);

        int x = endTime - startTime;

        if(x < 0) System.out.println("Результат вычесления меньше нуля!");
        else if(x > 0)System.out.println("На задачу потребуется:" + x + "ч.");


    }
}
