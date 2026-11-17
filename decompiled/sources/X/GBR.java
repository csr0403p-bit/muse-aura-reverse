package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend", v = 1)
/* loaded from: classes6.dex */
public final class GBR extends AbstractC07117nq implements G0V<BOZ<? super HoC>, HtJ<? super Unit>, Object> {
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ GBM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GBM;LX/HtJ<-LX/GBR;>;)V */
    public GBR(HtJ htJ, GBM gbm) {
        super(2, htJ);
        this.this$0 = gbm;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        GBR gbr = new GBR(htJ, this.this$0);
        gbr.L$0 = obj;
        return gbr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002a -> B:7:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r4 = r10.L$0
            X.BOZ r4 = (X.BOZ) r4
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r6 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L4d
            if (r0 == r2) goto L8f
            if (r0 != r6) goto L8a
            int r9 = r10.I$1
            int r8 = r10.I$0
            java.lang.Object r1 = r10.L$4
            X.GBT r1 = (X.GBT) r1
            java.lang.Object r2 = r10.L$3
            X.Hwg.A00(r11)
        L1e:
            X.GBT r1 = r1.A02()
        L22:
            boolean r0 = X.C7384Etj.areEqual(r1, r2)
            if (r0 != 0) goto L92
            boolean r0 = r1 instanceof X.C9254GBh
            if (r0 == 0) goto L1e
            r0 = r1
            X.GBh r0 = (X.C9254GBh) r0
            X.GBM r7 = r0.A00
            r10.L$0 = r4
            r0 = 0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r2
            r10.L$4 = r1
            r10.L$5 = r0
            r10.I$0 = r8
            r10.I$1 = r9
            r10.I$2 = r5
            r10.label = r6
            X.Hji r0 = r4.A00(r7, r10)
            if (r0 != r3) goto L1e
            return r3
        L4d:
            X.Hwg.A00(r11)
            X.GBM r1 = r10.this$0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GBM.A01
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof X.C9254GBh
            if (r0 == 0) goto L6e
            X.GBh r1 = (X.C9254GBh) r1
            X.GBM r1 = r1.A00
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.label = r2
            X.Hji r0 = r4.A00(r1, r10)
            if (r0 != r3) goto L92
            return r3
        L6e:
            boolean r0 = r1 instanceof X.InterfaceC9269GBw
            if (r0 == 0) goto L92
            X.GBw r1 = (X.InterfaceC9269GBw) r1
            X.GC1 r2 = r1.AH7()
            if (r2 == 0) goto L92
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GBT.A00
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            X.C7384Etj.A0Z(r1, r0)
            X.GBT r1 = (X.GBT) r1
            r9 = 0
            r8 = 0
            goto L22
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L8f:
            X.Hwg.A00(r11)
        L92:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(BOZ<? super HoC> boz, HtJ<? super Unit> htJ) {
        return ((GBR) C8j3.A1E(htJ, boz, this)).invokeSuspend(Unit.INSTANCE);
    }
}
