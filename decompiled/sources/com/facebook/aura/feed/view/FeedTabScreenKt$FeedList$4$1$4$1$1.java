package com.facebook.aura.feed.view;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.repo.FeedUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$4$1$4$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
    public final /* synthetic */ MutableState<String> $highlightedUnitId$delegate;
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedList$4$1$4$1$1(FeedUnit feedUnit, AT5<Float, AOW> at5, MutableState<String> mutableState) {
        super(0);
        this.$unit = feedUnit;
        this.$highlightGlowAlpha = at5;
        this.$highlightedUnitId$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(MutableState.A0B(this.$highlightedUnitId$delegate, this.$unit.getId()) ? MutableState.A00(this.$highlightGlowAlpha) * 0.6f : 0.0f);
    }
}
