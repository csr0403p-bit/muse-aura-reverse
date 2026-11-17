package com.facebook.aura.network.acs;

import X.AbstractC7559F3s;
import X.C07779iq;
import X.C9hr;
import X.C9tS;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AcsServiceConfigJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<Map<String, ? extends KeyConfigDetailsJson>>> {
    public static final AcsServiceConfigJson$Companion$$childSerializers$1 INSTANCE = new AcsServiceConfigJson$Companion$$childSerializers$1();

    public AcsServiceConfigJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<Map<String, ? extends KeyConfigDetailsJson>> invoke() {
        return new C9tS(C07779iq.A01, KeyConfigDetailsJson$$serializer.INSTANCE);
    }
}
