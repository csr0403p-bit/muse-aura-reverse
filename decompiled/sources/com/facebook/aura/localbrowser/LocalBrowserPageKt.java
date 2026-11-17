package com.facebook.aura.localbrowser;

import X.C60O;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class LocalBrowserPageKt {
    public static final Set<String> LOCAL_SCHEMES = C60O.A1A("data", NativeLoginCheckpointContinuationKt.BLOB_PARAM, "about");
    public static final Set<String> SCREENED_SCHEMES = C60O.A19(AuraDeeplinkHandlerActivity.HTTP, "https");
}
