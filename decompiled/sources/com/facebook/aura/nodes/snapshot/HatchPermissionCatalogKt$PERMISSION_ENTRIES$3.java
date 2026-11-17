package com.facebook.aura.nodes.snapshot;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchPermissionCatalogKt$PERMISSION_ENTRIES$3 extends AbstractC7559F3s implements G0U<Context, Boolean> {
    public static final HatchPermissionCatalogKt$PERMISSION_ENTRIES$3 INSTANCE = new HatchPermissionCatalogKt$PERMISSION_ENTRIES$3();

    public HatchPermissionCatalogKt$PERMISSION_ENTRIES$3() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        Map<String, G0U<Context, Boolean>> map = HatchPermissionCatalogKt.NODE_PERMISSION_TOKENS;
        return Boolean.valueOf(AnonymousClass002.A1M(context.checkSelfPermission("android.permission.READ_CALENDAR")));
    }
}
