package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C10G;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ AHD<HatchTwoFactorMethod> $methods;
    public final /* synthetic */ HatchTwoFactorMethod $selectedMethod;
    public final /* synthetic */ MutableState<String> $selectedMethodId$delegate;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ HatchTwoFactorMethod $method;
        public final /* synthetic */ HatchTwoFactorMethod $selectedMethod;
        public final /* synthetic */ MutableState<String> $selectedMethodId$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchTwoFactorMethod hatchTwoFactorMethod, HatchTwoFactorMethod hatchTwoFactorMethod2, MutableState<String> mutableState, boolean z) {
            super(3);
            this.$method = hatchTwoFactorMethod;
            this.$selectedMethod = hatchTwoFactorMethod2;
            this.$selectedMethodId$delegate = mutableState;
            this.$isLoading = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchTwoFactorMethod hatchTwoFactorMethod = this.$method;
                String str = hatchTwoFactorMethod.id;
                HatchTwoFactorMethod hatchTwoFactorMethod2 = this.$selectedMethod;
                String str2 = null;
                if (hatchTwoFactorMethod2 != null) {
                    str2 = hatchTwoFactorMethod2.id;
                }
                boolean zAreEqual = C7384Etj.areEqual(str, str2);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$method, bfm.A65(this.$selectedMethodId$delegate));
                HatchTwoFactorMethod hatchTwoFactorMethod3 = this.$method;
                MutableState<String> mutableState = this.$selectedMethodId$delegate;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$1$1$1$1$1$1$1(hatchTwoFactorMethod3, mutableState);
                    bfm.Ai0(objAaT);
                }
                NativeLoginTwoFactorMethodScreenKt.NativeLoginTwoFactorMethodRow(hatchTwoFactorMethod, zAreEqual, (Function0) objAaT, !this.$isLoading, C10G.A02, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Iterator it = this.$methods.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1((HatchTwoFactorMethod) it.next(), this.$selectedMethod, this.$selectedMethodId$delegate, this.$isLoading), -500933358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$1$1$1$1(AHD<HatchTwoFactorMethod> ahd, HatchTwoFactorMethod hatchTwoFactorMethod, MutableState<String> mutableState, boolean z) {
        super(1);
        this.$methods = ahd;
        this.$selectedMethod = hatchTwoFactorMethod;
        this.$selectedMethodId$delegate = mutableState;
        this.$isLoading = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
