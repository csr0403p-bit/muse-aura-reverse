package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class BMc<T> implements InterfaceC1370Ahw<T> {
    public T A00;
    public final T A01;
    public final ArrayList<T> A02 = C3cG.A0h();

    public void A00() {
        ((C1453AjM) this.A01).A0O();
    }

    @Override // X.InterfaceC1370Ahw
    public final /* synthetic */ void A4R(Object obj, G0V g0v) {
        g0v.invoke(this.A00, obj);
    }

    @Override // X.InterfaceC1370Ahw
    public final void A9B(T t) {
        this.A02.add(this.A00);
        this.A00 = t;
    }

    @Override // X.InterfaceC1370Ahw
    public final T AEN() {
        return this.A00;
    }

    @Override // X.InterfaceC1370Ahw
    public /* synthetic */ void ASy() {
    }

    @Override // X.InterfaceC1370Ahw
    public final /* synthetic */ void Abn() {
        BKv bKv;
        if (this instanceof C1376Ai2) {
            ((C1453AjM) this.A00).AVb();
            return;
        }
        T t = this.A00;
        if (!(t instanceof BKv) || (bKv = (BKv) t) == null) {
            return;
        }
        bKv.AVb();
    }

    @Override // X.InterfaceC1370Ahw
    public final void Ahp() {
        this.A00 = this.A02.remove(r1.size() - 1);
    }

    @Override // X.InterfaceC1370Ahw
    public final void clear() {
        this.A02.clear();
        this.A00 = this.A01;
        A00();
    }

    public BMc(T t) {
        this.A01 = t;
        this.A00 = t;
    }
}
