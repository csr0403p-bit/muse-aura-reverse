package com.facebook.aura.email.view;

import X.AFz;
import X.AKL;
import X.AKQ;
import X.ARD;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1518AkS;
import X.C1822Arm;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7bA;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.app.Activity;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailSettingsCopy;
import com.facebook.aura.email.model.EmailSetupDisplay;
import com.facebook.aura.email.viewmodel.EmailOwnerChallenge;
import com.facebook.aura.email.viewmodel.EmailOwnerCodeError;
import com.facebook.aura.email.viewmodel.EmailOwnerCodeFailure;
import com.facebook.aura.email.viewmodel.EmailOwnerNotice;
import com.facebook.aura.email.viewmodel.EmailOwnerPrimaryAction;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.input.AuraCodeInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailOwnerConfirmationScreenKt {

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerAddressEntry$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fromSettings;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EmailViewModel emailViewModel, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$model = emailViewModel;
            this.$modifier = bRg;
            this.$fromSettings = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailOwnerConfirmationScreenKt.EmailOwnerAddressEntry(this.$model, this.$modifier, this.$fromSettings, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerCodeEntry$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $key;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailViewModel emailViewModel, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$model = emailViewModel;
            this.$key = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            EmailOwnerConfirmationScreenKt.EmailOwnerCodeEntry(this.$model, this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerCodeErrorMessage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailOwnerCodeFailure $failure;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmailOwnerCodeFailure emailOwnerCodeFailure, BRg bRg, int i, int i2) {
            super(2);
            this.$failure = emailOwnerCodeFailure;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            EmailOwnerConfirmationScreenKt.EmailOwnerCodeErrorMessage(this.$failure, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerCodeErrorMessage$3, reason: invalid class name and case insensitive filesystem */
    public final class C117703 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailOwnerCodeFailure $failure;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117703(EmailOwnerCodeFailure emailOwnerCodeFailure, BRg bRg, int i, int i2) {
            super(2);
            this.$failure = emailOwnerCodeFailure;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            EmailOwnerConfirmationScreenKt.EmailOwnerCodeErrorMessage(this.$failure, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationButtons$2, reason: invalid class name and case insensitive filesystem */
    public final class C117712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fromSettings;
        public final /* synthetic */ String $key;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $verifyExistingAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117712(EmailViewModel emailViewModel, String str, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$model = emailViewModel;
            this.$key = str;
            this.$modifier = bRg;
            this.$fromSettings = z;
            this.$verifyExistingAddress = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationButtons(this.$model, this.$key, this.$modifier, this.$fromSettings, this.$verifyExistingAddress, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C117722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailOwnerChallenge $challenge;
        public final /* synthetic */ String $codeAddress;
        public final /* synthetic */ EmailSetupDisplay $display;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117722(EmailOwnerChallenge emailOwnerChallenge, EmailSetupDisplay emailSetupDisplay, BRg bRg, String str, int i, int i2) {
            super(2);
            this.$challenge = emailOwnerChallenge;
            this.$display = emailSetupDisplay;
            this.$modifier = bRg;
            this.$codeAddress = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationHeader(this.$challenge, this.$display, this.$modifier, this.$codeAddress, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fromSettings;
        public final /* synthetic */ String $key;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ Function0<Unit> $onCompleted;
        public final /* synthetic */ String $verifyAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(EmailViewModel emailViewModel, String str, boolean z, String str2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$model = emailViewModel;
            this.$key = str;
            this.$fromSettings = z;
            this.$verifyAddress = str2;
            this.$onCompleted = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationLifecycle(this.$model, this.$key, this.$fromSettings, this.$verifyAddress, this.$onCompleted, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C117733 extends AbstractC7559F3s implements G0W<EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $fromSettings;
        public final /* synthetic */ String $key;
        public final /* synthetic */ String $verifyAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117733(String str, boolean z, String str2) {
            super(3);
            this.$key = str;
            this.$fromSettings = z;
            this.$verifyAddress = str2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(EmailViewModel emailViewModel, BFM bfm, int i) {
            C7384Etj.A0Y(emailViewModel, 0);
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationButtons(emailViewModel, this.$key, null, this.$fromSettings, AnonymousClass002.A1X(this.$verifyAddress), bfm, i & 14, 4);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C117744 extends AbstractC7559F3s implements G2j<C07C, EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $fromSettings;
        public final /* synthetic */ String $key;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $verifyAddress;

        public final void invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, int i) throws Resources.NotFoundException {
            C7384Etj.A0Y(emailViewModel, 1);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            String str = this.$key;
            boolean z = this.$fromSettings;
            String str2 = this.$verifyAddress;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1R(bfm, this.$key, bfm.A67(emailViewModel)));
            String str3 = this.$key;
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$4$1$1(emailViewModel, str3, auraNavigator);
                bfm.Ai0(objAaT);
            }
            int i2 = (i >> 3) & 14;
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationLifecycle(emailViewModel, str, z, str2, (Function0) objAaT, bfm, i2, 0);
            EmailOwnerChallenge emailOwnerChallenge = C1BO.A06(c1boA02).ownerChallenge;
            EmailSetupDisplay emailSetupDisplay = C1BO.A06(c1boA02).setupDisplay;
            String str4 = this.$verifyAddress;
            if (str4 == null) {
                EmailOwnerChallenge emailOwnerChallenge2 = C1BO.A06(c1boA02).ownerChallenge;
                str4 = emailOwnerChallenge2 != null ? emailOwnerChallenge2.address : null;
            }
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationHeader(emailOwnerChallenge, emailSetupDisplay, null, str4, bfm, 0, 4);
            int iA00 = C01N.A00(bfm, BRg.A00, 20.0f);
            if (this.$verifyAddress == null && C1BO.A06(c1boA02).ownerChallenge == null) {
                bfm.AgE(1101745512);
                EmailOwnerConfirmationScreenKt.EmailOwnerAddressEntry(emailViewModel, null, false, bfm, i2, iA00);
            } else {
                bfm.AgE(1101694982);
                EmailOwnerConfirmationScreenKt.EmailOwnerCodeEntry(emailViewModel, this.$key, null, bfm, i2, 4);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117744(String str, boolean z, String str2, AuraNavigator auraNavigator) {
            super(4);
            this.$key = str;
            this.$fromSettings = z;
            this.$verifyAddress = str2;
            this.$navigator = auraNavigator;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(c07c, emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ boolean $fromSettings;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $verifyAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, BRg bRg, boolean z, String str2, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$modifier = bRg;
            this.$fromSettings = z;
            this.$verifyAddress = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationScreen(this.$environmentId, this.$modifier, this.$fromSettings, this.$verifyAddress, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerNoticeMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C117751 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailOwnerNotice $notice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117751(EmailOwnerNotice emailOwnerNotice, BRg bRg, int i, int i2) {
            super(2);
            this.$notice = emailOwnerNotice;
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
            EmailOwnerConfirmationScreenKt.EmailOwnerNoticeMessage(this.$notice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerNoticeMessage$3, reason: invalid class name and case insensitive filesystem */
    public final class C117763 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailOwnerNotice $notice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117763(EmailOwnerNotice emailOwnerNotice, BRg bRg, int i, int i2) {
            super(2);
            this.$notice = emailOwnerNotice;
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
            EmailOwnerConfirmationScreenKt.EmailOwnerNoticeMessage(this.$notice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EmailOwnerPrimaryAction.values().length];
            try {
                AnonymousClass005.A0v(EmailOwnerPrimaryAction.RESEND_CODE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(EmailOwnerPrimaryAction.CONFIRM_ADDRESS, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(EmailOwnerPrimaryAction.VERIFY_CODE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EmailOwnerCodeError.values().length];
            try {
                AnonymousClass005.A0v(EmailOwnerCodeError.INCORRECT, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(EmailOwnerCodeError.EXPIRED, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(EmailOwnerCodeError.INVALID, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EmailOwnerNotice.values().length];
            try {
                AnonymousClass005.A0v(EmailOwnerNotice.REQUEST_COOLDOWN, iArr3, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(EmailOwnerNotice.RESEND_COOLDOWN, iArr3, 2);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void EmailOwnerAddressEntry(EmailViewModel emailViewModel, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        String strA01;
        String strA012;
        BRg bRg2 = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(emailViewModel, 0);
        bfm.AgG(2007445953);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailViewModel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            C1BO c1boA022 = C2CK.A02(bfm, emailViewModel.settingsCopy);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C1518AkS c1518AkS = (C1518AkS) AnonymousClass003.A0d(bfm, objAaT, obj);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zA1D = AnonymousClass003.A1D(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1D || objAaT2 == obj) {
                objAaT2 = new EmailOwnerConfirmationScreenKt$EmailOwnerAddressEntry$1$1(z2, c1518AkS, null);
                bfm.Ai0(objAaT2);
            }
            C78e.A06(bfm, boolValueOf, (G0V) objAaT2);
            BRg bRgA07 = C3U4.A07(bRg2, 20.0f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 10.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            if (z2) {
                bfm.AgE(319958210);
                strA01 = ((EmailSettingsCopy) c1boA022.getValue()).addEmailPlaceholder;
                if (strA01 == null) {
                    bfm.AgE(-543867228);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209bd);
                } else {
                    bfm.AgE(-543868096);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-543865208);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209af);
            }
            BBI.A0R(bbi, false);
            BRg bRgA00 = AbstractC07539Wl.A00(BHJ.A00(BRg.A00, c1518AkS), "email-owner-address");
            String str = C1BO.A06(c1boA02).ownerRecipient;
            boolean z3 = !C1BO.A06(c1boA02).confirmingOwner;
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new EmailOwnerConfirmationScreenKt$EmailOwnerAddressEntry$2$1$1(emailViewModel);
                bfm.Ai0(objAaT3);
            }
            EmailComponentsKt.EmailCardField(strA01, str, z3, (G0U) ((InterfaceC7353EnQ) objAaT3), null, new AuJ(null, -1, 6, -1), null, bRgA00, null, null, bfm, 196608, 848);
            EmailComponentsKt.EmailErrorMessage(C1BO.A06(c1boA02).ownerError, null, bfm, 0, 2);
            EmailOwnerNoticeMessage(C1BO.A06(c1boA02).ownerNotice, null, bfm, 0, 2);
            String str2 = C1BO.A06(c1boA02).setupDisplay.ownerEmailHelpWithLinks;
            if (str2 == null || z2) {
                bfm.AgE(320820413);
                if (z2) {
                    bfm.AgE(320848933);
                    strA012 = ((EmailSettingsCopy) c1boA022.getValue()).addEmailHelp;
                    if (strA012 == null) {
                        bfm.AgE(-543838712);
                        strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120934);
                    } else {
                        bfm.AgE(-543839363);
                    }
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(320949466);
                    strA012 = C1BO.A06(c1boA02).setupDisplay.ownerEmailHelp;
                    if (strA012 == null) {
                        bfm.AgE(-543834415);
                        strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12098f);
                    } else {
                        bfm.AgE(-543836120);
                    }
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, false);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(320624896);
                AuraTextKt.m2640AuraTextVmYn7U0(EmailIntroFooterKt.rememberEmailLinkText(str2, bfm, 0), null, C06G.A08(bfm), C06G.A0S(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(emailViewModel, bRg2, z2, i, i2);
        }
    }

    public static final void EmailOwnerCodeEntry(EmailViewModel emailViewModel, String str, BRg bRg, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        EmailOwnerCodeFailure emailOwnerCodeFailure;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(emailViewModel, str);
        bfm.AgG(1476131261);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            BRg bRgA0B = C3U4.A0B(bRg2, 20.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(12.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i4);
            String str2 = C1BO.A06(c1boA02).ownerCode;
            boolean z = (C1BO.A06(c1boA02).ownerChallenge == null || C1BO.A06(c1boA02).confirmingOwner || ((emailOwnerCodeFailure = C1BO.A06(c1boA02).ownerCodeFailure) != null && emailOwnerCodeFailure.getRequiresResend() == zA1a)) ? false : true;
            boolean zA1X = AnonymousClass002.A1X(C1BO.A06(c1boA02).ownerCodeFailure);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120989);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA00 = AbstractC07539Wl.A00(c1062ATq, "email-owner-code");
            boolean zA67 = bfm.A67(emailViewModel);
            int i5 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = zA67 | AnonymousClass002.A1Q(i5, 32);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new EmailOwnerConfirmationScreenKt$EmailOwnerCodeEntry$1$1$1(emailViewModel, str);
                bfm.Ai0(objAaT);
            }
            AuraCodeInputKt.m2586AuraCodeInputOOXMnFM(str2, (G0U) objAaT, 6, bRgA00, 0.0f, false, zA1X, 8, 0, false, false, z, strA01, null, bfm, 12586368, 0, 10032);
            EmailOwnerCodeErrorMessage(C1BO.A06(c1boA02).ownerCodeFailure, null, bfm, 0, 2);
            EmailComponentsKt.EmailErrorMessage(C1BO.A06(c1boA02).ownerError, null, bfm, 0, 2);
            EmailOwnerNoticeMessage(C1BO.A06(c1boA02).ownerNotice, null, bfm, 0, 2);
            if (C1BO.A06(c1boA02).ownerCodeResent) {
                bfm.AgE(1207972410);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12098b);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = EmailOwnerConfirmationScreenKt$EmailOwnerCodeEntry$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, AnonymousClass001.A0Y(bs0, objAaT2, false), 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16380);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1207400465);
                BBI.A0R(bbi, false);
            }
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12098a);
            AuraLabelButtonStyle auraLabelButtonStyleTertiary = AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, zA1a ? 1 : 0);
            boolean z2 = !C1BO.A06(c1boA02).confirmingOwner;
            BRg bRgA002 = AbstractC07539Wl.A00(c1062ATq, "email-owner-resend");
            boolean zA672 = bfm.A67(emailViewModel) | (i5 == 32);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new EmailOwnerConfirmationScreenKt$EmailOwnerCodeEntry$1$3$1(emailViewModel, str);
                bfm.Ai0(objAaT3);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA013, null, bRgA002, auraLabelButtonStyleTertiary, null, null, false, false, z2, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134200805);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(emailViewModel, str, bRg2, i, i2);
        }
    }

    public static final void EmailOwnerCodeErrorMessage(EmailOwnerCodeFailure emailOwnerCodeFailure, BRg bRg, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c117703;
        String strA01;
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(1674074527);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailOwnerCodeFailure) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (emailOwnerCodeFailure == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c117703 = new AnonymousClass1(emailOwnerCodeFailure, bRg2, i, i2);
                    bBbAAc.A06 = c117703;
                }
                return;
            }
            Integer num = emailOwnerCodeFailure.attemptsRemaining;
            int iOrdinal = emailOwnerCodeFailure.kind.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    bfm.AgE(-1827095180);
                    i3 = R.string._name_removed__res_0x7f120986;
                } else {
                    if (iOrdinal != 2) {
                        throw AnonymousClass005.A0k(bfm, -1827108192);
                    }
                    bfm.AgE(-1827092204);
                    i3 = R.string._name_removed__res_0x7f120988;
                }
                strA01 = AbstractC2271BQs.A01(bfm, i3);
            } else {
                bfm.AgE(-1827106061);
                if (num != null) {
                    bfm.AgE(-1827104677);
                    strA01 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100028, new Object[]{num}, bfm, num.intValue());
                } else {
                    bfm.AgE(-1827098218);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120987);
                }
                AnonymousClass001.A1D(bfm);
            }
            AnonymousClass001.A1D(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailOwnerConfirmationScreenKt$EmailOwnerCodeErrorMessage$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRg2, (G0U) objAaT, false), AnonymousClass002.A0c(bfm).errorText, C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c117703 = new C117703(emailOwnerCodeFailure, bRg2, i, i2);
            bBbAAc.A06 = c117703;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailOwnerConfirmationButtons(com.facebook.aura.email.viewmodel.EmailViewModel r46, java.lang.String r47, X.BRg r48, boolean r49, boolean r50, X.BFM r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationButtons(com.facebook.aura.email.viewmodel.EmailViewModel, java.lang.String, X.BRg, boolean, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailOwnerConfirmationHeader(com.facebook.aura.email.viewmodel.EmailOwnerChallenge r35, com.facebook.aura.email.model.EmailSetupDisplay r36, X.BRg r37, java.lang.String r38, X.BFM r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationHeader(com.facebook.aura.email.viewmodel.EmailOwnerChallenge, com.facebook.aura.email.model.EmailSetupDisplay, X.BRg, java.lang.String, X.BFM, int, int):void");
    }

    public static final void EmailOwnerConfirmationLifecycle(EmailViewModel emailViewModel, String str, boolean z, String str2, Function0<Unit> function0, BFM bfm, int i, int i2) {
        int i3;
        String str3 = str2;
        AnonymousClass003.A0u(emailViewModel, str);
        C7384Etj.A0Y(function0, 4);
        bfm.AgG(-1872505981);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i4 != 0) {
                str3 = null;
            }
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            boolean zA67 = bfm.A67(emailViewModel);
            int i5 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1V = AnonymousClass002.A1V(bfm, activity, AnonymousClass003.A1E(iA0T), AnonymousClass004.A1K(iA0T) | zA67 | AnonymousClass002.A1Q(i5, 32));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                i3 = 16384;
                objAaT = new EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$1$1(emailViewModel, str, z, str3, activity);
                bfm.Ai0(objAaT);
            } else {
                i3 = 16384;
            }
            int i6 = iA0T & 126;
            C78e.A03(bfm, emailViewModel, str, (G0U) objAaT);
            boolean zA1V2 = AnonymousClass002.A1V(bfm, activity, bfm.A67(emailViewModel), AnonymousClass002.A1Q(i5, 32));
            Object objAaT2 = bfm.AaT();
            if (zA1V2 || objAaT2 == C78N.A00) {
                objAaT2 = new EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$2$1(emailViewModel, str, activity);
                bfm.Ai0(objAaT2);
            }
            C7bA.A03(bfm, null, emailViewModel, str, (G0U) objAaT2, i6, 4);
            String str4 = C1BO.A06(c1boA02).ownerConfirmedKey;
            boolean zA65 = bfm.A65(c1boA02) | AnonymousClass002.A1Q(i5, 32) | ((57344 & iA0T) == i3);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$3$1(str, function0, c1boA02);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, str4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(emailViewModel, str, z, str3, function0, i, i2);
        }
    }

    public static final void EmailOwnerConfirmationScreen(String str, BRg bRg, boolean z, String str2, BFM bfm, int i, int i2) {
        boolean z2 = z;
        String str3 = str2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-199236766);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                str3 = null;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$key$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Object objA03 = AFz.A03(bfm, (Function0) objAaT, objArr);
            C7384Etj.A0U(objA03);
            String str4 = (String) objA03;
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "email-owner-confirmation");
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A65(str4), (iA0d & 7168) == 2048);
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$2$1(str3, str4, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            EmailComponentsKt.EmailSettingsPage(str, "", bRgA00, false, null, true, g0u, (G0U) objAaT3, null, null, B1V.A00(bfm, new C117733(str4, z2, str3), 580202846), B1V.A00(bfm, new C117744(str4, z2, str3, auraNavigatorA0b), 1367921551), bfm, (iA0d & 14) | 1769520, 54, 792);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, bRg2, z2, str3, i, i2);
        }
    }

    public static final void EmailOwnerNoticeMessage(EmailOwnerNotice emailOwnerNotice, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c117763;
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(858253021);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(emailOwnerNotice)) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (emailOwnerNotice == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c117763 = new C117751(emailOwnerNotice, bRg2, i, i2);
                    bBbAAc.A06 = c117763;
                }
                return;
            }
            int iOrdinal = emailOwnerNotice.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string._name_removed__res_0x7f120992;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string._name_removed__res_0x7f120993;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            C1822Arm c1822ArmA0S = C06G.A0S(bfm);
            long jA08 = C06G.A08(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailOwnerConfirmationScreenKt$EmailOwnerNoticeMessage$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRg2, (G0U) objAaT, false), jA08, c1822ArmA0S, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c117763 = new C117763(emailOwnerNotice, bRg2, i, i2);
            bBbAAc.A06 = c117763;
        }
    }
}
