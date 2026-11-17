package com.facebook.aura.model;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightRowData$Companion$$childSerializers$3 extends AbstractC7559F3s implements Function0<C9hr<FareCondition>> {
    public static final FlightRowData$Companion$$childSerializers$3 INSTANCE = new FlightRowData$Companion$$childSerializers$3();

    public FlightRowData$Companion$$childSerializers$3() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<FareCondition> invoke() {
        return AnonymousClass001.A12(FareCondition.$cachedSerializer$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<FareCondition> invoke() {
        return AnonymousClass001.A12(FareCondition.$cachedSerializer$delegate);
    }
}
