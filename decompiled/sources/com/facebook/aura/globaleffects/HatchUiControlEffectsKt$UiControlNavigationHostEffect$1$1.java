package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import X.C06797bC;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06817bE;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.uicontrol.UiControlActionSink;
import com.facebook.aura.uicontrol.UiControlNavigationHost;

/* loaded from: classes3.dex */
public final class HatchUiControlEffectsKt$UiControlNavigationHostEffect$1$1 extends AbstractC7559F3s implements G0U<C06797bC, InterfaceC06817bE> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ UiControlActionSink $sink;

    @Override // X.G0U
    public final InterfaceC06817bE invoke(final C06797bC c06797bC) {
        C7384Etj.A0Y(c06797bC, 0);
        final UiControlNavigationHost uiControlNavigationHost = new UiControlNavigationHost(this.$navigator);
        this.$sink.registerNavigationHost(uiControlNavigationHost);
        final UiControlActionSink uiControlActionSink = this.$sink;
        return new InterfaceC06817bE() { // from class: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlNavigationHostEffect$1$1$invoke$$inlined$onStopOrDispose$1
            @Override // X.InterfaceC06817bE
            public void runStopOrDisposeEffect() {
                uiControlActionSink.clearNavigationHost(uiControlNavigationHost);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUiControlEffectsKt$UiControlNavigationHostEffect$1$1(AuraNavigator auraNavigator, UiControlActionSink uiControlActionSink) {
        super(1);
        this.$navigator = auraNavigator;
        this.$sink = uiControlActionSink;
    }
}
