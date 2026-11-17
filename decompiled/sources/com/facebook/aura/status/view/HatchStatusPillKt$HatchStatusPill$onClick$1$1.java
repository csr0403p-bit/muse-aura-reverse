package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Hi;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$onClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onPillContentClicked;
    public final /* synthetic */ String $subthreadSessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$onClick$1$1(C0Hi c0Hi, Function0<Unit> function0, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$focusManager = c0Hi;
        this.$onPillContentClicked = function0;
        this.$navigator = auraNavigator;
        this.$subthreadSessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusManager.A6G(false);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.HEADER, HatchScreen.MAIN_CHAT, HatchComponent.STATUS_PILL, null, null, null);
        Function0<Unit> function0 = this.$onPillContentClicked;
        if (function0 != null) {
            function0.invoke();
        } else {
            this.$navigator.navigate((AuraNavKey) new HatchStatusScreenKey(null, this.$subthreadSessionId, null, null), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
