package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.email.model.EmailChatDraft;
import com.facebook.aura.email.viewmodel.EmailThreadExit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailThreadActions$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<EmailChatDraft, EmailThreadExit, Unit> $draftInChat;
    public final /* synthetic */ EmailChatDraft $forwardDraft;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailThreadScreenKt$EmailThreadActions$1$2$1(G0V<? super EmailChatDraft, ? super EmailThreadExit, Unit> g0v, EmailChatDraft emailChatDraft) {
        super(0);
        this.$draftInChat = g0v;
        this.$forwardDraft = emailChatDraft;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$draftInChat.invoke(this.$forwardDraft, EmailThreadExit.FORWARD);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
