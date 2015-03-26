# Arrays2Dim
============

>Knjižnica, ki omogoča delo z večrazsežnimi tabelami velikosti MxN.
>Utility class with methods to operate on arrays (sized NxM)

# Navodila
  - Da prispevate k skupni kodi:
    - naredite svoj fork (svoj podvojeni repository)
    - ga spreminjajte
    - pošljite pull request (da vaše spremembe dodamo v skupni repo)
  - Metode naj bodo splošne
  - Naj bodo 'fool proof' (naj ne vračajo napak, tudi če so podatki neustrezni)
  - Narejene naj bodo za int, char in long (vsako posebaj) 
  - Vse metode naj imajo pred sabo komentar, v katerem je:
    - Opis (kaj metoda počne)
    - `@params` , ki pove, kaj pomenijo podani parametri
    - `@return`, ki v primeru, da metoda vrača vrednost, pove, kaj vrača
    - `@since`, ki se nanaša na različico jave, za katero je metoda napisana. Naj bo vedno 7
    - `@author`, doda ponosnega pisca
    - `@version`, doda njeno različico dela kode, npr. 1.0
  - primer lahko vidite v veg3ab/ArraysKvadrat/ArraysKvadrat.java (toString metoda)

## Metode
*********
### Splošne
***********

 - `fill(int[][] a, int val)` - Napolni celotno tabelo z vrednostmi `val`
 - `fill(int[][]a, int fromIndexX, int fromIndexY, int val)` - Napolni tabelo z vrednostmi val za vse elementi, katerih indeksi so >= podanim
 - `fill(int[][]a, int fromIndexX, int fromIndexY, int toIndexX, int val)` - Napolni podtabelo tabele a z vrednostmi 'val'. Podtabela se prične v (fromIndexX,fromIndexY) konča v (toIndexX-fromIndexX,…)
 
 - `copyOf(int[][] t1, int[][] t2)` -  Vrne kopijo celotne tabele
 - `copyOfRange(int[][] t, int x, int y)` - Vrne kopijo dela tabele od (0,0) do (x,y)
 
 - `equals(int[][] t1, int[][] t2)` - Primerja celotno tabelo z drugo
 - `equals(int[][] t1, int[][] t2, int row1, int row2) - Primerja vrstici tabel podanimi s parametri `row1`, `row2`
 - `equals(int[][] t1, int[][] t2, int col1, int col2) - Primerja stolpca tabel podanimi s parametri `col1`, `col2`
 
 - `sort(int[][] t1, int row)` - Razvrsti izbrano vrstico
 - `sort(int[][] t1, int col)` - Razvrsti izbran  stolpec
 
 - `binarySearch(int[][] t1, int val, boolean row, int num)` - Išče po s parametrom podani vrstici oz. stolpcu, če je parameter `row` neresničen/false
 - `toString(int[][] t)` - Izpiše tabelo v formatu [[... elementi prvega stolpca ...] [... elementi drugega ... ] ...]
 
 
__________
