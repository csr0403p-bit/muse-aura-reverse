package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C00r;
import X.C1956Auv;
import X.C1958Aux;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedInstructionsPromptCardKt$FeedInstructionsCardPrompt$1$1$1 extends AbstractC7559F3s implements G0U<C1958Aux, Unit> {
    public final /* synthetic */ C00r $visibleTextHeightPx$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1958Aux c1958Aux) {
        C7384Etj.A0Y(c1958Aux, 0);
        C1956Auv c1956Auv = c1958Aux.A03;
        int iCeil = (int) Math.ceil(c1956Auv.A06(Math.min(c1956Auv.A02, 5) - 1));
        if (this.$visibleTextHeightPx$delegate.AGd() != iCeil) {
            this.$visibleTextHeightPx$delegate.AdX(iCeil);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedInstructionsPromptCardKt$FeedInstructionsCardPrompt$1$1$1(C00r c00r) {
        super(1);
        this.$visibleTextHeightPx$delegate = c00r;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1958Aux c1958Aux) {
        invoke2(c1958Aux);
        return Unit.INSTANCE;
    }
}
