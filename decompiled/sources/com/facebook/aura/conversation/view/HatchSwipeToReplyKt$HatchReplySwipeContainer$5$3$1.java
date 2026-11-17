package com.facebook.aura.conversation.view;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.BLU;
import X.C2ae;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$5$3$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ MutableState<BLU> $bubbleBounds$delegate;
    public final /* synthetic */ MutableState<BLU> $containerBounds$delegate;
    public final /* synthetic */ ReplySwipeMetrics $metrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$5$3$1(ReplySwipeMetrics replySwipeMetrics, MutableState<BLU> mutableState, MutableState<BLU> mutableState2) {
        super(1);
        this.$metrics = replySwipeMetrics;
        this.$containerBounds$delegate = mutableState;
        this.$bubbleBounds$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m664invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m664invokeBjo55l4(AXN axn) {
        return Ab3.A01(this.$metrics.bubbleStartGap(this.$containerBounds$delegate.getValue(), this.$bubbleBounds$delegate.getValue()) - this.$metrics.affordanceSlotPx) << 32;
    }
}
