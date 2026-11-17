package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConversationSearchScreenKt$lambda$1268436023$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConversationSearchScreenKt$lambda$1268436023$1 INSTANCE = new ComposableSingletons$ConversationSearchScreenKt$lambda$1268436023$1();

    public ComposableSingletons$ConversationSearchScreenKt$lambda$1268436023$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            ConversationSearchScreenKt.SearchNullState(bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
