package com.facebook.aura.network.transport;

import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.C60O;
import java.util.List;

/* loaded from: classes5.dex */
public final class HatchNoiseChipAuthorization {
    public final List<String> chipIds;
    public final String claimId;
    public final String ownerNonce;

    public final List<String> getChipIds() {
        return this.chipIds;
    }

    public final String getClaimId() {
        return this.claimId;
    }

    public final String getOwnerNonce() {
        return this.ownerNonce;
    }

    public HatchNoiseChipAuthorization(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.claimId = str;
        this.ownerNonce = str2;
        List<String> listA0X = AbstractC0878AGe.A0X(list);
        this.chipIds = listA0X;
        if (listA0X.isEmpty()) {
            throw C60O.A0i("Chip authorization requires at least one chip ID");
        }
    }
}
