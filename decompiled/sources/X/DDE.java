package X;

/* loaded from: classes5.dex */
public final class DDE implements DFz, CI8 {
    public static DDE A04;
    public int A00;
    public CIB A01;
    public String A02;
    public boolean A03;

    @Override // X.DFz
    public final /* synthetic */ void clientModeStateChanged() {
    }

    @Override // X.DFz
    public final synchronized void onBackground() {
        this.A00++;
        this.A01 = CIB.BACKGROUND;
    }

    @Override // X.DFz
    public final synchronized void onForeground() {
        this.A00++;
        this.A01 = CIB.FOREGROUND;
    }

    @Override // X.DFz
    public final void userConsentChanged() {
    }

    @Override // X.DFz
    public final synchronized void userLogin(C4931DFd c4931DFd) {
        if (this.A03) {
            this.A00++;
        }
    }

    @Override // X.DFz
    public final void userLogout() {
    }

    @Override // X.CI8
    public final synchronized String provideSessionId() {
        StringBuilder sbA0x;
        sbA0x = C60O.A0x("UFS-");
        sbA0x.append(this.A02);
        sbA0x.append("-");
        sbA0x.append(this.A01.mValue);
        sbA0x.append("-");
        return BV4.A0l(sbA0x, this.A00);
    }
}
