package com.bmpl.javabasic;

public interface Game {

	final int PLAYERMINLIFE = 1;
	final int PLAYERMAXLIFE = 10;

	
	public abstract void playerWalk();
	
	void playerIdle();
	
	void playerJump();
	
	void playerAttack();
	
	void playerRun();
	
	void playerDead();
	
}
