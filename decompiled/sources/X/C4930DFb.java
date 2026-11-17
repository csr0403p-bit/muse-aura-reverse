package X;

/* renamed from: X.DFb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4930DFb implements DFz {
    public CIA A00;
    public C4931DFd A01;
    public String A02;
    public boolean A03;
    public final InterfaceC4936DFr A04;
    public final AbstractC4937DFs A05;
    public final CI8 A06;

    private synchronized void A00() {
        this.A04.Ag9(this.A00);
    }

    private synchronized void A01() {
        if (!this.A03) {
            throw C3cG.A0Q("SessionDelegate should have called bootstrapIfNeeded");
        }
    }

    public static void A02(C4930DFb c4930DFb) {
        c4930DFb.A02 = c4930DFb.A06.provideSessionId();
        c4930DFb.A03(null);
        c4930DFb.A00();
    }

    private void A03(Boolean bool) {
        boolean zEquals = Boolean.TRUE.equals(bool);
        C4931DFd c4931DFd = this.A01;
        String str = this.A02;
        this.A00 = zEquals ? new CIA(c4931DFd, str, true) : new CIA(c4931DFd, str);
    }

    public C4930DFb(InterfaceC4936DFr interfaceC4936DFr, AbstractC4937DFs abstractC4937DFs, CI8 ci8) {
        this.A05 = abstractC4937DFs;
        this.A04 = interfaceC4936DFr;
        this.A06 = ci8;
    }

    @Override // X.DFz
    public final void clientModeStateChanged() {
        A01();
        A00();
    }

    @Override // X.DFz
    public final void onBackground() {
        A01();
        this.A02 = this.A06.provideSessionId();
        A03(AnonymousClass001.A0i());
        A00();
    }

    @Override // X.DFz
    public final void onForeground() {
        A01();
        A02(this);
    }

    @Override // X.DFz
    public final void userConsentChanged() {
        A01();
        A00();
    }

    @Override // X.DFz
    public final void userLogin(C4931DFd c4931DFd) {
        A01();
        this.A01 = c4931DFd;
        A02(this);
    }

    @Override // X.DFz
    public final void userLogout() {
        A01();
        this.A04.ART(this.A01);
        this.A01 = null;
        A02(this);
    }
}
