package com.facebook.aura.commands.geofence;

import X.AGH;
import X.AnonymousClass006;
import X.C3cG;
import X.C60O;
import X.C9jH;
import X.HxE;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class GeofenceCommandSpecs {
    public static final NodeCommandSpec GEOFENCE_LIST;
    public static final NodeCommandSpec GEOFENCE_REMOVE;
    public static final NodeCommandSpec GEOFENCE_SET;
    public static final GeofenceCommandSpecs INSTANCE = new GeofenceCommandSpecs();

    static {
        NodeArgType nodeArgType = NodeArgType.STRING;
        Map mapA10 = AnonymousClass006.A10("label", C60O.A09(nodeArgType, "Human-readable name for this geofence (e.g. 'office', 'home')"));
        HxE hxEA0r = C3cG.A0r("address", C60O.A09(nodeArgType, "Street address or place name to geocode (e.g. '1 Hacker Way, Menlo Park, CA' or 'Meta Building 20, Menlo Park'). The device will resolve this to precise coordinates. Preferred over latitude/longitude for named places."));
        NodeArgType nodeArgType2 = NodeArgType.NUMBER;
        HxE hxEA0r2 = C3cG.A0r(GeofenceEventWorker.KEY_LATITUDE, C60O.A09(nodeArgType2, "Latitude in decimal degrees. Use only if you have exact coordinates; otherwise prefer address."));
        HxE hxEA0r3 = C3cG.A0r(GeofenceEventWorker.KEY_LONGITUDE, C60O.A09(nodeArgType2, "Longitude in decimal degrees. Use only if you have exact coordinates; otherwise prefer address."));
        HxE hxEA0r4 = C3cG.A0r("radius_meters", C60O.A09(nodeArgType2, "Geofence radius in meters (default: 150). Recommended by place type: home/apartment=100-200, store/restaurant/gym=150-250, office building=200-350, large campus or workplace with multiple buildings=500-1000. When unsure, ask the user about the size of the area."));
        HxE hxEA0r5 = C3cG.A0r("trigger", C60O.A09(NodeArgType.STRING, "When to trigger: 'enter' (default), 'exit', or 'enter_or_exit'"));
        HxE hxEA0r6 = C3cG.A0r("persistent", C60O.A09(NodeArgType.BOOLEAN, "Whether this geofence should keep firing after the first trigger. Default false (one-time: auto-removed after first trigger). Set to true for ongoing monitoring."));
        NodeArgType nodeArgType3 = NodeArgType.STRING;
        GEOFENCE_SET = new NodeCommandSpec("Register a geofence so the device sends a proactive notification when the user arrives at or leaves a location. Use this when the user asks for location-based reminders (e.g. 'remind me when I get to the office', 'let me know when I leave home', 'notify me when I'm near the gym'). The geofence runs in the background with minimal battery impact and survives app backgrounding. IMPORTANT: Do NOT guess latitude/longitude coordinates for named places. Instead, provide the address and the device will geocode it to precise coordinates. You can provide either an address OR latitude/longitude. By default geofences are one-time (auto-removed after first trigger). IMPORTANT: Ask the user whether they want a one-time notification or ongoing monitoring before setting the geofence. Set persistent=true for ongoing monitoring. Returns a geofence ID that can be used with geofence.remove to cancel it.", mapA10, AGH.A0D(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, C3cG.A0r("notification_label", C60O.A09(nodeArgType3, "Text to display in the local reminder notification when this geofence fires (e.g. 'Buy milk at Target', 'Pick up Alice'). Phrase it as an actionable reminder directed at the user. If omitted, falls back to the geofence 'label'. Prefer setting this explicitly whenever the user's intent is a reminder \u2014 the device shows this notification immediately on trigger, independent of the network round-trip back to the server."))), C60O.A16(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, "location_always"), null, "Confirmation that the location-based reminder is set; a card with a map of the place is shown.", 0L);
        Map mapA102 = AnonymousClass006.A10("id", C60O.A09(nodeArgType3, "The geofence ID returned by geofence.set"));
        List listSingletonList = Collections.singletonList("location_always");
        C9jH c9jHA0E = AGH.A0E();
        GEOFENCE_REMOVE = new NodeCommandSpec("Remove a previously set geofence by its ID.", mapA102, c9jHA0E, listSingletonList, null, "Confirmation that the location-based reminder was removed.", 0L);
        GEOFENCE_LIST = new NodeCommandSpec("List all currently registered geofences.", c9jHA0E, c9jHA0E, Collections.singletonList("location_always"), null, "The user's current location-based reminders.", 0L);
    }

    public final NodeCommandSpec getGEOFENCE_LIST() {
        return GEOFENCE_LIST;
    }

    public final NodeCommandSpec getGEOFENCE_REMOVE() {
        return GEOFENCE_REMOVE;
    }

    public final NodeCommandSpec getGEOFENCE_SET() {
        return GEOFENCE_SET;
    }
}
