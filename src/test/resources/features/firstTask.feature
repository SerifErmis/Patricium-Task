
Feature:Patricium Task

  - Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
  - Açılan ürünün siyah olduğu doğrulanır.
  - Sepete ekle butonuna tıklanır.
  - Sepeti Görüntüle butonuna tıklanır.
  - Sepeti Onayla butonuna tıklanır.
  - Üye olmadan devam et butonuna tıklanır.
  - Mail ekranı gelir.
  - Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir.
  - Siparişi tamamla butonuna tıklayarak, ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.

  Background:
    Given user already on mainpage
  @wip
  Scenario:
    When user  hover over Giyim-Aksesuar
    And user clicks Dizaltı Çorap under Kadın İç Giyim
    And user select first product on Dizaltı Çorap
    Then user should see black color product
    When user clicks Sepete ekle button
    And user clicks Sepeti Görüntüle button
    And user clicks Sepeti Onayla button
    And user clicks Üye olmadan devam et button
    And user enter e-mail address
    And user clicks Yeni adres oluştur link
    And user enter valid address information
    And user select any shipment company
    And user select Garanti Pay payment type
    And user clicks Garanti Pay ile Öde button
    Then user should be on Garanti payment page




