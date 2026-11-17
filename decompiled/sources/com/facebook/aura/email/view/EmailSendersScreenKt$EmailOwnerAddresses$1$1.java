package com.facebook.aura.email.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.email.model.EmailSender;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSendersScreenKt$EmailOwnerAddresses$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ String $addLabel;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<String> $removeId$delegate;
    public final /* synthetic */ EmailState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSendersScreenKt$EmailOwnerAddresses$1$1(EmailState emailState, String str, AuraNavigator auraNavigator, String str2, MutableState<String> mutableState) {
        super(3);
        this.$state = emailState;
        this.$addLabel = str;
        this.$navigator = auraNavigator;
        this.$environmentId = str2;
        this.$removeId$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        Function0 function0;
        C7384Etj.A0Y(c07c, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.AgE(946591146);
            EmailState emailState = this.$state;
            AHD<EmailSender> ahd = emailState.senders;
            AuraNavigator auraNavigator = this.$navigator;
            String str = this.$environmentId;
            MutableState<String> mutableState = this.$removeId$delegate;
            for (EmailSender emailSender : ahd) {
                String str2 = emailSender.emailAddress;
                String strSenderStatus = EmailSendersScreenKt.senderStatus(emailSender, bfm, 0);
                boolean z = !emailState.sendersBusy;
                if (emailSender.getCanVerify()) {
                    boolean zA1S = AnonymousClass004.A1S(bfm, str, emailSender, AnonymousClass001.A1Z(auraNavigator, bfm, -307417306));
                    Object objAaT = bfm.AaT();
                    if (zA1S || objAaT == C78N.A00) {
                        objAaT = new EmailSendersScreenKt$EmailOwnerAddresses$1$1$1$1$1(auraNavigator, str, emailSender);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                    AnonymousClass001.A1D(bfm);
                } else {
                    AnonymousClass003.A0l(bfm, -307297833);
                    function0 = null;
                }
                boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, emailSender);
                Object objAaT2 = bfm.AaT();
                if (zA1J || objAaT2 == C78N.A00) {
                    objAaT2 = new EmailSendersScreenKt$EmailOwnerAddresses$1$1$1$2$1(emailSender, mutableState);
                    bfm.Ai0(objAaT2);
                }
                EmailSettingsComponentsKt.EmailAddressRow(str2, z, (Function0) objAaT2, null, strSenderStatus, function0, bfm, 0, 8);
                EmailSettingsComponentsKt.EmailRowDivider(null, bfm, 0, 1);
            }
            AnonymousClass001.A1D(bfm);
            String str3 = this.$addLabel;
            boolean z2 = !this.$state.sendersBusy;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$environmentId, bfm.A67(this.$navigator));
            AuraNavigator auraNavigator2 = this.$navigator;
            String str4 = this.$environmentId;
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == C78N.A00) {
                objAaT3 = new EmailSendersScreenKt$EmailOwnerAddresses$1$1$2$1(auraNavigator2, str4);
                bfm.Ai0(objAaT3);
            }
            EmailSettingsComponentsKt.EmailAddRow(str3, z2, (Function0) objAaT3, null, bfm, 0, 8);
            return;
        }
        bfm.Afo();
    }
}
