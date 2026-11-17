package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.email.viewmodel.EmailState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailCreateFormKt$EmailCreateFields$1$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $agentName;
    public final /* synthetic */ EmailState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailCreateFormKt$EmailCreateFields$1$5(EmailState emailState, String str) {
        super(2);
        this.$state = emailState;
        this.$agentName = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            String strA0t = this.$state.setupDisplay.senderNameHelp;
            if (strA0t == null) {
                bfm.AgE(-1005224323);
                strA0t = AnonymousClass001.A0t(bfm, this.$agentName, R.string._name_removed__res_0x7f12094a);
            } else {
                bfm.AgE(-1005226028);
            }
            AnonymousClass001.A1D(bfm);
            EmailCreateFormKt.EmailFieldHelp(strA0t, null, bfm, 0, 2);
            EmailSenderNameErrorKt.EmailSenderNameError(this.$state, null, bfm, 0, 2);
            return;
        }
        bfm.Afo();
    }
}
