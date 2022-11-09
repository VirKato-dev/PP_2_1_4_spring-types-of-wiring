package koschei.models;

/***
 * Bean egg6 определён в конфигурационном файле приложения
 * Внедрение зависимости через конструктор
 */
public class Egg6 {

    private final Needle7 needle;

//    @Autowired // требует @Component
    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle;
    }
}
