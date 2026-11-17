package com.facebook.aura.email.view;

import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C1515AkP;
import X.C1BO;
import X.C1b8;
import X.C2CK;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.email.model.EmailSender;
import com.facebook.aura.email.model.EmailSettingsCopy;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailSendersScreenKt {

    /* renamed from: com.facebook.aura.email.view.EmailSendersScreenKt$EmailHowItWorksCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = str2;
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
            EmailSendersScreenKt.EmailHowItWorksCard(this.$title, this.$body, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSendersScreenKt$EmailOwnerAddresses$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $addLabel;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ String $label;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Integer $removeMessage;
        public final /* synthetic */ String $removeTitle;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, String str3, EmailState emailState, EmailViewModel emailViewModel, BRg bRg, Integer num, String str4, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$label = str2;
            this.$removeTitle = str3;
            this.$state = emailState;
            this.$model = emailViewModel;
            this.$modifier = bRg;
            this.$removeMessage = num;
            this.$addLabel = str4;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSendersScreenKt.EmailOwnerAddresses(this.$environmentId, this.$label, this.$removeTitle, this.$state, this.$model, this.$modifier, this.$removeMessage, this.$addLabel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSendersScreenKt$EmailSendersScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C117804 extends AbstractC7559F3s implements G2j<C07C, EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ EmailSettingsCopy $copy;
        public final /* synthetic */ String $environmentId;

        public final void invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, int i) {
            AnonymousClass002.A1a(c07c, emailViewModel);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailSendersScreenKt$EmailSendersScreen$4$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, emailViewModel);
            if (C1BO.A06(c1boA02).senders.isEmpty() && C1BO.A06(c1boA02).sendersBusy) {
                bfm.AgE(875462319);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C07C.A00(c07c), bfm, 0, 0);
            } else {
                bfm.AgE(875559349);
                String strA01 = this.$copy.howItWorksTitle;
                if (strA01 == null) {
                    bfm.AgE(-941586087);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120973);
                } else {
                    bfm.AgE(-941586831);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                String strA012 = this.$copy.howItWorksBody;
                if (strA012 == null) {
                    bfm.AgE(-941583456);
                    strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209bb);
                } else {
                    bfm.AgE(-941584169);
                }
                BBI.A0R(bbi, false);
                EmailSendersScreenKt.EmailHowItWorksCard(strA01, strA012, null, bfm, 0, 4);
                C01N.A08(bfm, BRg.A00, 12.0f);
                String str = this.$environmentId;
                String strA013 = this.$copy.verifiedEmailListLabel;
                if (strA013 == null) {
                    bfm.AgE(-941577257);
                    strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209bd);
                } else {
                    bfm.AgE(-941578218);
                }
                BBI.A0R(bbi, false);
                String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12099e);
                EmailState emailStateA06 = C1BO.A06(c1boA02);
                Integer numValueOf = Integer.valueOf(R.string._name_removed__res_0x7f12099d);
                String strA015 = this.$copy.addEmailPageTitle;
                if (strA015 == null) {
                    bfm.AgE(-941568487);
                    strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120933);
                } else {
                    bfm.AgE(-941569293);
                }
                BBI.A0R(bbi, false);
                EmailSendersScreenKt.EmailOwnerAddresses(str, strA013, strA014, emailStateA06, emailViewModel, null, numValueOf, strA015, bfm, 57344 & (i << 9), 32);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117804(EmailSettingsCopy emailSettingsCopy, String str) {
            super(4);
            this.$copy = emailSettingsCopy;
            this.$environmentId = str;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(c07c, emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSendersScreenKt$EmailSendersScreen$5, reason: invalid class name */
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
            EmailSendersScreenKt.EmailSendersScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String senderStatus(EmailSender emailSender, BFM bfm, int i) {
        int i2;
        C7384Etj.A0Y(emailSender, 0);
        String str = emailSender.status;
        int iHashCode = str.hashCode();
        if (iHashCode != 35394935) {
            if (iHashCode != 355751840) {
                if (iHashCode == 1925346054 && str.equals("ACTIVE")) {
                    AnonymousClass003.A0l(bfm, 87857649);
                    return null;
                }
            } else if (str.equals("PROVISIONAL")) {
                bfm.AgE(-1798278278);
                i2 = R.string._name_removed__res_0x7f120997;
            }
            bfm.AgE(-1798276325);
            i2 = R.string._name_removed__res_0x7f120985;
        } else if (str.equals(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING)) {
            bfm.AgE(-1798280394);
            i2 = R.string._name_removed__res_0x7f120994;
        } else {
            bfm.AgE(-1798276325);
            i2 = R.string._name_removed__res_0x7f120985;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public static final void EmailHowItWorksCard(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-1112468157);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA02 = C3U4.A02(C1b8.A03(AnonymousClass001.A0R(bRgA0P), C06G.A0R(bfm), AnonymousClass002.A0c(bfm).card));
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 4.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16374);
            AuraTextKt.m2640AuraTextVmYn7U0(EmailIntroFooterKt.rememberEmailLinkText(str2, bfm, (iA0d >> 3) & 14), null, 0L, AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32758);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRgA0P, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailOwnerAddresses(java.lang.String r27, java.lang.String r28, java.lang.String r29, com.facebook.aura.email.viewmodel.EmailState r30, com.facebook.aura.email.viewmodel.EmailViewModel r31, X.BRg r32, java.lang.Integer r33, java.lang.String r34, X.BFM r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailSendersScreenKt.EmailOwnerAddresses(java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.email.viewmodel.EmailState, com.facebook.aura.email.viewmodel.EmailViewModel, X.BRg, java.lang.Integer, java.lang.String, X.BFM, int, int):void");
    }

    public static final void EmailSendersScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-277251721);
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
            int i4 = iA0d & 14;
            EmailSettingsCopy emailSettingsCopy = EmailProductNameKt.emailSettingsCopy(str, bfm, i4);
            String strA01 = emailSettingsCopy.verifiedEmailPageTitle;
            if (strA01 == null) {
                bfm.AgE(-150924952);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209b8);
            } else {
                bfm.AgE(-150925913);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "email-senders");
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailSendersScreenKt$EmailSendersScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = EmailSendersScreenKt$EmailSendersScreen$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U g0u2 = (G0U) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = EmailSendersScreenKt$EmailSendersScreen$3$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            EmailComponentsKt.EmailSettingsPage(str, strA01, bRgA00, false, g0u, false, null, null, g0u2, (G0U) objAaT3, null, B1V.A00(bfm, new C117804(emailSettingsCopy, str), -1994273686), bfm, i4 | 905994240, 48, 1256);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, bRg2, i, i2);
        }
    }
}
