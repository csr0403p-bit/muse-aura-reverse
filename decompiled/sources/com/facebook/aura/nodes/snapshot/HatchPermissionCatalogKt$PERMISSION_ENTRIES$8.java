package com.facebook.aura.nodes.snapshot;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.commands.core.NotificationAccessUtils;

/* loaded from: classes3.dex */
public final class HatchPermissionCatalogKt$PERMISSION_ENTRIES$8 extends AbstractC7559F3s implements G0U<Context, Boolean> {
    public static final HatchPermissionCatalogKt$PERMISSION_ENTRIES$8 INSTANCE = new HatchPermissionCatalogKt$PERMISSION_ENTRIES$8();

    public HatchPermissionCatalogKt$PERMISSION_ENTRIES$8() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        return Boolean.valueOf(NotificationAccessUtils.INSTANCE.isNotificationAccessGranted(context));
    }
}
