package prjSleeperBarber;

public class Barber implements Runnable {

	private GenerateClients generator = new GenerateClients() {};
	private boolean done;
	
	private void done() {
		this.done = true;
	}
	
	private void hairCut(Client.HairSize hair){
		switch(hair) {
		case BALD:
			Util.isWorking(0);
			break;
		case SHORT:
			Util.isWorking(50);
			break;
		case MEDIUM:
			Util.isWorking(100);
			break;
		case LONG:
			Util.isWorking(150);
			break;
		}
	}
	
	private void shaveBeard(Client.BeardSize beard){
		switch(beard) {
		case NONE:
			Util.isWorking(0);
			break;
		case SHORT:
			Util.isWorking(50);
			break;
		case MEDIUM:
			Util.isWorking(100);
			break;
		case LONG:
			Util.isWorking(150);
			break;
		}
	}

	public void work(Client client) {
		System.out.println("Barbeiro está trabalhando");
		
		hairCut(client.getHairSize());
		shaveBeard(client.getBeardSize());
	}
	
	@Override
	public void run() {
		done = false;
		
		while(!done) {
			//Code
		}
	}
	
}
