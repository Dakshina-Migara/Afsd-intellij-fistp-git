import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "admin@gmail.com";
        int dbPassword = 12345;

        System.out.print("Enter email : ");
        String email = scan.next();

        boolean isLoginSuccess = false; //that using for the track the login attemp was successful

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter password : ");
            int password = scan.nextInt();

            if (dbEmail.equals(email) && dbPassword == password) {
                isLoginSuccess = true; // login success
                break;
            }
            if (i == 4) {
                System.out.println("Account Locked !");
                break;
            }
            System.out.println("Password incorrect try again !. (Rounds Remaining :  " + (4 - i) + " )");
        }
        if (isLoginSuccess) {
            //logical part
            System.out.print("Enter the age : ");
            int userAge = scan.nextInt();

            System.out.print("Enter the name in english : ");
            String userName = scan.next();

            System.out.print("Enter the name in sinhala : ");
            String userName1 = scan.next();

            System.out.print("Enter the lagnaya : ");
            String lagnaya = scan.next();

            if (userAge >= 18) {
                char firstLetter = userName.charAt(0);
                int firstLetter1 = firstLetter;

                String result;
                if (firstLetter1 % 2 == 0) {
                    result = "අවාසනාවන්තයෙකි";
                } else {
                    result = "වාසනාවන්තයෙකි";

                    String prathipalaya;

                    switch (lagnaya) {
                        case "mesha":
                            prathipalaya = ".හිමි ඔබට යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්.";
                            lagnaya = "මේෂ";
                            break;
                        case "wushaba":
                            prathipalaya = " හිමි ඔබ අන් අයගේ සිත් දිනා ගනී.";
                            lagnaya = "වෘෂභ";
                            break;
                        case "mithuna":
                            prathipalaya = " හිමි ඔබට සිත නිතර චංචල වී, දුක් සහිත අත්දැකීම්.";
                            lagnaya = "මිථුන";
                            break;
                        case "kataka":
                            prathipalaya = " හිමි ඔබට අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි.";
                            lagnaya = "කටක";
                            break;
                        case "sinha":
                            prathipalaya = " හිමි ඔබට වස්තුව සහ සැප සම්පත් ලඟා වේ.";
                            lagnaya = "සිංහ";
                            break;
                        case "kanya":
                            prathipalaya = " හිමි ඔබට දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම.";
                            lagnaya = "කන්යා";
                            break;
                        case "thula":
                            prathipalaya = " හිමි ඔබට හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය.";
                            lagnaya = "තුලා";
                            break;
                        case "wushchika":
                            prathipalaya = " හිමි ඔබට විවාහය අපේක්ෂකයින් ශුභයි.";
                            lagnaya = "වෘශ්චික";
                            break;
                        case "dhanu":
                            prathipalaya = "හිමි ඔබට රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්ය.";
                            lagnaya = "ධනු";
                            break;
                        case "makara":
                            prathipalaya = " හිමි ඔබට අධ්යාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට.";
                            lagnaya = "මකර";
                            break;
                        case "kumba":
                            prathipalaya = " හිමි ඔබට පවුලේ සමගිය සහ සතුට.";
                            lagnaya = "කුම්භ";
                            break;
                        case "meena":
                            prathipalaya = " හිමි ඔබට ඔබේ දක්ෂතා ක්රියාවෙන්ම ඔප්පු කර පෙන්වීමට.";
                            lagnaya = "මීන";
                            break;
                        default:
                            prathipalaya = "නිවැරදි ලග්නය ඇතුලත් කරන්න";
                    }
                    System.out.println(userName1 + " ඔබ " + result + lagnaya + prathipalaya);
                }
            } else {
                System.out.println("Age is not enough!");
            }

        }

    }
}
