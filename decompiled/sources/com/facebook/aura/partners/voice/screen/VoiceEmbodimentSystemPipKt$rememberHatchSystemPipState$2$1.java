package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1HY;
import X.C7384Etj;
import X.C78g;
import X.Dg3;
import X.EnumC3085Bxl;
import X.G0U;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ComponentActivity $componentActivity;
    public final /* synthetic */ MutableState<HatchPipWindowMeasurement> $pipWindow$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$2$1(ComponentActivity componentActivity, MutableState<HatchPipWindowMeasurement> mutableState) {
        super(1);
        this.$componentActivity = componentActivity;
        this.$pipWindow$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final ComponentActivity componentActivity = this.$componentActivity;
        if (componentActivity == null) {
            return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$2$1$invoke$$inlined$onDispose$1
                @Override // X.C78g
                public void dispose() {
                }
            };
        }
        final MutableState<HatchPipWindowMeasurement> mutableState = this.$pipWindow$delegate;
        final Dg3 dg3 = new Dg3() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$2$1$observer$1
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
                C7384Etj.A0Y(enumC3085Bxl, 1);
                if (enumC3085Bxl != EnumC3085Bxl.ON_STOP || componentActivity.isInPictureInPictureMode() || componentActivity.isChangingConfigurations()) {
                    return;
                }
                mutableState.Af8(null);
            }
        };
        componentActivity.getLifecycle().A04(dg3);
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$2$1$invoke$$inlined$onDispose$2
            @Override // X.C78g
            public void dispose() {
                componentActivity.getLifecycle().A05(dg3);
            }
        };
    }
}
