package HW_6;

public class Block {

    int[] block = new int[3];

    Block (int[] arr) {
        this.block[0] = arr[0];
        this.block[1] = arr[1];
        this.block[2] = arr[2];
     }

    int getWidth() {
        return this.block[0];
    }

    int getLength() {
        return this.block[1];
    }

    int getHeight() {
        return this.block[2];
    }

    int getVolume() {
        return this.getHeight() * this.getLength() * this.getWidth();
    }

    //2(a · b + a · h + b · h)
    int getSurfaceArea() {
        return 2 * (this.getWidth() * this.getLength() + this.getWidth() * this.getHeight() + this.getLength() * this.getHeight());
    }
}
