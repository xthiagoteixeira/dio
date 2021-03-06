package one.dio2;

public class No<T> {

 /* private Object object;
    private No refNo; */

    private T object;
    private No<T> refNo;

    public No() {
    }

//  public No(Object object){
    public No(T object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    //  public void setObject(Object object) {
    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
