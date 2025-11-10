class pair<T, U> {
    private T first;
    private U second;
    public pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
    public static void main(String[] args) {
        pair<String, Integer> student = new pair<>("Amol", 20);
        System.out.println("Name: " + student.getFirst() + ", Age: " + student.getSecond());
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(U second) {
        this.second = second;
    }
}
