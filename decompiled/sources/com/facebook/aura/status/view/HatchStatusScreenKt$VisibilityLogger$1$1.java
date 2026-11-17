package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.analytics.hatch.HatchTimeSpentLogger;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$VisibilityLogger$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchTimeSpentLogger $timeSpentLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$VisibilityLogger$1$1(AuraNavigator auraNavigator, HatchTimeSpentLogger hatchTimeSpentLogger) {
        super(1);
        this.$navigator = auraNavigator;
        this.$timeSpentLogger = hatchTimeSpentLogger;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$timeSpentLogger.reportNavigation(HatchStatusScreenKt.currentTabModule(this.$navigator), HatchModule.HATCH_STATUS, HatchClickPoint.BUTTON_TAP, HatchEventSubtype.STATUS_OPEN);
        final AuraNavigator auraNavigator = this.$navigator;
        final HatchTimeSpentLogger hatchTimeSpentLogger = this.$timeSpentLogger;
        return new C78g() { // from class: com.facebook.aura.status.view.HatchStatusScreenKt$VisibilityLogger$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchModule hatchModuleCurrentTabModule = HatchStatusScreenKt.currentTabModule(auraNavigator);
                if (hatchModuleCurrentTabModule != null) {
                    hatchTimeSpentLogger.reportNavigation(HatchModule.HATCH_STATUS, hatchModuleCurrentTabModule, HatchClickPoint.BUTTON_TAP, HatchEventSubtype.STATUS_CLOSE);
                }
            }
        };
    }
}
