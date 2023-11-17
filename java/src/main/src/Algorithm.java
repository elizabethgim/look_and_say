
public class Algorithm {
    public static int LookAndSay(String inputNumber){
        String[] numbers = inputNumber.split("");
        String prev = numbers[0];
        int count = 0;
        StringBuilder answer = new StringBuilder();

        if(numbers.length == 1){
            return Integer.parseInt("1"+numbers[0]);
        }

        for(String number: numbers){
            if(prev.equals(number)){
                count++;
            } else{
                answer.append(Integer.toString(count)).append(prev);
                prev = number;
                count = 1;
            }
        }

        int last = numbers.length-1;
        if(prev.equals(numbers[last])){
            answer.append(Integer.toString(count)).append(numbers[last]);
        } else{
            answer.append(Integer.toString(count)).append(numbers[last-1])
                    .append("1").append(numbers[last]);
        }

        return Integer.parseInt(String.valueOf(answer));
    }
}
