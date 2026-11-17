package com.facebook.aura.bugreport;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$openPreview$3$lines$1", f = "AuraBugReportReviewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraBugReportReviewViewModel$openPreview$3$lines$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends LogLine>>, Object> {
    public final /* synthetic */ AuraBugReportCollector.CollectedItem $item;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportReviewViewModel$openPreview$3$lines$1(AuraBugReportCollector.CollectedItem collectedItem, HtJ<? super AuraBugReportReviewViewModel$openPreview$3$lines$1> htJ) {
        super(2, htJ);
        this.$item = collectedItem;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBugReportReviewViewModel$openPreview$3$lines$1(this.$item, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends LogLine>> htJ) {
        return invoke2(c3ux, (HtJ<? super List<LogLine>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AuraBugReportCollector.INSTANCE.readLines(this.$item.file, 50000, 20000);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super List<LogLine>> htJ) {
        return new AuraBugReportReviewViewModel$openPreview$3$lines$1(this.$item, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
