import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Input the number of devices you want to create: ");
        int input = num.nextInt();

        Random random = new Random();
        String[] types= {"smartphone", "laptop", "tablet"};
        double[] smartphonePrices = {699.99, 799.99, 649.00, 899.99, 749.99};
        double[] laptopPrices = {999.99, 1199.99, 849.00, 1499.99, 1299.99};
        double[] tabletPrices = {299.99, 449.99, 399.00, 599.99, 349.99};
        int[] smartphoneWeights = {165, 180, 155, 175, 160};
        int[] laptopWeights = {1500, 1700, 1400, 1600, 1350};
        int[] tabletWeights = {400, 500, 350, 450, 380};
        double[] smartphoneScreenSizes = {6.2, 5.8, 6.4, 6.1, 5.5};
        double[] laptopScreenSizes = {14.0, 15.6, 13.3, 17.3, 12.5};
        double[] tabletScreenSizes = {10.1, 9.7, 11.0, 8.0, 12.9};
        String[] smartphoneColors = {"Black", "Silver", "Blue", "Gold", "Rose Gold"};
        String[] laptopColors = {"Gray", "Black", "Silver", "White", "Blue"};
        String[] tabletColors = {"Silver", "Space Gray", "Gold", "Rose Gold", "Black"};
        int[] smartphoneMemory = {8, 6, 12, 4, 8};
        int[] laptopMemory = {16, 8, 32, 16, 8};
        int[] tabletMemory = {4, 6, 8, 3, 4};
        int s = 0;
        int l = 0;
        int t = 0;
        double sPrice = 0;
        double lPrice = 0;
        double tPrice = 0;
        double sWeight = 0;
        double lWeight = 0;
        double tWeight = 0;

        ArrayList<Device> devices = new ArrayList<Device>();
        for (int i = 0; i<input; i++) {
            int randomIndex = (int) (Math.random() * types.length);
            String randomType = types[randomIndex];
            if (randomType == "smartphone"){
                double randomPrice = smartphonePrices[random.nextInt(smartphonePrices.length)];
                int randomWeight = smartphoneWeights[random.nextInt(smartphoneWeights.length)];
                double randomScreenSize = smartphoneScreenSizes[random.nextInt(smartphoneScreenSizes.length)];
                String randomColor = smartphoneColors[random.nextInt(smartphoneColors.length)];
                int randomMemory = smartphoneMemory[random.nextInt(smartphoneMemory.length)];
                Smartphone smartphone = new Smartphone("smartphone", randomPrice, randomWeight, randomScreenSize, randomColor, randomMemory);
                devices.add(smartphone);
                s++;
                sPrice += smartphone.getPrice();
                sWeight += smartphone.getWeight();
            }
            else if (randomType == "laptop"){
                double randomPrice = laptopPrices[random.nextInt(laptopPrices.length)];
                int randomWeight = laptopWeights[random.nextInt(laptopWeights.length)];
                double randomScreenSize = laptopScreenSizes[random.nextInt(laptopScreenSizes.length)];
                String randomColor = laptopColors[random.nextInt(laptopColors.length)];
                int randomMemory = laptopMemory[random.nextInt(laptopMemory.length)];
                Laptop laptop = new Laptop("laptop", randomPrice, randomWeight, randomScreenSize, randomColor, randomMemory);
                devices.add(laptop);
                l++;
                lPrice += laptop.getPrice();
                lWeight += laptop.getWeight();
            }
            else {
                double randomPrice = tabletPrices[random.nextInt(tabletPrices.length)];
                int randomWeight = tabletWeights[random.nextInt(tabletWeights.length)];
                double randomScreenSize = tabletScreenSizes[random.nextInt(tabletScreenSizes.length)];
                String randomColor = tabletColors[random.nextInt(tabletColors.length)];
                int randomMemory = tabletMemory[random.nextInt(tabletMemory.length)];
                Tablet tablet = new Tablet("tablet", randomPrice, randomWeight, randomScreenSize, randomColor, randomMemory);
                devices.add(tablet);
                t++;
                tPrice += tablet.getPrice();
                tWeight += tablet.getWeight();
            }
        }

        for (int i = 0; i < devices.size(); i++){
            System.out.println((i + 1) + "." + devices.get(i).getInfo());
        }
        System.out.println();
        System.out.println("Number of smartphones: " + s);
        System.out.println("Number of laptops: " + l);
        System.out.println("Number of tablets: " + t);
        System.out.println();
        System.out.println("Total price is " + (sPrice + lPrice + tPrice) + "$.");
        System.out.println("Total weight is " + (sWeight + lWeight + tWeight) + "gr.");
    }
}