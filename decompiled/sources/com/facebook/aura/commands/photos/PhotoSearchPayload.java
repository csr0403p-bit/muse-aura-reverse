package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C60R;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class PhotoSearchPayload extends C06G {
    public final PhotoAccessScope accessScope;
    public final boolean hasMore;
    public final boolean locationAvailable;
    public final int offset;
    public final List<PhotoEntry> photos;
    public final String platform;
    public final long syncedAt;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoSearchPayload) {
                PhotoSearchPayload photoSearchPayload = (PhotoSearchPayload) obj;
                if (!C7384Etj.areEqual(this.platform, photoSearchPayload.platform) || this.syncedAt != photoSearchPayload.syncedAt || this.accessScope != photoSearchPayload.accessScope || this.locationAvailable != photoSearchPayload.locationAvailable || this.hasMore != photoSearchPayload.hasMore || this.offset != photoSearchPayload.offset || !C7384Etj.areEqual(this.photos, photoSearchPayload.photos)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PhotoSearchPayload(String str, long j, PhotoAccessScope photoAccessScope, boolean z, boolean z2, int i, List list, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "android" : str, j, photoAccessScope, z, z2, i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoSearchPayload copy$default(PhotoSearchPayload photoSearchPayload, String str, long j, PhotoAccessScope photoAccessScope, boolean z, boolean z2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = photoSearchPayload.platform;
        }
        if ((i2 & 2) != 0) {
            j = photoSearchPayload.syncedAt;
        }
        if ((i2 & 4) != 0) {
            photoAccessScope = photoSearchPayload.accessScope;
        }
        if ((i2 & 8) != 0) {
            z = photoSearchPayload.locationAvailable;
        }
        if ((i2 & 16) != 0) {
            z2 = photoSearchPayload.hasMore;
        }
        if ((i2 & 32) != 0) {
            i = photoSearchPayload.offset;
        }
        if ((i2 & 64) != 0) {
            list = photoSearchPayload.photos;
        }
        return photoSearchPayload.copy(str, j, photoAccessScope, z, z2, i, list);
    }

    public final String component1() {
        return this.platform;
    }

    public final long component2() {
        return this.syncedAt;
    }

    public final PhotoAccessScope component3() {
        return this.accessScope;
    }

    public final boolean component4() {
        return this.locationAvailable;
    }

    public final boolean component5() {
        return this.hasMore;
    }

    public final int component6() {
        return this.offset;
    }

    public final List<PhotoEntry> component7() {
        return this.photos;
    }

    public final PhotoAccessScope getAccessScope() {
        return this.accessScope;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getLocationAvailable() {
        return this.locationAvailable;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<PhotoEntry> getPhotos() {
        return this.photos;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final long getSyncedAt() {
        return this.syncedAt;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.photos, (C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.accessScope, C60R.A00(this.syncedAt, AnonymousClass001.A0G(this.platform))), this.locationAvailable), this.hasMore) + this.offset) * 31);
    }

    public final PhotoSearchPayload copy(String str, long j, PhotoAccessScope photoAccessScope, boolean z, boolean z2, int i, List<PhotoEntry> list) {
        AnonymousClass003.A0v(str, photoAccessScope);
        C7384Etj.A0Y(list, 6);
        return new PhotoSearchPayload(str, j, photoAccessScope, z, z2, i, list);
    }

    public String toString() {
        return super.toString();
    }

    public PhotoSearchPayload(String str, long j, PhotoAccessScope photoAccessScope, boolean z, boolean z2, int i, List<PhotoEntry> list) {
        AnonymousClass003.A0v(str, photoAccessScope);
        C7384Etj.A0Y(list, 6);
        this.platform = str;
        this.syncedAt = j;
        this.accessScope = photoAccessScope;
        this.locationAvailable = z;
        this.hasMore = z2;
        this.offset = i;
        this.photos = list;
    }
}
