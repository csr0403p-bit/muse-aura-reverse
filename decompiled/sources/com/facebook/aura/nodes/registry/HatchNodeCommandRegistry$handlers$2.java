package com.facebook.aura.nodes.registry;

import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.nodes.api.HatchClientCapabilities;
import com.facebook.aura.nodes.core.NodeCommandId;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchNodeCommandRegistry$handlers$2 extends AbstractC7559F3s implements Function0<Map<NodeCommandId, HatchNodeCommandHandler>> {
    public static final HatchNodeCommandRegistry$handlers$2 INSTANCE = new HatchNodeCommandRegistry$handlers$2();

    public HatchNodeCommandRegistry$handlers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<NodeCommandId, HatchNodeCommandHandler> invoke() {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        int[] iArrA0p = AnonymousClass801.A0p();
        int i = 0;
        do {
            int i2 = iArrA0p[i];
            NodeCommandId nodeCommandIdA05 = AnonymousClass801.A05(i2);
            C7384Etj.A0U(nodeCommandIdA05);
            if (HatchClientCapabilities.INSTANCE.supportsDeviceCommand(nodeCommandIdA05)) {
                linkedHashMapA0j.put(nodeCommandIdA05, AnonymousClass801.A08(i2));
            }
            i++;
        } while (i < 47);
        return linkedHashMapA0j;
    }
}
