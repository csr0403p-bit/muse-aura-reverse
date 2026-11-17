package com.facebook.aura.ageverification;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.ageverification.intf.AgeVerificationIntegration;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AgeVerificationIntegrationImpl implements AgeVerificationIntegration {
    public static final AgeVerificationIntegrationImpl INSTANCE = new AgeVerificationIntegrationImpl();

    /* renamed from: com.facebook.aura.ageverification.AgeVerificationIntegrationImpl$ActivationAgeStep$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $failedRefreshes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onOtherMethods;
        public final /* synthetic */ Function0<Unit> $onResolved;
        public final /* synthetic */ Function0<Unit> $onSelfieUnavailable;
        public final /* synthetic */ boolean $picked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, Function0<Unit> function04, BRg bRg, int i2) {
            super(2);
            this.$picked = z;
            this.$onOtherMethods = function0;
            this.$onSelfieUnavailable = function02;
            this.$onResolved = function03;
            this.$failedRefreshes = i;
            this.$onBack = function04;
            this.$modifier = bRg;
            this.$$changed = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AgeVerificationIntegrationImpl.this.ActivationAgeStep(this.$picked, this.$onOtherMethods, this.$onSelfieUnavailable, this.$onResolved, this.$failedRefreshes, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeVerificationIntegrationImpl$AgeMethodList$1, reason: invalid class name and case insensitive filesystem */
    public final class C108851 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AHD<AgeCheckMethod> $accounts;
        public final /* synthetic */ boolean $backEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onAccountPick;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onPick;
        public final /* synthetic */ AHD<AgeCheckMethod> $primary;
        public final /* synthetic */ AgeCheckMethod $resolvingMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108851(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2, AgeCheckMethod ageCheckMethod, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v2, boolean z, Function0<Unit> function0, BRg bRg, int i) {
            super(2);
            this.$primary = ahd;
            this.$accounts = ahd2;
            this.$resolvingMethod = ageCheckMethod;
            this.$onPick = g0v;
            this.$onAccountPick = g0v2;
            this.$backEnabled = z;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AgeVerificationIntegrationImpl.this.AgeMethodList(this.$primary, this.$accounts, this.$resolvingMethod, this.$onPick, this.$onAccountPick, this.$backEnabled, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.ageverification.intf.AgeVerificationIntegration
    public void ActivationAgeStep(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, Function0<Unit> function04, BRg bRg, BFM bfm, int i2) {
        AnonymousClass005.A11(function0, function02, function03, 1);
        AnonymousClass003.A0z(function04, bRg);
        bfm.AgG(-203763353);
        int iA0n = (i2 & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i2 & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i2 & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0G(bfm, i);
        }
        if ((196608 & i2) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, function04);
        }
        if ((1572864 & i2) == 0) {
            iA0n |= AnonymousClass004.A0j(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0n), bfm, iA0n)) {
            SelfieAgeStepScreenKt.SelfieAgeStep(z, function0, function02, function03, i, function04, bRg, bfm, iA0n & 4194302, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, function0, function02, function03, i, function04, bRg, i2);
        }
    }

    @Override // com.facebook.aura.ageverification.intf.AgeVerificationIntegration
    public void AgeMethodList(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2, AgeCheckMethod ageCheckMethod, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v2, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(ahd, 0);
        AnonymousClass005.A12(ahd2, g0v, g0v2, 1);
        AnonymousClass003.A10(function0, bRg);
        bfm.AgG(-1578817973);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, ahd2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(ageCheckMethod));
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            AgeMethodListScreenKt.AgeMethodListScreen(ahd, ahd2, ageCheckMethod, g0v, g0v2, z, function0, bRg, bfm, iA0d & 33554430, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108851(ahd, ahd2, ageCheckMethod, g0v, g0v2, z, function0, bRg, i);
        }
    }

    @Override // com.facebook.aura.ageverification.intf.AgeVerificationIntegration
    public void clearCaptureFiles(String str) {
        C7384Etj.A0Y(str, 0);
        AgeVerificationFiles.INSTANCE.clear(C3cG.A06(), str);
    }
}
