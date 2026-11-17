package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$2 extends AbstractC7559F3s implements G0U<List<? extends Object>, ConversationRestoreAnchor> {
    public static final HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$2 INSTANCE = new HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$2();

    public HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$2() {
        super(1);
    }

    @Override // X.G0U
    public final ConversationRestoreAnchor invoke(List<? extends Object> list) {
        C7384Etj.A0Y(list, 0);
        String str = (String) list.get(0);
        Object obj = list.get(1);
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Int");
        return new ConversationRestoreAnchor(str, AnonymousClass001.A0F(obj), (String) list.get(2));
    }
}
