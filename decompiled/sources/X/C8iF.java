package X;

/* renamed from: X.8iF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iF implements Dg3, C2Kw {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C8iF(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        T tInvoke;
        int i = this.$t;
        Object obj = this.A00;
        C10543Hqv c10543Hqv = (C10543Hqv) this.A01;
        G0U g0u = (G0U) this.A02;
        int iOrdinal = enumC3085Bxl.ordinal();
        if (i != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
                InterfaceC06807bD interfaceC06807bD = (InterfaceC06807bD) c10543Hqv.element;
                if (interfaceC06807bD != null) {
                    interfaceC06807bD.runPauseOrOnDisposeEffect();
                }
                tInvoke = 0;
            }
            tInvoke = g0u.invoke(obj);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 4) {
                    return;
                }
                InterfaceC06817bE interfaceC06817bE = (InterfaceC06817bE) c10543Hqv.element;
                if (interfaceC06817bE != null) {
                    interfaceC06817bE.runStopOrDisposeEffect();
                }
                tInvoke = 0;
            }
            tInvoke = g0u.invoke(obj);
        }
        c10543Hqv.element = tInvoke;
    }
}
