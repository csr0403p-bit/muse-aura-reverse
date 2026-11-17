package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FEB implements InterfaceC7780FEk {
    public C0918AHu<Object, Object> A00;
    public HashMap<Object, Object> A01;
    public final C7765FDs A02;
    public final Context A03;
    public final FBB A04;

    @Override // X.InterfaceC7780FEk
    public final Object AZD(Object obj) {
        C7384Etj.A0Y(obj, 0);
        C0918AHu<Object, Object> c0918AHu = this.A00;
        if (c0918AHu != null) {
            return c0918AHu.A05(obj);
        }
        return null;
    }

    @Override // X.InterfaceC7780FEk
    public final void Aih(Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 0);
        C0918AHu<Object, Object> c0918AHu = this.A00;
        if (c0918AHu == null) {
            C0918AHu c0918AHu2 = AbstractC0977AKq.A00;
            c0918AHu = new C0918AHu<>(6);
            this.A00 = c0918AHu;
        }
        c0918AHu.A0E(obj, obj2);
    }

    @Override // X.InterfaceC7780FEk
    public final Object A88(Object obj) {
        HashMap<Object, Object> map = this.A01;
        if (map != null) {
            return map.get(obj);
        }
        return null;
    }

    @Override // X.InterfaceC7780FEk
    public final Context ACP() {
        return this.A03;
    }

    @Override // X.InterfaceC7780FEk
    public final int AH0() {
        return -1;
    }

    @Override // X.InterfaceC7780FEk
    public final FBB AJW() {
        return this.A04;
    }

    @Override // X.InterfaceC7780FEk
    public final <T> T AYV(Object obj) {
        C7765FDs c7765FDs = this.A02;
        C7384Etj.A0Y(obj, 0);
        T t = (T) c7765FDs.A01.get(obj);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // X.InterfaceC7780FEk
    public final void AYn(Object obj, Object obj2) {
        HashMap<Object, Object> mapA0u = this.A01;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            this.A01 = mapA0u;
        }
        mapA0u.put(obj, obj2);
    }

    public FEB(C7765FDs c7765FDs, FBB fbb) {
        this.A02 = c7765FDs;
        this.A04 = fbb;
        this.A03 = FBB.A00(fbb);
    }
}
