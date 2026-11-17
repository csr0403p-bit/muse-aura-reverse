package com.instagram.common.bloks.componentquery.cache;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C8j4;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class ComponentQueryDiskCacheRecord implements Serializable {
    public static final long serialVersionUID = 1;
    public final DiskCacheData data;
    public final BloksComponentQueryResources resources;
    public final long responseTimestampMs;
    public final long responseWallClockTimestampMs;

    public ComponentQueryDiskCacheRecord(DiskCacheData diskCacheData, long j, BloksComponentQueryResources bloksComponentQueryResources, long j2) {
        C7384Etj.A0Y(diskCacheData, 0);
        this.data = diskCacheData;
        this.responseTimestampMs = j;
        this.resources = bloksComponentQueryResources;
        this.responseWallClockTimestampMs = j2;
    }

    public static /* synthetic */ ComponentQueryDiskCacheRecord copy$default(ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord, DiskCacheData diskCacheData, long j, BloksComponentQueryResources bloksComponentQueryResources, long j2, int i, Object obj) {
        DiskCacheData diskCacheData2 = diskCacheData;
        long j3 = j;
        BloksComponentQueryResources bloksComponentQueryResources2 = bloksComponentQueryResources;
        long j4 = j2;
        if ((i & 1) != 0) {
            diskCacheData2 = componentQueryDiskCacheRecord.data;
        }
        if ((i & 2) != 0) {
            j3 = componentQueryDiskCacheRecord.responseTimestampMs;
        }
        if ((i & 4) != 0) {
            bloksComponentQueryResources2 = componentQueryDiskCacheRecord.resources;
        }
        if ((i & 8) != 0) {
            j4 = componentQueryDiskCacheRecord.responseWallClockTimestampMs;
        }
        C7384Etj.A0Y(diskCacheData2, 0);
        return new ComponentQueryDiskCacheRecord(diskCacheData2, j3, bloksComponentQueryResources2, j4);
    }

    public final ComponentQueryDiskCacheRecord copy(DiskCacheData diskCacheData, long j, BloksComponentQueryResources bloksComponentQueryResources, long j2) {
        C7384Etj.A0Y(diskCacheData, 0);
        return new ComponentQueryDiskCacheRecord(diskCacheData, j, bloksComponentQueryResources, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComponentQueryDiskCacheRecord) {
                ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord = (ComponentQueryDiskCacheRecord) obj;
                if (!C7384Etj.areEqual(this.data, componentQueryDiskCacheRecord.data) || this.responseTimestampMs != componentQueryDiskCacheRecord.responseTimestampMs || !C7384Etj.areEqual(this.resources, componentQueryDiskCacheRecord.resources) || this.responseWallClockTimestampMs != componentQueryDiskCacheRecord.responseWallClockTimestampMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final DiskCacheData component1() {
        return this.data;
    }

    public final long component2() {
        return this.responseTimestampMs;
    }

    public final BloksComponentQueryResources component3() {
        return this.resources;
    }

    public final long component4() {
        return this.responseWallClockTimestampMs;
    }

    public final DiskCacheData getData() {
        return this.data;
    }

    public final BloksComponentQueryResources getResources() {
        return this.resources;
    }

    public final long getResponseTimestampMs() {
        return this.responseTimestampMs;
    }

    public final long getResponseWallClockTimestampMs() {
        return this.responseWallClockTimestampMs;
    }

    public int hashCode() {
        return C8j4.A0B(this.responseWallClockTimestampMs, (AnonymousClass006.A06(this.responseTimestampMs, AnonymousClass005.A0E(this.data)) + AnonymousClass006.A0D(this.resources)) * 31);
    }

    public String toString() {
        DiskCacheData diskCacheData = this.data;
        long j = this.responseTimestampMs;
        BloksComponentQueryResources bloksComponentQueryResources = this.resources;
        long j2 = this.responseWallClockTimestampMs;
        StringBuilder sbA0f = C3cG.A0f(diskCacheData, "ComponentQueryDiskCacheRecord(data=");
        sbA0f.append(", responseTimestampMs=");
        sbA0f.append(j);
        sbA0f.append(", resources=");
        sbA0f.append(bloksComponentQueryResources);
        sbA0f.append(", responseWallClockTimestampMs=");
        sbA0f.append(j2);
        return BV7.A10(sbA0f);
    }

    public /* synthetic */ ComponentQueryDiskCacheRecord(DiskCacheData diskCacheData, long j, BloksComponentQueryResources bloksComponentQueryResources, long j2, int i, C06H c06h) {
        this(diskCacheData, j, bloksComponentQueryResources, (i & 8) != 0 ? 0L : j2);
    }
}
