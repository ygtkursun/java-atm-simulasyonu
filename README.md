# Ödev: Akıllı ATM ve Bankacılık Simülasyonu

> Bu bir ödev şablonudur. Ödevi **yapay zekâ kullanmadan**, kendi başınıza yapmanız beklenir.

## Repo Yapısı

```
.
├── README.md        -> Ödev tanımı (bu dosya)
├── RAPOR.md         -> Doldurmanız gereken rapor
├── src/
│   └── Main.java    -> Java çözümünüzü buraya yazın
└── docs/
    └── akis-semasi.png  -> Çizdiğiniz akış şemasını buraya koyun
```

## Nasıl Çalıştırılır?

```bash
javac src/Main.java
java -cp src Main
```

## Problem

Bir bankanın ATM sistemini simüle eden bir program geliştirin. Program sürekli çalışan bir menüye sahip olmalı ve kullanıcı çıkış yapana kadar işlem almaya devam etmelidir.

## Sistem Gereksinimleri

- Başlangıç bakiyesi **10.000 TL** olmalıdır.
- Kullanıcıya şu menü sunulmalıdır:
  1. Bakiye görüntüleme
  2. Para yatırma
  3. Para çekme
  4. Çıkış
- Seçime göre ilgili işlem yapılmalıdır.
- Para yatırmada negatif veya sıfır değer kabul edilmemelidir.
- Para çekmede bakiye kontrolü yapılmalıdır. Bakiye yetersizse işlem yapılmamalıdır.
- Geçersiz menü seçiminde hata mesajı gösterilmelidir.
- Her işlemden sonra ana menü tekrar gösterilmelidir.
- Çıkış seçilince program sonlanmalıdır.

## Ek Gereksinimler

- Kullanıcı toplam kaç işlem yaptığını görebilmelidir.
- Başarılı para yatırma ve çekme işlemlerinin toplam tutarı hesaplanmalıdır.
- Program kapanmadan önce son bakiye ve işlem sayısı gösterilmelidir.

## Kısıt

Döngüler ve karar yapıları kullanılmalıdır. Dizi kullanımı zorunlu değildir.

## Sizden İstenenler (Teslim)

1. Java kaynak kodu. (`src/Main.java`)
2. Algoritma açıklaması. (`RAPOR.md`)
3. Akış şeması. (`docs/akis-semasi.png`)
4. En az **8 farklı** test senaryosu. (`RAPOR.md`)

Bu repoyu kendi hesabınıza kopyalayın, çalışmanızı commit'leyip sistemin belirttiği şekilde teslim edin.
