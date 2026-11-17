package com.facebook.maps.basemap;

import X.ALM;
import X.BFI;
import X.BSH;
import X.C7384Etj;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.aura.file.docx.DocxParser;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import java.util.Set;

/* loaded from: classes4.dex */
public final class BaseMapSavedState extends View.BaseSavedState {
    public static final Set<String> A01 = BFI.A0H(new String[]{GeofenceEventWorker.KEY_LATITUDE, GeofenceEventWorker.KEY_LONGITUDE, "altitude", "zoom", "pitch", DocxParser.HEADING_STYLE_PREFIX});
    public static final Parcelable.Creator<BaseMapSavedState> CREATOR = new BSH(5);
    public final Bundle A00;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.A00);
    }

    public BaseMapSavedState(Parcel parcel) {
        super(parcel);
        Bundle bundle = parcel.readBundle(BaseMapSavedState.class.getClassLoader());
        this.A00 = bundle == null ? new Bundle() : bundle;
    }

    public BaseMapSavedState(Parcelable parcelable, ALM alm) {
        super(parcelable);
        Bundle bundle = new Bundle();
        bundle.putInt("version", 1);
        if (alm != null) {
            bundle.putBoolean("has_camera", true);
            bundle.putDouble(GeofenceEventWorker.KEY_LATITUDE, alm.A02);
            bundle.putDouble(GeofenceEventWorker.KEY_LONGITUDE, alm.A03);
            bundle.putDouble("altitude", alm.A00);
            bundle.putDouble("zoom", alm.A05);
            bundle.putDouble("pitch", alm.A04);
            bundle.putDouble(DocxParser.HEADING_STYLE_PREFIX, alm.A01);
            bundle.putDoubleArray("padding", alm.A06);
        }
        this.A00 = bundle;
    }
}
