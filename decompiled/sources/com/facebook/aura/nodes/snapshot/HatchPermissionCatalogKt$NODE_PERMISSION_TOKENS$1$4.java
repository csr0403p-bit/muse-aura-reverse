package com.facebook.aura.nodes.snapshot;

import X.AbstractC7559F3s;
import X.C7380Etd;
import X.C7384Etj;
import X.G0U;
import android.content.Context;

/* loaded from: classes3.dex */
public final class HatchPermissionCatalogKt$NODE_PERMISSION_TOKENS$1$4 extends AbstractC7559F3s implements G0U<Context, Boolean> {
    public static final HatchPermissionCatalogKt$NODE_PERMISSION_TOKENS$1$4 INSTANCE = new HatchPermissionCatalogKt$NODE_PERMISSION_TOKENS$1$4();

    public HatchPermissionCatalogKt$NODE_PERMISSION_TOKENS$1$4() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        return Boolean.valueOf(new C7380Etd(context).A00.areNotificationsEnabled());
    }
}
