package com.facebook.aura.uicontrol;

import X.AbstractC7559F3s;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class UiCommandRegistry$Companion$forTesting$1 extends AbstractC7559F3s implements Function0<Map<String, ? extends NodeCommandSpec>> {
    public final /* synthetic */ Map<String, NodeCommandSpec> $specs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiCommandRegistry$Companion$forTesting$1(Map<String, NodeCommandSpec> map) {
        super(0);
        this.$specs = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Map<String, ? extends NodeCommandSpec> invoke() {
        return this.$specs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends NodeCommandSpec> invoke() {
        return this.$specs;
    }
}
