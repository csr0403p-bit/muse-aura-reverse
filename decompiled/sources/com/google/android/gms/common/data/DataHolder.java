package com.google.android.gms.common.data;

import X.AbstractC4100CmU;
import X.C2394BYw;
import X.C4158CoD;
import X.C60O;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

@KeepName
/* loaded from: classes5.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public int A00;
    public Bundle A01;
    public boolean A02 = false;
    public int[] A03;
    public final int A04;
    public final int A05;
    public final Bundle A06;
    public final CursorWindow[] A07;
    public final String[] A08;
    public static final Parcelable.Creator<DataHolder> CREATOR = C4158CoD.A03(23);
    public static final C2394BYw A09 = new C2394BYw(new String[0]);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A07;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        if (this.A07.length > 0) {
            synchronized (this) {
                z = this.A02;
            }
            if (z) {
                return;
            }
            close();
            Log.e("DataBuffer", C60O.A0r("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", toString()));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.A08;
        int iA00 = AbstractC4100CmU.A00(parcel);
        if (strArr != null) {
            int iA01 = AbstractC4100CmU.A01(parcel, 1);
            parcel.writeStringArray(strArr);
            AbstractC4100CmU.A05(parcel, iA01);
        }
        AbstractC4100CmU.A0E(parcel, this.A07, 2, i);
        AbstractC4100CmU.A06(parcel, 3, this.A05);
        AbstractC4100CmU.A02(this.A06, parcel, 4);
        AbstractC4100CmU.A06(parcel, 1000, this.A04);
        AbstractC4100CmU.A05(parcel, iA00);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i, int i2) {
        this.A04 = i;
        this.A08 = strArr;
        this.A07 = cursorWindowArr;
        this.A05 = i2;
        this.A06 = bundle;
    }
}
