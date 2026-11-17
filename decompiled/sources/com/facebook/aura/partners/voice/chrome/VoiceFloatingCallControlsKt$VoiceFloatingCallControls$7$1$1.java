package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Hi;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState;
import com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$7$1$1 extends AbstractC7559F3s implements G0U<VoiceCallControl, Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $hiddenForPip;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ CallControlsPresentationState $presentationState;
    public final /* synthetic */ C1BO<VoiceAvatarExpandedView> $rememberedSize;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceCallControl voiceCallControl) {
        C7384Etj.A0Y(voiceCallControl, 0);
        if (!this.$presentationState.visible || this.$hiddenForPip) {
            return;
        }
        int iOrdinal = voiceCallControl.ordinal();
        if (iOrdinal == 4) {
            VoiceAvatarTakeoverKt.logEmbodimentExpandToggle(this.$stateHolder, false);
            this.$stateHolder.noteEmbodimentStateReason(VoiceEmbodimentStateReason.COLLAPSE_BUTTON);
            this.$fullScreen.collapseToAvatar(this.$metrics);
        } else {
            if (iOrdinal != 5) {
                VoiceCallControlClickKt.onVoiceControlClick(this.$stateHolder, voiceCallControl);
                return;
            }
            this.$focusManager.A6G(false);
            VoiceAvatarTakeoverKt.logEmbodimentExpandToggle(this.$stateHolder, true);
            this.$stateHolder.noteEmbodimentStateReason(VoiceEmbodimentStateReason.EXPAND_BUTTON);
            VoiceAvatarTakeoverKt.openFromAvatar(this.$fullScreen, this.$metrics, this.$rememberedSize.getValue());
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCallControl.values().length];
            try {
                AnonymousClass002.A13(VoiceCallControl.COLLAPSE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceCallControl.EXPAND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$7$1$1(CallControlsPresentationState callControlsPresentationState, boolean z, VoiceCallStateHolder voiceCallStateHolder, VoiceAvatarFullScreenState voiceAvatarFullScreenState, HatchStatusPillMetrics hatchStatusPillMetrics, C0Hi c0Hi, C1BO<? extends VoiceAvatarExpandedView> c1bo) {
        super(1);
        this.$presentationState = callControlsPresentationState;
        this.$hiddenForPip = z;
        this.$stateHolder = voiceCallStateHolder;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$metrics = hatchStatusPillMetrics;
        this.$focusManager = c0Hi;
        this.$rememberedSize = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceCallControl voiceCallControl) {
        invoke2(voiceCallControl);
        return Unit.INSTANCE;
    }
}
