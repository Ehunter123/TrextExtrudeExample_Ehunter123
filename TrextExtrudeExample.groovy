import eu.mihosoft.vrl.v3d.*;
import javafx.scene.text.Font;

Font font = new Font("Arial",  30);

CSG text = CSG.unionAll(
	TextExtrude.text((double)2,"Hello World! 1 2 3 4 5",font).collect{
	    it.rotx(180)
	    .toZMin()
     }
)

return text