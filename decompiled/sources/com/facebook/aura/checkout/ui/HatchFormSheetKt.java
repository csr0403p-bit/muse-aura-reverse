package com.facebook.aura.checkout.ui;

import X.AFs;
import X.AFz;
import X.AHD;
import X.AHI;
import X.AIW;
import X.AKQ;
import X.ARD;
import X.ARK;
import X.AXK;
import X.AbstractC0871AFr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC1815ArZ;
import X.AbstractC2159Azp;
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
import X.Au3;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQG;
import X.BRg;
import X.C00x;
import X.C0981AMm;
import X.C10472Hkj;
import X.C1515AkP;
import X.C1805ArO;
import X.C1822Arm;
import X.C1er;
import X.C1qN;
import X.C2297BSx;
import X.C2VU;
import X.C3U4;
import X.C3bQ;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C8j4;
import X.C9jH;
import X.F60;
import X.G0U;
import X.G0V;
import X.Hw8;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.checkout.ui.HatchFieldValidation;
import com.facebook.aura.payments.cardvalidation.HatchCardFieldFormat;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchFormSheetKt {

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$AutocompleteFieldRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAddressAutocomplete $autocomplete;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ HatchFormField $field;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchFormField hatchFormField, HatchAddressAutocomplete hatchAddressAutocomplete, HatchFormState hatchFormState, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$field = hatchFormField;
            this.$autocomplete = hatchAddressAutocomplete;
            this.$state = hatchFormState;
            this.$errorMessage = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.AutocompleteFieldRow(this.$field, this.$autocomplete, this.$state, this.$errorMessage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormFieldError$2, reason: invalid class name and case insensitive filesystem */
    public final class C110442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110442(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormFieldError(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormFieldRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchFormField $field;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchFormField hatchFormField, HatchFormState hatchFormState, BRg bRg, int i, int i2) {
            super(2);
            this.$field = hatchFormField;
            this.$state = hatchFormState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormFieldRow(this.$field, this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormFieldRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C110452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchFormField $field;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110452(HatchFormField hatchFormField, HatchFormState hatchFormState, BRg bRg, int i, int i2) {
            super(2);
            this.$field = hatchFormField;
            this.$state = hatchFormState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormFieldRow(this.$field, this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormFieldRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchFormField $field;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchFormField hatchFormField, HatchFormState hatchFormState, BRg bRg, int i, int i2) {
            super(2);
            this.$field = hatchFormField;
            this.$state = hatchFormState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormFieldRow(this.$field, this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormRowView$2, reason: invalid class name and case insensitive filesystem */
    public final class C110462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormRow $row;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110462(HatchFormRow hatchFormRow, HatchFormState hatchFormState, BRg bRg, int i, int i2) {
            super(2);
            this.$row = hatchFormRow;
            this.$state = hatchFormState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormRowView(this.$row, this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C110472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormSection $section;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110472(HatchFormSection hatchFormSection, HatchFormState hatchFormState, BRg bRg, int i, int i2) {
            super(2);
            this.$section = hatchFormSection;
            this.$state = hatchFormState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormSection(this.$section, this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormSelectionButton$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $placeholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(2);
            this.$placeholder = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass007.A12(bfm, AuraTextInputDefaults.INSTANCE, this.$placeholder);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormSelectionButton$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Hw8 $autofillType;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<CharSequence, Boolean> $onAutofill;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $placeholder;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(String str, String str2, String str3, Hw8 hw8, G0U<? super CharSequence, Boolean> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$placeholder = str;
            this.$value = str2;
            this.$errorMessage = str3;
            this.$autofillType = hw8;
            this.$onAutofill = g0u;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormSelectionButton(this.$placeholder, this.$value, this.$errorMessage, this.$autofillType, this.$onAutofill, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormSelectionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C110482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ HatchFormField $field;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110482(HatchFormField hatchFormField, HatchFormState hatchFormState, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$field = hatchFormField;
            this.$state = hatchFormState;
            this.$errorMessage = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormSelectionRow(this.$field, this.$state, this.$errorMessage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormTextInput$3, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C110493 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchFormField $field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110493(HatchFormField hatchFormField) {
            super(2);
            this.$field = hatchFormField;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass007.A12(bfm, AuraTextInputDefaults.INSTANCE, this.$field.placeholder);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormTextInput$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ HatchFormField $field;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onTextChange;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(HatchFormField hatchFormField, HatchFormState hatchFormState, String str, BRg bRg, G0U<? super String, Unit> g0u, int i, int i2) {
            super(2);
            this.$field = hatchFormField;
            this.$state = hatchFormState;
            this.$errorMessage = str;
            this.$modifier = bRg;
            this.$onTextChange = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.FormTextInput(this.$field, this.$state, this.$errorMessage, this.$modifier, this.$onTextChange, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$HatchFormSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C110502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $accessory;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110502(HatchFormState hatchFormState, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$state = hatchFormState;
            this.$modifier = bRg;
            this.$accessory = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFormSheetKt.HatchFormSheet(this.$state, this.$modifier, this.$accessory, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchFormSheet(HatchFormState hatchFormState, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        G0V<? super BFM, ? super Integer, Unit> g0v2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchFormState, 0);
        bfm.AgG(449365511);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchFormState) | i : i;
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
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            g0v2 = i4 == 0 ? g0v : null;
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
            bfm.AgE(382184291);
            Iterator it = hatchFormState.getSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui().iterator();
            while (it.hasNext()) {
                FormSection((HatchFormSection) it.next(), hatchFormState, null, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            }
            BBI.A0R(bbi, false);
            if (g0v2 == null) {
                bfm.AgE(-1037124696);
            } else {
                bfm.AgE(382186361);
                AnonymousClass003.A13(bfm, g0v2, iA0d >> 6);
            }
            BBI.A0R(bbi, false);
            if (MutableState.A0A(hatchFormState.trailingSectionsRevealed$delegate)) {
                bfm.AgE(-1037073638);
                Iterator it2 = hatchFormState.getTrailingSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui().iterator();
                while (it2.hasNext()) {
                    FormSection((HatchFormSection) it2.next(), hatchFormState, null, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
                }
            } else {
                bfm.AgE(-1036990031);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
            g0v2 = g0v;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110502(hatchFormState, bRg2, g0v2, i, i2);
        }
    }

    public static final AuJ keyboardOptions(HatchFormFieldKind hatchFormFieldKind) {
        C7384Etj.A0Y(hatchFormFieldKind, 0);
        return new AuJ(null, capitalization(hatchFormFieldKind), keyboardType(hatchFormFieldKind), -1);
    }

    public static final HatchFormState rememberHatchFormState(AHD<HatchFormSection> ahd, AHD<HatchFormSection> ahd2, boolean z, boolean z2, BFM bfm, int i, int i2) {
        Object objA0p;
        C7384Etj.A0Y(ahd, 0);
        if ((i2 & 2) != 0) {
            ahd2 = AHI.A01;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean zA1P = AnonymousClass005.A1P(i2, z2);
        List<HatchFormField> listAllFields = allFields(AbstractC0878AGe.A0P(ahd2, ahd));
        if (zA1P) {
            Object objA0p2 = AnonymousClass001.A0p(bfm, -1085070915);
            Object obj = C78N.A00;
            if (objA0p2 == obj) {
                HatchFormSheetKt$rememberHatchFormState$state$saver$1$1 hatchFormSheetKt$rememberHatchFormState$state$saver$1$1 = HatchFormSheetKt$rememberHatchFormState$state$saver$1$1.INSTANCE;
                HatchFormSheetKt$rememberHatchFormState$state$saver$1$2 hatchFormSheetKt$rememberHatchFormState$state$saver$1$2 = HatchFormSheetKt$rememberHatchFormState$state$saver$1$2.INSTANCE;
                objA0p2 = AbstractC0871AFr.A00(new C2297BSx((G0U) hatchFormSheetKt$rememberHatchFormState$state$saver$1$2, 29), new C3bQ(hatchFormSheetKt$rememberHatchFormState$state$saver$1$1, 3));
                bfm.Ai0(objA0p2);
            }
            AFs aFs = (AFs) objA0p2;
            Object[] objArr = new Object[0];
            boolean zA67 = bfm.A67(listAllFields);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == obj) {
                objAaT = new HatchFormSheetKt$rememberHatchFormState$state$1$1(listAllFields);
                BBI.A0T(bfm, objAaT);
            }
            objA0p = AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
        } else {
            objA0p = AnonymousClass001.A0p(bfm, -1084431850);
            if (objA0p == C78N.A00) {
                objA0p = new HatchFormState(listAllFields);
                BBI.A0T(bfm, objA0p);
            }
        }
        HatchFormState hatchFormState = (HatchFormState) objA0p;
        AnonymousClass001.A1D(bfm);
        hatchFormState.seed$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(listAllFields);
        hatchFormState.setSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(ahd);
        hatchFormState.setTrailingSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(ahd2);
        hatchFormState.setTrailingSectionsRevealed$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(z);
        return hatchFormState;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchFormFieldKind.values().length];
            try {
                AnonymousClass002.A13(HatchFormFieldKind.EMAIL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchFormFieldKind.PHONE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchFormFieldKind.CREDIT_CARD_NUMBER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchFormFieldKind.CREDIT_CARD_SECURITY_CODE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchFormFieldKind.NUMBER, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchFormFieldKind.POSTAL_CODE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchFormFieldKind.CREDIT_CARD_EXPIRATION, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchFormFieldKind.TEXT, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchFormFieldKind.FULL_NAME, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchFormFieldKind.GIVEN_NAME, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchFormFieldKind.FAMILY_NAME, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(HatchFormFieldKind.STREET_ADDRESS, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(HatchFormFieldKind.ADDRESS_LINE, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(HatchFormFieldKind.CITY, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HatchFormFieldKind.STATE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HatchFormFieldKind.COUNTRY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AutocompleteFieldRow(com.facebook.aura.checkout.ui.HatchFormField r34, com.facebook.aura.checkout.ui.HatchAddressAutocomplete r35, com.facebook.aura.checkout.ui.HatchFormState r36, java.lang.String r37, X.BRg r38, X.BFM r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkout.ui.HatchFormSheetKt.AutocompleteFieldRow(com.facebook.aura.checkout.ui.HatchFormField, com.facebook.aura.checkout.ui.HatchAddressAutocomplete, com.facebook.aura.checkout.ui.HatchFormState, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void FormFieldError(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1968570171);
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).caption1Regular;
            long j = auraTheme.getColors(bfm, 6).errorText;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchFormSheetKt$FormFieldError$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRg2, (G0U) objAaT, false), j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110442(str, bRg2, i, i2);
        }
    }

    public static final void FormFieldRow(HatchFormField hatchFormField, HatchFormState hatchFormState, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(1347933543);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchFormField) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, hatchFormState);
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
            Map<String, String> mapCollected = hatchFormField.validate != null ? hatchFormState.collected() : C9jH.A00;
            G0V<String, Map<String, String>, HatchFieldValidation> g0v = hatchFormField.validate;
            String str2 = null;
            if (g0v != null) {
                String str3 = mapCollected.get(hatchFormField.id);
                if (str3 == null) {
                    str3 = "";
                }
                HatchFieldValidation hatchFieldValidationInvoke = g0v.invoke(str3, mapCollected);
                if ((hatchFieldValidationInvoke instanceof HatchFieldValidation.Invalid) && (str = ((HatchFieldValidation.Invalid) hatchFieldValidationInvoke).message) != null) {
                    str2 = str;
                }
            }
            if (hatchFormField.options.isEmpty()) {
                bfm.AgE(-1655529189);
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                HatchAddressAutocomplete hatchAddressAutocomplete = hatchFormField.addressAutocomplete;
                if (hatchAddressAutocomplete != null) {
                    bfm.AgE(-1655450914);
                    AutocompleteFieldRow(hatchFormField, hatchAddressAutocomplete, hatchFormState, str2, bRg2, bfm, (iA0d & 14) | ((iA0d << 3) & 896) | ((iA0d << 6) & 57344), 0);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass3 = new C110452(hatchFormField, hatchFormState, bRg2, i, i2);
                    }
                } else {
                    bfm.AgE(-1655361541);
                    BBI.A0R(bbi, false);
                    FormTextInput(hatchFormField, hatchFormState, str2, bRg2, null, bfm, (iA0d & 126) | ((iA0d << 3) & 7168), 16);
                }
            } else {
                bfm.AgE(-1655601264);
                FormSelectionRow(hatchFormField, hatchFormState, str2, bRg2, bfm, (iA0d & 126) | ((iA0d << 3) & 7168), 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass3 = new AnonymousClass1(hatchFormField, hatchFormState, bRg2, i, i2);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(hatchFormField, hatchFormState, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void FormRowView(HatchFormRow hatchFormRow, HatchFormState hatchFormState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(911794988);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchFormRow) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, hatchFormState);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A05);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            bfm.AgE(1442096065);
            Iterator it = hatchFormRow.fields.iterator();
            while (it.hasNext()) {
                FormFieldRow((HatchFormField) it.next(), hatchFormState, ARK.A01(BRg.A00, 1.0f, true), bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110462(hatchFormRow, hatchFormState, bRg2, i, i2);
        }
    }

    public static final void FormSection(HatchFormSection hatchFormSection, HatchFormState hatchFormState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(931208305);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchFormSection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, hatchFormState);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
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
            String str = hatchFormSection.label;
            if (str == null) {
                bfm.AgE(-507024847);
            } else {
                BRg bRgA07 = C3U4.A07(C3cG.A09(bfm, -507024846), AuraDimensKt.SpacingMedium);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA07, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(260749221);
            Iterator it = hatchFormSection.rows.iterator();
            while (it.hasNext()) {
                FormRowView((HatchFormRow) it.next(), hatchFormState, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110472(hatchFormSection, hatchFormState, bRg2, i, i2);
        }
    }

    public static final void FormSelectionButton(String str, String str2, String str3, Hw8 hw8, G0U<? super CharSequence, Boolean> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1733467783);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(hw8, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C1qN();
                BBI.A0T(bfm, objAaT);
            }
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) objAaT;
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchFormSheetKt$FormSelectionButton$1$1(interfaceC1072AWd, mutableStateA00, null);
                BBI.A0T(bfm, objAaT2);
            }
            C78e.A06(bfm, interfaceC1072AWd, (G0V) objAaT2);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA652 = bfm.A65(mutableStateA00);
            Object objAaT3 = bfm.AaT();
            if (zA652 || objAaT3 == obj) {
                objAaT3 = new HatchFormSheetKt$FormSelectionButton$2$1(mutableStateA00);
                BBI.A0T(bfm, objAaT3);
            }
            BRg bRgThen = bRgA0R.then(new AXK(null, (G0U) objAaT3));
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass004.A1I(iA0d) | AnonymousClass004.A1F(iA0d), AnonymousClass004.A1K(iA0d)) | ((iA0d & 7168) == 2048 || ((iA0d & 4096) != 0 && bfm.A67(hw8))) | AnonymousClass005.A1L(iA0d);
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == obj) {
                objAaT4 = new HatchFormSheetKt$FormSelectionButton$3$1(str, str2, str3, hw8, mutableStateA00, g0u);
                BBI.A0T(bfm, objAaT4);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgThen, objAaT4);
            boolean zA1X = AnonymousClass002.A1X(str3);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass4(str), 1523518963);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchFormSheetKt.f16lambda$595830563;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = HatchFormSheetKt$FormSelectionButton$5$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            AuraTextInputKt.AuraTextInput(str2, null, bRgA0X, b1uA00, null, null, null, null, true, 0, 0, null, g0v, null, interfaceC1072AWd, false, true, zA1X, false, null, (G0U) objAaT5, bfm, ((iA0d >> 3) & 14) | 100666368, 1597824, 6, 831218);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(str, str2, str3, hw8, g0u, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FormSelectionRow(com.facebook.aura.checkout.ui.HatchFormField r41, com.facebook.aura.checkout.ui.HatchFormState r42, java.lang.String r43, X.BRg r44, X.BFM r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkout.ui.HatchFormSheetKt.FormSelectionRow(com.facebook.aura.checkout.ui.HatchFormField, com.facebook.aura.checkout.ui.HatchFormState, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void FormTextInput(HatchFormField hatchFormField, HatchFormState hatchFormState, String str, BRg bRg, G0U<? super String, Unit> g0u, BFM bfm, int i, int i2) {
        Integer numInvoke;
        B1U b1uA00;
        BBI bbi;
        int i3;
        B1U b1uA002;
        G0U<? super String, Unit> g0u2 = g0u;
        BRg bRg2 = bRg;
        bfm.AgG(637313706);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchFormField) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, hatchFormState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                g0u2 = null;
            }
            C0981AMm<String, C1805ArO> c0981AMm = hatchFormState.values;
            C1805ArO c1805ArO = c0981AMm.get(hatchFormField.id);
            if (c1805ArO == null) {
                c1805ArO = new C1805ArO("", Au3.A01);
            }
            G0U<String, Integer> g0u3 = hatchFormField.trailingIconForValue;
            if (g0u3 == null || (numInvoke = g0u3.invoke(c1805ArO.A01.A00)) == null) {
                numInvoke = hatchFormField.trailingIcon;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuJ auJKeyboardOptions = keyboardOptions(hatchFormField.kind);
            Hw8 hw8AutofillContentType = autofillContentType(hatchFormField.kind);
            boolean zA1X = AnonymousClass002.A1X(str);
            if (numInvoke == null) {
                bfm.AgE(-1837032919);
                bbi = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi, false);
                b1uA00 = null;
            } else {
                bfm.AgE(-1837032918);
                b1uA00 = B1V.A00(bfm, new HatchFormSheetKt$FormTextInput$1$1(numInvoke.intValue()), -590076597);
                bbi = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi, false);
            }
            if (str == null) {
                bfm.AgE(-1836772023);
                BBI.A0R(bbi, false);
                b1uA002 = null;
            } else {
                bfm.AgE(-1836772022);
                b1uA002 = B1V.A00(bfm, new HatchFormSheetKt$FormTextInput$2$1(str), -2130468269);
                BBI.A0R(bbi, false);
            }
            B1U b1uA003 = B1V.A00(bfm, new C110493(hatchFormField), 2105953191);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1805ArO, bfm.A65(c0981AMm), AnonymousClass004.A1F(iA0d)) | AnonymousClass004.A1I(iA0d) | ((iA0d & 57344) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new HatchFormSheetKt$FormTextInput$4$1(c0981AMm, hatchFormField, c1805ArO, hatchFormState, g0u2);
                BBI.A0O(bbi, objAaT);
            }
            AuraTextInputWithHeaderKt.AuraTextInputWithHeader(c1805ArO, bRgA0R, null, null, b1uA002, b1uA003, auJKeyboardOptions, null, hw8AutofillContentType, null, null, true, i3, null, b1uA00, null, null, i3, i3, zA1X, null, (G0U) objAaT, bfm, 196608, 48, i3, 1554060);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(hatchFormField, hatchFormState, str, bRg2, g0u2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* renamed from: HatchFormFooter-yZUFuyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m347HatchFormFooteryZUFuyM(java.lang.String r45, boolean r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, X.BRg r48, X.ApQ r49, X.B6A r50, boolean r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkout.ui.HatchFormSheetKt.m347HatchFormFooteryZUFuyM(java.lang.String, boolean, kotlin.jvm.functions.Function0, X.BRg, X.ApQ, X.B6A, boolean, X.BFM, int, int):void");
    }

    public static final C1805ArO reformattedAs(C1805ArO c1805ArO, String str) {
        String strA17 = BQG.A17(c1805ArO.A01.A00, AnonymousClass002.A09(c1805ArO.A00));
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < strA17.length(); i3++) {
            if (Character.isLetterOrDigit(strA17.charAt(i3))) {
                i2++;
            }
        }
        int i4 = 0;
        while (i < str.length() && i4 < i2) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                i4++;
            }
            i++;
        }
        return new C1805ArO(str, AbstractC1815ArZ.A00(i, i));
    }

    public static final List<HatchFormField> allFields(List<HatchFormSection> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchFormSection> it = list.iterator();
        while (it.hasNext()) {
            AHD<HatchFormRow> ahd = it.next().rows;
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it2 = ahd.iterator();
            while (it2.hasNext()) {
                AbstractC0882AGj.A0r(((HatchFormRow) it2.next()).fields, arrayListA0h2);
            }
            AbstractC0882AGj.A0r(arrayListA0h2, arrayListA0h);
        }
        return arrayListA0h;
    }

    public static final Hw8 autofillContentType(HatchFormFieldKind hatchFormFieldKind) {
        switch (hatchFormFieldKind.ordinal()) {
            case 0:
            case 12:
            case 13:
            case 14:
            case 15:
                return null;
            case 1:
                return C10472Hkj.A0B;
            case 2:
                return C10472Hkj.A0A;
            case 3:
                return C10472Hkj.A0C;
            case 4:
                return C10472Hkj.A07;
            case 5:
                return C10472Hkj.A0D;
            case 6:
                return C10472Hkj.A04;
            case 7:
                return C10472Hkj.A00;
            case 8:
                return C10472Hkj.A02;
            case 9:
                return C10472Hkj.A03;
            case 10:
                return C10472Hkj.A0E;
            case 11:
                return C10472Hkj.A01;
            default:
                throw C3cG.A0q();
        }
    }

    public static final int capitalization(HatchFormFieldKind hatchFormFieldKind) {
        switch (hatchFormFieldKind.ordinal()) {
            case 0:
                return 3;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                return 2;
            case 4:
            case 5:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return 0;
            default:
                throw C3cG.A0q();
        }
    }

    public static final String formattedInput(HatchFormFieldKind hatchFormFieldKind, String str, String str2) {
        AnonymousClass005.A0x(hatchFormFieldKind, str, str2);
        int iOrdinal = hatchFormFieldKind.ordinal();
        return iOrdinal != 13 ? iOrdinal != 10 ? iOrdinal != 14 ? str : HatchCardFieldFormat.INSTANCE.expiration(str, str2) : HatchCardFieldFormat.INSTANCE.usPostalCode(str) : HatchCardFieldFormat.INSTANCE.number(str);
    }

    public static final int keyboardType(HatchFormFieldKind hatchFormFieldKind) {
        switch (hatchFormFieldKind.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                return 1;
            case 4:
                return 6;
            case 5:
                return 4;
            case 10:
            case 12:
            case 14:
                return 3;
            case 13:
            case 15:
                return 8;
            default:
                throw C3cG.A0q();
        }
    }

    public static final HatchFormOption optionMatching(HatchFormField hatchFormField, CharSequence charSequence) {
        Object next;
        String str;
        String strA0l = AnonymousClass002.A0l(charSequence);
        Iterator it = hatchFormField.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HatchFormOption hatchFormOption = (HatchFormOption) next;
            if (AbstractC2159Azp.A12(hatchFormOption.value, strA0l, true) || AbstractC2159Azp.A12(hatchFormOption.label, strA0l, true) || ((str = hatchFormOption.autofillName) != null && str.equalsIgnoreCase(strA0l))) {
                break;
            }
        }
        return (HatchFormOption) next;
    }

    public static final Map<String, String> plainValues(C0981AMm<String, C1805ArO> c0981AMm) {
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(c0981AMm.size()));
        Iterator<Map.Entry<String, C1805ArO>> it = c0981AMm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            linkedHashMapA15.put(entryA0l.getKey(), AnonymousClass002.A0l(((C1805ArO) entryA0l.getValue()).A01.A00));
        }
        return linkedHashMapA15;
    }
}
