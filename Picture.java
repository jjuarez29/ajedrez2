import java.util.Arrays;
import java.util.Iterator;
import java.lang.System;
/**
 * 
 * @author Alfredo Paz
 * Adaptado del material de Burroughes, Heijltjes, Walder para Haskell
 *
 */
public class Picture implements Iterable<String>{
	private String[] img;
	private int width = 0;
	public final int length;
	
	/**
	 * Only can create Pictures with static methods.
	 * @param img, Character image.
	 */
	private Picture(String[] img){
		this.img = img;
		length = this.img.length;
		for(String s: img)
			width = Math.max(width, s.length());
	}
	
	private byte invColor(byte c){
		byte ic;
		switch (c) {
		case '_': ic = '='; break;
		case '=': ic = '_'; break;
		case '.': ic = '@'; break;
		case '@': ic = '.'; break;
		default: ic = c; break;
		}
		return ic;
	}
	
	private byte overlay(byte c1, byte c2){
		if(c1 == ' ') return c2;
		return c1;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return length;
	}

	/**
	 * Vertical Mirror Image 
	 * @return a new Picture, the vertical mirror.
	 */
	public Picture verticalMirror(){
		//Sy+++++++++++
	/*	
		String [] img2 = new String[58];
		String [] img3 = new String[58];
		PrintStream o = new PrintStream(new File("A.txt"));
 		System.setErr(o);
		System.err.println(img);
		int k;
		k=57;
		for(int i = 0; i < 57; i++){
			String img3='';
            img3=img[k];
			//img2[] 

			img2[i]=img[k];
			k=k-1;
			}
			 Error vertical mirror  tipo de datos
			*/
		return new Picture(img2);
	}
/*
	String [] img2 = new String[58];
		for(int i = 0; i < img.length; i++){
			char[] line = new char[58];
			for(int j = 0; j < img.length; j++)
				line[j] = '_';
			img[i] = new String(line);
		}
		return new Picture(img);
*/	
	/**
	 * Horizontal Mirror Image
	 * @return a new Picture, the horizontal mirror.
	 */
	public Picture horizontalMirror(){
		//System.out.println(img[20]);
		int x = getHeight()-1;
        int z = getWidth();
        int k;
        k=0;        
         for (int i=0 ;i < x; i++){
          String  str=img[i];
              img[i]=""; 
              k=0;
            for (int n = str.length() -1; n >= 0; n--) { 
              char c = str.charAt(n); 
              img[i]=img[i]+c;
            k=k+1;};       
			}
		return new Picture(img);
	}
	 

	/**
	 * Negative Color
	 * @return a new Picture, the negative color.
	 */
	public Picture negative(){
		byte id='=';
		//case '_': ic = '='; break;
		//case '=': ic = '_'; break;
		//case '.': ic = '@'; break;
		//case '@': ic = '.'; break;

		invColor(id );
		return new Picture(img);
	}
	
	/**
	 * Put the image p next to the right of the current image.
	 * @param p, the neighbor image
	 * @return a new image
	 */
	public Picture join(Picture p){
		return new Picture(img);
	}
	
	/**
	 * Put the image p next to down of the current image.
	 * @param p, the neighbor image
	 * @return a new image
	 */
	public Picture down(Picture p){
		return new Picture(img);
	}
	
	/**
	 * Merge the current picture over the picture p. 
	 * @param p, the picture that will be on the behind.
	 * @return a new picture
	 */
	public Picture under(Picture p){
		return new Picture(img);
	}
	
	/**
	 * Repeat horizontally the current picture n times (to right).
	 * @param n, a positive integer greater than 0.
	 * @return a new picture.
	 */
	public Picture repeatH(int n){
		return new Picture(img);
	}
	
	/**
	 * Repeat vertically the current picture n times (to down).
	 * @param n, a positive integer greater than 0.
	 * @return a new picture.
	 */
	public Picture repeatV(int n){
		return new Picture(img);
	}
	
	public static Picture square(){
		String [] img = new String[58];
		for(int i = 0; i < img.length; i++){
			char[] line = new char[58];
			for(int j = 0; j < img.length; j++)
				line[j] = '_';
			img[i] = new String(line);
		}
		return new Picture(img);
	}
	
	public static Picture bishop(){
		String [] img = {
			      "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                            ##                            ",
				  "                          ######                          ",
				  "                         ###..###                         ",
				  "                         ##....##                         ",
				  "                         ##....##                         ",
				  "                         ###..###                         ",
				  "                          ######                          ",
				  "                           ####                           ",
				  "                         ########                         ",
				  "                        ###....###                        ",
				  "                      ####......####                      ",
				  "                    ####..........####                    ",
				  "                   ###..............###                   ",
				  "                  ###................###                  ",
				  "                 ###..................###                 ",
				  "                ###.........##.........###                ",
				  "                ##..........##..........##                ",
				  "               ###..........##..........###               ",
				  "               ##...........##...........##               ",
				  "               ##.......##########.......##               ",
				  "               ##.......##########.......##               ",
				  "               ##...........##...........##               ",
				  "               ##...........##...........##               ",
				  "               ##...........##...........##               ",
				  "               ###..........##..........###               ",
				  "                ##..........##..........##                ",
				  "                ###....................###                ",
				  "                 ##....................###                ",
				  "                 ###..................###                 ",
				  "                  ###................###                  ",
				  "                   ####################                   ",
				  "                   ####################                   ",
				  "                   ##................##                   ",
				  "                  ###................###                  ",
				  "                  ##..................##                  ",
				  "                  ######################                  ",
				  "                 ########################                 ",
				  "                 ###..................###                 ",
				  "                 #####..............#####                 ",
				  "                 ########################                 ",
				  "                      ##############                      ",
				  "                          ######                          ",
				  "                        ####..####                        ",
				  "        ##################......##################        ",
				  "      ##################..........##################      ",
				  "    ####..........................................####    ",
				  "    ###.....................##.....................###    ",
				  "     ##...................######...................##     ",
				  "     ###.########.......####  ####.......########.###     ",
				  "      ####################      ####################      ",
				  "       ##        #######          #######        ##       ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "				
		};
		return new Picture(img);
	}
	
	public static Picture king(){
		String [] img = {"                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                           ####                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                         ###..###                         ",
				  "                         #......#                         ",
				  "                         ###..###                         ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                           #..#                           ",
				  "                          ######                          ",
				  "                         ###..###                         ",
				  "                         ##....##                         ",
				  "                        ###....###                        ",
				  "           #######      ##......##      #######           ",
				  "         ###########    ##......##    ###########         ",
				  "       ####.......####  ##......##  ####.......####       ",
				  "      ###...........######......######...........###      ",
				  "     ###..............####......####..............###     ",
				  "     ##................####....####................##     ",
				  "    ###.................###....###.................###    ",
				  "    ##...................###..###...................##    ",
				  "    ##...................###..###...................##    ",
				  "    ##....................######....................##    ",
				  "    ##....................######....................##    ",
				  "    ##.....................####.....................##    ",
				  "    ###....................####....................###    ",
				  "     ##.....................##....................###     ",
				  "     ###....................##....................##      ",
				  "      ###...................##...................###      ",
				  "       ###..................##..................###       ",
				  "        ###...........##############...........###        ",
				  "         ###.....########################.....###         ",
				  "          ############..............############          ",
				  "           ######........................######           ",
				  "            ##..............................##            ",
				  "            ##..............................##            ",
				  "            ##........##############........##            ",
				  "            ##...########################...##            ",
				  "            ##########..............##########            ",
				  "            #####........................#####            ",
				  "            ##.........############.........##            ",
				  "            ##....######################....##            ",
				  "            ##.########............########.##            ",
				  "            ######......................######            ",
				  "            ######......................######            ",
				  "               ########............########               ",
				  "                  ######################                  ",
				  "                       ############                       ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "
		};
		return new Picture(img);
	}

	public static Picture knight(){
		String [] img = {"                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "               #         ##                               ",
				  "              ###       ####                              ",
				  "              #####     ####                              ",
				  "               #####   ######                             ",
				  "               ##.### ###..##                             ",
				  "               ##..#####...######                         ",
				  "               ##...####...#########                      ",
				  "               ##..#####...##...######                    ",
				  "              ###.###.......#.....######                  ",
				  "             ###..#.................#####                 ",
				  "            ###.......................####                ",
				  "            ##.........................####               ",
				  "           ###..####....................####              ",
				  "           ##..####......................####             ",
				  "           ##..####......................#####            ",
				  "           ##..###........................####            ",
				  "          ###..#..............##...........####           ",
				  "          ##..................##...........####           ",
				  "          ##..................##............####          ",
				  "         ###..................##............####          ",
				  "         ##...................##.............####         ",
				  "        ###..................###.............####         ",
				  "       ###..................###..............####         ",
				  "      ###...................###...............####        ",
				  "      ##...................####...............####        ",
				  "     ###.................######...............####        ",
				  "     ##................####  ##................####       ",
				  "    ###.##...........####    ##................####       ",
				  "    ##.###.........####     ###................####       ",
				  "    ##.###........###       ##.................####       ",
				  "    ##.##........###       ###.................#####      ",
				  "    ##......##..###        ##...................####      ",
				  "    ##.....###.###        ###...................####      ",
				  "    ###...#######        ###....................####      ",
				  "     ########.##        ###.....................####      ",
				  "       #########       ###......................####      ",
				  "            ###       ###.......................#####     ",
				  "                     ###........................#####     ",
				  "                    ###..........................####     ",
				  "                    ##...........................####     ",
				  "                   ###...........................####     ",
				  "                  ###............................####     ",
				  "                  ##.............................####     ",
				  "                 ###.............................####     ",
				  "                 ##..............................####     ",
				  "                 ##..............................####     ",
				  "                 ####################################     ",
				  "                 ####################################     ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "
		};
		return new Picture(img);
	}

	public static Picture pawn(){
		String [] img = {"                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                           ####                           ",
		                  "                         ########                         ",
		                  "                        ###....###                        ",
		                  "                       ###......###                       ",
		                  "                       ##........##                       ",
		                  "                       ##........##                       ",
		                  "                       ##........##                       ",
		                  "                       ##........##                       ",
		                  "                       ###......###                       ",
		                  "                        ###....###                        ",
		                  "                      #####....#####                      ",
		                  "                     ###..........###                     ",
		                  "                    ###............###                    ",
		                  "                    ##..............##                    ",
		                  "                   ###..............###                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ##................##                   ",
		                  "                   ###..............###                   ",
		                  "                    ##..............##                    ",
		                  "                    ###............###                    ",
		                  "                     ####........####                     ",
		                  "                     ####........####                     ",
		                  "                   ####............####                   ",
		                  "                  ###................###                  ",
		                  "                 ###..................###                 ",
		                  "                ###....................###                ",
		                  "               ###......................###               ",
		                  "               ##........................##               ",
		                  "              ###........................###              ",
		                  "              ##..........................##              ",
		                  "             ###..........................###             ",
		                  "             ##............................##             ",
		                  "             ##............................##             ",
		                  "            ###............................###            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##################################            ",
		                  "            ##################################            ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          "
		};
		return new Picture(img);
	}
	
	public static Picture queen(){
		String [] img = {"                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                            ##                            ",
				  "                          ######                          ",
				  "              #####      ###..###      #####              ",
				  "             #######     ##....##     #######             ",
				  "             ##...##     ##....##     ##...##             ",
				  "             ##...##     ########     ##...##             ",
				  "    ##       ##...##      ######      ##...##       ##    ",
				  "  ######     #######        ##        #######     ######  ",
				  " ###..###     #####        ####        #####     ###..### ",
				  " ##....##       ###        ####        ###       ##....## ",
				  " ###...##       ###        ####        ###       ##...### ",
				  "  #######       ###        ####        ###       #######  ",
				  "   #####        ####      ######      ####        #####   ",
				  "     ###        ####      ##..##      ####        ###     ",
				  "     ####       ####      ##..##      ####       ####     ",
				  "     ####       #####     ##..##     #####       ####     ",
				  "     #####      ##.##     ##..##     ##.##      #####     ",
				  "      #####     ##.##    ###..###    ##.##     #####      ",
				  "      ##.##    ###.###   ##....##   ###.###    ##.##      ",
				  "      ##.###   ##...##   ##....##   ##...##   ###.##      ",
				  "      ##..##   ##...###  ##....##  ###...##   ##..##      ",
				  "      ##..###  ##....## ###....### ##....##  ###..##      ",
				  "      ###..##  ##....## ##......## ##....##  ##..###      ",
				  "       ##..### ##....#####......#####....## ###..##       ",
				  "       ##...#####.....####......####.....#####...##       ",
				  "       ##....####.....####......####.....####....##       ",
				  "       ##....####..#..###..####..###..#..####....##       ",
				  "       ###....###.######################.###....###       ",
				  "        ##.################....################.##        ",
				  "        ##########......................##########        ",
				  "        ###....................................###        ",
				  "         ##....................................##         ",
				  "         ###..................................###         ",
				  "          ###.......##################.......###          ",
				  "           ####################################           ",
				  "            ########..................########            ",
				  "            ###............................###            ",
				  "             ##............................##             ",
				  "             ##......################......##             ",
				  "             ################################             ",
				  "             ########................########             ",
				  "             ##............................##             ",
				  "            ###.....##################.....###            ",
				  "            ##################################            ",
				  "           #########..................#########           ",
				  "           ##................................##           ",
				  "           ##................................##           ",
				  "           #########..................#########           ",
				  "             ################################             ",
				  "                    ##################                    ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          ",
				  "                                                          "
		};
		return new Picture(img);
	}

	public static Picture rock(){
		String [] img = {"                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "           #########     ########     #########           ",
		                  "           #########     ########     #########           ",
		                  "           ##.....##     ##....##     ##.....##           ",
		                  "           ##.....##     ##....##     ##.....##           ",
		                  "           ##.....#########....#########.....##           ",
		                  "           ##.....#########....#########.....##           ",
		                  "           ##................................##           ",
		                  "           ####################################           ",
		                  "           ####################################           ",
		                  "            ###............................###            ",
		                  "             ####........................####             ",
		                  "               ############################               ",
		                  "                ##########################                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##......................##                ",
		                  "                ##########################                ",
		                  "               ############################               ",
		                  "              ###........................###              ",
		                  "            ##################################            ",
		                  "            ##################################            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "            ##..............................##            ",
		                  "        ##########################################        ",
		                  "        ##########################################        ",
		                  "        ##......................................##        ",
		                  "        ##########################################        ",
		                  "        ##########################################        ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          ",
		                  "                                                          "
		};
		return new Picture(img);
	}

	private class PIterator implements Iterator<String>{
		private int index = 0;
		@Override
		public boolean hasNext() {
			return index < img.length;
		}

		@Override
		public String next() {
			assert index < img.length: "index="+index+"\timg.length="+img.length;
			String s = img[index];
			index++;
			return s;
		}

	}
	@Override
	public Iterator<String> iterator() {
		return new PIterator();
	}
	

}
