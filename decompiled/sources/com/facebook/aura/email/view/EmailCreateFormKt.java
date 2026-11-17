package com.facebook.aura.email.view;

import X.AKH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C19h;
import X.C19i;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailAddressAvailability;
import com.facebook.aura.email.model.EmailSetupDisplay;
import com.facebook.aura.email.viewmodel.EmailHandleError;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailCreateFormKt {

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailAvailabilityIcon$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailAddressAvailability $availability;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailAddressAvailability emailAddressAvailability, BRg bRg, int i, int i2) {
            super(2);
            this.$availability = emailAddressAvailability;
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
            EmailCreateFormKt.EmailAvailabilityIcon(this.$availability, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailAvailabilityMessage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailAddressAvailability $availability;
        public final /* synthetic */ EmailHandleError $handleError;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EmailAddressAvailability emailAddressAvailability, EmailHandleError emailHandleError, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$availability = emailAddressAvailability;
            this.$handleError = emailHandleError;
            this.$onRetry = function0;
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
            EmailCreateFormKt.EmailAvailabilityMessage(this.$availability, this.$handleError, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailCreateFields$2, reason: invalid class name and case insensitive filesystem */
    public final class C117622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117622(EmailState emailState, EmailViewModel emailViewModel, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$state = emailState;
            this.$model = emailViewModel;
            this.$agentName = str;
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
            EmailCreateFormKt.EmailCreateFields(this.$state, this.$model, this.$agentName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailCreateForm$3, reason: invalid class name and case insensitive filesystem */
    public final class C117633 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117633(EmailState emailState, EmailViewModel emailViewModel, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$state = emailState;
            this.$model = emailViewModel;
            this.$agentName = str;
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
            EmailCreateFormKt.EmailCreateForm(this.$state, this.$model, this.$agentName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailCreateHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C117642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $agentName;
        public final /* synthetic */ EmailSetupDisplay $display;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117642(String str, EmailSetupDisplay emailSetupDisplay, BRg bRg, int i, int i2) {
            super(2);
            this.$agentName = str;
            this.$display = emailSetupDisplay;
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
            EmailCreateFormKt.EmailCreateHeader(this.$agentName, this.$display, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailCreateStatus$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $failed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$failed = z;
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
            EmailCreateFormKt.EmailCreateStatus(this.$failed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailCreateStatus$3, reason: invalid class name and case insensitive filesystem */
    public final class C117653 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $failed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117653(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$failed = z;
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
            EmailCreateFormKt.EmailCreateStatus(this.$failed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailCreateFormKt$EmailFieldHelp$1, reason: invalid class name and case insensitive filesystem */
    public final class C117661 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117661(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            EmailCreateFormKt.EmailFieldHelp(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EmailHandleError.values().length];
            try {
                AnonymousClass005.A0v(EmailHandleError.CHARACTERS, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(EmailHandleError.LENGTH, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(EmailHandleError.HYPHENS, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(EmailHandleError.LETTER, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EmailAddressAvailability.values().length];
            try {
                AnonymousClass005.A0v(EmailAddressAvailability.UNAVAILABLE, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(EmailAddressAvailability.INVALID, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(EmailAddressAvailability.FAILED, iArr2, 3);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(EmailAddressAvailability.UNKNOWN, iArr2, 4);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass002.A17(EmailAddressAvailability.CHECKING, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass002.A18(EmailAddressAvailability.AVAILABLE, iArr2);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void EmailAvailabilityIcon(EmailAddressAvailability emailAddressAvailability, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-405484303);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, emailAddressAvailability) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (emailAddressAvailability == EmailAddressAvailability.AVAILABLE) {
                bfm.AgE(1960316001);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.circle_check_wght400_filled_24, 0);
                AuraIconSize auraIconSize = AuraIconSize.X_SMALL;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120935);
                long j = AnonymousClass002.A0c(bfm).success;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = EmailCreateFormKt$EmailAvailabilityIcon$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraIconKt.m2567AuraIconFHprtrg(ARD.A01(bRg2, (G0U) objAaT, false), aVyA00, auraIconSize, strA01, j, null, bfm, AnonymousClass001.A03(), 32);
            } else {
                bfm.AgE(1960661031);
                AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, R.drawable.circle_x_wght400_filled_24, 0), AuraIconSize.X_SMALL, null, AnonymousClass002.A0c(bfm).errorText, null, bfm, ((iA08 >> 3) & 14) | 384 | (AVy.$stable << 3), 40);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(emailAddressAvailability, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailAvailabilityMessage(com.facebook.aura.email.model.EmailAddressAvailability r47, com.facebook.aura.email.viewmodel.EmailHandleError r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, X.BRg r50, X.BFM r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailCreateFormKt.EmailAvailabilityMessage(com.facebook.aura.email.model.EmailAddressAvailability, com.facebook.aura.email.viewmodel.EmailHandleError, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void EmailCreateFields(EmailState emailState, EmailViewModel emailViewModel, String str, BRg bRg, BFM bfm, int i, int i2) {
        C19h emailAddressTransformation;
        B1U b1uA00;
        BRg bRg2 = bRg;
        bfm.AgG(1522170951);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, emailViewModel);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), 32.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(16.0f), bfm, C2VU.A02, 6);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209ae);
            String str2 = emailState.handle;
            boolean z = !emailState.saving;
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailCreateFormKt$EmailCreateFields$1$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
            AuJ auJ = new AuJ(null, -1, 6, -1);
            if (emailState.domain.length() == 0) {
                bfm.AgE(1845326625);
                BBI.A0R(bbi, false);
                emailAddressTransformation = C19i.A00;
            } else {
                bfm.AgE(1845328081);
                String str3 = emailState.domain;
                long jA08 = C06G.A08(bfm);
                emailAddressTransformation = new EmailAddressTransformation(str3, HxS.A04(HDi.A0O[(int) (jA08 & 63)], B6A.A03(jA08), B6A.A02(jA08), B6A.A01(jA08), emailState.saving ? 0.3f : 1.0f));
                BBI.A0R(bbi, false);
            }
            if (hasFieldIcon(emailState.addressAvailability)) {
                bfm.AgE(1370915027);
                b1uA00 = B1V.A00(bfm, new EmailCreateFormKt$EmailCreateFields$1$2(emailState), 1577862267);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1371000835);
                BBI.A0R(bbi, false);
                b1uA00 = null;
            }
            EmailComponentsKt.EmailCardField(strA01, str2, z, g0u, null, auJ, emailAddressTransformation, null, b1uA00, B1V.A00(bfm, new EmailCreateFormKt$EmailCreateFields$1$3(emailState, emailViewModel), 962645345), bfm, 805502976, VoiceCallForegroundService.AVATAR_TARGET_PX);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209a6);
            String str4 = emailState.senderName;
            boolean z2 = !emailState.saving;
            boolean zA672 = bfm.A67(emailViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new EmailCreateFormKt$EmailCreateFields$1$4$1(emailViewModel);
                bfm.Ai0(objAaT2);
            }
            EmailComponentsKt.EmailCardField(strA012, str4, z2, (G0U) ((InterfaceC7353EnQ) objAaT2), null, null, null, null, null, B1V.A00(bfm, new EmailCreateFormKt$EmailCreateFields$1$5(emailState, str), 1987778584), bfm, 805306368, 496);
            EmailComponentsKt.EmailErrorMessage(emailState.formError, null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117622(emailState, emailViewModel, str, bRg2, i, i2);
        }
    }

    public static final void EmailCreateForm(EmailState emailState, EmailViewModel emailViewModel, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(emailState, emailViewModel, str);
        bfm.AgG(-784745006);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, emailViewModel);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strEmailDefaultSenderName = emailDefaultSenderName(AnonymousClass002.A0l(str), emailState.ownerFirstName, bfm, 0);
            boolean zA1N = AnonymousClass003.A1N(bfm, emailViewModel, strEmailDefaultSenderName);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new EmailCreateFormKt$EmailCreateForm$1$1(emailViewModel, strEmailDefaultSenderName);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, emailViewModel, strEmailDefaultSenderName);
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0T(bRg2), "email-form");
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, interfaceC1380AiAA00, akqA04, g0v);
            Integer numValueOf = Integer.valueOf(i4);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            BPg.A02(bfm, numValueOf, g0v2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            if (emailState.formLoading || emailState.setupFailed) {
                bfm.AgE(1502199384);
                BS0 bs0 = BRg.A00;
                BRg bRgA0A = C3U4.A0A(AnonymousClass001.A0R(c90l.AiP(bs0, 1.0f, zA1Z)), 16.0f, 24.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0A);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0vA0t);
                AnonymousClass003.A15(g0u, g0v2, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                EmailCreateHeader(str, emailState.setupDisplay, null, bfm, (iA0T >> 6) & 14, 4);
                EmailCreateStatus(emailState.setupFailed, c90l.AiP(bs0, 1.0f, zA1Z), bfm, 0, 0);
            } else {
                bfm.AgE(1502434116);
                BRg bRgA0A2 = C3U4.A0A(AnonymousClass007.A0H(bfm, AnonymousClass001.A0N(c90l, BRg.A00, zA1Z), C10G.A02), 16.0f, 24.0f);
                InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(AcQ.A00(24.0f), bfm, c3th, 6);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA0A2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA003, g0v);
                BPg.A02(bfm, akqA043, g0vA0t);
                AnonymousClass003.A15(g0u, g0v2, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                EmailCreateHeader(str, emailState.setupDisplay, null, bfm, (iA0T >> 6) & 14, 4);
                EmailCreateFields(emailState, emailViewModel, str, null, bfm, iA0T & 1022, 8);
            }
            AnonymousClass002.A0z(bbi, zA1Z, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117633(emailState, emailViewModel, str, bRg2, i, i2);
        }
    }

    public static final void EmailCreateHeader(String str, EmailSetupDisplay emailSetupDisplay, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1808352077);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, emailSetupDisplay);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, 4.0f);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, iA0J);
            String strA0t = emailSetupDisplay.addressTitle;
            if (strA0t == null) {
                bfm.AgE(-1038190301);
                strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f12094c);
            } else {
                bfm.AgE(-1038191045);
            }
            BBI.A0R(bbi, false);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            C1822Arm c1822Arm = AnonymousClass001.A0g(bfm, akh).title2Emphasized;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailCreateFormKt$EmailCreateHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(c1062ATq, objAaT, false), 0L, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16308);
            String strA01 = emailSetupDisplay.addressSubtitle;
            if (strA01 == null) {
                bfm.AgE(-1038181477);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12094b);
            } else {
                bfm.AgE(-1038182314);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, c1062ATq, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117642(str, emailSetupDisplay, bRg2, i, i2);
        }
    }

    public static final void EmailCreateStatus(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c117653;
        BRg bRg2 = bRg;
        bfm.AgG(-2124419506);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (!z) {
                bfm.AgE(2056659055);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0R(bRg2), bfm, 0, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c117653 = new AnonymousClass1(z, bRg2, i, i2);
                    bBbAAc.A06 = c117653;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 2056725364);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120967);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA08 = C06G.A08(bfm);
            BRg bRgA07 = C3U4.A07(C10G.A01(C2VU.A04, AnonymousClass001.A0R(bRg2), false), 32.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailCreateFormKt$EmailCreateStatus$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA07, objAaT, false), jA08, c1822ArmA0T, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c117653 = new C117653(z, bRg2, i, i2);
            bBbAAc.A06 = c117653;
        }
    }

    public static final void EmailFieldHelp(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1133817758);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0R(bRg2), C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117661(str, bRg2, i, i2);
        }
    }

    public static final boolean hasFieldIcon(EmailAddressAvailability emailAddressAvailability) {
        return emailAddressAvailability == EmailAddressAvailability.AVAILABLE || emailAddressAvailability == EmailAddressAvailability.UNAVAILABLE || emailAddressAvailability == EmailAddressAvailability.INVALID;
    }

    public static final String emailDefaultSenderName(String str, String str2, BFM bfm, int i) {
        if (str.length() == 0) {
            AnonymousClass004.A1A(bfm, 1536671885);
            return "";
        }
        if (str2 == null) {
            bfm.AgE(-1890091462);
        } else {
            bfm.AgE(-1890090622);
            str = AnonymousClass006.A0w(bfm, str, str2, R.string._name_removed__res_0x7f12094e);
        }
        AnonymousClass002.A19(bfm);
        return str;
    }
}
