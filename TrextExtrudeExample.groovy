import eu.mihosoft.vrl.v3d.CSG

println javafx.scene.text.Font.getFontNames() 

// To use the default Font at 30 point
CSG text = CSG.text("My Text",5)

// Explicatly set the font name and the size
CSG text2 = CSG.text("Other Font",5.0, 30.0, "FreeSerif")
			.movey(40)

return [text,text2]