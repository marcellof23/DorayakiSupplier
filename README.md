# Dorayaki Supplier (SOAP)

Web service untuk menjebatani web service dorayaki store dan dorayaki pabrik dengan protokol SOAP :D

## Skema Basis Data yang Digunakan

Secara sederhana kelompok kami membuat 2 buah service pada web service ini, dimana satu service akan berkaitan dengan database untuk mencatat log request yang keluar masuk dari store maupun pabrik. Service yang terdaftar akan dijelaskan sebagai berikut beserta skema yang digunakan pada setiap service dan juga skema basis data yang digunakan.

### SERVICE #1 : Log Service
Service ini berfungsi untuk mencatat setiap request yang masuk ke web service ini ke dalam database MySQL, service ini juga nantinya bermanfaat untuk melakukan rate limiting. Service ini memiliki beberapa interface yang didaftarkan dalam LogRequestService.xsd sebagai berikut:

- statusCode :
    - code : long

- LogType:
    - ip : string
    - endpoint : string
    - timestamp : string

- LogTypes:
    - sequence of LogType

- log_request_idAsLong:
    - log_request_id : long

Implementasi dari service ini secara detail dapat dilihat sebagai berikut.

#### - addLog(LogType logType) : StatusCode
Service ini berfungsi untuk menambahkan log terhadap sebuah request yang diterima oleh web service ke dalam database MySQL yang kemudian akan dimanfaatkan sebagai bagian dari rate limiting.

#### - getAllLog() : List<LogType>
Service ini berfungsi untuk mengambil seluruh log yang telah terdaftar pada database

#### - countLog(String ip, Date start, Date end)
Service ini berfungsi untuk mengitung jumlah log yang terdaftar antara dua tanggal yang didapatkan dari parameter.

### SERVICE #2 : Dorayaki Request Service
Service ini berfungsi untuk menghandle setidaknya 3 hal utama : mengambil semua resep dorayaki yang terdaftar pada pabrik, mengirimkan request penambahan stok dorayaki dari store ke pabrik dan mengamil seluruh request yang terdaftar. Service ini memiliki beberapa interface yang didaftarkan dalam DorayakiRequestService.xsd sebagai berikut:

- statusCode :
    - code : long

- DorayakiType:
    - dorayakirequest_id: long
    - recipe_id: long
    - qty: long

- DorayakiTypes:
    - sequence of DorayakiType

- DorayakiReqType:
    - dorayakirequest_id: long
    - recipe_id: long
    - qty: long
    - username : string

- DorayakiReqTypes:
    - sequence of DorayakiReqTypes

- RecipeType:
    - recipe_id: long
    - name: string

- RecipeTypes:
    - sequence of RecipeType

- dorayakirequest_idAsLong:
    - dorayakirequest_id: long

- recipe_idAsLong:
    - recipe_id: long

Implementasi dari service ini secara detail dapat dilihat sebagai berikut.

#### - getDorayakiRequest() : StatusCode
Service ini berfungsi untuk menampilkan seluruh request yang telah masuk ke web service

#### - getDorayakiRecipes() : List<LogType>
Service ini berfungsi untuk menampilkan seluruh recipe yang terdaftar pada pabrik

#### - updateDorayaki(DorayakiReqType params)
Service ini berfungsi untuk menghandle permintaan request penambahan stok dari toko kepada pabrik

## Pembagian Tugas

- Setup SOAP : 13519086
- JDBC : 13519086
- LogService : 13519086
- LogServiceImpl : 13519086
- DorayakiService : 13519121
- DorayakiServiceImpl : 13519121, 13519134
- Rate Limiting : 13519134