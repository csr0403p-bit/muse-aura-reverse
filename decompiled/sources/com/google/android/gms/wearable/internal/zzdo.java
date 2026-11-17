package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cH;
import X.C4157CoC;
import X.C60O;
import X.CRy;
import X.FGI;
import X.InterfaceC3988Cj7;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzdo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdo> CREATOR = C4157CoC.A00(13);
    public byte[] A00;
    public final Uri A01;
    public final Map A02;

    public final String toString() {
        String str;
        boolean zA1U = BV4.A1U("DataItem");
        StringBuilder sbA0x = C60O.A0x("DataItemParcelable[@");
        BV4.A1N(sbA0x, hashCode());
        byte[] bArr = this.A00;
        sbA0x.append(",dataSz=".concat((bArr == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : Integer.valueOf(bArr.length)).toString()));
        Map map = this.A02;
        sbA0x.append(FGI.A0H(", numAssets=", map.size()));
        sbA0x.append(", uri=".concat(BV7.A0w(this.A01)));
        if (zA1U) {
            sbA0x.append("]\n  assets: ");
            Iterator itA11 = BV5.A11(map);
            while (itA11.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itA11);
                sbA0x.append(FGI.A0d("\n    ", strA0j, ": ", String.valueOf(map.get(strA0j))));
            }
            str = "\n  ]";
        } else {
            str = "]";
        }
        return AnonymousClass001.A0v(str, sbA0x);
    }

    public zzdo(Uri uri, Bundle bundle, byte[] bArr) {
        this.A01 = uri;
        HashMap mapA0u = BV4.A0u();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        CRy.A03(classLoader);
        bundle.setClassLoader(classLoader);
        Iterator itA0w = BV5.A0w(bundle);
        while (itA0w.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itA0w);
            Parcelable parcelable = bundle.getParcelable(strA0j);
            CRy.A03(parcelable);
            mapA0u.put(strA0j, parcelable);
        }
        this.A02 = mapA0u;
        this.A00 = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A09(parcel, this.A01, 2, i);
        Bundle bundleA0N = BV6.A0N();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        CRy.A03(classLoader);
        bundleA0N.setClassLoader(classLoader);
        Iterator itA0n = AnonymousClass002.A0n(this.A02);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            bundleA0N.putParcelable(C60O.A0t(entryA0l), new DataItemAssetParcelable((InterfaceC3988Cj7) entryA0l.getValue()));
        }
        AbstractC4100CmU.A02(bundleA0N, parcel, 4);
        AbstractC4100CmU.A0D(parcel, this.A00, 5);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
