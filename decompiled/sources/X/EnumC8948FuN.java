package X;

/* renamed from: X.FuN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC8948FuN implements GIT {
    /* JADX INFO: Fake field, exist only in values array */
    EF5("RECEIVER_EVENT_UNSPECIFIED"),
    A01("REGISTER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("SEND"),
    A02("RECEIVE");

    public final int a;

    @Override // X.GIT
    public final int A2f() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<");
        AbstractC7611F5y.A0o(EnumC8948FuN.class, this, sbA0x);
        AbstractC7611F5y.A0p(this, sbA0x, this.a);
        return sbA0x.toString();
    }

    EnumC8948FuN(String str) {
        this.a = i;
    }
}
