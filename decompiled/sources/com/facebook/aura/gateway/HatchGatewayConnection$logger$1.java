package com.facebook.aura.gateway;

import X.C7438Evz;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchGatewayConnection$logger$1 extends C7438Evz implements Function0<List<? extends String>> {
    public HatchGatewayConnection$logger$1(Object obj) {
        super(0, obj, HatchGatewayConnection.class, "activeConnectionHolds", "activeConnectionHolds()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return ((HatchGatewayConnection) this.receiver).activeConnectionHolds();
    }
}
