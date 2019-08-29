package prjSleeperBarber;

public interface GenerateClients {

	public default Client getClient() 
	{
		double x = Math.random();
			   	
		return x < 0.06 ? new Client(Client.HairSize.BALD, 
					   Client.BeardSize.SHORT):
			   x < 0.12 ? new Client(Client.HairSize.BALD,
					   Client.BeardSize.MEDIUM):
			   x < 0.18 ? new Client(Client.HairSize.BALD,
					   Client.BeardSize.LONG):
			   x < 0.24 ? new Client(Client.HairSize.SHORT,
					   Client.BeardSize.NONE):
			   x < 0.30 ? new Client(Client.HairSize.SHORT,
					   Client.BeardSize.SHORT):
			   x < 0.36 ? new Client(Client.HairSize.SHORT,
					   Client.BeardSize.MEDIUM):
			   x < 0.42 ? new Client(Client.HairSize.SHORT,
					   Client.BeardSize.LONG):
			   x < 0.48 ? new Client(Client.HairSize.MEDIUM,
					   Client.BeardSize.NONE):
			   x < 0.54 ? new Client(Client.HairSize.MEDIUM,
					   Client.BeardSize.SHORT):
			   x < 0.60 ? new Client(Client.HairSize.MEDIUM,
					   Client.BeardSize.MEDIUM):
			   x < 0.66 ? new Client(Client.HairSize.MEDIUM,
					   Client.BeardSize.LONG):
			   x < 0.72 ? new Client(Client.HairSize.LONG,
					   Client.BeardSize.NONE):
			   x < 0.78 ? new Client(Client.HairSize.LONG,
					   Client.BeardSize.SHORT):
			   x < 0.84 ? new Client(Client.HairSize.LONG,
					   Client.BeardSize.MEDIUM):
			              new Client(Client.HairSize.LONG,
			           Client.BeardSize.LONG);	   		
	}
	
}
