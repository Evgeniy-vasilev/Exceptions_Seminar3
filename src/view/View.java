package view;

import java.util.Scanner;

public class View {
    public String CreateUser(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество Дата рождения (dd.mm.yyyy) Телефон (10) Пол (f/m): ");
        return inp.nextLine();
    }

    public void Exception(Exception e){
        Exception(e.getMessage());
    }

    public void Exception(String str){
        System.out.println(str);
    }
}
