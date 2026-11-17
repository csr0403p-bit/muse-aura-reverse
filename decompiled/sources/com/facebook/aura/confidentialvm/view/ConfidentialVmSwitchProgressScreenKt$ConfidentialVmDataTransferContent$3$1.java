package com.facebook.aura.confidentialvm.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.Awn;
import X.C1HY;
import X.C3UX;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1", f = "ConfidentialVmSwitchProgressScreen.kt", l = {183}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1HY $lifecycleOwner;
    public final /* synthetic */ ConfidentialVmDataTransferProgressViewModel $viewModel;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1$1", f = "ConfidentialVmSwitchProgressScreen.kt", l = {184}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConfidentialVmDataTransferProgressViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$viewModel = confidentialVmDataTransferProgressViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$viewModel, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel = this.$viewModel;
                this.label = 1;
                if (confidentialVmDataTransferProgressViewModel.collectUpgradePushRetries(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$viewModel, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1(C1HY c1hy, ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel, HtJ<? super ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1> htJ) {
        super(2, htJ);
        this.$lifecycleOwner = c1hy;
        this.$viewModel = confidentialVmDataTransferProgressViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1(this.$lifecycleOwner, this.$viewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1HY c1hy = this.$lifecycleOwner;
            EnumC10573Huf enumC10573Huf = EnumC10573Huf.A05;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel, null);
            this.label = 1;
            if (Awn.A00(enumC10573Huf, c1hy.getLifecycle(), this, anonymousClass1) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
