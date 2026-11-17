package com.facebook.aura.nodes.json;

import X.AbstractC7559F3s;
import X.C07779iq;
import X.C9hr;
import X.C9tS;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DeviceCommandCapabilityJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<Map<String, ? extends ArgSpecJson>>> {
    public static final DeviceCommandCapabilityJson$Companion$$childSerializers$2 INSTANCE = new DeviceCommandCapabilityJson$Companion$$childSerializers$2();

    public DeviceCommandCapabilityJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<Map<String, ? extends ArgSpecJson>> invoke() {
        return new C9tS(C07779iq.A01, ArgSpecJson$$serializer.INSTANCE);
    }
}
