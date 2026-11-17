package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C8j4;

/* loaded from: classes5.dex */
public final class PhotoLabelEntity extends C06G {
    public final long dateModifiedSeconds;
    public final long labeledAt;
    public final String labels;
    public final String mediaUri;
    public final long sizeBytes;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoLabelEntity) {
                PhotoLabelEntity photoLabelEntity = (PhotoLabelEntity) obj;
                if (!C7384Etj.areEqual(this.mediaUri, photoLabelEntity.mediaUri) || this.sizeBytes != photoLabelEntity.sizeBytes || this.dateModifiedSeconds != photoLabelEntity.dateModifiedSeconds || !C7384Etj.areEqual(this.labels, photoLabelEntity.labels) || this.labeledAt != photoLabelEntity.labeledAt) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PhotoLabelEntity copy$default(PhotoLabelEntity photoLabelEntity, String str, long j, long j2, String str2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoLabelEntity.mediaUri;
        }
        if ((i & 2) != 0) {
            j = photoLabelEntity.sizeBytes;
        }
        if ((i & 4) != 0) {
            j2 = photoLabelEntity.dateModifiedSeconds;
        }
        if ((i & 8) != 0) {
            str2 = photoLabelEntity.labels;
        }
        if ((i & 16) != 0) {
            j3 = photoLabelEntity.labeledAt;
        }
        return photoLabelEntity.copy(str, j, j2, str2, j3);
    }

    public final String component1() {
        return this.mediaUri;
    }

    public final long component2() {
        return this.sizeBytes;
    }

    public final long component3() {
        return this.dateModifiedSeconds;
    }

    public final String component4() {
        return this.labels;
    }

    public final long component5() {
        return this.labeledAt;
    }

    public final long getDateModifiedSeconds() {
        return this.dateModifiedSeconds;
    }

    public final long getLabeledAt() {
        return this.labeledAt;
    }

    public final String getLabels() {
        return this.labels;
    }

    public final String getMediaUri() {
        return this.mediaUri;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public int hashCode() {
        return C8j4.A0B(this.labeledAt, AnonymousClass005.A0I(this.labels, AnonymousClass006.A06(this.dateModifiedSeconds, AnonymousClass006.A06(this.sizeBytes, AnonymousClass001.A0G(this.mediaUri)))));
    }

    public PhotoLabelEntity(String str, long j, long j2, String str2, long j3) {
        AnonymousClass003.A0w(str, str2);
        this.mediaUri = str;
        this.sizeBytes = j;
        this.dateModifiedSeconds = j2;
        this.labels = str2;
        this.labeledAt = j3;
    }

    public final PhotoLabelEntity copy(String str, long j, long j2, String str2, long j3) {
        AnonymousClass003.A0w(str, str2);
        return new PhotoLabelEntity(str, j, j2, str2, j3);
    }

    public String toString() {
        return super.toString();
    }
}
