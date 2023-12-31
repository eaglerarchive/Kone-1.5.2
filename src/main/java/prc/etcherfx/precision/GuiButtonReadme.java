package prc.etcherfx.precision;

import net.lax1dude.eaglercraft.EaglerAdapter;
import net.lax1dude.eaglercraft.TextureLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiButton;

public class GuiButtonReadme extends GuiButton {
	public GuiButtonReadme(int par1, int par2, int par3) {
		super(par1, par2, par3, 18, 18, "");
	}

	private static final TextureLocation tex_gui = new TextureLocation("/title/main_menu/gui2.png");

	/**
	 * Draws this button to the screen.
	 */
	public void drawButton(Minecraft par1Minecraft, int par2, int par3) {
		if (this.drawButton) {
			tex_gui.bindTexture();
			EaglerAdapter.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			boolean var4 = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width
					&& par3 < this.yPosition + this.height;
			int var5 = 144;

			if (var4) {
				var5 += this.height;
			}

			this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, var5, this.width, this.height);
		}
	}
}
