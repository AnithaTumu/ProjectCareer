package com.re.housing;

public class Rooms {
	//This class is for individual room;
	private String roomType, roomColor;
	
	public Rooms(String roomType, String roomColor)
	{
			this.roomType = roomType;
			this.roomColor = roomColor;
		
	}
	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}
	public String getRoomType()
	{
		return this.roomType;
	}
	public void setRoomColor(String roomColor)
	{
		this.roomColor = roomColor;
	}
	public String getRoomColor()
	{
		return this.roomColor;
	}
	public String getRoomDescription()
	{
		return "A " + roomType + " in " + roomColor + " color\n";
	}

}
