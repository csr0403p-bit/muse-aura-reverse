package X;

/* renamed from: X.DeD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5248DeD extends AbstractC5263DeS implements InterfaceC5265DeU {
    public final /* synthetic */ AbstractC5257DeM A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5248DeD(AbstractC5257DeM abstractC5257DeM) {
        super(abstractC5257DeM);
        this.A00 = abstractC5257DeM;
    }

    @Override // X.InterfaceC5266DeV
    public final C5247DeC AAl() {
        C5247DeC c5247DeCAGU = this.A00.AGU();
        c5247DeCAGU.A00.add(this);
        return c5247DeCAGU;
    }

    @Override // X.InterfaceC5266DeV
    public final void ABA(Object obj) {
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.inject.InjectorThreadStack");
        ((C5247DeC) obj).A00();
    }
}
