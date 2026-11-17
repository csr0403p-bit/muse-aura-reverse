package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.BLU;
import X.C00q;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4$2$1 extends AbstractC7559F3s implements G0U<BLU, Unit> {
    public final /* synthetic */ MutableState<BLU> $bubbleBounds$delegate;
    public final /* synthetic */ C00q $translationPx;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BLU blu) {
        C7384Etj.A0Y(blu, 0);
        if (this.$translationPx.AFn() == 0.0f) {
            this.$bubbleBounds$delegate.Af8(blu);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$5$4$2$1(C00q c00q, MutableState<BLU> mutableState) {
        super(1);
        this.$translationPx = c00q;
        this.$bubbleBounds$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BLU blu) {
        invoke2(blu);
        return Unit.INSTANCE;
    }
}
