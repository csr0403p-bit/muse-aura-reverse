package com.facebook.aura.vds.compose.picker;

import X.ADq;
import X.AFz;
import X.AKH;
import X.AbstractC05051Yk;
import X.AbstractC0871AFr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C046319x;
import X.C04921Xv;
import X.C05423bo;
import X.C05513bx;
import X.C07C;
import X.C0872AFu;
import X.C0xo;
import X.C0yB;
import X.C0z3;
import X.C1809ArT;
import X.C1822Arm;
import X.C1A9;
import X.C1AF;
import X.C1AI;
import X.C1BT;
import X.C1DE;
import X.C1DM;
import X.C1Wz;
import X.C1X0;
import X.C1X1;
import X.C1X3;
import X.C1X7;
import X.C1XA;
import X.C1XE;
import X.C1XI;
import X.C1Yw;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HWA;
import X.InterfaceC04801Xj;
import X.InterfaceC05011Yg;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsDatePicker;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraDatePickerKt {
    public static final int AURA_DATE_PICKER_MIN_YEAR = 1900;

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePicker$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C0z3 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0z3 c0z3, BRg bRg) {
            super(2);
            this.$state = c0z3;
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraDatePickerKt.AuraStyledDatePicker(this.$state, this.$modifier, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePicker$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LocalDate $initialDisplayedDate;
        public final /* synthetic */ LocalDate $maxDate;
        public final /* synthetic */ LocalDate $minDate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
        public final /* synthetic */ LocalDate $selectedDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(LocalDate localDate, G0U<? super LocalDate, Unit> g0u, BRg bRg, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, int i, int i2) {
            super(2);
            this.$selectedDate = localDate;
            this.$onDateSelected = g0u;
            this.$modifier = bRg;
            this.$minDate = localDate2;
            this.$maxDate = localDate3;
            this.$initialDisplayedDate = localDate4;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDatePickerKt.AuraDatePicker(this.$selectedDate, this.$onDateSelected, this.$modifier, this.$minDate, this.$maxDate, this.$initialDisplayedDate, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePickerDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C142991 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ String $dismissText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ C0z3 $state;

        /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePickerDialog$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04271 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $confirmText;
            public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
            public final /* synthetic */ C0z3 $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04271(C0z3 c0z3, String str, G0U<? super LocalDate, Unit> g0u) {
                super(2);
                this.$state = c0z3;
                this.$confirmText = str;
                this.$onDateSelected = g0u;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                    AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                    boolean zA1X = AnonymousClass002.A1X(this.$state.AKE());
                    String str = this.$confirmText;
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDateSelected, bfm.A65(this.$state));
                    C0z3 c0z3 = this.$state;
                    G0U<LocalDate, Unit> g0u = this.$onDateSelected;
                    Object objAaT = bfm.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = new AuraDatePickerKt$AuraDatePickerDialog$1$1$1$1(c0z3, g0u);
                        bfm.Ai0(objAaT);
                    }
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, null, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, zA1X, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134200781);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePickerDialog$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $dismissText;
            public final /* synthetic */ Function0<Unit> $onDismissRequest;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, Function0<Unit> function0) {
                super(2);
                this.$dismissText = str;
                this.$onDismissRequest = function0;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, this.$dismissText, null, null, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, this.$onDismissRequest, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201293);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePickerDialog$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ C0z3 $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C0z3 c0z3) {
                super(3);
                this.$state = c0z3;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                    AuraDatePickerKt.AuraStyledDatePicker(this.$state, null, bfm, 0, 2);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142991(Function0<Unit> function0, BRg bRg, C0z3 c0z3, String str, G0U<? super LocalDate, Unit> g0u, String str2) {
            super(2);
            this.$onDismissRequest = function0;
            this.$modifier = bRg;
            this.$state = c0z3;
            this.$confirmText = str;
            this.$onDateSelected = g0u;
            this.$dismissText = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                C1DM c1dm = AnonymousClass002.A0e(bfm).modal;
                C0xo.A00(AuraDatePickerKt.auraDatePickerColors(bfm, 0), bfm, this.$modifier, c1dm, null, this.$onDismissRequest, B1V.A00(bfm, new C04271(this.$state, this.$confirmText, this.$onDateSelected), 1570563409), B1V.A00(bfm, new AnonymousClass2(this.$dismissText, this.$onDismissRequest), 781755731), B1V.A00(bfm, new AnonymousClass3(this.$state), -253729560), 0.0f, 100863024, 128);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePickerDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ String $dismissText;
        public final /* synthetic */ LocalDate $initialDisplayedDate;
        public final /* synthetic */ LocalDate $maxDate;
        public final /* synthetic */ LocalDate $minDate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ LocalDate $selectedDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(LocalDate localDate, G0U<? super LocalDate, Unit> g0u, Function0<Unit> function0, String str, String str2, BRg bRg, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, int i, int i2) {
            super(2);
            this.$selectedDate = localDate;
            this.$onDateSelected = g0u;
            this.$onDismissRequest = function0;
            this.$confirmText = str;
            this.$dismissText = str2;
            this.$modifier = bRg;
            this.$minDate = localDate2;
            this.$maxDate = localDate3;
            this.$initialDisplayedDate = localDate4;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDatePickerKt.AuraDatePickerDialog(this.$selectedDate, this.$onDateSelected, this.$onDismissRequest, this.$confirmText, this.$dismissText, this.$modifier, this.$minDate, this.$maxDate, this.$initialDisplayedDate, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraMaterialPickerTheme$3, reason: invalid class name and case insensitive filesystem */
    public final class C143003 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraMaterialPickerTheme$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
                super(2);
                this.$content = g0v;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    AnonymousClass001.A1H(bfm, this.$content, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143003(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$content = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AKH<InterfaceC05011Yg> akh = C0yB.A00;
                C1Yw c1Yw = AbstractC05051Yk.A01;
                AnonymousClass003.A0m(bfm, akh.A04(AbstractC05051Yk.A01(Float.NaN, B6A.A07, true)), new AnonymousClass1(this.$content), 1252553718);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraMaterialPickerTheme$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDatePickerKt.AuraMaterialPickerTheme(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraStyledDatePicker$1, reason: invalid class name and case insensitive filesystem */
    public final class C143011 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C0z3 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143011(C0z3 c0z3, BRg bRg, int i, int i2) {
            super(2);
            this.$state = c0z3;
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
            AuraDatePickerKt.AuraStyledDatePicker(this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$auraSelectableDates$1, reason: invalid class name and case insensitive filesystem */
    public final class C143021 implements InterfaceC04801Xj {
        public final /* synthetic */ LocalDate $maxDate;
        public final /* synthetic */ LocalDate $minDate;

        public C143021(LocalDate localDate, LocalDate localDate2) {
            this.$minDate = localDate;
            this.$maxDate = localDate2;
        }

        @Override // X.InterfaceC04801Xj
        public boolean isSelectableYear(int i) {
            return i >= this.$minDate.getYear() && i <= this.$maxDate.getYear();
        }

        @Override // X.InterfaceC04801Xj
        public boolean isSelectableDate(long j) {
            LocalDate localDateAtUtc = AuraDatePickerKt.toLocalDateAtUtc(j);
            return (localDateAtUtc.isBefore(this.$minDate) || localDateAtUtc.isAfter(this.$maxDate)) ? false : true;
        }
    }

    public static final void AuraStyledDatePicker(C0z3 c0z3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-8855750);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c0z3) | i : i;
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
            C1XA.A01(auraDatePickerColors(bfm, 0), null, c0z3, bfm, bRg2, null, null, (iA0d & 14) | 224256 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143011(c0z3, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraDatePicker(java.time.LocalDate r14, X.G0U<? super java.time.LocalDate, kotlin.Unit> r15, X.BRg r16, java.time.LocalDate r17, java.time.LocalDate r18, java.time.LocalDate r19, X.BFM r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.picker.AuraDatePickerKt.AuraDatePicker(java.time.LocalDate, X.G0U, X.BRg, java.time.LocalDate, java.time.LocalDate, java.time.LocalDate, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraDatePickerDialog(java.time.LocalDate r15, X.G0U<? super java.time.LocalDate, kotlin.Unit> r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, java.lang.String r18, java.lang.String r19, X.BRg r20, java.time.LocalDate r21, java.time.LocalDate r22, java.time.LocalDate r23, X.BFM r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.picker.AuraDatePickerKt.AuraDatePickerDialog(java.time.LocalDate, X.G0U, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, X.BRg, java.time.LocalDate, java.time.LocalDate, java.time.LocalDate, X.BFM, int, int):void");
    }

    public static final C1Wz auraDatePickerColors(BFM bfm, int i) {
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        AuraColorsDatePicker auraColorsDatePicker = AnonymousClass001.A0f(bfm, akh).datePicker;
        long j = auraColorsDatePicker.containerColor;
        long j2 = auraColorsDatePicker.titleContentColor;
        long j3 = auraColorsDatePicker.headlineContentColor;
        long j4 = auraColorsDatePicker.weekdayContentColor;
        long j5 = auraColorsDatePicker.subheadContentColor;
        long j6 = auraColorsDatePicker.navigationContentColor;
        long j7 = auraColorsDatePicker.yearContentColor;
        long j8 = auraColorsDatePicker.disabledYearContentColor;
        long j9 = auraColorsDatePicker.currentYearContentColor;
        long j10 = auraColorsDatePicker.selectedYearContentColor;
        long j11 = auraColorsDatePicker.disabledSelectedYearContentColor;
        long j12 = auraColorsDatePicker.selectedYearContainerColor;
        long j13 = auraColorsDatePicker.disabledSelectedYearContainerColor;
        long j14 = auraColorsDatePicker.dayContentColor;
        long j15 = auraColorsDatePicker.disabledDayContentColor;
        long j16 = auraColorsDatePicker.selectedDayContentColor;
        long j17 = auraColorsDatePicker.disabledSelectedDayContentColor;
        long j18 = auraColorsDatePicker.selectedDayContainerColor;
        long j19 = auraColorsDatePicker.disabledSelectedDayContainerColor;
        long j20 = auraColorsDatePicker.todayContentColor;
        long j21 = auraColorsDatePicker.todayDateBorderColor;
        long j22 = auraColorsDatePicker.dayInSelectionRangeContentColor;
        long j23 = auraColorsDatePicker.dayInSelectionRangeContainerColor;
        long j24 = auraColorsDatePicker.dividerColor;
        C046319x c046319xAuraDateTextFieldColors = auraDateTextFieldColors(AnonymousClass001.A0f(bfm, akh), bfm, AuraColors.$stable);
        C1Wz c1WzA00 = C1XI.A00(AnonymousClass006.A0J(bfm), bfm);
        if (j == 16) {
            j = c1WzA00.A00;
        }
        if (j2 == 16) {
            j2 = c1WzA00.A0J;
        }
        if (j3 == 16) {
            j3 = c1WzA00.A0C;
        }
        if (j4 == 16) {
            j4 = c1WzA00.A0M;
        }
        if (j5 == 16) {
            j5 = c1WzA00.A0I;
        }
        if (j6 == 16) {
            j6 = c1WzA00.A0D;
        }
        if (j7 == 16) {
            j7 = c1WzA00.A0N;
        }
        if (j8 == 16) {
            j8 = c1WzA00.A0A;
        }
        if (j9 == 16) {
            j9 = c1WzA00.A01;
        }
        if (j10 == 16) {
            j10 = c1WzA00.A0H;
        }
        if (j11 == 16) {
            j11 = c1WzA00.A09;
        }
        if (j12 == 16) {
            j12 = c1WzA00.A0G;
        }
        if (j13 == 16) {
            j13 = c1WzA00.A08;
        }
        if (j14 == 16) {
            j14 = c1WzA00.A02;
        }
        if (j15 == 16) {
            j15 = c1WzA00.A05;
        }
        if (j16 == 16) {
            j16 = c1WzA00.A0F;
        }
        if (j17 == 16) {
            j17 = c1WzA00.A07;
        }
        if (j18 == 16) {
            j18 = c1WzA00.A0E;
        }
        if (j19 == 16) {
            j19 = c1WzA00.A06;
        }
        if (j20 == 16) {
            j20 = c1WzA00.A0K;
        }
        if (j21 == 16) {
            j21 = c1WzA00.A0L;
        }
        if (j23 == 16) {
            j23 = c1WzA00.A03;
        }
        if (j22 == 16) {
            j22 = c1WzA00.A04;
        }
        if (j24 == 16) {
            j24 = c1WzA00.A0B;
        }
        return new C1Wz(c046319xAuraDateTextFieldColors, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j23, j22, j24);
    }

    public static final C046319x auraDateTextFieldColors(AuraColors auraColors, BFM bfm, int i) {
        AuraColorsTextInput auraColorsTextInput = auraColors.textInput;
        long j = auraColorsTextInput.textColor;
        long j2 = auraColorsTextInput.cursorColor;
        long j3 = auraColorsTextInput.placeholderColor;
        long j4 = auraColorsTextInput.focusedBorderColor;
        long j5 = auraColorsTextInput.unfocusedBorderColor;
        long j6 = auraColorsTextInput.errorBorderColor;
        int i2 = AuraColors.$stable;
        int i3 = i & 14;
        long jAdaptiveFill = AuraAdaptiveColorsKt.adaptiveFill(auraColors, bfm, i2 | i3);
        long jAdaptiveFill2 = AuraAdaptiveColorsKt.adaptiveFill(auraColors, bfm, i2 | i3);
        long j7 = B6A.A07;
        C046319x c046319xA00 = C1A9.A00(AnonymousClass006.A0J(bfm), bfm);
        long j8 = j;
        long j9 = j;
        long j10 = j7;
        long j11 = j7;
        long j12 = j7;
        long j13 = j7;
        long j14 = j7;
        long j15 = j7;
        long j16 = j7;
        long j17 = j7;
        long j18 = j7;
        long j19 = j7;
        long j20 = j7;
        long j21 = j7;
        long j22 = j7;
        long j23 = j7;
        long j24 = j;
        long j25 = j7;
        long j26 = j7;
        long j27 = j3;
        long j28 = j7;
        long j29 = j7;
        long j30 = j7;
        long j31 = j7;
        long j32 = j7;
        long j33 = j7;
        long j34 = j7;
        long j35 = j7;
        long j36 = j7;
        long j37 = j7;
        long j38 = j7;
        long j39 = j7;
        long j40 = j7;
        if (j == 16) {
            j8 = c046319xA00.A0U;
        }
        if (j == 16) {
            j9 = c046319xA00.A0e;
        }
        if (j7 == 16) {
            j10 = c046319xA00.A09;
        }
        if (j7 == 16) {
            j11 = c046319xA00.A0K;
        }
        if (jAdaptiveFill == 16) {
            jAdaptiveFill = c046319xA00.A0M;
        }
        if (jAdaptiveFill2 == 16) {
            jAdaptiveFill2 = c046319xA00.A0W;
        }
        if (j7 == 16) {
            j12 = c046319xA00.A01;
        }
        if (j7 == 16) {
            j13 = c046319xA00.A0B;
        }
        if (j2 == 16) {
            j2 = c046319xA00.A00;
        }
        if (j7 == 16) {
            j14 = c046319xA00.A0C;
        }
        C1BT c1bt = c046319xA00.A0g;
        if (j4 == 16) {
            j4 = c046319xA00.A0N;
        }
        if (j5 == 16) {
            j5 = c046319xA00.A0X;
        }
        if (j7 == 16) {
            j15 = c046319xA00.A02;
        }
        if (j6 == 16) {
            j6 = c046319xA00.A0D;
        }
        if (j7 == 16) {
            j16 = c046319xA00.A0P;
        }
        if (j7 == 16) {
            j17 = c046319xA00.A0Z;
        }
        if (j7 == 16) {
            j18 = c046319xA00.A04;
        }
        if (j7 == 16) {
            j19 = c046319xA00.A0F;
        }
        if (j7 == 16) {
            j20 = c046319xA00.A0V;
        }
        if (j7 == 16) {
            j21 = c046319xA00.A0f;
        }
        if (j7 == 16) {
            j22 = c046319xA00.A0A;
        }
        if (j7 == 16) {
            j23 = c046319xA00.A0L;
        }
        if (j == 16) {
            j24 = c046319xA00.A0O;
        }
        if (j == 16) {
            j = c046319xA00.A0Y;
        }
        if (j7 == 16) {
            j25 = c046319xA00.A03;
        }
        if (j7 == 16) {
            j26 = c046319xA00.A0E;
        }
        if (j3 == 16) {
            j27 = c046319xA00.A0Q;
        }
        if (j3 == 16) {
            j3 = c046319xA00.A0a;
        }
        if (j7 == 16) {
            j28 = c046319xA00.A05;
        }
        if (j7 == 16) {
            j29 = c046319xA00.A0G;
        }
        if (j7 == 16) {
            j30 = c046319xA00.A0T;
        }
        if (j7 == 16) {
            j31 = c046319xA00.A0d;
        }
        if (j7 == 16) {
            j32 = c046319xA00.A08;
        }
        if (j7 == 16) {
            j33 = c046319xA00.A0J;
        }
        if (j7 == 16) {
            j34 = c046319xA00.A0R;
        }
        if (j7 == 16) {
            j35 = c046319xA00.A0b;
        }
        if (j7 == 16) {
            j36 = c046319xA00.A06;
        }
        if (j7 == 16) {
            j37 = c046319xA00.A0H;
        }
        if (j7 == 16) {
            j38 = c046319xA00.A0S;
        }
        if (j7 == 16) {
            j39 = c046319xA00.A0c;
        }
        if (j7 == 16) {
            j40 = c046319xA00.A07;
        }
        if (j7 == 16) {
            j7 = c046319xA00.A0I;
        }
        return new C046319x(c1bt, j8, j9, j10, j11, jAdaptiveFill, jAdaptiveFill2, j12, j13, j2, j14, j4, j5, j15, j6, j16, j17, j18, j19, j20, j21, j22, j23, j24, j, j25, j26, j27, j3, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j7);
    }

    public static final C1AI auraPickerShapes(C1DM c1dm) {
        C1DE c1de;
        return (!(c1dm instanceof C1DE) || (c1de = (C1DE) c1dm) == null) ? new C1AI(null, 31) : new C1AI(c1de, 15);
    }

    public static final HWA auraPickerTypography(AuraTypography auraTypography) {
        C1822Arm c1822ArmWithDefaultLineHeight = withDefaultLineHeight(auraTypography.bodyRegular);
        C1822Arm c1822Arm = auraTypography.subheadlineRegular;
        C1822Arm c1822Arm2 = auraTypography.subheadlineMedium;
        C1822Arm c1822Arm3 = auraTypography.footnoteMedium;
        C1822Arm c1822Arm4 = auraTypography.subheadlineEmphasized;
        C1822Arm c1822Arm5 = auraTypography.title3Medium;
        C1822Arm c1822Arm6 = auraTypography.title3Emphasized;
        return new HWA(auraTypography.title1Emphasized, auraTypography.title2Emphasized, c1822Arm6, c1822Arm5, c1822Arm4, c1822ArmWithDefaultLineHeight, c1822Arm, c1822Arm2, c1822Arm3, 18455);
    }

    public static final InterfaceC04801Xj auraSelectableDates(LocalDate localDate, LocalDate localDate2) {
        return new C143021(localDate, localDate2);
    }

    public static final long toUtcMidnightMillis(LocalDate localDate) {
        return localDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    public static final C1822Arm withDefaultLineHeight(C1822Arm c1822Arm) {
        return C1822Arm.A00(null, c1822Arm, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C1809ArT.A01);
    }

    public static final void AuraMaterialPickerTheme(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        bfm.AgG(401422474);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            C1DM c1dm = AnonymousClass002.A0e(bfm).modal;
            boolean zA65 = bfm.A65(auraColorsA0c);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                AuraColorsDatePicker auraColorsDatePicker = auraColorsA0c.datePicker;
                boolean z = auraColorsA0c.isLight;
                long j25 = auraColorsA0c.invertedButtonBackground;
                long j26 = auraColorsA0c.invertedButtonContent;
                long j27 = auraColorsDatePicker.containerColor;
                long j28 = auraColorsA0c.primaryText;
                long j29 = auraColorsA0c.highlight;
                long j30 = auraColorsA0c.secondaryText;
                long j31 = auraColorsA0c.border;
                long j32 = auraColorsA0c.fillDivider;
                long j33 = auraColorsA0c.error;
                if (z) {
                    j = C1X0.A0K;
                    j2 = C1X0.A0A;
                    j3 = C1X0.A04;
                    j4 = C1X0.A0M;
                    j5 = C1X0.A0B;
                    j6 = C1X0.A0N;
                    j7 = C1X0.A0C;
                    j8 = C1X0.A0X;
                    j9 = C1X0.A0F;
                    j10 = C1X0.A0Y;
                    j11 = C1X0.A0G;
                    j12 = C1X0.A05;
                    j13 = C1X0.A03;
                    j14 = C1X0.A07;
                    j15 = C1X0.A02;
                    j16 = C1X0.A08;
                    j17 = C1X0.A0L;
                    j18 = C1X0.A0P;
                    j19 = C1X0.A0Q;
                    j20 = C1X0.A0R;
                    j21 = C1X0.A0S;
                    j22 = C1X0.A0T;
                    j23 = C1X0.A0U;
                    j24 = C1X0.A0V;
                } else {
                    j = C1X1.A0B;
                    j2 = C1X1.A06;
                    j3 = C1X1.A02;
                    j4 = C1X1.A0D;
                    j5 = C1X1.A07;
                    j6 = C1X1.A0E;
                    j7 = C1X1.A08;
                    j8 = C1X1.A0M;
                    j9 = C1X1.A09;
                    j10 = C1X1.A0N;
                    j11 = C1X1.A0A;
                    j12 = C1X1.A03;
                    j13 = C1X1.A01;
                    j14 = C1X1.A04;
                    j15 = C1X1.A00;
                    j16 = C1X1.A05;
                    j17 = C1X1.A0C;
                    j18 = C1X1.A0F;
                    j19 = C1X1.A0G;
                    j20 = C1X1.A0H;
                    j21 = C1X1.A0I;
                    j22 = C1X1.A0J;
                    j23 = C1X1.A0K;
                    j24 = C1X1.A0L;
                }
                objAaT = new C04921Xv(j25, j26, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j27, j28, j27, j28, j29, j30, j27, j12, j13, j33, j14, j15, j16, j31, j32, j17, j18, j24, j19, j20, j21, j22, j23);
                bfm.Ai0(objAaT);
            }
            C04921Xv c04921Xv = (C04921Xv) objAaT;
            boolean zA652 = bfm.A65(auraTypographyA0f);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = auraPickerTypography(auraTypographyA0f);
                bfm.Ai0(objAaT2);
            }
            HWA hwa = (HWA) objAaT2;
            boolean zA653 = bfm.A65(c1dm);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = auraPickerShapes(c1dm);
                bfm.Ai0(objAaT3);
            }
            C1AF.A00(c04921Xv, (C1AI) objAaT3, hwa, bfm, B1V.A00(bfm, new C143003(g0v), 1523937078), 3072, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(g0v, i);
        }
    }

    public static final C0z3 rememberAuraDatePickerState(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, BFM bfm, int i) {
        bfm.Ag8(-1026106833, bfm.APR(localDate2, localDate3));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new C143021(localDate2, localDate3);
            bfm.Ai0(objAaT);
        }
        InterfaceC04801Xj interfaceC04801Xj = (InterfaceC04801Xj) objAaT;
        Long lValueOf = localDate != null ? Long.valueOf(toUtcMidnightMillis(localDate)) : null;
        Long lValueOf2 = Long.valueOf(toUtcMidnightMillis(localDate4));
        ADq aDq = new ADq(localDate2.getYear(), localDate3.getYear());
        Locale localeA00 = C1X3.A00(bfm);
        Object[] objArr = new Object[0];
        C0872AFu c0872AFuA00 = AbstractC0871AFr.A00(new C05513bx(0, localeA00, interfaceC04801Xj), new C05423bo(7));
        boolean zA1V = AnonymousClass002.A1V(bfm, localeA00, AnonymousClass002.A1V(bfm, aDq, bfm.A65(lValueOf), bfm.A65(lValueOf2)), bfm.A63(0));
        Object objAaT2 = bfm.AaT();
        if (zA1V || objAaT2 == obj) {
            objAaT2 = new C1X7(interfaceC04801Xj, lValueOf, lValueOf2, localeA00, aDq);
            bfm.Ai0(objAaT2);
        }
        C1XE c1xe = (C1XE) AFz.A02(bfm, c0872AFuA00, (Function0) objAaT2, objArr, 4);
        c1xe.A04.Af8(interfaceC04801Xj);
        AnonymousClass001.A1D(bfm);
        return c1xe;
    }

    public static final LocalDate toLocalDateAtUtc(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(ZoneOffset.UTC).toLocalDate();
        C7384Etj.A0U(localDate);
        return localDate;
    }
}
