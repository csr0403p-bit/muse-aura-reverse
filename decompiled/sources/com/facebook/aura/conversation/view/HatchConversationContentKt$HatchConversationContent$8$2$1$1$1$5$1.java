package com.facebook.aura.conversation.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$5$1 extends C7438Evz implements G0U<ContentItem, Unit> {
    public HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$5$1(Object obj) {
        super(1, obj, HatchConversationViewModel.class, "copyImage", "copyImage(Lcom/facebook/aura/file/view/api/ContentItem;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContentItem contentItem) {
        ((HatchConversationViewModel) AnonymousClass006.A0o(contentItem, this)).copyImage(contentItem);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ContentItem contentItem) {
        invoke2(contentItem);
        return Unit.INSTANCE;
    }
}
