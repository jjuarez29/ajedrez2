import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

/**
 * 
 * @author Alfredo Paz
 * Adaptado del material de Burroughes, Heijltjes, Walder para Haskell
 *
 */
public class GPicture extends Component {
	private Picture pic;
	public GPicture(Picture pic){
		this.pic = pic;
		int w = 0;
		int h = 0;
		for(String s: pic){
			w = Math.max(w, s.length());
			h++;
		}
		setSize(w, h);
	}
	
	@Override
	public void paint(Graphics g) {
		int y = 0;
		for(String s: pic){
			parseLine(g, y, s);
			y++;
		}
	}
	
	/**
	 * Interpreter from String to a line draw
	 * @param g, Graphics context.
	 * @param y, Row number
	 * @param s, The string to be interpreted.
	 */
	private void parseLine(Graphics g, int y, String s) {
		int xi = 0, xf = 1;
		char c = s.charAt(xi);
		//System.err.println(s);
		while( xf < s.length()){
			if(c == ' '){
				c = s.charAt(xf);
				xi = xf;
			}else if (c != s.charAt(xf)){
				//System.err.print(c+":");
				g.setColor(parserChar(c));
				g.drawLine(xi, y, xf, y);
				c = s.charAt(xf);
				xi = xf + 1;
			}
			xf++;
		}
		//System.err.println(c);
		if(c != ' '){
			g.setColor(parserChar(c));
			g.drawLine(xi, y, xf, y);
		}
	}
	
	/**
	 * Interpreter from char to color
	 * @param c, a char to be interpreted
	 * @return
	 */
	private Color parserChar(char c){
		Color col;
		switch (c) {
		case '_': col = Color.LIGHT_GRAY; break;
		case '=': col = Color.DARK_GRAY; break;
		case '.': col = Color.WHITE; break;
		case '@': col = Color.BLACK; break;
		case '#': col = Color.DARK_GRAY; break;
		default: col = Color.BLACK; break;
		}
		return col;
	}
	
}
