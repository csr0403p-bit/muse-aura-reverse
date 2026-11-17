package com.facebook.aura.commands.location;

import X.AGH;
import X.C9jH;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class LocationCommandSpecs {
    public static final LocationCommandSpecs INSTANCE = new LocationCommandSpecs();
    public static final NodeCommandSpec LOCATION_GET;

    static {
        List listSingletonList = Collections.singletonList(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL);
        C9jH c9jHA0E = AGH.A0E();
        LOCATION_GET = new NodeCommandSpec("Reports the device's current location \u2014 latitude, longitude, accuracy in meters, timestamp, and a reverse-geocoded address when available. Use whenever the answer depends on where the user is, rather than guessing or asking where they are. If location access has not been granted yet, this asks the user for it.", c9jHA0E, c9jHA0E, listSingletonList, null, "The device's current location.", 0L);
    }

    public final NodeCommandSpec getLOCATION_GET() {
        return LOCATION_GET;
    }
}
