package lists.controller;

import java.util.List;
import java.util.ArrayList;
import lists.model.Kahoot;
import lists.view.ListsDisplay;

public class ListsController
{
		private List<Kahoot> myKahoots;
		private ListsDisplay popup;
//		private List<Kahoot> mySecondKahoot;
		
		public ListsController()
		{
			myKahoots = new ArrayList<Kahoot>();
			popup = new ListsDisplay();
//			mySecondKahoot = new ArrayList<Kahoot>();
		}
		
		public void start()
		{
			Kahoot myFirstKahoot = new Kahoot();
			myKahoots.add(myFirstKahoot);
			fillTheList();
			showTheList();
		}
		private void showTheList()
		{
			for (int index = 0; index < myKahoots.size(); index += 1)
			{
				popup.displayText(myKahoots.get(index).toString());
			}
		}
		/** Fills list of myKahoots
		 *  Creates different Kahoots
		 *  Added different kahoots to the list of myKahoots
		 */
		private void fillTheList()
		{
			Kahoot fiftyStates = new Kahoot("Kashish", 7);
			Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
			Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
			Kahoot animalColor = new Kahoot("Branton", 10);
			Kahoot presidents = new Kahoot("Obama", 44);
			myKahoots.add(fiftyStates);
			myKahoots.add(mySecondKahoot);
			myKahoots.add(bigQuiz);
			myKahoots.add(animalColor);
			myKahoots.add(presidents);
		}
		
//		private void mySecondKahoot()
//		{
//			Questions questionOne = new question("Who's the best around?");
//		}
		
}
