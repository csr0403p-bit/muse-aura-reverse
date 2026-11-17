package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PhotoFileIdentity extends C06G {
    public final long dateModifiedSeconds;
    public final String displayName;
    public final String mimeType;
    public final long sizeBytes;

    public PhotoFileIdentity(String str, String str2, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        this.displayName = str;
        this.mimeType = str2;
        this.sizeBytes = j;
        this.dateModifiedSeconds = j2;
    }

    public static /* synthetic */ PhotoFileIdentity copy$default(PhotoFileIdentity photoFileIdentity, String str, String str2, long j, long j2, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        long j4 = j2;
        if ((i & 1) != 0) {
            str3 = photoFileIdentity.displayName;
        }
        if ((i & 2) != 0) {
            str4 = photoFileIdentity.mimeType;
        }
        if ((i & 4) != 0) {
            j3 = photoFileIdentity.sizeBytes;
        }
        if ((i & 8) != 0) {
            j4 = photoFileIdentity.dateModifiedSeconds;
        }
        C7384Etj.A0Y(str3, 0);
        return new PhotoFileIdentity(str3, str4, j3, j4);
    }

    public final PhotoFileIdentity copy(String str, String str2, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        return new PhotoFileIdentity(str, str2, j, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoFileIdentity) {
                PhotoFileIdentity photoFileIdentity = (PhotoFileIdentity) obj;
                if (!C7384Etj.areEqual(this.displayName, photoFileIdentity.displayName) || !C7384Etj.areEqual(this.mimeType, photoFileIdentity.mimeType) || this.sizeBytes != photoFileIdentity.sizeBytes || this.dateModifiedSeconds != photoFileIdentity.dateModifiedSeconds) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.mimeType;
    }

    public final long component3() {
        return this.sizeBytes;
    }

    public final long component4() {
        return this.dateModifiedSeconds;
    }

    public final long getDateModifiedSeconds() {
        return this.dateModifiedSeconds;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.sizeBytes, (AnonymousClass001.A0G(this.displayName) + AnonymousClass006.A0G(this.mimeType)) * 31) + C3cG.A02(this.dateModifiedSeconds);
    }

    public String toString() {
        return super.toString();
    }
}
