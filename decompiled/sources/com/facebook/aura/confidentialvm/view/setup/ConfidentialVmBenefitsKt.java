package com.facebook.aura.confidentialvm.view.setup;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0881AGi;
import X.C0A8;
import X.C0jP;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1822Arm;
import X.C1YL;
import X.C1b8;
import X.C1ji;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropBullet;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropIcon;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropLink;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraJustified;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmBenefitsKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt$BundledConfidentialVmBenefits$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $learnMoreUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, int i) {
            super(2);
            this.$learnMoreUrl = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmBenefitsKt.BundledConfidentialVmBenefits(this.$learnMoreUrl, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt$ConfidentialVmAvailabilityNotice$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
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
            ConfidentialVmBenefitsKt.ConfidentialVmAvailabilityNotice(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt$ConfidentialVmBenefit$2, reason: invalid class name and case insensitive filesystem */
    public final class C112872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ApQ $body;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112872(int i, String str, ApQ apQ, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$title = str;
            this.$body = apQ;
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
            ConfidentialVmBenefitsKt.ConfidentialVmBenefit(this.$iconRes, this.$title, this.$body, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt$ConfidentialVmBenefits$1, reason: invalid class name and case insensitive filesystem */
    public final class C112881 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<ConfidentialVmValuePropBullet> $serverBullets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112881(BRg bRg, AHD<ConfidentialVmValuePropBullet> ahd, String str) {
            super(2);
            this.$modifier = bRg;
            this.$serverBullets = ahd;
            this.$learnMoreUrl = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BRg bRgA07 = C3U4.A07(this.$modifier, AuraDimensKt.SpacingMedium);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
                AHD<ConfidentialVmValuePropBullet> ahd = this.$serverBullets;
                String str = this.$learnMoreUrl;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
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
                if (!ahd.isEmpty()) {
                    Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 721282367);
                    while (itA0w.hasNext()) {
                        ConfidentialVmBenefitsKt.ServerConfidentialVmBenefit((ConfidentialVmValuePropBullet) itA0w.next(), null, bfm, 0, 2);
                    }
                } else {
                    bfm.AgE(721370934);
                    ConfidentialVmBenefitsKt.BundledConfidentialVmBenefits(str, bfm, 0);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt$ConfidentialVmBenefits$2, reason: invalid class name and case insensitive filesystem */
    public final class C112892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLearnMoreClick;
        public final /* synthetic */ AHD<ConfidentialVmValuePropBullet> $serverBullets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112892(AHD<ConfidentialVmValuePropBullet> ahd, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$serverBullets = ahd;
            this.$learnMoreUrl = str;
            this.$onLearnMoreClick = function0;
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
            ConfidentialVmBenefitsKt.ConfidentialVmBenefits(this.$serverBullets, this.$learnMoreUrl, this.$onLearnMoreClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt$ServerConfidentialVmBenefit$1, reason: invalid class name and case insensitive filesystem */
    public final class C112901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmValuePropBullet $bullet;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112901(ConfidentialVmValuePropBullet confidentialVmValuePropBullet, BRg bRg, int i, int i2) {
            super(2);
            this.$bullet = confidentialVmValuePropBullet;
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
            ConfidentialVmBenefitsKt.ServerConfidentialVmBenefit(this.$bullet, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ServerConfidentialVmBenefit(ConfidentialVmValuePropBullet confidentialVmValuePropBullet, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(1741529463);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, confidentialVmValuePropBullet) | i : i;
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
            long jA07 = C06G.A07(bfm);
            boolean zA65 = bfm.A65(confidentialVmValuePropBullet) | bfm.A64(jA07);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                String str = confidentialVmValuePropBullet.subtitle;
                AHD<ConfidentialVmValuePropLink> ahd = confidentialVmValuePropBullet.links;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    C06G.A0l(arrayListA0i, it);
                }
                objAaT = HatchLinkTextKt.m1189buildHatchLinkAnnotatedString9LQNqLg(str, arrayListA0i, jA07, C1736ApY.A03);
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            int iOrdinal = confidentialVmValuePropBullet.icon.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.aiincognito_outline_24_wght400;
            } else if (iOrdinal == 1) {
                i3 = R.drawable.agentic_outline_24_wght500;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.drawable.circle_info_wght400_outline_24;
            }
            ConfidentialVmBenefit(i3, confidentialVmValuePropBullet.title, apQ, bRg2, bfm, (iA0T << 6) & 7168, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112901(confidentialVmValuePropBullet, bRg2, i, i2);
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmValuePropIcon.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmValuePropIcon.SPEECH_BUBBLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmValuePropIcon.FOUR_DOTS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmValuePropIcon.INFO, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConfidentialVmAvailabilityNotice(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1160678284);
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
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).accent;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            long j2 = AnonymousClass001.A0f(bfm, akh).accent;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(C1b8.A03(bRgA0R, AnonymousClass002.A0e(bfm).banner, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.1f)), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall), j, c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmBenefit(int i, String str, ApQ apQ, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 1, apQ);
        bfm.AgG(-904545532);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, apQ);
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
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A05, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.SMALL, null, 0L, null, bfm, AnonymousClass001.A03(), 57);
            AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle = AuraHeadlineAndBodyStyle.TITLE3_MEDIUM_SUBHEADLINE_REGULAR;
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            AuraJustified auraJustified = AuraJustified.LEFT;
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            boolean zA1W = AnonymousClass006.A1W(iA0D);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = AGI.A0E(apQ);
                bfm.Ai0(objAaT);
            }
            AuraHeadlineAndBodyKt.m3097AuraHeadlineAndBodyZSrRDQQ(bRgA0O, auraHeadlineAndBodyStyle, str, auraJustified, null, (AHD) objAaT, null, null, 0, 0, null, null, null, null, null, AuraDimensKt.SpacingMicro, c1822ArmA0W, null, bfm, ((iA0D << 3) & 896) | 3120, 0, 163792);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112872(i, str, apQ, bRg2, i2, i3);
        }
    }

    public static final void BundledConfidentialVmBenefits(String str, BFM bfm, int i) {
        bfm.AgG(2098268788);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f12076e);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12076d);
            C0881AGi c0881AGi = C0881AGi.A00;
            ConfidentialVmBenefit(R.drawable.aiincognito_outline_24_wght400, strA0t, new ApQ(strA01, c0881AGi), null, bfm, 0, 8);
            ConfidentialVmBenefit(R.drawable.agentic_outline_24_wght500, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120768), new ApQ(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120767), c0881AGi), null, bfm, 0, 8);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12076a);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            long jA07 = C06G.A07(bfm);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12076b);
            boolean zA1B = AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1K(bfm, strA012, strA013) | bfm.A64(jA07);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA012);
                c1731ApSA0X.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                int iA01 = c1731ApSA0X.A01(new C1ji(HatchLinkTextKt.m1191hatchLinkStylesek8zF_U(jA07, C1736ApY.A03, null), str));
                try {
                    c1731ApSA0X.A0E(strA013);
                    c1731ApSA0X.A06(iA01);
                    objAaT = c1731ApSA0X.A04();
                    bfm.Ai0(objAaT);
                } catch (Throwable th) {
                    c1731ApSA0X.A06(iA01);
                    throw th;
                }
            }
            ConfidentialVmBenefit(R.drawable.circle_info_wght400_outline_24, strA014, (ApQ) objAaT, null, bfm, 0, 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConfidentialVmBenefits(AHD<ConfidentialVmValuePropBullet> ahd, String str, final Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AnonymousClass003.A0u(ahd, str);
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(599565445);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            final C0jP c0jPRememberHatchLinkUriHandler = HatchLinkTextKt.rememberHatchLinkUriHandler(AGH.A0E(), null, bfm, 6, 2);
            boolean zA65 = bfm.A65(c0jPRememberHatchLinkUriHandler) | ((iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new C0jP() { // from class: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt$ConfidentialVmBenefits$uriHandler$1$1
                    @Override // X.C0jP
                    public void openUri(String str2) {
                        C7384Etj.A0Y(str2, 0);
                        function0.invoke();
                        c0jPRememberHatchLinkUriHandler.openUri(str2);
                    }
                };
                bfm.Ai0(objAaT);
            }
            AnonymousClass006.A15(bfm, Am0.A0G.A04(objAaT), new C112881(bRg, ahd, str), 1772152773);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112892(ahd, str, function0, bRg, i, i2);
        }
    }
}
