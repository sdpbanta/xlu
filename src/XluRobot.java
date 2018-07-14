import java.awt.*;
import java.awt.event.*;

public class XluRobot
   extends Robot
{

   //   C o n s t r u c t o r s

   public XluRobot( )
      throws AWTException
   {
      super();
   } // end XluRobot( )


   //   P u b l i c   M e t h o d s

   public void click( )
   {
      this.mousePress(InputEvent.BUTTON1_MASK);
      this.mouseRelease(InputEvent.BUTTON1_MASK);
   } // end click( )


   public void click(int x, int y)
   {
      move(x, y);
      mousePress(InputEvent.BUTTON1_MASK);
      mouseRelease(InputEvent.BUTTON1_MASK);
   } // end click( )


   public void move(int x, int y)
   {
      mouseMove(x, y);
   } // end move( )


   public void move(int x, int y, int postDelayMs) {
      move(x, y);
      delay(postDelayMs);
   } // end move( )


   public void move(int x, int y, int preDelayMs, int postDelayMs)
   {
      delay(preDelayMs);
      move(x, y, postDelayMs);
   } // end move( )

   
   public static void main(String[] args)
      throws AWTException
   {
      XluRobot r = new XluRobot();
      r.setAutoDelay(10);
      r.move(100, 100);
      //for (int i = 100; i < 800; i++)
      //{
      //   r.move(i,  i);
      //}
   } // end main( )

} // end class XluRobot
