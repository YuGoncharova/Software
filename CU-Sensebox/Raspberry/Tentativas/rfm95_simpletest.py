#To install the library for the display, enter the following into the terminal:

#sudo pip3 install adafruit-circuitpython-ssd1306

#You'll also need to install the framebuf module in order to write to the display.

#sudo pip3 install adafruit-circuitpython-framebuf

#To install the library for the RFM9x Module, enter the following into the terminal:

#sudo pip3 install adafruit-circuitpython-rfm9x
import time
import busio
from digitalio import DigitalInOut, Direction, Pull
import board
# Import the SSD1306 module.
import adafruit_ssd1306
# Import the RFM9x radio module.
import adafruit_rfm9x
# Define radio parameters.
RADIO_FREQ_MHZ = 868


# Create the I2C interface.
i2c = busio.I2C(board.SCL, board.SDA)
# Configure RFM9x LoRa Radio
CS = DigitalInOut(board.CE1)
RESET = DigitalInOut(board.RESET)   # tinha D25
# Initialize SPI bus.
spi = busio.SPI(board.SCK, MOSI=board.MOSI, MISO=board.MISO)

# Initialze RFM radio
rfm9x = adafruit_rfm9x.RFM9x(spi, CS, RESET, RADIO_FREQ_MHZ)

rfm9x.send(bytes("É desta que vai!\r\n","utf-8"))
print('Sent Hello World message!')
print('Waiting for packets...')

while True:
    packet = rfm9x.receive()
    # Para mudar o timeout descomentar a linha a baixo
    #packet = rfm9x.receive(timeout=5.0)
    # If no packet was received during the timeout then None is returned.
    if packet is None:
        # Packet has not been received
        print('Received nothing! Listening again...')
    else:
        # Received a packet!
        # Print out the raw bytes of the packet:
        print('Received (raw bytes): {0}'.format(packet))
        # And decode to ASCII text and print it too.  Note that you always
        # receive raw bytes and need to convert to a text format like ASCII
        # if you intend to do string processing on your data.  Make sure the
        # sending side is sending ASCII data before you try to decode!
        packet_text = str(packet, 'ascii')
        print('Received (ASCII): {0}'.format(packet_text))
