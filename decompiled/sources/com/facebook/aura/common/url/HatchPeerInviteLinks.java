package com.facebook.aura.common.url;

import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.maps.model.HatchMapSceneKt;

/* loaded from: classes.dex */
public final class HatchPeerInviteLinks {
    public static final HatchPeerInviteLinks INSTANCE = new HatchPeerInviteLinks();
    public static final String PATH = "/peer/accept#";
    public static final String REDACTED_FRAGMENT = "<redacted>";

    public final boolean contains(String str) {
        C7384Etj.A0Y(str, 0);
        return !str.equals(redact(str));
    }

    public final String redact(String str) {
        C7384Etj.A0Y(str, 0);
        int iA0B = C7BY.A0B(str, PATH, 0, true);
        if (iA0B < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            int i2 = iA0B + 13;
            int i3 = i2;
            while (i3 < length && isFragmentChar(str.charAt(i3))) {
                i3++;
            }
            if (i3 > i2) {
                sb.append((CharSequence) str, i, i2);
                sb.append(REDACTED_FRAGMENT);
                i = i3;
            }
            iA0B = C7BY.A0B(str, PATH, i3, true);
        } while (iA0B >= 0);
        sb.append((CharSequence) str, i, length);
        return sb.toString();
    }

    public final String withoutFragment(String str) {
        C7384Etj.A0Y(str, 0);
        return contains(str) ? C7BY.A0S(str, str, '#') : str;
    }

    private final boolean isFragmentChar(char c) {
        char c2;
        if ('a' <= c) {
            return c < '{';
        }
        if ('A' <= c) {
            c2 = '[';
        } else {
            if ('0' > c) {
                return c == '-';
            }
            c2 = HatchMapSceneKt.ARTIFACT_ID_SEPARATOR;
        }
        return c < c2 || c == '_';
    }
}
