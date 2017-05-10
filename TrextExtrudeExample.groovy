import eu.mihosoft.vrl.v3d.*;
import javafx.scene.text.Font;

Font font = new Font("Arial",  30);

return TextExtrude.text((double)10.0,"Hello World 1234!",font).collect{
	it.rotx(180)
	.toZMin()
}
