package com.facebook.aura.partners.voice.shortcut;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1", f = "VoiceCallShortcutActivity.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraSessionManager.SessionState.Active>, Object> {
    public int label;

    public VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1(HtJ<? super VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1$invokeSuspend$$inlined$filterIsInstance$1 voiceCallShortcutActivity$startCallWhenSignedIn$userSession$1$invokeSuspend$$inlined$filterIsInstance$1 = new VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1$invokeSuspend$$inlined$filterIsInstance$1(AuraSessionManager.state);
            this.label = 1;
            obj = AbstractC9777Gfy.A02(voiceCallShortcutActivity$startCallWhenSignedIn$userSession$1$invokeSuspend$$inlined$filterIsInstance$1, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super AuraSessionManager.SessionState.Active> htJ) {
        return new VoiceCallShortcutActivity$startCallWhenSignedIn$userSession$1(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
