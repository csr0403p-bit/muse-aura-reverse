package com.facebook.aura.login.nativeflow;

import X.AKQ;
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
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C1er;
import X.C2VU;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginBirthdayScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt$NativeLoginBirthdayField$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $header;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ LocalDate $selectedDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LocalDate localDate, Function0<Unit> function0, boolean z, boolean z2, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$selectedDate = localDate;
            this.$onClick = function0;
            this.$isError = z;
            this.$isLoading = z2;
            this.$header = str;
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
            NativeLoginBirthdayScreenKt.NativeLoginBirthdayField(this.$selectedDate, this.$onClick, this.$isError, this.$isLoading, this.$header, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $birthday;
        public final /* synthetic */ NativeLoginBirthdayError $birthdayError;
        public final /* synthetic */ HatchTosDisclosure $clause;
        public final /* synthetic */ boolean $collectsBirthday;
        public final /* synthetic */ boolean $collectsName;
        public final /* synthetic */ boolean $collectsPassword;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $firstName;
        public final /* synthetic */ NativeLoginImeLift $imeScroll;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ MutableState<Boolean> $isPickerVisible$delegate;
        public final /* synthetic */ String $lastName;
        public final /* synthetic */ Function0<Unit> $onBirthdayFieldFocused;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ G0U<String, Unit> $onFirstNameChange;
        public final /* synthetic */ G0U<String, Unit> $onLastNameChange;
        public final /* synthetic */ G0U<String, Unit> $onPasswordChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onPasswordRevealToggled;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ String $password;
        public final /* synthetic */ String $passwordErrorMessage;
        public final /* synthetic */ boolean $requiresConsent;
        public final /* synthetic */ LocalDate $selectedDate;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(NativeLoginImeLift nativeLoginImeLift, boolean z, Context context, boolean z2, String str, G0U<? super String, Unit> g0u, String str2, G0U<? super String, Unit> g0u2, boolean z3, boolean z4, LocalDate localDate, Function0<Unit> function0, MutableState<Boolean> mutableState, NativeLoginBirthdayError nativeLoginBirthdayError, String str3, String str4, G0U<? super String, Unit> g0u3, G0U<? super Boolean, Unit> g0u4, HatchTosDisclosure hatchTosDisclosure, boolean z5, HatchTosDisclosure hatchTosDisclosure2, G0U<? super String, Unit> g0u5, String str5, Function0<Unit> function02) {
            super(4);
            this.$imeScroll = nativeLoginImeLift;
            this.$collectsBirthday = z;
            this.$context = context;
            this.$collectsName = z2;
            this.$firstName = str;
            this.$onFirstNameChange = g0u;
            this.$lastName = str2;
            this.$onLastNameChange = g0u2;
            this.$isLoading = z3;
            this.$collectsPassword = z4;
            this.$selectedDate = localDate;
            this.$onBirthdayFieldFocused = function0;
            this.$isPickerVisible$delegate = mutableState;
            this.$birthdayError = nativeLoginBirthdayError;
            this.$passwordErrorMessage = str3;
            this.$password = str4;
            this.$onPasswordChange = g0u3;
            this.$onPasswordRevealToggled = g0u4;
            this.$tos = hatchTosDisclosure;
            this.$requiresConsent = z5;
            this.$clause = hatchTosDisclosure2;
            this.$onTosTokenTap = g0u5;
            this.$birthday = str5;
            this.$onContinue = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1274invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x025c  */
        /* JADX WARN: Type inference failed for: r28v0, types: [X.B0A] */
        /* JADX WARN: Type inference failed for: r29v0, types: [X.ApY] */
        /* JADX WARN: Type inference failed for: r29v1, types: [X.AHD] */
        /* JADX WARN: Type inference failed for: r29v3 */
        /* JADX WARN: Type inference failed for: r29v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r29v7 */
        /* JADX WARN: Type inference failed for: r30v0, types: [X.1YL] */
        /* JADX WARN: Type inference failed for: r35v1, types: [X.G0U] */
        /* JADX WARN: Type inference failed for: r36v0, types: [X.ArU, X.BRg] */
        /* JADX WARN: Type inference failed for: r37v2, types: [X.013] */
        /* JADX WARN: Type inference failed for: r40v0, types: [com.facebook.aura.login.nativeflow.NativeLoginTitleStyle] */
        /* JADX WARN: Type inference failed for: r55v0, types: [X.BFM] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1274invokei1RSzL4(float r53, float r54, X.BFM r55, int r56) {
            /*
                Method dump skipped, instructions count: 831
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt.AnonymousClass2.m1274invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $birthday;
        public final /* synthetic */ NativeLoginBirthdayError $birthdayError;
        public final /* synthetic */ HatchTosDisclosure $clause;
        public final /* synthetic */ boolean $collectsBirthday;
        public final /* synthetic */ boolean $collectsName;
        public final /* synthetic */ boolean $collectsPassword;
        public final /* synthetic */ String $firstName;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ String $lastName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onBirthdayFieldFocused;
        public final /* synthetic */ G0U<LocalDate, Unit> $onBirthdaySelected;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ G0U<String, Unit> $onFirstNameChange;
        public final /* synthetic */ G0U<String, Unit> $onLastNameChange;
        public final /* synthetic */ Function0<Unit> $onLeave;
        public final /* synthetic */ G0U<String, Unit> $onPasswordChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onPasswordRevealToggled;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ String $password;
        public final /* synthetic */ String $passwordErrorMessage;
        public final /* synthetic */ boolean $requiresConsent;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(String str, Function0<Unit> function0, G0U<? super LocalDate, Unit> g0u, String str2, G0U<? super String, Unit> g0u2, String str3, G0U<? super String, Unit> g0u3, boolean z, boolean z2, boolean z3, String str4, G0U<? super String, Unit> g0u4, boolean z4, String str5, Function0<Unit> function02, Function0<Unit> function03, G0U<? super Boolean, Unit> g0u5, G0U<? super String, Unit> g0u6, NativeLoginBirthdayError nativeLoginBirthdayError, boolean z5, Function0<Unit> function04, BRg bRg, HatchTosDisclosure hatchTosDisclosure, HatchTosDisclosure hatchTosDisclosure2, int i, int i2, int i3, int i4) {
            super(2);
            this.$birthday = str;
            this.$onBirthdayFieldFocused = function0;
            this.$onBirthdaySelected = g0u;
            this.$firstName = str2;
            this.$onFirstNameChange = g0u2;
            this.$lastName = str3;
            this.$onLastNameChange = g0u3;
            this.$collectsName = z;
            this.$collectsBirthday = z2;
            this.$requiresConsent = z3;
            this.$password = str4;
            this.$onPasswordChange = g0u4;
            this.$collectsPassword = z4;
            this.$passwordErrorMessage = str5;
            this.$onContinue = function02;
            this.$onBack = function03;
            this.$onPasswordRevealToggled = g0u5;
            this.$onTosTokenTap = g0u6;
            this.$birthdayError = nativeLoginBirthdayError;
            this.$isLoading = z5;
            this.$onLeave = function04;
            this.$modifier = bRg;
            this.$tos = hatchTosDisclosure;
            this.$clause = hatchTosDisclosure2;
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

        public final void invoke(BFM bfm, int i) {
            NativeLoginBirthdayScreenKt.NativeLoginBirthdayScreen(this.$birthday, this.$onBirthdayFieldFocused, this.$onBirthdaySelected, this.$firstName, this.$onFirstNameChange, this.$lastName, this.$onLastNameChange, this.$collectsName, this.$collectsBirthday, this.$requiresConsent, this.$password, this.$onPasswordChange, this.$collectsPassword, this.$passwordErrorMessage, this.$onContinue, this.$onBack, this.$onPasswordRevealToggled, this.$onTosTokenTap, this.$birthdayError, this.$isLoading, this.$onLeave, this.$modifier, this.$tos, this.$clause, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt$NativeLoginNameFields$2, reason: invalid class name and case insensitive filesystem */
    public final class C125202 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $birthdayOnScreen;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $firstName;
        public final /* synthetic */ String $lastName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFirstNameChange;
        public final /* synthetic */ G0U<String, Unit> $onLastNameChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125202(String str, G0U<? super String, Unit> g0u, String str2, G0U<? super String, Unit> g0u2, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$firstName = str;
            this.$onFirstNameChange = g0u;
            this.$lastName = str2;
            this.$onLastNameChange = g0u2;
            this.$enabled = z;
            this.$birthdayOnScreen = z2;
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
            NativeLoginBirthdayScreenKt.NativeLoginNameFields(this.$firstName, this.$onFirstNameChange, this.$lastName, this.$onLastNameChange, this.$enabled, this.$birthdayOnScreen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt$NativeLoginNameFields$4, reason: invalid class name and case insensitive filesystem */
    public final class C125214 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $birthdayOnScreen;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $firstName;
        public final /* synthetic */ String $lastName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFirstNameChange;
        public final /* synthetic */ G0U<String, Unit> $onLastNameChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125214(String str, G0U<? super String, Unit> g0u, String str2, G0U<? super String, Unit> g0u2, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$firstName = str;
            this.$onFirstNameChange = g0u;
            this.$lastName = str2;
            this.$onLastNameChange = g0u2;
            this.$enabled = z;
            this.$birthdayOnScreen = z2;
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
            NativeLoginBirthdayScreenKt.NativeLoginNameFields(this.$firstName, this.$onFirstNameChange, this.$lastName, this.$onLastNameChange, this.$enabled, this.$birthdayOnScreen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeLoginBirthdayError.values().length];
            try {
                AnonymousClass002.A13(NativeLoginBirthdayError.INVALID_DATE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NativeLoginBirthdayError.UNDERAGE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void NativeLoginBirthdayField(LocalDate localDate, Function0<Unit> function0, boolean z, boolean z2, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1033711057);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, localDate) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, str);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, localDate, localeA0b);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = localDate != null ? localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(localeA0b)) : null;
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            int i4 = R.string._name_removed__res_0x7f120493;
            if (str == null) {
                i4 = R.string._name_removed__res_0x7f12049a;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120499);
            if (str2 != null) {
                strA012 = str2;
            }
            String strA0t = AnonymousClass001.A0t(bfm, strA012, R.string._name_removed__res_0x7f120496);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120497);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT2, obj);
            int i5 = iA0T >> 3;
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA00, AnonymousClass004.A1M(iA0T));
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new NativeLoginBirthdayScreenKt$NativeLoginBirthdayField$1$1(interfaceC1072AWd, z2, mutableStateA00, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A1A(bfm, objAaT3, interfaceC1072AWd, boolValueOf);
            if (str2 == null) {
                str2 = "";
            }
            boolean zA1R2 = AnonymousClass005.A1R(bfm, strA0t, strA013, mutableStateA00);
            Object objAaT4 = bfm.AaT();
            if (zA1R2 || objAaT4 == obj) {
                objAaT4 = new NativeLoginBirthdayScreenKt$NativeLoginBirthdayField$2$1(strA0t, strA013, mutableStateA00);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRg2, objAaT4);
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = NativeLoginBirthdayScreenKt$NativeLoginBirthdayField$3$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            NativeLoginCommonKt.m1282NativeLoginTextFieldWHTdp1U(str2, (G0U) objAaT5, strA01, bRgA0X, false, z, null, null, true, null, null, 0, interfaceC1072AWd, str, 0L, null, bfm, ((iA0T << 9) & 458752) | 100663344, (i5 & 7168) | 384, 52944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(localDate, function0, z, z2, str, bRg2, i, i2);
        }
    }

    public static final void NativeLoginNameFields(String str, G0U<? super String, Unit> g0u, String str2, G0U<? super String, Unit> g0u2, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c125214;
        BBI bbiA0M;
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(209972122);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z2);
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
            if (z2) {
                bfm.AgE(1807391766);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d9);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 1807477202);
                strA01 = null;
            }
            B1U b1uA00 = B1V.A00(bfm, new NativeLoginBirthdayScreenKt$NativeLoginNameFields$first$1(str, g0u, z, strA01), -1719672295);
            B1U b1uA002 = B1V.A00(bfm, new NativeLoginBirthdayScreenKt$NativeLoginNameFields$last$1(str2, g0u2, z), -851219725);
            if (z2) {
                bfm.AgE(1808654334);
                InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
                int iA0J = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbiA0M.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbiA0M, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
                    C90m c90m = C90m.A00;
                    BS0 bs0 = BRg.A00;
                    b1uA00.invoke(c90m.AiP(bs0, 1.0f, true), bfm, 48);
                    b1uA002.invoke(c90m.A4D(C2VU.A03, c90m.AiP(bs0, 1.0f, true)), bfm, 48);
                    BBI.A0R(bbiA0M, true);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc != null) {
                        c125214 = new C125202(str, g0u, str2, g0u2, z, z2, bRg2, i, i2);
                        bBbAAc.A06 = c125214;
                    }
                    return;
                }
            } else {
                bfm.AgE(1808848456);
                BBI.A0R(bbiA0M, false);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                int iA0J2 = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA042 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbiA0M.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbiA0M, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA042, bRgA012, iA0J2);
                    BS0 bs02 = BRg.A00;
                    C1062ATq c1062ATq = C10G.A02;
                    b1uA00.invoke(c1062ATq, bfm, 54);
                    C01N.A05(bfm, bs02);
                    b1uA002.invoke(c1062ATq, bfm, 54);
                    BBI.A0R(bbiA0M, true);
                }
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c125214 = new C125214(str, g0u, str2, g0u2, z, z2, bRg2, i, i2);
            bBbAAc.A06 = c125214;
        }
    }

    public static final int messageRes(NativeLoginBirthdayError nativeLoginBirthdayError) {
        int iOrdinal = nativeLoginBirthdayError.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f120494;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f120495;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginBirthdayScreen(java.lang.String r89, kotlin.jvm.functions.Function0<kotlin.Unit> r90, X.G0U<? super java.time.LocalDate, kotlin.Unit> r91, java.lang.String r92, X.G0U<? super java.lang.String, kotlin.Unit> r93, java.lang.String r94, X.G0U<? super java.lang.String, kotlin.Unit> r95, boolean r96, boolean r97, boolean r98, java.lang.String r99, X.G0U<? super java.lang.String, kotlin.Unit> r100, boolean r101, java.lang.String r102, kotlin.jvm.functions.Function0<kotlin.Unit> r103, kotlin.jvm.functions.Function0<kotlin.Unit> r104, X.G0U<? super java.lang.Boolean, kotlin.Unit> r105, X.G0U<? super java.lang.String, kotlin.Unit> r106, com.facebook.aura.login.nativeflow.NativeLoginBirthdayError r107, boolean r108, kotlin.jvm.functions.Function0<kotlin.Unit> r109, X.BRg r110, com.facebook.aura.login.nativeflow.HatchTosDisclosure r111, com.facebook.aura.login.nativeflow.HatchTosDisclosure r112, X.BFM r113, int r114, int r115, int r116, int r117) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt.NativeLoginBirthdayScreen(java.lang.String, kotlin.jvm.functions.Function0, X.G0U, java.lang.String, X.G0U, java.lang.String, X.G0U, boolean, boolean, boolean, java.lang.String, X.G0U, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, com.facebook.aura.login.nativeflow.NativeLoginBirthdayError, boolean, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.login.nativeflow.HatchTosDisclosure, com.facebook.aura.login.nativeflow.HatchTosDisclosure, X.BFM, int, int, int, int):void");
    }
}
