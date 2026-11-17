package com.facebook.aura.opengraph;

import X.BFI;
import X.C7384Etj;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class HatchOpenGraphRepositoryKt {
    public static final Pattern CHARSET_PATTERN;
    public static final Set<Integer> CRAWLER_REJECTION_STATUSES = BFI.A0H(new Integer[]{401, 403});
    public static final long FAILURE_TTL_MS = 600000;
    public static final int MAX_CACHE_ENTRIES = 100;
    public static final long MAX_CACHE_WEIGHT_BYTES = 262144;
    public static final long SUCCESS_TTL_MS = 86400000;
    public static final String TAG = "HatchOpenGraph";
    public static final long TIMEOUT_MS = 10000;
    public static final String USER_AGENT = "facebookexternalhit/1.1 (+http://www.facebook.com/externalhit_uatext.php)";

    static {
        Pattern patternCompile = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 2);
        C7384Etj.A0U(patternCompile);
        CHARSET_PATTERN = patternCompile;
    }
}
