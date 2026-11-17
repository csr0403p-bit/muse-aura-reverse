package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsAcceptLinkFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsAcceptLinkFailure[] $VALUES;
    public static final PairsAcceptLinkFailure LINK_EXPIRED;
    public static final PairsAcceptLinkFailure LINK_INVALID;
    public static final PairsAcceptLinkFailure LINK_REOPEN;
    public static final PairsAcceptLinkFailure LINK_UNSUPPORTED;
    public static final PairsAcceptLinkFailure LOAD_FAILED;
    public static final PairsAcceptLinkFailure OWN_LINK;
    public static final PairsAcceptLinkFailure UNAVAILABLE;
    public final boolean canRetry;
    public final int message;
    public final String wire;

    public static Ey9<PairsAcceptLinkFailure> getEntries() {
        return $ENTRIES;
    }

    public static PairsAcceptLinkFailure valueOf(String str) {
        return (PairsAcceptLinkFailure) Enum.valueOf(PairsAcceptLinkFailure.class, str);
    }

    public static PairsAcceptLinkFailure[] values() {
        return (PairsAcceptLinkFailure[]) $VALUES.clone();
    }

    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final int getMessage() {
        return this.message;
    }

    public final String getWire() {
        return this.wire;
    }

    static {
        PairsAcceptLinkFailure pairsAcceptLinkFailure = new PairsAcceptLinkFailure("UNAVAILABLE", 0, "unavailable", R.string._name_removed__res_0x7f120d51, false);
        UNAVAILABLE = pairsAcceptLinkFailure;
        PairsAcceptLinkFailure pairsAcceptLinkFailure2 = new PairsAcceptLinkFailure("LINK_REOPEN", 1, "link_reopen", R.string._name_removed__res_0x7f120d72, false);
        LINK_REOPEN = pairsAcceptLinkFailure2;
        PairsAcceptLinkFailure pairsAcceptLinkFailure3 = new PairsAcceptLinkFailure("LINK_INVALID", 2, "link_invalid", R.string._name_removed__res_0x7f120d6f, false);
        LINK_INVALID = pairsAcceptLinkFailure3;
        PairsAcceptLinkFailure pairsAcceptLinkFailure4 = new PairsAcceptLinkFailure("OWN_LINK", 3, "own_link", R.string._name_removed__res_0x7f120d7a, false);
        OWN_LINK = pairsAcceptLinkFailure4;
        PairsAcceptLinkFailure pairsAcceptLinkFailure5 = new PairsAcceptLinkFailure("LINK_UNSUPPORTED", 4, "link_unsupported", R.string._name_removed__res_0x7f120d74, false);
        LINK_UNSUPPORTED = pairsAcceptLinkFailure5;
        PairsAcceptLinkFailure pairsAcceptLinkFailure6 = new PairsAcceptLinkFailure("LINK_EXPIRED", 5, "link_expired", R.string._name_removed__res_0x7f120d6e, false);
        LINK_EXPIRED = pairsAcceptLinkFailure6;
        PairsAcceptLinkFailure pairsAcceptLinkFailure7 = new PairsAcceptLinkFailure("LOAD_FAILED", 6, "load_failed", R.string._name_removed__res_0x7f120d75, true);
        LOAD_FAILED = pairsAcceptLinkFailure7;
        PairsAcceptLinkFailure[] pairsAcceptLinkFailureArr = {pairsAcceptLinkFailure, pairsAcceptLinkFailure2, pairsAcceptLinkFailure3, pairsAcceptLinkFailure4, pairsAcceptLinkFailure5, pairsAcceptLinkFailure6, pairsAcceptLinkFailure7};
        $VALUES = pairsAcceptLinkFailureArr;
        $ENTRIES = C3cG.A0w(pairsAcceptLinkFailureArr);
    }

    public PairsAcceptLinkFailure(String str, int i, String str2, int i2, boolean z) {
        this.wire = str2;
        this.message = i2;
        this.canRetry = z;
    }
}
