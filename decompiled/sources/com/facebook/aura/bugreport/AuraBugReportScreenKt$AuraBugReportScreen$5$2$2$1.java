package com.facebook.aura.bugreport;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.BRg;
import X.C0881AGi;
import X.C1BO;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import X.HoC;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.bugreport.AuraBugReportSender;
import com.facebook.aura.devices.intf.DeviceBugReportRequest;
import com.facebook.aura.devices.intf.DeviceBugReportReviewSession;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<String> $description$delegate;
    public final /* synthetic */ List<DeviceBugReportReviewSession> $deviceBugReportSessions;
    public final /* synthetic */ String $endpoint;
    public final /* synthetic */ MutableState<List<Uri>> $imageUris$delegate;
    public final /* synthetic */ boolean $includeLogs;
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ C1BO<AuraBugReportReviewUiState> $reviewState$delegate;
    public final /* synthetic */ AuraBugReportReviewViewModel $reviewViewModel;
    public final /* synthetic */ AuraBugCategory $selectedCategory;
    public final /* synthetic */ String $submissionId;
    public final /* synthetic */ MutableState<Boolean> $submitted$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$2$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<String> $description$delegate;
        public final /* synthetic */ List<DeviceBugReportReviewSession> $deviceBugReportSessions;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ MutableState<List<Uri>> $imageUris$delegate;
        public final /* synthetic */ boolean $includeLogs;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ AuraBugReportReviewViewModel $reviewViewModel;
        public final /* synthetic */ AuraBugCategory $selectedCategory;
        public final /* synthetic */ String $submissionId;
        public final /* synthetic */ MutableState<Boolean> $submitted$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraBugReportReviewViewModel auraBugReportReviewViewModel, AbstractC3358CGz abstractC3358CGz, Context context, String str, String str2, boolean z, AuraBugCategory auraBugCategory, List<? extends DeviceBugReportReviewSession> list, Function0<Unit> function0, MutableState<String> mutableState, MutableState<List<Uri>> mutableState2, MutableState<Boolean> mutableState3) {
            super(0);
            this.$reviewViewModel = auraBugReportReviewViewModel;
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$submissionId = str;
            this.$endpoint = str2;
            this.$includeLogs = z;
            this.$selectedCategory = auraBugCategory;
            this.$deviceBugReportSessions = list;
            this.$onBack = function0;
            this.$description$delegate = mutableState;
            this.$imageUris$delegate = mutableState2;
            this.$submitted$delegate = mutableState3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [X.AGi] */
        /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.aura.bugreport.AuraBugReportSender] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String str;
            ?? arrayList;
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, HatchComponent.BUG_REPORT_SUBMIT_BUTTON, null, null, null);
            List<HoC> listOnSubmitted = this.$reviewViewModel.onSubmitted();
            ?? r3 = AuraBugReportSender.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Context context = this.$context;
            String str2 = this.$submissionId;
            MutableState<String> mutableState = this.$description$delegate;
            float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
            String strA05 = MutableState.A05(mutableState);
            List<Uri> value = this.$imageUris$delegate.getValue();
            String str3 = this.$endpoint;
            boolean zIsConfidentialOrUnclassified = this.$reviewViewModel.isConfidentialOrUnclassified();
            List<AuraBugReportCollector.CollectedItem> listCollectedItemsForSend = this.$includeLogs ? this.$reviewViewModel.collectedItemsForSend() : C0881AGi.A00;
            AuraBugCategory auraBugCategory = this.$selectedCategory;
            String string = null;
            if (auraBugCategory != null) {
                str = auraBugCategory.id;
                string = this.$context.getString(auraBugCategory.titleRes);
            } else {
                str = null;
            }
            if (this.$includeLogs) {
                List<DeviceBugReportReviewSession> list = this.$deviceBugReportSessions;
                arrayList = new ArrayList();
                Iterator<DeviceBugReportReviewSession> it = list.iterator();
                while (it.hasNext()) {
                    DeviceBugReportRequest deviceBugReportRequestRequestForSubmission = it.next().requestForSubmission();
                    if (deviceBugReportRequestRequestForSubmission != null) {
                        arrayList.add(deviceBugReportRequestRequestForSubmission);
                    }
                }
            } else {
                arrayList = C0881AGi.A00;
            }
            r3.send(abstractC3358CGz, context, str2, strA05, value, str3, zIsConfidentialOrUnclassified, listCollectedItemsForSend, str, string, arrayList, this.$includeLogs, listOnSubmitted, true, false, null, AuraBugReportSender.C110091.INSTANCE, AuraBugReportSender.AnonymousClass2.INSTANCE, AuraBugReportSender.AnonymousClass3.INSTANCE);
            MutableState.A09(true, this.$submitted$delegate);
            Context context2 = this.$context;
            Toast.makeText(context2, context2.getString(R.string._name_removed__res_0x7f120202), 0).show();
            this.$onBack.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        BusyItem busyItem;
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        MutableState<Boolean> mutableState = this.$submitted$delegate;
        float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
        boolean zA0A = MutableState.A0A((MutableState) mutableState);
        Context context = this.$context;
        int i = R.string._name_removed__res_0x7f120200;
        if (zA0A) {
            i = R.string._name_removed__res_0x7f120201;
        }
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(context.getString(i), null, null, (C7BY.A0j(MutableState.A05(this.$description$delegate)) || MutableState.A0A((MutableState) this.$submitted$delegate) || (this.$includeLogs && (this.$reviewState$delegate.getValue().isCollecting || ((busyItem = this.$reviewState$delegate.getValue().busyItem) != null && busyItem.blocksSubmit)))) ? false : true, false, "bug_report_submit", new AnonymousClass1(this.$reviewViewModel, this.$userSession, this.$context, this.$submissionId, this.$endpoint, this.$includeLogs, this.$selectedCategory, this.$deviceBugReportSessions, this.$onBack, this.$description$delegate, this.$imageUris$delegate, this.$submitted$delegate), null, BRg.A00, AuraHaptics.SUCCESS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$2$1(Context context, boolean z, MutableState<Boolean> mutableState, MutableState<String> mutableState2, C1BO<AuraBugReportReviewUiState> c1bo, AuraBugReportReviewViewModel auraBugReportReviewViewModel, AbstractC3358CGz abstractC3358CGz, String str, String str2, AuraBugCategory auraBugCategory, List<? extends DeviceBugReportReviewSession> list, Function0<Unit> function0, MutableState<List<Uri>> mutableState3) {
        super(1);
        this.$context = context;
        this.$includeLogs = z;
        this.$submitted$delegate = mutableState;
        this.$description$delegate = mutableState2;
        this.$reviewState$delegate = c1bo;
        this.$reviewViewModel = auraBugReportReviewViewModel;
        this.$userSession = abstractC3358CGz;
        this.$submissionId = str;
        this.$endpoint = str2;
        this.$selectedCategory = auraBugCategory;
        this.$deviceBugReportSessions = list;
        this.$onBack = function0;
        this.$imageUris$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
