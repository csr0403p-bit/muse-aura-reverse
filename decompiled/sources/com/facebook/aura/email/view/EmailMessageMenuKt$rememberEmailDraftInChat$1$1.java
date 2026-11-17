package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.email.model.EmailChatDraft;
import com.facebook.aura.email.viewmodel.EmailThreadExit;
import com.facebook.aura.email.viewmodel.EmailThreadSessionViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailMessageMenuKt$rememberEmailDraftInChat$1$1 extends AbstractC7559F3s implements G0V<EmailChatDraft, EmailThreadExit, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailThreadSessionViewModel $threadSession;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailMessageMenuKt$rememberEmailDraftInChat$1$1(EmailThreadSessionViewModel emailThreadSessionViewModel, HatchConversationViewModel hatchConversationViewModel, AuraNavigator auraNavigator) {
        super(2);
        this.$threadSession = emailThreadSessionViewModel;
        this.$viewModel = hatchConversationViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(EmailChatDraft emailChatDraft, EmailThreadExit emailThreadExit) {
        invoke2(emailChatDraft, emailThreadExit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EmailChatDraft emailChatDraft, EmailThreadExit emailThreadExit) {
        AnonymousClass003.A0u(emailChatDraft, emailThreadExit);
        this.$threadSession.exit = emailThreadExit;
        this.$viewModel.stageReplyDraft(emailChatDraft.text, emailChatDraft.attribution);
        AuraNavigator auraNavigator = this.$navigator;
        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
        auraNavigator.popToTabRoot(conversationTabScreenKey);
        this.$navigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
    }
}
