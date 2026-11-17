package com.facebook.aura.partners.voice.uicontrol;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.PreviewVoiceOptionUiAction$perform$played$1", f = "VoiceUiCommands.kt", l = {474}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class PreviewVoiceOptionUiAction$perform$played$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super VoicePreviewPlayback>, Object> {
    public final /* synthetic */ VoicePreviewPlayer $player;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.PreviewVoiceOptionUiAction$perform$played$1$1", f = "VoiceUiCommands.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.PreviewVoiceOptionUiAction$perform$played$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<VoicePreviewPlayback, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass002.A1Y(obj2));
        }

        @Override // X.G0V
        public final Object invoke(VoicePreviewPlayback voicePreviewPlayback, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = voicePreviewPlayback;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewVoiceOptionUiAction$perform$played$1(VoicePreviewPlayer voicePreviewPlayer, HtJ<? super PreviewVoiceOptionUiAction$perform$played$1> htJ) {
        super(2, htJ);
        this.$player = voicePreviewPlayer;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PreviewVoiceOptionUiAction$perform$played$1(this.$player, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<VoicePreviewPlayback> c1bn = this.$player.playback;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super VoicePreviewPlayback> htJ) {
        return new PreviewVoiceOptionUiAction$perform$played$1(this.$player, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
