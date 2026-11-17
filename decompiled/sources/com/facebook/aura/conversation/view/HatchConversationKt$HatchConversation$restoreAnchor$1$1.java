package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$restoreAnchor$1$1 extends AbstractC7559F3s implements Function0<List<? extends HatchConversationListItem>> {
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$restoreAnchor$1$1(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
        super(0);
        this.$currentItems$delegate = c1bo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends HatchConversationListItem> invoke() {
        return this.$currentItems$delegate.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ List<? extends HatchConversationListItem> invoke() {
        return this.$currentItems$delegate.getValue();
    }
}
