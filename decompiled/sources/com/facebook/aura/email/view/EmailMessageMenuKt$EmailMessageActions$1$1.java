package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.email.model.EmailChatDraft;
import com.facebook.aura.email.viewmodel.EmailThreadExit;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailMessageMenuKt$EmailMessageActions$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ G0V<EmailChatDraft, EmailThreadExit, Unit> $draftInChat;
    public final /* synthetic */ EmailChatDraft $forwardDraft;
    public final /* synthetic */ Function0<Unit> $onDelete;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ EmailChatDraft $replyDraft;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        G0V<EmailChatDraft, EmailThreadExit, Unit> g0v;
        EmailChatDraft emailChatDraft;
        EmailThreadExit emailThreadExit;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        if (i == 0) {
            g0v = this.$draftInChat;
            emailChatDraft = this.$replyDraft;
            emailThreadExit = EmailThreadExit.REPLY;
        } else if (i != 1) {
            if (i == 2) {
                this.$onDelete.invoke();
                return;
            }
            return;
        } else {
            g0v = this.$draftInChat;
            emailChatDraft = this.$forwardDraft;
            emailThreadExit = EmailThreadExit.FORWARD;
        }
        g0v.invoke(emailChatDraft, emailThreadExit);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailMessageMenuKt$EmailMessageActions$1$1(Function0<Unit> function0, G0V<? super EmailChatDraft, ? super EmailThreadExit, Unit> g0v, EmailChatDraft emailChatDraft, EmailChatDraft emailChatDraft2, Function0<Unit> function02) {
        super(1);
        this.$onDismiss = function0;
        this.$draftInChat = g0v;
        this.$replyDraft = emailChatDraft;
        this.$forwardDraft = emailChatDraft2;
        this.$onDelete = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
