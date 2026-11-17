package X;

/* renamed from: X.FuO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC8949FuO implements GIT {
    A01("FAILURE_REASON_UNSPECIFIED"),
    A02("REGISTER_METHOD_NOT_SUPPORTED");

    public final int a;

    @Override // X.GIT
    public final int A2f() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<");
        AbstractC7611F5y.A0o(EnumC8949FuO.class, this, sbA0x);
        AbstractC7611F5y.A0p(this, sbA0x, this.a);
        return sbA0x.toString();
    }

    EnumC8949FuO(String str) {
        this.a = i;
    }
}
