package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.repo.ActivityDataSource;
import com.facebook.aura.status.repo.ActivityDetailResponse;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.ActivityDetailBottomSheetKt$ActivityDetailContent$1$1", f = "ActivityDetailBottomSheet.kt", l = {136}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ActivityDetailBottomSheetKt$ActivityDetailContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ActivityAction $action;
    public final /* synthetic */ MutableState<ActivityDetailResponse> $activityDetail$delegate;
    public final /* synthetic */ String $commitSha;
    public final /* synthetic */ MutableState<String> $detailError$delegate;
    public final /* synthetic */ String $errorMessage;
    public final /* synthetic */ MutableState<Boolean> $isLoadingDetail$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetailBottomSheetKt$ActivityDetailContent$1$1(ActivityAction activityAction, String str, AbstractC3358CGz abstractC3358CGz, String str2, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<ActivityDetailResponse> mutableState3, HtJ<? super ActivityDetailBottomSheetKt$ActivityDetailContent$1$1> htJ) {
        super(2, htJ);
        this.$action = activityAction;
        this.$commitSha = str;
        this.$userSession = abstractC3358CGz;
        this.$errorMessage = str2;
        this.$isLoadingDetail$delegate = mutableState;
        this.$detailError$delegate = mutableState2;
        this.$activityDetail$delegate = mutableState3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ActivityDetailBottomSheetKt$ActivityDetailContent$1$1(this.$action, this.$commitSha, this.$userSession, this.$errorMessage, this.$isLoadingDetail$delegate, this.$detailError$delegate, this.$activityDetail$delegate, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$action.details == null && (str = this.$commitSha) != null && !C7BY.A0j(str)) {
                MutableState.A09(true, this.$isLoadingDetail$delegate);
                this.$detailError$delegate.Af8(null);
                ActivityDataSource companion = ActivityDataSource.Companion.getInstance(this.$userSession);
                String str2 = this.$commitSha;
                this.L$0 = null;
                this.label = 1;
                obj = companion.loadActivityDetail(str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (obj != null) {
            this.$activityDetail$delegate.Af8(obj);
        } else {
            this.$detailError$delegate.Af8(this.$errorMessage);
        }
        MutableState.A09(false, this.$isLoadingDetail$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ActivityDetailBottomSheetKt$ActivityDetailContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
