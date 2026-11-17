package X;

/* JADX INFO: Add missing generic type declarations: [VMResult] */
/* loaded from: classes5.dex */
public final class EVg<VMResult> implements Bs1<VMResult> {
    public final /* synthetic */ EVh A00;
    public final /* synthetic */ C6693EVo A01;

    public EVg(EVh eVh, C6693EVo c6693EVo) {
        this.A01 = c6693EVo;
        this.A00 = eVh;
    }

    @Override // X.Bs1
    public final void onChanged(VMResult vmresult) {
        EVi eVi = this.A00.A02;
        C6693EVo c6693EVo = this.A01;
        C6693EVo c6693EVo2 = new C6693EVo(c6693EVo.A00, vmresult, c6693EVo.A02);
        EVh eVh = eVi.A03;
        if (eVh.A02() != c6693EVo2) {
            eVh.A0A(c6693EVo2);
        }
    }
}
