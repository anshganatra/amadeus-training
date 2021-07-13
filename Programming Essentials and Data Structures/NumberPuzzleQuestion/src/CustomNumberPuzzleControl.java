import java.awt.*;
import java.util.*;
import java.util.List;

class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	}
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}

	// The following three methods have to be written by the participants...
	
	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();
		int clickId = emptyCellId;
		
		
		for (int i = 0; i < buttons.length; i++) {
			if (buttons[i] == buttonClicked) {
				clickId = i;
				break;
			}
		}
		
		if (emptyCellId == (clickId - 1) || emptyCellId == (clickId + 1) || 
				emptyCellId == (clickId - 4) || emptyCellId == (clickId + 4) ) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = clickId;
		}
		
		return emptyCellId;

	}
	
	public int[] getRandomNumbersForGrid() {
		int arr[] = new int[15];

		boolean arrayFilled = false;
		int idx = 0;
		
		while(!arrayFilled) {
			int a = (getRandomNumber() % 15) + 1;
			System.out.println(a);
			boolean found = false;
			for(int x : arr){
				if(x == a){
			        found = true;
			        break;
			    }
			}
			
			if(!found) {
				arr[idx] = a;
				idx+=1;
				if(idx==15) {
					arrayFilled=true;
				}
			}
		}
			
		return arr;
	}
	
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;
		
		int[] buttonIds = getIntegerArrayOfButtonIds(buttons);
		for(int i=0;i<buttonIds.length;i++)
		{
			if(buttonIds[i+1]!=i)
			{
				winner=false;
				break;
			}
		} 

		return winner;
	}
}