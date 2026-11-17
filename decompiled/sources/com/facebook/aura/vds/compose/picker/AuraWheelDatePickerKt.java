package com.facebook.aura.vds.compose.picker;

import X.ADq;
import X.AEk;
import X.AGI;
import X.AHD;
import X.AKQ;
import X.AZ3;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C06I;
import X.C0A8;
import X.C0er;
import X.C1062ATq;
import X.C10G;
import X.C1160Acs;
import X.C1161Act;
import X.C1417Aim;
import X.C1515AkP;
import X.C15k;
import X.C16C;
import X.C1DM;
import X.C1DP;
import X.C1OM;
import X.C1Y7;
import X.C1YY;
import X.C1er;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC05343Un;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.text.format.DateFormat;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraWheelDatePickerKt {
    public static final float DAY_COLUMN_WEIGHT = 0.8f;
    public static final float MONTH_COLUMN_WEIGHT = 1.6f;
    public static final float YEAR_COLUMN_WEIGHT = 1.0f;
    public static final float WHEEL_HEIGHT = 180.0f;
    public static final float WHEEL_ITEM_HEIGHT = 36.0f;
    public static final float WHEEL_DIALOG_MAX_WIDTH = 320.0f;
    public static final AHD<Integer> MONTHS = AGI.A07(new ADq(1, 12));

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$AuraWheelDatePicker$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LocalDate $maxDate;
        public final /* synthetic */ LocalDate $minDate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
        public final /* synthetic */ LocalDate $selectedDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(LocalDate localDate, G0U<? super LocalDate, Unit> g0u, BRg bRg, LocalDate localDate2, LocalDate localDate3, int i, int i2) {
            super(2);
            this.$selectedDate = localDate;
            this.$onDateSelected = g0u;
            this.$modifier = bRg;
            this.$minDate = localDate2;
            this.$maxDate = localDate3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraWheelDatePickerKt.AuraWheelDatePicker(this.$selectedDate, this.$onDateSelected, this.$modifier, this.$minDate, this.$maxDate, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ String $dismissText;
        public final /* synthetic */ LocalDate $maxDate;
        public final /* synthetic */ LocalDate $minDate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ MutableState<LocalDate> $pendingDate$delegate;
        public final /* synthetic */ LocalDate $selectedDate;

        /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04281 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
            public final /* synthetic */ String $confirmText;
            public final /* synthetic */ String $dismissText;
            public final /* synthetic */ LocalDate $maxDate;
            public final /* synthetic */ LocalDate $minDate;
            public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
            public final /* synthetic */ Function0<Unit> $onDismissRequest;
            public final /* synthetic */ MutableState<LocalDate> $pendingDate$delegate;
            public final /* synthetic */ LocalDate $selectedDate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04281(LocalDate localDate, LocalDate localDate2, MutableState<LocalDate> mutableState, LocalDate localDate3, String str, Function0<Unit> function0, String str2, G0U<? super LocalDate, Unit> g0u) {
                super(3);
                this.$selectedDate = localDate;
                this.$maxDate = localDate2;
                this.$pendingDate$delegate = mutableState;
                this.$minDate = localDate3;
                this.$dismissText = str;
                this.$onDismissRequest = function0;
                this.$confirmText = str2;
                this.$onDateSelected = g0u;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
                invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
                    BS0 bs0 = BRg.A00;
                    float f = AuraDimensKt.SpacingLargePlusMicro;
                    BRg bRgA09 = C3U4.A09(bs0, f);
                    C9m9 c9m9A00 = AcQ.A00(f);
                    LocalDate localDate = this.$selectedDate;
                    LocalDate localDate2 = this.$maxDate;
                    MutableState<LocalDate> mutableState = this.$pendingDate$delegate;
                    LocalDate localDate3 = this.$minDate;
                    String str = this.$dismissText;
                    Function0<Unit> function0 = this.$onDismissRequest;
                    String str2 = this.$confirmText;
                    G0U<LocalDate, Unit> g0u = this.$onDateSelected;
                    InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                    BBI bbi = (BBI) bfm;
                    long j = bbi.A06;
                    int i2 = (int) (j ^ (j >>> 32));
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA09);
                    Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                    BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                    G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
                    boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, localDate2);
                    Object objAaT = bfm.AaT();
                    if (zA1J || objAaT == C78N.A00) {
                        objAaT = new AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1$1$1$1$1(localDate2, mutableState);
                        bfm.Ai0(objAaT);
                    }
                    AuraWheelDatePickerKt.AuraWheelDatePicker(localDate, (G0U) objAaT, null, localDate3, localDate2, bfm, 0, 4);
                    C1062ATq c1062ATq = C10G.A02;
                    InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A01(C2VU.A01, AuraDimensKt.SpacingSmall), bfm, C2VU.A05, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                    BPg.A02(bfm, akqA042, g0v2);
                    AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                    AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                    boolean z = false;
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, null, auraButtonStyles.secondary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201293);
                    AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
                    if (mutableState.getValue() != null) {
                        z = true;
                    }
                    boolean zA1K = AnonymousClass003.A1K(bfm, mutableState, g0u);
                    Object objAaT2 = bfm.AaT();
                    if (zA1K || objAaT2 == C78N.A00) {
                        objAaT2 = new AuraWheelDatePickerKt$AuraWheelDatePickerDialog$1$1$1$2$1$1(g0u, mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, str2, null, null, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134200781);
                    BBI.A0R(bbi, true);
                    BBI.A0R(bbi, true);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BRg bRg, LocalDate localDate, LocalDate localDate2, MutableState<LocalDate> mutableState, LocalDate localDate3, String str, Function0<Unit> function0, String str2, G0U<? super LocalDate, Unit> g0u) {
            super(2);
            this.$modifier = bRg;
            this.$selectedDate = localDate;
            this.$maxDate = localDate2;
            this.$pendingDate$delegate = mutableState;
            this.$minDate = localDate3;
            this.$dismissText = str;
            this.$onDismissRequest = function0;
            this.$confirmText = str2;
            this.$onDateSelected = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraSurfaceKt.m2623AuraSurface1esR5Hs(C10G.A0D(this.$modifier, Float.NaN, AuraWheelDatePickerKt.WHEEL_DIALOG_MAX_WIDTH), AnonymousClass002.A0e(bfm).modal, false, AnonymousClass002.A0c(bfm).modal, null, 0L, null, false, B1V.A00(bfm, new C04281(this.$selectedDate, this.$maxDate, this.$pendingDate$delegate, this.$minDate, this.$dismissText, this.$onDismissRequest, this.$confirmText, this.$onDateSelected), -433512743), bfm, 100663296, 244);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$AuraWheelDatePickerDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C143032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ String $dismissText;
        public final /* synthetic */ LocalDate $maxDate;
        public final /* synthetic */ LocalDate $minDate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<LocalDate, Unit> $onDateSelected;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ LocalDate $selectedDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C143032(LocalDate localDate, G0U<? super LocalDate, Unit> g0u, Function0<Unit> function0, String str, String str2, BRg bRg, LocalDate localDate2, LocalDate localDate3, int i, int i2) {
            super(2);
            this.$selectedDate = localDate;
            this.$onDateSelected = g0u;
            this.$onDismissRequest = function0;
            this.$confirmText = str;
            this.$dismissText = str2;
            this.$modifier = bRg;
            this.$minDate = localDate2;
            this.$maxDate = localDate3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraWheelDatePickerKt.AuraWheelDatePickerDialog(this.$selectedDate, this.$onDateSelected, this.$onDismissRequest, this.$confirmText, this.$dismissText, this.$modifier, this.$minDate, this.$maxDate, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$SelectionBands$2, reason: invalid class name and case insensitive filesystem */
    public final class C143042 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143042(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraWheelDatePickerKt.SelectionBands(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt$WheelColumn$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ AHD<Integer> $items;
        public final /* synthetic */ G0U<Integer, String> $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onSelected;
        public final /* synthetic */ int $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AHD<Integer> ahd, int i, G0U<? super Integer, String> g0u, G0U<? super Integer, Unit> g0u2, String str, BRg bRg, int i2, int i3) {
            super(2);
            this.$items = ahd;
            this.$selected = i;
            this.$label = g0u;
            this.$onSelected = g0u2;
            this.$contentDescription = str;
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
            AuraWheelDatePickerKt.WheelColumn(this.$items, this.$selected, this.$label, this.$onSelected, this.$contentDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WheelField.values().length];
            try {
                AnonymousClass002.A13(WheelField.MONTH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(WheelField.DAY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(WheelField.YEAR, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraWheelDatePicker(java.time.LocalDate r36, X.G0U<? super java.time.LocalDate, kotlin.Unit> r37, X.BRg r38, java.time.LocalDate r39, java.time.LocalDate r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt.AuraWheelDatePicker(java.time.LocalDate, X.G0U, X.BRg, java.time.LocalDate, java.time.LocalDate, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraWheelDatePickerDialog(java.time.LocalDate r15, X.G0U<? super java.time.LocalDate, kotlin.Unit> r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, java.lang.String r18, java.lang.String r19, X.BRg r20, java.time.LocalDate r21, java.time.LocalDate r22, X.BFM r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.picker.AuraWheelDatePickerKt.AuraWheelDatePickerDialog(java.time.LocalDate, X.G0U, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, X.BRg, java.time.LocalDate, java.time.LocalDate, X.BFM, int, int):void");
    }

    public static final void WheelColumn(AHD<Integer> ahd, int i, G0U<? super Integer, String> g0u, G0U<? super Integer, Unit> g0u2, String str, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(696791049);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str);
        }
        int i4 = i3 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            int iIndexOf = ahd.indexOf(Integer.valueOf(i));
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            LazyListState lazyListStateA00 = AZ3.A00(iIndexOf, 0, bfm, 0, 2);
            MutableState mutableStateA00 = C1er.A00(bfm, g0u2);
            int i5 = iA0d & 14;
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass003.A17(i5), bfm.A65(lazyListStateA00));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new AuraWheelDatePickerKt$WheelColumn$1$1(lazyListStateA00, ahd, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, lazyListStateA00, ahd);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            boolean zA1W2 = AnonymousClass003.A1W(lazyListStateA00, bfm, iIndexOf);
            Object objAaT2 = bfm.AaT();
            if (zA1W2 || objAaT2 == C78N.A00) {
                objAaT2 = new AuraWheelDatePickerKt$WheelColumn$2$1(lazyListStateA00, iIndexOf, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, numValueOf);
            float f = WHEEL_HEIGHT;
            BRg bRgA04 = C10G.A04(bRg2, f);
            long j = C15k.A01;
            C1DM c1dm = C1OM.A00;
            long j2 = C0er.A00;
            BRg bRgThen = bRgA04.then(new C1417Aim(c1dm, 1.0f, 0.0f, 0.0f, 1, j, j2, j2, false));
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = AuraWheelDatePickerKt$WheelColumn$3$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            BRg bRgA02 = AEk.A02(bRgThen, (G0U) objAaT3);
            int i6 = iA0d & 896;
            boolean zA1L = AnonymousClass005.A1L(iA0d) | AnonymousClass003.A19(i6);
            int i7 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1W3 = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass002.A1Q(i5, 4), AnonymousClass002.A1S(bfm, iIndexOf, zA1L, AnonymousClass003.A18(i7)));
            Object objAaT4 = bfm.AaT();
            if (zA1W3 || objAaT4 == obj) {
                objAaT4 = new AuraWheelDatePickerKt$WheelColumn$4$1(str, g0u, i, iIndexOf, ahd, mutableStateA00);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA02, objAaT4);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j3 = bbi.A06;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i8);
            InterfaceC05343Un interfaceC05343UnA00 = C1Y7.A00(null, lazyListStateA00, bfm, 0, 2);
            C3TH c3th = C2VU.A00;
            float f2 = (f - WHEEL_ITEM_HEIGHT) / 2.0f;
            C1DP c1dp = new C1DP(0.0f, f2, 0.0f, f2);
            C1062ATq c1062ATq = C10G.A02;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 4) | AnonymousClass002.A1Q(i7, 32) | (i6 == 256);
            Object objAaT5 = bfm.AaT();
            if (zA1Q || objAaT5 == obj) {
                objAaT5 = new AuraWheelDatePickerKt$WheelColumn$5$1$1(ahd, i, g0u);
                bfm.Ai0(objAaT5);
            }
            C1YY.A01(null, interfaceC05343UnA00, null, c1dp, lazyListStateA00, bfm, c3th, c1062ATq, (G0U) objAaT5, 196998, 408, false, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(ahd, i, g0u, g0u2, str, bRg2, i2, i3);
        }
    }

    public static final List<String> monthNames(Locale locale) {
        String[] months = new DateFormatSymbols(locale).getMonths();
        C7384Etj.A0U(months);
        ArrayList arrayList = new ArrayList();
        for (String str : months) {
            C7384Etj.A0X(str);
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static final List<WheelField> wheelFieldOrder(Locale locale) {
        WheelField wheelField;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "yMMMd");
        ArrayList arrayList = new ArrayList();
        C7384Etj.A0X(bestDateTimePattern);
        for (int i = 0; i < bestDateTimePattern.length(); i++) {
            char cCharAt = bestDateTimePattern.charAt(i);
            if (cCharAt == 'L' || cCharAt == 'M') {
                wheelField = WheelField.MONTH;
            } else if (cCharAt == 'd') {
                wheelField = WheelField.DAY;
            } else if (cCharAt == 'y') {
                wheelField = WheelField.YEAR;
            }
            if (!arrayList.contains(wheelField)) {
                arrayList.add(wheelField);
            }
        }
        return arrayList.size() != 3 ? Arrays.asList(WheelField.MONTH, WheelField.DAY, WheelField.YEAR) : arrayList;
    }

    public static final void AuraWheelDatePicker$select(G0U<? super LocalDate, Unit> g0u, C00r c00r, C00r c00r2, C00r c00r3, LocalDate localDate, LocalDate localDate2, int i, int i2, int i3) {
        int iLengthOfMonth = YearMonth.of(i, i2).lengthOfMonth();
        if (i3 > iLengthOfMonth) {
            i3 = iLengthOfMonth;
        }
        c00r.AdX(i);
        c00r2.AdX(i2);
        c00r3.AdX(i3);
        LocalDate localDateOf = LocalDate.of(i, i2, i3);
        C7384Etj.A0X(localDateOf);
        if (localDateOf.compareTo((Object) localDate) < 0 || localDateOf.compareTo((Object) localDate2) > 0) {
            localDateOf = null;
        }
        g0u.invoke(localDateOf);
    }

    public static final void SelectionBands(BFM bfm, int i) {
        bfm.AgG(-1845717485);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA04 = C10G.A04(C10G.A02, WHEEL_HEIGHT);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraDividerKt.AuraRowDivider(null, bfm, 0, 1);
            C3Ue.A04(C10G.A04(bs0, WHEEL_ITEM_HEIGHT), bfm, 6);
            AuraDividerKt.AuraRowDivider(null, bfm, 0, 1);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143042(i);
        }
    }

    public static final /* synthetic */ LocalDate access$AuraWheelDatePickerDialog$lambda$1(MutableState mutableState) {
        return (LocalDate) mutableState.getValue();
    }

    public static final int centeredItemIndex(LazyListState lazyListState) {
        Object next;
        int i = (((C1161Act) lazyListState.A04()).A07 + ((C1161Act) lazyListState.A04()).A06) / 2;
        Iterator it = AnonymousClass003.A0j(lazyListState).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                C1160Acs c1160Acs = (C1160Acs) ((C16C) next);
                int iAbs = Math.abs((c1160Acs.A02 + (c1160Acs.A09 / 2)) - i);
                do {
                    Object next2 = it.next();
                    C1160Acs c1160Acs2 = (C1160Acs) ((C16C) next2);
                    int iAbs2 = Math.abs((c1160Acs2.A02 + (c1160Acs2.A09 / 2)) - i);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C16C c16c = (C16C) next;
        return c16c != null ? ((C1160Acs) c16c).A07 : lazyListState.A02();
    }

    public static final int lengthOfMonth(int i, int i2) {
        return YearMonth.of(i, i2).lengthOfMonth();
    }
}
