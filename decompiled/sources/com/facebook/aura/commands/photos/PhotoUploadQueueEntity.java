package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class PhotoUploadQueueEntity extends C06G {
    public final String batchId;
    public final long enqueuedAt;
    public final String failureReason;
    public final long lastAttemptAt;
    public final String mediaUri;
    public final long nextRetryAt;
    public final String state;
    public final int strikeCount;

    public static /* synthetic */ PhotoUploadQueueEntity copy$default(PhotoUploadQueueEntity photoUploadQueueEntity, String str, String str2, String str3, int i, long j, long j2, long j3, String str4, int i2, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        int i3 = i;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        String str8 = str4;
        if ((i2 & 1) != 0) {
            str5 = photoUploadQueueEntity.mediaUri;
        }
        if ((i2 & 2) != 0) {
            str6 = photoUploadQueueEntity.batchId;
        }
        if ((i2 & 4) != 0) {
            str7 = photoUploadQueueEntity.state;
        }
        if ((i2 & 8) != 0) {
            i3 = photoUploadQueueEntity.strikeCount;
        }
        if ((i2 & 16) != 0) {
            j4 = photoUploadQueueEntity.nextRetryAt;
        }
        if ((i2 & 32) != 0) {
            j5 = photoUploadQueueEntity.lastAttemptAt;
        }
        if ((i2 & 64) != 0) {
            j6 = photoUploadQueueEntity.enqueuedAt;
        }
        if ((i2 & 128) != 0) {
            str8 = photoUploadQueueEntity.failureReason;
        }
        AnonymousClass005.A0x(str5, str6, str7);
        return new PhotoUploadQueueEntity(str5, str6, str7, i3, j4, j5, j6, str8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoUploadQueueEntity) {
                PhotoUploadQueueEntity photoUploadQueueEntity = (PhotoUploadQueueEntity) obj;
                if (!C7384Etj.areEqual(this.mediaUri, photoUploadQueueEntity.mediaUri) || !C7384Etj.areEqual(this.batchId, photoUploadQueueEntity.batchId) || !C7384Etj.areEqual(this.state, photoUploadQueueEntity.state) || this.strikeCount != photoUploadQueueEntity.strikeCount || this.nextRetryAt != photoUploadQueueEntity.nextRetryAt || this.lastAttemptAt != photoUploadQueueEntity.lastAttemptAt || this.enqueuedAt != photoUploadQueueEntity.enqueuedAt || !C7384Etj.areEqual(this.failureReason, photoUploadQueueEntity.failureReason)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.mediaUri;
    }

    public final String component2() {
        return this.batchId;
    }

    public final String component3() {
        return this.state;
    }

    public final int component4() {
        return this.strikeCount;
    }

    public final long component5() {
        return this.nextRetryAt;
    }

    public final long component6() {
        return this.lastAttemptAt;
    }

    public final long component7() {
        return this.enqueuedAt;
    }

    public final String component8() {
        return this.failureReason;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final long getEnqueuedAt() {
        return this.enqueuedAt;
    }

    public final String getFailureReason() {
        return this.failureReason;
    }

    public final long getLastAttemptAt() {
        return this.lastAttemptAt;
    }

    public final String getMediaUri() {
        return this.mediaUri;
    }

    public final long getNextRetryAt() {
        return this.nextRetryAt;
    }

    public final String getState() {
        return this.state;
    }

    public final int getStrikeCount() {
        return this.strikeCount;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.enqueuedAt, AnonymousClass006.A06(this.lastAttemptAt, AnonymousClass006.A06(this.nextRetryAt, (AnonymousClass005.A0I(this.state, AnonymousClass005.A0I(this.batchId, AnonymousClass001.A0G(this.mediaUri))) + this.strikeCount) * 31))) + AnonymousClass006.A0G(this.failureReason);
    }

    public PhotoUploadQueueEntity(String str, String str2, String str3, int i, long j, long j2, long j3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.mediaUri = str;
        this.batchId = str2;
        this.state = str3;
        this.strikeCount = i;
        this.nextRetryAt = j;
        this.lastAttemptAt = j2;
        this.enqueuedAt = j3;
        this.failureReason = str4;
    }

    public final PhotoUploadQueueEntity copy(String str, String str2, String str3, int i, long j, long j2, long j3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PhotoUploadQueueEntity(str, str2, str3, i, j, j2, j3, str4);
    }

    public String toString() {
        return super.toString();
    }
}
