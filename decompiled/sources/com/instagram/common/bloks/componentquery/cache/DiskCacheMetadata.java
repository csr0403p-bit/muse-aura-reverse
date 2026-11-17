package com.instagram.common.bloks.componentquery.cache;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.C8j4;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class DiskCacheMetadata implements Serializable {
    public static final long serialVersionUID = -3756760883807219155L;
    public final BloksComponentQueryResources resources;
    public final long responseCreatedTimestampMs;
    public final long responseWallClockTimestampMs;

    public static /* synthetic */ DiskCacheMetadata copy$default(DiskCacheMetadata diskCacheMetadata, long j, BloksComponentQueryResources bloksComponentQueryResources, long j2, int i, Object obj) {
        long j3 = j;
        BloksComponentQueryResources bloksComponentQueryResources2 = bloksComponentQueryResources;
        long j4 = j2;
        if ((i & 1) != 0) {
            j3 = diskCacheMetadata.responseCreatedTimestampMs;
        }
        if ((i & 2) != 0) {
            bloksComponentQueryResources2 = diskCacheMetadata.resources;
        }
        if ((i & 4) != 0) {
            j4 = diskCacheMetadata.responseWallClockTimestampMs;
        }
        return new DiskCacheMetadata(j3, bloksComponentQueryResources2, j4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiskCacheMetadata) {
                DiskCacheMetadata diskCacheMetadata = (DiskCacheMetadata) obj;
                if (this.responseCreatedTimestampMs != diskCacheMetadata.responseCreatedTimestampMs || !C7384Etj.areEqual(this.resources, diskCacheMetadata.resources) || this.responseWallClockTimestampMs != diskCacheMetadata.responseWallClockTimestampMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final long component1() {
        return this.responseCreatedTimestampMs;
    }

    public final BloksComponentQueryResources component2() {
        return this.resources;
    }

    public final long component3() {
        return this.responseWallClockTimestampMs;
    }

    public final DiskCacheMetadata copy(long j, BloksComponentQueryResources bloksComponentQueryResources, long j2) {
        return new DiskCacheMetadata(j, bloksComponentQueryResources, j2);
    }

    public final BloksComponentQueryResources getResources() {
        return this.resources;
    }

    public final long getResponseCreatedTimestampMs() {
        return this.responseCreatedTimestampMs;
    }

    public final long getResponseWallClockTimestampMs() {
        return this.responseWallClockTimestampMs;
    }

    public int hashCode() {
        return C8j4.A0B(this.responseWallClockTimestampMs, (AnonymousClass005.A07(this.responseCreatedTimestampMs) + AnonymousClass006.A0D(this.resources)) * 31);
    }

    public String toString() {
        long j = this.responseCreatedTimestampMs;
        BloksComponentQueryResources bloksComponentQueryResources = this.resources;
        long j2 = this.responseWallClockTimestampMs;
        StringBuilder sbA0z = C60O.A0z("DiskCacheMetadata(responseCreatedTimestampMs=", j);
        sbA0z.append(", resources=");
        sbA0z.append(bloksComponentQueryResources);
        sbA0z.append(", responseWallClockTimestampMs=");
        sbA0z.append(j2);
        return BV7.A10(sbA0z);
    }

    public DiskCacheMetadata(long j, BloksComponentQueryResources bloksComponentQueryResources, long j2) {
        this.responseCreatedTimestampMs = j;
        this.resources = bloksComponentQueryResources;
        this.responseWallClockTimestampMs = j2;
    }

    public /* synthetic */ DiskCacheMetadata(long j, BloksComponentQueryResources bloksComponentQueryResources, long j2, int i, C06H c06h) {
        this(j, bloksComponentQueryResources, (i & 4) != 0 ? 0L : j2);
    }
}
