package lists.controller;

import java.util.List;
import java.util.ArrayList;
import lists.model.Kahoot;
import lists.view.ListsDisplay;

public class Controller
{
		private List<Kahoot> myKahoots;
//		private PopupDisplay popup;
		private ListsDisplay popup;
//		private List<Kahoot> mySecondKahoot;
		
		public Controller()
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
//		showTheList();
			changeTheList();
			messWithList();
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
//				if(currentCreator.equals("what ever"))
//				{
//					for (int loop = 0; loop < 5; loop +=1)
//					{
//						popup.displayText("Wow, nobody does a lot");
//					}
//				}
//				for(int currentLetterIndex = 0; currentLetterIndex < creator.length(); currentLetterIndex += 1)
//				{
//					popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
//				}
				String topic = currentKahoot.getTopic();
//				for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
//				{
//					popup.displayText(topic.substring(letter, letter + 1));
//				}
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
		
		private void changeTheList()
		{
			popup.displayText("The current list size is: " + myKahoots.size());
			Kahoot removed = myKahoots.remove(3);
			popup.displayText("I removed the Kahoot by " + removed.getCreator());
			popup.displayText("The list now has: " + myKahoots.size() + " items inside.");
			myKahoots.add(0, removed);
			popup.displayText("The list is still: " + myKahoots.size() + " items big.");
			removed = myKahoots.set(2, new Kahoot());
			popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with one by " + myKahoots.get(2).getCreator());
			
		} 
		
		private void messWithList()
		{
			popup.displayText("The list currently has " + myKahoots.size() + " kahoots in it.");
			String response = popup.getResponse("Which kahoot in the list would you like to remove?");
			int deletedKahoot = 0;
			deletedKahoot = Integer.parseInt(response);
			if(deletedKahoot > myKahoots.size())
			{
				popup.displayText("There isn't a Kahoot in that spot! You're to high!");
			}
			else if(deletedKahoot < 0)
			{
				popup.displayText("There isn't a Kahoot in that spot! You're too low!");
			}
				Kahoot removed = myKahoots.remove(deletedKahoot);
				popup.displayText("You have removed the kahoot made by " + removed.getCreator() + " from the list!");
				popup.displayText("There are now only " + myKahoots.size() + " items left in the list!");	
		}
		
		public ListsDisplay getPopu()
		{
			return popup;
		}
		
		public ArrayList<Kahoot> getMyKahoots()
		{
			return (ArrayList<Kahoot>)myKahoots;
		}
//		private void mySecondKahoot()
//		{
//			Questions questionOne = new question("Who's the best around?");
//		}
		
}
