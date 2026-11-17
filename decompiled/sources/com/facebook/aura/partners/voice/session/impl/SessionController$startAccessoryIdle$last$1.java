package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startAccessoryIdle$last$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startAccessoryIdle$last$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends String, ? extends Float>>, Object> {
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startAccessoryIdle$last$1(SessionController sessionController, HtJ<? super SessionController$startAccessoryIdle$last$1> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$startAccessoryIdle$last$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends String, ? extends Float>> htJ) {
        return invoke2(c3ux, (HtJ<? super HxE<String, Float>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        String strLastAccessoryIdlePath = voicePrefs.lastAccessoryIdlePath(this.this$0.userSession);
        if (strLastAccessoryIdlePath != null) {
            return C3cG.A0r(strLastAccessoryIdlePath, new Float(voicePrefs.lastAccessoryIdleFocusY(this.this$0.userSession)));
        }
        return null;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HxE<String, Float>> htJ) {
        return new SessionController$startAccessoryIdle$last$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
