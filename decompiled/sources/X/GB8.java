package X;

/* loaded from: classes6.dex */
public final class GB8 implements HpO {
    public final HsS A00;

    @Override // X.HpO
    public final void invoke(Throwable th) {
        this.A00.dispose();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DisposeOnCancel[");
        sbA0x.append(this.A00);
        return BV5.A0o(sbA0x);
    }

    public GB8(HsS hsS) {
        this.A00 = hsS;
    }
}
