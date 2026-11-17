package X;

/* loaded from: classes4.dex */
public final /* synthetic */ class Ap5 implements InterfaceC2349BUy, InterfaceC1664Ann {
    public final /* synthetic */ BBV A00;

    public Ap5(BBV bbv) {
        this.A00 = bbv;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1664Ann) && (obj instanceof InterfaceC2349BUy)) {
            return C7384Etj.areEqual(getFunctionDelegate(), ((InterfaceC2349BUy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(1, this.A00, BBV.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
