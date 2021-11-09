room_list = []
# room = []
room = ["You are in a smelly room, You see another room to the north, and a hallway to the east.",3,1,None,None]
room_list.append(room)
room = ["South Hall",4,2,None,0]
room_list.append(room)
room = ["Dining Room",5,None,None,1]
room_list.append(room)
room = ["Bedrooom 1",None,4,0,None]
room_list.append(room)
room = ["North Hall", 6,5,1,3]
room_list.append(room)
room = ["Kitchen",None,None,2,4]
room_list.append(room)
room = ["Balcony", None,None,4,1]
room_list.append(room)

current_room = 0

done = False
next_room = ""

while not done:
  print(room_list[current_room][0])
  direction = input("What do you want to do? ")
  if direction == "n":
    next_room = room_list[current_room][1]
  elif direction == "e":
    next_room = room_list[current_room][2]
  elif direction == "s":
    next_room = room_list[current_room][3]
  elif direction == "w":
    next_room = room_list[current_room][4]
  else:
    print()
    print("I don't understand.")
  if next_room == None:
    print("You can't go that way!")
  else:
    current_room = next_room
