package com.facebook.aura.login.nativeflow;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.C1DG;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.utils.navigation.SecureUri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginPasswordScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPasswordScreenKt$NativeLoginForgotPasswordLink$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SecureUri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SecureUri secureUri, String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$uri = secureUri;
            this.$contactPoint = str;
            this.$enabled = z;
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
            NativeLoginPasswordScreenKt.NativeLoginForgotPasswordLink(this.$uri, this.$contactPoint, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPasswordScreenKt$NativeLoginPasswordScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C125542 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ String $destination;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ NativeLoginImeLift $imeScroll;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ G0U<String, Unit> $onPasswordChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onPasswordRevealToggled;
        public final /* synthetic */ G0U<Boolean, Unit> $onRememberDeviceValueChange;
        public final /* synthetic */ String $password;
        public final /* synthetic */ Boolean $rememberDeviceValue;
        public final /* synthetic */ NativeLoginPasswordSubtitle $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125542(NativeLoginImeLift nativeLoginImeLift, NativeLoginPasswordSubtitle nativeLoginPasswordSubtitle, String str, boolean z, String str2, G0U<? super String, Unit> g0u, boolean z2, G0U<? super Boolean, Unit> g0u2, String str3, Boolean bool, G0U<? super Boolean, Unit> g0u3, Function0<Unit> function0, String str4) {
            super(4);
            this.$imeScroll = nativeLoginImeLift;
            this.$subtitle = nativeLoginPasswordSubtitle;
            this.$destination = str;
            this.$isLoading = z;
            this.$password = str2;
            this.$onPasswordChange = g0u;
            this.$isError = z2;
            this.$onPasswordRevealToggled = g0u2;
            this.$errorMessage = str3;
            this.$rememberDeviceValue = bool;
            this.$onRememberDeviceValueChange = g0u3;
            this.$onConfirm = function0;
            this.$contactPoint = str4;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1300invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x011f  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1300invokei1RSzL4(float r33, float r34, X.BFM r35, int r36) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPasswordScreenKt.C125542.m1300invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginPasswordScreenKt$NativeLoginPasswordScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ String $destination;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onLeave;
        public final /* synthetic */ G0U<String, Unit> $onPasswordChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onPasswordRevealToggled;
        public final /* synthetic */ G0U<Boolean, Unit> $onRememberDeviceValueChange;
        public final /* synthetic */ String $password;
        public final /* synthetic */ Boolean $rememberDeviceValue;
        public final /* synthetic */ NativeLoginPasswordSubtitle $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, String str3, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, G0U<? super Boolean, Unit> g0u2, String str4, boolean z, Boolean bool, G0U<? super Boolean, Unit> g0u3, Function0<Unit> function03, BRg bRg, NativeLoginPasswordSubtitle nativeLoginPasswordSubtitle, int i, int i2, int i3) {
            super(2);
            this.$destination = str;
            this.$contactPoint = str2;
            this.$password = str3;
            this.$onPasswordChange = g0u;
            this.$onConfirm = function0;
            this.$onBack = function02;
            this.$onPasswordRevealToggled = g0u2;
            this.$errorMessage = str4;
            this.$isLoading = z;
            this.$rememberDeviceValue = bool;
            this.$onRememberDeviceValueChange = g0u3;
            this.$onLeave = function03;
            this.$modifier = bRg;
            this.$subtitle = nativeLoginPasswordSubtitle;
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
            NativeLoginPasswordScreenKt.NativeLoginPasswordScreen(this.$destination, this.$contactPoint, this.$password, this.$onPasswordChange, this.$onConfirm, this.$onBack, this.$onPasswordRevealToggled, this.$errorMessage, this.$isLoading, this.$rememberDeviceValue, this.$onRememberDeviceValueChange, this.$onLeave, this.$modifier, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public static final void NativeLoginForgotPasswordLink(SecureUri secureUri, String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(166591856);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, secureUri) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d0);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).subheadlineEmphasized;
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0H, bfm.A67(secureUri), AnonymousClass001.A1N(iA0T));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new NativeLoginPasswordScreenKt$NativeLoginForgotPasswordLink$1$1(str, secureUri, contextA0H);
                bfm.Ai0(objAaT);
            }
            NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(strA01, (Function0) objAaT, bRg2, 0L, c1822Arm, z, bfm, AnonymousClass001.A08(iA0T << 9, (iA0T >> 3) & 896), 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(secureUri, str, z, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeLoginPasswordSubtitleArgs.values().length];
            try {
                AnonymousClass002.A13(NativeLoginPasswordSubtitleArgs.DESTINATION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NativeLoginPasswordSubtitleArgs.APP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NativeLoginPasswordSubtitleArgs.APP_DESTINATION, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginPasswordScreen(java.lang.String r59, java.lang.String r60, java.lang.String r61, X.G0U<? super java.lang.String, kotlin.Unit> r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, X.G0U<? super java.lang.Boolean, kotlin.Unit> r65, java.lang.String r66, boolean r67, java.lang.Boolean r68, X.G0U<? super java.lang.Boolean, kotlin.Unit> r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, X.BRg r71, com.facebook.aura.login.nativeflow.NativeLoginPasswordSubtitle r72, X.BFM r73, int r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginPasswordScreenKt.NativeLoginPasswordScreen(java.lang.String, java.lang.String, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, java.lang.String, boolean, java.lang.Boolean, X.G0U, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.login.nativeflow.NativeLoginPasswordSubtitle, X.BFM, int, int, int):void");
    }

    public static final String passwordSubtitleText(NativeLoginPasswordSubtitle nativeLoginPasswordSubtitle, String str, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        int iOrdinal = nativeLoginPasswordSubtitle.args.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(801500883);
            i2 = nativeLoginPasswordSubtitle.textRes;
            objArr = new Object[]{str};
        } else if (iOrdinal == 1) {
            bfm.AgE(801504250);
            i2 = nativeLoginPasswordSubtitle.textRes;
            objArr = new Object[]{HatchAppName.value};
        } else {
            if (iOrdinal != 2) {
                throw AnonymousClass005.A0k(bfm, 801498472);
            }
            bfm.AgE(801508231);
            i2 = nativeLoginPasswordSubtitle.textRes;
            objArr = new Object[]{HatchAppName.value, str};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA02;
    }
}
