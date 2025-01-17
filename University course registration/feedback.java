public class feedback<T>{
    private T content;
    feedback(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String toString(){
        return "Feeback:\n "+ this.content;
    }
}