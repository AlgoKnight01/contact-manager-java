try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] parts = line.split(",",-1);
                if(parts.length != 3 || parts[0].isBlank()
                    || parts[1].isBlank() || parts[2].isBlank()){
                    System.out.println("Skipping invalid line: "+ line);
                    continue;
                }
                Contact c = new Contact(parts[0], parts[1], parts[2]);
                contacts.add(c);
            }