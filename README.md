Diplomski rad - Massa Bassa
Ovaj rad predstavlja Massa Bassa, Android aplikaciju namijenjenu planiranju i optimizaciji audio sustava u automobilskim, kućnim i profesionalnim okruženjima. 

1. Upute za Build (Android Studio)
Ove upute pretpostavljaju da imate instaliran Android Studio i da je projekt otvoren i da je skinut sa ovoga repozitorija.

1.1. Otvaranje projekta
Pokrenite Android Studio.

Odaberite File -> Open... (Datoteka -> Otvori...) i navigirajte do direktorija gdje se nalazi ovaj projekat.

Pričekajte da Android Studio završi sinkronizaciju projekta i preuzimanje Gradle ovisnosti. Status se prikazuje u donjem desnom kutu.

1.2. Pokretanje Build-a
Odabir Build Varijante: U prozoru Build Variants (Varijante izgradnje, obično lijevo) provjerite je li odabrana ispravna varijanta (npr. debug).

Generiranje APK/AAB:

Idite na Build -> Build Bundles/APKs -> Build APKs (za generiranje .apk datoteke) ili

Build -> Build Bundles/APKs -> Build Bundle(s) (za generiranje .aab datoteke).

Lokacija izlaza: Nakon uspješnog build-a, Android Studio će prikazati obavijest s linkom "locate" (pronađi). Kliknite na njega da pronađete generiranu datoteku (obično u app/build/outputs/apk/debug/ ili sličnom direktoriju).

1.3. Pokretanje aplikacije
Odabir uređaja/emulatora: U padajućem izborniku na glavnoj alatnoj traci, odaberite željeni Android Virtual Device (AVD) ili fizički uređaj.

Pokreni: Kliknite na zelenu ikonu Run 'app' (Pokreni 'app', trokut) na glavnoj alatnoj traci. Android Studio će automatski izvršiti build i instalirati aplikaciju na odabrani uređaj/emulator.
