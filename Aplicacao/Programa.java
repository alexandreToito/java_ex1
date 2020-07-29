package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Product;
import Entidades.ImportedProduct;
import Entidades.UsedProduct;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Product #" + (i+1) + " data: ");
            System.out.print("Commom, used or imported? (c/u/i) ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(type == 'c'){
                list.add(new Product(name, price));
            }
            else if (type == 'i'){
                System.out.print("Custum fee: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }
            else {
                System.out.print("Manufactured date: ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }
        }       

        System.out.println("PRICE TAGS: ");
        for(Product prod : list){
            System.out.println(prod.toString());
        }

        sc.close();
    }
    
}