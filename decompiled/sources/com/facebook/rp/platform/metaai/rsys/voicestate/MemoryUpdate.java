package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MemoryUpdate extends C06G {

    @SerializedName("added_memories")
    public final NewMemory[] addedMemories;

    @SerializedName("memory_update_admin_text")
    public final String memoryUpdateAdminText;

    @SerializedName("removed_memories")
    public final StoredMemory[] removedMemories;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MemoryUpdate) {
                MemoryUpdate memoryUpdate = (MemoryUpdate) obj;
                if (!C7384Etj.areEqual(this.addedMemories, memoryUpdate.addedMemories) || !C7384Etj.areEqual(this.removedMemories, memoryUpdate.removedMemories) || !C7384Etj.areEqual(this.memoryUpdateAdminText, memoryUpdate.memoryUpdateAdminText)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MemoryUpdate copy$default(MemoryUpdate memoryUpdate, NewMemory[] newMemoryArr, StoredMemory[] storedMemoryArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            newMemoryArr = memoryUpdate.addedMemories;
        }
        if ((i & 2) != 0) {
            storedMemoryArr = memoryUpdate.removedMemories;
        }
        if ((i & 4) != 0) {
            str = memoryUpdate.memoryUpdateAdminText;
        }
        return new MemoryUpdate(newMemoryArr, storedMemoryArr, str);
    }

    public final NewMemory[] component1() {
        return this.addedMemories;
    }

    public final StoredMemory[] component2() {
        return this.removedMemories;
    }

    public final String component3() {
        return this.memoryUpdateAdminText;
    }

    public final MemoryUpdate copy(NewMemory[] newMemoryArr, StoredMemory[] storedMemoryArr, String str) {
        return new MemoryUpdate(newMemoryArr, storedMemoryArr, str);
    }

    public final NewMemory[] getAddedMemories() {
        return this.addedMemories;
    }

    public final String getMemoryUpdateAdminText() {
        return this.memoryUpdateAdminText;
    }

    public final StoredMemory[] getRemovedMemories() {
        return this.removedMemories;
    }

    public int hashCode() {
        NewMemory[] newMemoryArr = this.addedMemories;
        int iHashCode = (newMemoryArr == null ? 0 : Arrays.hashCode(newMemoryArr)) * 31;
        StoredMemory[] storedMemoryArr = this.removedMemories;
        return ((iHashCode + (storedMemoryArr == null ? 0 : Arrays.hashCode(storedMemoryArr))) * 31) + AnonymousClass005.A0H(this.memoryUpdateAdminText);
    }

    public String toString() {
        return FGI.A0k("MemoryUpdate(addedMemories=", Arrays.toString(this.addedMemories), ", removedMemories=", Arrays.toString(this.removedMemories), ", memoryUpdateAdminText=", this.memoryUpdateAdminText, ")");
    }

    public MemoryUpdate(NewMemory[] newMemoryArr, StoredMemory[] storedMemoryArr, String str) {
        this.addedMemories = newMemoryArr;
        this.removedMemories = storedMemoryArr;
        this.memoryUpdateAdminText = str;
    }
}
