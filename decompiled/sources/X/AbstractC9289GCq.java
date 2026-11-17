package X;

import X.AbstractC9293GCv;
import kotlin.Unit;

/* renamed from: X.GCq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9289GCq<S extends AbstractC9293GCv<?>> {
    public int A00;
    public S[] A01;
    public int A02;
    public C9292GCt A03;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:6:0x000a, B:7:0x000c, B:8:0x000e, B:10:0x0012, B:11:0x0018, B:14:0x001e, B:16:0x0029, B:17:0x0034, B:19:0x0039), top: B:32:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S A08() {
        /*
            r4 = this;
            monitor-enter(r4)
            S extends X.GCv<?>[] r0 = r4.A01     // Catch: java.lang.Throwable -> L60
            r1 = 2
            if (r0 != 0) goto L34
            X.GCv[] r0 = r4.A0B(r1)     // Catch: java.lang.Throwable -> L60
        La:
            r4.A01 = r0     // Catch: java.lang.Throwable -> L60
        Lc:
            int r3 = r4.A02     // Catch: java.lang.Throwable -> L60
        Le:
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L18
            X.GCv r2 = r4.A0A()     // Catch: java.lang.Throwable -> L60
            r0[r3] = r2     // Catch: java.lang.Throwable -> L60
        L18:
            int r3 = r3 + 1
            int r1 = r0.length     // Catch: java.lang.Throwable -> L60
            if (r3 < r1) goto L1e
            r3 = 0
        L1e:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            X.C7384Etj.A0Z(r2, r1)     // Catch: java.lang.Throwable -> L60
            boolean r1 = r2.A00(r4)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto Le
            r4.A02 = r3     // Catch: java.lang.Throwable -> L60
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L60
            int r0 = r0 + 1
            r4.A00 = r0     // Catch: java.lang.Throwable -> L60
            X.GCt r1 = r4.A03     // Catch: java.lang.Throwable -> L60
            goto L45
        L34:
            int r2 = r4.A00     // Catch: java.lang.Throwable -> L60
            int r1 = r0.length     // Catch: java.lang.Throwable -> L60
            if (r2 < r1) goto Lc
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L60
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Throwable -> L60
            X.GCv[] r0 = (X.AbstractC9293GCv[]) r0     // Catch: java.lang.Throwable -> L60
            goto La
        L45:
            monitor-exit(r4)
            if (r1 == 0) goto L5f
            monitor-enter(r1)
            java.lang.Object r0 = X.C9292GCt.A00(r1)     // Catch: java.lang.Throwable -> L5b
            int r0 = X.AnonymousClass001.A0F(r0)     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5b
            r1.AhV(r0)     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L5e:
            monitor-exit(r1)
        L5f:
            return r2
        L60:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9289GCq.A08():X.GCv");
    }

    public final void A09(S s) {
        C9292GCt c9292GCt;
        int i;
        HtJ<Unit>[] htJArrA01;
        synchronized (this) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            c9292GCt = this.A03;
            if (i2 == 0) {
                this.A02 = 0;
            }
            C7384Etj.A0Z(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            htJArrA01 = s.A01(this);
        }
        for (HtJ<Unit> htJ : htJArrA01) {
            if (htJ != null) {
                htJ.resumeWith(Unit.INSTANCE);
            }
        }
        if (c9292GCt != null) {
            synchronized (c9292GCt) {
                c9292GCt.AhV(Integer.valueOf(AnonymousClass001.A0F(C9292GCt.A00(c9292GCt)) - 1));
            }
        }
    }

    public abstract S A0A();

    public abstract S[] A0B(int i);

    public final C1BN<Integer> ALE() {
        C9292GCt c9292GCt;
        synchronized (this) {
            c9292GCt = this.A03;
            if (c9292GCt == null) {
                int i = this.A00;
                c9292GCt = new C9292GCt(C79.A01, 1, Integer.MAX_VALUE);
                c9292GCt.AhV(Integer.valueOf(i));
                this.A03 = c9292GCt;
            }
        }
        return c9292GCt;
    }
}
