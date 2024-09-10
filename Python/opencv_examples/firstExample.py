import sys
import cv2 as cv

import matplotlib.pyplot as plt
# Load image
img = cv.imread(cv.samples.findFile("fruits.jpg"))

if img is None:
    sys.exit("Could not read the image.")

cv.imshow("Display window", img)
k = cv.waitKey(0)

if k == ord("s"):
    cv.imwrite("starry_night.png", img)

# load image
img = cv.imread(cv.samples.findFile('starry_night.jpg'))
# convert to gray scale
img_gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
# instantiate SURF
surf = cv.xfeatures2d.SURF_create(7000)
# compute key points
kp = surf.detect(img_gray, None)
# plot key points
plt.imshow(cv.drawKeypoints(cv.cvtColor(img, cv.COLOR_BGR2RGB), kp, None, (0,255,0), 4))
plt.show()