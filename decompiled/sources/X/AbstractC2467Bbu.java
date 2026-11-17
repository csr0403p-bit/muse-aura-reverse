package X;

/* renamed from: X.Bbu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2467Bbu {
    public static int A00(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw BV5.A0Q("Unsupported surface rotation: ", i);
    }

    public static int A01(int i, int i2, boolean z) {
        int i3 = i2 + i;
        if (z) {
            i3 = (i2 - i) + 360;
        }
        int i4 = i3 % 360;
        if (AbstractC2875Bni.A08("CameraOrientationUtil", 2)) {
            AbstractC2875Bni.A07("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", "CameraOrientationUtil", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i4)});
        }
        return i4;
    }
}
