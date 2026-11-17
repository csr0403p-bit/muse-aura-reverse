package X;

/* renamed from: X.Ef8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7061Ef8 extends AbstractC7260Ejk {
    public final /* synthetic */ AbstractC7043Eep A00;

    @Override // X.AbstractC7260Ejk
    public final void onCancellationRequested() {
    }

    public C7061Ef8(AbstractC7043Eep abstractC7043Eep) {
        this.A00 = abstractC7043Eep;
    }

    @Override // X.AbstractC7260Ejk
    public final void onIsIntermediateResultExpectedChanged() {
        AbstractC7043Eep abstractC7043Eep = this.A00;
        InterfaceC7029Eea interfaceC7029Eea = abstractC7043Eep.A04;
        if (interfaceC7029Eea.AOc()) {
            interfaceC7029Eea.AGL();
            C7051Eex.A02(abstractC7043Eep.A03);
        }
    }
}
