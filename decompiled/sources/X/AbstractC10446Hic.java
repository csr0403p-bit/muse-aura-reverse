package X;

/* renamed from: X.Hic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10446Hic {
    public static final float A00 = (float) Math.sqrt(5.0d);

    public static final Float A00(FBB fbb, Object obj, String str) {
        if (obj instanceof Number) {
            return Float.valueOf(AnonymousClass001.A02(obj));
        }
        FFI.A01(fbb, FGI.A0d("Expected Number for ", str, " but got ", C3cI.A0Y(obj)), null);
        return null;
    }
}
