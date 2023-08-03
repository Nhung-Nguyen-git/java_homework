import java.time.LocalDate;

public class Patient extends Person{
    public Patient(String name, int age) {
        super(name, age);
    }



    private String note;
    private LocalDate createDate;



    public Patient(String name, int age, String note, LocalDate createDate) {
        super(name, age);
        this.note = note;
        this.createDate = createDate;
    }


    public String getNote() {
        return note;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }


    @Override
    public String toString() {
        return "Patient{" +"name" + getName() + "- e" + getAge()+
                "note='" + note + '\'' +
                ", createDate=" + createDate +
                "} " ;
    }
}
