package X;

/* renamed from: X.9nm, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9nm implements C1HY {
    public EnumC10573Huf A00;
    public EnumC10573Huf A01;
    public final C5303Dfm A02 = new C5303Dfm(this, true);

    public static final void A00(C9nm c9nm) {
        EnumC10573Huf enumC10573Huf = c9nm.A01;
        int iOrdinal = enumC10573Huf.ordinal();
        EnumC10573Huf enumC10573Huf2 = c9nm.A00;
        if (iOrdinal < enumC10573Huf2.ordinal()) {
            enumC10573Huf2 = enumC10573Huf;
        }
        C5303Dfm c5303Dfm = c9nm.A02;
        if (c5303Dfm.A01 == EnumC10573Huf.A04 && enumC10573Huf2 == EnumC10573Huf.A03) {
            return;
        }
        c5303Dfm.A07(enumC10573Huf2);
    }

    @Override // X.C1HY
    public final /* bridge */ /* synthetic */ F2N getLifecycle() {
        return this.A02;
    }

    public C9nm() {
        EnumC10573Huf enumC10573Huf = EnumC10573Huf.A04;
        this.A01 = enumC10573Huf;
        this.A00 = enumC10573Huf;
    }
}
