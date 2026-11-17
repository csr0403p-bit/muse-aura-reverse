package com.facebook.aura.browsertask.conversation;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cH;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchBrowserTaskCardKt$HatchBrowserTaskCard$openPreview$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BrowserTaskNavigation $actions;
    public final /* synthetic */ C1BO<BrowserTaskPresentation> $latestBrowserTask$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchBrowserTaskCardKt$HatchBrowserTaskCard$openPreview$1$1(HatchScreen hatchScreen, Map<String, String> map, BrowserTaskNavigation browserTaskNavigation, AuraNavigator auraNavigator, C1BO<BrowserTaskPresentation> c1bo) {
        super(0);
        this.$screen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$actions = browserTaskNavigation;
        this.$navigator = auraNavigator;
        this.$latestBrowserTask$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchBrowserTaskCardKt.logOpenBrowserClick(this.$screen, C3cH.A0S(this.$latestBrowserTask$delegate).browserTaskId, this.$threadLogMetadata);
        this.$actions.openTaskCard(C3cH.A0S(this.$latestBrowserTask$delegate), this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
