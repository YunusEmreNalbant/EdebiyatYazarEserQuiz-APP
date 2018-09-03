package com.yunusunnotlari.edebiyatyazar_eser;

import java.util.ArrayList;
import java.util.Random;

public class Sorular {

    String [] sorular ={"Sahra, Makber ve Validem adlı eserler hangi yazara aittir?","İlk realist romanımız?","Hayrabat, Hayriyye adlı eserler hangi yazara aittir?","Şecere-i Türk, Lehçe-i Osmani adlı eserler hangi yazara aittir?","Kutadgu Bilig kime aittir?","Kabusname kime aittir?","Üvercinka,Göçebe ve Güz Bitiği adlı eserler kime aittir?","Siyah Kehribar,Osmancık eserleri kime aittir?","Mesnevi tarzında yazılmış ilk eser hangisidir?","İlk kadın romancımız kimdir?","İlk edebi bildiriyi yayımlayan topluluk hangisidir?"," İlk fıkra yazarı kimdir?","İlk edebî roman hangisidir?","Batılı tekniğe uygun ilk roman hangisidir?","Ateşpare adlı romanımızın yazarı?","Yeniçeriler adlı eserin yazarı kimdir?","Göl Saatleri adlı eserin yazarı kimdir?","Zavallı Çocuk adlı eserin yazarı kimdir?","Demdeme kimin eseridir?","Sergüzeşt kime aittir?","Piyale adlı eser kime aittir?","Mizanül Hak adlı eserin yazarı kimdir?","Çoban Çeşmesi eseri kimindir?","Henüz On Yedi Yaşında adlı eser kime aittir?","Kiralık Konak ve Ankara romanlarının yazarı kimdir?","Kavak Yelleri ve Çalıkuşu adı eserler kime aittir?","Ahşap Konak adlı eser kime aittir?","Günün Adamı ve Lütfen Dokunmayın adlı tiyatro eserleri kime aittir?","Zeytindağı adlı eser kime aittir?","Destan Atatürk ve Dönülmez Zaman şiirleri hangi şaire aittir?","Üç İstanbul adlı eser kime aittir?","Karartma Geceleri adlı eser kime aittir?","Kuyucaklı Yusuf eseri kime aittir?","Suyu Arayan Adam eseri kime aittir?","Boğaziçi Şıngır Mıngır adlı eser kime aittir?","Sebil ve Güvercinler adlı eser kime aittir?","Ömrümde Sükut adlı eser kime aittir?","Aganta Burina Burinata adlı eser kime aittir?","Aşağıdakilerden Hangisi Tevfik Fikret'in eserlerinde biridir?","Halit Ziya Uşaklıgil'in hangi eseri tür yönünden diğerlerinden farklıdır?","Aşağıdakilerden hangisi Tevfik Fikret'in eserlerinden biri değildir?","Hangi şair hece ölçüsünü hiç kullanmamıştır?","Kasidelerde şairin kendini övdüğü bölüme ne ad verilir?","Rübai nazım biçiminin en büyük temsilcisi kimdir?","Tanzimat Döneminde Hürriyet gazetesini hangi iki sanatçımız çıkartmıştır?","Suphi ve Hüsnücemal hangi romanın kahramanlarıdır?","Tercümanı Hakikat gazetesini kim çıkartmıştır?","Edebiyatımızın ilk Mizah Sözlüğü olan Lehçet'ül Hakayık kime aittir?","Moliere'den uyarlama bir oyun olan Ayyar Hamza kime aittir?","İlk Türk tiyatrosu olan Osmanlı Tiyatrosu kim tarafından kurulmuştur?","İlk resimli gazetemizin adı nedir?"};
    String [] cevaplar ={"Abdülhak Hamit Tarhan-Ömer Seyfettin-Ahmet Mithat Efendi-Ahmet Hamdi Tanpınar","Araba Sevdası-Sergüzeşt-Vatan Yahut Silistre-Zehra","Nabi-Fuzuli-Şeyh Galip-Ali Şir Nevai","Ahmet Vefik Paşa-Ziya Paşa-Namık Kemal-İbrahim Şinasi","Yusuf Has Hacip-Kaşgarlı Mahmut-Şeyhi-Şeyh Galip","Mercimek Ahmet-Aşık Paşa-Yunus Emre-Hacı Bektaş Veli","Cemal Süreya-Ece Ayhan-Edip Cansever-Turgut Uyar","Tarık Buğra-Cahit Külebi-Rıfat Ilgaz-Yaşar Kemal","Kutadgu Bilig-Harabat-Babürname-Teodor Kasap","Fatma Aliye Hahım-Ece Ayhan-Halide Edip Adıvar-Tomris Uyar","Fecri Ati-Yedi Meşaleciler-Hisarcılar-Garipçiler","Ahmet Rasim-Ahmet Yesevi-Nedim-Nabizade Nazım","İntibah-Karabibik-Eylül-Araba Sevdası","Aşkı Memnu-Yaprak Dökümü-Eşber-İki Şehrin Hikayesi","Muallim Naci-Şemsettin Sami-Ziya Paşa-Abdülhak Hamit Tarhan","Ahmet Mithat Efendi-Tevfik Fikret-Namık Kemal- R. Mahmut Ekrem","Ahmet Haşim-Tevfik Fikret-Halid Ziya Uşaklıgil-Katip Çelebi","Namık Kemal-Ziya Paşa-Cenap Şahabettin-Hüseyin Rahmi Gürpınar","Muallim Naci-Ziya Paşa-Namık Kemal-Recaizade M. Ekrem","Samipaşazade Sezai-Abülhak Hamit Tarhan-Ahmet Vefik Paşa-Tevfik Fikret","Ahmet Haşim-Namık Kemal-Ahmet Rasim-Tevfik Fikret","Katip Çelebi-Sinan Paşa-Ali Şir Nevai-Mercimek Ahmet","Faruk Nafiz Çamlıbel-Halide Edip Adıvar-Orhan Seyfi Orhan-Yakup Kadri Karaosmanoğlu","Ahmet Mithat Efendi-Ziya Paşa-Ahmet Rasim-Ece Ayhan","Yakup Kadri Karaosmanoğlu-Tarık Buğra-Yaşar Kemal-Sabahattin Ali","Reşat Nuri Güntekin-Sait Faik Abasıyanık-Refik Halit Karay-Halit Ziya Uşaklıgil","Necip Fazıl Kısakürek-Orhan Veli Kanık-Nurullah Ataç-Necati Cumalı","Haldun Taner-Mehmet Rauf-Namık Kemal-Necati Cumalı","Fatih Rıfkı Atay-Fuzuli-Faruk Nafiz Çamlıbel-Fazıl Hüsnü Dağlarca","Coşkun Ertepınar-Atilla İlhan-Ece Ayhan-Edip Cansever","Mithat Cemal Kuntay-Güngör Dilmen-Recep Bilginer-Abbas Sayar","Rıfat Ilgaz-Aziz Nesin-Kemal Bilbaşar-Oktay Rıfat","Sabahattin Ali-Yaşar Kemal-Orhan Pamuk-Namık Kemal","Şevket Süreyya Aydemir-Fuat Köprülü-Berna Moran-Ece Ayhan","Salah Birsel-Yusuf Atılgan-Can Yücel-Sabahattin Ali","Ziya Osman Saba-İsmet Özel-Cevdet Kudret-Yusuf Ziya Ortaç","Cahit Sıtkı Tarancı-Edip Cansever-Ahmet Kutsi Tecer-Ece Ayhan","Halikarnas Balıkçısı-Falih Rıfkı Atay-Oğuz Atay-Yaşar Kemal","Rubabı Şikeste-Saray ve Ötesi-Hac Yolunda-Kırık Hayatlar","Kırk Yıl-Aşkı Memnu-Mai ve Siyah-Nemide","Nesri Sulh-Rübabı Şikeste-Haluk'un Defteri-Tarihi Kadim","Ahmet Haşim-Ziya Paşa-Yahya Kemal Beyatlı-Tevfik Fikret","Fahriye-Taç Beyit-Methiye-Naat","Ömer Hayyam-Nabi-Nedim-Fuzuli","Namık Kemal,Ziya Paşa-Şinasi,Namık Kemal-Direktör Ali Bey,A. Tarhan-Recaizade M. Ekrem,Şinasi","Zehra-Karabibik-Sergüzeşt-Küçük Paşa","Ahmet Mithat Efendi-Şinasi-Ziya Paşa-Namık Kemal","Direktör Ali Bey-Muallim Naci-Ali Suavi-Neyzen Tevfik","Direktör Ali Bey-Şinasi-Samipaşazade Sezai-Ali Suavi","Güllü Agop-Diyojen-Namık Kemal-Ali Bey","Ayinei Vatan-Muhbir-Tasviri Efkar-Devir"};


    ArrayList<String> sorularArray = new ArrayList<>();
    ArrayList<String> cevaplarArray = new ArrayList<>();

    public Sorular(){
        for (String i : sorular)
            sorularArray.add(i);
        for (String i : cevaplar)
            cevaplarArray.add(i);
    }

    public String SoruGetir(){
        String sorucevap;
        Random random = new Random();
        int indis = random.nextInt(sorularArray.size());
        sorucevap = sorularArray.get(indis) + "#" + cevaplarArray.get(indis);
        sorularArray.remove(indis);
        cevaplarArray.remove(indis);
        return sorucevap;
    }
}
