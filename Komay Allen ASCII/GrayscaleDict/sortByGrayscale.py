import numpy as np
import matplotlib.pyplot as plt
import skimage

offsetx = 6
offsety = 0
width = 37
height = width*2

X = skimage.io.imread("characters.png")
X = 0.2125*X[:, :, 0] + 0.7154*X[:, :, 1] + 0.0721*X[:, :, 2]

grayscale = []
chars = []
b = 33
plt.figure(figsize=(8, 8))
for c in range(94):
    ch = chr(b)
    chars.append(ch)
    i = height*(c-c%40)/40 + offsety
    j = (c%40)*width + offsetx
    i = int(i)
    j = int(j)
    x = X[i:i+height, j:j+int(width)]
    patch = np.zeros_like(x)
    patch[x < 100] = 1
    
    grayscale.append(np.sum(patch))
    plt.subplot(10, 10, c+1)
    plt.imshow(patch)
    plt.title("%.3g %%"%(grayscale[-1]*100/patch.size))
    plt.axis('off')
    b += 1
grayscale = np.array(grayscale)
plt.tight_layout()
plt.savefig("out.png", bbox_inches='tight')


b = 33
plt.clf()
gmax = np.max(grayscale)
gmin = np.min(grayscale)
idxs = np.argsort(-grayscale)
for plotidx, c in enumerate(idxs):
    ch = chr(b+c)
    print(ch, end='')
    i = height*(c-c%40)/40 + offsety
    j = (c%40)*width + offsetx
    i = int(i)
    j = int(j)
    x = X[i:i+height, j:j+int(width)]
    patch = np.zeros_like(x)
    patch[x < 100] = 1
    plt.subplot(10, 10, plotidx+1)
    plt.imshow(patch, cmap='gray_r')
    plt.title("%.3g %%"%(grayscale[c]*100/patch.size))
    plt.axis('off')
plt.savefig("sorted.png", bbox_inches='tight')

grayscale = 1-(grayscale-gmin)/(gmax-gmin)

print("GRAYSCALE_VALUES = {", end="")
for i, idx in enumerate(idxs):
    print("%.4g"%grayscale[idx], end='')
    if i < idxs.size - 1:
        print(", ", end='')
print("};")
