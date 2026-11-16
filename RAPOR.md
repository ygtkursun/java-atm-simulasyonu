# Rapor

**Ad Soyad:** Yiğit Kurşun
**Numara:** 95

## 1. Algoritma Açıklaması

Program ilk olarak başlangıç bakiyesini 10.000 TL olarak belirler. Daha sonra kullanıcıya dört seçenek sunar: bakiye görüntüleme, para yatırma, para çekme ve çıkış. Kullanıcı bir seçim yaptığında program ilgili işlemi gerçekleştirir.

1. Bakiye görüntüleme seçilirse mevcut bakiye ekrana yazdırılır.
2. Para yatırma seçilirse kullanıcıdan yatırmak istediği tutar istenir. Girilen tutar pozitifse bakiyeye eklenir.
3. Para çekme seçilirse kullanıcıdan çekmek istediği tutar istenir. Tutar pozitif ve mevcut bakiyeden küçük veya eşitse para çekme işlemi gerçekleştirilir.
4. Çıkış seçilirse son bakiye, toplam işlem sayısı, toplam yatırılan ve çekilen tutarlar ekrana yazdırılır ve program sonlandırılır.

Hatalı tutar girildiğinde veya geçersiz seçim yapıldığında kullanıcıya uyarı mesajı gösterilir. Kullanıcı çıkış yapana kadar menü tekrar gösterilmeye devam eder.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
- Kullanıcının menüden seçtiği işlem numarası (1-4).
- Para yatırmak için girilen tutar.
- Para çekmek için girilen tutar.

**İşlemler:**
- Başlangıç bakiyesi 10.000 TL olarak belirlenir.
- Kullanıcının seçimine göre işlem yapılır.
- Para yatırma işleminde tutarın pozitif olup olmadığı kontrol edilir.
- Para çekme işleminde tutarın pozitif ve mevcut bakiyeden fazla olup olmadığı kontrol edilir.
- Başarılı para yatırma işleminde bakiye ve toplam yatırılan tutar güncellenir.
- Başarılı para çekme işleminde bakiye ve toplam çekilen tutar güncellenir.
- Başarılı işlemlerde işlem sayısı bir artırılır.
- Kullanıcı çıkış yaptığında toplam bilgiler ekrana yazdırılır.

**Çıktılar:**
- Güncel bakiye bilgisi.
- Para yatırma işleminin başarılı veya hatalı olduğuna dair mesaj.
- Para çekme işleminin başarılı veya hatalı olduğuna dair mesaj.
- Yetersiz bakiye uyarısı.
- Geçersiz menü seçimi uyarısı.
- Son bakiye.
- Toplam işlem sayısı.
- Toplam yatırılan ve çekilen tutarlar.

## 3. Sözde Kod (Pseudocode)

1. Programı başlat.
2. Başlangıç bakiyesini 10.000 TL olarak belirle.
3. Toplam yatırılan parayı 0 yap.
4. Toplam çekilen parayı 0 yap.
5. İşlem sayısını 0 yap.
6. Menü seçeneklerini ekrana yazdır.
7. Kullanıcıdan bir seçim al.
8. Seçim 1 ise mevcut bakiyeyi ekrana yazdır ve işlem sayısını artır.
9. Seçim 2 ise kullanıcıdan yatırılacak tutarı al.
10. Tutar pozitifse bakiyeye ekle, toplam yatırılan tutarı güncelle ve işlem sayısını artır.
11. Tutar pozitif değilse hata mesajı göster.
12. Seçim 3 ise kullanıcıdan çekilecek tutarı al.
13. Tutar 0 veya daha küçükse hata mesajı göster.
14. Tutar bakiyeden büyükse yetersiz bakiye mesajı göster.
15. Tutar pozitif ve bakiyeden küçük veya eşitse bakiyeden çıkar, toplam çekilen tutarı güncelle ve işlem sayısını artır.
16. Seçim 4 ise son bakiye, toplam işlem sayısı, toplam yatırılan ve çekilen tutarları göster.
17. Programı sonlandır.
18. Geçersiz bir seçim yapılırsa uyarı mesajı göster.
19. Çıkış yapılmadıysa menüyü tekrar göster.

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Yapılan işlem / girdi | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 | 1 - Bakiye görüntüleme | 10000 TL bakiye gösterilir. | 10000 TL bakiye gösterilir. | Evet |
| 2 | 2 - 500 TL yatırma | Bakiye 10500 TL olur. | Para yatırma başarılı, bakiye 10500 TL olur. | Evet |
| 3 | 2 - 0 TL yatırma | Hata mesajı gösterilir, bakiye değişmez. | Hatalı tutar mesajı gösterilir. | Evet |
| 4 | 2 - -200 TL yatırma | Hata mesajı gösterilir, bakiye değişmez. | Hatalı tutar mesajı gösterilir. | Evet |
| 5 | 3 - 1000 TL çekme | Bakiye 9000 TL olur. | Para çekme başarılı, bakiye 9000 TL olur. | Evet |
| 6 | 3 - 15000 TL çekme | Yetersiz bakiye mesajı gösterilir, bakiye değişmez. | Yetersiz bakiye mesajı gösterilir. | Evet |
| 7 | 3 - 0 TL çekme | Hata mesajı gösterilir, bakiye değişmez. | Hatalı tutar mesajı gösterilir. | Evet |
| 8 | 5 - Geçersiz menü seçimi | Geçersiz seçim mesajı gösterilir ve menü tekrar açılır. | Geçersiz seçim mesajı gösterilir. | Evet |
| 9 | 4 - Çıkış | Son bakiye ve işlem bilgileri gösterilir, program kapanır. | Son bakiye ve işlem bilgileri gösterilir, program kapanır. | Evet |
