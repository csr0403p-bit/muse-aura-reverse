package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
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
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0A8;
import X.C0dm;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C2VU;
import X.C3U4;
import X.C3UC;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC04981Yd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconDefaults;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutAmountRowKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutAmountRowKt$CheckoutAmountChevron$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $wrapping;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$wrapping = z;
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
            CheckoutAmountRowKt.CheckoutAmountChevron(this.$wrapping, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutAmountRowKt$CheckoutAmountChildRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutAmountPresentation $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $stacked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheckoutAmountPresentation checkoutAmountPresentation, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$data = checkoutAmountPresentation;
            this.$stacked = z;
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
            CheckoutAmountRowKt.CheckoutAmountChildRow(this.$data, this.$stacked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutAmountRowKt$CheckoutAmountDueAtPropertyNote$1, reason: invalid class name and case insensitive filesystem */
    public final class C107851 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107851(BRg bRg, int i, int i2) {
            super(2);
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
            CheckoutAmountRowKt.CheckoutAmountDueAtPropertyNote(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutAmountRowKt$CheckoutAmountLine$3, reason: invalid class name and case insensitive filesystem */
    public final class C107863 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutAmountPresentation $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showChevron;
        public final /* synthetic */ boolean $stacked;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107863(CheckoutAmountPresentation checkoutAmountPresentation, boolean z, boolean z2, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$data = checkoutAmountPresentation;
            this.$stacked = z;
            this.$showChevron = z2;
            this.$totalPromoCaption = str;
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
            CheckoutAmountRowKt.CheckoutAmountLine(this.$data, this.$stacked, this.$showChevron, this.$totalPromoCaption, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutAmountRowKt$CheckoutAmountRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutAmountPresentation $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $onClickLabel;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheckoutAmountPresentation checkoutAmountPresentation, BRg bRg, Function0<Unit> function0, String str, String str2, int i, int i2) {
            super(2);
            this.$data = checkoutAmountPresentation;
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$onClickLabel = str;
            this.$totalPromoCaption = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutAmountRowKt.CheckoutAmountRow(this.$data, this.$modifier, this.$onClick, this.$onClickLabel, this.$totalPromoCaption, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CheckoutAmountChevron(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        long jM2566colorsWaAFU9c;
        BRg bRg2 = bRg;
        bfm.AgG(-1492461270);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AVy aVyA00 = BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0);
            if (z) {
                bfm.AgE(263804370);
                jM2566colorsWaAFU9c = AuraIconDefaults.INSTANCE.m2566colorsWaAFU9c(bfm, 6);
            } else {
                jM2566colorsWaAFU9c = C3cI.A0K(bfm, 263805366).tertiaryText;
            }
            AnonymousClass001.A1D(bfm);
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, aVyA00, AuraIconSize.X_SMALL, null, jM2566colorsWaAFU9c, null, bfm, ((iA0n >> 3) & 14) | 3456 | (AVy.$stable << 3), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutAmountLabel.values().length];
            try {
                AnonymousClass002.A13(CheckoutAmountLabel.PROVIDED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CheckoutAmountLabel.ORDER_TOTAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(CheckoutAmountLabel.STAY_TOTAL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(CheckoutAmountLabel.BASE_RATE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(CheckoutAmountLabel.TAXES_AND_FEES, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(CheckoutAmountLabel.PROPERTY_FEES, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(CheckoutAmountLabel.DUE_NOW, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(CheckoutAmountLabel.DUE_AT_PROPERTY, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0160 A[PHI: r0 r4
  0x0160: PHI (r0v16 X.BBI) = (r0v14 X.BBI), (r0v21 X.BBI) binds: [B:30:0x0139, B:20:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x0160: PHI (r4v9 int) = (r4v7 int), (r4v13 int) binds: [B:30:0x0139, B:20:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckoutAmountChildRow(com.facebook.aura.agentpermission.CheckoutAmountPresentation r33, boolean r34, X.BRg r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutAmountRowKt.CheckoutAmountChildRow(com.facebook.aura.agentpermission.CheckoutAmountPresentation, boolean, X.BRg, X.BFM, int, int):void");
    }

    public static final void CheckoutAmountDueAtPropertyNote(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(955900065);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120105);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107851(bRg2, i, i2);
        }
    }

    public static final void CheckoutAmountLine(CheckoutAmountPresentation checkoutAmountPresentation, boolean z, boolean z2, String str, BRg bRg, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        C1822Arm c1822ArmA0C;
        long jA06;
        InterfaceC04981Yd interfaceC04981YdA00;
        C1AC c1ac;
        long jA062;
        BRg bRgA00;
        int i3;
        int i4;
        int i5;
        BRg bRg2 = bRg;
        bfm.AgG(-1590660864);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(checkoutAmountPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i6 != 0) {
                bRg2 = BRg.A00;
            }
            if (checkoutAmountPresentation.emphasized) {
                bfm.AgE(383274862);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0C = C3cH.A0D(bfm, auraTheme);
            } else {
                bfm.AgE(383276171);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (checkoutAmountPresentation.subdued) {
                bfm.AgE(383278509);
                jA06 = C3cH.A07(bfm, auraTheme);
            } else {
                bfm.AgE(383279659);
                jA06 = C3cH.A06(bfm, auraTheme);
            }
            BBI.A0R(bbi, false);
            boolean zA1Z = AnonymousClass002.A1Z(checkoutAmountPresentation.layout, CheckoutAmountLayout.WRAPPING);
            String strCheckoutAmountLabel = checkoutAmountLabel(checkoutAmountPresentation, bfm, (iA05 & 14) | CheckoutAmountPresentation.$stable);
            String str2 = checkoutAmountPresentation.amount;
            if (z) {
                bfm.AgE(-1003065615);
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
                int iA02 = C3cG.A02(bbi.A06);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                    G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                    C1AC c1ac2 = C2VU.A04;
                    BS0 bs0 = BRg.A00;
                    InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac2);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bs0);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0W, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    AuraTextKt.m2639AuraTextUY9GdpU(strCheckoutAmountLabel, C90m.A00.AiP(bs0, 1.0f, true), 0L, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
                    if (z2) {
                        bfm.AgE(-816855695);
                        CheckoutAmountChevron(true, null, bfm, 6, 2);
                    } else {
                        bfm.AgE(447313751);
                    }
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, true);
                    if (checkoutAmountPresentation.dueAtPropertyNote) {
                        bfm.AgE(1361585392);
                        CheckoutAmountDueAtPropertyNote(null, bfm, 0, 1);
                    } else {
                        bfm.AgE(-740494093);
                    }
                    BBI.A0R(bbi, false);
                    if (str2 == null) {
                        bfm.AgE(-740477261);
                    } else {
                        bfm.AgE(-740477260);
                        AuraTextKt.m2639AuraTextUY9GdpU(str2, null, jA06, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    }
                    AnonymousClass002.A0z(bbi, false, true);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(-1002614720);
            if (zA1Z) {
                interfaceC04981YdA00 = AcQ.A00(AuraDimensKt.SpacingSmall);
                c1ac = C2VU.A05;
            } else {
                interfaceC04981YdA00 = AcQ.A01;
                c1ac = C2VU.A04;
            }
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981YdA00, bfm, c1ac, 0);
            int iA022 = C3cG.A02(bbi.A06);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V != null) {
                AnonymousClass005.A0n(bfm, bbi, function02);
                G0V g0vA0v2 = C3cH.A0v(bfm, interfaceC1380AiAA002);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA192 = AnonymousClass004.A19(bfm, akqA043, g0v2, iA022);
                G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
                G0V g0vA0u2 = AnonymousClass002.A0u(bfm, bRgA013, g0u2);
                C90m c90m = C90m.A00;
                BS0 bs02 = BRg.A00;
                BRg bRgAiP = c90m.AiP(bs02, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgAiP);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v2);
                BPg.A02(bfm, akqA044, g0v2);
                AnonymousClass003.A15(g0u2, g0vA192, bfm, iA0D2);
                BPg.A02(bfm, bRgA014, g0vA0u2);
                if (zA1Z) {
                    bfm.AgE(-1032934547);
                    BBI.A0R(bbi, false);
                    jA062 = B6A.A07;
                } else {
                    bfm.AgE(-1032933459);
                    jA062 = C3cH.A06(bfm, auraTheme);
                    BBI.A0R(bbi, false);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strCheckoutAmountLabel, null, jA062, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                if (checkoutAmountPresentation.dueAtPropertyNote) {
                    bfm.AgE(-1032931549);
                    CheckoutAmountDueAtPropertyNote(null, bfm, 0, 1);
                } else {
                    bfm.AgE(-1956075232);
                }
                BBI.A0R(bbi, false);
                if (str == null) {
                    bfm.AgE(-1956046310);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-1956046309);
                    CheckoutApprovalSharedKt.CheckoutTotalPromoCaption(str, null, bfm, 0, 2);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, true);
                if (str2 != null) {
                    bfm.AgE(1583482869);
                    if (checkoutAmountPresentation.layout == CheckoutAmountLayout.SUMMARY) {
                        bfm.AgE(605270205);
                        C01N.A09(bfm, bs02, AuraDimensKt.SpacingMedium);
                    } else {
                        bfm.AgE(1583542730);
                    }
                    BBI.A0R(bbi, false);
                    if (zA1Z) {
                        Object objA0p = AnonymousClass001.A0p(bfm, 605274498);
                        if (objA0p == C78N.A00) {
                            objA0p = CheckoutAmountRowKt$CheckoutAmountLine$2$amountModifier$1$1.INSTANCE;
                            bfm.Ai0(objA0p);
                        }
                        bRgA00 = C3UC.A00(bs02, (G0W) objA0p);
                        BBI.A0R(bbi, false);
                        i3 = Integer.MAX_VALUE;
                        i4 = 1;
                        i5 = 6;
                    } else {
                        bfm.AgE(605292256);
                        BBI.A0R(bbi, false);
                        bRgA00 = bs02;
                        i3 = 1;
                        i4 = 2;
                        i5 = 0;
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(str2, bRgA00, jA06, c1822ArmA0C, null, null, C3cH.A0F(i5), false, 0, i3, i4, null, null, null, bfm, 0, 0, 14768);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1584579370);
                    BBI.A0R(bbi, false);
                }
                if (z2) {
                    bfm.AgE(1584606557);
                    if (zA1Z) {
                        bfm.AgE(1584663690);
                    } else {
                        bfm.AgE(605306396);
                        C01N.A09(bfm, bs02, AuraDimensKt.SpacingSmall);
                    }
                    BBI.A0R(bbi, false);
                    CheckoutAmountChevron(zA1Z, null, bfm, 0, 2);
                } else {
                    bfm.AgE(1584711306);
                }
                AnonymousClass002.A0z(bbi, false, true);
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107863(checkoutAmountPresentation, z, z2, str, bRg2, i, i2);
        }
    }

    public static final void CheckoutAmountRow(CheckoutAmountPresentation checkoutAmountPresentation, BRg bRg, Function0<Unit> function0, String str, String str2, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        boolean z;
        Function0<Unit> function02 = function0;
        String str3 = str;
        String str4 = str2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(checkoutAmountPresentation, 0);
        bfm.AgG(-1262564703);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(checkoutAmountPresentation, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                str4 = null;
            }
            if (checkoutAmountPresentation.layout == CheckoutAmountLayout.WRAPPING) {
                bfm.AgE(-2143893177);
                z = ((C0dm) bfm.A6v(Am0.A04)).AFo() >= 1.5f;
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -2036177810);
                z = false;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            BRg bRgA06 = BRg.A00;
            if (function02 != null) {
                bRgA06 = C3cI.A06(bRgA06, str3, function02);
            }
            BRg bRgA09 = C3U4.A09(bRgA0R.then(bRgA06), AuraDimensKt.SpacingMedium);
            if (checkoutAmountPresentation.children.isEmpty()) {
                bfm.AgE(-2035730971);
                CheckoutAmountLine(checkoutAmountPresentation, z, function02 != null, str4, bRgA09, bfm, CheckoutAmountPresentation.$stable | (iA05 & 14) | ((iA05 >> 3) & 7168), 0);
            } else {
                bfm.AgE(-2035628857);
                InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
                int iA0J = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbiA0M.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbiA0M, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
                CheckoutAmountLine(checkoutAmountPresentation, z, function02 != null, str4, null, bfm, CheckoutAmountPresentation.$stable | (iA05 & 14) | ((iA05 >> 3) & 7168), 16);
                bfm.AgE(-1864101514);
                Iterator<CheckoutAmountPresentation> it = checkoutAmountPresentation.children.iterator();
                while (it.hasNext()) {
                    CheckoutAmountChildRow(it.next(), z, null, bfm, CheckoutAmountPresentation.$stable, 4);
                }
                AnonymousClass003.A0q(bbiA0M);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(checkoutAmountPresentation, bRg2, function02, str3, str4, i, i2);
        }
    }

    public static final String checkoutAmountLabel(CheckoutAmountPresentation checkoutAmountPresentation, BFM bfm, int i) {
        int i2;
        BBI bbiA0M;
        String strA01;
        String strTrimToNonEmpty;
        switch (checkoutAmountPresentation.label.ordinal()) {
            case 0:
                AnonymousClass003.A0l(bfm, -1916996324);
                String str = checkoutAmountPresentation.providedLabel;
                return str != null ? str : "";
            case 1:
                bfm.AgE(-1916994642);
                i2 = R.string._name_removed__res_0x7f120143;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 2:
                bfm.AgE(702821797);
                String str2 = checkoutAmountPresentation.currency;
                if (str2 != null && (strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) != null) {
                    bfm.AgE(702851526);
                    strA01 = AnonymousClass001.A0t(bfm, strTrimToNonEmpty, R.string._name_removed__res_0x7f120112);
                    bbiA0M = C3cG.A07(bfm);
                    if (strA01 != null) {
                        bfm.AgE(-1916990979);
                    }
                    BBI.A0R(bbiA0M, false);
                    AnonymousClass001.A1D(bfm);
                    return strA01;
                }
                bbiA0M = AnonymousClass002.A0M(bfm, 702851525);
                bfm.AgE(-1916986577);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120099);
                BBI.A0R(bbiA0M, false);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 3:
                bfm.AgE(-1916983376);
                i2 = R.string._name_removed__res_0x7f1200fe;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 4:
                bfm.AgE(-1916979659);
                i2 = R.string._name_removed__res_0x7f120111;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 5:
                bfm.AgE(-1916975820);
                i2 = R.string._name_removed__res_0x7f12010d;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 6:
                bfm.AgE(-1916972530);
                i2 = R.string._name_removed__res_0x7f120104;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            case 7:
                bfm.AgE(-1916968842);
                i2 = R.string._name_removed__res_0x7f120103;
                strA01 = AbstractC2271BQs.A01(bfm, i2);
                AnonymousClass001.A1D(bfm);
                return strA01;
            default:
                throw AnonymousClass005.A0k(bfm, -1916997790);
        }
    }
}
