
public class Labirinth {
	private Player p;
	private boolean completed;
	private char[][] map = { { '#', '#', '#', '#', '#', '#', '#', '#' },
			{ '#', '.', '#', '.', '.', '.', '.', '#' },
			{ '#', '.', '.', '.', '#', '#', '#', '#' },
			{ '#', '.', '#', '.', '.', '#', '.', '#' },
			{ '#', '#', '#', '#', '.', '.', '.', '#' },
			{ '#', '.', '.', '.', '.', '#', '.', '#' },
			{ '#', '#', '#', '#', '#', '#', '!', '#' } };

	public Labirinth() {
		completed = false;
		p = new Player(1, 1);
		p.setSymbol('@');
		movePlayer(0,0);
	}
	
	public boolean movePerson(Movement direction) {
		Player dir = direction.move();
		return movePlayer(dir.getX(),dir.getY());
	}

	public boolean movePlayer(int x, int y) {
		if(    p.getY() + y >= 0 && p.getY() + y < map.length
				&& p.getX() + x >= 0 && p.getX() + x < map[0].length
				&& map[p.getY() + y][p.getX() + x] != '#'
				) {
			if(map[p.getY() + y][p.getX() + x] == '!') {
				completed = true;
			}
			map[p.getY()][p.getX()] = '.';
			p.setX(p.getX() + x);
			p.setY(p.getY() + y);
			map[p.getY()][p.getX()] = p.getSymbol();
			return true;
		}
		return false;
	}

	public void print() {
		System.out.println(this);
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				str += map[i][j] + " ";
			}
			str += '\n';
		}
		return str;
	}
	
	public boolean isCompleted() {
		return completed;
	}
}


public class MoveUp implements Movement{

	public Player move() {
		return new Player(0,-1);
	}

}


public class MoveLeft implements Movement{

	public Player move() {
		return new Player(-1,0);
	}

}

public class MoveDown implements Movement {

	public Player move() {
		return new Player(0,1);
	}
	
}

public class MoveRight implements Movement {

	public Player move() {
		return new Player(1,0);
	}

}

public interface Movement {
	public Player move();
}

public class Player {
	private int x;
	private int y;
	private char symbol;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.setSymbol(symbol);
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}



public class Main {
	public static void main(String[] args) {
		Labirinth l = new Labirinth();
		Scanner scanner = new Scanner(System.in);
		String direction;
		while(!l.isCompleted()) {
			System.out.println(l);
			System.out.println("Choose a direction to move: ");
			direction = scanner.next();
			
			switch(direction) {
				case "u" : l.movePerson(new MoveUp()); break;
				case "d" : l.movePerson(new MoveDown()); break;
				case "l" : l.movePerson(new MoveLeft()); break;
				case "r" : l.movePerson(new MoveRight()); break;
			}
		}
		System.out.println(l);
		System.out.println("Mnogo si lud!");
	}
}