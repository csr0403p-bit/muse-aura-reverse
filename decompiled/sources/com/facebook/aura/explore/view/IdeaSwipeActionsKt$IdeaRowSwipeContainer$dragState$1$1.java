package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00r;
import X.G0U;

/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$1 extends AbstractC7559F3s implements G0U<Float, Float> {
    public final /* synthetic */ C00r $measuredRowWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$1(C00r c00r) {
        super(1);
        this.$measuredRowWidth = c00r;
    }

    public final Float invoke(float f) {
        float fAGd = this.$measuredRowWidth.AGd();
        return Float.valueOf(IdeaSwipeActionsKt.commitDistancePx(fAGd, f <= 0.825f * fAGd));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(AnonymousClass001.A02(f));
    }
}
