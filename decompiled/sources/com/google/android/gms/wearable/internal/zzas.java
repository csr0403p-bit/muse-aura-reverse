package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV4;
import X.BV7;
import X.C3cG;
import X.C4157CoC;
import X.CRy;
import X.FGI;
import X.InterfaceC3641Caw;
import X.InterfaceC4097CmR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzas extends AbstractSafeParcelable implements InterfaceC4097CmR {
    public static final Parcelable.Creator<zzas> CREATOR = C4157CoC.A00(3);
    public final String A02;
    public final List A03;
    public final Object A01 = C3cG.A0T();
    public Set A00 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzas zzasVar = (zzas) obj;
                String str = this.A02;
                String str2 = zzasVar.A02;
                if (str != null) {
                    if (str.equals(str2)) {
                    }
                } else if (str2 != null) {
                    return false;
                }
                List list = this.A03;
                List list2 = zzasVar.A03;
                if (list != null) {
                    if (!list.equals(list2)) {
                    }
                } else if (list2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC4097CmR
    public final Set<InterfaceC3641Caw> AI8() {
        Set<InterfaceC3641Caw> setA0x;
        synchronized (this.A01) {
            setA0x = this.A00;
            if (setA0x == null) {
                setA0x = BV4.A0x(this.A03);
                this.A00 = setA0x;
            }
        }
        return setA0x;
    }

    @Override // X.InterfaceC4097CmR
    public final String getName() {
        return this.A02;
    }

    public final int hashCode() {
        int iA0I = BV7.A0I(this.A02);
        List list = this.A03;
        return ((iA0I + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return FGI.A0h("CapabilityInfo{", this.A02, ", ", String.valueOf(this.A03), "}");
    }

    public zzas(String str, List list) {
        this.A02 = str;
        this.A03 = list;
        CRy.A03(str);
        CRy.A03(list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A02, 2);
        AbstractC4100CmU.A0C(parcel, this.A03, 3);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
