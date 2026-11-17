package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import X.C06797bC;
import X.C2186B9f;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06817bE;
import android.app.Activity;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.uicontrol.UiControlActionSink;

/* loaded from: classes3.dex */
public final class HatchUiControlEffectsKt$UiControlBackEffect$1$1 extends AbstractC7559F3s implements G0U<C06797bC, InterfaceC06817bE> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ UiControlActionSink $sink;
    public final /* synthetic */ C2186B9f $systemBackDispatcher;

    @Override // X.G0U
    public final InterfaceC06817bE invoke(final C06797bC c06797bC) {
        C7384Etj.A0Y(c06797bC, 0);
        final HatchUiControlEffectsKt$UiControlBackEffect$1$1$navigateBack$1 hatchUiControlEffectsKt$UiControlBackEffect$1$1$navigateBack$1 = new HatchUiControlEffectsKt$UiControlBackEffect$1$1$navigateBack$1(this.$navigator, this.$activity, this.$systemBackDispatcher);
        this.$sink.registerBackNavigation(hatchUiControlEffectsKt$UiControlBackEffect$1$1$navigateBack$1);
        final UiControlActionSink uiControlActionSink = this.$sink;
        return new InterfaceC06817bE() { // from class: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlBackEffect$1$1$invoke$$inlined$onStopOrDispose$1
            @Override // X.InterfaceC06817bE
            public void runStopOrDisposeEffect() {
                uiControlActionSink.clearBackNavigation(hatchUiControlEffectsKt$UiControlBackEffect$1$1$navigateBack$1);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUiControlEffectsKt$UiControlBackEffect$1$1(UiControlActionSink uiControlActionSink, AuraNavigator auraNavigator, Activity activity, C2186B9f c2186B9f) {
        super(1);
        this.$sink = uiControlActionSink;
        this.$navigator = auraNavigator;
        this.$activity = activity;
        this.$systemBackDispatcher = c2186B9f;
    }
}
