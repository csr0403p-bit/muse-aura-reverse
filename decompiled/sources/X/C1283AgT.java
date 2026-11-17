package X;

/* renamed from: X.AgT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1283AgT implements C3MW {
    @Override // X.C3MW
    public final float calculateScrollDistance(float f, float f2, float f3) {
        float fA01 = C8j3.A01(f2 + f, f);
        float f4 = (0.3f * f3) - (0.0f * fA01);
        float f5 = f3 - f4;
        if ((fA01 <= f3) && f5 < fA01) {
            f4 = f3 - fA01;
        }
        return f - f4;
    }
}
