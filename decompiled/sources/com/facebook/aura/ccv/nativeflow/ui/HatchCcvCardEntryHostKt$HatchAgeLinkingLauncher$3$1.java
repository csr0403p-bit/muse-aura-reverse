package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1BO;
import X.C3UX;
import X.F1F;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1", f = "HatchCcvCardEntryHost.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<Function0<Boolean>> $currentCanLaunch$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnOptionsChanged$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnRefreshAfterLinking$delegate;
    public final /* synthetic */ HatchLinkableAccountType $launch;
    public final /* synthetic */ HatchAgeLinkingViewModel $viewModel;
    public int label;

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnOptionsChanged$delegate;
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnRefreshAfterLinking$delegate;
        public final /* synthetic */ F1F $resolved;
        public final /* synthetic */ HatchAgeLinkingViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(F1F f1f, HatchAgeLinkingViewModel hatchAgeLinkingViewModel, C1BO<? extends Function0<Unit>> c1bo, C1BO<? extends Function0<Unit>> c1bo2) {
            super(1);
            this.$resolved = f1f;
            this.$viewModel = hatchAgeLinkingViewModel;
            this.$currentOnRefreshAfterLinking$delegate = c1bo;
            this.$currentOnOptionsChanged$delegate = c1bo2;
        }

        public final void invoke(int i) {
            F1F f1f = this.$resolved;
            if (f1f.element) {
                return;
            }
            f1f.element = true;
            this.$viewModel.onReturned();
            C1BO.A0D(this.$currentOnRefreshAfterLinking$delegate);
            C1BO.A0D(this.$currentOnOptionsChanged$delegate);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1(HatchLinkableAccountType hatchLinkableAccountType, HatchAgeLinkingViewModel hatchAgeLinkingViewModel, Context context, C1BO<? extends Function0<Boolean>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, C1BO<? extends Function0<Unit>> c1bo3, HtJ<? super HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1> htJ) {
        super(2, htJ);
        this.$launch = hatchLinkableAccountType;
        this.$viewModel = hatchAgeLinkingViewModel;
        this.$context = context;
        this.$currentCanLaunch$delegate = c1bo;
        this.$currentOnRefreshAfterLinking$delegate = c1bo2;
        this.$currentOnOptionsChanged$delegate = c1bo3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1(this.$launch, this.$viewModel, this.$context, this.$currentCanLaunch$delegate, this.$currentOnRefreshAfterLinking$delegate, this.$currentOnOptionsChanged$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchLinkableAccountType hatchLinkableAccountType = this.$launch;
        if (hatchLinkableAccountType != null) {
            boolean zA1Y = AnonymousClass003.A1Y(C1BO.A0A(this.$currentCanLaunch$delegate));
            HatchAgeLinkingViewModel hatchAgeLinkingViewModel = this.$viewModel;
            if (zA1Y) {
                hatchAgeLinkingViewModel.onLaunched();
                F1F f1f = new F1F();
                CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(this.$context, HatchCcvCardEntryHostKt.linkingTarget(hatchLinkableAccountType), true, CcvBloksHelperKt.AnonymousClass1.INSTANCE, new AnonymousClass1(f1f, this.$viewModel, this.$currentOnRefreshAfterLinking$delegate, this.$currentOnOptionsChanged$delegate));
            } else {
                hatchAgeLinkingViewModel.onLaunchSkipped();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
