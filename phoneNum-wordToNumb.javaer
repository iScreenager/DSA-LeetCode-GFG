public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans = getPhoneNumber(s);
        for (int i = 0; i < ans.length(); i++) {
        System.out.print(ans.charAt(i));
        }

    }

    static String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static String getPhoneNumber(String s) {
        // Write your code here
        String ans = "";
        int j=0;
        String[] word = s.split(" ");
        /*for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]+" ");
        }*/
       while(j<word.length){
            String temp = word[j];
            if(temp.equals("double")){
                j++;
                temp = word[j];

                for(int i=1;i<2;i++){
                    ans += Arrays.asList(num).indexOf(temp);


                }
            }else if(temp.equals("triple")){
j++;
                temp = word[j];
                for(int i=1;i<3;i++){
                    ans += Arrays.asList(num).indexOf(temp);

                }
            }else {


               ans += Arrays.asList(num).indexOf(temp);

               j++;

           }

        }
       return ans;


    }

