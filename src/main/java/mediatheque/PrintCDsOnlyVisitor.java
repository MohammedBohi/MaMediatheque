package mediatheque;

public class PrintCDsOnlyVisitor implements ItemVisitor{

    @Override
    public void visit(CD cd) {
             cd.print();
    }

    @Override
    public void visit(Book book) {

    }
}
