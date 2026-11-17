package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchAttachmentVariantsJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String original;

    public final class Companion {
        public final C9hr<HatchAttachmentVariantsJson> serializer() {
            return HatchAttachmentVariantsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchAttachmentVariantsJson hatchAttachmentVariantsJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hatchAttachmentVariantsJson.original != null) {
            c9j5.AAP(hatchAttachmentVariantsJson.original, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchAttachmentVariantsJson) && C7384Etj.areEqual(this.original, ((HatchAttachmentVariantsJson) obj).original));
    }

    public static /* synthetic */ HatchAttachmentVariantsJson copy$default(HatchAttachmentVariantsJson hatchAttachmentVariantsJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAttachmentVariantsJson.original;
        }
        return new HatchAttachmentVariantsJson(str);
    }

    public final String component1() {
        return this.original;
    }

    public final HatchAttachmentVariantsJson copy(String str) {
        return new HatchAttachmentVariantsJson(str);
    }

    public final String getOriginal() {
        return this.original;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.original);
    }

    public /* synthetic */ HatchAttachmentVariantsJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.original = null;
        } else {
            this.original = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchAttachmentVariantsJson(String str) {
        this.original = str;
    }

    public /* synthetic */ HatchAttachmentVariantsJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public HatchAttachmentVariantsJson() {
        this(null);
    }
}
