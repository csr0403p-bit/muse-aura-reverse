package androidx.compose.foundation.pager;

import X.AOc;
import X.AbstractC07127nr;
import X.C3Q0;
import X.C8j3;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class PagerState$animateScrollToPage$3 extends AbstractC07127nr implements G0V<C3Q0, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AOc<Float> $animationSpec;
    public final /* synthetic */ int $targetPage;
    public final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/pager/PagerState;IFLX/AOc<Ljava/lang/Float;>;LX/HtJ<-Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3;>;)V */
    public PagerState$animateScrollToPage$3(AOc aOc, PagerState pagerState, HtJ htJ, float f, int i) {
        super(2, htJ);
        this.this$0 = pagerState;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = aOc;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        PagerState pagerState = this.this$0;
        int i = this.$targetPage;
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.$animationSpec, pagerState, htJ, this.$targetPageOffsetToSnappedPosition, i);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[PHI: r4
  0x0085: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:26:0x008c, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            r11 = r14
            int r0 = r14.label
            r1 = 1
            if (r0 == 0) goto L10
            if (r0 != r1) goto L8f
            X.Hwg.A00(r15)
        Ld:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L10:
            X.Hwg.A00(r15)
            java.lang.Object r0 = r14.L$0
            X.3Q0 r0 = (X.C3Q0) r0
            androidx.compose.foundation.pager.PagerState r2 = r14.this$0
            X.Abn r5 = new X.Abn
            r5.<init>(r0, r2)
            int r8 = r14.$targetPage
            float r6 = r14.$targetPageOffsetToSnappedPosition
            X.AOc<java.lang.Float> r10 = r14.$animationSpec
            r14.label = r1
            X.AXy r0 = X.AZ1.A01
            java.lang.Integer r0 = X.C3cG.A0R(r8)
            int r0 = r0.intValue()
            int r1 = androidx.compose.foundation.pager.PagerState.A00(r2, r0)
            X.00r r0 = r2.A0M
            r0.AdX(r1)
            androidx.compose.foundation.pager.PagerState r2 = r5.A00
            int r0 = r2.A02
            r7 = 0
            boolean r9 = X.C8j4.A1V(r8, r0)
            int r1 = r5.AGw()
            int r0 = r2.A02
            int r1 = r1 - r0
            int r4 = r1 + 1
            if (r9 == 0) goto L71
            int r0 = r5.AGw()
            if (r8 > r0) goto L73
        L53:
            int r0 = r5.A5i(r8, r7)
            float r14 = (float) r0
            float r14 = r14 + r6
            X.ASv r1 = new X.ASv
            r1.<init>()
            r0 = 7
            X.BTC r12 = new X.BTC
            r12.<init>(r0, r1, r5)
            r13 = 0
            r15 = r13
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r10, r11, r12, r13, r14, r15)
            if (r0 == r3) goto L6e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L6e:
            if (r0 != r3) goto Ld
            return r3
        L71:
            if (r8 >= r0) goto L53
        L73:
            int r2 = r2.A02
            int r0 = r8 - r2
            int r1 = java.lang.Math.abs(r0)
            r0 = 3
            if (r1 < r0) goto L53
            if (r9 == 0) goto L8a
            int r0 = r8 - r4
            r4 = r2
            if (r0 >= r2) goto L86
        L85:
            r0 = r4
        L86:
            r5.Afq(r0, r7)
            goto L53
        L8a:
            int r4 = r4 + r8
            r0 = r2
            if (r4 <= r2) goto L85
            goto L86
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3Q0 c3q0, HtJ<? super Unit> htJ) {
        return ((PagerState$animateScrollToPage$3) C8j3.A1E(htJ, c3q0, this)).invokeSuspend(Unit.INSTANCE);
    }
}
