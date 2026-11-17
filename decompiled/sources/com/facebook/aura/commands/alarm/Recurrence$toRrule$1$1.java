package com.facebook.aura.commands.alarm;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes3.dex */
public final class Recurrence$toRrule$1$1 extends AbstractC7559F3s implements G0U<Integer, CharSequence> {
    public static final Recurrence$toRrule$1$1 INSTANCE = new Recurrence$toRrule$1$1();

    public Recurrence$toRrule$1$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
        return RecurrenceKt.RRULE_WEEKDAYS[AnonymousClass001.A0F(num)];
    }

    public final CharSequence invoke(int i) {
        return RecurrenceKt.RRULE_WEEKDAYS[i];
    }
}
