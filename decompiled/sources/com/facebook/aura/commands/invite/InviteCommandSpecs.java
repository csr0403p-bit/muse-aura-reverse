package com.facebook.aura.commands.invite;

import X.AGH;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C60O;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes3.dex */
public final class InviteCommandSpecs {
    public static final InviteCommandSpecs INSTANCE = new InviteCommandSpecs();
    public static final NodeCommandSpec INVITE_UPSELL = new NodeCommandSpec("Opens the invite-sharing sheet so the user can invite friends and earn free additional usage.", AGH.A0E(), AnonymousClass006.A10(InviteUpsellHandlerKt.SRC_PARAM, C60O.A09(NodeArgType.STRING, "Attribution token for where the user was invited from, e.g. `out_of_credits`. Lowercase letters, digits and underscores only.")), C0881AGi.A00, null, "Whether the invite sheet was opened.", 0);

    public final NodeCommandSpec getINVITE_UPSELL() {
        return INVITE_UPSELL;
    }
}
