package com.facebook.aura.conversation.viewmodel;

import X.C7384Etj;
import X.C7438Evz;
import X.G0U;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchConversationListMapper$mapMessage$inlineMediaItems$1 extends C7438Evz implements G0U<String, MarkdownMedia> {
    public static final HatchConversationListMapper$mapMessage$inlineMediaItems$1 INSTANCE = new HatchConversationListMapper$mapMessage$inlineMediaItems$1();

    public HatchConversationListMapper$mapMessage$inlineMediaItems$1() {
        super(1, HatchInlineMediaPreComputeKt.class, "parseMarkdownMedia", "parseMarkdownMedia(Ljava/lang/String;)Lcom/facebook/aura/conversation/viewmodel/MarkdownMedia;", 1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ MarkdownMedia invoke(String str) {
        String str2 = str;
        C7384Etj.A0Y(str2, 0);
        return HatchInlineMediaPreComputeKt.parseMarkdownMedia(str2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final MarkdownMedia invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        return HatchInlineMediaPreComputeKt.parseMarkdownMedia(str);
    }
}
