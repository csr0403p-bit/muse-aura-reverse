package com.facebook.traffic.nts.providers.background;

import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public final class BackgroundFnExecutionResult {
    public static final int Failed = 2;
    public static final BackgroundFnExecutionResult INSTANCE = new BackgroundFnExecutionResult();
    public static final int NewData = 0;
    public static final int NoData = 1;

    public final int fromName(String str) {
        C7384Etj.A0Y(str, 0);
        int iHashCode = str.hashCode();
        if (iHashCode != -1957259989) {
            if (iHashCode != -785590966) {
                if (iHashCode == 2096857181 && str.equals("Failed")) {
                    return 2;
                }
            } else if (str.equals("NewData")) {
                return 0;
            }
        } else if (str.equals("NoData")) {
            return 1;
        }
        throw new IllegalArgumentException(FGI.A0M("Invalid value: ", str));
    }

    public final String getName(int i) {
        if (i == 0) {
            return "NewData";
        }
        if (i == 1) {
            return "NoData";
        }
        if (i == 2) {
            return "Failed";
        }
        throw new IllegalArgumentException(FGI.A0H("Invalid value: ", i));
    }
}
