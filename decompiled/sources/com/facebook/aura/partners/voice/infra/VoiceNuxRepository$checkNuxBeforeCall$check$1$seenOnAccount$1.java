package com.facebook.aura.partners.voice.infra;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1", f = "VoiceNuxRepository.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public int label;
    public final /* synthetic */ VoiceNuxRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1(VoiceNuxRepository voiceNuxRepository, HtJ<? super VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1> htJ) {
        super(1, htJ);
        this.this$0 = voiceNuxRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1(this.this$0, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return new VoiceNuxRepository$checkNuxBeforeCall$check$1$seenOnAccount$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceNuxRepository voiceNuxRepository = this.this$0;
            this.label = 1;
            obj = voiceNuxRepository.isSeenOnAccount(this);
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
}
