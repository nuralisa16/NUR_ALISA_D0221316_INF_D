 Scanner sc = new Scanner(System.in);
        int k = 1;
        while(sc.hasNext()){//Deteksi EOF
            String s = sc.nextLine();
            System.out.println(k+" "+s);
            k++;
        }
