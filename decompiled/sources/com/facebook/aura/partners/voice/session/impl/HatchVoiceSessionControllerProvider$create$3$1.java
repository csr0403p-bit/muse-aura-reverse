package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchVoiceSessionControllerProvider$create$3$1 extends C7438Evz implements G0U<String, Unit> {
    public HatchVoiceSessionControllerProvider$create$3$1(Object obj) {
        super(1, obj, SessionController.class, "onRtStartPhase", "onRtStartPhase$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((SessionController) AnonymousClass006.A0o(str, this)).onRtStartPhase$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
