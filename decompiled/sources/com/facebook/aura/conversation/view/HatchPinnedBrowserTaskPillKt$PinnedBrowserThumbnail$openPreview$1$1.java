package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0dx;
import X.C1BO;
import X.C3cH;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchPinnedBrowserTaskPillKt$PinnedBrowserThumbnail$openPreview$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BrowserTaskNavigation $actions;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ C1BO<BrowserTaskPresentation> $latestBrowserTask$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sideChatSessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPinnedBrowserTaskPillKt$PinnedBrowserThumbnail$openPreview$1$1(C0dx c0dx, String str, BrowserTaskNavigation browserTaskNavigation, AuraNavigator auraNavigator, C1BO<BrowserTaskPresentation> c1bo) {
        super(0);
        this.$haptic = c0dx;
        this.$sideChatSessionId = str;
        this.$actions = browserTaskNavigation;
        this.$navigator = auraNavigator;
        this.$latestBrowserTask$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptic.AXr(AuraHaptics.BUTTON_TAP);
        HatchComponent hatchComponent = HatchComponent.OPEN_BROWSER_BUTTON;
        C1BO<BrowserTaskPresentation> c1bo = this.$latestBrowserTask$delegate;
        float f = HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnailHeight;
        HatchPinnedBrowserTaskPillKt.logPinnedBrowserClick(hatchComponent, C3cH.A0S(c1bo).browserTaskId, this.$sideChatSessionId);
        this.$actions.openTaskCard(C3cH.A0S(this.$latestBrowserTask$delegate), this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
