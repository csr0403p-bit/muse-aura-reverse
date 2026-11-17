package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonTransportFactory$vmJwtHttpClient$2 extends AbstractC7559F3s implements Function0<HatchHttpClient> {
    public static final TigonTransportFactory$vmJwtHttpClient$2 INSTANCE = new TigonTransportFactory$vmJwtHttpClient$2();

    public TigonTransportFactory$vmJwtHttpClient$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchHttpClient invoke() {
        return TigonTransportFactory.INSTANCE.reportingClient(HatchAuthScheme.VM_JWT);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ HatchHttpClient invoke() {
        return TigonTransportFactory.INSTANCE.reportingClient(HatchAuthScheme.VM_JWT);
    }
}
