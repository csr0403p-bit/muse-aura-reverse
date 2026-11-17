package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1", f = "VoiceAnnouncementEffects.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Boolean> $isMainChatOnTop;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1$1", f = "VoiceAnnouncementEffects.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1(Function0<Boolean> function0, VoiceAnnouncementViewModel voiceAnnouncementViewModel, HtJ<? super VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1> htJ) {
        super(1, htJ);
        this.$isMainChatOnTop = function0;
        this.$viewModel = voiceAnnouncementViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1(this.$isMainChatOnTop, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(this.$isMainChatOnTop);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (AbstractC9777Gfy.A00(this, anonymousClass1, c05663ulA01) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.$viewModel.onMainChatForeground();
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
