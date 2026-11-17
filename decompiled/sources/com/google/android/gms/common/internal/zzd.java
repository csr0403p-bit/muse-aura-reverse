package com.google.android.gms.common.internal;

import X.AbstractC4160CoH;
import com.google.android.gms.internal.common.zzb;

/* loaded from: classes5.dex */
public final class zzd extends zzb implements IGmsCallbacks {
    public AbstractC4160CoH A00;
    public final int A01;

    public zzd() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public zzd(AbstractC4160CoH abstractC4160CoH, int i) {
        this();
        this.A00 = abstractC4160CoH;
        this.A01 = i;
    }
}
