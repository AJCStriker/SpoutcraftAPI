package org.spoutcraft.spoutcraftapi.block.design;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.spoutcraft.spoutcraftapi.addon.Addon;
import org.spoutcraft.spoutcraftapi.util.Vector;

public interface BlockDesign {

	/**
	 * Sets the maximum brightness of the block
	 * 
	 * @param maxBrightness to set
	 * @return this
	 */
	public BlockDesign setMaxBrightness(float maxBrightness);
	
	/**
	 * Sets the minimum brightness of the block
	 * 
	 * @param minBrightness to set
	 * @return this
	 */
	public BlockDesign setMinBrightness(float minBrightness);
	
	/**
	 * Sets the fixed brightness of the block
	 * 
	 * @param brightness to set
	 * @return this
	 */
	public BlockDesign setBrightness(float brightness);
	
	/**
	 * Sets the number of render passes of the block
	 * 
	 * @param renderPass to set
	 * @return this
	 */
	public BlockDesign setRenderPass(int renderPass);
	
	public int getRenderPass();
	
	public int getNumBytes();
	
	public int getVersion();
	
	public void read(DataInputStream input) throws IOException;
	
	public void writeReset(DataOutputStream output);

	public int getResetNumBytes();

	public void write(DataOutputStream output) throws IOException;
	
	/**
	 * Sets the specified Texture for this BlockDesign
	 * 
	 * @param addon associated with the texture
	 * @param texture to set
	 * @return this
	 */
	public BlockDesign setTexture(Addon addon, Texture texture);
	
	/**
	 * Sets the bounding box for this block
	 * 
	 * @param lowX of the first corner
	 * @param lowY of the first corner
	 * @param lowZ of the first corner
	 * @param highX of the second corner
	 * @param highY of the second corner
	 * @param highZ of the second corner
	 * @return this
	 */
	public BlockDesign setBoundingBox(float lowX, float lowY, float lowZ, float highX, float highY, float highZ);
	
	/**
	 * Sets the number of quads or faces for this block
	 * 
	 * @param quads to set
	 * @return this
	 */
	public BlockDesign setQuadNumber(int quads);
	
	/**
	 * Manually specify a quad for this block
	 * 
	 * @param quadNumber to set
	 * @param x1 first vertex value
	 * @param y1 first vertex value
	 * @param z1 first vertex value
	 * @param tx1 first vertex texture x
	 * @param ty1 first vertex texture y
	 * @param x2 second vertex value
	 * @param y2 second vertex value
	 * @param z2 second vertex value
	 * @param tx2 second vertex texture x
	 * @param ty2 second vertex texture y
	 * @param x3 third vertex value
	 * @param y3 third vertex value
	 * @param z3 third vertex value
	 * @param tx3 third vertex texture x
	 * @param ty3 third vertex texture y
	 * @param x4 fourth vertex value
	 * @param y4 fourth vertex value
	 * @param z4 fourth vertex value
	 * @param tx4 fourth vertex texture x
	 * @param ty4 fourth vertex texture y
	 * @param textureSizeX total width of the texture
	 * @param textureSizeY total height of the texture
	 * @return this
	 */
	public BlockDesign setQuad(int quadNumber,
			float x1, float y1, float z1, int tx1, int ty1,
			float x2, float y2, float z2, int tx2, int ty2,
			float x3, float y3, float z3, int tx3, int ty3,
			float x4, float y4, float z4, int tx4, int ty4,
			int textureSizeX, int textureSizeY);
	
	/**
	 * Sets the specified quad or face
	 * 
	 * @param number of the quad to set
	 * @param quad to set there
	 * @return this
	 */
	public BlockDesign setQuad(Quad quad);
	
	/**
	 * Manually specified a vertex for this block
	 * 
	 * @param quadNumber of the vertex
	 * @param vertexNumber in the quad
	 * @param x value
	 * @param y value
	 * @param z value
	 * @param tx texture x value
	 * @param ty texture y value
	 * @param textureSizeX total width of the texture
	 * @param textureSizeY total height of the texture
	 * @return this
	 */
	public BlockDesign setVertex(int quadNumber, int vertexNumber, float x, float y, float z, int tx, int ty, int textureSizeX, int textureSizeY);
	
	/**
	 * Sets a vertex
	 * 
	 * @param vertex to set
	 * @return this
	 */
	public BlockDesign setVertex(Vertex vertex);
	
	/**
	 * Gets the texture URL associated with this block
	 * @return texture URL
	 */
	public String getTexureURL();
	
	/**
	 * Gets the name of the addon associated with this blocks texture
	 * @return name of the addon
	 */
	public String getTextureAddon();
	
	public boolean getReset();
	
	/**
	 * Sets the light source for the specified quad
	 * 
	 * @param quad to set
	 * @param x offset from this block
	 * @param y offset from this block
	 * @param z offset from this block
	 * @return this
	 */
	public BlockDesign setLightSource(int quad, int x, int y, int z);
	
	/**
	 * Gets the light source for the specified quad
	 * 
	 * @param quad to get
	 * @param x offset from this block
	 * @param y offset from this block
	 * @param z offset from this block
	 * @return Vector
	 */
	public Vector getLightSource(int quad, int x, int y, int z);

	/**
	 * Gets the Texture associated with this BlockDesign
	 * 
	 * @return the texture
	 */
	public Texture getTexture();
}
