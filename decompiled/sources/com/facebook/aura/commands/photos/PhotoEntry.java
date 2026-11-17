package com.facebook.aura.commands.photos;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C2nw;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7qW;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class PhotoEntry extends C06G {
    public final String album;
    public final long dateModifiedSeconds;
    public final boolean hasCaptureDate;
    public final int height;
    public final long id;
    public final Boolean isFavorite;
    public final Double latitude;
    public final Double longitude;
    public final String mimeType;
    public final String name;
    public final long sizeBytes;
    public final PhotoSource source;
    public final long takenAtMs;
    public final String uri;
    public final int width;

    public PhotoEntry(long j, String str, String str2, String str3, long j2, int i, int i2, long j3, boolean z, long j4, String str4, PhotoSource photoSource, Boolean bool, Double d, Double d2) {
        AnonymousClass002.A1G(str, 1, photoSource);
        this.id = j;
        this.uri = str;
        this.name = str2;
        this.mimeType = str3;
        this.sizeBytes = j2;
        this.width = i;
        this.height = i2;
        this.takenAtMs = j3;
        this.hasCaptureDate = z;
        this.dateModifiedSeconds = j4;
        this.album = str4;
        this.source = photoSource;
        this.isFavorite = bool;
        this.latitude = d;
        this.longitude = d2;
    }

    public final PhotoEntry copy(long j, String str, String str2, String str3, long j2, int i, int i2, long j3, boolean z, long j4, String str4, PhotoSource photoSource, Boolean bool, Double d, Double d2) {
        AnonymousClass002.A1G(str, 1, photoSource);
        return new PhotoEntry(j, str, str2, str3, j2, i, i2, j3, z, j4, str4, photoSource, bool, d, d2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoEntry) {
                PhotoEntry photoEntry = (PhotoEntry) obj;
                if (this.id != photoEntry.id || !C7384Etj.areEqual(this.uri, photoEntry.uri) || !C7384Etj.areEqual(this.name, photoEntry.name) || !C7384Etj.areEqual(this.mimeType, photoEntry.mimeType) || this.sizeBytes != photoEntry.sizeBytes || this.width != photoEntry.width || this.height != photoEntry.height || this.takenAtMs != photoEntry.takenAtMs || this.hasCaptureDate != photoEntry.hasCaptureDate || this.dateModifiedSeconds != photoEntry.dateModifiedSeconds || !C7384Etj.areEqual(this.album, photoEntry.album) || this.source != photoEntry.source || !C7384Etj.areEqual(this.isFavorite, photoEntry.isFavorite) || !C7384Etj.areEqual(this.latitude, photoEntry.latitude) || !C7384Etj.areEqual(this.longitude, photoEntry.longitude)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PhotoEntry copy$default(PhotoEntry photoEntry, long j, String str, String str2, String str3, long j2, int i, int i2, long j3, boolean z, long j4, String str4, PhotoSource photoSource, Boolean bool, Double d, Double d2, int i3, Object obj) {
        long j5 = j;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        long j6 = j2;
        int i4 = i;
        int i5 = i2;
        long j7 = j3;
        boolean z2 = z;
        long j8 = j4;
        String str8 = str4;
        PhotoSource photoSource2 = photoSource;
        Boolean bool2 = bool;
        Double d3 = d;
        Double d4 = d2;
        if ((i3 & 1) != 0) {
            j5 = photoEntry.id;
        }
        if ((i3 & 2) != 0) {
            str5 = photoEntry.uri;
        }
        if ((i3 & 4) != 0) {
            str6 = photoEntry.name;
        }
        if ((i3 & 8) != 0) {
            str7 = photoEntry.mimeType;
        }
        if ((i3 & 16) != 0) {
            j6 = photoEntry.sizeBytes;
        }
        if ((i3 & 32) != 0) {
            i4 = photoEntry.width;
        }
        if ((i3 & 64) != 0) {
            i5 = photoEntry.height;
        }
        if ((i3 & 128) != 0) {
            j7 = photoEntry.takenAtMs;
        }
        if ((i3 & 256) != 0) {
            z2 = photoEntry.hasCaptureDate;
        }
        if ((i3 & 512) != 0) {
            j8 = photoEntry.dateModifiedSeconds;
        }
        if ((i3 & 1024) != 0) {
            str8 = photoEntry.album;
        }
        if ((i3 & 2048) != 0) {
            photoSource2 = photoEntry.source;
        }
        if ((i3 & 4096) != 0) {
            bool2 = photoEntry.isFavorite;
        }
        if ((i3 & 8192) != 0) {
            d3 = photoEntry.latitude;
        }
        if ((i3 & 16384) != 0) {
            d4 = photoEntry.longitude;
        }
        int i6 = i5;
        boolean z3 = z2;
        return photoEntry.copy(j5, str5, str6, str7, j6, i4, i6, j7, z3, j8, str8, photoSource2, bool2, d3, d4);
    }

    public final long component1() {
        return this.id;
    }

    public final long component10() {
        return this.dateModifiedSeconds;
    }

    public final String component11() {
        return this.album;
    }

    public final PhotoSource component12() {
        return this.source;
    }

    public final Boolean component13() {
        return this.isFavorite;
    }

    public final Double component14() {
        return this.latitude;
    }

    public final Double component15() {
        return this.longitude;
    }

    public final String component2() {
        return this.uri;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final long component5() {
        return this.sizeBytes;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final long component8() {
        return this.takenAtMs;
    }

    public final boolean component9() {
        return this.hasCaptureDate;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final long getDateModifiedSeconds() {
        return this.dateModifiedSeconds;
    }

    public final boolean getHasCaptureDate() {
        return this.hasCaptureDate;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.id;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final PhotoSource getSource() {
        return this.source;
    }

    public final long getTakenAtMs() {
        return this.takenAtMs;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.source, (AnonymousClass006.A06(this.dateModifiedSeconds, C0KA.A01(AnonymousClass006.A06(this.takenAtMs, (((AnonymousClass006.A06(this.sizeBytes, (((AnonymousClass005.A0I(this.uri, AnonymousClass005.A07(this.id)) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + this.width) * 31) + this.height) * 31), this.hasCaptureDate)) + AnonymousClass006.A0G(this.album)) * 31) + AnonymousClass006.A0D(this.isFavorite)) * 31) + AnonymousClass006.A0D(this.latitude)) * 31) + C3cH.A02(this.longitude);
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("id", String.valueOf(this.id), c2nwA1K);
        C7qW.A06("uri", this.uri, c2nwA1K);
        C60R.A1M(this.name, "name", c2nwA1K);
        C60R.A1M(this.mimeType, PhotosSearchHandlerKt.PARAM_MIME_TYPE, c2nwA1K);
        C7qW.A05(Long.valueOf(this.sizeBytes), "size_bytes", c2nwA1K);
        C7qW.A05(Integer.valueOf(this.width), HatchWebPageParserKt.WIDTH_ATTR, c2nwA1K);
        C7qW.A05(Integer.valueOf(this.height), HatchWebPageParserKt.HEIGHT_ATTR, c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.hasCaptureDate), "has_capture_date", c2nwA1K);
        NodeSyncTimestamps.INSTANCE.putLocalTimeFields(c2nwA1K, this.takenAtMs, "taken_at");
        C60R.A1M(this.album, PhotosSearchHandlerKt.PARAM_ALBUM, c2nwA1K);
        C7qW.A06(PhotosSearchHandlerKt.PARAM_SOURCE, this.source.getWireValue(), c2nwA1K);
        Boolean bool = this.isFavorite;
        if (bool != null) {
            C7qW.A04(bool, "is_favorite", c2nwA1K);
        }
        Double d = this.latitude;
        if (d != null && this.longitude != null) {
            C7qW.A05(d, GeofenceEventWorker.KEY_LATITUDE, c2nwA1K);
            C7qW.A05(this.longitude, GeofenceEventWorker.KEY_LONGITUDE, c2nwA1K);
        }
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }
}
