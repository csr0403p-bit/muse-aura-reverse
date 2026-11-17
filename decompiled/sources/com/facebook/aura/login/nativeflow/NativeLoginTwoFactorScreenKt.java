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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginTwoFactorScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorScreenKt$NativeLoginTwoFactorScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $code;
        public final /* synthetic */ String $displayContactPoint;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ NativeLoginImeLift $imeScroll;
        public final /* synthetic */ boolean $isComplete;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isRecoveryCode;
        public final /* synthetic */ boolean $isSms;
        public final /* synthetic */ HatchTwoFactorMethodType $methodType;
        public final /* synthetic */ G0U<String, Unit> $onCodeChange;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onResend;
        public final /* synthetic */ HatchTwoFactorSourceApp $sourceApp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(NativeLoginImeLift nativeLoginImeLift, boolean z, boolean z2, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, String str, boolean z3, Function0<Unit> function0, HatchTwoFactorMethodType hatchTwoFactorMethodType, String str2, G0U<? super String, Unit> g0u, boolean z4, String str3, boolean z5, Function0<Unit> function02) {
            super(4);
            this.$imeScroll = nativeLoginImeLift;
            this.$isSms = z;
            this.$isRecoveryCode = z2;
            this.$sourceApp = hatchTwoFactorSourceApp;
            this.$displayContactPoint = str;
            this.$isLoading = z3;
            this.$onResend = function0;
            this.$methodType = hatchTwoFactorMethodType;
            this.$code = str2;
            this.$onCodeChange = g0u;
            this.$isError = z4;
            this.$errorMessage = str3;
            this.$isComplete = z5;
            this.$onConfirm = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1309invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3, types: [X.BRg, java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1309invokei1RSzL4(float r42, float r43, X.BFM r44, int r45) {
            /*
                Method dump skipped, instructions count: 490
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorScreenKt.AnonymousClass1.m1309invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorScreenKt$NativeLoginTwoFactorScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $code;
        public final /* synthetic */ Integer $codeLength;
        public final /* synthetic */ String $displayContactPoint;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ HatchTwoFactorMethodType $methodType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<String, Unit> $onCodeChange;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onLeave;
        public final /* synthetic */ Function0<Unit> $onResend;
        public final /* synthetic */ HatchTwoFactorSourceApp $sourceApp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HatchTwoFactorMethodType hatchTwoFactorMethodType, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, String str, String str2, Integer num, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str3, boolean z, Function0<Unit> function04, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$methodType = hatchTwoFactorMethodType;
            this.$sourceApp = hatchTwoFactorSourceApp;
            this.$displayContactPoint = str;
            this.$code = str2;
            this.$codeLength = num;
            this.$onCodeChange = g0u;
            this.$onConfirm = function0;
            this.$onResend = function02;
            this.$onBack = function03;
            this.$errorMessage = str3;
            this.$isLoading = z;
            this.$onLeave = function04;
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
            NativeLoginTwoFactorScreenKt.NativeLoginTwoFactorScreen(this.$methodType, this.$sourceApp, this.$displayContactPoint, this.$code, this.$codeLength, this.$onCodeChange, this.$onConfirm, this.$onResend, this.$onBack, this.$errorMessage, this.$isLoading, this.$onLeave, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public static final int subtitleRes(HatchTwoFactorMethodType hatchTwoFactorMethodType, HatchTwoFactorSourceApp hatchTwoFactorSourceApp) {
        int iOrdinal;
        if (hatchTwoFactorMethodType != null && (iOrdinal = hatchTwoFactorMethodType.ordinal()) != -1) {
            if (iOrdinal == 1) {
                return hatchTwoFactorSourceApp == HatchTwoFactorSourceApp.Meta ? R.string._name_removed__res_0x7f12053f : R.string._name_removed__res_0x7f12053e;
            }
            if (iOrdinal == 2) {
                return hatchTwoFactorSourceApp == HatchTwoFactorSourceApp.Instagram ? R.string._name_removed__res_0x7f12053a : R.string._name_removed__res_0x7f120539;
            }
            if (iOrdinal == 3) {
                return R.string._name_removed__res_0x7f120538;
            }
            if (iOrdinal != 0 && iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return R.string._name_removed__res_0x7f120537;
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchTwoFactorMethodType.values().length];
            try {
                AnonymousClass002.A13(HatchTwoFactorMethodType.TOTP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchTwoFactorMethodType.RECOVERY_CODES, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchTwoFactorMethodType.ADMIN_CODES, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchTwoFactorMethodType.SMS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchTwoFactorMethodType.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginTwoFactorScreen(com.facebook.aura.login.nativeflow.HatchTwoFactorMethodType r58, com.facebook.aura.login.nativeflow.HatchTwoFactorSourceApp r59, java.lang.String r60, java.lang.String r61, java.lang.Integer r62, X.G0U<? super java.lang.String, kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, java.lang.String r67, boolean r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, X.BRg r70, X.BFM r71, int r72, int r73, int r74) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorScreenKt.NativeLoginTwoFactorScreen(com.facebook.aura.login.nativeflow.HatchTwoFactorMethodType, com.facebook.aura.login.nativeflow.HatchTwoFactorSourceApp, java.lang.String, java.lang.String, java.lang.Integer, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, boolean, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }
}
