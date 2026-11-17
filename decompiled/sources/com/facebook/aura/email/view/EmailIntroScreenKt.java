package com.facebook.aura.email.view;

import X.AHD;
import X.AKH;
import X.AKQ;
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
import X.C07C;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.email.model.EmailSetupDisplay;
import com.facebook.aura.email.model.EmailSetupPoint;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailIntroScreenKt {

    /* renamed from: com.facebook.aura.email.view.EmailIntroScreenKt$EmailIntroBullet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, String str, String str2, BRg bRg, int i2, int i3) {
            super(2);
            this.$icon = i;
            this.$title = str;
            this.$body = str2;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailIntroScreenKt.EmailIntroBullet(this.$icon, this.$title, this.$body, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailIntroScreenKt$EmailIntroBullets$2, reason: invalid class name and case insensitive filesystem */
    public final class C117672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailSetupDisplay $display;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117672(EmailSetupDisplay emailSetupDisplay, BRg bRg, int i, int i2) {
            super(2);
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
            EmailIntroScreenKt.EmailIntroBullets(this.$display, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailIntroScreenKt$EmailIntroHero$2, reason: invalid class name and case insensitive filesystem */
    public final class C117682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailSetupDisplay $display;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117682(String str, EmailSetupDisplay emailSetupDisplay, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
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
            EmailIntroScreenKt.EmailIntroHero(this.$name, this.$display, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailIntroScreenKt$EmailIntroScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<EmailState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraNavigator auraNavigator, String str, C1BO<EmailState> c1bo) {
            super(3);
            this.$navigator = auraNavigator;
            this.$environmentId = str;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(EmailViewModel emailViewModel, BFM bfm, int i) {
            EmailSetupDisplay emailSetupDisplay = C1BO.A06(this.$state$delegate).setupDisplay;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$environmentId, bfm.A67(this.$navigator));
            AuraNavigator auraNavigator = this.$navigator;
            String str = this.$environmentId;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new EmailIntroScreenKt$EmailIntroScreen$3$1$1(auraNavigator, str);
                bfm.Ai0(objAaT);
            }
            EmailIntroFooterKt.EmailIntroFooter(emailSetupDisplay, null, (Function0) objAaT, bfm, 0, 2);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailIntroScreenKt$EmailIntroScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C07C, EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ C1BO<String> $name$delegate;
        public final /* synthetic */ C1BO<EmailState> $state$delegate;

        public final void invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, int i) {
            boolean zA1a = AnonymousClass002.A1a(c07c, emailViewModel);
            if (C1BO.A06(this.$state$delegate).setupFailed) {
                bfm.AgE(-83877631);
                EmailError emailError = EmailError.SETUP;
                EmailViewModel emailViewModel2 = this.$model;
                boolean zA67 = bfm.A67(emailViewModel2);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new EmailIntroScreenKt$EmailIntroScreen$4$1$1(emailViewModel2);
                    bfm.Ai0(objAaT);
                }
                EmailComponentsKt.EmailRetry(emailError, (Function0) ((InterfaceC7353EnQ) objAaT), C07C.A00(c07c), bfm, 6, 0);
            } else if (C1BO.A06(this.$state$delegate).formLoading || !C1BO.A06(this.$state$delegate).setupLoaded) {
                bfm.AgE(-83873079);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C07C.A00(c07c), bfm, 0, 0);
            } else {
                bfm.AgE(-83870010);
                BRg bRgA0C = C3U4.A0C(AnonymousClass005.A0T(bfm, AbstractC07539Wl.A00(C07C.A00(c07c), "email-intro")), 16.0f, 0.0f, 16.0f, 24.0f);
                C9m9 c9m9A00 = AcQ.A00(20.0f);
                C1BO<String> c1bo = this.$name$delegate;
                C1BO<EmailState> c1bo2 = this.$state$delegate;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                EmailIntroScreenKt.EmailIntroHero(C1BO.A08(c1bo), C1BO.A06(c1bo2).setupDisplay, null, bfm, 0, 4);
                EmailIntroScreenKt.EmailIntroBullets(C1BO.A06(c1bo2).setupDisplay, null, bfm, 0, 2);
                BBI.A0R(bbi, zA1a);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(EmailViewModel emailViewModel, C1BO<EmailState> c1bo, C1BO<String> c1bo2) {
            super(4);
            this.$model = emailViewModel;
            this.$state$delegate = c1bo;
            this.$name$delegate = c1bo2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(c07c, emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailIntroScreenKt$EmailIntroScreen$5, reason: invalid class name */
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
            EmailIntroScreenKt.EmailIntroScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailIntroBullets(EmailSetupDisplay emailSetupDisplay, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(1280968664);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailSetupDisplay) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            bfm.AgE(-1236119010);
            AHD<EmailSetupPoint> ahd = emailSetupDisplay.introPoints;
            if (ahd != null) {
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1236084880);
                while (itA0w.hasNext()) {
                    EmailSetupPoint emailSetupPoint = (EmailSetupPoint) itA0w.next();
                    String str = emailSetupPoint.icon;
                    if ("forward".equals(str)) {
                        i3 = R.drawable.envelopeforward_outline_24_wght400;
                    } else {
                        boolean zEquals = "check".equals(str);
                        i3 = R.drawable.inboxarrowdown_outline_24_wght400;
                        if (zEquals) {
                            i3 = R.drawable.envelopebadgecheck_outline_24_wght400;
                        }
                    }
                    EmailIntroBullet(i3, emailSetupPoint.title, emailSetupPoint.description, null, bfm, 0, 8);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1235681260);
                BBI.A0R(bbi, false);
                EmailIntroBullet(R.drawable.inboxarrowdown_outline_24_wght400, AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f12097c), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12097b), null, bfm, 0, 8);
                EmailIntroBullet(R.drawable.envelopeforward_outline_24_wght400, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120979), AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120978), null, bfm, 0, 8);
                EmailIntroBullet(R.drawable.envelopebadgecheck_outline_24_wght400, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120977), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120976), null, bfm, 0, 8);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117672(emailSetupDisplay, bRg2, i, i2);
        }
    }

    public static final void EmailIntroBullet(int i, String str, String str2, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(784155891);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), 16.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(12.0f), bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(bs0, 4.0f), aVyA00, auraIconSize, null, jA0C, null, bfm, (AVy.$stable << 3) | 3462, 32);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 2.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 3) & 14, 0, 16374);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 6) & 14, 0, 16370);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, str, str2, bRg2, i2, i3);
        }
    }

    public static final void EmailIntroHero(String str, EmailSetupDisplay emailSetupDisplay, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-196576446);
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
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA0J);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.email_illustration, 0), 138.0f, null, B6A.A07, null, bfm, (AVy.$stable << 3) | 28032, 33);
            String strA0t = emailSetupDisplay.introTitle;
            if (strA0t == null) {
                bfm.AgE(-1583338516);
                strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f12097d);
            } else {
                bfm.AgE(-1583339198);
            }
            BBI.A0R(bbi, false);
            C1822Arm c1822ArmA0U = C06G.A0U(bfm);
            BRg bRgA07 = C3U4.A07(c1062ATq, 20.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailIntroScreenKt$EmailIntroHero$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bRgA07, objAaT, false), 0L, c1822ArmA0U, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16308);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117682(str, emailSetupDisplay, bRg2, i, i2);
        }
    }

    public static final void EmailIntroScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1818390747);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            int i4 = iA0d & 14;
            EmailViewModel emailViewModelRememberEmailViewModel = EmailComponentsKt.rememberEmailViewModel(str, bfm, i4);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModelRememberEmailViewModel.state);
            C1BO c1boA022 = C2CK.A02(bfm, AnonymousClass007.A0N(bfm).aiIdentityName);
            boolean zA1N = AnonymousClass003.A1N(bfm, emailViewModelRememberEmailViewModel, c1boA022);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new EmailIntroScreenKt$EmailIntroScreen$1$1(emailViewModelRememberEmailViewModel, c1boA022);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, emailViewModelRememberEmailViewModel);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = EmailIntroScreenKt$EmailIntroScreen$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            if (C1BO.A06(c1boA02).formLoading || !C1BO.A06(c1boA02).setupLoaded || C1BO.A06(c1boA02).setupFailed) {
                AnonymousClass003.A0l(bfm, -743062078);
                b1uA00 = null;
            } else {
                bfm.AgE(-743036967);
                b1uA00 = B1V.A00(bfm, new AnonymousClass3(auraNavigatorA0b, str, c1boA02), -766113277);
                AnonymousClass001.A1D(bfm);
            }
            EmailComponentsKt.EmailSettingsPage(str, "", bRg2, false, g0u, true, null, null, null, null, b1uA00, B1V.A00(bfm, new AnonymousClass4(emailViewModelRememberEmailViewModel, c1boA02, c1boA022), 674772302), bfm, 221232 | i4 | ((iA0d << 3) & 896), 48, 968);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, bRg2, i, i2);
        }
    }
}
