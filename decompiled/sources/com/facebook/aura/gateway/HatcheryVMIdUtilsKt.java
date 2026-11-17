package com.facebook.aura.gateway;

import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BQG;
import X.C06827l3;
import X.C06847l8;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import java.net.URI;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class HatcheryVMIdUtilsKt {
    public static final String HATCHERY_VM_ID_PREFIX = "env-";
    public static final String REDACTED_URL = "<redacted-url>";
    public static final int VM_ID_LOG_CHARS = 4;
    public static final C06827l3 HATCHERY_VM_ID_REGEX = C06827l3.A02("env-[a-z0-9]{6}");
    public static final C06827l3 DEV_VM_ID_REGEX = C06827l3.A02("([a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}|[a-f0-9]{32})\\.(?:test-only\\.)?metaaivm\\.com");

    public static final String extractDevVmIdFromHost(String str) {
        List<String> listAG1;
        C7384Etj.A0Y(str, 0);
        C06847l8 c06847l8A06 = DEV_VM_ID_REGEX.A06(AnonymousClass001.A0u(str));
        if (c06847l8A06 == null || (listAG1 = c06847l8A06.AG1()) == null) {
            return null;
        }
        return C60Q.A0n(listAG1, 1);
    }

    public static final String extractHatcheryVMId(String str) {
        List<String> listAG1;
        C7384Etj.A0Y(str, 0);
        C06847l8 c06847l8A01 = C06827l3.A01(str, HATCHERY_VM_ID_REGEX);
        if (c06847l8A01 != null) {
            String strGroup = c06847l8A01.A01.group();
            C7384Etj.A0U(strGroup);
            return strGroup;
        }
        C06847l8 c06847l8A012 = C06827l3.A01(str, DEV_VM_ID_REGEX);
        if (c06847l8A012 == null || (listAG1 = c06847l8A012.AG1()) == null) {
            return null;
        }
        return listAG1.get(1);
    }

    public static final String extractVmHost(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0h = C60Q.A0h(AnonymousClass002.A0l(str));
        if (strA0h == null || strA0h.length() <= 0) {
            return null;
        }
        return strA0h;
    }

    public static final String redactedGatewayUrlForLog(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme != null && host != null) {
                String strA0H = uri.getPort() != -1 ? FGI.A0H(":", uri.getPort()) : "";
                String strRedactVmIdIn = redactVmIdIn(host);
                String rawPath = uri.getRawPath();
                return FGI.A0h(scheme, "://", strRedactVmIdIn, strA0H, rawPath != null ? rawPath : "");
            }
        } catch (Exception unused) {
        }
        return REDACTED_URL;
    }

    public static final String vmIdForLog(String str) {
        return (str == null || str.length() == 0) ? JarvisProtocolKt.NONE_LOG_VALUE : str.startsWith(HATCHERY_VM_ID_PREFIX) ? FGI.A0M(HATCHERY_VM_ID_PREFIX, BQG.A17(C7BY.A0K(HATCHERY_VM_ID_PREFIX, str), 4)) : BQG.A17(str, 4);
    }

    public static final String redactVmIdIn(String str) {
        String strExtractHatcheryVMId = extractHatcheryVMId(str);
        return strExtractHatcheryVMId != null ? AbstractC2159Azp.A0z(str, strExtractHatcheryVMId, vmIdForLog(strExtractHatcheryVMId)) : str;
    }
}
