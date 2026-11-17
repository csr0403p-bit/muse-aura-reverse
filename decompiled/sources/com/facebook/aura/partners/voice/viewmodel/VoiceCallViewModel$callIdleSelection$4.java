package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel$callIdleSelection$4", f = "VoiceCallViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallViewModel$callIdleSelection$4 extends AbstractC07127nr implements G0W<CallIdleState, CallIdleInputs, HtJ<? super CallIdleState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public VoiceCallViewModel$callIdleSelection$4(HtJ<? super VoiceCallViewModel$callIdleSelection$4> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(CallIdleState callIdleState, CallIdleInputs callIdleInputs, HtJ<? super CallIdleState> htJ) {
        VoiceCallViewModel$callIdleSelection$4 voiceCallViewModel$callIdleSelection$4 = new VoiceCallViewModel$callIdleSelection$4(htJ);
        voiceCallViewModel$callIdleSelection$4.L$0 = callIdleState;
        voiceCallViewModel$callIdleSelection$4.L$1 = callIdleInputs;
        return voiceCallViewModel$callIdleSelection$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        CallIdleState callIdleState = (CallIdleState) this.L$0;
        CallIdleInputs callIdleInputs = (CallIdleInputs) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return callIdleState.next(callIdleInputs);
    }
}
