package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightBookingSectionsKt$FlightBookingItinerarySection$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onChange;
    public final /* synthetic */ String $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightBookingSectionsKt$FlightBookingItinerarySection$1$1$1$1$1$1(G0U<? super String, Unit> g0u, String str) {
        super(0);
        this.$onChange = g0u;
        this.$target = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onChange.invoke(this.$target);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
