package com.google.android.gms.internal.location;

import X.AbstractC4119CnD;
import X.CSE;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes5.dex */
public final class zzdj extends IStatusCallback.Stub {
    public final /* synthetic */ CSE A00;
    public final /* synthetic */ Object A01;

    public zzdj(CSE cse, Object obj) {
        this.A01 = obj;
        this.A00 = cse;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void AVY(Status status) {
        AbstractC4119CnD.A00(status, this.A00, this.A01);
    }
}
