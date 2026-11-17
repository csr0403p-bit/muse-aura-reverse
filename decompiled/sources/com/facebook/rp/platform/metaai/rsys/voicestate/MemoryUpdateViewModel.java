package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass006;
import X.C06G;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class MemoryUpdateViewModel extends C06G {

    @SerializedName("memory_disclosure")
    public final MemoryDisclosure memoryDisclosure;

    @SerializedName("memory_update")
    public final MemoryUpdate memoryUpdate;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MemoryUpdateViewModel) {
                MemoryUpdateViewModel memoryUpdateViewModel = (MemoryUpdateViewModel) obj;
                if (!C7384Etj.areEqual(this.memoryDisclosure, memoryUpdateViewModel.memoryDisclosure) || !C7384Etj.areEqual(this.memoryUpdate, memoryUpdateViewModel.memoryUpdate)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MemoryUpdateViewModel copy$default(MemoryUpdateViewModel memoryUpdateViewModel, MemoryDisclosure memoryDisclosure, MemoryUpdate memoryUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            memoryDisclosure = memoryUpdateViewModel.memoryDisclosure;
        }
        if ((i & 2) != 0) {
            memoryUpdate = memoryUpdateViewModel.memoryUpdate;
        }
        return new MemoryUpdateViewModel(memoryDisclosure, memoryUpdate);
    }

    public final MemoryDisclosure component1() {
        return this.memoryDisclosure;
    }

    public final MemoryUpdate component2() {
        return this.memoryUpdate;
    }

    public final MemoryUpdateViewModel copy(MemoryDisclosure memoryDisclosure, MemoryUpdate memoryUpdate) {
        return new MemoryUpdateViewModel(memoryDisclosure, memoryUpdate);
    }

    public final MemoryDisclosure getMemoryDisclosure() {
        return this.memoryDisclosure;
    }

    public final MemoryUpdate getMemoryUpdate() {
        return this.memoryUpdate;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.memoryDisclosure) * 31) + C3cH.A02(this.memoryUpdate);
    }

    public String toString() {
        return C3cJ.A0L(this.memoryUpdate, ", memoryUpdate=", C3cG.A0f(this.memoryDisclosure, "MemoryUpdateViewModel(memoryDisclosure="));
    }

    public MemoryUpdateViewModel(MemoryDisclosure memoryDisclosure, MemoryUpdate memoryUpdate) {
        this.memoryDisclosure = memoryDisclosure;
        this.memoryUpdate = memoryUpdate;
    }
}
