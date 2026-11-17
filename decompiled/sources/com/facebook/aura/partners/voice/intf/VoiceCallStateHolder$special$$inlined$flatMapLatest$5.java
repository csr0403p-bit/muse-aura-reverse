package com.facebook.aura.partners.voice.intf;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BN;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3pU;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceCallStateHolder$special$$inlined$flatMapLatest$5", f = "VoiceCallStateHolder.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallStateHolder$special$$inlined$flatMapLatest$5 extends AbstractC07127nr implements G0W<C20Z<? super VoiceCallUiState>, C1BN<? extends VoiceCallUiState>, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;

    public VoiceCallStateHolder$special$$inlined$flatMapLatest$5(HtJ htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(C20Z<? super VoiceCallUiState> c20z, C1BN<? extends VoiceCallUiState> c1bn, HtJ<? super Unit> htJ) {
        VoiceCallStateHolder$special$$inlined$flatMapLatest$5 voiceCallStateHolder$special$$inlined$flatMapLatest$5 = new VoiceCallStateHolder$special$$inlined$flatMapLatest$5(htJ);
        voiceCallStateHolder$special$$inlined$flatMapLatest$5.L$0 = c20z;
        voiceCallStateHolder$special$$inlined$flatMapLatest$5.L$1 = c1bn;
        return voiceCallStateHolder$special$$inlined$flatMapLatest$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q c20y = (C20Q) obj2;
            if (c20y == null) {
                c20y = new C20Y(null);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c20y, c20z) == enumC10460Hji) {
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
}
