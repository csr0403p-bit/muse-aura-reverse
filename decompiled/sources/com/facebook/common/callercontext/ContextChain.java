package com.facebook.common.callercontext;

import X.BSH;
import X.C6xC;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new BSH(4);
    public String A00;
    public Map<String, Object> A01;
    public String A02;
    public final ContextChain A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ContextChain contextChain = (ContextChain) obj;
                if (!C6xC.A00(this.A00, contextChain.A00) || !C6xC.A00(this.A03, contextChain.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00});
    }

    public final String toString() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        String str2 = this.A00;
        this.A02 = str2;
        ContextChain contextChain = this.A03;
        if (contextChain == null) {
            return str2;
        }
        String strA0O = FGI.A0O(contextChain.toString(), this.A02, '/');
        this.A02 = strA0O;
        return strA0O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A03, i);
    }

    public ContextChain(ContextChain contextChain, String str, String str2) {
        Map<String, Object> map;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = FGI.A0U(str, ":", str2);
        this.A03 = contextChain;
        if (contextChain == null || (map = contextChain.A01) == null) {
            return;
        }
        this.A01 = new ConcurrentHashMap(map);
    }

    public ContextChain(ContextChain contextChain, String str) {
        this.A05 = "serialized_tag";
        this.A04 = "serialized_name";
        this.A00 = str;
        this.A03 = contextChain;
        Map<String, Object> map = contextChain.A01;
        if (map != null) {
            this.A01 = new ConcurrentHashMap(map);
        }
    }

    public ContextChain(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }
}
