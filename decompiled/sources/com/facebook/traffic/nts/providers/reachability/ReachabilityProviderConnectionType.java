package com.facebook.traffic.nts.providers.reachability;

import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public final class ReachabilityProviderConnectionType {
    public static final int Cell = 2;
    public static final ReachabilityProviderConnectionType INSTANCE = new ReachabilityProviderConnectionType();
    public static final int Max = 4;
    public static final int NoConnection = 1;
    public static final int Unknown = 0;
    public static final int Wifi = 3;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int fromName(String str) {
        C7384Etj.A0Y(str, 0);
        switch (str.hashCode()) {
            case 77124:
                if (str.equals("Max")) {
                    return 4;
                }
                break;
            case 2096514:
                if (str.equals("Cell")) {
                    return 2;
                }
                break;
            case 2695989:
                if (str.equals("Wifi")) {
                    return 3;
                }
                break;
            case 803225503:
                if (str.equals("NoConnection")) {
                    return 1;
                }
                break;
            case 1379812394:
                if (str.equals("Unknown")) {
                    return 0;
                }
                break;
        }
        throw new IllegalArgumentException(FGI.A0M("Invalid value: ", str));
    }

    public final String getName(int i) {
        if (i == 0) {
            return "Unknown";
        }
        if (i == 1) {
            return "NoConnection";
        }
        if (i == 2) {
            return "Cell";
        }
        if (i == 3) {
            return "Wifi";
        }
        if (i == 4) {
            return "Max";
        }
        throw new IllegalArgumentException(FGI.A0H("Invalid value: ", i));
    }
}
