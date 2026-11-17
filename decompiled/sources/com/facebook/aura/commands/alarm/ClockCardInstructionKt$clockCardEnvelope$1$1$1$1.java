package com.facebook.aura.commands.alarm;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ClockCardInstructionKt$clockCardEnvelope$1$1$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ ClockCardAlarm $alarm;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        Integer num = this.$alarm.hour;
        if (num != null) {
            C7qW.A05(num, "hour", c2nw);
        }
        Integer num2 = this.$alarm.minute;
        if (num2 != null) {
            C7qW.A05(num2, "minute", c2nw);
        }
        String str = this.$alarm.label;
        if (str == null || str.length() <= 0) {
            return;
        }
        C7qW.A06("label", str, c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockCardInstructionKt$clockCardEnvelope$1$1$1$1(ClockCardAlarm clockCardAlarm) {
        super(1);
        this.$alarm = clockCardAlarm;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
