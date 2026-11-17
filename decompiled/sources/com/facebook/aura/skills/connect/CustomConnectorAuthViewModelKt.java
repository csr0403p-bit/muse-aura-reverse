package com.facebook.aura.skills.connect;

import X.C7BY;
import X.FGI;
import com.facebook.aura.skills.connect.config.CustomConnectorName;

/* loaded from: classes4.dex */
public abstract class CustomConnectorAuthViewModelKt {
    public static final String toCustomConnectorId(String str) {
        return FGI.A0M(CustomConnectorName.PREFIX, C7BY.A0K(CustomConnectorName.PREFIX, str));
    }
}
