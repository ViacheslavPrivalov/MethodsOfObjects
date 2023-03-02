public class Main {
    public static void main(String[] args) {

        Author chekhov = new Author("Антон", "Чехов");
        Author rowling = new Author("Джоан", "Роулинг");
        Book theCherryGarden = new Book("Вишнёвый сад", chekhov, 1904);
        Book harryPotter = new Book("Harry Potter", rowling, 1997);
        System.out.println("Автор: " + theCherryGarden.getAuthor());
        System.out.println(theCherryGarden);
        System.out.println();
        System.out.println("Автор: " + harryPotter.getAuthor());
        System.out.println(harryPotter.toString());
        System.out.println();
        System.out.println("theCherryGarden.hashCode() = " + theCherryGarden.hashCode());
        System.out.println("harryPotter.hashCode() = " + harryPotter.hashCode());
        System.out.println("rowling.hashCode() = " + rowling.hashCode());
        System.out.println("chekhov.hashCode() = " + chekhov.hashCode());
        System.out.println("rowling.equals(chekhov) = " + rowling.equals(chekhov));
        System.out.println("harryPotter.equals(theCherryGarden) = " + harryPotter.equals(theCherryGarden));
        System.out.println();
        Author author1 = new Author("Антон", "Не Чехов");
        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("chekhov.hashCode() = " + chekhov.hashCode());
        System.out.println("author1.equals(chekhov) = " + author1.equals(chekhov));
    }
}