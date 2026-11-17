package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpaceBuildCompletedCardKt$SpaceCardOverflowButton$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpaceBuildCompletedCardKt$SpaceCardOverflowButton$1$1$1(HatchScreen hatchScreen, String str, Map<String, String> map, MutableState<Boolean> mutableState) {
        super(0);
        this.$screen = hatchScreen;
        this.$slug = str;
        this.$threadLogMetadata = map;
        this.$showMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceCardAnalytics.INSTANCE.logSpaceCardMenuClick(this.$screen, this.$slug, this.$threadLogMetadata);
        MutableState<Boolean> mutableState = this.$showMenu$delegate;
        float f = HatchSpaceBuildCompletedCardKt.IconCornerRadius;
        MutableState.A09(true, mutableState);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
