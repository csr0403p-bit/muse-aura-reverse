package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$restoreAnchor$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ MutableState<String> $initialScrollOwnerId$delegate;
    public final /* synthetic */ String $listOwnerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$restoreAnchor$2$1(String str, MutableState<String> mutableState) {
        super(0);
        this.$listOwnerId = str;
        this.$initialScrollOwnerId$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C7384Etj.areEqual(this.$initialScrollOwnerId$delegate.getValue(), this.$listOwnerId));
    }
}
