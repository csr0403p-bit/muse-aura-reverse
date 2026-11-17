package com.facebook.aura.navigation.key;

import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public abstract class SpaceNavigationIdKt {
    public static final String SPACE_NAVIGATION_ID_PREFIX = "space_";

    public static final String spaceNavigationId(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M(SPACE_NAVIGATION_ID_PREFIX, str);
    }
}
