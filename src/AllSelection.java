import java.util.ArrayList;
import java.util.Collection;

public class AllSelection implements EtatSelection {

	@Override
	public void selectAll(ArrayList<FormGeo> forms) {
		System.out.println("tout les formes sont déja selectionneé");
		
	}

	@Override
	public void select(FormGeo f) {
		System.out.println("etat Allselection a someSelected");
		
	}

	@Override
	public void clearSelected() {
		System.out.println("clear all selection");
		
	}

	@Override
	public void doActivity() {
		System.out.println("etat select All");
		
		
	}

}
