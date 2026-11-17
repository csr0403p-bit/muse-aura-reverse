package com.facebook.aura.pairs;

import X.AHD;
import X.C06827l3;
import X.C60O;
import X.C7BY;
import com.facebook.aura.pairs.PairsHistoryUiState;

/* loaded from: classes3.dex */
public abstract class PairsHistoryViewModelKt {
    public static final int MAX_EMPTY_PAGES = 5;
    public static final C06827l3 SHARED_LINK = C06827l3.A02("]\\(muse-shared://([A-Za-z0-9-]{1,64})\\)");
    public static final String SHARED_LINK_SCHEME = "muse-shared://";

    public static final PairsHistoryUiState.Ready copy(PairsHistoryUiState.Ready ready, AHD<PairsHistoryMessage> ahd, boolean z, boolean z2, boolean z3, Long l) {
        return new PairsHistoryUiState.Ready(ahd, z, z2, z3, ready.contact, l);
    }

    public static /* synthetic */ PairsHistoryUiState.Ready copy$default(PairsHistoryUiState.Ready ready, AHD ahd, boolean z, boolean z2, boolean z3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = ready.messages;
        }
        if ((i & 2) != 0) {
            z = ready.hasMore;
        }
        if ((i & 4) != 0) {
            z2 = ready.isLoadingOlder;
        }
        if ((i & 8) != 0) {
            z3 = ready.olderFailed;
        }
        if ((i & 16) != 0) {
            l = ready.oldestSeq;
        }
        return copy(ready, ahd, z, z2, z3, l);
    }

    public static final String sharedLinkId(String str) {
        String strA0K;
        int length;
        if (!C60O.A1X(str, SHARED_LINK_SCHEME) || (strA0K = C7BY.A0K(SHARED_LINK_SCHEME, str)) == null || (length = strA0K.length()) <= 0 || length > 64) {
            return null;
        }
        return strA0K;
    }
}
