class box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
    public static void main(String[] args) {
        box<Integer> intBox = new box<>();
        intBox.set(10);
        System.out.println("Integer: " + intBox.get());
        box<String> strBox = new box<>();
        strBox.set("Hello");
        System.out.println("String: " + strBox.get());
        box<Double> dblBox = new box<>();
        dblBox.set(99.9);
        System.out.println("Double: " + dblBox.get());
    }
}
