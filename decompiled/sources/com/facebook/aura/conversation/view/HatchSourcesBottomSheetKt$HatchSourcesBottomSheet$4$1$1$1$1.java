package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$4$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchCitationAnalytics $citationAnalytics;
    public final /* synthetic */ G0U<String, Unit> $onSourceClick;
    public final /* synthetic */ int $position;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$4$1$1$1$1(HatchCitationAnalytics hatchCitationAnalytics, String str, int i, G0U<? super String, Unit> g0u) {
        super(0);
        this.$citationAnalytics = hatchCitationAnalytics;
        this.$url = str;
        this.$position = i;
        this.$onSourceClick = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        HatchScreen hatchScreen = HatchScreen.MAIN_CHAT;
        HatchComponent hatchComponent = HatchComponent.SOURCE_LINK;
        HatchCitationAnalytics hatchCitationAnalytics = this.$citationAnalytics;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, hatchCitationAnalytics != null ? hatchCitationAnalytics.sourceRowMetadata(this.$url, Integer.valueOf(this.$position)) : null, null);
        this.$onSourceClick.invoke(this.$url);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
