package X;

/* renamed from: X.2J7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2J7 {
    public static final AaC A00(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return new AaC(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat + Float.intBitsToFloat((int) (j2 >> 32)), fIntBitsToFloat2 + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }
}
