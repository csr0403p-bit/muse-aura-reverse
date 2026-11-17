package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1", f = "VoiceAvatarTakeover.kt", l = {505}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $inTopRow;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ StatusRowSwap $swap;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Float> {
        public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
        public final /* synthetic */ HatchStatusPillMetrics $metrics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
            super(0);
            this.$metrics = hatchStatusPillMetrics;
            this.$fullScreen = voiceAvatarFullScreenState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(Math.max(this.$metrics.getAvatarPanelProgress(), this.$fullScreen.getProgress()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1(StatusRowSwap statusRowSwap, boolean z, HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarFullScreenState voiceAvatarFullScreenState, HtJ<? super VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1> htJ) {
        super(2, htJ);
        this.$swap = statusRowSwap;
        this.$inTopRow = z;
        this.$metrics = hatchStatusPillMetrics;
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1(this.$swap, this.$inTopRow, this.$metrics, this.$fullScreen, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            StatusRowSwap statusRowSwap = this.$swap;
            boolean z = this.$inTopRow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$metrics, this.$fullScreen);
            this.label = 1;
            if (statusRowSwap.moveTo(z, anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceAvatarTakeoverKt$callAvatarFullScreenStatus$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
