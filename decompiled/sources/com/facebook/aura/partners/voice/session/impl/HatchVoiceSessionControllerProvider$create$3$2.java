package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass006;
import X.C57m;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchVoiceSessionControllerProvider$create$3$2 extends C7438Evz implements G0U<C57m, Unit> {
    public HatchVoiceSessionControllerProvider$create$3$2(Object obj) {
        super(1, obj, SessionController.class, "onOrphanedSessionStarted", "onOrphanedSessionStarted$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(Lcom/facebook/rp/platform/metaai/MetaAiRealTimeSession;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C57m c57m) {
        ((SessionController) AnonymousClass006.A0o(c57m, this)).onOrphanedSessionStarted$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(c57m);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C57m c57m) {
        invoke2(c57m);
        return Unit.INSTANCE;
    }
}
