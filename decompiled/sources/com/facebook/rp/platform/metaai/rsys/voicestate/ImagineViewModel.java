package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ImagineViewModel extends C06G {

    @SerializedName("imagine_raw_data")
    public final ImagineRawData[] imagineRawData;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImagineViewModel) && C7384Etj.areEqual(this.imagineRawData, ((ImagineViewModel) obj).imagineRawData));
    }

    public static /* synthetic */ ImagineViewModel copy$default(ImagineViewModel imagineViewModel, ImagineRawData[] imagineRawDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            imagineRawDataArr = imagineViewModel.imagineRawData;
        }
        return new ImagineViewModel(imagineRawDataArr);
    }

    public final ImagineRawData[] component1() {
        return this.imagineRawData;
    }

    public final ImagineViewModel copy(ImagineRawData[] imagineRawDataArr) {
        return new ImagineViewModel(imagineRawDataArr);
    }

    public final ImagineRawData[] getImagineRawData() {
        return this.imagineRawData;
    }

    public int hashCode() {
        ImagineRawData[] imagineRawDataArr = this.imagineRawData;
        if (imagineRawDataArr == null) {
            return 0;
        }
        return Arrays.hashCode(imagineRawDataArr);
    }

    public String toString() {
        return FGI.A0U("ImagineViewModel(imagineRawData=", Arrays.toString(this.imagineRawData), ")");
    }

    public ImagineViewModel(ImagineRawData[] imagineRawDataArr) {
        this.imagineRawData = imagineRawDataArr;
    }
}
