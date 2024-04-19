package CoreServlets;

public class Catalog {
    private static CatalogItem[] items = {
        new CatalogItem("sabahattin001",
            "<I>İçimizdeki Şeytan</I> - Sabahattin Ali",
            "Bir öğretmenin kendi iç hesaplaşmaları ve çevresindeki insanların portresini çizdiği etkileyici bir roman.",
            25.0),
        new CatalogItem("pelevin001",
            "<I>Omon Ra</I> - Victor Pelevin",
            "Bir Sovyet pilotunun trajikomik macerasını anlatan sıra dışı bir distopya romanı.",
            35.0),
        new CatalogItem("pamuk001",
            "<I>Kara Kitap</I> - Orhan Pamuk",
            "İstanbul'un sokaklarında kaybolan bir adamın hikayesini anlatan, gizemli ve edebi bir roman.",
            30.0),
        new CatalogItem("tanpinar001",
            "<I>Huzur</I> - Ahmet Hamdi Tanpınar",
            "İstanbul'da yaşayan bir grup insanın duygusal ve entelektüel serüvenlerini anlatan modern Türk edebiyatının 			klasiklerinden biridir.",
            28.0),
        new CatalogItem("baris001",
            "<I>Savaş ve Barış</I> - Lev Tolstoy",
            "Tolstoy'un unutulmaz eseri, Napolyon'un Rusya seferini ve bu olayın Rus aristokrasisi üzerindeki etkilerini 			anlatır.",
            45.0),
        new CatalogItem("erdogan001",
            "<I>Diriliş</I> - Necip Fazıl Kısakürek",
            "Bir genç adamın hayat mücadelesini ve manevi dönüşümünü anlatan etkileyici bir eser.",
            20.0),
        new CatalogItem("yasinci001",
            "<I>Çalıkuşu</I> - Reşat Nuri Güntekin",
            "Feride'nin iç dünyasına ve yaşadığı döneme ışık tutan, Türk edebiyatının unutulmaz eserlerinden biri.",
            22.0),
        new CatalogItem("atay001",
            "<I>Tutunamayanlar</I> - Oğuz Atay",
            "Onat Kutlar'ın yarattığı kahraman Selim Işık'ın monologları aracılığıyla toplumsal eleştirilerde bulunan, modern 			Türk edebiyatının önemli bir eseridir.",
            28.0),
        new CatalogItem("cemal001",
            "<I>Kuyucaklı Yusuf</I> - Sabahattin Ali",
            "Sıradan bir köy çocuğunun büyüme ve aşk hikayesini anlatan, Sabahattin Ali'nin etkileyici eserlerinden biridir.",
            18.0),
        new CatalogItem("gul002",
            "<I>Serenad</I> - Zülfü Livaneli",
            "Bir piyanistin aşk, mücadele ve müzik dolu öyküsünü anlatan, duygusal yönü güçlü bir romandır.",
            32.0),
        new CatalogItem("bilge001",
            "<I>Sinekli Bakkal</I> - Halide Edib Adıvar",
            "Osmanlı dönemindeki toplumsal değişimleri ve dönemin kadınlarının yaşadıklarını anlatan önemli bir eser.",
            24.0),
        new CatalogItem("elifsafak001",
            "<I>Aşk</I> - Elif Şafak",
            "Rumi ve Şems'in arasındaki mistik aşkı konu alan etkileyici bir roman.",
            27.0),
        new CatalogItem("karatay001",
            "<I>Diyet Üzerine</I> - Canan Karatay",
            "Sağlıklı yaşam ve beslenme üzerine değerli bilgiler sunan, popüler bir sağlık kitabı.",
            15.0),
        new CatalogItem("yasar001",
            "<I>Akşam Güneşi</I> - Yaşar Kemal",
            "İki genç arasındaki tutkulu aşkı ve yaşadıkları dramatik olayları anlatan bir Türk edebiyat klasiği.",
            23.0)
    };

    	public static CatalogItem getItem(String itemID) {
    		CatalogItem item;
    		if (itemID == null) {
    			return null;
    		}
    		for (int i = 0; i < items.length; i++) {
    			item = items[i];
    			if (itemID.equals(item.getItemID())) {
            	return item;
    			}
    		}
    		return null;
    }
}
