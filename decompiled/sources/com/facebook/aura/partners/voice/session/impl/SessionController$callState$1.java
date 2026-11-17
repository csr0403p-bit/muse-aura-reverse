package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import X.Hwg;
import android.net.Uri;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$callState$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$callState$1 extends AbstractC07127nr implements G2j<VoiceCallUiState, String, Uri, HtJ<? super VoiceCallUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    public SessionController$callState$1(HtJ<? super SessionController$callState$1> htJ) {
        super(4, htJ);
    }

    @Override // X.G2j
    public final Object invoke(VoiceCallUiState voiceCallUiState, String str, Uri uri, HtJ<? super VoiceCallUiState> htJ) {
        SessionController$callState$1 sessionController$callState$1 = new SessionController$callState$1(htJ);
        sessionController$callState$1.L$0 = voiceCallUiState;
        sessionController$callState$1.L$1 = str;
        sessionController$callState$1.L$2 = uri;
        return sessionController$callState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        VoiceCallUiState voiceCallUiState = (VoiceCallUiState) this.L$0;
        String str = (String) this.L$1;
        Object obj2 = this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return VoiceCallUiState.copy$default(voiceCallUiState, null, 0L, null, null, str, obj2 != null ? obj2.toString() : null, false, false, false, false, null, null, null, 0L, 0, false, null, 131023, null);
    }
}
