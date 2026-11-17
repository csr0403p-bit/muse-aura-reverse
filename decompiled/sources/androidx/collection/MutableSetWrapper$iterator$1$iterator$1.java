package androidx.collection;

import X.AGW;
import X.AbstractC07117nq;
import X.BOZ;
import X.BTG;
import X.C8j3;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@DebugMetadata(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.jvm.kt", l = {783}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class MutableSetWrapper$iterator$1$iterator$1<E> extends AbstractC07117nq implements G0V<BOZ<? super E>, HtJ<? super Unit>, Object> {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ AGW<E> this$0;
    public final /* synthetic */ BTG this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(AGW<E> agw, BTG btg, HtJ<? super MutableSetWrapper$iterator$1$iterator$1> htJ) {
        super(2, htJ);
        this.this$0 = agw;
        this.this$1 = btg;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, htJ);
        mutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:6:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:20:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0084 -> B:7:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0037 -> B:6:0x002a). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.Hji r13 = X.EnumC10460Hji.A02
            r14 = r17
            int r0 = r14.label
            r12 = 8
            r11 = 1
            if (r0 == 0) goto L5f
            if (r0 != r11) goto L91
            int r2 = r14.I$3
            int r0 = r14.I$2
            long r3 = r14.J$0
            int r5 = r14.I$1
            int r6 = r14.I$0
            java.lang.Object r10 = r14.L$3
            long[] r10 = (long[]) r10
            java.lang.Object r7 = r14.L$2
            X.AGW r7 = (X.AGW) r7
            java.lang.Object r9 = r14.L$1
            X.BTG r9 = (X.BTG) r9
            java.lang.Object r8 = r14.L$0
            X.BOZ r8 = (X.BOZ) r8
            X.Hwg.A00(r18)
        L2a:
            long r3 = r3 >> r12
            int r2 = r2 + 1
        L2d:
            if (r2 >= r0) goto L8a
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r3
            r15 = 128(0x80, double:6.32E-322)
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r1 >= 0) goto L2a
            int r15 = r5 << 3
            int r15 = r15 + r2
            r9.A00 = r15
            X.AHt<E> r1 = r7.A00
            java.lang.Object[] r1 = r1.A04
            r1 = r1[r15]
            r14.L$0 = r8
            r14.L$1 = r9
            r14.L$2 = r7
            r14.L$3 = r10
            r14.I$0 = r6
            r14.I$1 = r5
            r14.J$0 = r3
            r14.I$2 = r0
            r14.I$3 = r2
            r14.label = r11
            X.Hji r1 = r8.A00(r1, r14)
            if (r1 != r13) goto L2a
            return r13
        L5f:
            X.Hwg.A00(r18)
            java.lang.Object r8 = r14.L$0
            X.BOZ r8 = (X.BOZ) r8
            X.AGW<E> r7 = r14.this$0
            X.AHt<E> r0 = r7.A00
            X.BTG r9 = r14.this$1
            long[] r10 = r0.A03
            int r0 = r10.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L96
            r5 = 0
        L74:
            r3 = r10[r5]
            long r15 = X.C8j5.A0A(r3)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r15 & r1
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 == 0) goto L8c
            int r0 = X.C8j4.A07(r5, r6)
            r2 = 0
            goto L2d
        L8a:
            if (r0 != r12) goto L96
        L8c:
            if (r5 == r6) goto L96
            int r5 = r5 + 1
            goto L74
        L91:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L96:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, HtJ<? super Unit> htJ) {
        return ((MutableSetWrapper$iterator$1$iterator$1) C8j3.A1E(htJ, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}
