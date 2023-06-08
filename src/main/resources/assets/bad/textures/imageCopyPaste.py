# import OS
import os
from PIL import Image

shelf = Image.open("000GLAYER.png").convert("RGBA")

for x in os.listdir('block'):
    if x.endswith(".png"):
        # Prints only png file present in My Folder
        # print(x)
        temp = Image.open(r'block/' + x).convert("RGBA")
        temp.paste(shelf, (0, 0), shelf)
        temp.save(r'block/' + x)
