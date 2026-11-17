package com.facebook.aura.appid;

import X.FGI;

/* loaded from: classes5.dex */
public final class AuraClientToken {
    public static final AuraClientToken INSTANCE = new AuraClientToken();
    public static final String loggedOutARAccessToken = FGI.A0d("AR|", "1237225311881278", "|", "6f0e5d739d0a9ba664848be8d1d3c01e");
    public static final String loggedOutFRLAccessToken = FGI.A0d("FRL|", "4387961628157459", "|", "94a311186817e40ff116fbc11d7e2a72");

    public final String getLoggedOutARAccessToken() {
        return loggedOutARAccessToken;
    }

    public final String getLoggedOutFRLAccessToken() {
        return loggedOutFRLAccessToken;
    }
}
