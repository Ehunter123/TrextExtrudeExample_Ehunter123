
CSG text = CSG.text("Ella",5)

import eu.mihosoft.vrl.v3d.*;
import javafx.scene.text.Font;

double width=30
double depth=70
double height=3

println "Width is "+width
println "Height is "+height
println "depth is "+depth

CSG nameTagBase = new Cube(width,depth,height).toCSG()

return [nameTagBase,text]