package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSubsurface $analyticsSubsurface;
    public final /* synthetic */ HatchSurface $analyticsSurface;
    public final /* synthetic */ Map<String, String> $impressionMetadata;
    public final /* synthetic */ MutableState<Boolean> $menuOpen$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4$1$1$1$1$1(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, Map<String, String> map, MutableState<Boolean> mutableState) {
        super(0);
        this.$analyticsSurface = hatchSurface;
        this.$analyticsSubsurface = hatchSubsurface;
        this.$impressionMetadata = map;
        this.$menuOpen$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExploreIdeaCardDetailSheetKt.logIdeaDetailClick(this.$analyticsSurface, this.$analyticsSubsurface, HatchComponent.THREE_DOTS_MENU, this.$impressionMetadata);
        MutableState.A09(true, this.$menuOpen$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
