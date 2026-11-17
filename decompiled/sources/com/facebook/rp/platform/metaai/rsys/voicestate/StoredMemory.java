package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class StoredMemory extends C06G {

    @SerializedName("memory_id")
    public final Long memoryId;

    @SerializedName("memory_text")
    public final String memoryText;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoredMemory) {
                StoredMemory storedMemory = (StoredMemory) obj;
                if (!C7384Etj.areEqual(this.memoryId, storedMemory.memoryId) || !C7384Etj.areEqual(this.memoryText, storedMemory.memoryText)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StoredMemory copy$default(StoredMemory storedMemory, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = storedMemory.memoryId;
        }
        if ((i & 2) != 0) {
            str = storedMemory.memoryText;
        }
        return new StoredMemory(l, str);
    }

    public final Long component1() {
        return this.memoryId;
    }

    public final String component2() {
        return this.memoryText;
    }

    public final StoredMemory copy(Long l, String str) {
        return new StoredMemory(l, str);
    }

    public final Long getMemoryId() {
        return this.memoryId;
    }

    public final String getMemoryText() {
        return this.memoryText;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.memoryId) * 31) + AnonymousClass005.A0H(this.memoryText);
    }

    public String toString() {
        return C3cJ.A0N(", memoryText=", this.memoryText, C3cG.A0f(this.memoryId, "StoredMemory(memoryId="));
    }

    public StoredMemory(Long l, String str) {
        this.memoryId = l;
        this.memoryText = str;
    }
}
