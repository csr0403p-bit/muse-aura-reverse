package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import X.HxE;
import java.util.List;

/* loaded from: classes4.dex */
public final class VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1 extends AbstractC7559F3s implements G0U<List<? extends String>, HxE<? extends String, ? extends String>> {
    public static final VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1 INSTANCE = new VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1();

    public VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final HxE<String, String> invoke2(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return C3cG.A0r(list.get(0), C8j4.A0q(list));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ HxE<? extends String, ? extends String> invoke(List<? extends String> list) {
        return invoke2((List<String>) list);
    }
}
