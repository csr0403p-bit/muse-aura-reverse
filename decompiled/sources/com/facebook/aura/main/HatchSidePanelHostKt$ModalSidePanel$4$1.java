package com.facebook.aura.main;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$4$1", f = "HatchSidePanelHost.kt", l = {152, 155}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$ModalSidePanel$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isAnimatingPanel$delegate;
    public final /* synthetic */ AT5<Float, AOW> $revealPx;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ float $targetPanelWidthPx;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$ModalSidePanel$4$1(HatchSidePanelController hatchSidePanelController, AT5<Float, AOW> at5, float f, MutableState<Boolean> mutableState, HtJ<? super HatchSidePanelHostKt$ModalSidePanel$4$1> htJ) {
        super(2, htJ);
        this.$sidePanelController = hatchSidePanelController;
        this.$revealPx = at5;
        this.$targetPanelWidthPx = f;
        this.$isAnimatingPanel$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSidePanelHostKt$ModalSidePanel$4$1(this.$sidePanelController, this.$revealPx, this.$targetPanelWidthPx, this.$isAnimatingPanel$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 2
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L20
            if (r0 == r3) goto L5a
            if (r0 != r5) goto L79
            X.Hwg.A00(r8)
        L10:
            com.facebook.aura.navigation.HatchSidePanelController r1 = r7.$sidePanelController
            float r0 = r7.$targetPanelWidthPx
            r1.updateRevealOffset(r0)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r7.$isAnimatingPanel$delegate
            r0 = 0
            androidx.compose.runtime.MutableState.A09(r0, r1)
        L1d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L20:
            X.Hwg.A00(r8)
            com.facebook.aura.navigation.HatchSidePanelController r0 = r7.$sidePanelController
            com.facebook.aura.navigation.HatchSidePanelContentKey r0 = r0.getContentKey()
            if (r0 == 0) goto L1d
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$isAnimatingPanel$delegate
            androidx.compose.runtime.MutableState.A09(r3, r0)
            com.facebook.aura.navigation.HatchSidePanelController r0 = r7.$sidePanelController
            X.00q r0 = r0.dragOffsetPx$delegate
            float r0 = r0.AFn()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L62
            X.AT5<java.lang.Float, X.AOW> r2 = r7.$revealPx
            com.facebook.aura.navigation.HatchSidePanelController r0 = r7.$sidePanelController
            X.00q r0 = r0.dragOffsetPx$delegate
            float r1 = r0.AFn()
            float r0 = r7.$targetPanelWidthPx
            float r1 = X.ATD.A03(r1, r6, r0)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r7.label = r3
            java.lang.Object r0 = r2.A04(r0, r7)
            if (r0 != r4) goto L5d
            return r4
        L5a:
            X.Hwg.A00(r8)
        L5d:
            com.facebook.aura.navigation.HatchSidePanelController r0 = r7.$sidePanelController
            r0.clearDragOffset()
        L62:
            X.AT5<java.lang.Float, X.AOW> r3 = r7.$revealPx
            float r0 = r7.$targetPanelWidthPx
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r0)
            r1 = 0
            X.AOr r0 = X.AnonymousClass003.A0Q(r1)
            r7.label = r5
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r0, r2, r7, r1)
            if (r0 != r4) goto L10
            return r4
        L79:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSidePanelHostKt$ModalSidePanel$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
