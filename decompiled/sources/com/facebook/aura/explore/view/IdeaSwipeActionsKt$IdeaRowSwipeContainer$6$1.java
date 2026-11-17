package com.facebook.aura.explore.view;

import X.AOW;
import X.ART;
import X.AT2;
import X.AT3;
import X.AT5;
import X.ATD;
import X.AVy;
import X.AW9;
import X.AaI;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1423Ais;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import X.InterfaceC1279AgP;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$6$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $armedIconScale;
    public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;
    public final /* synthetic */ float $iconSizePx;
    public final /* synthetic */ C1423Ais $iconTint;
    public final /* synthetic */ AVy $thumbsDownPainter;
    public final /* synthetic */ AVy $thumbsUpPainter;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        boolean z;
        long j;
        C7384Etj.A0Y(at3, 0);
        float fAFn = this.$dragState.A08.AFn();
        if (Float.isNaN(fAFn) || fAFn == 0.0f) {
            return;
        }
        if (fAFn > 0.0f) {
            z = true;
            j = IdeaSwipeActionsKt.MoreLikeThisFill;
        } else {
            z = false;
            j = IdeaSwipeActionsKt.NotInterestedFill;
        }
        ART.A03(null, at3, 0.3f, 118, j, 0L, 0L);
        float fA03 = ATD.A03(Math.abs(fAFn) / IdeaSwipeActionsKt.commitDistancePx(AnonymousClass001.A00(at3.AKb()), z), 0.0f, 1.0f) * MutableState.A00(this.$armedIconScale);
        if (fA03 > 0.0f) {
            float f = fAFn / 2.0f;
            float fA00 = z ? 0.0f : AnonymousClass001.A00(at3.AKb());
            float f2 = this.$iconSizePx;
            float f3 = (f + fA00) - (f2 / 2.0f);
            float fA01 = (AnonymousClass001.A01(at3.AKb(), 4294967295L) - f2) / 2.0f;
            AVy aVy = this.$thumbsUpPainter;
            AVy aVy2 = this.$thumbsDownPainter;
            C1423Ais c1423Ais = this.$iconTint;
            InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
            AaI aaI = (AaI) interfaceC1279AgPAEq;
            AT2 at2 = aaI.A01;
            at2.AhL(f3, fA01);
            try {
                long jA0O = C8j3.A0O(f2 / 2.0f);
                AW9 aw9 = aaI.A02.A02;
                long jA00 = AW9.A00(aw9);
                try {
                    at2.Ac6(fA03, fA03, jA0O);
                    if (z) {
                        aVy2 = aVy;
                    }
                    aVy2.m10drawx_KDEd0(at3, C8j3.A0O(f2), 1.0f, c1423Ais);
                } finally {
                    AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
                }
            } finally {
                AT2.A01(at2, f3, fA01);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$6$1(AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState, AT5<Float, AOW> at5, float f, AVy aVy, AVy aVy2, C1423Ais c1423Ais) {
        super(1);
        this.$dragState = anchoredDraggableState;
        this.$armedIconScale = at5;
        this.$iconSizePx = f;
        this.$thumbsUpPainter = aVy;
        this.$thumbsDownPainter = aVy2;
        this.$iconTint = c1423Ais;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
