package com.facebook.aura.subscription.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $cancelToast;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $errorToast;
    public final /* synthetic */ MutableState<Boolean> $isCancelling$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;
    public final /* synthetic */ AuraSubscriptionUsageViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1", f = "AuraSubscriptionUsageBottomSheet.kt", l = {170}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cancelToast;
        public final /* synthetic */ String $errorToast;
        public final /* synthetic */ MutableState<Boolean> $isCancelling$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<String, Unit> $showDismissToast;
        public final /* synthetic */ AuraSubscriptionUsageViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel, G0U<? super String, Unit> g0u, String str, String str2, AuraNavigator auraNavigator, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$viewModel = auraSubscriptionUsageViewModel;
            this.$showDismissToast = g0u;
            this.$cancelToast = str;
            this.$errorToast = str2;
            this.$navigator = auraNavigator;
            this.$isCancelling$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$viewModel, this.$showDismissToast, this.$cancelToast, this.$errorToast, this.$navigator, this.$isCancelling$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1$ok$1 auraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1$ok$1 = new AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1$ok$1(this.$viewModel);
                    this.label = 1;
                    obj = SubscriptionSheetHelpersKt.runCatchingResult(auraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1$1$ok$1, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                this.$showDismissToast.invoke(AnonymousClass001.A1X(obj) ? this.$cancelToast : this.$errorToast);
                AuraSubscriptionPaywallBottomSheetKt.dismissSubscriptionSheets(this.$navigator);
                MutableState.A09(false, this.$isCancelling$delegate);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                MutableState.A09(false, this.$isCancelling$delegate);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$8$1(C3UX c3ux, MutableState<Boolean> mutableState, AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel, G0U<? super String, Unit> g0u, String str, String str2, AuraNavigator auraNavigator) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$isCancelling$delegate = mutableState;
        this.$viewModel = auraSubscriptionUsageViewModel;
        this.$showDismissToast = g0u;
        this.$cancelToast = str;
        this.$errorToast = str2;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$isCancelling$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$viewModel, this.$showDismissToast, this.$cancelToast, this.$errorToast, this.$navigator, this.$isCancelling$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
