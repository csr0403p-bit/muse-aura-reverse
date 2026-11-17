package com.facebook.aura.pairs;

import X.C7384Etj;
import com.facebook.aura.R;

/* loaded from: classes3.dex */
public abstract class SpaceCollaboratorsViewModelKt {
    public static final String PEER_NOT_CONNECTED = "peer_not_connected";
    public static final String PEER_OPERATION_UNAVAILABLE = "peer_operation_unavailable";
    public static final String PEER_SPACE_SHARE_UNAVAILABLE = "peer_space_share_unavailable";

    public static final int writeFailureMessage(Exception exc) {
        PairsException pairsException;
        String str;
        boolean zEquals;
        int i;
        C7384Etj.A0Y(exc, 0);
        if ((exc instanceof PairsException) && (pairsException = (PairsException) exc) != null && (str = pairsException.errorCode) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1829517733) {
                zEquals = str.equals(PEER_OPERATION_UNAVAILABLE);
                i = R.string._name_removed__res_0x7f120fbe;
            } else if (iHashCode == 22971674) {
                zEquals = str.equals(PEER_SPACE_SHARE_UNAVAILABLE);
                i = R.string._name_removed__res_0x7f120fd0;
            } else if (iHashCode == 1964416128) {
                zEquals = str.equals(PEER_NOT_CONNECTED);
                i = R.string._name_removed__res_0x7f120fbd;
            }
            if (zEquals) {
                return i;
            }
        }
        return R.string._name_removed__res_0x7f120fcf;
    }
}
