static boolean isAnagram(String a, String b) {
        // Complete the function
        int counter1 = 0, counter2 = 0, ans = 1;
        if (a.length() != b.length()) {
        return false;
        } else {
        for (int i = 0; i < a.length(); i++) {
        for (int j = 0; j < b.length(); j++) {
        String st1= String.valueOf(a.charAt(i));
        String st2= String.valueOf(b.charAt(j));
        String st3= String.valueOf(a.charAt(j));
        if(st1.equalsIgnoreCase(st2))
        {
        counter1++;
        }
        if(st1.equalsIgnoreCase(st3))
        {
        counter2++;
        }
        }
        if (counter1 != counter2) {
        return false;
        } else {
        counter1 = counter2 = 0;
        }
        }
        }
        return true;
        }
