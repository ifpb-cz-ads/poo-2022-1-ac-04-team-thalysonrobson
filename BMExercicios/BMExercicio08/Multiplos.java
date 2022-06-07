class Multiplos {
	private int num;
	
	public void imprimirMultiplosDeTres(){
		while(num <= 100){
			num++;
			
			if(num % 3 == 0){
				System.out.println(num);
			}
		}
	}
}