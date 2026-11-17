package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.C7438Evz;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchGatewayEventsHandler$chatHandler$1 extends C7438Evz implements G0W<String, String, String, Unit> {
    public HatchGatewayEventsHandler$chatHandler$1(Object obj) {
        super(3, obj, HatchGatewayEventsHandler.class, "sendToGateway", "sendToGateway(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        ((HatchGatewayEventsHandler) this.receiver).sendToGateway(str, str2, str3);
    }
}
