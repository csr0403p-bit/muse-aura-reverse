package com.facebook.aura.login.nativeflow;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
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
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginOtpScreenKt {
    public static final float MAX_LIFT_KEEPING_TITLE_BELOW_HEADER = (NativeLoginCommonKt.NATIVE_LOGIN_CONTENT_TOP_SPACING + NativeLoginCommonKt.NATIVE_LOGIN_LOGO_SIZE) + AuraDimensKt.SpacingLarge;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOtpScreenKt$NativeLoginOtpScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $destination;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ NativeLoginImeLift $imeScroll;
        public final /* synthetic */ boolean $isEmailDestination;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isLoginFlow;
        public final /* synthetic */ boolean $isPasswordLoginAvailable;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ G0U<String, Unit> $onOtpChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onRememberDeviceValueChange;
        public final /* synthetic */ Function0<Unit> $onResendCode;
        public final /* synthetic */ Function0<Unit> $onUsePasswordInstead;
        public final /* synthetic */ String $otp;
        public final /* synthetic */ Boolean $rememberDeviceValue;
        public final /* synthetic */ boolean $showsLoginCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(NativeLoginImeLift nativeLoginImeLift, boolean z, boolean z2, boolean z3, Function0<Unit> function0, String str, String str2, G0U<? super String, Unit> g0u, boolean z4, String str3, Boolean bool, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function02, boolean z5, Function0<Unit> function03, boolean z6) {
            super(4);
            this.$imeScroll = nativeLoginImeLift;
            this.$showsLoginCopy = z;
            this.$isEmailDestination = z2;
            this.$isLoading = z3;
            this.$onResendCode = function0;
            this.$destination = str;
            this.$otp = str2;
            this.$onOtpChange = g0u;
            this.$isError = z4;
            this.$errorMessage = str3;
            this.$rememberDeviceValue = bool;
            this.$onRememberDeviceValueChange = g0u2;
            this.$onConfirm = function02;
            this.$isPasswordLoginAvailable = z5;
            this.$onUsePasswordInstead = function03;
            this.$isLoginFlow = z6;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1299invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1299invokei1RSzL4(float r45, float r46, X.BFM r47, int r48) {
            /*
                Method dump skipped, instructions count: 480
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginOtpScreenKt.AnonymousClass1.m1299invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOtpScreenKt$NativeLoginOtpScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $destination;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ HatchAuthFlow $flow;
        public final /* synthetic */ boolean $isEmailDestination;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPasswordLoginAvailable;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onLeave;
        public final /* synthetic */ G0U<String, Unit> $onOtpChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onRememberDeviceValueChange;
        public final /* synthetic */ Function0<Unit> $onResendCode;
        public final /* synthetic */ Function0<Unit> $onUsePasswordInstead;
        public final /* synthetic */ String $otp;
        public final /* synthetic */ Boolean $rememberDeviceValue;
        public final /* synthetic */ boolean $showsLoginCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str3, boolean z, boolean z2, boolean z3, HatchAuthFlow hatchAuthFlow, boolean z4, Function0<Unit> function04, Boolean bool, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function05, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$destination = str;
            this.$otp = str2;
            this.$onOtpChange = g0u;
            this.$onConfirm = function0;
            this.$onResendCode = function02;
            this.$onBack = function03;
            this.$errorMessage = str3;
            this.$isLoading = z;
            this.$isEmailDestination = z2;
            this.$isPasswordLoginAvailable = z3;
            this.$flow = hatchAuthFlow;
            this.$showsLoginCopy = z4;
            this.$onUsePasswordInstead = function04;
            this.$rememberDeviceValue = bool;
            this.$onRememberDeviceValueChange = g0u2;
            this.$onLeave = function05;
            this.$modifier = bRg;
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
            NativeLoginOtpScreenKt.NativeLoginOtpScreen(this.$destination, this.$otp, this.$onOtpChange, this.$onConfirm, this.$onResendCode, this.$onBack, this.$errorMessage, this.$isLoading, this.$isEmailDestination, this.$isPasswordLoginAvailable, this.$flow, this.$showsLoginCopy, this.$onUsePasswordInstead, this.$rememberDeviceValue, this.$onRememberDeviceValueChange, this.$onLeave, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginOtpScreenKt$NativeLoginTryAnotherWayLink$2, reason: invalid class name and case insensitive filesystem */
    public final class C125532 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contactPoint;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SecureUri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125532(SecureUri secureUri, String str, boolean z, BRg bRg, int i, int i2) {
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
            NativeLoginOtpScreenKt.NativeLoginTryAnotherWayLink(this.$uri, this.$contactPoint, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginTryAnotherWayLink(SecureUri secureUri, String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1058181727);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12052e);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).subheadlineEmphasized;
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0H, bfm.A67(secureUri), AnonymousClass001.A1N(iA0T));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new NativeLoginOtpScreenKt$NativeLoginTryAnotherWayLink$1$1(str, secureUri, contextA0H);
                bfm.Ai0(objAaT);
            }
            NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(strA01, (Function0) objAaT, bRg2, 0L, c1822Arm, z, bfm, AnonymousClass001.A08(iA0T << 9, (iA0T >> 3) & 896), 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125532(secureUri, str, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginOtpScreen(java.lang.String r62, java.lang.String r63, X.G0U<? super java.lang.String, kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, java.lang.String r68, boolean r69, boolean r70, boolean r71, com.facebook.aura.login.nativeflow.HatchAuthFlow r72, boolean r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, java.lang.Boolean r75, X.G0U<? super java.lang.Boolean, kotlin.Unit> r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, X.BRg r78, X.BFM r79, int r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginOtpScreenKt.NativeLoginOtpScreen(java.lang.String, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, boolean, boolean, boolean, com.facebook.aura.login.nativeflow.HatchAuthFlow, boolean, kotlin.jvm.functions.Function0, java.lang.Boolean, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }
}
