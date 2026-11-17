package com.facebook.aura.bugreport;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$replaceItem$3$pickedName$1", f = "AuraBugReportReviewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraBugReportReviewViewModel$replaceItem$3$pickedName$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ Uri $source;
    public int label;
    public final /* synthetic */ AuraBugReportReviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportReviewViewModel$replaceItem$3$pickedName$1(AuraBugReportReviewViewModel auraBugReportReviewViewModel, Uri uri, HtJ<? super AuraBugReportReviewViewModel$replaceItem$3$pickedName$1> htJ) {
        super(2, htJ);
        this.this$0 = auraBugReportReviewViewModel;
        this.$source = uri;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBugReportReviewViewModel$replaceItem$3$pickedName$1(this.this$0, this.$source, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AuraBugReportReviewViewModelKt.queryContentDisplayName(this.this$0.appContext, this.$source);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((AuraBugReportReviewViewModel$replaceItem$3$pickedName$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
