package com.facebook.aura.partners.voice.shortcut;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity$startCallWhenSignedIn$2$1", f = "VoiceCallShortcutActivity.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCallShortcutActivity$startCallWhenSignedIn$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ VoiceCallShortcutActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallShortcutActivity$startCallWhenSignedIn$2$1(VoiceCallShortcutActivity voiceCallShortcutActivity, String str, HtJ<? super VoiceCallShortcutActivity$startCallWhenSignedIn$2$1> htJ) {
        super(2, htJ);
        this.this$0 = voiceCallShortcutActivity;
        this.$it = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallShortcutActivity$startCallWhenSignedIn$2$1(this.this$0, this.$it, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        VoiceCallShortcut.INSTANCE.reportUsed(AnonymousClass001.A0I(this.this$0), this.$it);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceCallShortcutActivity$startCallWhenSignedIn$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
