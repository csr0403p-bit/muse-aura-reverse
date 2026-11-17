package com.facebook.aura.devices.pairing;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C7BY;
import X.C9tI;
import java.util.List;

/* loaded from: classes.dex */
public abstract class LinkFirmwareVersionKt {
    public static final boolean linkFirmwareIsOlderThan(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        Long linkFirmwareVersion = parseLinkFirmwareVersion(str);
        if (linkFirmwareVersion != null) {
            long jLongValue = linkFirmwareVersion.longValue();
            Long linkFirmwareVersion2 = parseLinkFirmwareVersion(str2);
            if (linkFirmwareVersion2 != null && jLongValue < linkFirmwareVersion2.longValue()) {
                return zA1a;
            }
        }
        return false;
    }

    public static final Long parseLinkFirmwareVersion(String str) {
        Integer numA0r;
        Integer numA0r2;
        Integer numA0r3;
        String strA0l = AnonymousClass002.A0l(str);
        String strA0S = C7BY.A0S(strA0l, strA0l, '+');
        String strA0S2 = C7BY.A0S(strA0S, strA0S, '-');
        if (strA0S2.length() != 0) {
            int iIntValue = 0;
            List listA0g = C7BY.A0g(strA0S2, new char[]{'.'});
            String str2 = (String) AbstractC0878AGe.A0A(0, listA0g);
            if (str2 != null && (numA0r = C9tI.A0r(str2)) != null) {
                int iIntValue2 = numA0r.intValue();
                String str3 = (String) AbstractC0878AGe.A0A(1, listA0g);
                int iIntValue3 = (str3 == null || (numA0r3 = C9tI.A0r(str3)) == null) ? 0 : numA0r3.intValue();
                String str4 = (String) AbstractC0878AGe.A0A(2, listA0g);
                if (str4 != null && (numA0r2 = C9tI.A0r(str4)) != null) {
                    iIntValue = numA0r2.intValue();
                }
                return Long.valueOf((iIntValue2 << 32) | ((iIntValue3 & 65535) << 16) | (iIntValue & 65535));
            }
        }
        return null;
    }
}
