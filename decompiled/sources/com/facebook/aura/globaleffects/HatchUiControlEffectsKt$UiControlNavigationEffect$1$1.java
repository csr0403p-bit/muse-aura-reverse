package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import X.C06797bC;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06817bE;
import android.app.Activity;
import com.facebook.aura.uicontrol.UiControlActionSink;

/* loaded from: classes3.dex */
public final class HatchUiControlEffectsKt$UiControlNavigationEffect$1$1 extends AbstractC7559F3s implements G0U<C06797bC, InterfaceC06817bE> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ UiControlActionSink $sink;

    @Override // X.G0U
    public final InterfaceC06817bE invoke(final C06797bC c06797bC) {
        C7384Etj.A0Y(c06797bC, 0);
        final HatchUiControlEffectsKt$UiControlNavigationEffect$1$1$isVisible$1 hatchUiControlEffectsKt$UiControlNavigationEffect$1$1$isVisible$1 = new HatchUiControlEffectsKt$UiControlNavigationEffect$1$1$isVisible$1(this.$activity);
        this.$sink.registerNavigationVisibility(hatchUiControlEffectsKt$UiControlNavigationEffect$1$1$isVisible$1);
        final UiControlActionSink uiControlActionSink = this.$sink;
        return new InterfaceC06817bE() { // from class: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlNavigationEffect$1$1$invoke$$inlined$onStopOrDispose$1
            @Override // X.InterfaceC06817bE
            public void runStopOrDisposeEffect() {
                uiControlActionSink.clearNavigationVisibility(hatchUiControlEffectsKt$UiControlNavigationEffect$1$1$isVisible$1);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUiControlEffectsKt$UiControlNavigationEffect$1$1(UiControlActionSink uiControlActionSink, Activity activity) {
        super(1);
        this.$sink = uiControlActionSink;
        this.$activity = activity;
    }
}
