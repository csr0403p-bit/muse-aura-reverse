package com.facebook.aura.email.view;

import X.AFz;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C07C;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailAddSenderScreenKt {

    /* renamed from: com.facebook.aura.email.view.EmailAddSenderScreenKt$EmailAddSenderScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ String $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(3);
            this.$key = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(EmailViewModel emailViewModel, BFM bfm, int i) {
            C7384Etj.A0Y(emailViewModel, 0);
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationButtons(emailViewModel, this.$key, null, true, false, bfm, (i & 14) | 3072, 20);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailAddSenderScreenKt$EmailAddSenderScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C07C, EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ AuraNavigator $navigator;

        public final void invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, int i) throws Resources.NotFoundException {
            C7384Etj.A0Y(emailViewModel, 1);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailAddSenderScreenKt$EmailAddSenderScreen$4$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            int i2 = (i >> 3) & 14;
            C78e.A05(bfm, emailViewModel, (G0U) objAaT);
            String str = this.$key;
            boolean zA672 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new EmailAddSenderScreenKt$EmailAddSenderScreen$4$2$1(auraNavigator);
                bfm.Ai0(objAaT2);
            }
            int i3 = i2 | 384;
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationLifecycle(emailViewModel, str, true, null, (Function0) objAaT2, bfm, i3, 8);
            if (C1BO.A06(c1boA02).ownerChallenge != null) {
                bfm.AgE(1214909769);
                EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationHeader(C1BO.A06(c1boA02).ownerChallenge, C1BO.A06(c1boA02).setupDisplay, null, null, bfm, 0, 12);
                C01N.A08(bfm, BRg.A00, 20.0f);
                EmailOwnerConfirmationScreenKt.EmailOwnerCodeEntry(emailViewModel, this.$key, null, bfm, i2, 4);
            } else {
                bfm.AgE(1215070504);
                EmailOwnerConfirmationScreenKt.EmailOwnerAddressEntry(emailViewModel, null, true, bfm, i3, 2);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, AuraNavigator auraNavigator) {
            super(4);
            this.$key = str;
            this.$navigator = auraNavigator;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(c07c, emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailAddSenderScreenKt$EmailAddSenderScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailAddSenderScreenKt.EmailAddSenderScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailAddSenderScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-446230841);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailAddSenderScreenKt$EmailAddSenderScreen$key$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Object objA03 = AFz.A03(bfm, (Function0) objAaT, objArr);
            C7384Etj.A0U(objA03);
            String str2 = (String) objA03;
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            int i4 = iA0d & 14;
            String strA01 = EmailProductNameKt.emailSettingsCopy(str, bfm, i4).addEmailPageTitle;
            if (strA01 == null) {
                bfm.AgE(668900918);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120933);
            } else {
                bfm.AgE(668898934);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "email-add-sender");
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = EmailAddSenderScreenKt$EmailAddSenderScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA1J = AnonymousClass003.A1J(bfm, str2, auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == obj) {
                objAaT3 = new EmailAddSenderScreenKt$EmailAddSenderScreen$2$1(str2, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            EmailComponentsKt.EmailSettingsPage(str, strA01, bRgA00, false, null, false, g0u, (G0U) objAaT3, null, null, B1V.A00(bfm, new AnonymousClass3(str2), -1734176693), B1V.A00(bfm, new AnonymousClass4(str2, auraNavigatorA0b), -67719110), bfm, i4 | 1572864, 54, 824);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, bRg2, i, i2);
        }
    }
}
