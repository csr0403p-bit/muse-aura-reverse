package X;

/* loaded from: classes6.dex */
public final class GAp<T> extends GAk<T> {
    public final ThreadLocal<HxE<C78T, Object>> A00;
    public volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect types in method signature: (LX/78T;LX/HtJ<-TT;>;)V */
    public GAp(HtJ htJ, C78T c78t) {
        Hn9 hn9 = Hn9.A00;
        super(htJ, c78t.get(hn9) == null ? c78t.plus(hn9) : c78t);
        this.A00 = new ThreadLocal<>();
        if (htJ.getContext().get(InterfaceC10590Hxd.A00) instanceof GBK) {
            return;
        }
        Object objA00 = GCA.A00(null, c78t);
        GCA.A02(objA00, c78t);
        this.threadLocalIsSet = true;
        this.A00.set(new HxE<>(c78t, objA00));
    }

    @Override // X.GAk, X.GAq
    public final void A0V(Object obj) {
        if (this.threadLocalIsSet) {
            ThreadLocal<HxE<C78T, Object>> threadLocal = this.A00;
            HxE<C78T, Object> hxE = threadLocal.get();
            if (hxE != null) {
                GCA.A02(hxE.second, hxE.first);
            }
            threadLocal.remove();
        }
        HtJ<T> htJ = ((GAk) this).A00;
        if (obj instanceof C10474Hkl) {
            Throwable th = ((C10474Hkl) obj).A00;
            C7384Etj.A0Y(th, 0);
            obj = C3cG.A0s(th);
        }
        C78T context = htJ.getContext();
        Object objA00 = GCA.A00(null, context);
        GAp gApA03 = objA00 != GCA.A00 ? GAr.A03(objA00, htJ, context) : null;
        try {
            htJ.resumeWith(obj);
        } finally {
            if (gApA03 == null || gApA03.A0Y()) {
                GCA.A02(objA00, context);
            }
        }
    }

    @Override // X.GAk
    public final void A0X() {
        if (this.threadLocalIsSet) {
            ThreadLocal<HxE<C78T, Object>> threadLocal = this.A00;
            HxE<C78T, Object> hxE = threadLocal.get();
            if (hxE != null) {
                GCA.A02(hxE.second, hxE.first);
            }
            threadLocal.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0Y() {
        /*
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            if (r0 == 0) goto Ld
            java.lang.ThreadLocal<X.HxE<X.78T, java.lang.Object>> r0 = r2.A00
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 == 0) goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.ThreadLocal<X.HxE<X.78T, java.lang.Object>> r0 = r2.A00
            r0.remove()
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAp.A0Y():boolean");
    }
}
