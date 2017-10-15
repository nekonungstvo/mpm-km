package noppes.mpm.client.model.MCALibrary.animation;

import java.util.HashMap;

import noppes.mpm.client.model.MCALibrary.MCAModelRenderer;
import noppes.mpm.client.model.MCALibrary.IMCAnimatedEntity;

public class CustomChannel extends Channel {

	public CustomChannel(String _name) {
		super(_name);
		this.mode = Channel.CUSTOM;
	}

	@Override
	protected void initializeAllFrames() {}
	
	@Override
	public KeyFrame getPreviousRotationKeyFrameForBox(String boxName, float currentFrame){return null;}
	
	@Override
	public KeyFrame getNextRotationKeyFrameForBox(String boxName, float currentFrame){return null;}
	
	@Override
	public KeyFrame getPreviousTranslationKeyFrameForBox(String boxName, float currentFrame){return null;}
	
	@Override
	public KeyFrame getNextTranslationKeyFrameForBox(String boxName, float currentFrame){return null;}
	
	@Override
	public int getKeyFramePosition(KeyFrame keyFrame) {return -1;}
	
	/** Write the actual behaviour of this custom animation here. It will called every tick until the animation is active. */
	public void update(HashMap<String, MCAModelRenderer> parts, IMCAnimatedEntity entity) {
		//This must be filled in the actual custom channels!
	}
}
