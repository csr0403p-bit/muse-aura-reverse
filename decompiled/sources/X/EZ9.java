package X;

import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EZ9 extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EZ9(InterfaceC5107DYf interfaceC5107DYf, InterfaceC5107DYf interfaceC5107DYf2, DYI<T> dyi, Executor executor, HtJ<? super EZ9> htJ) {
        super(2, executor);
        this.$t = htJ;
        this.A04 = interfaceC5107DYf;
        this.A03 = interfaceC5107DYf2;
        this.A02 = dyi;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        EZ9 ez9 = new EZ9((InterfaceC5107DYf) this.A04, (DYI) this.A03, (Executor) this.A02, htJ, this.$t != 0 ? 1 : 0);
        ez9.A01 = obj;
        return ez9;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003f A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r1 = r8.$t
            java.lang.Object r7 = r8.A01
            X.HyO r7 = (X.HyO) r7
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r8.A00
            r5 = 1
            if (r1 == 0) goto L40
            if (r0 != 0) goto L61
            X.Hwg.A00(r9)
            java.lang.Object r4 = r8.A04
            X.DYf r4 = (X.InterfaceC5107DYf) r4
            java.lang.Object r3 = r8.A03
            X.DYI r3 = (X.DYI) r3
            r0 = 3
            X.E8f r2 = new X.E8f
            r2.<init>(r7, r0)
            X.F57 r1 = new X.F57
            r1.<init>(r7, r0)
            java.lang.Object r0 = r8.A02
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            X.DYe r2 = r4.executeAndSubscribe(r3, r2, r1, r0)
            r0 = 8
        L2f:
            X.EWq r1 = new X.EWq
            r1.<init>(r2, r0)
            r0 = 0
            r8.A01 = r0
            r8.A00 = r5
            java.lang.Object r0 = X.C8fm.A00(r8, r1, r7)
            if (r0 != r6) goto L64
            return r6
        L40:
            if (r0 != 0) goto L61
            X.Hwg.A00(r9)
            java.lang.Object r4 = r8.A04
            X.DYf r4 = (X.InterfaceC5107DYf) r4
            java.lang.Object r3 = r8.A03
            X.DYI r3 = (X.DYI) r3
            X.E8f r2 = new X.E8f
            r2.<init>(r7, r5)
            X.F57 r1 = new X.F57
            r1.<init>(r7, r5)
            java.lang.Object r0 = r8.A02
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            X.DYe r2 = r4.execute(r3, r2, r1, r0)
            r0 = 7
            goto L2f
        L61:
            X.Hwg.A00(r9)
        L64:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZ9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EZ9) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
