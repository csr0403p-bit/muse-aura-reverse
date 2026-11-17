package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ReelsViewModel extends C06G {

    @SerializedName("reels_data")
    public final ReelsData[] reelsData;

    @SerializedName("reels_urls")
    public final String[] reelsUrls;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsViewModel) {
                ReelsViewModel reelsViewModel = (ReelsViewModel) obj;
                if (!C7384Etj.areEqual(this.reelsUrls, reelsViewModel.reelsUrls) || !C7384Etj.areEqual(this.reelsData, reelsViewModel.reelsData)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReelsViewModel copy$default(ReelsViewModel reelsViewModel, String[] strArr, ReelsData[] reelsDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = reelsViewModel.reelsUrls;
        }
        if ((i & 2) != 0) {
            reelsDataArr = reelsViewModel.reelsData;
        }
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public final String[] component1() {
        return this.reelsUrls;
    }

    public final ReelsData[] component2() {
        return this.reelsData;
    }

    public final ReelsViewModel copy(String[] strArr, ReelsData[] reelsDataArr) {
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public final ReelsData[] getReelsData() {
        return this.reelsData;
    }

    public final String[] getReelsUrls() {
        return this.reelsUrls;
    }

    public int hashCode() {
        String[] strArr = this.reelsUrls;
        int iHashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        ReelsData[] reelsDataArr = this.reelsData;
        return iHashCode + (reelsDataArr != null ? Arrays.hashCode(reelsDataArr) : 0);
    }

    public String toString() {
        return FGI.A0h("ReelsViewModel(reelsUrls=", Arrays.toString(this.reelsUrls), ", reelsData=", Arrays.toString(this.reelsData), ")");
    }

    public ReelsViewModel(String[] strArr, ReelsData[] reelsDataArr) {
        this.reelsUrls = strArr;
        this.reelsData = reelsDataArr;
    }
}
