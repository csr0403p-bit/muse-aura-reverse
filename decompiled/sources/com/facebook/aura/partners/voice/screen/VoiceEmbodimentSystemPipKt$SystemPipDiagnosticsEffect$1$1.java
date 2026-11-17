package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C1BO;
import X.C1HY;
import X.C3cH;
import X.C7384Etj;
import X.C78g;
import X.Dg3;
import X.EnumC3085Bxl;
import X.G0U;
import androidx.activity.ComponentActivity;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$SystemPipDiagnosticsEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ComponentActivity $activity;
    public final /* synthetic */ C1BO<Function0<VoiceSystemPipEvent>> $currentPauseEvent$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceEmbodimentSystemPipKt$SystemPipDiagnosticsEffect$1$1(ComponentActivity componentActivity, VoiceCallStateHolder voiceCallStateHolder, C1BO<? extends Function0<? extends VoiceSystemPipEvent>> c1bo) {
        super(1);
        this.$activity = componentActivity;
        this.$stateHolder = voiceCallStateHolder;
        this.$currentPauseEvent$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        ComponentActivity componentActivity = this.$activity;
        if (componentActivity == null) {
            return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$SystemPipDiagnosticsEffect$1$1$invoke$$inlined$onDispose$1
                @Override // X.C78g
                public void dispose() {
                }
            };
        }
        final VoiceCallStateHolder voiceCallStateHolder = this.$stateHolder;
        final C1BO<Function0<VoiceSystemPipEvent>> c1bo = this.$currentPauseEvent$delegate;
        final Dg3 dg3 = new Dg3() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$SystemPipDiagnosticsEffect$1$1$observer$1
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
                VoiceSystemPipEvent voiceSystemPipEvent;
                C7384Etj.A0Y(enumC3085Bxl, 1);
                if (C3cH.A1P(voiceCallStateHolder)) {
                    int iOrdinal = enumC3085Bxl.ordinal();
                    if (iOrdinal == 3) {
                        voiceSystemPipEvent = (VoiceSystemPipEvent) C1BO.A0A(c1bo).invoke();
                    } else if (iOrdinal != 4) {
                        return;
                    } else {
                        voiceSystemPipEvent = VoiceSystemPipEvent.HOST_STOPPED;
                    }
                    VoiceCallManager currentManager = HatchSystemPipRuntime.INSTANCE.getCurrentManager();
                    if (currentManager != null) {
                        currentManager.logSystemPipEvent(voiceSystemPipEvent);
                    }
                }
            }

            /* loaded from: classes5.dex */
            public abstract /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC3085Bxl.values().length];
                    try {
                        AnonymousClass002.A13(EnumC3085Bxl.ON_PAUSE, iArr);
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AnonymousClass002.A14(EnumC3085Bxl.ON_STOP, iArr);
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
        componentActivity.getLifecycle().A04(dg3);
        final ComponentActivity componentActivity2 = this.$activity;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$SystemPipDiagnosticsEffect$1$1$invoke$$inlined$onDispose$2
            @Override // X.C78g
            public void dispose() {
                componentActivity2.getLifecycle().A05(dg3);
            }
        };
    }
}
