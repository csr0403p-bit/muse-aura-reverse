package com.facebook.aura.pairs;

import X.AnonymousClass002;
import com.facebook.aura.R;
import com.facebook.aura.pairs.PairsAcceptPreferencesUiState;

/* loaded from: classes3.dex */
public abstract class PairsAcceptPreferencesViewModelKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsError.values().length];
            try {
                AnonymousClass002.A13(PairsError.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsError.NOT_FOUND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PairsError.INVALID_LINK, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PairsError.LEVEL_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(PairsError.UNSUPPORTED_LINK, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PairsError.RELATIONSHIP_LIMIT, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PairsAcceptPreferencesUiState.Ready copy(PairsAcceptPreferencesUiState.Ready ready, PairsLevel pairsLevel, boolean z) {
        return new PairsAcceptPreferencesUiState.Ready(ready.invite, ready.levels, pairsLevel, z);
    }

    public static /* synthetic */ PairsAcceptPreferencesUiState.Ready copy$default(PairsAcceptPreferencesUiState.Ready ready, PairsLevel pairsLevel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pairsLevel = ready.selectedLevel;
        }
        if ((i & 2) != 0) {
            z = ready.isAccepting;
        }
        return copy(ready, pairsLevel, z);
    }

    public static final int acceptMessage(PairsError pairsError) {
        switch (pairsError.ordinal()) {
            case 0:
            case 1:
                return R.string._name_removed__res_0x7f120d51;
            case 5:
            case 11:
                return R.string._name_removed__res_0x7f120d70;
            case 12:
                return R.string._name_removed__res_0x7f120d74;
            case 13:
                return R.string._name_removed__res_0x7f120d71;
            default:
                return R.string._name_removed__res_0x7f120d6d;
        }
    }
}
