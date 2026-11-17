package X;

/* loaded from: classes6.dex */
public final class FHP implements InterfaceC8011FPi {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ HsM A01;

    public FHP(HsM hsM, F6D f6d) {
        this.A01 = hsM;
        this.A00 = f6d;
    }

    @Override // X.InterfaceC8011FPi
    public final void run(int i) {
        F6D f6d;
        HsM hsM = this.A01;
        if (hsM == null || (f6d = this.A00) == null) {
            return;
        }
        AbstractC7691FAk.A02(f6d, C9115Fyg.A00(), hsM, f6d.A02, 0);
    }
}
