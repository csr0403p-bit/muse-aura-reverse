package com.facebook.aura.commands.geofence;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class GeofenceStore$remove$removed$1 extends AbstractC7559F3s implements G0U<NodeGeofence, Boolean> {
    public final /* synthetic */ String $id;

    @Override // X.G0U
    public final Boolean invoke(NodeGeofence nodeGeofence) {
        C7384Etj.A0Y(nodeGeofence, 0);
        return C60O.A0h(nodeGeofence.id, this.$id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceStore$remove$removed$1(String str) {
        super(1);
        this.$id = str;
    }
}
