package com.facebook.aura.activation.view;

import X.C7438Evz;
import com.facebook.aura.activation.model.InviteTooltipViewModel;
import com.facebook.aura.json.ClockCardWireActionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$dismiss$1$1 extends C7438Evz implements Function0<Unit> {
    public HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$dismiss$1$1(Object obj) {
        super(0, obj, InviteTooltipViewModel.class, ClockCardWireActionsKt.CLOCK_ACTION_DISMISS, "dismiss()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InviteTooltipViewModel) this.receiver).dismiss();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
