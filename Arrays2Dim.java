/**
 * class Arrays2Dim 
 * 
 * Razred z orodji, ki deluje za nekvadratne dvorazsežne tabele velikosti MxN
 * 
 * @author G 3. A/B
 * @version 1
 * @since 7
 */
public class Arrays2Dim{


	/**
	*	Privatni konstruktor, ki preprečuje izdelavo objektov
	*
	*	@version 1
	*	@since 7
	*
	*/
    private Arrays2Dim(){
	
	}
	

	/*__  .__   __. .___________.
	 |  | |  \ |  | |           |
	 |  | |   \|  | `---|  |----`
	 |  | |  . `  |     |  |
	 |  | |  |\   |     |  |
	 |__| |__| \__|     |__|
	 */
	
	/**Napolni celotno tabelo z vrednostmi val
	*
	*	@version 1
	*	@param a tabela
	*   @param val s čim naj napolni
	*	@since 7
	*
	*/
	public static void fill(int[][] a, int val){
	
	
	}
	
	/**Napolni tabelo od (fromIndexX,fromIndexY) do konca
	 *
	 * @version 1
	 * @param a tabela
	 * @param fromIndexX x koordinata od kod
	 * @param fromIndexY y koordinata od kod
	 * @param val s čim naj napolni
	 * @since 7
	 *
	*/
	public static void fill(int[][]a, int fromIndexX, int fromIndexY, int val){
	
	
	}

	/**Napolni tabelo od (fromIndexX,fromIndexY) do (toIndexX,toIndexY)
	 *
	 * @version 1
	 * @param a tabela
	 * @param fromIndexX x koordinata od kod
	 * @param fromIndexY y koordinata od kod
	 * @param val s čim naj napolni
	 * @since 7
	 */
	public static void fill(int[][]a, int fromIndexX, int fromIndexY, int toIndexX, int toIndexY,  int val){
	
	}

	/** Kopira tabelo
	 *
	 * @version 1
	 * @param t1 tabela
	 * @return vrne kopijo tabele
	 * @since 7
	 */
	public static int[][] copyOf(int[][] t1){
	
	
	}

	/**Kopira del tabele od (0,0) do (x,y)
	 *
	 * @version 1
	 * @param t tabela
	 * @param x koordinata x
	 * @param y koordinata y
	 * @since 7
	 */
	public static int[][] copyOfRange(int[][] t, int x, int y){
	
	
	}

	/**Primerja dve tabeli, če se popolnoma ujemata
	 *
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @return Vrne resnično, če se tabeli popolnoma ujemata
	 */
	public static boolean equals(int[][] t1, int[][] t2){
	
	}

	/**
	 * Primerja vrstici dveh tabel
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @param row1 vrstica prve tabele
	 * @param row2 vrstica druge tabele
	 * @return vrne resnično, če se vrstici popolnoma ujemata
	 */
	public static boolean equals(int[][] t1, int[][] t2, int row1, int row2){
	
	}

	/**
	 * Primerja stolpce dveh tabel
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @param col1 prvi stolpec
	 * @param col2 drugi stolpec
	 * @return vrne resnično. če se stolpca popolnoma ujemata
	 */
	public static boolean equals(int[][] t1, int[][] t2, int col1, int col2){
	
	}

	/**
	 * Razvrsti vrstico tabele naraščajoče
	 * @param t1 tabela
	 * @param row vrstica
	 */
	public static void sort(int[][] t1, int row){
	
	}

	/**
	 * Razvrsti stolpec tabele naraščajoče
	 * @param t1 tabela
	 * @param col stolpec
	 */
	public static void sort(int[][] t1, int col){
	
	}

	/**
	 * Poišče indeks elementa v urejeni tabeli
	 * @param t1 tabela
	 * @param val iskana vrednost
	 * @param row če je resnično, išče po vrsticah in po stolpcih v nasprotnem primeru
	 * @param num številka vrstice/stolpca
	 * @return indeks podanega elementa, če obstaja, -1 v nasprotnem primeru
	 */
	public static int binarySearch(int[][] t1, int val, boolean row, int num){
	
	}

	/**
	 * Vrne niz z vrednostmi tabele v obliki [[... elementi prvega stolpca ...] [...] ...]
	 * @param t tabela
	 * @return niz
	 */
	public static String toString(int[][] t){
	
	}

	/* __        ______   .__   __.   _______
	  |  |      /  __  \  |  \ |  |  /  _____|
	  |  |     |  |  |  | |   \|  | |  |  __
	  |  |     |  |  |  | |  . `  | |  | |_ |
	  |  `----.|  `--'  | |  |\   | |  |__| |
	  |_______| \______/  |__| \__|  \______|
	 */

	/**Napolni celotno tabelo z vrednostmi val
	 *
	 *	@version 1
	 *	@param a tabela
	 *   @param val s čim naj napolni
	 *	@since 7
	 *
	 */
	public static void fill(long[][] a, long val){


	}

	/**Napolni tabelo od (fromIndexX,fromIndexY) do konca
	 *
	 * @version 1
	 * @param a tabela
	 * @param fromIndexX x koordinata od kod
	 * @param fromIndexY y koordinata od kod
	 * @param val s čim naj napolni
	 * @since 7
	 *
	 */
	public static void fill(long[][]a, int fromIndexX, int fromIndexY, long val){


	}

	/**Napolni tabelo od (fromIndexX,fromIndexY) do (toIndexX,toIndexY)
	 *
	 * @version 1
	 * @param a tabela
	 * @param fromIndexX x koordinata od kod
	 * @param fromIndexY y koordinata od kod
	 * @param val s čim naj napolni
	 * @since 7
	 */
	public static void fill(long[][]a, int fromIndexX, int fromIndexY, int toIndexX, int toIndexY,  long val){

	}

	/** Kopira tabelo
	 *
	 * @version 1
	 * @param t1 tabela
	 * @return vrne kopijo tabele
	 * @since 7
	 */
	public static long[][] copyOf(long[][] t1){


	}

	/**Kopira del tabele od (0,0) do (x,y)
	 *
	 * @version 1
	 * @param t tabela
	 * @param x koordinata x
	 * @param y koordinata y
	 * @since 7
	 */
	public static long[][] copyOfRange(long[][] t, int x, int y){


	}

	/**Primerja dve tabeli, če se popolnoma ujemata
	 *
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @return Vrne resnično, če se tabeli popolnoma ujemata
	 */
	public static boolean equals(long[][] t1, long[][] t2){

	}

	/**
	 * Primerja vrstici dveh tabel
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @param row1 vrstica prve tabele
	 * @param row2 vrstica druge tabele
	 * @return vrne resnično, če se vrstici popolnoma ujemata
	 */
	public static boolean equals(long[][] t1, long[][] t2, int row1, int row2){

	}

	/**
	 * Primerja stolpce dveh tabel
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @param col1 prvi stolpec
	 * @param col2 drugi stolpec
	 * @return vrne resnično. če se stolpca popolnoma ujemata
	 */
	public static boolean equals(long[][] t1, long[][] t2, int col1, int col2){

	}

	/**
	 * Razvrsti vrstico tabele naraščajoče
	 * @param t1 tabela
	 * @param row vrstica
	 */
	public static void sort(long[][] t1, int row){

	}

	/**
	 * Razvrsti stolpec tabele naraščajoče
	 * @param t1 tabela
	 * @param col stolpec
	 */
	public static void sort(long[][] t1, int col){

	}

	/**
	 * Poišče indeks elementa v urejeni tabeli
	 * @param t1 tabela
	 * @param val iskana vrednost
	 * @param row če je resnično, išče po vrsticah in po stolpcih v nasprotnem primeru
	 * @param num številka vrstice/stolpca
	 * @return indeks podanega elementa, če obstaja, -1 v nasprotnem primeru
	 */
	public static int binarySearch(long[][] t1, long val, boolean row, int num){

	}

	/**
	 * Vrne niz z vrednostmi tabele v obliki [[... elementi prvega stolpca ...] [...] ...]
	 * @param t tabela
	 * @return niz
	 */
	public static String toString(long[][] t){

	}


	/*  ______  __    __       ___      .______
	  /      ||  |  |  |     /   \     |   _  \
	 |  ,----'|  |__|  |    /  ^  \    |  |_)  |
	 |  |     |   __   |   /  /_\  \   |      /
	 |  `----.|  |  |  |  /  _____  \  |  |\  \----.
 	  \______||__|  |__| /__/     \__\ | _| `._____|
	 */

	/**Napolni celotno tabelo z vrednostmi val
	 *
	 *	@version 1
	 *	@param a tabela
	 *   @param val s čim naj napolni
	 *	@since 7
	 *
	 */
	public static void fill(char[][] a, char val){


	}

	/**Napolni tabelo od (fromIndexX,fromIndexY) do konca
	 *
	 * @version 1
	 * @param a tabela
	 * @param fromIndexX x koordinata od kod
	 * @param fromIndexY y koordinata od kod
	 * @param val s čim naj napolni
	 * @since 7
	 *
	 */
	public static void fill(char[][]a, int fromIndexX, int fromIndexY, char val){


	}

	/**Napolni tabelo od (fromIndexX,fromIndexY) do (toIndexX,toIndexY)
	 *
	 * @version 1
	 * @param a tabela
	 * @param fromIndexX x koordinata od kod
	 * @param fromIndexY y koordinata od kod
	 * @param val s čim naj napolni
	 * @since 7
	 */
	public static void fill(char[][]a, int fromIndexX, int fromIndexY, int toIndexX, int toIndexY,  char val){

	}

	/** Kopira tabelo
	 *
	 * @version 1
	 * @param t1 tabela
	 * @return vrne kopijo tabele
	 * @since 7
	 */
	public static char[][] copyOf(char[][] t1){


	}

	/**Kopira del tabele od (0,0) do (x,y)
	 *
	 * @version 1
	 * @param t tabela
	 * @param x koordinata x
	 * @param y koordinata y
	 * @since 7
	 */
	public static char[][] copyOfRange(char[][] t, int x, int y){


	}

	/**Primerja dve tabeli, če se popolnoma ujemata
	 *
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @return Vrne resnično, če se tabeli popolnoma ujemata
	 */
	public static boolean equals(char[][] t1, char[][] t2){

	}

	/**
	 * Primerja vrstici dveh tabel
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @param row1 vrstica prve tabele
	 * @param row2 vrstica druge tabele
	 * @return vrne resnično, če se vrstici popolnoma ujemata
	 */
	public static boolean equals(char[][] t1, char[][] t2, int row1, int row2){

	}

	/**
	 * Primerja stolpce dveh tabel
	 * @param t1 prva tabela
	 * @param t2 druga tabela
	 * @param col1 prvi stolpec
	 * @param col2 drugi stolpec
	 * @return vrne resnično. če se stolpca popolnoma ujemata
	 */
	public static boolean equals(char[][] t1, char[][] t2, int col1, int col2){

	}

	/**
	 * Razvrsti vrstico tabele naraščajoče
	 * @param t1 tabela
	 * @param row vrstica
	 */
	public static void sort(char[][] t1, int row){

	}

	/**
	 * Razvrsti stolpec tabele naraščajoče
	 * @param t1 tabela
	 * @param col stolpec
	 */
	public static void sort(char[][] t1, int col){

	}

	/**
	 * Poišče indeks elementa v urejeni tabeli
	 * @param t1 tabela
	 * @param val iskana vrednost
	 * @param row če je resnično, išče po vrsticah in po stolpcih v nasprotnem primeru
	 * @param num številka vrstice/stolpca
	 * @return indeks podanega elementa, če obstaja, -1 v nasprotnem primeru
	 */
	public static int binarySearch(char[][] t1, char val, boolean row, int num){

	}

	/**
	 * Vrne niz z vrednostmi tabele v obliki [[... elementi prvega stolpca ...] [...] ...]
	 * @param t tabela
	 * @return niz
	 */
	public static String toString(char[][] t){

	}
    

}

