package com.facebook.traffic.nts.providers.radiosignal;

import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public final class TasosLinkQuality {
    public static final int Good = 3;
    public static final TasosLinkQuality INSTANCE = new TasosLinkQuality();
    public static final int Minimal = 1;
    public static final int Moderate = 2;
    public static final int Unknown = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int fromName(String str) {
        C7384Etj.A0Y(str, 0);
        switch (str.hashCode()) {
            case -1565776511:
                if (str.equals("Minimal")) {
                    return 1;
                }
                break;
            case -554213085:
                if (str.equals("Moderate")) {
                    return 2;
                }
                break;
            case 2225373:
                if (str.equals("Good")) {
                    return 3;
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
            return "Minimal";
        }
        if (i == 2) {
            return "Moderate";
        }
        if (i == 3) {
            return "Good";
        }
        throw new IllegalArgumentException(FGI.A0H("Invalid value: ", i));
    }
}
