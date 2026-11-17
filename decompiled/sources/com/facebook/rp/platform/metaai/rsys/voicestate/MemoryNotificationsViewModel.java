package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MemoryNotificationsViewModel extends C06G {

    @SerializedName("memory_notifications_data")
    public final MemoryNotificationsData[] memoryNotificationsData;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MemoryNotificationsViewModel) && C7384Etj.areEqual(this.memoryNotificationsData, ((MemoryNotificationsViewModel) obj).memoryNotificationsData));
    }

    public static /* synthetic */ MemoryNotificationsViewModel copy$default(MemoryNotificationsViewModel memoryNotificationsViewModel, MemoryNotificationsData[] memoryNotificationsDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            memoryNotificationsDataArr = memoryNotificationsViewModel.memoryNotificationsData;
        }
        return new MemoryNotificationsViewModel(memoryNotificationsDataArr);
    }

    public final MemoryNotificationsData[] component1() {
        return this.memoryNotificationsData;
    }

    public final MemoryNotificationsViewModel copy(MemoryNotificationsData[] memoryNotificationsDataArr) {
        return new MemoryNotificationsViewModel(memoryNotificationsDataArr);
    }

    public final MemoryNotificationsData[] getMemoryNotificationsData() {
        return this.memoryNotificationsData;
    }

    public int hashCode() {
        MemoryNotificationsData[] memoryNotificationsDataArr = this.memoryNotificationsData;
        if (memoryNotificationsDataArr == null) {
            return 0;
        }
        return Arrays.hashCode(memoryNotificationsDataArr);
    }

    public String toString() {
        return FGI.A0U("MemoryNotificationsViewModel(memoryNotificationsData=", Arrays.toString(this.memoryNotificationsData), ")");
    }

    public MemoryNotificationsViewModel(MemoryNotificationsData[] memoryNotificationsDataArr) {
        this.memoryNotificationsData = memoryNotificationsDataArr;
    }
}
