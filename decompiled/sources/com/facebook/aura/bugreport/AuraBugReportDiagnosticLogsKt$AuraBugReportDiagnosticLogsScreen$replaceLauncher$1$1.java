package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$replaceLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ MutableState<String> $pendingReplaceName$delegate;
    public final /* synthetic */ AuraBugReportReviewViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        C7384Etj.A0Y(activityResult, 0);
        String strA05 = MutableState.A05(this.$pendingReplaceName$delegate);
        this.$pendingReplaceName$delegate.Af8(null);
        Intent intent = activityResult.A01;
        Uri data = intent != null ? intent.getData() : null;
        if (activityResult.A00 != -1 || data == null) {
            return;
        }
        this.$viewModel.replaceItem(strA05, data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$replaceLauncher$1$1(AuraBugReportReviewViewModel auraBugReportReviewViewModel, MutableState<String> mutableState) {
        super(1);
        this.$viewModel = auraBugReportReviewViewModel;
        this.$pendingReplaceName$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
