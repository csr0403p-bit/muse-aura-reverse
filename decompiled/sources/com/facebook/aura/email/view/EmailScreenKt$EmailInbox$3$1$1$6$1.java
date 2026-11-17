package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0V;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$3$1$1$6$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailSummary $thread;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$3$1$1$6$1(EmailSummary emailSummary, int i, EmailInboxSessionViewModel emailInboxSessionViewModel, AuraNavigator auraNavigator, String str) {
        super(2);
        this.$thread = emailSummary;
        this.$index = i;
        this.$inboxSession = emailInboxSessionViewModel;
        this.$navigator = auraNavigator;
        this.$environmentId = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            EmailSummary emailSummary = this.$thread;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$environmentId, AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1T(bfm, this.$inboxSession, AnonymousClass001.A1a(bfm.A67(emailSummary), bfm, this.$index))));
            EmailSummary emailSummary2 = this.$thread;
            int i2 = this.$index;
            EmailInboxSessionViewModel emailInboxSessionViewModel = this.$inboxSession;
            AuraNavigator auraNavigator = this.$navigator;
            String str = this.$environmentId;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new EmailScreenKt$EmailInbox$3$1$1$6$1$1$1(emailSummary2, i2, emailInboxSessionViewModel, auraNavigator, str);
                bfm.Ai0(objAaT);
            }
            EmailScreenKt.EmailRow(emailSummary, (Function0) objAaT, null, bfm, 0, 4);
            return;
        }
        bfm.Afo();
    }
}
