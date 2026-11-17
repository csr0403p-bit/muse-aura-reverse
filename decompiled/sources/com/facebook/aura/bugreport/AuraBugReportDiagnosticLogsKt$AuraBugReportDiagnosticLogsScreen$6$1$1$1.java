package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.bugreport.AuraVmLogFetchState;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ G0U<AuraBugReportCollector.CollectedItem, Unit> $openReplacePicker;
    public final /* synthetic */ C1BO<AuraBugReportReviewUiState> $state$delegate;
    public final /* synthetic */ AuraBugReportReviewViewModel $viewModel;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $file;
        public final /* synthetic */ G0U<AuraBugReportCollector.CollectedItem, Unit> $openReplacePicker;
        public final /* synthetic */ C1BO<AuraBugReportReviewUiState> $state$delegate;
        public final /* synthetic */ AuraBugReportReviewViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraBugReportCollector.CollectedItem collectedItem, AuraBugReportReviewViewModel auraBugReportReviewViewModel, G0U<? super AuraBugReportCollector.CollectedItem, Unit> g0u, C1BO<AuraBugReportReviewUiState> c1bo) {
            super(3);
            this.$file = collectedItem;
            this.$viewModel = auraBugReportReviewViewModel;
            this.$openReplacePicker = g0u;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraBugReportCollector.CollectedItem collectedItem = this.$file;
                boolean zA1Y = AnonymousClass002.A1Y(this.$state$delegate.getValue().busyItem);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$file, bfm.A67(this.$viewModel));
                AuraBugReportReviewViewModel auraBugReportReviewViewModel = this.$viewModel;
                AuraBugReportCollector.CollectedItem collectedItem2 = this.$file;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$1$1(auraBugReportReviewViewModel, collectedItem2);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$file, bfm.A67(this.$viewModel));
                AuraBugReportReviewViewModel auraBugReportReviewViewModel2 = this.$viewModel;
                AuraBugReportCollector.CollectedItem collectedItem3 = this.$file;
                Object objAaT2 = bfm.AaT();
                if (zA1T2 || objAaT2 == C78N.A00) {
                    objAaT2 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$2$1(auraBugReportReviewViewModel2, collectedItem3);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) objAaT2;
                boolean zA1T3 = AnonymousClass001.A1T(bfm, this.$file, bfm.A67(this.$viewModel));
                AuraBugReportReviewViewModel auraBugReportReviewViewModel3 = this.$viewModel;
                AuraBugReportCollector.CollectedItem collectedItem4 = this.$file;
                Object objAaT3 = bfm.AaT();
                if (zA1T3 || objAaT3 == C78N.A00) {
                    objAaT3 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$3$1(auraBugReportReviewViewModel3, collectedItem4);
                    bfm.Ai0(objAaT3);
                }
                Function0 function03 = (Function0) objAaT3;
                boolean zA1T4 = AnonymousClass001.A1T(bfm, this.$file, bfm.A65(this.$openReplacePicker));
                G0U<AuraBugReportCollector.CollectedItem, Unit> g0u = this.$openReplacePicker;
                AuraBugReportCollector.CollectedItem collectedItem5 = this.$file;
                Object objAaT4 = bfm.AaT();
                if (zA1T4 || objAaT4 == C78N.A00) {
                    objAaT4 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$4$1(g0u, collectedItem5);
                    bfm.Ai0(objAaT4);
                }
                AuraBugReportDiagnosticLogsKt.DiagnosticFileRow(collectedItem, zA1Y, function0, function02, function03, (Function0) objAaT4, null, bfm, AuraBugReportCollector.CollectedItem.$stable, 64);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraVmLogFetchState $fetch;
        public final /* synthetic */ AuraBugReportReviewViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraVmLogFetchState auraVmLogFetchState, AuraBugReportReviewViewModel auraBugReportReviewViewModel) {
            super(3);
            this.$fetch = auraVmLogFetchState;
            this.$viewModel = auraBugReportReviewViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            InterfaceC7353EnQ interfaceC7353EnQ;
            int iA1P;
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraVmLogFetchState.Unavailable unavailable = (AuraVmLogFetchState.Unavailable) this.$fetch;
                Integer numValueOf = Integer.valueOf(unavailable.messageRes);
                if (unavailable.retryable) {
                    bfm.AgE(-77533703);
                    AuraBugReportReviewViewModel auraBugReportReviewViewModel = this.$viewModel;
                    boolean zA67 = bfm.A67(auraBugReportReviewViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$2$1$1(auraBugReportReviewViewModel);
                        bfm.Ai0(objAaT);
                    }
                    interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT;
                    iA1P = AnonymousClass001.A1V(bfm);
                } else {
                    interfaceC7353EnQ = null;
                    iA1P = AnonymousClass004.A1P(bfm, -77506486);
                }
                AuraBugReportDiagnosticLogsKt.ServerLogRow(numValueOf, null, (Function0) interfaceC7353EnQ, bfm, iA1P, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0wA01;
        C7384Etj.A0Y(hatchSectionScope, 0);
        Iterator it = this.$state$delegate.getValue().items.iterator();
        while (it.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1((AuraBugReportCollector.CollectedItem) it.next(), this.$viewModel, this.$openReplacePicker, this.$state$delegate), 219127570);
        }
        AuraVmLogFetchState auraVmLogFetchState = this.$state$delegate.getValue().vmLogFetch;
        if (auraVmLogFetchState instanceof AuraVmLogFetchState.Fetching) {
            g0wA01 = ComposableSingletons$AuraBugReportDiagnosticLogsKt.f12lambda$761918788;
        } else {
            if (!(auraVmLogFetchState instanceof AuraVmLogFetchState.Unavailable)) {
                if (!C7384Etj.areEqual(auraVmLogFetchState, AuraVmLogFetchState.Idle.INSTANCE) && !C7384Etj.areEqual(auraVmLogFetchState, AuraVmLogFetchState.Loaded.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            g0wA01 = B1V.A01(new AnonymousClass2(auraVmLogFetchState, this.$viewModel), -974014861, true);
        }
        hatchSectionScope.item(g0wA01);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1(C1BO<AuraBugReportReviewUiState> c1bo, AuraBugReportReviewViewModel auraBugReportReviewViewModel, G0U<? super AuraBugReportCollector.CollectedItem, Unit> g0u) {
        super(1);
        this.$state$delegate = c1bo;
        this.$viewModel = auraBugReportReviewViewModel;
        this.$openReplacePicker = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
