package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.composer.dictation.DictationGating;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$22$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public static final HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$22$1 INSTANCE = new HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$22$1();

    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$22$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(DictationGating.INSTANCE.isAppendEnabled());
    }
}
