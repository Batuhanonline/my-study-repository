# Macera Oyunu

Java'da nesne yönelimli programlamayı kavramak amacıyla 
yazacağımız bu metin tabanlı oyundur.

## Karakterler

| Karakter | ID  | Hasar | Sağlık | Para |
|----------|-----|-------|--------|------|
| Samuray  | 1   | 5     | 21     | 15   |
| Okçu     | 2   | 7     | 18     | 20   |
| Şovalye  | 3   | 8     | 24     | 5    |

## Canavarlar

| Canavar | ID  | Hasar | Sağlık | Para |
|---------|-----|-------|--------|------|
| Zombi   | 1   | 3     | 10     | 4    |
| Vampir  | 2   | 4     | 14     | 7    |
| Ayı     | 3   | 7     | 20     | 12   |

## Silahlar

| Silah   | ID  | Hasar | Para |
|---------|-----|-------|------|
| Tabanca | 1   | 2     | 25   |
| Kılıç   | 2   | 3     | 35   |
| Tüfek   | 3   | 7     | 45   |

## Zırhlar

| Zırh  | ID  | Hasar Engelleme | Para |
|-------|-----|-----------------|------|
| Hafif | 1   | 1               | 15   |
| Orta  | 2   | 3               | 25   |
| Ağır  | 3   | 5               | 40   |

## Mekanlar 

### Güvenli Ev
- Özellik : Can Yenileniyor

### Mağara

- Canavar : Zombi (1-3 Adet)
- Özellik : Savaş + Ganimet
- Eşya : Yemek (Food)

### Orman

- Canavar : Vampir (1-3 Adet)
- Özellik : Savaş + Ganimet
- Eşya : Odun (Firewood)

### Nehir

- Canavar : Ayı (1-3 Adet)
- Özellik : Savaş + Ganimet
- Eşya : Su (Water)

### Mağaza

- Özellik : Destekleyici Eşyalar Satın Almak
- Silah : Tabanca,Kılıç,Tüfek
- Zırh : Hafif,Orta,Ağır