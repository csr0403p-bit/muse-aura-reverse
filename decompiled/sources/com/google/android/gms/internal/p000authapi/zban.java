package com.google.android.gms.internal.p000authapi;

import X.AbstractC4119CnD;
import X.CSE;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes5.dex */
public final class zban extends IStatusCallback.Stub {
    public final /* synthetic */ CSE A00;

    public zban(CSE cse) {
        this.A00 = cse;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void AVY(Status status) {
        AbstractC4119CnD.A00(status, this.A00, null);
    }
}
