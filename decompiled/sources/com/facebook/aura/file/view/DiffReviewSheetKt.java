package com.facebook.aura.file.view;

import X.A6B;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
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
import X.C01N;
import X.C02i;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0881AGi;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11T;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C8iN;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class DiffReviewSheetKt {

    /* renamed from: com.facebook.aura.file.view.DiffReviewSheetKt$DiffReviewSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ List<DiffRow> $diffRows;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onSave;
        public final /* synthetic */ C1110AYw $scrollState;
        public final /* synthetic */ DiffSummary $summary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, C1110AYw c1110AYw, Function0<Unit> function0, boolean z, Function0<Unit> function02, List<DiffRow> list, String str, DiffSummary diffSummary) {
            super(3);
            this.$modifier = bRg;
            this.$scrollState = c1110AYw;
            this.$onCancel = function0;
            this.$isSaving = z;
            this.$onSave = function02;
            this.$diffRows = list;
            this.$fileName = str;
            this.$summary = diffSummary;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String strA0s;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BRg bRg = this.$modifier;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0C = C3U4.A0C(bRg.then(c1062ATq).then(C10G.A00), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium);
                C1110AYw c1110AYw = this.$scrollState;
                Function0<Unit> function0 = this.$onCancel;
                boolean z = this.$isSaving;
                Function0<Unit> function02 = this.$onSave;
                List<DiffRow> list = this.$diffRows;
                String str = this.$fileName;
                DiffSummary diffSummary = this.$summary;
                InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                BPg.A03(bfm, g0u);
                G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
                BPg.A02(bfm, bRgA01, g0v3);
                BS0 bs0 = BRg.A00;
                BRg bRgA0B = C3U4.A0B(c1062ATq, C06G.A00(bfm), 0.0f);
                float f = AuraDimensKt.SpacingSmall;
                BRg bRgA0B2 = C3U4.A0B(bRgA0B, 0.0f, f);
                C02i c02i = AcQ.A03;
                C1AC c1ac = C2VU.A04;
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(c02i, bfm, c1ac, 54);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B2);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0v3);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12092a);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, null, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201293);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12092c), null, C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                if (z) {
                    bfm.AgE(-630523492);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12092e);
                } else {
                    bfm.AgE(-630521510);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12092d);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, null, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, !z, z, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134199757);
                BBI.A0R(bbi, true);
                C01N.A08(bfm, bs0, f);
                BRg bRgA0B3 = C3U4.A0B(C3U4.A0B(AbstractC1103AYp.A02(c1110AYw, C10G.A04(c1062ATq, AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) * 0.8f), true), C06G.A00(bfm), 0.0f), 0.0f, f);
                InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA0B3);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA003, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0v3);
                if (list.isEmpty()) {
                    bfm.AgE(-438420689);
                    BRg bRgA0B4 = C3U4.A0B(c1062ATq, 0.0f, 24.0f);
                    InterfaceC1380AiA interfaceC1380AiAA004 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A00, 48);
                    int iA0D3 = AnonymousClass001.A0D(bbi);
                    AKQ akqA044 = BBI.A04(bbi);
                    BRg bRgA014 = AxM.A01(bfm, bRgA0B4);
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    BPg.A02(bfm, interfaceC1380AiAA004, g0v);
                    BPg.A02(bfm, akqA044, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                    BPg.A02(bfm, bRgA014, g0v3);
                    InterfaceC1380AiA interfaceC1380AiAA005 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D4 = AnonymousClass001.A0D(bbi);
                    AKQ akqA045 = BBI.A04(bbi);
                    BRg bRgA015 = AxM.A01(bfm, bs0);
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    BPg.A02(bfm, interfaceC1380AiAA005, g0v);
                    BPg.A02(bfm, akqA045, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                    BPg.A02(bfm, bRgA015, g0v3);
                    AVy aVyA00 = BOf.A00(bfm, R.drawable.caret_right_small, 0);
                    BRg bRgA00 = C11T.A00(bs0, -90.0f);
                    AuraIconSize auraIconSize = AuraIconSize.TINY;
                    long jA08 = C06G.A08(bfm);
                    int i3 = AVy.$stable;
                    AuraIconKt.m2567AuraIconFHprtrg(bRgA00, aVyA00, auraIconSize, null, jA08, null, bfm, (i3 << 3) | 384, 40);
                    AuraIconKt.m2567AuraIconFHprtrg(C11T.A00(bs0, 90.0f), BOf.A00(bfm, R.drawable.caret_right_small, 0), auraIconSize, null, C06G.A08(bfm), null, bfm, (i3 << 3) | 390, 40);
                } else {
                    bfm.AgE(-437600088);
                    BRg bRgA016 = C11U.A01(c1062ATq, 14.0f);
                    AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                    long jA0K = C06G.A0K(bfm, akh);
                    C1DM c1dm = C1OM.A00;
                    BRg bRgA03 = C1b8.A03(bRgA016, c1dm, jA0K);
                    InterfaceC1380AiA interfaceC1380AiAA006 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D5 = AnonymousClass001.A0D(bbi);
                    AKQ akqA046 = BBI.A04(bbi);
                    BRg bRgA017 = AxM.A01(bfm, bRgA03);
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    BPg.A02(bfm, interfaceC1380AiAA006, g0v);
                    BPg.A02(bfm, akqA046, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D5);
                    BPg.A02(bfm, bRgA017, g0v3);
                    long jA0I = C06G.A0I(bfm, akh);
                    BRg bRgA0B5 = C3U4.A0B(C1b8.A03(c1062ATq, c1dm, HxS.A04(HDi.A0O[(int) (jA0I & 63)], B6A.A03(jA0I), B6A.A02(jA0I), B6A.A01(jA0I), 0.08f)), 12.0f, 10.0f);
                    InterfaceC1380AiA interfaceC1380AiAA007 = C0A8.A00(c02i, bfm, c1ac, 54);
                    int iA0D6 = AnonymousClass001.A0D(bbi);
                    AKQ akqA047 = BBI.A04(bbi);
                    BRg bRgA018 = AxM.A01(bfm, bRgA0B5);
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    BPg.A02(bfm, interfaceC1380AiAA007, g0v);
                    BPg.A02(bfm, akqA047, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D6);
                    BPg.A02(bfm, bRgA018, g0v3);
                    C90m c90m = C90m.A00;
                    AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0, true), C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                    InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, 10.0f, 6);
                    int iA0D7 = AnonymousClass001.A0D(bbi);
                    AKQ akqA048 = BBI.A04(bbi);
                    BRg bRgA019 = AxM.A01(bfm, bs0);
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    BPg.A02(bfm, interfaceC1380AiAA0S, g0v);
                    BPg.A02(bfm, akqA048, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D7);
                    BPg.A02(bfm, bRgA019, g0v3);
                    String strA0H = FGI.A0H("+", diffSummary.added);
                    AKH<AuraTypography> akh2 = AuraTypographyKt.LocalAuraTypography;
                    C1822Arm c1822Arm = AnonymousClass001.A0g(bfm, akh2).caption1Emphasized;
                    DiffColors diffColors = DiffColors.INSTANCE;
                    AuraTextKt.m2639AuraTextUY9GdpU(strA0H, null, diffColors.getAddedText(bfm, 6), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    AuraTextKt.m2639AuraTextUY9GdpU(FGI.A0H("-", diffSummary.removed), null, diffColors.getRemovedText(bfm, 6), AnonymousClass001.A0g(bfm, akh2).caption1Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, true);
                    BBI.A0R(bbi, true);
                    InterfaceC1380AiA interfaceC1380AiAA008 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D8 = AnonymousClass001.A0D(bbi);
                    AKQ akqA049 = BBI.A04(bbi);
                    BRg bRgA0110 = AxM.A01(bfm, c1062ATq);
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    BPg.A02(bfm, interfaceC1380AiAA008, g0v);
                    BPg.A02(bfm, akqA049, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D8);
                    BPg.A02(bfm, bRgA0110, g0v3);
                    Iterator itA0w = AnonymousClass001.A0w(bfm, list, -1709110629);
                    while (itA0w.hasNext()) {
                        DiffReviewSheetKt.DiffRowItem((DiffRow) itA0w.next(), null, bfm, 0, 2);
                    }
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                AnonymousClass002.A10(bbi, false, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.file.view.DiffReviewSheetKt$DiffReviewSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $currentContent;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onSave;
        public final /* synthetic */ String $originalContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$fileName = str;
            this.$originalContent = str2;
            this.$currentContent = str3;
            this.$isSaving = z;
            this.$onSave = function0;
            this.$onCancel = function02;
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
            DiffReviewSheetKt.DiffReviewSheet(this.$fileName, this.$originalContent, this.$currentContent, this.$isSaving, this.$onSave, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.DiffReviewSheetKt$DiffRowItem$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ DiffRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DiffRow diffRow, BRg bRg, int i, int i2) {
            super(2);
            this.$row = diffRow;
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
            DiffReviewSheetKt.DiffRowItem(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final DiffSummary computeDiffSummary(List<DiffRow> list) {
        C7384Etj.A0Y(list, 0);
        Iterator<DiffRow> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iOrdinal = it.next().kind.ordinal();
            if (iOrdinal == 1) {
                i++;
            } else if (iOrdinal == 2) {
                i2++;
            }
        }
        return new DiffSummary(i, i2);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiffRowKind.values().length];
            try {
                AnonymousClass002.A13(DiffRowKind.ADDED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DiffRowKind.REMOVED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DiffRowKind.HUNK, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void DiffReviewSheet(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, str3);
        C7384Etj.A0Y(function0, 4);
        C7384Etj.A0Y(function02, 5);
        bfm.AgG(1400473585);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function02);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7);
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, zA1Z ? 1 : 0);
            boolean zA1I = AnonymousClass004.A1I(iA0d) | AnonymousClass004.A1K(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1I || objAaT == C78N.A00) {
                objAaT = computeDiffRows(str2, str3, 5);
                bfm.Ai0(objAaT);
            }
            List list = (List) objAaT;
            boolean zA65 = bfm.A65(list);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = computeDiffSummary(list);
                bfm.Ai0(objAaT2);
            }
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, null, function02, auraSheetStateRememberAuraBottomSheetState, null, null, null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass1(bRg2, c1110AYwA00, function02, z, function0, list, str, (DiffSummary) objAaT2), -1077994290), bfm, (iA0d >> 9) & 896, 3072, 8179);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, z, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0331  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DiffRowItem(com.facebook.aura.file.view.DiffRow r58, X.BRg r59, X.BFM r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.DiffReviewSheetKt.DiffRowItem(com.facebook.aura.file.view.DiffRow, X.BRg, X.BFM, int, int):void");
    }

    public static /* synthetic */ List computeDiffRows$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 5;
        }
        return computeDiffRows(str, str2, i);
    }

    public static final List<DiffRow> computeRawDiff(List<String> list, List<String> list2) {
        List<String> listLongestCommonSubsequence = longestCommonSubsequence(list, list2);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            if (i >= list.size() && i2 >= list2.size()) {
                break;
            }
            if (i3 < listLongestCommonSubsequence.size() && i < list.size() && i2 < list2.size() && C7384Etj.areEqual(list.get(i), listLongestCommonSubsequence.get(i3)) && C7384Etj.areEqual(list2.get(i2), listLongestCommonSubsequence.get(i3))) {
                arrayList.add(new DiffRow(DiffRowKind.CONTEXT, list.get(i), Integer.valueOf(i4), Integer.valueOf(i5), null));
                i++;
                i2++;
                i3++;
                i4++;
            } else if (i < list.size() && (i3 >= listLongestCommonSubsequence.size() || !C7384Etj.areEqual(list.get(i), listLongestCommonSubsequence.get(i3)))) {
                arrayList.add(new DiffRow(DiffRowKind.REMOVED, list.get(i), Integer.valueOf(i4), null, null));
                i++;
                i4++;
            } else {
                if (i2 >= list2.size() || (i3 < listLongestCommonSubsequence.size() && C7384Etj.areEqual(list2.get(i2), listLongestCommonSubsequence.get(i3)))) {
                    break;
                }
                arrayList.add(new DiffRow(DiffRowKind.ADDED, list2.get(i2), null, Integer.valueOf(i5), null));
                i2++;
            }
            i5++;
        }
        return arrayList;
    }

    public static final List<DiffRow> applyContextCollapsing(List<DiffRow> list, int i) {
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<DiffRow> it = list.iterator();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (it.hasNext()) {
                    DiffRow next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        break;
                    }
                    DiffRowKind diffRowKind = next.kind;
                    if (diffRowKind == DiffRowKind.ADDED || diffRowKind == DiffRowKind.REMOVED) {
                        linkedHashSet.add(Integer.valueOf(i3));
                    }
                    i3 = i4;
                } else if (!linkedHashSet.isEmpty()) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        int iA0F = AnonymousClass001.A0F(it2.next());
                        int i5 = -i;
                        if (i5 <= i) {
                            while (true) {
                                int i6 = iA0F + i5;
                                if (i6 >= 0 && i6 < list.size()) {
                                    linkedHashSet2.add(Integer.valueOf(i6));
                                }
                                if (i5 != i) {
                                    i5++;
                                }
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Integer num = (Integer) AbstractC0878AGe.A09(linkedHashSet2);
                    if (num != null && num.intValue() > 0) {
                        arrayList.add(new DiffRow(DiffRowKind.HUNK, "", null, null, num));
                    }
                    int i7 = -1;
                    for (DiffRow diffRow : list) {
                        int i8 = i2 + 1;
                        if (i2 >= 0) {
                            if (linkedHashSet2.contains(Integer.valueOf(i2))) {
                                if (i7 >= 0 && i2 > i7 + 1) {
                                    arrayList.add(new DiffRow(DiffRowKind.HUNK, "", null, null, Integer.valueOf((i2 - i7) - 1)));
                                }
                                arrayList.add(diffRow);
                                i7 = i2;
                            }
                            i2 = i8;
                        }
                    }
                    if (i7 >= list.size() - 1) {
                        return arrayList;
                    }
                    arrayList.add(new DiffRow(DiffRowKind.HUNK, "", null, null, Integer.valueOf((list.size() - 1) - i7)));
                    return arrayList;
                }
            }
            AbstractC0885AGm.A14();
            throw F60.createAndThrow();
        }
        return C0881AGi.A00;
    }

    public static final List<DiffRow> computeDiffRows(String str, String str2, int i) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        List<DiffRow> listComputeRawDiff = computeRawDiff(A6B.A02(new C8iN(str, zA1a ? 1 : 0)), A6B.A02(new C8iN(str2, zA1a ? 1 : 0)));
        return listComputeRawDiff.isEmpty() ? C0881AGi.A00 : applyContextCollapsing(listComputeRawDiff, i);
    }

    public static final List<String> longestCommonSubsequence(List<String> list, List<String> list2) {
        int size = list.size();
        int size2 = list2.size();
        int i = size + 1;
        int[][] iArr = new int[i][];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = new int[size2 + 1];
        }
        if (1 <= size) {
            int i3 = 1;
            while (true) {
                if (1 <= size2) {
                    int i4 = 1;
                    while (true) {
                        int i5 = i3 - 1;
                        int i6 = i4 - 1;
                        boolean zAreEqual = C7384Etj.areEqual(list.get(i5), list2.get(i6));
                        int[] iArr2 = iArr[i3];
                        int[] iArr3 = iArr[i5];
                        iArr2[i4] = zAreEqual ? iArr3[i6] + 1 : Math.max(iArr3[i4], iArr2[i6]);
                        if (i4 == size2) {
                            break;
                        }
                        i4++;
                    }
                }
                if (i3 == size) {
                    break;
                }
                i3++;
            }
        }
        ArrayList arrayList = new ArrayList();
        while (size > 0 && size2 > 0) {
            int i7 = size - 1;
            int i8 = size2 - 1;
            if (C7384Etj.areEqual(list.get(i7), list2.get(i8))) {
                arrayList.add(0, list.get(i7));
                size--;
            } else if (iArr[i7][size2] > iArr[size][i8]) {
                size--;
            }
            size2--;
        }
        return arrayList;
    }
}
