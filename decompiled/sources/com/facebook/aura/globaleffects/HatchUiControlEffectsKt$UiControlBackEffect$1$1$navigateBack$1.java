package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import X.C2186B9f;
import android.app.Activity;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import com.facebook.aura.uicontrol.BackNavigationResult;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchUiControlEffectsKt$UiControlBackEffect$1$1$navigateBack$1 extends AbstractC7559F3s implements Function0<BackNavigationResult> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C2186B9f $systemBackDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUiControlEffectsKt$UiControlBackEffect$1$1$navigateBack$1(AuraNavigator auraNavigator, Activity activity, C2186B9f c2186B9f) {
        super(0);
        this.$navigator = auraNavigator;
        this.$activity = activity;
        this.$systemBackDispatcher = c2186B9f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BackNavigationResult invoke() {
        Activity activity;
        AuraNavKey auraNavKeyCurrentKey = this.$navigator.currentKey(true);
        if ((auraNavKeyCurrentKey instanceof AuraOverlayNavKey) || (auraNavKeyCurrentKey instanceof AuraBottomSheetNavKey) || !((activity = this.$activity) == null || activity.hasWindowFocus())) {
            return BackNavigationResult.COVERED;
        }
        C2186B9f c2186B9f = this.$systemBackDispatcher;
        if (c2186B9f == null || !c2186B9f.A00) {
            return BackNavigationResult.NOTHING_TO_CLOSE;
        }
        c2186B9f.A01.A03();
        return BackNavigationResult.CLOSED;
    }
}
