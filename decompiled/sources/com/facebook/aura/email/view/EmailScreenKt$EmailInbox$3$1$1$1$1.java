package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$3$1$1$1$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailRestrictionNotice $notice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$3$1$1$1$1(EmailRestrictionNotice emailRestrictionNotice, EmailInboxSessionViewModel emailInboxSessionViewModel, AuraNavigator auraNavigator, String str) {
        super(3);
        this.$notice = emailRestrictionNotice;
        this.$inboxSession = emailInboxSessionViewModel;
        this.$navigator = auraNavigator;
        this.$environmentId = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            EmailRestrictionNotice emailRestrictionNotice = this.$notice;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$environmentId, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$inboxSession)));
            EmailInboxSessionViewModel emailInboxSessionViewModel = this.$inboxSession;
            AuraNavigator auraNavigator = this.$navigator;
            String str = this.$environmentId;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new EmailScreenKt$EmailInbox$3$1$1$1$1$1$1(emailInboxSessionViewModel, auraNavigator, str);
                bfm.Ai0(objAaT);
            }
            EmailRestrictionCardKt.EmailRestrictionCard(emailRestrictionNotice, (G0U) objAaT, null, bfm, 0, 4);
            return;
        }
        bfm.Afo();
    }
}
