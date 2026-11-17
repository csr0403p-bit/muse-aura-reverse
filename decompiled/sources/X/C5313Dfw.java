package X;

/* renamed from: X.Dfw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5313Dfw {
    public EnumC10573Huf A00;
    public Dg3 A01;

    public final void A00(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        EnumC10573Huf enumC10573HufA01 = enumC3085Bxl.A01();
        EnumC10573Huf enumC10573Huf = this.A00;
        C7384Etj.A0Y(enumC10573Huf, 0);
        if (enumC10573HufA01.compareTo(enumC10573Huf) < 0) {
            enumC10573Huf = enumC10573HufA01;
        }
        this.A00 = enumC10573Huf;
        this.A01.onStateChanged(c1hy, enumC3085Bxl);
        this.A00 = enumC10573HufA01;
    }
}
