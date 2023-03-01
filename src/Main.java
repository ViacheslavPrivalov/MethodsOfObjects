public class Main {
    public static void main(String[] args) {

        Author chekhov = new Author("Антон", "Чехов");
        Book theCherryGarden = new Book("Вишнёвый сад", chekhov, 1904);
        System.out.println("Автор: " + theCherryGarden.getAuthor());
        System.out.println();
        Author rowling = new Author("Джоан", "Роулинг");
        Book harryPotter = new Book("Harry Potter", rowling, 1997);
        System.out.println("Автор: " + harryPotter.getAuthor());
        System.out.println();
        System.out.println(theCherryGarden.equals(harryPotter));
        System.out.println(theCherryGarden.hashCode());
        System.out.println(harryPotter.hashCode());
    }
}