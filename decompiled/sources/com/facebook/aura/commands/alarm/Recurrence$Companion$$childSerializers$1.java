package com.facebook.aura.commands.alarm;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class Recurrence$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<RecurrenceFrequency>> {
    public static final Recurrence$Companion$$childSerializers$1 INSTANCE = new Recurrence$Companion$$childSerializers$1();

    public Recurrence$Companion$$childSerializers$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<RecurrenceFrequency> invoke() {
        return AnonymousClass001.A12(RecurrenceFrequency.$cachedSerializer$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<RecurrenceFrequency> invoke() {
        return AnonymousClass001.A12(RecurrenceFrequency.$cachedSerializer$delegate);
    }
}
