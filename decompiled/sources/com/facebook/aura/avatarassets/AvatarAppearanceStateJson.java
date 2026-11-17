package com.facebook.aura.avatarassets;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AvatarAppearanceStateJson extends C06G {
    public final List<AvatarAssetFileJson> files;
    public final String status;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, AvatarAppearanceStateJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AvatarAppearanceStateJson> serializer() {
            return AvatarAppearanceStateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarAppearanceStateJson(String str, List<AvatarAssetFileJson> list) {
        C7384Etj.A0Y(list, 1);
        this.status = str;
        this.files = list;
    }

    public final AvatarAppearanceStateJson copy(String str, List<AvatarAssetFileJson> list) {
        C7384Etj.A0Y(list, 1);
        return new AvatarAppearanceStateJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarAppearanceStateJson) {
                AvatarAppearanceStateJson avatarAppearanceStateJson = (AvatarAppearanceStateJson) obj;
                if (!C7384Etj.areEqual(this.status, avatarAppearanceStateJson.status) || !C7384Etj.areEqual(this.files, avatarAppearanceStateJson.files)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AvatarAppearanceStateJson copy$default(AvatarAppearanceStateJson avatarAppearanceStateJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarAppearanceStateJson.status;
        }
        if ((i & 2) != 0) {
            list = avatarAppearanceStateJson.files;
        }
        C7384Etj.A0Y(list, 1);
        return new AvatarAppearanceStateJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(AvatarAppearanceStateJson avatarAppearanceStateJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || avatarAppearanceStateJson.status != null) {
            c9j5.AAP(avatarAppearanceStateJson.status, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(avatarAppearanceStateJson.files)) {
            c9j5.AAQ(avatarAppearanceStateJson.files, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.status;
    }

    public final List<AvatarAssetFileJson> component2() {
        return this.files;
    }

    public final List<AvatarAssetFileJson> getFiles() {
        return this.files;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.files, AnonymousClass006.A0G(this.status) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarAppearanceStateJson(int i, String str, List list, C2hx c2hx) {
        this.status = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.files = C0881AGi.A00;
        } else {
            this.files = list;
        }
    }

    public /* synthetic */ AvatarAppearanceStateJson(String str, List list, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), C3cI.A11(list, i));
    }

    public AvatarAppearanceStateJson() {
        this(null, C0881AGi.A00);
    }
}
