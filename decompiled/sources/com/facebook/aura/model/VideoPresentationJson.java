package com.facebook.aura.model;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VideoPresentationJson extends C06G {
    public static final int $stable = 8;
    public final String layout;
    public final List<HatchAttachmentFileJson> videos;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, VideoPresentationJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<VideoPresentationJson> serializer() {
            return VideoPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VideoPresentationJson(List<HatchAttachmentFileJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.videos = list;
        this.layout = str;
    }

    public final VideoPresentationJson copy(List<HatchAttachmentFileJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new VideoPresentationJson(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoPresentationJson) {
                VideoPresentationJson videoPresentationJson = (VideoPresentationJson) obj;
                if (!C7384Etj.areEqual(this.videos, videoPresentationJson.videos) || !C7384Etj.areEqual(this.layout, videoPresentationJson.layout)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VideoPresentationJson copy$default(VideoPresentationJson videoPresentationJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = videoPresentationJson.videos;
        }
        if ((i & 2) != 0) {
            str = videoPresentationJson.layout;
        }
        C7384Etj.A0Y(list, 0);
        return new VideoPresentationJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(VideoPresentationJson videoPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(videoPresentationJson.videos)) {
            c9j5.AAQ(videoPresentationJson.videos, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || videoPresentationJson.layout != null) {
            c9j5.AAP(videoPresentationJson.layout, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<HatchAttachmentFileJson> component1() {
        return this.videos;
    }

    public final String component2() {
        return this.layout;
    }

    public final String getLayout() {
        return this.layout;
    }

    public final List<HatchAttachmentFileJson> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.videos) + AnonymousClass006.A0G(this.layout);
    }

    public final VideoPresentationData toDomain() {
        List<HatchAttachmentFileJson> list = this.videos;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchAttachmentFileJson> it = list.iterator();
        while (it.hasNext()) {
            HatchAttachmentFile domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return new VideoPresentationData(arrayListA0h, "fanned_stack".equals(this.layout) ? HatchMediaLayout.FannedStack : HatchMediaLayout.AdaptiveGrid);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VideoPresentationJson(int i, List list, String str, C2hx c2hx) {
        this.videos = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.layout = null;
        } else {
            this.layout = str;
        }
    }

    public /* synthetic */ VideoPresentationJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public VideoPresentationJson() {
        this(C0881AGi.A00, null);
    }
}
