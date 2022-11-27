package fi.metropolia.android6;

public class President {
    public String name;
    public int termStart;
    public int termEnd;
    public String desc;

    public President(String name, int termStart, int termEnd, String desc) {
        this.name = name;
        this.termStart = termStart;
        this.termEnd = termEnd;
        this.desc = desc;
    }
    public String toString() {
        return name;
    }
}
