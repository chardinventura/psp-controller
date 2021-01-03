package com.chardin.pspcontroller;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class Controles {

	private char keyState[];
	private Robot robot;

	final int UP_INDEX = 1;
	final int DOWN_INDEX = 2;
	final int LEFT_INDEX = 3;
	final int RIGHT_INDEX = 4;
	final int SQUARE_INDEX = 5;
	final int CIRCLE_INDEX = 6;
	final int CROSS_INDEX = 7;
	final int TRIANGLE_INDEX = 8;
	final int LTRIGGER_INDEX = 9;
	final int RTRIGGER_INDEX = 10;
	final int START_INDEX = 11;
	final int DANALOG_INDEX = 12;
	final int UANALOG_INDEX = 13;
	final int RANALOG_INDEX = 14;
	final int LANALOG_INDEX = 15;
	final int SELECT_INDEX = 16;

	public Controles() throws AWTException {

		robot = new Robot();

		keyState = new char[17];
		Arrays.fill(keyState, '0');
	}

	public void simularKeys(char[] keys) {

		if(keys.length != 17) {

			System.out.println("Error, key no reconocida.");
			return;
		}

		/*int[][] keysRelationals = {
				{UP_INDEX, KeyEvent.VK_UP},
				{DOWN_INDEX, KeyEvent.VK_DOWN},
				{LEFT_INDEX, KeyEvent.VK_LEFT},
				{RIGHT_INDEX, KeyEvent.VK_RIGHT},
				{TRIANGLE_INDEX, KeyEvent.VK_U},
				{CROSS_INDEX, KeyEvent.VK_I},
				{SQUARE_INDEX, KeyEvent.VK_O},
				{CIRCLE_INDEX, KeyEvent.VK_P},
				{UANALOG_INDEX, KeyEvent.VK_W},
				{DANALOG_INDEX, KeyEvent.VK_S},
				{LANALOG_INDEX, KeyEvent.VK_A},
				{RANALOG_INDEX, KeyEvent.VK_D},
				{LTRIGGER_INDEX, KeyEvent.VK_K},
				{RTRIGGER_INDEX, KeyEvent.VK_L},
				{SELECT_INDEX, KeyEvent.VK_SPACE},
				{START_INDEX, KeyEvent.VK_ENTER}
		};

		for (int i = 0; i < keysRelationals.length; i++)
			simularKey(keys, keysRelationals[i][0], keysRelationals[i][1]);*/

		simularKey(keys, UP_INDEX, KeyEvent.VK_UP);
		simularKey(keys, DOWN_INDEX, KeyEvent.VK_DOWN);
		simularKey(keys, LEFT_INDEX, KeyEvent.VK_LEFT);
		simularKey(keys, RIGHT_INDEX, KeyEvent.VK_RIGHT);
		simularKey(keys, SQUARE_INDEX, KeyEvent.VK_U);
		simularKey(keys, CIRCLE_INDEX, KeyEvent.VK_I);
		simularKey(keys, CROSS_INDEX, KeyEvent.VK_O);
		simularKey(keys, TRIANGLE_INDEX, KeyEvent.VK_P);
		simularKey(keys, LTRIGGER_INDEX, KeyEvent.VK_K);
		simularKey(keys, RTRIGGER_INDEX, KeyEvent.VK_L);
		simularKey(keys, START_INDEX, KeyEvent.VK_ENTER);
		simularKey(keys, DANALOG_INDEX, KeyEvent.VK_S);
		simularKey(keys, UANALOG_INDEX, KeyEvent.VK_W);
		simularKey(keys, RANALOG_INDEX, KeyEvent.VK_D);
		simularKey(keys, LANALOG_INDEX, KeyEvent.VK_A);
		simularKey(keys, SELECT_INDEX, KeyEvent.VK_SPACE);
	}

	private void simularKey(char[] keys , int KEY_INDEX, int KEY_CODE) {

		if(keys[KEY_INDEX] == '1') {
			if(keyState[KEY_INDEX] == '0') {
				robot.keyPress(KEY_CODE);
				keyState[KEY_INDEX] = '1';
			}
		}else {
			if(keyState[KEY_INDEX] == '1') {
				robot.keyRelease(KEY_CODE);
				keyState[KEY_INDEX] = '0';
			}
		}
	}
}
