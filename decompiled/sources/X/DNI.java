package X;

/* loaded from: classes5.dex */
public abstract class DNI {
    public static int A00(double expectedEntries, int loadFactor) {
        int iMax = Math.max(loadFactor, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (expectedEntries * iHighestOneBit))) {
            return iHighestOneBit;
        }
        int i = iHighestOneBit << 1;
        if (i <= 0) {
            return 1073741824;
        }
        return i;
    }

    public static int A01(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
