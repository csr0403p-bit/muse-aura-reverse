package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.conversation.widget.api.ConversationTopBanner;

/* loaded from: classes.dex */
public final class HatchTopBannerKt$HatchTopBanner$3$1 extends AbstractC7559F3s implements G0U<ConversationTopBanner, Object> {
    public static final HatchTopBannerKt$HatchTopBanner$3$1 INSTANCE = new HatchTopBannerKt$HatchTopBanner$3$1();

    public HatchTopBannerKt$HatchTopBanner$3$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(ConversationTopBanner conversationTopBanner) {
        ConversationTopBanner conversationTopBanner2 = conversationTopBanner;
        if (conversationTopBanner2 != null) {
            return conversationTopBanner2.getKey();
        }
        return null;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ConversationTopBanner conversationTopBanner) {
        if (conversationTopBanner != null) {
            return conversationTopBanner.getKey();
        }
        return null;
    }
}
