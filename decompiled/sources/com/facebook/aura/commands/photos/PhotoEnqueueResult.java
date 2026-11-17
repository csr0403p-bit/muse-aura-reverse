package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PhotoEnqueueResult extends C06G {
    public final int accepted;
    public final String batchId;
    public final int notFound;

    public PhotoEnqueueResult(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.batchId = str;
        this.accepted = i;
        this.notFound = i2;
    }

    public final PhotoEnqueueResult copy(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        return new PhotoEnqueueResult(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoEnqueueResult) {
                PhotoEnqueueResult photoEnqueueResult = (PhotoEnqueueResult) obj;
                if (!C7384Etj.areEqual(this.batchId, photoEnqueueResult.batchId) || this.accepted != photoEnqueueResult.accepted || this.notFound != photoEnqueueResult.notFound) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PhotoEnqueueResult copy$default(PhotoEnqueueResult photoEnqueueResult, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = photoEnqueueResult.batchId;
        }
        if ((i3 & 2) != 0) {
            i = photoEnqueueResult.accepted;
        }
        if ((i3 & 4) != 0) {
            i2 = photoEnqueueResult.notFound;
        }
        return photoEnqueueResult.copy(str, i, i2);
    }

    public final String component1() {
        return this.batchId;
    }

    public final int component2() {
        return this.accepted;
    }

    public final int component3() {
        return this.notFound;
    }

    public final int getAccepted() {
        return this.accepted;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final int getNotFound() {
        return this.notFound;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.batchId) + this.accepted) * 31) + this.notFound;
    }

    public String toString() {
        return super.toString();
    }
}
