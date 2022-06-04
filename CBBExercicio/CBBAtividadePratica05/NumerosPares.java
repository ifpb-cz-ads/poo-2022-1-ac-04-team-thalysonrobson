class NumerosPares {
	private int num = 0;
	
	public void imprimirPar(){
		while(num <= 100){
			num++;
			if(num % 2 == 0){
				System.out.println(num);
			}
		}
	}
}
