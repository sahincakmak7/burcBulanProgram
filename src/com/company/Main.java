package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay :");
        month = input.nextInt();


        if (month == 1) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }

        } else if (month == 2) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;

            }
        } else if (month == 3) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;

            }

        } else if (month == 4) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;

            }

        } else if (month == 5) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;

            }

        } else if (month == 6) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;

            }

        } else if (month == 7) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;

            }

        } else if (month == 8) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;

            }

        } else if (month == 9) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;

            }

        } else if (month == 10) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;

            }

        } else if (month == 11) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;

            }

        } else if (month == 12) {
            System.out.print("Doğduğunuz gün :");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;

            }

        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız,tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz :" + burc);

        }
    }
}