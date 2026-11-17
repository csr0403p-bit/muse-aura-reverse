package com.facebook.aura.common.url;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.C06827l3;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HatchUrl {
    public static final int MAX_SLUG_LENGTH = 256;
    public static final String SCHEME = "hatch";
    public static final String SHARED_CONTENT_PATH_PREFIX = "/s/";
    public static final HatchUrl INSTANCE = new HatchUrl();
    public static final String DOMAIN = "agent.meta.ai";
    public static final String SHARE_DOMAIN = "muse.ai";
    public static final Set<String> ACCEPTED_WEB_HOSTS = C60O.A1B(DOMAIN, SHARE_DOMAIN, "www.muse.ai", AuraDeeplinkRouteMapper.APP_LAUNCH_HOST);
    public static final C06827l3 SHARE_KEY_PATTERN = C06827l3.A02("[A-Za-z0-9_-]{43}");

    /* loaded from: classes.dex */
    public final class SharedLink {
        public final String shareKey;
        public final String slug;

        public SharedLink(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.slug = str;
            this.shareKey = str2;
        }

        public final String getShareKey() {
            return this.shareKey;
        }

        public final String getSlug() {
            return this.slug;
        }
    }

    public final String httpsUrl(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("https://agent.meta.ai", str);
    }

    public final String sharedContentUrl(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0U("https://muse.ai/s/", str, str2 != null ? FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2) : "");
    }

    public final SharedLink sharedLink(List<String> list) {
        String strValidSharedContentSlug;
        C7384Etj.A0Y(list, 0);
        String str = (String) AbstractC0878AGe.A0G(list);
        if (str == null || (strValidSharedContentSlug = validSharedContentSlug(str)) == null) {
            return null;
        }
        int size = list.size();
        if (size == 1) {
            return new SharedLink(strValidSharedContentSlug, null);
        }
        if (size != 2) {
            return null;
        }
        String str2 = list.get(1);
        if (!SHARE_KEY_PATTERN.A08(str2)) {
            str2 = null;
        }
        String str3 = str2;
        if (str3 != null) {
            return new SharedLink(strValidSharedContentSlug, str3);
        }
        return null;
    }

    public final SharedLink viewUrlLink(String str) {
        String strA0K;
        if (str == null || !str.startsWith("https://muse.ai/s/") || (strA0K = C7BY.A0K("https://muse.ai/s/", str)) == null) {
            return null;
        }
        String strA0S = C7BY.A0S(strA0K, strA0K, '?');
        return sharedLink(C7BY.A0h(C7BY.A0L(CustomConnectorRegisterRepositoryKt.ROOT_PATH, C7BY.A0S(strA0S, strA0S, '#')), new char[1], '/'));
    }

    public final Set<String> getACCEPTED_WEB_HOSTS() {
        return ACCEPTED_WEB_HOSTS;
    }

    public final boolean isAcceptedWebHost(String str) {
        return str != null && ACCEPTED_WEB_HOSTS.contains(AnonymousClass001.A0u(str));
    }

    public final String validSharedContentSlug(String str) {
        int iA02 = C60R.A02(str);
        if (iA02 > 0 && iA02 <= 256) {
            int i = 0;
            while (HatchUrlKt.isSlugChar(str.charAt(i))) {
                i++;
                if (i >= iA02) {
                    return str;
                }
            }
        }
        return null;
    }
}
