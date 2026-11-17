package com.facebook.aura.conversation.viewmodel;

import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.markdown.render.block.CustomBlockRenderersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchConversationListMapper$mapMessage$rendersNothing$1 extends C7438Evz implements G0U<String, Boolean> {
    public static final HatchConversationListMapper$mapMessage$rendersNothing$1 INSTANCE = new HatchConversationListMapper$mapMessage$rendersNothing$1();

    @Override // X.G0U
    public final Boolean invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return Boolean.valueOf(CustomBlockRenderersKt.markdownRendersNothing(str));
    }

    public HatchConversationListMapper$mapMessage$rendersNothing$1() {
        super(1, CustomBlockRenderersKt.class, "markdownRendersNothing", "markdownRendersNothing(Ljava/lang/String;)Z", 1);
    }
}
