package com.google.android.play.core.review;

import X.BV4;
import X.BV8;
import X.FGI;
import android.app.PendingIntent;

/* loaded from: classes5.dex */
public final class zza extends ReviewInfo {
    public final PendingIntent A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ReviewInfo) {
                zza zzaVar = (zza) ((ReviewInfo) obj);
                if (!this.A00.equals(zzaVar.A00) || this.A01 != zzaVar.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV8.A0A(this.A00) ^ (true != this.A01 ? 1237 : 1231);
    }

    public final String toString() {
        return FGI.A0n("ReviewInfo{pendingIntent=", this.A00.toString(), ", isNoOp=", "}", this.A01);
    }

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw BV4.A0a("Null pendingIntent");
        }
        this.A00 = pendingIntent;
        this.A01 = z;
    }
}
