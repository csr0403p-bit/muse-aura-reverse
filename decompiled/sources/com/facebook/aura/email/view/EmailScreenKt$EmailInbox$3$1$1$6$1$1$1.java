package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.keys.EmailThreadKey;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.viewmodel.EmailEventLogger;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$3$1$1$6$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailSummary $thread;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$3$1$1$6$1$1$1(EmailSummary emailSummary, int i, EmailInboxSessionViewModel emailInboxSessionViewModel, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$thread = emailSummary;
        this.$index = i;
        this.$inboxSession = emailInboxSessionViewModel;
        this.$navigator = auraNavigator;
        this.$environmentId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        EmailEventLogger.INSTANCE.threadOpened(this.$thread.id, this.$index);
        this.$inboxSession.isPageOnTop = true;
        this.$navigator.navigate((AuraNavKey) new EmailThreadKey(this.$environmentId, this.$thread.id), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
