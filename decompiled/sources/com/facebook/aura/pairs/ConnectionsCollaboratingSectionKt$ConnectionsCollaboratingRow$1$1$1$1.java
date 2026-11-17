package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;

/* loaded from: classes3.dex */
public final class ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$1$1$1$1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
    public static final ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$1$1$1$1 INSTANCE = new ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$1$1$1$1();

    public ConnectionsCollaboratingSectionKt$ConnectionsCollaboratingRow$1$1$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return Boolean.valueOf(auraNavKey instanceof ConnectionsSheetKey);
    }
}
