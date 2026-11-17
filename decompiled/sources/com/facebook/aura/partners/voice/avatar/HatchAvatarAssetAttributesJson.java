package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchAvatarAssetAttributesJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer asset_family_version;
    public final Boolean client_letterboxed_7_12;
    public final String source_asset_id;
    public final String source_sha1;

    public final class Companion {
        public final C9hr<HatchAvatarAssetAttributesJson> serializer() {
            return HatchAvatarAssetAttributesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(HatchAvatarAssetAttributesJson hatchAvatarAssetAttributesJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchAvatarAssetAttributesJson.source_sha1 != null) {
            c9j5.AAP(hatchAvatarAssetAttributesJson.source_sha1, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchAvatarAssetAttributesJson.asset_family_version != null) {
            c9j5.AAP(hatchAvatarAssetAttributesJson.asset_family_version, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || hatchAvatarAssetAttributesJson.source_asset_id != null) {
            c9j5.AAP(hatchAvatarAssetAttributesJson.source_asset_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchAvatarAssetAttributesJson.client_letterboxed_7_12 != null) {
            c9j5.AAP(hatchAvatarAssetAttributesJson.client_letterboxed_7_12, C07839ix.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAvatarAssetAttributesJson) {
                HatchAvatarAssetAttributesJson hatchAvatarAssetAttributesJson = (HatchAvatarAssetAttributesJson) obj;
                if (!C7384Etj.areEqual(this.source_sha1, hatchAvatarAssetAttributesJson.source_sha1) || !C7384Etj.areEqual(this.asset_family_version, hatchAvatarAssetAttributesJson.asset_family_version) || !C7384Etj.areEqual(this.source_asset_id, hatchAvatarAssetAttributesJson.source_asset_id) || !C7384Etj.areEqual(this.client_letterboxed_7_12, hatchAvatarAssetAttributesJson.client_letterboxed_7_12)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAvatarAssetAttributesJson copy$default(HatchAvatarAssetAttributesJson hatchAvatarAssetAttributesJson, String str, Integer num, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAvatarAssetAttributesJson.source_sha1;
        }
        if ((i & 2) != 0) {
            num = hatchAvatarAssetAttributesJson.asset_family_version;
        }
        if ((i & 4) != 0) {
            str2 = hatchAvatarAssetAttributesJson.source_asset_id;
        }
        if ((i & 8) != 0) {
            bool = hatchAvatarAssetAttributesJson.client_letterboxed_7_12;
        }
        return new HatchAvatarAssetAttributesJson(str, num, str2, bool);
    }

    public final String component1() {
        return this.source_sha1;
    }

    public final Integer component2() {
        return this.asset_family_version;
    }

    public final String component3() {
        return this.source_asset_id;
    }

    public final Boolean component4() {
        return this.client_letterboxed_7_12;
    }

    public final HatchAvatarAssetAttributesJson copy(String str, Integer num, String str2, Boolean bool) {
        return new HatchAvatarAssetAttributesJson(str, num, str2, bool);
    }

    public final Integer getAsset_family_version() {
        return this.asset_family_version;
    }

    public final Boolean getClient_letterboxed_7_12() {
        return this.client_letterboxed_7_12;
    }

    public final String getSource_asset_id() {
        return this.source_asset_id;
    }

    public final String getSource_sha1() {
        return this.source_sha1;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.source_sha1) * 31) + AnonymousClass006.A0D(this.asset_family_version)) * 31) + AnonymousClass006.A0G(this.source_asset_id)) * 31) + C3cH.A02(this.client_letterboxed_7_12);
    }

    public HatchAvatarAssetAttributesJson(String str, Integer num, String str2, Boolean bool) {
        this.source_sha1 = str;
        this.asset_family_version = num;
        this.source_asset_id = str2;
        this.client_letterboxed_7_12 = bool;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAvatarAssetAttributesJson(int i, String str, Integer num, String str2, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source_sha1 = null;
        } else {
            this.source_sha1 = str;
        }
        if ((i & 2) == 0) {
            this.asset_family_version = null;
        } else {
            this.asset_family_version = num;
        }
        if ((i & 4) == 0) {
            this.source_asset_id = null;
        } else {
            this.source_asset_id = str2;
        }
        if ((i & 8) == 0) {
            this.client_letterboxed_7_12 = null;
        } else {
            this.client_letterboxed_7_12 = bool;
        }
    }

    public /* synthetic */ HatchAvatarAssetAttributesJson(String str, Integer num, String str2, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool);
    }

    public HatchAvatarAssetAttributesJson() {
        this(null, null, null, null);
    }
}
