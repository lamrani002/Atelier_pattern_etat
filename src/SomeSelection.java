import java.util.ArrayList;

public class SomeSelection implements EtatSelection {

	@Override
	public void selectAll(ArrayList<FormGeo> forms) {
		System.out.println("de etat someSelection a etat AllSelection");
		
	}

	@Override
	public void select(FormGeo f) {
		System.out.println("deja en some selection");
		
	}

	@Override
	public void clearSelected() {
		System.out.println("form selectionneés supprimées!");
		
	}

	@Override
	public void doActivity() {
		System.out.println("etat SomeSelection");
		
	}

}
