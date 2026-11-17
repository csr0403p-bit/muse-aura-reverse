package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;

/* loaded from: classes6.dex */
public abstract class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public abstract void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState);

    public abstract void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo);
}
