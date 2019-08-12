package live;
import music.PlayableA;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String args[])
	{
		Veena vobj = new Veena();
		Saxophone sobj = new Saxophone();
		
		vobj.play();
		sobj.play();
		
		PlayableA p1, p2;
		
		p1 = new Veena();
		p2 = new Saxophone();
		
		p1.play();
		p2.play();
		
	}
}