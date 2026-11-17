package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.BL4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedHeroImageAttachment$3$2$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ MutableState<BL4> $mediaSizePx$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedHeroImageAttachment$3$2$1$1(MutableState<BL4> mutableState) {
        super(1);
        this.$mediaSizePx$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m846invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m846invokeozmzZPI(long j) {
        FeedUnitRowKt.FeedHeroImageAttachment$lambda$8(this.$mediaSizePx$delegate, j);
    }
}
