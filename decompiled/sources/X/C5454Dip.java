package X;

/* renamed from: X.Dip, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5454Dip extends AbstractC5455Diq {
    public final C5375DhR A00;
    public final InterfaceC5564Dkh A01;
    public final String A02;

    @Override // X.AbstractC5455Diq, X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        super.ANb(new C5559Dkc(interfaceC6413E4p, this.A01, this.A02));
    }

    public C5454Dip(InterfaceC5458Dit interfaceC5458Dit, InterfaceC5563Dkg interfaceC5563Dkg, InterfaceC5564Dkh interfaceC5564Dkh, String str) {
        super(interfaceC5458Dit);
        this.A01 = interfaceC5564Dkh;
        this.A02 = str;
        this.A00 = interfaceC5563Dkg instanceof C5375DhR ? (C5375DhR) interfaceC5563Dkg : null;
    }
}
