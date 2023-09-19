package com.re.housing;

public class HouseDetails {

	
		public static void main(String[] args) {
			House home = new House();	
			home.setLength(50);
			home.setBreadth(50);
			home.setColor("Milky White");
			home.setRoomCount(3);
			Rooms[] rooms = new Rooms[home.getRoomCount()];
			for(int i=0; i < home.getRoomCount();i++)
			{
				if(i==0)
				{
					rooms[i] = new Rooms("Bed Room", "Sky Blue");					
				}
				else if(i==1)
				{
					rooms[i] = new Rooms("Hall", "Cream");							
				}
				else if(i==2)
				{
					rooms[i] = new Rooms("Kitchen", "White");							
				}
			}
			home.setRooms(rooms);												
			System.out.println("Your House Details:\n" + home.getHouseDescription() + "\n");
	}

}
