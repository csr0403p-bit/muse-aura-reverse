package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.C3cI;
import X.C4157CoC;
import X.FGI;
import X.InterfaceC3987Ciw;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = C4157CoC.A00(4);
    public final int A00;
    public final int A01;
    public final int A02;
    public final zzbu A03;

    public final void A00(InterfaceC3987Ciw interfaceC3987Ciw) {
        int i = this.A00;
        if (i == 1) {
            interfaceC3987Ciw.onChannelOpened(this.A03);
            return;
        }
        if (i == 2) {
            interfaceC3987Ciw.onChannelClosed(this.A03, this.A01, this.A02);
            return;
        }
        if (i == 3) {
            interfaceC3987Ciw.onInputClosed(this.A03, this.A01, this.A02);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", FGI.A0H("Unknown type: ", i));
        } else {
            interfaceC3987Ciw.onOutputClosed(this.A03, this.A01, this.A02);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.A03);
        int i = this.A00;
        String string = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.A01;
        String string2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.A02;
        StringBuilder sbA0x = C3cI.A0x("ChannelEventParcelable[, channel=", strValueOf);
        sbA0x.append(", type=");
        sbA0x.append(string);
        sbA0x.append(", closeReason=");
        sbA0x.append(string2);
        sbA0x.append(", appErrorCode=");
        sbA0x.append(i3);
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public zzbj(zzbu zzbuVar, int i, int i2, int i3) {
        this.A03 = zzbuVar;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A09(parcel, this.A03, 2, i);
        AbstractC4100CmU.A06(parcel, 3, this.A00);
        AbstractC4100CmU.A06(parcel, 4, this.A01);
        AbstractC4100CmU.A06(parcel, 5, this.A02);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
