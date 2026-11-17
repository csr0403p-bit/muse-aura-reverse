package com.facebook.aura.explore.view;

import X.AT3;
import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$8$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ float $cornerRadiusPx;
    public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;
    public final /* synthetic */ long $rowFill;
    public final /* synthetic */ long $swipedCardFill;
    public final /* synthetic */ float $transitionDistancePx;

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[PHI: r5
  0x006b: PHI (r5v2 boolean) = (r5v0 boolean), (r5v3 boolean) binds: [B:7:0x001d, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(X.AT3 r21) {
        /*
            r20 = this;
            r0 = 0
            r9 = r21
            X.C7384Etj.A0Y(r9, r0)
            r8 = r20
            androidx.compose.foundation.gestures.AnchoredDraggableState<com.facebook.aura.explore.view.IdeaSwipeAnchor> r0 = r8.$dragState
            X.00q r0 = r0.A08
            float r2 = r0.AFn()
            boolean r1 = java.lang.Float.isNaN(r2)
            r6 = 0
            if (r1 != 0) goto L1c
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r5 = 1
            if (r0 > 0) goto L6b
        L1c:
            r5 = 0
            if (r1 == 0) goto L6b
            r4 = 0
        L20:
            float r7 = r8.$cornerRadiusPx
            float r7 = r7 * r4
            long r2 = r8.$rowFill
            long r0 = r8.$swipedCardFill
            long r14 = X.HxS.A03(r2, r0, r4)
            float r0 = -r7
            if (r5 == 0) goto L2f
            r0 = 0
        L2f:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r4 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r0
            r8 = 32
            long r4 = r4 << r8
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            long r2 = r2 | r4
            long r4 = r9.AKb()
            float r6 = X.AnonymousClass001.A00(r4)
            float r6 = r6 + r7
            float r4 = X.AnonymousClass001.A01(r4, r0)
            long r18 = X.AnonymousClass005.A0M(r6, r4)
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r4
            long r6 = r4 << r8
            long r0 = r0 & r4
            long r0 = r0 | r6
            r10 = 0
            X.16a r11 = X.C16a.A00
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 3
            r20 = r0
            r16 = r2
            r9.A9j(r10, r11, r12, r13, r14, r16, r18, r20)
            return
        L6b:
            float r1 = java.lang.Math.abs(r2)
            float r0 = r8.$transitionDistancePx
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = X.ATD.A03(r1, r6, r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$8$1.invoke2(X.AT3):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$8$1(AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState, float f, float f2, long j, long j2) {
        super(1);
        this.$dragState = anchoredDraggableState;
        this.$transitionDistancePx = f;
        this.$cornerRadiusPx = f2;
        this.$rowFill = j;
        this.$swipedCardFill = j2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
