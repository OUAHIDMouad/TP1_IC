package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

	private IDao dao;
	
	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double data = dao.getData();
		double res = data*23;
		return res;
	}

	public void setDao(IDao dao) {
		this.dao=dao;
	}
}


