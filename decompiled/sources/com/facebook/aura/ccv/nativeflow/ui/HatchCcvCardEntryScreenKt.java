package com.facebook.aura.ccv.nativeflow.ui;

import X.AHD;
import X.AKL;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC1699Aoe;
import X.AbstractC2271BQs;
import X.AbstractC7536F0j;
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
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGe;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0881AGi;
import X.C0Hi;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1736ApY;
import X.C1822Arm;
import X.C1DG;
import X.C1SA;
import X.C1er;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HwV;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC1702Aoh;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.ccv.nativeflow.HatchCardFieldError;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig;
import com.facebook.aura.ccv.nativeflow.HatchCcvError;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.payments.cardvalidation.HatchCardBrandAssets;
import com.facebook.aura.payments.cardvalidation.HatchCardNetwork;
import com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchCcvCardEntryScreenKt {
    public static final float CardMarkHeight = 20.0f;
    public static final float CardMarkWidth = 30.0f;
    public static final int EXPIRY_DIGITS = 4;
    public static final float FieldGap = 12.0f;
    public static final float LogoSize = 71.0f;
    public static final float SubtitleToFieldsGap = 32.0f;

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CardBrandMarks$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchCardNetwork> $acceptedNetworks;
        public final /* synthetic */ HatchCardNetwork $brand;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchCardNetwork hatchCardNetwork, AHD<? extends HatchCardNetwork> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$brand = hatchCardNetwork;
            this.$acceptedNetworks = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CardBrandMarks(this.$brand, this.$acceptedNetworks, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvCardFields$2, reason: invalid class name and case insensitive filesystem */
    public final class C110262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onBillingCountrySelected;
        public final /* synthetic */ Function0<Unit> $onCardNumberBlur;
        public final /* synthetic */ G0U<String, Unit> $onCardNumberChange;
        public final /* synthetic */ Function0<Unit> $onExpiryBlur;
        public final /* synthetic */ G0U<String, Unit> $onExpiryChange;
        public final /* synthetic */ Function0<Unit> $onSecurityCodeBlur;
        public final /* synthetic */ G0U<String, Unit> $onSecurityCodeChange;
        public final /* synthetic */ Function0<Unit> $onSubmit;
        public final /* synthetic */ Function0<Unit> $onZipBlur;
        public final /* synthetic */ G0U<String, Unit> $onZipChange;
        public final /* synthetic */ HatchCcvUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110262(HatchCcvUiState hatchCcvUiState, boolean z, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, G0U<? super String, Unit> g0u5, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$uiState = hatchCcvUiState;
            this.$enabled = z;
            this.$onCardNumberChange = g0u;
            this.$onExpiryChange = g0u2;
            this.$onSecurityCodeChange = g0u3;
            this.$onZipChange = g0u4;
            this.$onBillingCountrySelected = g0u5;
            this.$onCardNumberBlur = function0;
            this.$onExpiryBlur = function02;
            this.$onSecurityCodeBlur = function03;
            this.$onZipBlur = function04;
            this.$onSubmit = function05;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CcvCardFields(this.$uiState, this.$enabled, this.$onCardNumberChange, this.$onExpiryChange, this.$onSecurityCodeChange, this.$onZipChange, this.$onBillingCountrySelected, this.$onCardNumberBlur, this.$onExpiryBlur, this.$onSecurityCodeBlur, this.$onZipBlur, this.$onSubmit, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvCheckoutUnavailable$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CcvCheckoutUnavailable(this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvCountryField$3, reason: invalid class name and case insensitive filesystem */
    public final class C110273 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchCcvCountryConfig> $countries;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onSelect;
        public final /* synthetic */ String $selectedCountry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110273(AHD<HatchCcvCountryConfig> ahd, String str, boolean z, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$countries = ahd;
            this.$selectedCountry = str;
            this.$enabled = z;
            this.$onSelect = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CcvCountryField(this.$countries, this.$selectedCountry, this.$enabled, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C110282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $screenSubtitle;
        public final /* synthetic */ String $screenTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110282(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$screenTitle = str;
            this.$screenSubtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CcvHeader(this.$screenTitle, this.$screenSubtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvLinkingDisclosure$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchLinkableAccountType> $accountTypes;
        public final /* synthetic */ boolean $linksEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchLinkableAccountType, Unit> $onLinkAccountClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<? extends HatchLinkableAccountType> ahd, boolean z, G0U<? super HatchLinkableAccountType, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$accountTypes = ahd;
            this.$linksEnabled = z;
            this.$onLinkAccountClick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CcvLinkingDisclosure(this.$accountTypes, this.$linksEnabled, this.$onLinkAccountClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvLinkingDisclosure$2, reason: invalid class name and case insensitive filesystem */
    public final class C110292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchLinkableAccountType> $accountTypes;
        public final /* synthetic */ boolean $linksEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchLinkableAccountType, Unit> $onLinkAccountClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110292(AHD<? extends HatchLinkableAccountType> ahd, boolean z, G0U<? super HatchLinkableAccountType, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$accountTypes = ahd;
            this.$linksEnabled = z;
            this.$onLinkAccountClick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CcvLinkingDisclosure(this.$accountTypes, this.$linksEnabled, this.$onLinkAccountClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C110302 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110302(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.CcvLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C110313 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLinking;
        public final /* synthetic */ boolean $isResolvingLinking;
        public final /* synthetic */ G0U<String, Unit> $onBillingCountrySelected;
        public final /* synthetic */ Function0<Unit> $onCardNumberBlur;
        public final /* synthetic */ G0U<String, Unit> $onCardNumberChange;
        public final /* synthetic */ Function0<Unit> $onExpiryBlur;
        public final /* synthetic */ G0U<String, Unit> $onExpiryChange;
        public final /* synthetic */ G0U<HatchLinkableAccountType, Unit> $onLinkAccountClick;
        public final /* synthetic */ Function0<Unit> $onRetryCheckout;
        public final /* synthetic */ Function0<Unit> $onSecurityCodeBlur;
        public final /* synthetic */ G0U<String, Unit> $onSecurityCodeChange;
        public final /* synthetic */ Function0<Unit> $onSubmit;
        public final /* synthetic */ Function0<Unit> $onZipBlur;
        public final /* synthetic */ G0U<String, Unit> $onZipChange;
        public final /* synthetic */ HatchCcvUiState $uiState;

        /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$3$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchCcvCheckoutPhase.values().length];
                try {
                    AnonymousClass002.A13(HatchCcvCheckoutPhase.LOADING, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchCcvCheckoutPhase.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(HatchCcvCheckoutPhase.READY, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110313(HatchCcvUiState hatchCcvUiState, Function0<Unit> function0, boolean z, boolean z2, G0U<? super HatchLinkableAccountType, Unit> g0u, Function0<Unit> function02, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, G0U<? super String, Unit> g0u5, G0U<? super String, Unit> g0u6, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06) {
            super(4);
            this.$uiState = hatchCcvUiState;
            this.$onRetryCheckout = function0;
            this.$isResolvingLinking = z;
            this.$isLinking = z2;
            this.$onLinkAccountClick = g0u;
            this.$onSubmit = function02;
            this.$onCardNumberChange = g0u2;
            this.$onExpiryChange = g0u3;
            this.$onSecurityCodeChange = g0u4;
            this.$onZipChange = g0u5;
            this.$onBillingCountrySelected = g0u6;
            this.$onCardNumberBlur = function03;
            this.$onExpiryBlur = function04;
            this.$onSecurityCodeBlur = function05;
            this.$onZipBlur = function06;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m336invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0239  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m336invokei1RSzL4(float r38, float r39, X.BFM r40, int r41) {
            /*
                Method dump skipped, instructions count: 639
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt.C110313.m336invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLinking;
        public final /* synthetic */ boolean $isResolvingLinking;
        public final /* synthetic */ HatchCcvLinkingError $linkingError;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<String, Unit> $onBillingCountrySelected;
        public final /* synthetic */ Function0<Unit> $onCardNumberBlur;
        public final /* synthetic */ G0U<String, Unit> $onCardNumberChange;
        public final /* synthetic */ Function0<Unit> $onExpiryBlur;
        public final /* synthetic */ G0U<String, Unit> $onExpiryChange;
        public final /* synthetic */ G0U<HatchLinkableAccountType, Unit> $onLinkAccountClick;
        public final /* synthetic */ Function0<Unit> $onLinkingErrorDismissed;
        public final /* synthetic */ Function0<Unit> $onRetryCheckout;
        public final /* synthetic */ Function0<Unit> $onSecurityCodeBlur;
        public final /* synthetic */ G0U<String, Unit> $onSecurityCodeChange;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ Function0<Unit> $onSubmit;
        public final /* synthetic */ Function0<Unit> $onSubmitErrorDismissClick;
        public final /* synthetic */ Function0<Unit> $onSubmitErrorDismissed;
        public final /* synthetic */ Function0<Unit> $onZipBlur;
        public final /* synthetic */ G0U<String, Unit> $onZipChange;
        public final /* synthetic */ HatchCcvUiState $uiState;

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.HatchCcvCardEntryScreen(this.$uiState, this.$onCardNumberChange, this.$onExpiryChange, this.$onSecurityCodeChange, this.$onZipChange, this.$onBillingCountrySelected, this.$onCardNumberBlur, this.$onExpiryBlur, this.$onSecurityCodeBlur, this.$onZipBlur, this.$onSubmit, this.$onSubmitErrorDismissed, this.$onSubmitErrorDismissClick, this.$onLinkAccountClick, this.$isResolvingLinking, this.$isLinking, this.$linkingError, this.$onLinkingErrorDismissed, this.$onBack, this.$onSettingsClick, this.$onRetryCheckout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchCcvUiState hatchCcvUiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super String, Unit> g0u4, G0U<? super String, Unit> g0u5, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, G0U<? super HatchLinkableAccountType, Unit> g0u6, boolean z, boolean z2, HatchCcvLinkingError hatchCcvLinkingError, Function0<Unit> function08, Function0<Unit> function09, Function0<Unit> function010, Function0<Unit> function011, BRg bRg, int i, int i2, int i3, int i4) {
            super(2);
            this.$uiState = hatchCcvUiState;
            this.$onCardNumberChange = g0u;
            this.$onExpiryChange = g0u2;
            this.$onSecurityCodeChange = g0u3;
            this.$onZipChange = g0u4;
            this.$onBillingCountrySelected = g0u5;
            this.$onCardNumberBlur = function0;
            this.$onExpiryBlur = function02;
            this.$onSecurityCodeBlur = function03;
            this.$onZipBlur = function04;
            this.$onSubmit = function05;
            this.$onSubmitErrorDismissed = function06;
            this.$onSubmitErrorDismissClick = function07;
            this.$onLinkAccountClick = g0u6;
            this.$isResolvingLinking = z;
            this.$isLinking = z2;
            this.$linkingError = hatchCcvLinkingError;
            this.$onLinkingErrorDismissed = function08;
            this.$onBack = function09;
            this.$onSettingsClick = function010;
            this.$onRetryCheckout = function011;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$HatchCcvLinkingErrorDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C110321 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $dismissLabel;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110321(String str, Function0<Unit> function0) {
            super(2);
            this.$dismissLabel = str;
            this.$onDismiss = function0;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(this.$dismissLabel));
            String str = this.$dismissLabel;
            Function0<Unit> function0 = this.$onDismiss;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchCcvCardEntryScreenKt$HatchCcvLinkingErrorDialog$1$1$1(str, function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$HatchCcvLinkingErrorDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C110332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchCcvLinkingError $error;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110332(HatchCcvLinkingError hatchCcvLinkingError, Function0<Unit> function0, int i) {
            super(2);
            this.$error = hatchCcvLinkingError;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.HatchCcvLinkingErrorDialog(this.$error, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$SecureScreenEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C110341 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110341(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.SecureScreenEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$SecureScreenEffect$3, reason: invalid class name and case insensitive filesystem */
    public final class C110353 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110353(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvCardEntryScreenKt.SecureScreenEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[HatchCcvLinkingError.values().length];
            try {
                AnonymousClass005.A0v(HatchCcvLinkingError.ACCOUNT_NOT_ELIGIBLE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvLinkingError.GENERIC, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchLinkableAccountType.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkableAccountType.INSTAGRAM, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkableAccountType.FACEBOOK, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HatchCcvError.values().length];
            try {
                AnonymousClass005.A0v(HatchCcvError.CARD_SAVE, iArr3, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.FINALIZE, iArr3, 2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.THREE_DS_STEP_UP, iArr3, 3);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.CHECKOUT_INIT, iArr3, 4);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.ENCRYPTION_KEY, iArr3, 5);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchCcvError.PTT_GENERATION, iArr3, 6);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[HatchCardFieldError.values().length];
            try {
                AnonymousClass005.A0v(HatchCardFieldError.PAN_EMPTY, iArr4, 1);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(HatchCardFieldError.PAN_INCOMPLETE, iArr4, 2);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(HatchCardFieldError.PAN_INVALID, iArr4, 3);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(HatchCardFieldError.PAN_UNSUPPORTED_BRAND, iArr4, 4);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(HatchCardFieldError.EXPIRY_EMPTY, iArr4, 5);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass005.A0v(HatchCardFieldError.EXPIRY_MALFORMED, iArr4, 6);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass006.A1G(HatchCardFieldError.EXPIRY_MONTH_INVALID, iArr4);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AnonymousClass006.A1H(HatchCardFieldError.EXPIRY_PAST, iArr4);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AnonymousClass006.A1I(HatchCardFieldError.CSC_EMPTY, iArr4);
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AnonymousClass006.A1J(HatchCardFieldError.CSC_WRONG_LENGTH, iArr4);
            } catch (NoSuchFieldError unused20) {
            }
            try {
                AnonymousClass006.A1K(HatchCardFieldError.ZIP_EMPTY, iArr4);
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    public static final void CardBrandMarks(HatchCardNetwork hatchCardNetwork, AHD<? extends HatchCardNetwork> ahd, BRg bRg, BFM bfm, int i, int i2) {
        ?? A0h;
        BRg bRg2 = bRg;
        bfm.AgG(-169201299);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchCardNetwork) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, ahd);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchCardBrandAssets hatchCardBrandAssets = HatchCardBrandAssets.INSTANCE;
            Integer numForNetwork = hatchCardBrandAssets.forNetwork(hatchCardNetwork);
            if (numForNetwork != null) {
                A0h = Collections.singletonList(Integer.valueOf(numForNetwork.intValue()));
            } else {
                A0h = C3cG.A0h();
                Iterator it = ahd.iterator();
                while (it.hasNext()) {
                    Integer numForNetwork2 = hatchCardBrandAssets.forNetwork((HatchCardNetwork) it.next());
                    if (numForNetwork2 != null) {
                        A0h.add(numForNetwork2);
                    }
                }
            }
            BRg bRgA0C = C3U4.A0C(bRg2, 0.0f, 0.0f, AuraDimensKt.SpacingMedium, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            if (A0h.isEmpty()) {
                bfm.AgE(-609601129);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.credit_card_outline_24, 0), AuraIconSize.X_SMALL, null, C3cH.A0W(bfm).secondaryText, null, bfm, AnonymousClass001.A04(), 33);
            } else {
                Iterator itA0w = AnonymousClass001.A0w(bfm, A0h, -609372163);
                while (itA0w.hasNext()) {
                    C1SA.A00(bfm, null, C10G.A0C(BRg.A00, CardMarkWidth, CardMarkHeight), null, BOf.A00(bfm, C60Q.A03(itA0w), 0), null, null, 0.0f, AVy.$stable | 432, 120);
                }
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchCardNetwork, ahd, bRg2, i, i2);
        }
    }

    public static final void CcvCheckoutUnavailable(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1101889854);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
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
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchCcvCardEntryScreenKt$CcvCheckoutUnavailable$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRg2, (G0U) objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA012, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120224);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Emphasized;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchCcvCardEntryScreenKt$CcvCheckoutUnavailable$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT2, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120222), C3U4.A07(c1062ATq, AuraDimensKt.SpacingMedium), C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120223), null, c1062ATq, AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, (iA0T << 12) & 57344, 0, 134201317);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, bRg2, i, i2);
        }
    }

    public static final void CcvCountryField(AHD<HatchCcvCountryConfig> ahd, String str, boolean z, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        Object next;
        BRg bRg2 = bRg;
        bfm.AgG(1639557522);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass007.A0U(bfm, obj);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120208);
            boolean zA67 = bfm.A67(c0Hi);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchCcvCardEntryScreenKt$CcvCountryField$openMenu$2$1(c0Hi, mutableState);
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA00 = C1er.A00(bfm, objAaT2);
            boolean zA1C = AnonymousClass003.A1C(iA0T) | bfm.A65(ahd);
            Object objAaT3 = bfm.AaT();
            if (zA1C || objAaT3 == obj) {
                Iterator it = ahd.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (C7384Etj.areEqual(((HatchCcvCountryConfig) next).country, str)) {
                            break;
                        }
                    }
                }
                HatchCcvCountryConfig hatchCcvCountryConfig = (HatchCcvCountryConfig) next;
                if (hatchCcvCountryConfig == null || (objAaT3 = hatchCcvCountryConfig.label) == null) {
                    objAaT3 = countryDisplayName(str);
                }
                bfm.Ai0(objAaT3);
            }
            String str2 = (String) objAaT3;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA00, AnonymousClass004.A1K(iA0T));
            Object objAaT4 = bfm.AaT();
            if (zA1R || objAaT4 == obj) {
                objAaT4 = new HatchCcvCardEntryScreenKt$CcvCountryField$1$1(interfaceC1072AWd, z, mutableStateA00, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A1A(bfm, objAaT4, interfaceC1072AWd, boolValueOf);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            boolean zA1R2 = AnonymousClass005.A1R(bfm, strA01, str2, mutableStateA00);
            Object objAaT5 = bfm.AaT();
            if (zA1R2 || objAaT5 == obj) {
                objAaT5 = new HatchCcvCardEntryScreenKt$CcvCountryField$2$1$1(strA01, str2, mutableStateA00);
                bfm.Ai0(objAaT5);
            }
            BRg bRgA00 = ARD.A00(c1062ATq, (G0U) objAaT5);
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, AuraTheme.INSTANCE);
            B1U b1uA00 = B1V.A00(bfm, new HatchCcvCardEntryScreenKt$CcvCountryField$2$2(strA01), 1070146272);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchCcvCardEntryScreenKt.f14lambda$695604810;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = HatchCcvCardEntryScreenKt$CcvCountryField$2$3$1.INSTANCE;
                bfm.Ai0(objAaT6);
            }
            AuraTextInputKt.AuraTextInput(str2, null, bRgA00, b1uA00, null, null, null, c1822ArmA0C, true, 0, 0, null, g0v, null, interfaceC1072AWd, z, true, false, false, null, (G0U) objAaT6, bfm, 100666368, ((iA0T << 9) & 458752) | 1597824, 6, 929394);
            BRg bRgAQJ = c0z7.AQJ(bs0);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA672 = bfm.A67(ahd) | AnonymousClass004.A1M(iA0T);
            Object objAaT7 = bfm.AaT();
            if (zA672 || objAaT7 == obj) {
                objAaT7 = new HatchCcvCardEntryScreenKt$CcvCountryField$2$4$1(ahd, mutableState, g0u);
                bfm.Ai0(objAaT7);
            }
            G0U g0u2 = (G0U) objAaT7;
            Object objAaT8 = bfm.AaT();
            if (objAaT8 == obj) {
                objAaT8 = new HatchCcvCardEntryScreenKt$CcvCountryField$2$5$1(mutableState);
                bfm.Ai0(objAaT8);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRgAQJ, g0u2, (Function0) objAaT8, zA0A, null, 0L, null, false, new HatchCcvCardEntryScreenKt$CcvCountryField$2$6(ahd, str), false, null, null, null, false, bfm, 384, 0, 16112);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110273(ahd, str, z, g0u, bRg2, i, i2);
        }
    }

    public static final void CcvHeader(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(1347287049);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            if (str == null) {
                bfm.AgE(1957702452);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120221);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 1957701987);
                strA01 = str;
            }
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_logo, 0);
            BS0 bs0 = BRg.A00;
            C1SA.A00(bfm, null, C10G.A07(bs0, LogoSize), null, aVyA00, null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A06(bfm, bs0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title1Emphasized;
            long jA06 = C3cH.A06(bfm, auraTheme);
            C1062ATq c1062ATq = C10G.A02;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchCcvCardEntryScreenKt$CcvHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A05(bfm, bs0);
            if (str2 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A0B(c1062ATq, AuraDimensKt.SpacingMedium, 0.0f), C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -879124850).subheadlineRegular, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16304);
            } else {
                bfm.AgE(-878760445);
            }
            AnonymousClass003.A0q(bbiA0M);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110282(str, str2, bRg2, i, i2);
        }
    }

    public static final void CcvLinkingDisclosure(AHD<? extends HatchLinkableAccountType> ahd, boolean z, G0U<? super HatchLinkableAccountType, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c110292;
        int i3;
        Object[] objArr;
        BRg bRg2 = bRg;
        bfm.AgG(1601839262);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c110292 = new AnonymousClass1(ahd, z, g0u, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c110292);
                }
                return;
            }
            bfm.AgE(1769247655);
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(AbstractC2271BQs.A01(bfm, labelRes((HatchLinkableAccountType) it.next())));
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (arrayListA0i.size() == 1) {
                bfm.AgE(-987811020);
                i3 = R.string._name_removed__res_0x7f12021e;
                objArr = new Object[]{arrayListA0i.get(0)};
            } else {
                bfm.AgE(-987725460);
                i3 = R.string._name_removed__res_0x7f120217;
                objArr = new Object[]{arrayListA0i.get(0), arrayListA0i.get(1)};
            }
            String strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            BBI.A0R(bbi, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1697Aoc c1697AocM1191hatchLinkStylesek8zF_U = HatchLinkTextKt.m1191hatchLinkStylesek8zF_U(auraTheme.getColors(bfm, 6).link, C1736ApY.A03, null);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1697AocM1191hatchLinkStylesek8zF_U, AnonymousClass003.A1B(iA0d), AnonymousClass003.A1K(bfm, strA02, arrayListA0i)) | AnonymousClass003.A1C(iA0d) | ((iA0d & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = z ? buildLinkedSentence(strA02, arrayListA0i, ahd, c1697AocM1191hatchLinkStylesek8zF_U, g0u) : new ApQ(strA02, C0881AGi.A00);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(3), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32688);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c110292 = new C110292(ahd, z, g0u, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c110292);
        }
    }

    public static final void HatchCcvLinkingErrorDialog(HatchCcvLinkingError hatchCcvLinkingError, Function0<Unit> function0, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(hatchCcvLinkingError, function0);
        bfm.AgG(-1275999595);
        int iA08 = (i & 6) == 0 ? i | AnonymousClass005.A08(bfm, hatchCcvLinkingError) : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, titleRes(hatchCcvLinkingError)), AbstractC2271BQs.A01(bfm, messageRes(hatchCcvLinkingError)), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, B1V.A00(bfm, new C110321(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12020d), function0), -472484956), function0, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, ((iA08 << 15) & 3670016) | 196608, zA1b ? 1 : 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110332(hatchCcvLinkingError, function0, i);
        }
    }

    public static final String countryDisplayName(String str) {
        String displayCountry = new Locale.Builder().setRegion(str).build().getDisplayCountry();
        return !C7BY.A0j(displayCountry) ? displayCountry : str;
    }

    public static final boolean isEndToEndTestOnDebugOrInternalBuild() {
        return false;
    }

    public static final void CcvLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1515462840);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12021f);
            BRg bRgA02 = C10G.A02(C2VU.A09, AnonymousClass001.A0T(bRg), false);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchCcvCardEntryScreenKt$CcvLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110302(bRg, i, i2);
        }
    }

    public static final void SecureScreenEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 1301061709, i), bfm, i)) {
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            boolean zA67 = bfm.A67(activity);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchCcvCardEntryScreenKt$SecureScreenEffect$2$1(activity);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, activity);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110353(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ApQ buildLinkedSentence(String str, List<String> list, List<? extends HatchLinkableAccountType> list2, C1697Aoc c1697Aoc, final G0U<? super HatchLinkableAccountType, Unit> g0u) {
        ArrayList arrayListA0h = C3cG.A0h();
        int length = 0;
        int i = 0;
        for (String str2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            String str3 = str2;
            int iA0B = C7BY.A0B(str, str3, 0, false);
            Integer numValueOf = Integer.valueOf(iA0B);
            if (iA0B >= 0) {
                arrayListA0h.add(new HwV(numValueOf, str3, list2.get(i)));
            }
            i = i2;
        }
        List<HwV> listA0c = AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$buildLinkedSentence$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00((Integer) ((HwV) t).first, (Integer) ((HwV) t2).first);
            }
        });
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        for (HwV hwV : listA0c) {
            int iA0F = AnonymousClass001.A0F(hwV.first);
            String str4 = (String) hwV.second;
            final HatchLinkableAccountType hatchLinkableAccountType = (HatchLinkableAccountType) hwV.third;
            if (iA0F >= length) {
                c1731ApSA0W.A0D(str, length, iA0F);
                int iA01 = c1731ApSA0W.A01(new BGe(new InterfaceC1702Aoh() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$buildLinkedSentence$1$1
                    @Override // X.InterfaceC1702Aoh
                    public final void onClick(AbstractC1699Aoe abstractC1699Aoe) {
                        g0u.invoke(hatchLinkableAccountType);
                    }
                }, c1697Aoc, hatchLinkableAccountType.name()));
                try {
                    c1731ApSA0W.A0E(str4);
                    c1731ApSA0W.A06(iA01);
                    length = str4.length() + iA0F;
                } catch (Throwable th) {
                    c1731ApSA0W.A06(iA01);
                    throw th;
                }
            }
        }
        c1731ApSA0W.A0D(str, length, str.length());
        return c1731ApSA0W.A04();
    }

    public static final boolean isPanComplete(String str) {
        String strDigitsOnly = HatchCardNetworkKt.digitsOnly(str);
        int length = strDigitsOnly.length();
        return length > 0 && length >= HatchCardNetwork.Companion.forDigits(strDigitsOnly).getMaxPanLength();
    }

    public static final int labelRes(HatchLinkableAccountType hatchLinkableAccountType) {
        int iOrdinal = hatchLinkableAccountType.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f12021c;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f12021b;
        }
        throw C3cG.A0q();
    }

    public static final int messageRes(HatchCardFieldError hatchCardFieldError) {
        switch (hatchCardFieldError.ordinal()) {
            case 0:
            case 1:
                return R.string._name_removed__res_0x7f120209;
            case 2:
                return R.string._name_removed__res_0x7f12020a;
            case 3:
                return R.string._name_removed__res_0x7f12020b;
            case 4:
            case 5:
            case 6:
                return R.string._name_removed__res_0x7f12020e;
            case 7:
                return R.string._name_removed__res_0x7f12020f;
            case 8:
            case 9:
                return R.string._name_removed__res_0x7f120214;
            case 10:
                return R.string._name_removed__res_0x7f120215;
            default:
                throw C3cG.A0q();
        }
    }

    public static final int titleRes(HatchCcvLinkingError hatchCcvLinkingError) {
        int iOrdinal = hatchCcvLinkingError.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f12021a;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f120212;
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CcvCardFields(com.facebook.aura.ccv.nativeflow.ui.HatchCcvUiState r79, boolean r80, X.G0U<? super java.lang.String, kotlin.Unit> r81, X.G0U<? super java.lang.String, kotlin.Unit> r82, X.G0U<? super java.lang.String, kotlin.Unit> r83, X.G0U<? super java.lang.String, kotlin.Unit> r84, X.G0U<? super java.lang.String, kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, kotlin.jvm.functions.Function0<kotlin.Unit> r90, X.BRg r91, X.BFM r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt.CcvCardFields(com.facebook.aura.ccv.nativeflow.ui.HatchCcvUiState, boolean, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[PHI: r19
  0x01c5: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v4 java.lang.String) binds: [B:97:0x018a, B:99:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* renamed from: CcvField-V4wbGKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m334CcvFieldV4wbGKQ(java.lang.String r60, X.G0U<? super java.lang.String, kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, int r63, com.facebook.aura.ccv.nativeflow.HatchCardFieldError r64, java.lang.String r65, boolean r66, X.Hw8 r67, X.BRg r68, java.lang.String r69, java.lang.String r70, int r71, int r72, int r73, X.C2257BGr r74, X.C1518AkS r75, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r76, X.BFM r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt.m334CcvFieldV4wbGKQ(java.lang.String, X.G0U, kotlin.jvm.functions.Function0, int, com.facebook.aura.ccv.nativeflow.HatchCardFieldError, java.lang.String, boolean, X.Hw8, X.BRg, java.lang.String, java.lang.String, int, int, int, X.BGr, X.AkS, X.G0V, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee A[PHI: r33
  0x01ee: PHI (r33v4 boolean) = (r33v0 boolean), (r33v5 boolean) binds: [B:108:0x01ec, B:106:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0349 A[PHI: r33
  0x0349: PHI (r33v1 boolean) = (r33v0 boolean), (r33v4 boolean) binds: [B:108:0x01ec, B:110:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchCcvCardEntryScreen(com.facebook.aura.ccv.nativeflow.ui.HatchCcvUiState r69, X.G0U<? super java.lang.String, kotlin.Unit> r70, X.G0U<? super java.lang.String, kotlin.Unit> r71, X.G0U<? super java.lang.String, kotlin.Unit> r72, X.G0U<? super java.lang.String, kotlin.Unit> r73, X.G0U<? super java.lang.String, kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, kotlin.jvm.functions.Function0<kotlin.Unit> r78, kotlin.jvm.functions.Function0<kotlin.Unit> r79, kotlin.jvm.functions.Function0<kotlin.Unit> r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, X.G0U<? super com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType, kotlin.Unit> r82, boolean r83, boolean r84, com.facebook.aura.ccv.nativeflow.ui.HatchCcvLinkingError r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, X.BRg r90, X.BFM r91, int r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt.HatchCcvCardEntryScreen(com.facebook.aura.ccv.nativeflow.ui.HatchCcvUiState, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, boolean, boolean, com.facebook.aura.ccv.nativeflow.ui.HatchCcvLinkingError, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int, int):void");
    }

    public static final int messageRes(HatchCcvError hatchCcvError) {
        switch (hatchCcvError.ordinal()) {
            case 0:
            case 1:
            case 2:
                return R.string._name_removed__res_0x7f120211;
            case 3:
                return R.string._name_removed__res_0x7f12020c;
            case 4:
            case 5:
                return R.string._name_removed__res_0x7f120210;
            default:
                throw C3cG.A0q();
        }
    }

    public static final int titleRes(HatchCcvError hatchCcvError) {
        int iOrdinal = hatchCcvError.ordinal();
        if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
            return R.string._name_removed__res_0x7f120212;
        }
        return R.string._name_removed__res_0x7f120213;
    }

    public static final int messageRes(HatchCcvLinkingError hatchCcvLinkingError) {
        int iOrdinal = hatchCcvLinkingError.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return R.string._name_removed__res_0x7f120218;
            }
            throw C3cG.A0q();
        }
        return R.string._name_removed__res_0x7f120219;
    }
}
