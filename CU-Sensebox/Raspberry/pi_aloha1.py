from raspi_lora import LoRa, ModemConfig
import random
import time
global ack

# This is our callback function that runs when a message is received
def on_recv(payload):
    print("From:", payload.header_from)
    print("Received:", payload.message)
    msg = payload.message
    if msg == "ack"
        ack = 1

#The selected SPI channel is 0, The selected interrupt pin is GPIO17
lora = LoRa(0, 17, 2, freq=868, modem_config=ModemConfig.Bw125Cr45Sf128, tx_power=14, acks=False)

lora.on_recv = on_recv

while True:
    if  flag == 1:  #flag will always be activated in the code outside this cycle when there is a message to be sent
      do
          send_to_wait("teste", 255, header_flags=0)
          flag = 0
        t1 = #greater than the round-trip delay
        time.sleep(t1)

        if ack = 1:
            ack = 0
            break
        rt = random.random() #returns a random foating point number from 0 to 1
        k = #range that we want our random number to be choosen from
        rt1 = k*rt
        time.sleep(rt1)
      while ack == 0

# And remember to call this as your program exits...
lora.close()
