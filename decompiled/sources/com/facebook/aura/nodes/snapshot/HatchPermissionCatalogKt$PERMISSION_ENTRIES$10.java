package com.facebook.aura.nodes.snapshot;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.commands.core.PhotoAccessUtils;

/* loaded from: classes3.dex */
public final class HatchPermissionCatalogKt$PERMISSION_ENTRIES$10 extends AbstractC7559F3s implements G0U<Context, Boolean> {
    public static final HatchPermissionCatalogKt$PERMISSION_ENTRIES$10 INSTANCE = new HatchPermissionCatalogKt$PERMISSION_ENTRIES$10();

    public HatchPermissionCatalogKt$PERMISSION_ENTRIES$10() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        return Boolean.valueOf(PhotoAccessUtils.INSTANCE.isReadGranted(context));
    }
}
