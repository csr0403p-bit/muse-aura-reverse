package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.components.phone.CountryDialCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginPhoneEntryScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $animatedLogo;
        public final /* synthetic */ boolean $autoFocusesIdentifier;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $identifier;
        public final /* synthetic */ NativeLoginImeLift $imeScroll;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isSigningInWithGoogle;
        public final /* synthetic */ Function0<Unit> $onContactPointFocus;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ G0U<CountryDialCode, Unit> $onCountrySelected;
        public final /* synthetic */ Function0<Unit> $onGoogleSignInClick;
        public final /* synthetic */ G0U<String, Unit> $onIdentifierChange;
        public final /* synthetic */ Function0<Unit> $onSmsLearnMoreClick;
        public final /* synthetic */ CountryDialCode $selectedCountry;
        public final /* synthetic */ boolean $showsGoogleSignIn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(NativeLoginImeLift nativeLoginImeLift, boolean z, boolean z2, Function0<Unit> function0, String str, String str2, boolean z3, boolean z4, Function0<Unit> function02, boolean z5, Function0<Unit> function03, G0U<? super String, Unit> g0u, CountryDialCode countryDialCode, G0U<? super CountryDialCode, Unit> g0u2, Function0<Unit> function04) {
            super(4);
            this.$imeScroll = nativeLoginImeLift;
            this.$showsGoogleSignIn = z;
            this.$animatedLogo = z2;
            this.$onSmsLearnMoreClick = function0;
            this.$errorMessage = str;
            this.$identifier = str2;
            this.$isLoading = z3;
            this.$isSigningInWithGoogle = z4;
            this.$onContinue = function02;
            this.$autoFocusesIdentifier = z5;
            this.$onContactPointFocus = function03;
            this.$onIdentifierChange = g0u;
            this.$selectedCountry = countryDialCode;
            this.$onCountrySelected = g0u2;
            this.$onGoogleSignInClick = function04;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1301invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0260  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1301invokei1RSzL4(float r54, float r55, X.BFM r56, int r57) {
            /*
                Method dump skipped, instructions count: 659
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPhoneEntryScreenKt.AnonymousClass3.m1301invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $animatedLogo;
        public final /* synthetic */ boolean $autoFocusesIdentifier;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $identifier;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isSigningInWithGoogle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onContactPointFocus;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ G0U<CountryDialCode, Unit> $onCountrySelected;
        public final /* synthetic */ Function0<Unit> $onGoogleSignInClick;
        public final /* synthetic */ G0U<String, Unit> $onIdentifierChange;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ Function0<Unit> $onSmsLearnMoreClick;
        public final /* synthetic */ CountryDialCode $selectedCountry;
        public final /* synthetic */ boolean $showBackButton;
        public final /* synthetic */ boolean $showsGoogleSignIn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z, boolean z2, Function0<Unit> function05, String str2, CountryDialCode countryDialCode, G0U<? super CountryDialCode, Unit> g0u2, boolean z3, Function0<Unit> function06, boolean z4, boolean z5, BRg bRg, boolean z6, int i, int i2, int i3) {
            super(2);
            this.$identifier = str;
            this.$onIdentifierChange = g0u;
            this.$onContactPointFocus = function0;
            this.$onContinue = function02;
            this.$onBack = function03;
            this.$onSmsLearnMoreClick = function04;
            this.$showBackButton = z;
            this.$isLoading = z2;
            this.$onOpenSettings = function05;
            this.$errorMessage = str2;
            this.$selectedCountry = countryDialCode;
            this.$onCountrySelected = g0u2;
            this.$showsGoogleSignIn = z3;
            this.$onGoogleSignInClick = function06;
            this.$isSigningInWithGoogle = z4;
            this.$autoFocusesIdentifier = z5;
            this.$modifier = bRg;
            this.$animatedLogo = z6;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginPhoneEntryScreenKt.NativeLoginPhoneEntryScreen(this.$identifier, this.$onIdentifierChange, this.$onContactPointFocus, this.$onContinue, this.$onBack, this.$onSmsLearnMoreClick, this.$showBackButton, this.$isLoading, this.$onOpenSettings, this.$errorMessage, this.$selectedCountry, this.$onCountrySelected, this.$showsGoogleSignIn, this.$onGoogleSignInClick, this.$isSigningInWithGoogle, this.$autoFocusesIdentifier, this.$modifier, this.$animatedLogo, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public static final int messageRes(NativeLoginIdentifierError nativeLoginIdentifierError) {
        int iA0E = AnonymousClass001.A0E(nativeLoginIdentifierError, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f1204b6;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f1204b5;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f1204b4;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeLoginIdentifierError.values().length];
            try {
                AnonymousClass002.A13(NativeLoginIdentifierError.INVALID_PHONE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NativeLoginIdentifierError.INVALID_EMAIL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NativeLoginIdentifierError.INVALID_CONTACT_POINT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginPhoneEntryScreen(java.lang.String r68, X.G0U<? super java.lang.String, kotlin.Unit> r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, kotlin.jvm.functions.Function0<kotlin.Unit> r71, kotlin.jvm.functions.Function0<kotlin.Unit> r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, boolean r74, boolean r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, java.lang.String r77, com.facebook.aura.components.phone.CountryDialCode r78, X.G0U<? super com.facebook.aura.components.phone.CountryDialCode, kotlin.Unit> r79, boolean r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, boolean r82, boolean r83, X.BRg r84, boolean r85, X.BFM r86, int r87, int r88, int r89) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPhoneEntryScreenKt.NativeLoginPhoneEntryScreen(java.lang.String, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.String, com.facebook.aura.components.phone.CountryDialCode, X.G0U, boolean, kotlin.jvm.functions.Function0, boolean, boolean, X.BRg, boolean, X.BFM, int, int, int):void");
    }
}
