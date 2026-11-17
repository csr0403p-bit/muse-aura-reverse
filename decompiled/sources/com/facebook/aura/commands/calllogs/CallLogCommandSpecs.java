package com.facebook.aura.commands.calllogs;

import X.AGH;
import X.C3cG;
import X.C3cH;
import X.C60O;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class CallLogCommandSpecs {
    public static final NodeCommandSpec CALL_LOG_SEARCH;
    public static final CallLogCommandSpecs INSTANCE = new CallLogCommandSpecs();

    static {
        NodeArgType nodeArgType = NodeArgType.STRING;
        CALL_LOG_SEARCH = new NodeCommandSpec("Search or browse the device's call log and return matching calls, most recent first. All parameters are optional. Pass `query` to filter by caller \u2014 it matches the cached contact name or the phone number. Use it for requests like 'When did I last call Sarah?' or 'Show my recent calls'. Omit `query` to list the most recent calls. `start_date` and `end_date` (ISO-8601) bound the window. Returns entries with number, name, direction, local date and time, and duration.", AGH.A0E(), C3cH.A0m("end_date", C60O.A09(nodeArgType, "Inclusive end of the window, ISO-8601. Optional."), C3cG.A0r("query", C60O.A09(nodeArgType, "Contact name or phone number to filter calls by. Omit to list the most recent calls.")), C3cG.A0r("start_date", C60O.A09(nodeArgType, "Inclusive start of the window, ISO-8601, e.g. '2025-01-15T00:00:00Z'. Optional."))), Collections.singletonList("call_log"), null, "Search results from the user's call log. Use `direction` \u2014 incoming, outgoing, missed, voicemail, rejected, blocked, or answered_externally \u2014 to say what kind of call it was; it is authoritative and must never be inferred from any other field. `outgoing` means the USER placed the call; only `missed` means they missed one. `type` and `date` are raw internal values \u2014 `type` is an Android enum integer and `date` is UTC epoch milliseconds. NEVER show either to the user, never fall back to `type` to determine direction, and never use `date` to compute the day, date, or weekday: it names the wrong day for calls made in the evening. Report the time from `date_local` (local wall-clock) and the day from `date_local_date`, and show the weekday using `date_weekday` verbatim. `duration` is in SECONDS. An entry records only that a call occurred \u2014 it says nothing about what was discussed, so never state or speculate about the topic, purpose, or outcome of a call.", 0L);
    }

    public final NodeCommandSpec getCALL_LOG_SEARCH() {
        return CALL_LOG_SEARCH;
    }
}
