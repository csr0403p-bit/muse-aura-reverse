package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07819iv;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class StoredAvatarReferenceJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String asset_id;
    public final boolean crop_refreshed;
    public final Float crop_size;
    public final Float crop_x;
    public final Float crop_y;
    public final boolean embodiment_compatible;
    public final String image_uri;
    public final String source_sha1;
    public final long written_at_ms;

    public final class Companion {
        public final C9hr<StoredAvatarReferenceJson> serializer() {
            return StoredAvatarReferenceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(StoredAvatarReferenceJson storedAvatarReferenceJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(storedAvatarReferenceJson.asset_id)) {
            c9j5.AAV(storedAvatarReferenceJson.asset_id, c9iZ, 0);
        }
        if (zAfR || storedAvatarReferenceJson.crop_x != null) {
            c9j5.AAP(storedAvatarReferenceJson.crop_x, C07819iv.A00, c9iZ, 1);
        }
        if (zAfR || storedAvatarReferenceJson.crop_y != null) {
            c9j5.AAP(storedAvatarReferenceJson.crop_y, C07819iv.A00, c9iZ, 2);
        }
        if (zAfR || storedAvatarReferenceJson.crop_size != null) {
            c9j5.AAP(storedAvatarReferenceJson.crop_size, C07819iv.A00, c9iZ, 3);
        }
        if (zAfR || storedAvatarReferenceJson.source_sha1 != null) {
            c9j5.AAP(storedAvatarReferenceJson.source_sha1, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || storedAvatarReferenceJson.image_uri != null) {
            c9j5.AAP(storedAvatarReferenceJson.image_uri, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || storedAvatarReferenceJson.crop_refreshed) {
            c9j5.AA7(c9iZ, 6, storedAvatarReferenceJson.crop_refreshed);
        }
        if (zAfR || !storedAvatarReferenceJson.embodiment_compatible) {
            c9j5.AA7(c9iZ, 7, storedAvatarReferenceJson.embodiment_compatible);
        }
        if (zAfR || storedAvatarReferenceJson.written_at_ms != 0) {
            c9j5.AAN(c9iZ, 8, storedAvatarReferenceJson.written_at_ms);
        }
    }

    public final StoredAvatarReferenceJson copy(String str, Float f, Float f2, Float f3, String str2, String str3, boolean z, boolean z2, long j) {
        C7384Etj.A0Y(str, 0);
        return new StoredAvatarReferenceJson(str, f, f2, f3, str2, str3, z, z2, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoredAvatarReferenceJson) {
                StoredAvatarReferenceJson storedAvatarReferenceJson = (StoredAvatarReferenceJson) obj;
                if (!C7384Etj.areEqual(this.asset_id, storedAvatarReferenceJson.asset_id) || !C7384Etj.areEqual(this.crop_x, storedAvatarReferenceJson.crop_x) || !C7384Etj.areEqual(this.crop_y, storedAvatarReferenceJson.crop_y) || !C7384Etj.areEqual(this.crop_size, storedAvatarReferenceJson.crop_size) || !C7384Etj.areEqual(this.source_sha1, storedAvatarReferenceJson.source_sha1) || !C7384Etj.areEqual(this.image_uri, storedAvatarReferenceJson.image_uri) || this.crop_refreshed != storedAvatarReferenceJson.crop_refreshed || this.embodiment_compatible != storedAvatarReferenceJson.embodiment_compatible || this.written_at_ms != storedAvatarReferenceJson.written_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StoredAvatarReferenceJson copy$default(StoredAvatarReferenceJson storedAvatarReferenceJson, String str, Float f, Float f2, Float f3, String str2, String str3, boolean z, boolean z2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storedAvatarReferenceJson.asset_id;
        }
        if ((i & 2) != 0) {
            f = storedAvatarReferenceJson.crop_x;
        }
        if ((i & 4) != 0) {
            f2 = storedAvatarReferenceJson.crop_y;
        }
        if ((i & 8) != 0) {
            f3 = storedAvatarReferenceJson.crop_size;
        }
        if ((i & 16) != 0) {
            str2 = storedAvatarReferenceJson.source_sha1;
        }
        if ((i & 32) != 0) {
            str3 = storedAvatarReferenceJson.image_uri;
        }
        if ((i & 64) != 0) {
            z = storedAvatarReferenceJson.crop_refreshed;
        }
        if ((i & 128) != 0) {
            z2 = storedAvatarReferenceJson.embodiment_compatible;
        }
        if ((i & 256) != 0) {
            j = storedAvatarReferenceJson.written_at_ms;
        }
        return storedAvatarReferenceJson.copy(str, f, f2, f3, str2, str3, z, z2, j);
    }

    public final String component1() {
        return this.asset_id;
    }

    public final Float component2() {
        return this.crop_x;
    }

    public final Float component3() {
        return this.crop_y;
    }

    public final Float component4() {
        return this.crop_size;
    }

    public final String component5() {
        return this.source_sha1;
    }

    public final String component6() {
        return this.image_uri;
    }

    public final boolean component7() {
        return this.crop_refreshed;
    }

    public final boolean component8() {
        return this.embodiment_compatible;
    }

    public final long component9() {
        return this.written_at_ms;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final boolean getCrop_refreshed() {
        return this.crop_refreshed;
    }

    public final Float getCrop_size() {
        return this.crop_size;
    }

    public final Float getCrop_x() {
        return this.crop_x;
    }

    public final Float getCrop_y() {
        return this.crop_y;
    }

    public final boolean getEmbodiment_compatible() {
        return this.embodiment_compatible;
    }

    public final String getImage_uri() {
        return this.image_uri;
    }

    public final String getSource_sha1() {
        return this.source_sha1;
    }

    public final long getWritten_at_ms() {
        return this.written_at_ms;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.written_at_ms, C0KA.A01(C0KA.A01((((((((((AnonymousClass001.A0G(this.asset_id) + AnonymousClass006.A0D(this.crop_x)) * 31) + AnonymousClass006.A0D(this.crop_y)) * 31) + AnonymousClass006.A0D(this.crop_size)) * 31) + AnonymousClass006.A0G(this.source_sha1)) * 31) + AnonymousClass005.A0H(this.image_uri)) * 31, this.crop_refreshed), this.embodiment_compatible));
    }

    public /* synthetic */ StoredAvatarReferenceJson(String str, Float f, Float f2, Float f3, String str2, String str3, boolean z, boolean z2, long j, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : f3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? true : z2, (i & 256) != 0 ? 0L : j);
    }

    public String toString() {
        return super.toString();
    }

    public StoredAvatarReferenceJson(String str, Float f, Float f2, Float f3, String str2, String str3, boolean z, boolean z2, long j) {
        C7384Etj.A0Y(str, 0);
        this.asset_id = str;
        this.crop_x = f;
        this.crop_y = f2;
        this.crop_size = f3;
        this.source_sha1 = str2;
        this.image_uri = str3;
        this.crop_refreshed = z;
        this.embodiment_compatible = z2;
        this.written_at_ms = j;
    }

    public /* synthetic */ StoredAvatarReferenceJson(int i, String str, Float f, Float f2, Float f3, String str2, String str3, boolean z, boolean z2, long j, C2hx c2hx) {
        this.asset_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.crop_x = null;
        } else {
            this.crop_x = f;
        }
        if ((i & 4) == 0) {
            this.crop_y = null;
        } else {
            this.crop_y = f2;
        }
        if ((i & 8) == 0) {
            this.crop_size = null;
        } else {
            this.crop_size = f3;
        }
        if ((i & 16) == 0) {
            this.source_sha1 = null;
        } else {
            this.source_sha1 = str2;
        }
        if ((i & 32) == 0) {
            this.image_uri = null;
        } else {
            this.image_uri = str3;
        }
        if ((i & 64) == 0) {
            this.crop_refreshed = false;
        } else {
            this.crop_refreshed = z;
        }
        if ((i & 128) == 0) {
            this.embodiment_compatible = true;
        } else {
            this.embodiment_compatible = z2;
        }
        if ((i & 256) == 0) {
            this.written_at_ms = 0L;
        } else {
            this.written_at_ms = j;
        }
    }

    public StoredAvatarReferenceJson() {
        this("", null, null, null, null, null, false, true, 0L);
    }
}
