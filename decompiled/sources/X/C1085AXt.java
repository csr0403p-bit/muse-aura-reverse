package X;

/* renamed from: X.AXt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1085AXt {
    public AXs A00;
    public Integer A01;

    public final void A00() {
        HoC hoC;
        AXs aXs = this.A00;
        if (aXs == null || (hoC = aXs.A04) == null) {
            return;
        }
        hoC.A5w(null);
        aXs.A04 = null;
    }

    public final void A01() {
        Object objA01;
        if (this.A01 == C79.A00) {
            throw C3cG.A0Q("ToolbarRequester is not initialized.");
        }
        AXs aXs = this.A00;
        if (aXs == null || !aXs.isAttached) {
            return;
        }
        HoC hoC = aXs.A04;
        if ((hoC == null || !hoC.isActive()) && (objA01 = ARZ.A01(AbstractC1087AXv.A01, aXs)) != null) {
            aXs.A04 = GAo.A02(C79.A0K, C6ys.A00, new BUC(aXs, (HtJ) null, objA01, (HtJ<? super BUC>) 18), aXs.getCoroutineScope());
        }
    }

    public C1085AXt(int i) {
        this.A01 = C79.A00;
    }

    public C1085AXt() {
        this(0);
    }
}
