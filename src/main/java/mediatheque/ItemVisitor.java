package mediatheque;

public interface ItemVisitor {
    public void visit (Book book);
    public void visit (CD cd);

}
