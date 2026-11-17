package com.facebook.aura.email.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0V;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailAddressAvailability;
import com.facebook.aura.email.viewmodel.EmailHandleError;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailCreateFormKt$EmailCreateFields$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ EmailState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailCreateFormKt$EmailCreateFields$1$3(EmailState emailState, EmailViewModel emailViewModel) {
        super(2);
        this.$state = emailState;
        this.$model = emailViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            EmailState emailState = this.$state;
            EmailAddressAvailability emailAddressAvailability = emailState.addressAvailability;
            EmailHandleError handleError = emailState.getHandleError();
            EmailViewModel emailViewModel = this.$model;
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailCreateFormKt$EmailCreateFields$1$3$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            EmailCreateFormKt.EmailAvailabilityMessage(emailAddressAvailability, handleError, (Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 8);
            String strA01 = this.$state.setupDisplay.addressHelp;
            if (strA01 == null) {
                bfm.AgE(1684216375);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120948);
            } else {
                bfm.AgE(1684214763);
            }
            AnonymousClass001.A1D(bfm);
            EmailCreateFormKt.EmailFieldHelp(strA01, null, bfm, 0, 2);
            return;
        }
        bfm.Afo();
    }
}
