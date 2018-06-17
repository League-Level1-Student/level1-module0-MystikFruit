
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		int score = 0;
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String bobby = "https://vignette.wikia.nocookie.net/disney/images/8/86/Goofy-disneyscreencaps_com-1410.jpg/revision/latest?cb=20111205024104";

		Component bobby1;

		bobby1 = createImage(bobby);

		quizWindow.add(bobby1);

		quizWindow.pack();

		String answer1 = JOptionPane.showInputDialog("What movie is this character from?");
		if (answer1.equalsIgnoreCase("The Goofy Movie")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}
		String answer2 = JOptionPane.showInputDialog("What is his name?");
		if (answer2.equalsIgnoreCase("Bobby Zimuruski")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}

		quizWindow.remove(bobby1);

		String wiggles = "https://vignette.wikia.nocookie.net/wiggles/images/2/20/TheWigglesinWiggleTime%28re-recording%29.jpg/revision/latest?cb=20120616224042";

		Component wiggles1;

		wiggles1 = createImage(wiggles);

		quizWindow.add(wiggles1);

		quizWindow.pack();

		String answer3 = JOptionPane.showInputDialog("Who is the red wiggle?");
		if (answer3.equalsIgnoreCase("Murray")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}
		String answer4 = JOptionPane.showInputDialog("Who is the purple wiggle?");
		if (answer4.equalsIgnoreCase("Matt")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}
		String answer5 = JOptionPane.showInputDialog("Who is the yellow wiggle?");
		if (answer5.equalsIgnoreCase("Greg")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}
		String answer6 = JOptionPane.showInputDialog("Who is the blue wiggle?");
		if (answer6.equalsIgnoreCase("Anthony")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}

		quizWindow.remove(wiggles1);

		String jeff = "http://bloody-disgusting.com/wp-content/uploads/2015/07/dr-ian-malcolm-jurassic-park-jeff-goldblum-chaos.jpeg";

		Component jeff1;

		jeff1 = createImage(jeff);

		quizWindow.add(jeff1);

		quizWindow.pack();

		String answer7 = JOptionPane.showInputDialog("And lastly, who plays this character?");
		if (answer7.equalsIgnoreCase("Jeff Goldblum")) {
			System.out.println("CORRECT");
			score = score + 1;
		} else {
			System.out.println("INCORRECT");
		}

		quizWindow.remove(jeff1);

		quizWindow.setVisible(false);

		JOptionPane.showMessageDialog(null, "You earned a total of " + score + "/7 points.");

	}

	private static Component createImage(String bobby) throws MalformedURLException {
		URL url = new URL(bobby);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
