package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F3E;
import X.HxE;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EctoUploadResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String file_id;
    public final String h;
    public final String handle;
    public final String id;
    public final String media_id;

    public final class Companion {
        public final C9hr<EctoUploadResponseJson> serializer() {
            return EctoUploadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(EctoUploadResponseJson ectoUploadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || ectoUploadResponseJson.h != null) {
            c9j5.AAP(ectoUploadResponseJson.h, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || ectoUploadResponseJson.handle != null) {
            c9j5.AAP(ectoUploadResponseJson.handle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || ectoUploadResponseJson.media_id != null) {
            c9j5.AAP(ectoUploadResponseJson.media_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || ectoUploadResponseJson.file_id != null) {
            c9j5.AAP(ectoUploadResponseJson.file_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || ectoUploadResponseJson.id != null) {
            c9j5.AAP(ectoUploadResponseJson.id, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EctoUploadResponseJson) {
                EctoUploadResponseJson ectoUploadResponseJson = (EctoUploadResponseJson) obj;
                if (!C7384Etj.areEqual(this.h, ectoUploadResponseJson.h) || !C7384Etj.areEqual(this.handle, ectoUploadResponseJson.handle) || !C7384Etj.areEqual(this.media_id, ectoUploadResponseJson.media_id) || !C7384Etj.areEqual(this.file_id, ectoUploadResponseJson.file_id) || !C7384Etj.areEqual(this.id, ectoUploadResponseJson.id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EctoUploadResponseJson copy$default(EctoUploadResponseJson ectoUploadResponseJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ectoUploadResponseJson.h;
        }
        if ((i & 2) != 0) {
            str2 = ectoUploadResponseJson.handle;
        }
        if ((i & 4) != 0) {
            str3 = ectoUploadResponseJson.media_id;
        }
        if ((i & 8) != 0) {
            str4 = ectoUploadResponseJson.file_id;
        }
        if ((i & 16) != 0) {
            str5 = ectoUploadResponseJson.id;
        }
        return ectoUploadResponseJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.h;
    }

    public final String component2() {
        return this.handle;
    }

    public final String component3() {
        return this.media_id;
    }

    public final String component4() {
        return this.file_id;
    }

    public final String component5() {
        return this.id;
    }

    public final EctoUploadResponseJson copy(String str, String str2, String str3, String str4, String str5) {
        return new EctoUploadResponseJson(str, str2, str3, str4, str5);
    }

    public final HxE<String, String> firstHandle() {
        Object next;
        F3E f3e = new F3E(new HxE[]{C3cG.A0r("h", this.h), C3cG.A0r("handle", this.handle), C3cG.A0r("media_id", this.media_id), C3cG.A0r("file_id", this.file_id), C3cG.A0r("id", this.id)});
        while (true) {
            if (!f3e.hasNext()) {
                next = null;
                break;
            }
            next = f3e.next();
            CharSequence charSequence = (CharSequence) ((HxE) next).second;
            if (charSequence != null && charSequence.length() != 0) {
                break;
            }
        }
        HxE hxE = (HxE) next;
        if (hxE == null) {
            return null;
        }
        A a = hxE.first;
        Object obj = hxE.second;
        if (obj == null) {
            obj = "";
        }
        return C3cG.A0r(a, obj);
    }

    public final String getFile_id() {
        return this.file_id;
    }

    public final String getH() {
        return this.h;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMedia_id() {
        return this.media_id;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.h) * 31) + AnonymousClass006.A0G(this.handle)) * 31) + AnonymousClass006.A0G(this.media_id)) * 31) + AnonymousClass006.A0G(this.file_id)) * 31) + AnonymousClass005.A0H(this.id);
    }

    public /* synthetic */ EctoUploadResponseJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 2) == 0) {
            this.handle = null;
        } else {
            this.handle = str2;
        }
        if ((i & 4) == 0) {
            this.media_id = null;
        } else {
            this.media_id = str3;
        }
        if ((i & 8) == 0) {
            this.file_id = null;
        } else {
            this.file_id = str4;
        }
        if ((i & 16) == 0) {
            this.id = null;
        } else {
            this.id = str5;
        }
    }

    public String toString() {
        return super.toString();
    }

    public EctoUploadResponseJson(String str, String str2, String str3, String str4, String str5) {
        this.h = str;
        this.handle = str2;
        this.media_id = str3;
        this.file_id = str4;
        this.id = str5;
    }

    public /* synthetic */ EctoUploadResponseJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public EctoUploadResponseJson() {
        this(null, null, null, null, null);
    }
}
