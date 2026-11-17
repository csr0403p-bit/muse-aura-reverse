package com.facebook.aura.commands.background;

import X.AGH;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C60O;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes3.dex */
public final class BackgroundSessionCommandSpecs {
    public static final BackgroundSessionCommandSpecs INSTANCE = new BackgroundSessionCommandSpecs();
    public static final NodeCommandSpec BACKGROUND_SESSION = new NodeCommandSpec("Suggest that the user let the app keep running in the background so it can continue a long-running task even after they leave the app. Use this when a task requires waiting for and reacting to incoming events over time \u2014 e.g. texting back and forth with a customer-service agent over SMS where replies take minutes, watching for a message or status change, or any multi-step task you cannot finish in a single turn. This requires the user's \"Run in background\" permission. If it is not yet enabled, calling this returns a message with a card link you must relay to the user verbatim \u2014 it shows an Enable button that turns it on; the task is not protected until they enable it. You do NOT start, extend, or end background running \u2014 once the user enables it the app keeps running in the background until the user turns it off. Just call this once to surface the suggestion when a task needs it.", AGH.A0E(), AnonymousClass006.A10("task_summary", C60O.A09(NodeArgType.STRING, "Short user-readable description of what you are working on, shown on the enable card.")), C0881AGi.A00, null, "Whether a permission card was surfaced because background running is off, or that it was already enabled.", 0);

    public final NodeCommandSpec getBACKGROUND_SESSION() {
        return BACKGROUND_SESSION;
    }
}
