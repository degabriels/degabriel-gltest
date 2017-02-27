
public class Animal extends Thread{
	
	public int nbSp = 3;//number of species, 
	//can be modified in case you want to add a new one
	public String name[] = {"Hen","Duck","Geese"};
	public int [] nbA;//number of animal of each specie
	
	public Animal(){
		this.nbA=new int[nbSp];
		for (int i=0;i<nbSp;i++){
			nbA[i]=0;
		}
	}
	
	public void addAnimal(int i){
		nbA[i]++;
	}
	
	public void run(){
		if("press A"){
		animals.addAnimal(1);
	}
	if ("press S"){
		animals.addAnimal(2);
	}
	if ("press D"){
		animals.addAnimal(3);
	}
	if ("right arrow" && posBasket<10){
		posBasket++;
	}
	if ("left arrow" && posBasket>0){
		posBasket--;
	}

	}

}
