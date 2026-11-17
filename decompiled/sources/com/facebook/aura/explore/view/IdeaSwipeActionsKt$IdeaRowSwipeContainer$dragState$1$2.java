package com.facebook.aura.explore.view;

import X.AXN;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$2 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ AXN $density;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$2(AXN axn) {
        super(0);
        this.$density = axn;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$density.Ah4(IdeaSwipeActionsKt.CommitVelocityThreshold));
    }
}
