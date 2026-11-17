package com.facebook.aura.spaces.repo;

import X.AnonymousClass002;
import X.BFI;
import X.C7384Etj;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class PinnedItemsRepositoryJsonKt {
    public static final String LOCAL_IDEAS_NAVIGATION_ID = "explore";
    public static final String NAVIGATION_SOURCE_PEER_SPACE = "peer_space";
    public static final String NAVIGATION_SOURCE_SAVED_SPACE = "saved_space";
    public static final String NAVIGATION_SOURCE_SPACE = "space";
    public static final String NAVIGATION_SOURCE_SYSTEM = "system";
    public static final Set<String> RENDERED_SYSTEM_TAB_KEYS = BFI.A0H(new String[]{"chat", "feed", "ideas", "goals", "connections", "library"});
    public static final String SERVER_IDEAS_TAB_KEY = "ideas";

    public static final NavigationTabReferenceJson toJson(NavigationTabReference navigationTabReference) {
        C7384Etj.A0Y(navigationTabReference, 0);
        String strA0l = AnonymousClass002.A0l(navigationTabReference.itemKey);
        if (strA0l.length() <= 0) {
            return null;
        }
        NavigationTabSource navigationTabSource = navigationTabReference.source;
        String wireValue = navigationTabSource.getWireValue();
        int iOrdinal = navigationTabSource.ordinal();
        if (iOrdinal == 0) {
            strA0l = toServerSystemTabKey(strA0l);
        } else if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new NavigationTabReferenceJson(wireValue, strA0l);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationTabSource.values().length];
            try {
                AnonymousClass002.A13(NavigationTabSource.SYSTEM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NavigationTabSource.SPACE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NavigationTabSource.SAVED_SPACE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NavigationTabSource.PEER_SPACE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toLocalSystemNavigationId(String str) {
        return "ideas".equals(str) ? "explore" : str;
    }

    public static final String toServerSystemTabKey(String str) {
        return "explore".equals(str) ? "ideas" : str;
    }
}
