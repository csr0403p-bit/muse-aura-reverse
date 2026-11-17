package com.facebook.aura.commands.notifications;

import X.AGH;
import X.AnonymousClass007;
import X.C3cG;
import X.C60O;
import X.C9jH;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class NotificationsCommandSpecs {
    public static final NotificationsCommandSpecs INSTANCE = new NotificationsCommandSpecs();
    public static final NodeCommandSpec NOTIFICATIONS_ACTION;
    public static final NodeCommandSpec NOTIFICATIONS_GET;

    static {
        NodeArgType nodeArgType = NodeArgType.STRING;
        NOTIFICATIONS_ACTION = new NodeCommandSpec("Operate on a device notification by key: reply to a message, dismiss one, dismiss all, or trigger one of its buttons.", AnonymousClass007.A0d("action", C60O.A09(nodeArgType, "One of: 'reply', 'dismiss', 'dismiss_all', 'tap_action'"), C3cG.A0r("key", C60O.A09(nodeArgType, "Notification key from the `notifications` data source payload"))), AnonymousClass007.A0d("action_index", C60O.A09(NodeArgType.INTEGER, "Zero-based index of the notification's own action button to tap, in the order the notification defines them. The `notifications` data source does NOT publish the button list, so the indexes are not visible to you \u2014 only pass this when the user has named which button they mean, and prefer 'reply' or 'dismiss' otherwise."), C3cG.A0r("reply_text", C60O.A09(nodeArgType, "Text to send when action is 'reply'"))), Collections.singletonList("notifications"), null, "The result of the requested notification operation on the device.", 0L);
        List listSingletonList = Collections.singletonList("notifications");
        C9jH c9jHA0E = AGH.A0E();
        NOTIFICATIONS_GET = new NodeCommandSpec("Reports the device's current active notifications \u2014 app, title, body, sender, and the notification key used by `notifications.action`. Use when the user's current notifications are needed.", c9jHA0E, c9jHA0E, listSingletonList, null, "The device's current active notifications.", 0L);
    }

    public final NodeCommandSpec getNOTIFICATIONS_ACTION() {
        return NOTIFICATIONS_ACTION;
    }

    public final NodeCommandSpec getNOTIFICATIONS_GET() {
        return NOTIFICATIONS_GET;
    }
}
