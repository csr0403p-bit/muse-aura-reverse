package com.facebook.aura.email.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1BO;
import X.C2CK;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailSettingsScreenKt$lambda$1327618784$1 extends AbstractC7559F3s implements G0W<EmailViewModel, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailSettingsScreenKt$lambda$1327618784$1 INSTANCE = new ComposableSingletons$EmailSettingsScreenKt$lambda$1327618784$1();

    public ComposableSingletons$EmailSettingsScreenKt$lambda$1327618784$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BFM bfm, Integer num) {
        invoke(emailViewModel, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(EmailViewModel emailViewModel, BFM bfm, int i) {
        C7384Etj.A0Y(emailViewModel, 0);
        C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209a4);
        boolean zCanSave = emailViewModel.canSave(true);
        boolean z = C1BO.A06(c1boA02).saving;
        BRg bRgA0B = C3U4.A0B(C10G.A02, C06G.A00(bfm), 12.0f);
        boolean zA67 = bfm.A67(emailViewModel);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$EmailSettingsScreenKt$lambda$1327618784$1$1$1(emailViewModel);
            bfm.Ai0(objAaT);
        }
        AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0B, null, null, null, false, false, zCanSave, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134199797);
    }
}
