package com.facebook.aura.settings;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BO6;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchNodeDebugScreenKt$CommandsSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ BO6<NodeCommandId, NodeCommandSpec> $commands;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        if (this.$commands.isEmpty()) {
            hatchSectionScope.item(ComposableSingletons$HatchNodeDebugScreenKt.f238lambda$1309604064);
            return;
        }
        Iterator itA0n = AnonymousClass002.A0n(this.$commands);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            NodeCommandId nodeCommandId = (NodeCommandId) entry.getKey();
            NodeCommandSpec nodeCommandSpec = (NodeCommandSpec) entry.getValue();
            StringBuilder sb = new StringBuilder();
            String str = nodeCommandSpec.description;
            if (str != null) {
                sb.append(str);
            }
            if (!nodeCommandSpec.required.isEmpty()) {
                sb.append("\nRequired: ");
                sb.append(AbstractC0878AGe.A0L(", ", "", "", nodeCommandSpec.required.entrySet(), HatchNodeDebugScreenKt$CommandsSection$1$1$1$subtitle$1$1.INSTANCE));
            }
            if (!nodeCommandSpec.optional.isEmpty()) {
                sb.append("\nOptional: ");
                sb.append(AbstractC0878AGe.A0L(", ", "", "", nodeCommandSpec.optional.entrySet(), HatchNodeDebugScreenKt$CommandsSection$1$1$1$subtitle$1$2.INSTANCE));
            }
            AnonymousClass006.A1E(hatchSectionScope, new HatchNodeDebugScreenKt$CommandsSection$1$1$1$1(sb.toString(), nodeCommandId), -657000060);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeDebugScreenKt$CommandsSection$1$1(BO6<NodeCommandId, NodeCommandSpec> bo6) {
        super(1);
        this.$commands = bo6;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
