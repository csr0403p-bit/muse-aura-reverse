package com.facebook.aura.pairs;

import X.C7384Etj;
import X.FGI;
import com.facebook.aura.network.api.StefiMusePath;

/* loaded from: classes3.dex */
public final class TrustedCirclePath implements StefiMusePath.Extension {
    public final String value;

    public TrustedCirclePath(PairsRecipientPurpose pairsRecipientPurpose) {
        C7384Etj.A0Y(pairsRecipientPurpose, 0);
        this.value = FGI.A0M("/sharing/recipients?trusted_circle=true&purpose=", pairsRecipientPurpose.getWireValue());
    }

    @Override // com.facebook.aura.network.api.StefiPath
    public String getValue() {
        return this.value;
    }
}
