package com.facebook.aura.commands.phone;

import X.AGH;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C60O;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes3.dex */
public final class PhoneCommandSpecs {
    public static final PhoneCommandSpecs INSTANCE = new PhoneCommandSpecs();
    public static final NodeCommandSpec PHONE_CALL = new NodeCommandSpec("Place a phone call from the user's own phone, on their own number, with the user speaking. This is NOT the agent calling tool that talks to the recipient on the user's behalf \u2014 that one is for businesses. Prefer this whenever the user wants to speak themselves, and use it for personal contacts (family, friends, saved contacts, personal mobile numbers), which the agent calling tool does not handle. ALWAYS invoke this tool when the user asks to call a person \u2014 never claim a call was placed without invoking it. It dials directly when calling permission is granted and the app is in the foreground; when the app is backgrounded a tap-to-call notification is posted instead; and when calling permission is not granted a tappable calling card is shown so the user can place the call themselves.", AnonymousClass006.A10("phone_number", C60O.A09(NodeArgType.STRING, "The phone number to call")), AGH.A0E(), C0881AGi.A00, null, "The call is being placed directly, or a tap-to-call notification is posted when the app is backgrounded, or a calling card is shown when the call cannot be dialed directly.", 0);

    public final NodeCommandSpec getPHONE_CALL() {
        return PHONE_CALL;
    }
}
