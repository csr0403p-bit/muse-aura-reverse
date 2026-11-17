package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSubsurface $analyticsSubsurface;
    public final /* synthetic */ HatchSurface $analyticsSurface;
    public final /* synthetic */ Map<String, String> $impressionMetadata;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$5$1(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, Map<String, String> map, AuraNavigator auraNavigator) {
        super(0);
        this.$analyticsSurface = hatchSurface;
        this.$analyticsSubsurface = hatchSubsurface;
        this.$impressionMetadata = map;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExploreIdeaCardDetailSheetKt.logIdeaDetailCloseClick(this.$analyticsSurface, this.$analyticsSubsurface, this.$impressionMetadata);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
