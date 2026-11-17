package X;

import java.io.Serializable;

/* renamed from: X.Bwt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3071Bwt extends Hwm implements Serializable {
    public final Object zza;
    public final Object zzb;

    @Override // X.Hwm, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // X.Hwm, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    public C3071Bwt(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // X.Hwm, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw C8j3.A17();
    }
}
