package com.facebook.aura.nodes.datasource;

import X.AbstractC7559F3s;
import X.C07779iq;
import X.C9hr;
import X.C9tS;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* loaded from: classes2.dex */
public final class NodeSyncBaselineJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<Map<String, ? extends JsonObject>>> {
    public static final NodeSyncBaselineJson$Companion$$childSerializers$2 INSTANCE = new NodeSyncBaselineJson$Companion$$childSerializers$2();

    public NodeSyncBaselineJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<Map<String, ? extends JsonObject>> invoke() {
        return new C9tS(C07779iq.A01, JsonObjectSerializer.A01);
    }
}
