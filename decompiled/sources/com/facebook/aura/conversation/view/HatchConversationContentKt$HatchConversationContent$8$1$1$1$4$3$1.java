package com.facebook.aura.conversation.view;

import X.C7438Evz;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$3$1 extends C7438Evz implements Function0<Boolean> {
    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$3$1(Object obj) {
        super(0, obj, HatchConversationViewModel.class, "allowsFileAttachments", "allowsFileAttachments()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((HatchConversationViewModel) this.receiver).attachments.allowsFileAttachments());
    }
}
