/*
 * This file is part of SpoutcraftAPI (http://wiki.getspout.org/).
 * 
 * SpoutcraftAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutcraftAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spoutcraft.spoutcraftapi.gui;

import org.spoutcraft.spoutcraftapi.UnsafeClass;

@UnsafeClass
public interface Texture extends Widget {

	/**
	 * Gets the url of this texture to render
	 * 
	 * @return url
	 */
	public String getUrl();

	/**
	 * Sets the url of this texture to render
	 * All textures must be of png type and a size that is a factor of 2 (e.g 64x128). Use the alpha channel for hiding empty space.
	 * @param url to set this texture to
	 * @return texture
	 */
	public Texture setUrl(String Url);
	
	/**
	 * Gets if the texture draws the full alpha channel instead of just using a bit-mask.
	 * @return if it's drawing the alpha channel
	 */
	public boolean isDrawingAlphaChannel();
	
	/**
	 * Sets if the texture should draw the full alpha channel instead of just using a bit-mask.
	 * @param draw to set the drawing state
	 * @return texture
	 */
	public Texture setDrawAlphaChannel(boolean draw);

}
