package X;

import android.content.Context;

/* renamed from: X.FDq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7763FDq implements InterfaceC7780FEk {
    public final int A00;
    public final Context A01;
    public final C7764FDr<FBB> A02;
    public final FBB A03;

    @Override // X.InterfaceC7780FEk
    public final Object AZD(Object obj) {
        C7384Etj.A0Y(obj, 0);
        C0918AHu<Object, Object> c0918AHu = this.A02.A00().A00;
        if (c0918AHu == null) {
            c0918AHu = AbstractC0977AKq.A00;
        }
        return c0918AHu.A05(obj);
    }

    @Override // X.InterfaceC7780FEk
    public final void Aih(Object obj, Object obj2) {
        int i;
        C7384Etj.A0Y(obj, 0);
        C7749FDb c7749FDbA00 = this.A02.A00();
        C0918AHu<Object, Object> c0918AHu = c7749FDbA00.A00;
        if (c0918AHu == null) {
            C7765FDs c7765FDs = c7749FDbA00.A01;
            if (c7765FDs == null || (i = c7765FDs.A00.A01) <= 0) {
                C0918AHu c0918AHu2 = AbstractC0977AKq.A00;
                i = 6;
            }
            c0918AHu = new C0918AHu<>(i);
        }
        c7749FDbA00.A00 = c0918AHu;
        c0918AHu.A0C(obj, obj2);
    }

    @Override // X.InterfaceC7780FEk
    public final Object A88(Object obj) {
        return this.A02.A00().A02.get(obj);
    }

    @Override // X.InterfaceC7780FEk
    public final Context ACP() {
        return this.A01;
    }

    @Override // X.InterfaceC7780FEk
    public final int AH0() {
        return this.A00;
    }

    @Override // X.InterfaceC7780FEk
    public final FBB AJW() {
        return this.A03;
    }

    @Override // X.InterfaceC7780FEk
    public final <T> T AYV(Object obj) {
        return (T) this.A02.A00().A00(obj);
    }

    @Override // X.InterfaceC7780FEk
    public final void AYn(Object obj, Object obj2) {
        C7749FDb c7749FDbA00 = this.A02.A00();
        C7384Etj.A0Y(obj, 0);
        c7749FDbA00.A02.put(obj, obj2);
    }

    public C7763FDq(C7764FDr<FBB> c7764FDr) {
        this.A02 = c7764FDr;
        this.A01 = c7764FDr.A03;
        this.A03 = c7764FDr.A04;
        this.A00 = c7764FDr.A02;
    }
}
