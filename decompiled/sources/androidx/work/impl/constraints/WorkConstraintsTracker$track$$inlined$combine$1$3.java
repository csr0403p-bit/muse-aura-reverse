package androidx.work.impl.constraints;

import X.AbstractC07127nr;
import X.C20Z;
import X.ENN;
import X.G0W;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {288}, m = "invokeSuspend", v = 1)
/* loaded from: classes5.dex */
public final class WorkConstraintsTracker$track$$inlined$combine$1$3 extends AbstractC07127nr implements G0W<C20Z<? super ENN>, ENN[], HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public WorkConstraintsTracker$track$$inlined$combine$1$3(HtJ htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(C20Z<? super ENN> c20z, ENN[] ennArr, HtJ<? super Unit> htJ) {
        WorkConstraintsTracker$track$$inlined$combine$1$3 workConstraintsTracker$track$$inlined$combine$1$3 = new WorkConstraintsTracker$track$$inlined$combine$1$3(htJ);
        workConstraintsTracker$track$$inlined$combine$1$3.L$0 = c20z;
        workConstraintsTracker$track$$inlined$combine$1$3.L$1 = ennArr;
        return workConstraintsTracker$track$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r0 = X.EN9.A00;
     */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto Lf
            if (r0 != r6) goto L3a
            X.Hwg.A00(r9)
        Lc:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Lf:
            X.Hwg.A00(r9)
            java.lang.Object r5 = r8.L$0
            X.20Z r5 = (X.C20Z) r5
            java.lang.Object r4 = r8.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.ENN[] r4 = (X.ENN[]) r4
            int r3 = r4.length
            r2 = 0
        L1e:
            if (r2 >= r3) goto L2c
            r0 = r4[r2]
            X.EN9 r1 = X.EN9.A00
            boolean r1 = X.C7384Etj.areEqual(r0, r1)
            if (r1 != 0) goto L37
            if (r0 != 0) goto L2e
        L2c:
            X.EN9 r0 = X.EN9.A00
        L2e:
            r8.label = r6
            java.lang.Object r0 = r5.emit(r0, r8)
            if (r0 != r7) goto Lc
            return r7
        L37:
            int r2 = r2 + 1
            goto L1e
        L3a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
