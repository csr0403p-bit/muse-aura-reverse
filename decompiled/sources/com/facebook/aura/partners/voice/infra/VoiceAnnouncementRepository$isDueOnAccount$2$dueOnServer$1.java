package com.facebook.aura.partners.voice.infra;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1", f = "VoiceAnnouncementRepository.kt", l = {96}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;
    public final /* synthetic */ VoiceAnnouncementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1(VoiceAnnouncementRepository voiceAnnouncementRepository, HtJ<? super VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1> htJ) {
        super(2, htJ);
        this.this$0 = voiceAnnouncementRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceAnnouncementRepository voiceAnnouncementRepository = this.this$0;
            this.label = 1;
            obj = voiceAnnouncementRepository.readDueOnServer(this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new VoiceAnnouncementRepository$isDueOnAccount$2$dueOnServer$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
