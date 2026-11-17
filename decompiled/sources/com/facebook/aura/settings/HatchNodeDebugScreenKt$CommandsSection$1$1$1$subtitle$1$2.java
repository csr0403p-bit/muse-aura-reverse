package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.nodes.core.NodeArgSpec;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchNodeDebugScreenKt$CommandsSection$1$1$1$subtitle$1$2 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends NodeArgSpec>, CharSequence> {
    public static final HatchNodeDebugScreenKt$CommandsSection$1$1$1$subtitle$1$2 INSTANCE = new HatchNodeDebugScreenKt$CommandsSection$1$1$1$subtitle$1$2();

    public HatchNodeDebugScreenKt$CommandsSection$1$1$1$subtitle$1$2() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, NodeArgSpec> entry) {
        C7384Etj.A0Y(entry, 0);
        String key = entry.getKey();
        String jsonValue = entry.getValue().type.getJsonValue();
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((Object) key);
        return C3cJ.A0N(" (", jsonValue, sbA0w);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends NodeArgSpec> entry) {
        return invoke2((Map.Entry<String, NodeArgSpec>) entry);
    }
}
