package X;

/* loaded from: classes6.dex */
public enum Huo implements InterfaceC2571Be0<Long> {
    STANDARD_IAP(0),
    APPLE_PB(1),
    APPLE_ACA(2),
    GOOGLE_GDC(3);

    public final long mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ Long getValue() {
        return Long.valueOf(this.mValue);
    }

    Huo(long j) {
        this.mValue = j;
    }
}
