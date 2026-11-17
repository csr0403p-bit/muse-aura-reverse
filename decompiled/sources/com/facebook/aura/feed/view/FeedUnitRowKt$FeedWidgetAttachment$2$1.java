package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedWidgetAttachment$2$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ MutableState<Integer> $cachedHeightPx$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedWidgetAttachment$2$1(MutableState<Integer> mutableState) {
        super(1);
        this.$cachedHeightPx$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        MutableState.A07(i, this.$cachedHeightPx$delegate);
    }
}
