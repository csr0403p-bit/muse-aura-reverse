package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C10649I0t;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3rb;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1", f = "HatchVoiceEmbodimentHost.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $active;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $isCompactHost;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public int label;

    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<VoiceEmbodimentPlacement> {
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
        public final VoiceEmbodimentPlacement invoke() {
            return HatchVoiceEmbodimentHostKt.settledEmbodimentPlacement(this.$metrics, this.$fullScreen);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1$2", f = "HatchVoiceEmbodimentHost.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0W<VoiceEmbodimentPlacement, Boolean, HtJ<? super VoiceEmbodimentPlacement>, Object> {
        public final /* synthetic */ boolean $isCompactHost;
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(3, htJ);
            this.$isCompactHost = z;
        }

        public final Object invoke(VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, HtJ<? super VoiceEmbodimentPlacement> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$isCompactHost, htJ);
            anonymousClass2.L$0 = voiceEmbodimentPlacement;
            anonymousClass2.Z$0 = z;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (z != this.$isCompactHost) {
                return null;
            }
            return obj2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(VoiceEmbodimentPlacement voiceEmbodimentPlacement, Boolean bool, HtJ<? super VoiceEmbodimentPlacement> htJ) {
            return invoke(voiceEmbodimentPlacement, AnonymousClass001.A1X(bool), htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1(boolean z, VoiceCallStateHolder voiceCallStateHolder, HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarFullScreenState voiceAvatarFullScreenState, boolean z2, HtJ<? super HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1> htJ) {
        super(2, htJ);
        this.$active = z;
        this.$stateHolder = voiceCallStateHolder;
        this.$metrics = hatchStatusPillMetrics;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$isCompactHost = z2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1(this.$active, this.$stateHolder, this.$metrics, this.$fullScreen, this.$isCompactHost, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$active) {
                C20Q c20qA01 = GDB.A01(new C10649I0t(C3rb.A03(new AnonymousClass2(this.$isCompactHost, null), new C10649I0t(C6v3.A01(new AnonymousClass1(this.$metrics, this.$fullScreen)), 2), this.$stateHolder.isCompactPresentationActive), 2));
                final VoiceCallStateHolder voiceCallStateHolder = this.$stateHolder;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1.3
                    public final Object emit(VoiceEmbodimentPlacement voiceEmbodimentPlacement, HtJ<? super Unit> htJ) {
                        voiceCallStateHolder.setEmbodimentInAppPlacement(voiceEmbodimentPlacement);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        voiceCallStateHolder.setEmbodimentInAppPlacement((VoiceEmbodimentPlacement) obj2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((HatchVoiceEmbodimentHostKt$EmbodimentPlacementReporter$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
