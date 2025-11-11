The Pioneer Plaques are golden plaques placed upon the Pioneer 10 and Pioneer 11 probes, which were some of the first objects sent to interstellar space. Inscribed on the plaques was a series of primitive message to any potential extra-terrestrial life that might encounter the plaques. One of these messages described the distances of the planets around our sun, and the origin of the probe from the 3rd planet (Earth).
<img width="1920" height="1080" alt="lmno fig 1" src="https://github.com/user-attachments/assets/eed0440d-a797-4452-89ec-957658065248" />
The distances here are represented as binary, where "1" represents 10% of the average distance from the Sun to our first planet - Mercury. Therefore, Mercury is assigned 1010 (binary) or 10 (decimal) to show that it is 10x of the 10% distance. However, there is no way for an extra-terrestrial to determine the distance to Mercury, so they would not be able to decipher the 10% of any of the planetary distances.
<img width="1920" height="1080" alt="lmno fig 2" src="https://github.com/user-attachments/assets/fca519f8-0db4-4eaa-83eb-d44d0695ebb7" />
The use of this 10% value seems odd, especially since the plaque already established a unit - the hyperfine transition of Hydrogen. Hydrogen is one of the most abundant elements in the universe, and this wavelength would commonly be observed on absorption spectra. Thus, a unit of distance can be derived from Hydrogen, as roughly 21.106cm. This is as good as it gets for a universal yard stick in the universe.
<img width="1920" height="1080" alt="lmno fig 3" src="https://github.com/user-attachments/assets/26649a4d-ea5c-47e8-a432-a5b0ce528aaa" />

So what would these planetary distances ACTUALLY look like, using the hyperfine transition of Hydrogen as the base unit, of 21.106cm?
I wrote a Java program to convert distances into binary with this base unit.

The results were as follows:
```
MERCURY 0000000111100101011000100000101001001111001110
VENUS   0000001110110111100111011000100100111010001110
EARTH   0000010100011100001111010100111010011101010100
MARS    0000011110111111111110110001011101101101101010
JUPITER 0001101011000010111101011100000111101011110110
SATURN  0011000100101001100010100000010110111011000100
NEPTUNE 1001101000011100110011110110111111011101110110
```
Is this binary too verbose for the golden plaques? I suspect it could have fit, if the planets were presented vertically instead of horizontally.
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/69fcf9a2-ffbf-4720-912b-a914e7d7d1f1" />
