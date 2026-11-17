package com.facebook.aura.localbrowser;

import X.AbstractC05846xo;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BzK;
import X.C05686pL;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60Q;
import X.C6li;
import X.C6oa;
import X.C6xU;
import X.C7384Etj;
import X.C7510EyX;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes3.dex */
public final class LocalBrowserProfiles {
    public static final int $stable = 0;
    public static final String LEGACY_PROFILE_PREFIX = "muse_local_browser_task_v1_";
    public static final int MAX_LOADED_PROFILES = 4;
    public static final String PROFILE_KEY = "local_browser_profile";
    public static final String PROFILE_PREFIX = "muse_local_browser_session_v1_";
    public static final LocalBrowserProfiles INSTANCE = new LocalBrowserProfiles();
    public static final Map<String, LocalBrowserProfile> loadedProfiles = C3cG.A0j();

    public final void forget(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C4oT c4oT = AuraUserPrefs.INSTANCE.get(str, AuraUserPrefStore.COMMON);
        if (str2 == null || str2.equals(C4oT.A00(c4oT, PROFILE_KEY))) {
            BzK bzKA9q = c4oT.A9q();
            bzKA9q.Aae(PROFILE_KEY);
            bzKA9q.apply();
        }
    }

    public final LocalBrowserProfile reserve(String str) {
        C7384Etj.A0Y(str, 0);
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
        if (isSupported()) {
            Map<String, LocalBrowserProfile> map = loadedProfiles;
            if (map.size() < 4) {
                C6li c6li = C6xU.A0h;
                if (!c6li.A01()) {
                    throw C60Q.A0q();
                }
                C05686pL c05686pL = C05686pL.A01;
                if (c05686pL == null) {
                    c05686pL = new C05686pL(AbstractC05846xo.A00.AJB());
                    C05686pL.A01 = c05686pL;
                }
                C4oT c4oT = AuraUserPrefs.INSTANCE.get(str, AuraUserPrefStore.COMMON);
                String string = c4oT.getString(PROFILE_KEY, null);
                if (string == null || !string.startsWith(PROFILE_PREFIX)) {
                    string = null;
                }
                if (!map.containsKey(string)) {
                    if (!c6li.A01()) {
                        throw C60Q.A0q();
                    }
                    ProfileStoreBoundaryInterface profileStoreBoundaryInterface = c05686pL.A00;
                    Iterator<String> it = profileStoreBoundaryInterface.getAllProfileNames().iterator();
                    while (it.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it);
                        C7384Etj.A0X(strA0j);
                        if (strA0j.startsWith(PROFILE_PREFIX) || strA0j.startsWith(LEGACY_PROFILE_PREFIX)) {
                            if (!strA0j.equals(string) && !map.containsKey(strA0j)) {
                                if (!c6li.A01()) {
                                    throw C60Q.A0q();
                                }
                                if (!profileStoreBoundaryInterface.deleteProfile(strA0j)) {
                                }
                            }
                        }
                    }
                    if (string == null) {
                        string = AnonymousClass007.A0a(PROFILE_PREFIX, UUID.randomUUID());
                    }
                    if (!c6li.A01()) {
                        throw C60Q.A0q();
                    }
                    LocalBrowserProfile localBrowserProfile = new LocalBrowserProfile(new C6oa((ProfileBoundaryInterface) C7510EyX.A00(ProfileBoundaryInterface.class, profileStoreBoundaryInterface.getOrCreateProfile(string))));
                    map.put(string, localBrowserProfile);
                    BzK bzKA9q = c4oT.A9q();
                    bzKA9q.AYr(PROFILE_KEY, string);
                    bzKA9q.apply();
                    return localBrowserProfile;
                }
            }
        }
        return null;
    }

    public final boolean isSupported() {
        return C6xU.A00("MULTI_PROFILE") && C6xU.A00("DELETE_BROWSING_DATA");
    }
}
