package com.facebook.aura.settings.support;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.bugreport.AuraBugReportReviewViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$2$1", f = "HatchContactSupportScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$HatchContactSupportScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraBugReportReviewViewModel $diagnosticsReviewViewModel;
    public final /* synthetic */ HatchContactSupportViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchContactSupportScreenKt$HatchContactSupportScreen$2$1(HatchContactSupportViewModel hatchContactSupportViewModel, AuraBugReportReviewViewModel auraBugReportReviewViewModel, HtJ<? super HatchContactSupportScreenKt$HatchContactSupportScreen$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchContactSupportViewModel;
        this.$diagnosticsReviewViewModel = auraBugReportReviewViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchContactSupportScreenKt$HatchContactSupportScreen$2$1(this.$viewModel, this.$diagnosticsReviewViewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchContactSupportViewModel hatchContactSupportViewModel = this.$viewModel;
        final AuraBugReportReviewViewModel auraBugReportReviewViewModel = this.$diagnosticsReviewViewModel;
        hatchContactSupportViewModel.addCloseable(new AutoCloseable() { // from class: com.facebook.aura.settings.support.HatchContactSupportScreenKt$HatchContactSupportScreen$2$1.1
            @Override // java.lang.AutoCloseable
            public final void close() {
                auraBugReportReviewViewModel.onFlowDismissed();
            }
        });
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchContactSupportScreenKt$HatchContactSupportScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
