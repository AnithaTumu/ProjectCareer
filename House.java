package com.re.housing;

public class House {
	private int length, breadth, roomCount;
	private String color;
	private Rooms[] rooms;
	private String testCommit1;
	
	public void setLength(int length)
	{
		this.length = length;
	}
	public int getLength()
	{
		return this.length;
	}
	public void setBreadth(int breadth)
	{
		this.breadth = breadth;
	}
	public int getBreadth()
	{
		return this.breadth;
	}
	public int getRoomCount()
	{
		return this.roomCount;
	}
	public void setRoomCount(int roomCount)
	{
		if(roomCount <= 0 )
		{
			this.roomCount = 3;
		}
		else
		{
			this.roomCount = roomCount;
		}
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String geColor()
	{
		return this.color;
	}
	public void setRooms(Rooms[] rooms)
	{
		this.rooms = rooms;
	}
	public Rooms[] getRooms()
	{
		return this.rooms;
	}			
	public String getHouseDescription()
	{
		String roomsDescription = "";
		
		for(int i=0; i < roomCount;i++)
		{
			roomsDescription = roomsDescription + rooms[i].getRoomDescription() + "\n";
		}
		return "This is a " + color + " house with area " + length * breadth + "sqft with \n" + roomsDescription;
	}
	
}


