package androidx.health.platform.client.impl.ipc;

import X.FGI;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public class ApiVersionException extends ExecutionException {
    public final int mMinVersion;
    public final int mRemoteVersion;

    public ApiVersionException(int i, int i2) {
        super(FGI.A0T("Version requirements for calling the method was not met, remoteVersion: ", ", minVersion: ", i, i2));
        this.mRemoteVersion = i;
        this.mMinVersion = i2;
    }
}
