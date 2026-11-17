package X;

/* renamed from: X.EYx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6763EYx {
    public static long A03(long j, long j2) {
        if (((j | j2) & (-71777214294589696L)) != 0) {
            return -1L;
        }
        long j3 = j * 65792;
        long j4 = j2 * 65792;
        long j5 = ((j3 & 4294901760L) << 16) | (j3 & (-281474976710656L)) | (((-281474976710656L) & j4) >>> 32) | ((j4 & 4294901760L) >>> 16);
        long j6 = (j5 - 3472328296227680304L) & (-9187201950435737472L);
        long j7 = (5063812098665367110L + j5) & (-9187201950435737472L);
        long j8 = j5 | 2314885530818453536L;
        long j9 = j8 - 3472328296227680304L;
        if ((j6 | j7) != ((j8 - 7451037802321897319L) & (-9187201950435737472L) & (j8 - (-2242545357980376863L)))) {
            return -1L;
        }
        long j10 = (j7 >>> 7) * 255;
        long j11 = ((j10 ^ (-1)) & j9) | (j9 - (j10 & 2821266740684990247L));
        long j12 = (j11 | (j11 >>> 4)) & 71777214294589695L;
        long j13 = j12 | (j12 >>> 8);
        return (j13 & 65535) | ((j13 >>> 16) & 4294901760L);
    }

    public static int A02(CharSequence charSequence, int i) {
        return A01(charSequence.charAt(i) | (charSequence.charAt(i + 1) << 16) | (charSequence.charAt(i + 2) << 32) | (charSequence.charAt(i + 3) << 48), (charSequence.charAt(i + 7) << 48) | charSequence.charAt(i + 4) | (charSequence.charAt(i + 5) << 16) | (charSequence.charAt(i + 6) << 32));
    }

    public static int A00(long j) {
        long j2 = j - 13511005043687472L;
        if ((((j + 19703549022044230L) | j2) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j2 * 281475406208040961L) >>> 48);
    }

    public static int A01(long j, long j2) {
        long j3 = j - 13511005043687472L;
        long j4 = j2 - 13511005043687472L;
        if ((((j + 19703549022044230L) | j3 | (j2 + 19703549022044230L) | j4) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return ((int) ((j4 * 281475406208040961L) >>> 48)) + (((int) ((j3 * 281475406208040961L) >>> 48)) * 10000);
    }
}
