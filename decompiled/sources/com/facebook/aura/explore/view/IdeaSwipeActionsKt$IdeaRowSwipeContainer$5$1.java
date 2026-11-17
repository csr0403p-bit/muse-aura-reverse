package com.facebook.aura.explore.view;

import X.AZz;
import X.AbstractC0886AGn;
import X.AbstractC7559F3s;
import X.BL4;
import X.C00r;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$5$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;
    public final /* synthetic */ C00r $measuredRowWidth;

    /* renamed from: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AZz<IdeaSwipeAnchor>, Unit> {
        public final /* synthetic */ long $size;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AZz<IdeaSwipeAnchor> aZz) {
            C7384Etj.A0Y(aZz, 0);
            aZz.A00(IdeaSwipeAnchor.CLOSED, 0.0f);
            int i = (int) (this.$size >> 32);
            if (i > 0) {
                aZz.A00(IdeaSwipeAnchor.NOT_INTERESTED, -i);
                aZz.A00(IdeaSwipeAnchor.MORE_LIKE_THIS, ((int) (this.$size >> 32)) * 0.65f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(1);
            this.$size = j;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AZz<IdeaSwipeAnchor> aZz) {
            invoke2(aZz);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$5$1(C00r c00r, AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState) {
        super(1);
        this.$measuredRowWidth = c00r;
        this.$dragState = anchoredDraggableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m776invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m776invokeozmzZPI(long j) {
        int iA0G = C8j3.A0G(j);
        if (iA0G != this.$measuredRowWidth.AGd()) {
            this.$measuredRowWidth.AdX(iA0G);
            AbstractC0886AGn.A02(this.$dragState, new AnonymousClass1(j));
        }
    }
}
