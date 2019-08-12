abstract class Instrument {
  abstract public void play();
}

class Piano extends Instrument {
  public void play() {
    System.out.println("Piano is playing  tan tan tan tan");
  }
}

class Flute extends Instrument {
  public void play() {
    System.out.println("Flute is playing  toot toot toot toot");
  }
}

class Guitar extends Instrument {
  public void play() {
    System.out.println("Guitar is playing  tin  tin  tin");
  }
}

class MyInstruments {
  public static void main(String[] args) {
    Instrument inst[] = new Instrument[10];
	
	for(int i=0;i<10;i++)
	{
		inst[i] = new Piano();
		inst[i].play();
		inst[i] = new Flute();
		inst[i].play();
		inst[i] = new Guitar();
		inst[i].play();
	}		
  }
}