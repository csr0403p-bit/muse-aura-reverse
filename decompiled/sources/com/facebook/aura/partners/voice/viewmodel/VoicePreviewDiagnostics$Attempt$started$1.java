package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics$Attempt$started$1", f = "VoicePreviewDiagnostics.kt", l = {165}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoicePreviewDiagnostics$Attempt$started$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ VoicePreviewDiagnostics.Attempt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewDiagnostics$Attempt$started$1(VoicePreviewDiagnostics.Attempt attempt, HtJ<? super VoicePreviewDiagnostics$Attempt$started$1> htJ) {
        super(2, htJ);
        this.this$0 = attempt;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewDiagnostics$Attempt$started$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(250L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.this$0.log(VoiceCallActivityRepository.PLAYBACK_STATE_PLAYING);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new VoicePreviewDiagnostics$Attempt$started$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
