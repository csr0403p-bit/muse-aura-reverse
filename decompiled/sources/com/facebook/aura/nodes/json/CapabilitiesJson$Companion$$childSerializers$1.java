package com.facebook.aura.nodes.json;

import X.AbstractC7559F3s;
import X.C07779iq;
import X.C9hr;
import X.C9tS;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CapabilitiesJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<Map<String, ? extends DataSourceCapabilityJson>>> {
    public static final CapabilitiesJson$Companion$$childSerializers$1 INSTANCE = new CapabilitiesJson$Companion$$childSerializers$1();

    public CapabilitiesJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<Map<String, ? extends DataSourceCapabilityJson>> invoke() {
        return new C9tS(C07779iq.A01, DataSourceCapabilityJson$$serializer.INSTANCE);
    }
}
