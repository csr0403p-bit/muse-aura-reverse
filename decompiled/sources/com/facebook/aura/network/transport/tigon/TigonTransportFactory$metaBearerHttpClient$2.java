package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonTransportFactory$metaBearerHttpClient$2 extends AbstractC7559F3s implements Function0<HatchHttpClient> {
    public static final TigonTransportFactory$metaBearerHttpClient$2 INSTANCE = new TigonTransportFactory$metaBearerHttpClient$2();

    public TigonTransportFactory$metaBearerHttpClient$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchHttpClient invoke() {
        return TigonTransportFactory.INSTANCE.reportingClient(HatchAuthScheme.META_BEARER);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ HatchHttpClient invoke() {
        return TigonTransportFactory.INSTANCE.reportingClient(HatchAuthScheme.META_BEARER);
    }
}
