package X;

/* renamed from: X.DYl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5109DYl<T> implements CQG<F1G<T>> {
    public boolean A00;

    @Override // X.CQG
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final synchronized void onSuccess(F1G<T> f1g) {
        C7384Etj.A0Y(f1g, 0);
        if (!this.A00) {
            this.A00 = true;
            if (this instanceof C5108DYi) {
                ((C5108DYi) this).A00.set(f1g);
            } else {
                DYg dYg = (DYg) this;
                dYg.A01.resumeWith(new F3D(f1g));
                InterfaceC5106DYe interfaceC5106DYe = (InterfaceC5106DYe) C8j3.A10(dYg.A00);
                if (interfaceC5106DYe != null) {
                    interfaceC5106DYe.cancel();
                }
            }
        }
    }

    @Override // X.CQG
    public final synchronized void onFailure(Throwable th) {
        C7384Etj.A0Y(th, 0);
        if (!this.A00) {
            this.A00 = true;
            if (this instanceof C5108DYi) {
                ((C5108DYi) this).A00.setException(th);
            } else {
                DYg dYg = (DYg) this;
                dYg.A01.resumeWith(new C7541F0t(th));
                InterfaceC5106DYe interfaceC5106DYe = (InterfaceC5106DYe) C8j3.A10(dYg.A00);
                if (interfaceC5106DYe != null) {
                    interfaceC5106DYe.cancel();
                }
            }
        }
    }
}
