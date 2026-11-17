package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.C06827l3;
import X.C7384Etj;
import X.C7BY;

/* loaded from: classes4.dex */
public final class CustomConnectorName {
    public static final String PREFIX = "custom.";
    public static final CustomConnectorName INSTANCE = new CustomConnectorName();
    public static final C06827l3 validNameRegex = C06827l3.A02("^custom\\.[A-Za-z0-9_.-]+$");

    public final boolean isValid(String str) {
        C7384Etj.A0Y(str, 0);
        return validNameRegex.A08(str);
    }

    public final String normalized(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.startsWith(PREFIX)) {
            str = C7BY.A0K(PREFIX, str);
        }
        return AnonymousClass001.A0u(str).replace('-', '_');
    }
}
