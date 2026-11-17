package com.facebook.aura.subscription.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$onConfirmResubscribe$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $changedToast;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $errorToast;
    public final /* synthetic */ MutableState<Boolean> $isResubscribing$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;
    public final /* synthetic */ AuraSubscriptionUsageViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$onConfirmResubscribe$1$1$1", f = "AuraSubscriptionUsageBottomSheet.kt", l = {132}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$onConfirmResubscribe$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $changedToast;
        public final /* synthetic */ String $errorToast;
        public final /* synthetic */ MutableState<Boolean> $isResubscribing$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<String, Unit> $showDismissToast;
        public final /* synthetic */ AuraSubscriptionUsageViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel, G0U<? super String, Unit> g0u, String str, AuraNavigator auraNavigator, String str2, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$viewModel = auraSubscriptionUsageViewModel;
            this.$showDismissToast = g0u;
            this.$changedToast = str;
            this.$navigator = auraNavigator;
            this.$errorToast = str2;
            this.$isResubscribing$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$viewModel, this.$showDismissToast, this.$changedToast, this.$navigator, this.$errorToast, this.$isResubscribing$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel = this.$viewModel;
                    this.label = 1;
                    obj = auraSubscriptionUsageViewModel.resumeSubscription(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                AuraSubscriptionUsageViewModel.ResumeOutcome resumeOutcome = (AuraSubscriptionUsageViewModel.ResumeOutcome) obj;
                if (C7384Etj.areEqual(resumeOutcome, AuraSubscriptionUsageViewModel.ResumeOutcome.Reactivated.INSTANCE)) {
                    this.$showDismissToast.invoke(this.$changedToast);
                    AuraSubscriptionPaywallBottomSheetKt.dismissSubscriptionSheets(this.$navigator);
                } else {
                    if (!C7384Etj.areEqual(resumeOutcome, AuraSubscriptionUsageViewModel.ResumeOutcome.Failed.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$showDismissToast.invoke(this.$errorToast);
                }
                MutableState.A09(false, this.$isResubscribing$delegate);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                MutableState.A09(false, this.$isResubscribing$delegate);
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
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$onConfirmResubscribe$1$1(C3UX c3ux, MutableState<Boolean> mutableState, AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel, G0U<? super String, Unit> g0u, String str, AuraNavigator auraNavigator, String str2) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$isResubscribing$delegate = mutableState;
        this.$viewModel = auraSubscriptionUsageViewModel;
        this.$showDismissToast = g0u;
        this.$changedToast = str;
        this.$navigator = auraNavigator;
        this.$errorToast = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$isResubscribing$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$viewModel, this.$showDismissToast, this.$changedToast, this.$navigator, this.$errorToast, this.$isResubscribing$delegate, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
