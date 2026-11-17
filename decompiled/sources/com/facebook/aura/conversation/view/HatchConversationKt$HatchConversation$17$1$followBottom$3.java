package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$17$1$followBottom$3 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$17$1$followBottom$3(C1BO<Integer> c1bo) {
        super(0);
        this.$currentRowCount$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C1BO.A02(this.$currentRowCount$delegate));
    }
}
