package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C1HY;
import X.C7384Etj;
import X.C78g;
import X.Dg3;
import X.EnumC3085Bxl;
import X.F1F;
import X.G0U;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberPipEntryPending$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ComponentActivity $componentActivity;
    public final /* synthetic */ C1BO<Boolean> $currentAutoEnterArmed$delegate;
    public final /* synthetic */ MutableState<Boolean> $pending$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentSystemPipKt$rememberPipEntryPending$1$1(ComponentActivity componentActivity, C1BO<Boolean> c1bo, MutableState<Boolean> mutableState) {
        super(1);
        this.$componentActivity = componentActivity;
        this.$currentAutoEnterArmed$delegate = c1bo;
        this.$pending$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final ComponentActivity componentActivity = this.$componentActivity;
        if (componentActivity == null) {
            return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberPipEntryPending$1$1$invoke$$inlined$onDispose$1
                @Override // X.C78g
                public void dispose() {
                }
            };
        }
        final F1F f1f = new F1F();
        final Runnable runnable = new Runnable() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberPipEntryPending$1$1$userLeaveHintListener$1
            @Override // java.lang.Runnable
            public final void run() {
                f1f.element = true;
            }
        };
        final C1BO<Boolean> c1bo = this.$currentAutoEnterArmed$delegate;
        final MutableState<Boolean> mutableState = this.$pending$delegate;
        final Dg3 dg3 = new Dg3() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberPipEntryPending$1$1$observer$1
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
                C7384Etj.A0Y(enumC3085Bxl, 1);
                MutableState.A09(enumC3085Bxl == EnumC3085Bxl.ON_PAUSE && C1BO.A0F(c1bo) && (componentActivity.isInPictureInPictureMode() || !f1f.element), mutableState);
                f1f.element = false;
            }
        };
        componentActivity.addOnUserLeaveHintListener(runnable);
        componentActivity.getLifecycle().A04(dg3);
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberPipEntryPending$1$1$invoke$$inlined$onDispose$2
            @Override // X.C78g
            public void dispose() {
                componentActivity.getLifecycle().A05(dg3);
                componentActivity.removeOnUserLeaveHintListener(runnable);
            }
        };
    }
}
