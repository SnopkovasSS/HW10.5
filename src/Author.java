import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((!(obj instanceof Author))) {
            return false;
        }
        Author author = (Author) obj;
        return this.lastName.equals(author.lastName) && this.firstName.equals(author.firstName);


    }



    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }


    }





















