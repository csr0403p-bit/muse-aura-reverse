package com.facebook.aura.feedback.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.feedback.FeedbackReason;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedbackReasonMenuKt$FeedbackReasonMenu$1$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ G0V<FeedbackReason, String, Unit> $onReason;
    public final /* synthetic */ Function0<Unit> $onWriteSomething;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        FeedbackReason feedbackReasonReasonForMenuId = FeedbackReasonMenuKt.reasonForMenuId(i);
        if (feedbackReasonReasonForMenuId != null) {
            this.$onReason.invoke(feedbackReasonReasonForMenuId, auraContextMenuItem.label);
        } else if (i == 6) {
            this.$onWriteSomething.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackReasonMenuKt$FeedbackReasonMenu$1$1$1(Function0<Unit> function0, G0V<? super FeedbackReason, ? super String, Unit> g0v, Function0<Unit> function02) {
        super(1);
        this.$onDismiss = function0;
        this.$onReason = g0v;
        this.$onWriteSomething = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
