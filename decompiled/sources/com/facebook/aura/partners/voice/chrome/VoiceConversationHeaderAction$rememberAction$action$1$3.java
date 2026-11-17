package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import X.C1HY;
import X.C60K;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.api.ConversationHeaderContext;
import com.facebook.aura.header.api.HeaderActionPill;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceConversationHeaderAction$rememberAction$action$1$3 extends AbstractC7559F3s implements G0U<HeaderActionPill, Unit> {
    public final /* synthetic */ VoiceCallChromeState $chrome;
    public final /* synthetic */ C1BO<ConversationHeaderContext> $currentContext$delegate;
    public final /* synthetic */ C1HY $lifecycleOwner;
    public final /* synthetic */ C60K $window;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderActionPill headerActionPill) {
        C7384Etj.A0Y(headerActionPill, 0);
        VoiceCallChromeState voiceCallChromeState = this.$chrome;
        if (voiceCallChromeState != null) {
            voiceCallChromeState.setCallButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome(new CallButtonSource(headerActionPill, this.$lifecycleOwner, this.$window.AE1(), AnonymousClass002.A1Y(this.$currentContext$delegate.getValue().threadId)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceConversationHeaderAction$rememberAction$action$1$3(VoiceCallChromeState voiceCallChromeState, C1HY c1hy, C60K c60k, C1BO<ConversationHeaderContext> c1bo) {
        super(1);
        this.$chrome = voiceCallChromeState;
        this.$lifecycleOwner = c1hy;
        this.$window = c60k;
        this.$currentContext$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderActionPill headerActionPill) {
        invoke2(headerActionPill);
        return Unit.INSTANCE;
    }
}
