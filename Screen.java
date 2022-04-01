import javax.swing.JFrame;

public class Screen extends JFrame{
	private GPicture pic;
	public Screen(Picture pic){
		//super("Ajedrez");
		this.pic = new GPicture(pic);
		setSize(this.pic.getWidth() + 5, this.pic.getHeight() + 28);
		getContentPane().add(this.pic);
		
		this.pic.setLocation(300, 120);
		this.pic = new GPicture(pic);
		
		setSize(this.pic.getWidth() + 5, this.pic.getHeight() + 28);
		getContentPane().add(this.pic);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new Screen(Picture.knight().negative().
				join(Picture.rock()));
						

		new Screen(Picture.knight().horizontalMirror().
				join(Picture.rock()	));
								


        /* 
		new Screen(Picture.square().negative()
				);

*/

				
		
	}

}
