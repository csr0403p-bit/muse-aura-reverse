package X;

/* loaded from: classes5.dex */
public final class E6W {
    public final int A00;
    public final C5735DoU A01;
    public final Object A02;
    public final C5951Dsl[] A03;
    public final InterfaceC5441Dic[] A04;

    public final boolean A00(E6W e6w, int i) {
        return e6w != null && C6xC.A00(this.A03[i], e6w.A03[i]) && C6xC.A00(this.A04[i], e6w.A04[i]);
    }

    public E6W(C5735DoU c5735DoU, Object obj, C5951Dsl[] c5951DslArr, InterfaceC5441Dic[] interfaceC5441DicArr) {
        this.A03 = c5951DslArr;
        this.A04 = (InterfaceC5441Dic[]) interfaceC5441DicArr.clone();
        this.A01 = c5735DoU;
        this.A02 = obj;
        this.A00 = c5951DslArr.length;
    }
}
