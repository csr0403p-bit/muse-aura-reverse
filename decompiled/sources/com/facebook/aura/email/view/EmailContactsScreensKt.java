package com.facebook.aura.email.view;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailContactsScreensKt {

    /* renamed from: com.facebook.aura.email.view.EmailContactsScreensKt$EmailTrustedContactsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<EmailViewModel, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ String $environmentId;

        public final void invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i) {
            boolean zA1a = AnonymousClass002.A1a(emailViewModel, bRg);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailContactsScreensKt$EmailTrustedContactsScreen$1$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, emailViewModel);
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass007.A0H(bfm, bRg, C10G.A02), "email-trusted-contacts");
            String str = this.$environmentId;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            EmailSettingsComponentsKt.EmailNavHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209b5), null, false, bfm, 0, 6);
            EmailSettingsComponentsKt.EmailSettingsHelp(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120943), null, bfm, 0, 2);
            EmailSendersScreenKt.EmailOwnerAddresses(str, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209b5), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12099b), C1BO.A06(c1boA02), emailViewModel, null, null, null, bfm, (i << 12) & 57344, 224);
            BBI.A0R(bbi, zA1a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(4);
            this.$environmentId = str;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, Integer num) {
            invoke(emailViewModel, bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailContactsScreensKt$EmailTrustedContactsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
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
            EmailContactsScreensKt.EmailTrustedContactsScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailContactsScreensKt$EmailUnknownContactsScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C117611 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117611(String str, BRg bRg, int i, int i2) {
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
            EmailContactsScreensKt.EmailUnknownContactsScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailTrustedContactsScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1335607839);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            EmailComponentsKt.m747EmailSheetEnvironmentPfoAEA0(str, bRg2, null, true, false, 0.0f, B1V.A00(bfm, new AnonymousClass1(str), 754222917), bfm, (iA0d & 14) | 1575936 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 52);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg2, i, i2);
        }
    }

    public static final void EmailUnknownContactsScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1854065426);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            EmailComponentsKt.m747EmailSheetEnvironmentPfoAEA0(str, bRg2, null, true, false, 0.0f, ComposableSingletons$EmailContactsScreensKt.lambda$235765330, bfm, (iA0d & 14) | 1575936 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 52);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117611(str, bRg2, i, i2);
        }
    }
}
