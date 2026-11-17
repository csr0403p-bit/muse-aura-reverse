package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Intent;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchClockCardKt$launchDismiss$2$1 extends AbstractC7559F3s implements G0U<Intent, Unit> {
    public final /* synthetic */ ClockAlarm $alarm;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        intent.putExtra("android.intent.extra.alarm.SEARCH_MODE", "android.time");
        intent.putExtra("android.intent.extra.alarm.HOUR", this.$alarm.hour.intValue());
        intent.putExtra("android.intent.extra.alarm.MINUTES", this.$alarm.minute.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchClockCardKt$launchDismiss$2$1(ClockAlarm clockAlarm) {
        super(1);
        this.$alarm = clockAlarm;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.INSTANCE;
    }
}
