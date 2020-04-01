from raspi_lora import LoRa, ModemConfig
import time
global msg
# This is our callback function that runs when a message is received
def on_recv(payload): #como é que função sabe se foi recebida mensagem?
    global msg
    print("From:", payload.header_from)
    print("Received:", payload.message)
    print("RSSI: {}; SNR: {}".format(payload.rssi, payload.snr)) # desnecessário?
    msg = payload.message

# Use chip select 0. GPIO pin 17 will be used for interrupts
# The address of this device will be set to 2
lora = LoRa(0, 17, 2, freq=868, modem_config=ModemConfig.Bw125Cr45Sf128, tx_power=14, acks=False)

lora.on_recv = on_recv
buffer = []
buffer.append(msg) # a partir daqui envia para aplicação e base de dados


while True:
    send_to_wait("teste", 255, header_flags=0)
    time.sleep(2)

# And remember to call this as your program exits...
lora.close()
