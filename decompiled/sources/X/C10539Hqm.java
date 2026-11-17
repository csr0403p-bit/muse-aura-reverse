package X;

/* renamed from: X.Hqm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10539Hqm {
    public static final C10539Hqm A02 = new C10539Hqm(C79.A0C, 1.0E21f);
    public final float A00;
    public final Integer A01;

    public final String toString() {
        int iIntValue = this.A01.intValue();
        if (iIntValue == 0) {
            return String.valueOf(this.A00);
        }
        if (iIntValue != 1) {
            return "auto";
        }
        float f = this.A00;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(f);
        return AnonymousClass001.A0v("%", sbA0w);
    }

    public C10539Hqm(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
