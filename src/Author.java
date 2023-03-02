import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    @Override
    public String toString() {

        return this.firstName + " " + this.lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return Objects.equals(lastName, author.lastName);
        //Вопрос: если я хочу сравнивать не только по фамилии, но и по имени,
        // надо ещё один метод equals создавать?
        // И какие тогда поля на вход подавать?
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lastName);
    }

}
