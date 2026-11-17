package com.facebook.aura.commands.alarm;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ReminderCardInstructionKt$reminderCardEnvelope$1$1$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ ReminderCardItemInput $reminder;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        String str = this.$reminder.label;
        if (str != null && str.length() > 0) {
            C7qW.A06("label", str, c2nw);
        }
        Integer num = this.$reminder.hour;
        if (num != null) {
            C7qW.A05(num, "hour", c2nw);
        }
        Integer num2 = this.$reminder.minute;
        if (num2 != null) {
            C7qW.A05(num2, "minute", c2nw);
        }
        Long l = this.$reminder.triggerTimeMs;
        if (l != null) {
            C7qW.A05(l, "trigger_time_ms", c2nw);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReminderCardInstructionKt$reminderCardEnvelope$1$1$1$1(ReminderCardItemInput reminderCardItemInput) {
        super(1);
        this.$reminder = reminderCardItemInput;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
