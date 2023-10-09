import java.util.ArrayList;

// Истомин СА группа 4832
// Необходимо доработать структуру класса HashMap, реализованную на семинаре.
//У нас появился метод добавления элементов, каким образом я могу распечатать все элементы структуры хэш-таблицы на экране?
//
//1. Задача: Распечатайте все элементы структуры HashMap переопределив метод toString() - самый простой вариант.


public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);

        HashMap<String, String> hashMap = new HashMap<>(4);
        String addResult = hashMap.put("+7900111223300", "AAAAAAA");
        addResult = hashMap.put("+7900111223301", "BBBBBBB");
        addResult = hashMap.put("+7900111223300", "DDDDDDD");
        addResult = hashMap.put("+7900111223302", "EEEEEEE1");
        addResult = hashMap.put("+7900111223303", "EEEEEEE2");
        addResult = hashMap.put("+7900111223304", "EEEEEEE3");
        addResult = hashMap.put("+7900111223305", "EEEEEEE4");
        addResult = hashMap.put("+7900111223306", "EEEEEEE5");
        addResult = hashMap.put("+7900111223307", "EEEEEEE6");
        addResult = hashMap.put("+7900111223308", "EEEEEEE7");
        addResult = hashMap.put("+7900111223309", "EEEEEEE8");

        //String searchResult = hashMap.get("+7900111223307");

        System.out.println(hashMap.toString());

//        for (HashMap.Entity entuty : hashMap) {
//            System.out.printf("%s - %s", entuty.key, entuty.value);
//
//        }
    }

}

