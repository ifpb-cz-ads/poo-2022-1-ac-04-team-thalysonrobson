class Repetir {
	private int x = 10;
	private int i = 0;
	
	public void imprimirNumeros(){
		do {
			i++;
			
			System.out.println(x);
			x = x + 1;
		}while(i <= 20);
	}
}