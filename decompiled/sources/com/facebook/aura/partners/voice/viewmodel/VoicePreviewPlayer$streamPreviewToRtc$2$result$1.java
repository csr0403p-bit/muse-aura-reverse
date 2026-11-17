package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreviewToRtc$2$result$1", f = "VoicePreviewPlayer.kt", l = {317}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoicePreviewPlayer$streamPreviewToRtc$2$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RtcPlayoutResult>, Object> {
    public final /* synthetic */ RtcPreviewFramer $framer;
    public final /* synthetic */ VoicePreviewPlayer.ActivePreview $preview;
    public int label;
    public final /* synthetic */ VoicePreviewPlayer this$0;

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreviewToRtc$2$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ VoicePreviewPlayer.ActivePreview $preview;
        public final /* synthetic */ VoicePreviewPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoicePreviewPlayer voicePreviewPlayer, VoicePreviewPlayer.ActivePreview activePreview) {
            super(0);
            this.this$0 = voicePreviewPlayer;
            this.$preview = activePreview;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.markPlaying(this.$preview);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewPlayer$streamPreviewToRtc$2$result$1(RtcPreviewFramer rtcPreviewFramer, VoicePreviewPlayer voicePreviewPlayer, VoicePreviewPlayer.ActivePreview activePreview, HtJ<? super VoicePreviewPlayer$streamPreviewToRtc$2$result$1> htJ) {
        super(2, htJ);
        this.$framer = rtcPreviewFramer;
        this.this$0 = voicePreviewPlayer;
        this.$preview = activePreview;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewPlayer$streamPreviewToRtc$2$result$1(this.$framer, this.this$0, this.$preview, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            RtcPreviewFramer rtcPreviewFramer = this.$framer;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$preview);
            this.label = 1;
            obj = rtcPreviewFramer.run(anonymousClass1, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super RtcPlayoutResult> htJ) {
        return ((VoicePreviewPlayer$streamPreviewToRtc$2$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
