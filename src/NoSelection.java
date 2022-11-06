import java.util.ArrayList;

public class NoSelection implements EtatSelection {

	@Override
	public void selectAll(ArrayList<FormGeo> forms) {
		System.out.println("Rien a Selection");
		
	}

	@Override
	public void select(FormGeo f) {
		System.out.println("some select");
		
	}

	@Override
	public void clearSelected() {
		System.out.println("supprimer tout");
		
	}

	@Override
	public void doActivity() {
		System.out.println("etat NoSelection");
		
	}

}
