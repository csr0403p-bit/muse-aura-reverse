package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;

/* loaded from: classes5.dex */
public interface IStatusCallback extends IInterface {

    public abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.api.internal.IStatusCallback");
        }
    }

    void AVY(Status status);
}
