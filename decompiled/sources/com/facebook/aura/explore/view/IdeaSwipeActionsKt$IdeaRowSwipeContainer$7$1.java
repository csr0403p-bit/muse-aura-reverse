package com.facebook.aura.explore.view;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.C2ae;
import X.G0U;
import androidx.compose.foundation.gestures.AnchoredDraggableState;

/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$7$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$7$1(AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState) {
        super(1);
        this.$dragState = anchoredDraggableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m777invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m777invokeBjo55l4(AXN axn) {
        return (Float.isNaN(this.$dragState.A08.AFn()) ? 0 : Ab3.A01(r1)) << 32;
    }
}
