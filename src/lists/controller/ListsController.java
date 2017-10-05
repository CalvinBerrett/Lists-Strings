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
			String currentCreator = "";
			for (int index = 0; index < myKahoots.size(); index += 1)
			{
				currentCreator = myKahoots.get(index).getCreator();
				Kahoot currentKahoot = myKahoots.get(index);
				String creator = currentKahoot.getCreator();
				popup.displayText(myKahoots.get(index).toString());
				if(currentCreator.equals("what ever"))
				{
					for (int loop = 0; loop < 5; loop +=1)
					{
						popup.displayText("Wow, nobody does a lot");
					}
				}
				for(int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex += 1)
				{
					popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
				}
				String topic = currentKahoot.getTopic();
				for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
				{
					popup.displayText(topic.substring(letter, letter + 1));
				}
			}
		}
		/** Fills list of myKahoots
		 *  Creates different Kahoots
		 *  Added different kahoots to the list of myKahoots
		 */
		private void fillTheList()
		{
			Kahoot fiftyStates = new Kahoot("Kashish", 7, "States");
			Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "Devils");
			Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything");
			Kahoot animalColor = new Kahoot("Branton", 10, "All the colors of the rainb- I mean animals");
			Kahoot presidents = new Kahoot("Obama", 44, "presidents");
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
