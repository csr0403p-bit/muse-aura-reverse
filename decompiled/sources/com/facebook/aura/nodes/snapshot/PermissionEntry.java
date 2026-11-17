package com.facebook.aura.nodes.snapshot;

import X.AnonymousClass005;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.key.DevicePermissionRowId;

/* loaded from: classes3.dex */
public final class PermissionEntry {
    public final G0U<Context, Boolean> isGranted;
    public final DevicePermissionRowId rowId;
    public final String tag;
    public final String userLabel;

    public final DevicePermissionRowId getRowId() {
        return this.rowId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUserLabel() {
        return this.userLabel;
    }

    public final G0U<Context, Boolean> isGranted() {
        return this.isGranted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionEntry(String str, DevicePermissionRowId devicePermissionRowId, String str2, G0U<? super Context, Boolean> g0u) {
        AnonymousClass005.A14(str, devicePermissionRowId, str2, g0u);
        this.tag = str;
        this.rowId = devicePermissionRowId;
        this.userLabel = str2;
        this.isGranted = g0u;
    }
}
