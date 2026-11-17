package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.bugreport.AuraBugReportReviewViewModel;
import com.facebook.aura.settings.support.HatchContactSupportViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$HatchContactSupportScreen$submit$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraBugReportReviewViewModel $diagnosticsReviewViewModel;
    public final /* synthetic */ boolean $diagnosticsSubmitBlocked;
    public final /* synthetic */ MutableState<Boolean> $includeLogs$delegate;
    public final /* synthetic */ C1BO<HatchContactSupportViewModel.UiState> $uiState$delegate;
    public final /* synthetic */ HatchContactSupportViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$submit$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraBugReportReviewViewModel $diagnosticsReviewViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraBugReportReviewViewModel auraBugReportReviewViewModel) {
            super(0);
            this.$diagnosticsReviewViewModel = auraBugReportReviewViewModel;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraBugReportReviewViewModel auraBugReportReviewViewModel = this.$diagnosticsReviewViewModel;
            if (auraBugReportReviewViewModel != null) {
                auraBugReportReviewViewModel.onSubmitted();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$submit$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraBugReportReviewViewModel $diagnosticsReviewViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraBugReportReviewViewModel auraBugReportReviewViewModel) {
            super(0);
            this.$diagnosticsReviewViewModel = auraBugReportReviewViewModel;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraBugReportReviewViewModel auraBugReportReviewViewModel = this.$diagnosticsReviewViewModel;
            if (auraBugReportReviewViewModel != null) {
                auraBugReportReviewViewModel.onFlowDismissed();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchContactSupportScreenKt$HatchContactSupportScreen$submit$1$1(boolean z, AuraBugReportReviewViewModel auraBugReportReviewViewModel, HatchContactSupportViewModel hatchContactSupportViewModel, C1BO<HatchContactSupportViewModel.UiState> c1bo, MutableState<Boolean> mutableState) {
        super(0);
        this.$diagnosticsSubmitBlocked = z;
        this.$diagnosticsReviewViewModel = auraBugReportReviewViewModel;
        this.$viewModel = hatchContactSupportViewModel;
        this.$uiState$delegate = c1bo;
        this.$includeLogs$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraBugReportReviewViewModel auraBugReportReviewViewModel;
        if (this.$diagnosticsSubmitBlocked) {
            return;
        }
        List<AuraBugReportCollector.CollectedItem> listCollectedItemsForSend = null;
        if (this.$uiState$delegate.getValue().showConfidentialDisclosure && MutableState.A0A((MutableState) this.$includeLogs$delegate) && (auraBugReportReviewViewModel = this.$diagnosticsReviewViewModel) != null) {
            listCollectedItemsForSend = auraBugReportReviewViewModel.collectedItemsForSend();
        }
        HatchContactSupportViewModel hatchContactSupportViewModel = this.$viewModel;
        AuraBugReportReviewViewModel auraBugReportReviewViewModel2 = this.$diagnosticsReviewViewModel;
        hatchContactSupportViewModel.onSubmit(listCollectedItemsForSend, new AnonymousClass1(auraBugReportReviewViewModel2), new AnonymousClass2(auraBugReportReviewViewModel2));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
