package com.facebook.aura.bugreport;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.bugreport.AuraBugReportReviewViewEffect;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1", f = "AuraBugReportDiagnosticLogs.kt", l = {158}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $deletedMessage;
    public final /* synthetic */ String $downloadFailedMessage;
    public final /* synthetic */ String $downloadSavedMessage;
    public final /* synthetic */ String $replaceDoneMessage;
    public final /* synthetic */ String $replaceFailedMessage;
    public final /* synthetic */ String $replaceTooLargeMessage;
    public final /* synthetic */ View $view;
    public final /* synthetic */ AuraBugReportReviewViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1(AuraBugReportReviewViewModel auraBugReportReviewViewModel, String str, String str2, String str3, String str4, String str5, String str6, View view, HtJ<? super AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = auraBugReportReviewViewModel;
        this.$downloadSavedMessage = str;
        this.$downloadFailedMessage = str2;
        this.$deletedMessage = str3;
        this.$replaceDoneMessage = str4;
        this.$replaceTooLargeMessage = str5;
        this.$replaceFailedMessage = str6;
        this.$view = view;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1(this.$viewModel, this.$downloadSavedMessage, this.$downloadFailedMessage, this.$deletedMessage, this.$replaceDoneMessage, this.$replaceTooLargeMessage, this.$replaceFailedMessage, this.$view, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<AuraBugReportReviewViewEffect> c22i = this.$viewModel.viewEffects;
            final String str = this.$downloadSavedMessage;
            final String str2 = this.$downloadFailedMessage;
            final String str3 = this.$deletedMessage;
            final String str4 = this.$replaceDoneMessage;
            final String str5 = this.$replaceTooLargeMessage;
            final String str6 = this.$replaceFailedMessage;
            final View view = this.$view;
            C20Z<? super AuraBugReportReviewViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((AuraBugReportReviewViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(AuraBugReportReviewViewEffect auraBugReportReviewViewEffect, HtJ<? super Unit> htJ) {
                    String str7;
                    if (C7384Etj.areEqual(auraBugReportReviewViewEffect, AuraBugReportReviewViewEffect.DownloadSucceeded.INSTANCE)) {
                        str7 = str;
                    } else if (C7384Etj.areEqual(auraBugReportReviewViewEffect, AuraBugReportReviewViewEffect.DownloadFailed.INSTANCE)) {
                        str7 = str2;
                    } else if (C7384Etj.areEqual(auraBugReportReviewViewEffect, AuraBugReportReviewViewEffect.Deleted.INSTANCE)) {
                        str7 = str3;
                    } else if (C7384Etj.areEqual(auraBugReportReviewViewEffect, AuraBugReportReviewViewEffect.ReplaceSucceeded.INSTANCE)) {
                        str7 = str4;
                    } else if (C7384Etj.areEqual(auraBugReportReviewViewEffect, AuraBugReportReviewViewEffect.ReplaceTooLarge.INSTANCE)) {
                        str7 = str5;
                    } else if (C7384Etj.areEqual(auraBugReportReviewViewEffect, AuraBugReportReviewViewEffect.ReplaceFailed.INSTANCE)) {
                        str7 = str6;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    AnonymousClass007.A0m(view, AuraToast.Companion, str7);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
