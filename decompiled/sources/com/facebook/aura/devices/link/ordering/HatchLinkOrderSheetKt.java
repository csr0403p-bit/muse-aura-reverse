package com.facebook.aura.devices.link.ordering;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AHG;
import X.AHI;
import X.AKO;
import X.AKQ;
import X.AQC;
import X.ARD;
import X.AbstractC0878AGe;
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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1er;
import X.C2278BSe;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C9hr;
import X.Ey9;
import X.F0C;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.checkout.ui.HatchAddressFields;
import com.facebook.aura.checkout.ui.HatchAddressTypeahead;
import com.facebook.aura.checkout.ui.HatchAddressValue;
import com.facebook.aura.checkout.ui.HatchFieldValidation;
import com.facebook.aura.checkout.ui.HatchFormField;
import com.facebook.aura.checkout.ui.HatchFormFieldKind;
import com.facebook.aura.checkout.ui.HatchFormOption;
import com.facebook.aura.checkout.ui.HatchFormRow;
import com.facebook.aura.checkout.ui.HatchFormSection;
import com.facebook.aura.checkout.ui.HatchFormSheetKt;
import com.facebook.aura.checkout.ui.HatchFormState;
import com.facebook.aura.checkout.ui.HatchSelectableLeadingIconStyle;
import com.facebook.aura.checkout.ui.HatchSelectableListSheetKt;
import com.facebook.aura.checkout.ui.HatchSelectableOption;
import com.facebook.aura.checkout.ui.HatchSelectableSection;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchLinkOrderSheetKt {
    public static final Set<HatchLinkOrderField> ADDRESS_FIELDS = BFI.A0H(new HatchLinkOrderField[]{HatchLinkOrderField.STREET1, HatchLinkOrderField.STREET2, HatchLinkOrderField.CITY, HatchLinkOrderField.STATE, HatchLinkOrderField.POSTAL_CODE});
    public static final String EMAIL = "email";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String PHONE = "phone";
    public static final AHD<HatchFormOption> US_STATE_CODES;

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$AddressEntryStep$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchFormState $formState;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchFormState hatchFormState, BRg bRg, int i, int i2) {
            super(2);
            this.$formState = hatchFormState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.AddressEntryStep(this.$formState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$ClaimBlocked$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchLinkOrderBlockReason $blockReason;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchLinkOrderBlockReason hatchLinkOrderBlockReason, BRg bRg, int i, int i2) {
            super(2);
            this.$blockReason = hatchLinkOrderBlockReason;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.ClaimBlocked(this.$blockReason, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$ClaimStatus$3, reason: invalid class name and case insensitive filesystem */
    public final class C115823 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115823(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.ClaimStatus(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$ConfirmedStep$3, reason: invalid class name and case insensitive filesystem */
    public final class C115833 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115833(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.ConfirmedStep(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$DetailsStep$1, reason: invalid class name and case insensitive filesystem */
    public final class C115841 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchFormState $formState;
        public final /* synthetic */ G0U<HatchLinkOrderEvent, Unit> $onEvent;
        public final /* synthetic */ HatchLinkOrderFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115841(HatchLinkOrderFormState hatchLinkOrderFormState, G0U<? super HatchLinkOrderEvent, Unit> g0u, HatchFormState hatchFormState) {
            super(2);
            this.$state = hatchLinkOrderFormState;
            this.$onEvent = g0u;
            this.$formState = hatchFormState;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchLinkOrderFormState hatchLinkOrderFormState = this.$state;
            boolean zA65 = bfm.A65(this.$onEvent);
            G0U<HatchLinkOrderEvent, Unit> g0u = this.$onEvent;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchLinkOrderSheetKt$DetailsStep$1$1$1(g0u);
                BBI.A0T(bfm, objAaT);
            }
            G0U g0u2 = (G0U) objAaT;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$formState, AnonymousClass001.A1T(bfm, this.$state, bfm.A65(this.$onEvent)));
            G0U<HatchLinkOrderEvent, Unit> g0u3 = this.$onEvent;
            HatchLinkOrderFormState hatchLinkOrderFormState2 = this.$state;
            HatchFormState hatchFormState = this.$formState;
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new HatchLinkOrderSheetKt$DetailsStep$1$2$1(g0u3, hatchLinkOrderFormState2, hatchFormState);
                BBI.A0T(bfm, objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$formState, AnonymousClass001.A1T(bfm, this.$state, bfm.A65(this.$onEvent)));
            G0U<HatchLinkOrderEvent, Unit> g0u4 = this.$onEvent;
            HatchLinkOrderFormState hatchLinkOrderFormState3 = this.$state;
            HatchFormState hatchFormState2 = this.$formState;
            Object objAaT3 = bfm.AaT();
            if (zA1R2 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchLinkOrderSheetKt$DetailsStep$1$3$1(g0u4, hatchLinkOrderFormState3, hatchFormState2);
                BBI.A0T(bfm, objAaT3);
            }
            HatchLinkOrderSheetKt.ShippingAddressSection(hatchLinkOrderFormState, g0u2, function0, (G0U) objAaT3, null, bfm, HatchLinkOrderFormState.$stable, 16);
            HatchLinkOrderFormState hatchLinkOrderFormState4 = this.$state;
            HatchLinkOrderSubmitError hatchLinkOrderSubmitError = hatchLinkOrderFormState4.submitError;
            if (hatchLinkOrderSubmitError == null || !C7384Etj.areEqual(HatchLinkOrderSheetKt.withDetails(hatchLinkOrderFormState4.input, this.$formState.collected()), this.$state.input)) {
                bfm.AgE(780143592);
            } else {
                bfm.AgE(780090737);
                HatchLinkOrderSheetKt.OrderSubmissionError(hatchLinkOrderSubmitError, null, bfm, 0, 2);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$DetailsStep$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchFormState $formState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchLinkOrderEvent, Unit> $onEvent;
        public final /* synthetic */ HatchLinkOrderFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchLinkOrderFormState hatchLinkOrderFormState, HatchFormState hatchFormState, G0U<? super HatchLinkOrderEvent, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchLinkOrderFormState;
            this.$formState = hatchFormState;
            this.$onEvent = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.DetailsStep(this.$state, this.$formState, this.$onEvent, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkActivationDelayedDialog$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C115851 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onClose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115851(Function0<Unit> function0) {
            super(2);
            this.$onClose = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA65 = bfm.A65(this.$onClose);
                Function0<Unit> function0 = this.$onClose;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchLinkOrderSheetKt$HatchLinkActivationDelayedDialog$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkActivationDelayedDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C115862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115862(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.HatchLinkActivationDelayedDialog(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchLinkOrderBlockReason $blockReason;
        public final /* synthetic */ HatchFormState $formState;
        public final /* synthetic */ C1BO<HatchLinkOrderFormState> $state$delegate;
        public final /* synthetic */ HatchLinkOrderViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            if (this.$blockReason != null) {
                bfm.AgE(353995215);
                HatchLinkOrderSheetKt.ClaimBlocked(this.$blockReason, null, bfm, 0, 2);
            } else {
                C1BO<HatchLinkOrderFormState> c1bo = this.$state$delegate;
                Set<HatchLinkOrderField> set = HatchLinkOrderSheetKt.ADDRESS_FIELDS;
                if (C8j3.A0o(c1bo).isContinuing() || C8j3.A0o(this.$state$delegate).isCheckingEligibility) {
                    bfm.AgE(-1910949502);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
                    BRg bRgA01 = ARD.A01(C3U4.A09(new AQC(C2VU.A00), AuraDimensKt.SpacingMedium), C2278BSe.A00(25), true);
                    boolean zA65 = bfm.A65(strA01);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new HatchLinkOrderSheetKt$HatchLinkOrderSheet$10$1$1(strA01);
                        BBI.A0T(bfm, objAaT);
                    }
                    AnonymousClass007.A0v(bfm, bRgA01, (G0U) objAaT);
                } else {
                    bfm.AgE(-1910434158);
                    int iOrdinal = C8j3.A0o(this.$state$delegate).step.ordinal();
                    if (iOrdinal == 0) {
                        bfm.AgE(354016538);
                    } else if (iOrdinal == 1) {
                        bfm.AgE(354018151);
                        HatchLinkOrderFormState hatchLinkOrderFormStateA0o = C8j3.A0o(this.$state$delegate);
                        HatchFormState hatchFormState = this.$formState;
                        Object obj = this.$viewModel;
                        boolean zA67 = bfm.A67(obj);
                        Object objAaT2 = bfm.AaT();
                        if (zA67 || objAaT2 == C78N.A00) {
                            objAaT2 = new HatchLinkOrderSheetKt$HatchLinkOrderSheet$10$2$1(obj);
                            BBI.A0T(bfm, objAaT2);
                        }
                        HatchLinkOrderSheetKt.DetailsStep(hatchLinkOrderFormStateA0o, hatchFormState, (G0U) ((InterfaceC7353EnQ) objAaT2), null, bfm, HatchLinkOrderFormState.$stable, 8);
                    } else if (iOrdinal == 2) {
                        bfm.AgE(354021329);
                        HatchLinkOrderSheetKt.AddressEntryStep(this.$formState, null, bfm, 0, 2);
                    } else if (iOrdinal == 3) {
                        bfm.AgE(354024405);
                        HatchLinkOrderSheetKt.ClaimStatus(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b35), null, bfm, 0, 2);
                    } else {
                        if (iOrdinal != 4) {
                            throw AnonymousClass005.A0k(bfm, 354015088);
                        }
                        bfm.AgE(354029861);
                        HatchLinkOrderSheetKt.ConfirmedStep(null, bfm, 0, 1);
                    }
                    AnonymousClass001.A1D(bfm);
                }
            }
            AnonymousClass001.A1D(bfm);
        }

        /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$10$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchLinkOrderStep.values().length];
                try {
                    AnonymousClass002.A13(HatchLinkOrderStep.INFO, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchLinkOrderStep.DETAILS, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(HatchLinkOrderStep.ADDRESS_ENTRY, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(HatchLinkOrderStep.SUBMITTING, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(HatchLinkOrderStep.CONFIRMED, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(HatchLinkOrderBlockReason hatchLinkOrderBlockReason, HatchFormState hatchFormState, HatchLinkOrderViewModel hatchLinkOrderViewModel, C1BO<HatchLinkOrderFormState> c1bo) {
            super(3);
            this.$blockReason = hatchLinkOrderBlockReason;
            this.$formState = hatchFormState;
            this.$viewModel = hatchLinkOrderViewModel;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchLinkOrderEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint, BRg bRg, int i, int i2) {
            super(2);
            this.$entryPoint = hatchLinkOrderEntryPoint;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.HatchLinkOrderSheet(this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchLinkOrderEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint, BRg bRg, int i, int i2) {
            super(2);
            this.$entryPoint = hatchLinkOrderEntryPoint;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.HatchLinkOrderSheet(this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchAddressFields $addressFields;
        public final /* synthetic */ HatchFormState $formState;
        public final /* synthetic */ C1BO<HatchLinkOrderFormState> $state$delegate;
        public final /* synthetic */ HatchLinkOrderViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(HatchFormState hatchFormState, HatchAddressFields hatchAddressFields, HatchLinkOrderViewModel hatchLinkOrderViewModel, C1BO<HatchLinkOrderFormState> c1bo) {
            super(2);
            this.$formState = hatchFormState;
            this.$addressFields = hatchAddressFields;
            this.$viewModel = hatchLinkOrderViewModel;
            this.$state$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            C1BO<HatchLinkOrderFormState> c1bo = this.$state$delegate;
            Set<HatchLinkOrderField> set = HatchLinkOrderSheetKt.ADDRESS_FIELDS;
            HatchLinkOrderFormState hatchLinkOrderFormStateA0o = C8j3.A0o(c1bo);
            HatchFormState hatchFormState = this.$formState;
            HatchAddressFields hatchAddressFields = this.$addressFields;
            HatchLinkOrderViewModel hatchLinkOrderViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(hatchLinkOrderViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchLinkOrderSheetKt$HatchLinkOrderSheet$7$1$1(hatchLinkOrderViewModel);
                BBI.A0T(bfm, objAaT);
            }
            HatchLinkOrderSheetKt.OrderFormFooter(hatchLinkOrderFormStateA0o, hatchFormState, hatchAddressFields, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, HatchLinkOrderFormState.$stable | (HatchAddressFields.$stable << 6), 16);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$HatchLinkOrderSheet$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(AuraNavigator auraNavigator) {
            super(2);
            this.$navigator = auraNavigator;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b29);
            AuraNavigator auraNavigator = this.$navigator;
            boolean zA67 = bfm.A67(auraNavigator);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchLinkOrderSheetKt$HatchLinkOrderSheet$8$1$1(auraNavigator);
                BBI.A0T(bfm, objAaT);
            }
            HatchFormSheetKt.m347HatchFormFooteryZUFuyM(strA01, true, (Function0) objAaT, null, null, null, false, bfm, 48, 120);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C115871 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isPostPurchase;
        public final /* synthetic */ HatchLinkOrderViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115871(HatchLinkOrderViewModel hatchLinkOrderViewModel, boolean z, int i) {
            super(2);
            this.$viewModel = hatchLinkOrderViewModel;
            this.$isPostPurchase = z;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.OrderActivationTimeoutEffect(this.$viewModel, this.$isPostPurchase, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$3, reason: invalid class name and case insensitive filesystem */
    public final class C115883 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isPostPurchase;
        public final /* synthetic */ HatchLinkOrderViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115883(HatchLinkOrderViewModel hatchLinkOrderViewModel, boolean z, int i) {
            super(2);
            this.$viewModel = hatchLinkOrderViewModel;
            this.$isPostPurchase = z;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.OrderActivationTimeoutEffect(this.$viewModel, this.$isPostPurchase, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$OrderFormFooter$1, reason: invalid class name and case insensitive filesystem */
    public final class C115891 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ApQ $disclaimer;
        public final /* synthetic */ HatchFormState $formState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchLinkOrderEvent, Unit> $onEvent;
        public final /* synthetic */ String $placeOrderTitle;
        public final /* synthetic */ HatchLinkOrderFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115891(HatchLinkOrderFormState hatchLinkOrderFormState, String str, HatchFormState hatchFormState, G0U<? super HatchLinkOrderEvent, Unit> g0u, BRg bRg, ApQ apQ) {
            super(2);
            this.$state = hatchLinkOrderFormState;
            this.$placeOrderTitle = str;
            this.$formState = hatchFormState;
            this.$onEvent = g0u;
            this.$modifier = bRg;
            this.$disclaimer = apQ;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean z = this.$state.isTestOrder;
            String strA0M = this.$placeOrderTitle;
            if (z) {
                strA0M = FGI.A0M("[Test] ", strA0M);
            }
            boolean zIsSubmittable = this.$formState.isSubmittable();
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$formState, AnonymousClass001.A1T(bfm, this.$state, bfm.A65(this.$onEvent)));
            G0U<HatchLinkOrderEvent, Unit> g0u = this.$onEvent;
            HatchLinkOrderFormState hatchLinkOrderFormState = this.$state;
            HatchFormState hatchFormState = this.$formState;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchLinkOrderSheetKt$OrderFormFooter$1$1$1(g0u, hatchLinkOrderFormState, hatchFormState);
                BBI.A0T(bfm, objAaT);
            }
            HatchFormSheetKt.m347HatchFormFooteryZUFuyM(strA0M, zIsSubmittable, (Function0) objAaT, this.$modifier, this.$disclaimer, null, false, bfm, 0, 96);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$OrderFormFooter$3, reason: invalid class name and case insensitive filesystem */
    public final class C115903 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAddressFields $addressFields;
        public final /* synthetic */ HatchFormState $formState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchLinkOrderEvent, Unit> $onEvent;
        public final /* synthetic */ HatchLinkOrderFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115903(HatchLinkOrderFormState hatchLinkOrderFormState, HatchFormState hatchFormState, HatchAddressFields hatchAddressFields, G0U<? super HatchLinkOrderEvent, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchLinkOrderFormState;
            this.$formState = hatchFormState;
            this.$addressFields = hatchAddressFields;
            this.$onEvent = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.OrderFormFooter(this.$state, this.$formState, this.$addressFields, this.$onEvent, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$OrderSubmissionError$2, reason: invalid class name and case insensitive filesystem */
    public final class C115912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchLinkOrderSubmitError $error;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115912(HatchLinkOrderSubmitError hatchLinkOrderSubmitError, BRg bRg, int i, int i2) {
            super(2);
            this.$error = hatchLinkOrderSubmitError;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.OrderSubmissionError(this.$error, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$ShippingAddressSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C115922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddAddress;
        public final /* synthetic */ G0U<String, Unit> $onEditAddress;
        public final /* synthetic */ G0U<String, Unit> $onSelectAddress;
        public final /* synthetic */ HatchLinkOrderFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115922(HatchLinkOrderFormState hatchLinkOrderFormState, G0U<? super String, Unit> g0u, Function0<Unit> function0, G0U<? super String, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchLinkOrderFormState;
            this.$onSelectAddress = g0u;
            this.$onAddAddress = function0;
            this.$onEditAddress = g0u2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderSheetKt.ShippingAddressSection(this.$state, this.$onSelectAddress, this.$onAddAddress, this.$onEditAddress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt$field$1, reason: invalid class name and case insensitive filesystem */
    public final class C115931 extends AbstractC7559F3s implements G0V<String, Map<String, ? extends String>, HatchFieldValidation> {
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $id;
        public final /* synthetic */ HatchLinkOrderFormState $state;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final HatchFieldValidation invoke2(String str, Map<String, String> map) {
            C7384Etj.A0Y(str, 0);
            if (!AbstractC0878AGe.A0k(this.$state.invalidFields, HatchLinkOrderSheetKt.fieldForId(this.$id)) || !str.equals(AnonymousClass002.A0l(HatchLinkOrderSheetKt.value(this.$state.input, this.$id)))) {
                return C7BY.A0j(str) ? HatchFieldValidation.Pending.INSTANCE : HatchFieldValidation.Valid.INSTANCE;
            }
            String str2 = this.$errorMessage;
            C7384Etj.A0Y(str2, 0);
            return new HatchFieldValidation.Invalid(str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115931(HatchLinkOrderFormState hatchLinkOrderFormState, String str, String str2) {
            super(2);
            this.$state = hatchLinkOrderFormState;
            this.$id = str;
            this.$errorMessage = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ HatchFieldValidation invoke(String str, Map<String, ? extends String> map) {
            return invoke2(str, (Map<String, String>) map);
        }
    }

    public static final void AddressEntryStep(HatchFormState hatchFormState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-904825780);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchFormState) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchFormSheetKt.HatchFormSheet(hatchFormState, bRg2, null, bfm, iA0d & 126, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchFormState, bRg2, i, i2);
        }
    }

    public static final void DetailsStep(HatchLinkOrderFormState hatchLinkOrderFormState, HatchFormState hatchFormState, G0U<? super HatchLinkOrderEvent, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-826248380);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchLinkOrderFormState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, hatchFormState);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchFormSheetKt.HatchFormSheet(hatchFormState, bRg2, B1V.A00(bfm, new C115841(hatchLinkOrderFormState, g0u, hatchFormState), 1210909658), bfm, ((iA05 >> 3) & 14) | 384 | ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchLinkOrderFormState, hatchFormState, g0u, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[HatchLinkOrderStep.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.DETAILS, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.ADDRESS_ENTRY, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.INFO, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.SUBMITTING, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.CONFIRMED, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchLinkOrderSubmitError.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkOrderSubmitError.GENERIC, iArr2, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderSubmitError.INVALID_SHIPPING_ADDRESS, iArr2, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderSubmitError.ADDRESS_CHECK_UNAVAILABLE, iArr2, 3);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HatchLinkOrderField.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkOrderField.STREET1, iArr3, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderField.CITY, iArr3, 2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderField.STATE, iArr3, 3);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderField.POSTAL_CODE, iArr3, 4);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[HatchLinkOrderBlockReason.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkOrderBlockReason.ORDERING_DISABLED, iArr4, 1);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderBlockReason.NOT_AUTHENTICATED, iArr4, 2);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderBlockReason.NO_SUBSCRIPTION, iArr4, 3);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderBlockReason.SUBSCRIPTION_NOT_READY, iArr4, 4);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderBlockReason.SUBSCRIPTION_NOT_ENTITLED, iArr4, 5);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AnonymousClass002.A18(HatchLinkOrderBlockReason.CLAIM_UNAVAILABLE, iArr4);
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    static {
        Ey9<UsState> entries = UsState.getEntries();
        ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
        for (UsState usState : entries) {
            String code = usState.getCode();
            arrayListA0i.add(new HatchFormOption(code, code, usState.getDisplayName()));
        }
        US_STATE_CODES = AGI.A07(arrayListA0i);
    }

    public static final void ClaimBlocked(HatchLinkOrderBlockReason hatchLinkOrderBlockReason, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1105404578);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchLinkOrderBlockReason) | i : i;
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
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchLinkOrderSheetKt$ClaimBlocked$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120b3e);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Medium;
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchLinkOrderSheetKt$ClaimBlocked$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bs0, objAaT2, false), 0L, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16308);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, HatchAppName.value, explanationRes(hatchLinkOrderBlockReason)), null, C3cH.A07(bfm, auraTheme), null, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16314);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchLinkOrderBlockReason, bRg2, i, i2);
        }
    }

    public static final void ClaimStatus(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(610107432);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRgA0R, f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchLinkOrderSheetKt$ClaimStatus$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(f), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            C1822Arm c1822Arm = C8j4.A0l(bfm).title3Medium;
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchLinkOrderSheetKt$ClaimStatus$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT2, false), 0L, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16308);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115823(str, bRgA0P, i, i2);
        }
    }

    public static final void ConfirmedStep(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(507224848);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass007.A0H(bfm, AnonymousClass001.A0R(bRg2), C10G.A00), AuraDimensKt.SpacingMedium);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchLinkOrderSheetKt$ConfirmedStep$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b28);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Medium;
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchLinkOrderSheetKt$ConfirmedStep$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT2, false), 0L, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16308);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b27), null, C3cH.A07(bfm, auraTheme), null, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16314);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115833(bRg2, i, i2);
        }
    }

    public static final void HatchLinkActivationDelayedDialog(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1909284165);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            boolean zA67 = bfm.A67(auraNavigatorA05);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchLinkOrderSheetKt$HatchLinkActivationDelayedDialog$onClose$1$1(auraNavigatorA05);
                BBI.A0O(bbi, objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b24), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120b23), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C115851(function0), 810633674), (Function0<Unit>) function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, (iA0d & 14) | 196608, 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115862(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchLinkOrderSheet(com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint r35, X.BRg r36, X.BFM r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt.HatchLinkOrderSheet(com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint, X.BRg, X.BFM, int, int):void");
    }

    public static final void OrderFormFooter(HatchLinkOrderFormState hatchLinkOrderFormState, HatchFormState hatchFormState, HatchAddressFields hatchAddressFields, G0U<? super HatchLinkOrderEvent, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(825794156);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchLinkOrderFormState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, hatchFormState);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchAddressFields, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int iOrdinal = hatchLinkOrderFormState.step.ordinal();
            if (iOrdinal == 1) {
                bfm.AgE(-338680581);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b4e);
                HxE<ApQ, Map<String, String>> hxERememberPrivacyDisclaimer = rememberPrivacyDisclaimer(bfm, 0);
                AnonymousClass006.A15(bfm, Am0.A0G.A04(HatchLinkTextKt.rememberHatchLinkUriHandler(hxERememberPrivacyDisclaimer.second, null, bfm, 0, 2)), new C115891(hatchLinkOrderFormState, strA01, hatchFormState, g0u, bRg2, hxERememberPrivacyDisclaimer.first), -2089481564);
            } else if (iOrdinal == 2) {
                bfm.AgE(-337824423);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206e7);
                boolean zIsSubmittable = hatchFormState.isSubmittable();
                boolean zA1M = AnonymousClass004.A1M(iA05) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchLinkOrderFormState))) | ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(hatchAddressFields))) | AnonymousClass006.A1V(iA05);
                Object objAaT = bfm.AaT();
                if (zA1M || objAaT == C78N.A00) {
                    objAaT = new HatchLinkOrderSheetKt$OrderFormFooter$2$1(g0u, hatchLinkOrderFormState, hatchAddressFields, hatchFormState);
                    BBI.A0T(bfm, objAaT);
                }
                HatchFormSheetKt.m347HatchFormFooteryZUFuyM(strA012, zIsSubmittable, (Function0) objAaT, bRg2, null, null, false, bfm, (iA05 >> 3) & 7168, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            } else {
                if (iOrdinal != 0 && iOrdinal != 3 && iOrdinal != 4) {
                    throw AnonymousClass005.A0k(bfm, -980757602);
                }
                AnonymousClass003.A0l(bfm, -980712656);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115903(hatchLinkOrderFormState, hatchFormState, hatchAddressFields, g0u, bRg2, i, i2);
        }
    }

    public static final void OrderSubmissionError(HatchLinkOrderSubmitError hatchLinkOrderSubmitError, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(1296571871);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchLinkOrderSubmitError) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(bRg2, AuraDimensKt.SpacingMedium);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchLinkOrderSheetKt$OrderSubmissionError$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT, false);
            int iOrdinal = hatchLinkOrderSubmitError.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string._name_removed__res_0x7f120b30;
            } else if (iOrdinal == 1) {
                i3 = R.string._name_removed__res_0x7f120b3c;
            } else {
                if (iOrdinal != 2) {
                    throw C3cG.A0q();
                }
                i3 = R.string._name_removed__res_0x7f120b3b;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA0Y, auraTheme.getColors(bfm, 6).error, C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115912(hatchLinkOrderSubmitError, bRg2, i, i2);
        }
    }

    public static final void ShippingAddressSection(HatchLinkOrderFormState hatchLinkOrderFormState, G0U<? super String, Unit> g0u, Function0<Unit> function0, G0U<? super String, Unit> g0u2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1208814573);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchLinkOrderFormState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            MutableState mutableStateA002 = C1er.A00(bfm, function0);
            MutableState mutableStateA003 = C1er.A00(bfm, g0u2);
            bfm.AgE(-2029618894);
            ArrayList arrayListA0P = AbstractC0878AGe.A0P(hatchLinkOrderFormState.localAddresses, hatchLinkOrderFormState.savedDetails.addresses);
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0P);
            Iterator it = arrayListA0P.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(toSelectableOption((HatchLinkSavedAddress) it.next(), bfm, HatchLinkSavedAddress.$stable));
            }
            BBI bbiA07 = C3cG.A07(bfm);
            AHD ahdA07 = AGI.A07(arrayListA0i);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206e8);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206d7);
            String str = hatchLinkOrderFormState.selectedAddressId;
            boolean zA1T = AnonymousClass005.A1T(bfm, str, strA01, strA012, bfm.A65(ahdA07));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchSelectableSection("ship-to", ahdA07, str, new HatchLinkOrderSheetKt$ShippingAddressSection$section$1$1(mutableStateA00), strA01, strA012, new HatchLinkOrderSheetKt$ShippingAddressSection$section$1$2(mutableStateA002), null, new HatchLinkOrderSheetKt$ShippingAddressSection$section$1$3(mutableStateA003));
                BBI.A0O(bbiA07, objAaT);
            }
            HatchSelectableSection hatchSelectableSection = (HatchSelectableSection) objAaT;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            HatchSelectableListSheetKt.HatchSelectableSectionContent(hatchSelectableSection, null, null, bfm, 0, 6);
            AHG<HatchLinkOrderField> ahg = hatchLinkOrderFormState.invalidFields;
            if ((ahg instanceof Collection) && ahg.isEmpty()) {
                bfm.AgE(-1515617915);
                AnonymousClass003.A0q(bbiA07);
            } else {
                Iterator it2 = ahg.iterator();
                while (it2.hasNext()) {
                    if (ADDRESS_FIELDS.contains(it2.next())) {
                        BRg bRgA07 = C3U4.A07(C3cG.A09(bfm, -1515965022), AuraDimensKt.SpacingMedium);
                        Object objAaT2 = bfm.AaT();
                        if (objAaT2 == C78N.A00) {
                            objAaT2 = HatchLinkOrderSheetKt$ShippingAddressSection$1$2$1.INSTANCE;
                            bfm.Ai0(objAaT2);
                        }
                        BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT2, false);
                        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b32);
                        AuraTheme auraTheme = AuraTheme.INSTANCE;
                        AuraTextKt.m2639AuraTextUY9GdpU(strA013, bRgA0Y, auraTheme.getColors(bfm, 6).error, C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                        AnonymousClass003.A0q(bbiA07);
                    }
                }
                bfm.AgE(-1515617915);
                AnonymousClass003.A0q(bbiA07);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115922(hatchLinkOrderFormState, g0u, function0, g0u2, bRg2, i, i2);
        }
    }

    public static final HatchFormField field(String str, String str2, HatchFormFieldKind hatchFormFieldKind, HatchLinkOrderFormState hatchLinkOrderFormState, String str3) {
        return new HatchFormField(str, str2, hatchFormFieldKind, value(hatchLinkOrderFormState.input, str), true, null, null, new C115931(hatchLinkOrderFormState, str, str3), null, AHI.A01, null);
    }

    public static final HatchSelectableOption toSelectableOption(HatchLinkSavedAddress hatchLinkSavedAddress, BFM bfm, int i) {
        String strA0H;
        String str = hatchLinkSavedAddress.id;
        if (C7BY.A0j(hatchLinkSavedAddress.street2)) {
            AnonymousClass003.A0l(bfm, -585905039);
            strA0H = hatchLinkSavedAddress.street1;
        } else {
            bfm.AgE(-585868025);
            strA0H = C3cJ.A0H(bfm, hatchLinkSavedAddress.street1, hatchLinkSavedAddress.street2, R.string._name_removed__res_0x7f120b58);
        }
        return new HatchSelectableOption(str, strA0H, AbstractC2271BQs.A02(bfm, new Object[]{hatchLinkSavedAddress.city, hatchLinkSavedAddress.state, hatchLinkSavedAddress.postalCode}, R.string._name_removed__res_0x7f120b26), null, null, true, true, HatchSelectableLeadingIconStyle.DEFAULT, false);
    }

    public static final HatchLinkOrderInput withAddress(HatchLinkOrderInput hatchLinkOrderInput, HatchAddressValue hatchAddressValue) {
        return hatchLinkOrderInput.copy(hatchLinkOrderInput.firstName, hatchLinkOrderInput.lastName, hatchLinkOrderInput.email, hatchLinkOrderInput.phone, hatchAddressValue.addressLine1, hatchAddressValue.addressLine2, hatchAddressValue.city, hatchAddressValue.state, hatchAddressValue.zip);
    }

    public static final HatchLinkOrderInput withDetails(HatchLinkOrderInput hatchLinkOrderInput, Map<String, String> map) {
        String strA0p = C60O.A0p(FIRST_NAME, map);
        if (strA0p == null) {
            strA0p = "";
        }
        String strA0p2 = C60O.A0p(LAST_NAME, map);
        if (strA0p2 == null) {
            strA0p2 = "";
        }
        String strA0p3 = C60O.A0p("email", map);
        if (strA0p3 == null) {
            strA0p3 = "";
        }
        String strA0p4 = C60O.A0p(PHONE, map);
        if (strA0p4 == null) {
            strA0p4 = "";
        }
        return hatchLinkOrderInput.copy(strA0p, strA0p2, strA0p3, strA0p4, hatchLinkOrderInput.street1, hatchLinkOrderInput.street2, hatchLinkOrderInput.city, hatchLinkOrderInput.state, hatchLinkOrderInput.postalCode);
    }

    public static final void OrderActivationTimeoutEffect(HatchLinkOrderViewModel hatchLinkOrderViewModel, boolean z, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c115883;
        bfm.AgG(-526772878);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchLinkOrderViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        boolean z2 = false;
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            bfm.Afo();
        } else {
            if (!z) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c115883 = new C115871(hatchLinkOrderViewModel, z, i);
                    bBbAAc.A06 = c115883;
                }
                return;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                F0C<C9hr<Object>>[] f0cArr = HatchLinkOrderSheetKey.$childSerializers;
                objAaT = new HatchLinkOrderSheetKey(HatchLinkOrderEntryPoint.POST_PURCHASE);
                BBI.A0O(bbi, objAaT);
            }
            HatchLinkOrderSheetKey hatchLinkOrderSheetKey = (HatchLinkOrderSheetKey) objAaT;
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchLinkOrderViewModel))) {
                z2 = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, hatchLinkOrderSheetKey, bfm.A67(auraNavigatorA05), z2);
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == obj) {
                objAaT2 = new HatchLinkOrderSheetKt$OrderActivationTimeoutEffect$2$1(hatchLinkOrderViewModel, auraNavigatorA05, hatchLinkOrderSheetKey, null);
                BBI.A0O(bbi, objAaT2);
            }
            C78e.A02(bfm, hatchLinkOrderViewModel, auraNavigatorA05, hatchLinkOrderSheetKey, (G0V) objAaT2);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c115883 = new C115883(hatchLinkOrderViewModel, z, i);
            bBbAAc.A06 = c115883;
        }
    }

    public static final AHD<HatchFormSection> addressSections(HatchLinkOrderFormState hatchLinkOrderFormState, HatchAddressFields hatchAddressFields, G0U<? super String, Unit> g0u, Function0<Unit> function0, BFM bfm, int i) {
        String line1Id;
        int i2;
        bfm.AgE(159098175);
        AHG<HatchLinkOrderField> ahg = hatchLinkOrderFormState.invalidFields;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = ahg.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((HatchLinkOrderField) it.next()).ordinal();
            if (iOrdinal == 2) {
                bfm.AgE(-1705188949);
                line1Id = hatchAddressFields.getLine1Id();
                i2 = R.string._name_removed__res_0x7f120b34;
            } else if (iOrdinal == 4) {
                bfm.AgE(-1705183599);
                line1Id = hatchAddressFields.getCityId();
                i2 = R.string._name_removed__res_0x7f120b25;
            } else if (iOrdinal == 5) {
                bfm.AgE(-1705178999);
                line1Id = hatchAddressFields.getStateId();
                i2 = R.string._name_removed__res_0x7f120b33;
            } else if (iOrdinal != 6) {
                AnonymousClass003.A0l(bfm, -1320641987);
            } else {
                bfm.AgE(-1705173459);
                line1Id = hatchAddressFields.getZipId();
                i2 = R.string._name_removed__res_0x7f120b37;
            }
            HxE hxEA0r = C3cG.A0r(line1Id, AbstractC2271BQs.A01(bfm, i2));
            AnonymousClass001.A1D(bfm);
            arrayListA0h.add(hxEA0r);
        }
        AnonymousClass001.A1D(bfm);
        BO6<String, String> bo6A08 = AGI.A08(AGH.A06(arrayListA0h));
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b53);
        HatchLinkOrderInput hatchLinkOrderInput = hatchLinkOrderFormState.input;
        String str = hatchLinkOrderInput.street1;
        String str2 = hatchLinkOrderInput.street2;
        String str3 = hatchLinkOrderInput.city;
        String strNormalizedUsStateCode = HatchLinkOrderStateMachineKt.normalizedUsStateCode(hatchLinkOrderInput.state);
        if (strNormalizedUsStateCode == null) {
            strNormalizedUsStateCode = hatchLinkOrderFormState.input.state;
        }
        return AGI.A0E(hatchAddressFields.section("shipping", strA01, new HatchAddressValue(str, str2, str3, strNormalizedUsStateCode, hatchLinkOrderFormState.input.postalCode), US_STATE_CODES, bo6A08, new HatchAddressTypeahead(hatchLinkOrderFormState.addressSuggestions, g0u, function0), bfm, (HatchAddressValue.$stable << 6) | 3078 | (HatchAddressTypeahead.$stable << 15) | (HatchAddressFields.$stable << 18) | ((i << 15) & 3670016), 0));
    }

    public static final AHD<HatchFormSection> detailsSections(HatchLinkOrderFormState hatchLinkOrderFormState, BFM bfm, int i) {
        return AGI.A0E(new HatchFormSection("recipient", recipientRows(hatchLinkOrderFormState, bfm, (i & 14) | HatchLinkOrderFormState.$stable), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b51)), HatchFormSection.Companion.invoke("contact", AGI.A0E(field("email", AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b2a), HatchFormFieldKind.EMAIL, hatchLinkOrderFormState, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b42)), field(PHONE, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b31), HatchFormFieldKind.PHONE, hatchLinkOrderFormState, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b4d))), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b40)));
    }

    public static final int explanationRes(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
        switch (hatchLinkOrderBlockReason.ordinal()) {
            case 0:
                return R.string._name_removed__res_0x7f120b56;
            case 1:
                return R.string._name_removed__res_0x7f120b3d;
            case 2:
                return R.string._name_removed__res_0x7f120b55;
            case 3:
                return R.string._name_removed__res_0x7f120b54;
            case 4:
                return R.string._name_removed__res_0x7f120b4c;
            case 5:
                return R.string._name_removed__res_0x7f120b3f;
            default:
                throw C3cG.A0q();
        }
    }

    public static final HatchLinkOrderField fieldForId(String str) {
        switch (str.hashCode()) {
            case -160985414:
                if (str.equals(FIRST_NAME)) {
                    return HatchLinkOrderField.FIRST_NAME;
                }
                return null;
            case 96619420:
                if (str.equals("email")) {
                    return HatchLinkOrderField.EMAIL;
                }
                return null;
            case 106642798:
                if (str.equals(PHONE)) {
                    return HatchLinkOrderField.PHONE;
                }
                return null;
            case 2013122196:
                if (str.equals(LAST_NAME)) {
                    return HatchLinkOrderField.LAST_NAME;
                }
                return null;
            default:
                return null;
        }
    }

    public static final AHD<HatchFormRow> recipientRows(HatchLinkOrderFormState hatchLinkOrderFormState, BFM bfm, int i) {
        return AGI.A0E(new HatchFormRow(AGI.A0E(field(FIRST_NAME, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b2b), HatchFormFieldKind.GIVEN_NAME, hatchLinkOrderFormState, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b2c)), field(LAST_NAME, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b2d), HatchFormFieldKind.FAMILY_NAME, hatchLinkOrderFormState, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b2e)))));
    }

    public static final HxE<ApQ, Map<String, String>> rememberPrivacyDisclaimer(BFM bfm, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b4f);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b50);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b41);
        long j = C3cH.A0W(bfm).link;
        String strA0o = C60O.A0o(AuraExternalUriRegistry.INSTANCE.getPrivacyPolicyUri().uri);
        String linkTosUrl = HatchUtil.INSTANCE.getLinkTosUrl();
        boolean zA1P = AnonymousClass003.A1P(bfm, strA0o, linkTosUrl, AnonymousClass005.A1R(bfm, strA01, strA012, strA013) | bfm.A64(j));
        Object objAaT = bfm.AaT();
        if (zA1P || objAaT == C78N.A00) {
            HxE<String, List<HatchTextLink>> hxEWithLinkedArguments = HatchLinkTextKt.withLinkedArguments(strA01, Arrays.asList(C3cG.A0r(strA012, strA0o), C3cG.A0r(HatchAppName.value, ""), C3cG.A0r(strA013, linkTosUrl)));
            String str = hxEWithLinkedArguments.first;
            List<HatchTextLink> list = hxEWithLinkedArguments.second;
            objAaT = C3cG.A0r(HatchLinkTextKt.m1189buildHatchLinkAnnotatedString9LQNqLg(str, list, j, null), HatchLinkTextKt.hatchLinkTitlesByUrl(str, list));
            BBI.A0T(bfm, objAaT);
        }
        return (HxE) objAaT;
    }

    public static final String value(HatchLinkOrderInput hatchLinkOrderInput, String str) {
        switch (str.hashCode()) {
            case -160985414:
                return str.equals(FIRST_NAME) ? hatchLinkOrderInput.firstName : "";
            case 96619420:
                return str.equals("email") ? hatchLinkOrderInput.email : "";
            case 106642798:
                return str.equals(PHONE) ? hatchLinkOrderInput.phone : "";
            case 2013122196:
                return str.equals(LAST_NAME) ? hatchLinkOrderInput.lastName : "";
            default:
                return "";
        }
    }
}
