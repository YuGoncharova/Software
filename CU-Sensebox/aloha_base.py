
# tosend_check() return TRUE if there are messages to send and FALSE if there aren't
# send_msg() sends a messages
# received_read() returns the received message

if  tosend_check() == TRUE:
  do
      send_msg()

    time = #greater than the round-trip delay
    delay(time)

    ack = received_read()
    if ack != 0:
      break
    rand_time = random(a,b) # a and b are the time constraints
    delay(rand_time)
  while ack == 0
