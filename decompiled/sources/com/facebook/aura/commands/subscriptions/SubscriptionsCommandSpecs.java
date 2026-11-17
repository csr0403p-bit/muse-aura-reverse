package com.facebook.aura.commands.subscriptions;

import X.AGH;
import X.C0881AGi;
import X.C9jH;
import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes3.dex */
public final class SubscriptionsCommandSpecs {
    public static final SubscriptionsCommandSpecs INSTANCE = new SubscriptionsCommandSpecs();
    public static final NodeCommandSpec SUBSCRIPTIONS_UPGRADE;

    static {
        C9jH c9jHA0E = AGH.A0E();
        SUBSCRIPTIONS_UPGRADE = new NodeCommandSpec("Opens the Meta AI subscription upgrade flow so the user can subscribe.", c9jHA0E, c9jHA0E, C0881AGi.A00, null, "Whether the subscription upgrade flow was opened.", 0L);
    }

    public final NodeCommandSpec getSUBSCRIPTIONS_UPGRADE() {
        return SUBSCRIPTIONS_UPGRADE;
    }
}
