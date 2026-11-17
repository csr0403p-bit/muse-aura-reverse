package com.facebook.aura.checkout.ui;

import X.AGI;
import X.AHD;
import X.AKQ;
import X.ARK;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06H;
import X.C07C;
import X.C08R;
import X.C0v5;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1YL;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchRowSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconDefaults;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchSelectableListSheetKt {

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$AddRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.AddRow(this.$title, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$HatchSelectableListSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchSelectableRowType $rowType;
        public final /* synthetic */ AHD<HatchSelectableSection> $sections;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<HatchSelectableSection> ahd, BRg bRg, String str, HatchSelectableRowType hatchSelectableRowType, int i, int i2) {
            super(2);
            this.$sections = ahd;
            this.$modifier = bRg;
            this.$title = str;
            this.$rowType = hatchSelectableRowType;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.HatchSelectableListSheet(this.$sections, this.$modifier, this.$title, this.$rowType, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$HatchSelectableListSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $addRowTitle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddRow;
        public final /* synthetic */ G0U<HatchSelectableOption, Unit> $onOptionMore;
        public final /* synthetic */ G0U<HatchSelectableOption, Unit> $onSelect;
        public final /* synthetic */ AHD<HatchSelectableOption> $options;
        public final /* synthetic */ HatchSelectableRowType $rowType;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AHD<HatchSelectableOption> ahd, String str, G0U<? super HatchSelectableOption, Unit> g0u, BRg bRg, String str2, HatchSelectableRowType hatchSelectableRowType, String str3, Function0<Unit> function0, G0U<? super HatchSelectableOption, Unit> g0u2, int i, int i2) {
            super(2);
            this.$options = ahd;
            this.$selectedId = str;
            this.$onSelect = g0u;
            this.$modifier = bRg;
            this.$title = str2;
            this.$rowType = hatchSelectableRowType;
            this.$addRowTitle = str3;
            this.$onAddRow = function0;
            this.$onOptionMore = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.HatchSelectableListSheet(this.$options, this.$selectedId, this.$onSelect, this.$modifier, this.$title, this.$rowType, this.$addRowTitle, this.$onAddRow, this.$onOptionMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$HatchSelectableSectionContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C110512 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchSelectableRowType $rowType;
        public final /* synthetic */ HatchSelectableSection $section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110512(HatchSelectableSection hatchSelectableSection, BRg bRg, HatchSelectableRowType hatchSelectableRowType, int i, int i2) {
            super(2);
            this.$section = hatchSelectableSection;
            this.$modifier = bRg;
            this.$rowType = hatchSelectableRowType;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.HatchSelectableSectionContent(this.$section, this.$modifier, this.$rowType, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$LeadingGlyph$1, reason: invalid class name and case insensitive filesystem */
    public final class C110521 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ HatchSelectableOption $option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110521(HatchSelectableOption hatchSelectableOption, int i, int i2) {
            super(2);
            this.$option = hatchSelectableOption;
            this.$icon = i;
            this.$$changed = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.LeadingGlyph(this.$option, this.$icon, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$OptionCard$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C110532 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
        public final /* synthetic */ String $loadingLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110532(String str) {
            super(3);
            this.$loadingLabel = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
            invoke(c08r, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C08R c08r, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchRowSpinnerKt.HatchRowSpinner(this.$loadingLabel, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$OptionCard$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $footer;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ HatchSelectableOption $option;
        public final /* synthetic */ HatchSelectableRowType $rowType;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(HatchSelectableOption hatchSelectableOption, HatchSelectableRowType hatchSelectableRowType, boolean z, Function0<Unit> function0, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, int i, int i2) {
            super(2);
            this.$option = hatchSelectableOption;
            this.$rowType = hatchSelectableRowType;
            this.$selected = z;
            this.$onSelect = function0;
            this.$footer = g0w;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.OptionCard(this.$option, this.$rowType, this.$selected, this.$onSelect, this.$footer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$OptionEditLink$2, reason: invalid class name and case insensitive filesystem */
    public final class C110542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ HatchSelectableOption $option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110542(HatchSelectableOption hatchSelectableOption, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$option = hatchSelectableOption;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.OptionEditLink(this.$option, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$OptionMoreButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C110551 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110551(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.OptionMoreButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$SelectableCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C110562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $addRowTitle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddRow;
        public final /* synthetic */ G0U<HatchSelectableOption, Unit> $onOptionEdit;
        public final /* synthetic */ G0U<HatchSelectableOption, Unit> $onOptionMore;
        public final /* synthetic */ G0U<HatchSelectableOption, Unit> $onSelect;
        public final /* synthetic */ AHD<HatchSelectableOption> $options;
        public final /* synthetic */ HatchSelectableRowType $rowType;
        public final /* synthetic */ String $selectedId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110562(AHD<HatchSelectableOption> ahd, HatchSelectableRowType hatchSelectableRowType, String str, G0U<? super HatchSelectableOption, Unit> g0u, String str2, Function0<Unit> function0, G0U<? super HatchSelectableOption, Unit> g0u2, G0U<? super HatchSelectableOption, Unit> g0u3, BRg bRg, int i, int i2) {
            super(2);
            this.$options = ahd;
            this.$rowType = hatchSelectableRowType;
            this.$selectedId = str;
            this.$onSelect = g0u;
            this.$addRowTitle = str2;
            this.$onAddRow = function0;
            this.$onOptionMore = g0u2;
            this.$onOptionEdit = g0u3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.SelectableCard(this.$options, this.$rowType, this.$selectedId, this.$onSelect, this.$addRowTitle, this.$onAddRow, this.$onOptionMore, this.$onOptionEdit, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$SelectableOptionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C110572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onEdit;
        public final /* synthetic */ Function0<Unit> $onMore;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ HatchSelectableOption $option;
        public final /* synthetic */ HatchSelectableRowType $rowType;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110572(HatchSelectableOption hatchSelectableOption, HatchSelectableRowType hatchSelectableRowType, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$option = hatchSelectableOption;
            this.$rowType = hatchSelectableRowType;
            this.$selected = z;
            this.$onSelect = function0;
            this.$onMore = function02;
            this.$onEdit = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.SelectableOptionRow(this.$option, this.$rowType, this.$selected, this.$onSelect, this.$onMore, this.$onEdit, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt$SheetTitle$1, reason: invalid class name and case insensitive filesystem */
    public final class C110581 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110581(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSelectableListSheetKt.SheetTitle(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AddRow(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1552916134);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraCardKt.m2484AuraCardjQVUvHA(AnonymousClass001.A0R(bRg2), AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, null, bfm, 3072, 7), new AuraCardContent(accentString(str, bfm, iA0d & 14), (AuraIconAndHeadlineStyle) null, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097150, (C06H) null), AuraCardType.Clickable.INSTANCE, null, null, function0, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0d << 15) & 3670016) | 3072, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, function0, bRg2, i, i2);
        }
    }

    public static final void HatchSelectableListSheet(AHD<HatchSelectableSection> ahd, BRg bRg, String str, HatchSelectableRowType hatchSelectableRowType, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str2 = str;
        HatchSelectableRowType hatchSelectableRowType2 = hatchSelectableRowType;
        C7384Etj.A0Y(ahd, 0);
        bfm.AgG(1512996640);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
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
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(hatchSelectableRowType2));
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str2 = null;
            }
            if (i5 != 0) {
                hatchSelectableRowType2 = HatchSelectableRowType.RADIO;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingLarge, 0);
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
            if (str2 != null) {
                bfm.AgE(495991885);
                SheetTitle(str2, null, bfm, (iA0d >> 6) & 14, 2);
            } else {
                bfm.AgE(496021676);
            }
            BBI.A0R(bbi, false);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1230924762);
            while (itA0w.hasNext()) {
                HatchSelectableSectionContent((HatchSelectableSection) itA0w.next(), null, hatchSelectableRowType2, bfm, (iA0d >> 3) & 896, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, bRg2, str2, hatchSelectableRowType2, i, i2);
        }
    }

    public static final void HatchSelectableSectionContent(HatchSelectableSection hatchSelectableSection, BRg bRg, HatchSelectableRowType hatchSelectableRowType, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        HatchSelectableRowType hatchSelectableRowType2 = hatchSelectableRowType;
        C7384Etj.A0Y(hatchSelectableSection, 0);
        bfm.AgG(848698595);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchSelectableSection) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(hatchSelectableRowType2));
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            if (i4 != 0) {
                hatchSelectableRowType2 = HatchSelectableRowType.RADIO;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str = hatchSelectableSection.label;
            if (str == null) {
                bfm.AgE(748816639);
            } else {
                BRg bRgA07 = C3U4.A07(C3cG.A09(bfm, 748816640), AuraDimensKt.SpacingMedium);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA07, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            }
            BBI.A0R(bbi, false);
            SelectableCard(hatchSelectableSection.options, hatchSelectableRowType2, hatchSelectableSection.selectedId, hatchSelectableSection.onSelect, hatchSelectableSection.addRowTitle, hatchSelectableSection.onAddRow, hatchSelectableSection.onOptionMore, hatchSelectableSection.onOptionEdit, null, bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 256);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110512(hatchSelectableSection, bRgA0P, hatchSelectableRowType2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OptionCard(com.facebook.aura.checkout.ui.HatchSelectableOption r58, com.facebook.aura.checkout.ui.HatchSelectableRowType r59, boolean r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r62, X.BRg r63, X.BFM r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkout.ui.HatchSelectableListSheetKt.OptionCard(com.facebook.aura.checkout.ui.HatchSelectableOption, com.facebook.aura.checkout.ui.HatchSelectableRowType, boolean, kotlin.jvm.functions.Function0, X.G0W, X.BRg, X.BFM, int, int):void");
    }

    public static final void OptionEditLink(HatchSelectableOption hatchSelectableOption, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1571537230);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchSelectableOption) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
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
            String strA0t = AnonymousClass001.A0t(bfm, hatchSelectableOption.title, R.string._name_removed__res_0x7f1206e2);
            BRg bRgA04 = C0v5.A04(bRg2, C3cG.A0A(0), null, function0, true);
            boolean zA65 = bfm.A65(strA0t);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchSelectableListSheetKt$OptionEditLink$1$1(strA0t);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA042 = C3U4.A04(C10G.A09(AnonymousClass001.A0Y(bRgA04, objAaT, false), 48.0f, Float.NaN), AuraDimensKt.SpacingXsmall);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206e3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA042, auraTheme.getColors(bfm, 6).link, auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110542(hatchSelectableOption, function0, bRg2, i, i2);
        }
    }

    public static final void OptionMoreButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1781743498);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRg2, BOf.A00(bfm, R.drawable.meta_ai_icons_ellipsis_regular_cropped, 0), AuraIconButtonSizeV2.SMALL, AuraIconButtonStyle.SECONDARY, AuraIconButtonBackground.NO_BACKGROUND, null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120704), function0, null, false, null, null, null, null, bfm, AnonymousClass001.A0C(iA0T << 21, ((iA0T >> 3) & 14) | 28032 | (AVy.$stable << 3)), 0, 16160);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110551(function0, bRg2, i, i2);
        }
    }

    public static final void SelectableCard(AHD<HatchSelectableOption> ahd, HatchSelectableRowType hatchSelectableRowType, String str, G0U<? super HatchSelectableOption, Unit> g0u, String str2, Function0<Unit> function0, G0U<? super HatchSelectableOption, Unit> g0u2, G0U<? super HatchSelectableOption, Unit> g0u3, BRg bRg, BFM bfm, int i, int i2) {
        Function0 function02;
        BRg bRg2 = bRg;
        bfm.AgG(1811533773);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, hatchSelectableRowType);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u3);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0d |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 38347923, 38347922), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA03 = C1b8.A03(bRg2, auraTheme.getShapes(bfm, 6).card, AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable));
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1432804888);
                int i4 = 0;
                while (true) {
                    Function0 function04 = null;
                    if (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0885AGm.A14();
                            break;
                        }
                        HatchSelectableOption hatchSelectableOption = (HatchSelectableOption) next;
                        if (i4 != 0) {
                            C3cJ.A0Z(bfm, -1647683058);
                        } else {
                            bfm.AgE(-1647597529);
                        }
                        BBI.A0R(bbi, false);
                        boolean zAreEqual = C7384Etj.areEqual(hatchSelectableOption.id, str);
                        boolean zA1R = AnonymousClass001.A1R(bfm, hatchSelectableOption, AnonymousClass004.A1M(iA0d));
                        Object objAaT = bfm.AaT();
                        if (zA1R || objAaT == C78N.A00) {
                            objAaT = new HatchSelectableListSheetKt$SelectableCard$1$1$1$1(g0u, hatchSelectableOption);
                            BBI.A0O(bbi, objAaT);
                        }
                        Function0 function05 = (Function0) objAaT;
                        if (g0u2 == null) {
                            bfm.AgE(-1647392186);
                        } else {
                            bfm.AgE(-1647392185);
                            boolean zA1K = AnonymousClass003.A1K(bfm, g0u2, hatchSelectableOption);
                            Object objAaT2 = bfm.AaT();
                            if (zA1K || objAaT2 == C78N.A00) {
                                objAaT2 = new HatchSelectableListSheetKt$SelectableCard$1$1$2$1$1(g0u2, hatchSelectableOption);
                                BBI.A0O(bbi, objAaT2);
                            }
                            function04 = (Function0) objAaT2;
                        }
                        BBI.A0R(bbi, false);
                        if (g0u3 == null) {
                            bfm.AgE(-1647325722);
                            BBI.A0R(bbi, false);
                            function02 = null;
                        } else {
                            bfm.AgE(-1647325721);
                            boolean zA1K2 = AnonymousClass003.A1K(bfm, g0u3, hatchSelectableOption);
                            Object objAaT3 = bfm.AaT();
                            if (zA1K2 || objAaT3 == C78N.A00) {
                                objAaT3 = new HatchSelectableListSheetKt$SelectableCard$1$1$3$1$1(g0u3, hatchSelectableOption);
                                BBI.A0O(bbi, objAaT3);
                            }
                            function02 = (Function0) objAaT3;
                            BBI.A0R(bbi, false);
                        }
                        SelectableOptionRow(hatchSelectableOption, hatchSelectableRowType, zAreEqual, function05, function04, function02, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 64);
                        i4 = i5;
                    } else {
                        BBI.A0R(bbi, false);
                        if (str2 == null || function0 == null) {
                            bfm.AgE(-1466600565);
                        } else {
                            bfm.AgE(-1466776428);
                            if (ahd.isEmpty()) {
                                bfm.AgE(-1466660085);
                            } else {
                                C3cJ.A0Z(bfm, -1466745614);
                            }
                            BBI.A0R(bbi, false);
                            AddRow(str2, function0, null, bfm, (iA0d >> 12) & 126, 4);
                        }
                        AnonymousClass003.A0q(bbi);
                    }
                }
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110562(ahd, hatchSelectableRowType, str, g0u, str2, function0, g0u2, g0u3, bRg2, i, i2);
        }
    }

    public static final void SelectableOptionRow(HatchSelectableOption hatchSelectableOption, HatchSelectableRowType hatchSelectableRowType, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        B1U b1uA00;
        BRg bRg2 = bRg;
        bfm.AgG(-674302882);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchSelectableOption) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, hatchSelectableRowType);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function03);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0d, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (function03 != null && z && hatchSelectableOption.isEnabled) {
                bfm.AgE(-594759907);
                b1uA00 = B1V.A00(bfm, new HatchSelectableListSheetKt$SelectableOptionRow$editFooter$1(hatchSelectableOption, function03), -697870574);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -594685042);
                b1uA00 = null;
            }
            if (function02 == null || !hatchSelectableOption.isEnabled) {
                bfm.AgE(-594614207);
                OptionCard(hatchSelectableOption, hatchSelectableRowType, z, function0, b1uA00, bRg2, bfm, AnonymousClass001.A08(iA0d >> 3, iA0d & 8190), 0);
            } else {
                bfm.AgE(-594408894);
                BRg bRgA0R = AnonymousClass001.A0R(bRg2);
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
                int iA0J = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA01 = AxM.A01(bfm, bRgA0R);
                Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
                if (bbiA0M.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbiA0M, function04);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
                OptionCard(hatchSelectableOption, hatchSelectableRowType, z, function0, b1uA00, ARK.A01(BRg.A00, 1.0f, true), bfm, iA0d & 8190, 0);
                OptionMoreButton(function02, null, bfm, (iA0d >> 12) & 14, 2);
                BBI.A0R(bbiA0M, true);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110572(hatchSelectableOption, hatchSelectableRowType, z, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final void SheetTitle(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1583511282);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0R, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, C3cH.A0F(3), false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14768);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110581(str, bRg2, i, i2);
        }
    }

    public static final void LeadingGlyph(HatchSelectableOption hatchSelectableOption, int i, BFM bfm, int i2) {
        long jM2566colorsWaAFU9c;
        bfm.AgG(-307922885);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchSelectableOption) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            boolean z = hatchSelectableOption.leadingIconStyle == HatchSelectableLeadingIconStyle.ROUNDED_SQUARE;
            BRg bRgA01 = BRg.A00;
            BRg bRgA00 = C11S.A00(bRgA01, hatchSelectableOption.isEnabled ? 1.0f : 0.3f);
            if (z) {
                bRgA01 = C11U.A01(bRgA01, 10.0f);
            }
            BRg bRgThen = bRgA00.then(bRgA01);
            AVy aVyA00 = BOf.A00(bfm, i, (iA0d >> 3) & 14);
            AuraIconSize auraIconSize = z ? AuraIconSize.MEDIUM : AuraIconSize.SMALL;
            if (hatchSelectableOption.tintLeadingIcon) {
                bfm.AgE(438870371);
                jM2566colorsWaAFU9c = AuraIconDefaults.INSTANCE.m2566colorsWaAFU9c(bfm, 6);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 438871014);
                jM2566colorsWaAFU9c = B6A.A07;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRgThen, aVyA00, auraIconSize, null, jM2566colorsWaAFU9c, null, bfm, (AVy.$stable << 3) | 3072, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110521(hatchSelectableOption, i, i2);
        }
    }

    public static final ApQ accentString(String str, BFM bfm, int i) {
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        long j = C3cH.A0W(bfm).link;
        long j2 = C1809ArT.A01;
        int iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07));
        try {
            c1731ApSA0W.A0E(str);
            c1731ApSA0W.A06(iA00);
            return c1731ApSA0W.A04();
        } catch (Throwable th) {
            c1731ApSA0W.A06(iA00);
            throw th;
        }
    }

    public static final void HatchSelectableListSheet(AHD<HatchSelectableOption> ahd, String str, G0U<? super HatchSelectableOption, Unit> g0u, BRg bRg, String str2, HatchSelectableRowType hatchSelectableRowType, String str3, Function0<Unit> function0, G0U<? super HatchSelectableOption, Unit> g0u2, BFM bfm, int i, int i2) {
        G0U<? super HatchSelectableOption, Unit> g0u3;
        String str4 = str2;
        String str5 = str3;
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        HatchSelectableRowType hatchSelectableRowType2 = hatchSelectableRowType;
        AnonymousClass002.A1A(ahd, 0, g0u);
        bfm.AgG(533595424);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str4);
        }
        int i5 = i2 & 32;
        int iA0H = 196608;
        if (i5 != 0) {
            iA0d |= iA0H;
        } else if ((196608 & i) == 0) {
            iA0H = AnonymousClass004.A0H(bfm, AnonymousClass003.A0K(hatchSelectableRowType2));
            iA0d |= iA0H;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str5);
            iA0d |= iA0j;
        }
        int i7 = i2 & 128;
        int iA0a = 12582912;
        if (i7 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, function02);
            iA0d |= iA0a;
        }
        int i8 = i2 & 256;
        int iA0b = 100663296;
        if (i8 != 0) {
            iA0d |= iA0b;
        } else if ((i & 100663296) == 0) {
            i8 = 0;
            iA0b = AnonymousClass004.A0b(bfm, g0u2);
            iA0d |= iA0b;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            if (i5 != 0) {
                hatchSelectableRowType2 = HatchSelectableRowType.RADIO;
            }
            if (i6 != 0) {
                str5 = null;
            }
            if (i7 != 0) {
                function02 = null;
            }
            g0u3 = i8 == 0 ? g0u2 : null;
            HatchSelectableListSheet(AGI.A0E(new HatchSelectableSection("default", ahd, str, g0u, null, str5, function02, g0u3, null)), bRg2, str4, hatchSelectableRowType2, bfm, (iA0d >> 6) & 8176, 0);
        } else {
            bfm.Afo();
            g0u3 = g0u2;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(ahd, str, g0u, bRg2, str4, hatchSelectableRowType2, str5, function02, g0u3, i, i2);
        }
    }
}
