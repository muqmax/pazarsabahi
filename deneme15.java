public class deneme15 {
    public static void skorhesapla(String name,int score){
        System.out.println(name+"    isimli oyuncunun puanı   "+score);

    }
    public static void skorhesapla(int score)
    {
        System.out.println("    isimsiz oyuncunun skoru   "+score);

    }
    public static void skorhesapla(String name)
    {
        System.out.println(name+"     isimli oyuncunun puanı 0   ");
    }
    public static void main(String[] args){
        skorhesapla("ahmet",22);
        skorhesapla(44);
        skorhesapla("mustafa");

    }
}
