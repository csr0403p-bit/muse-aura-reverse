package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class VideoPresentationData extends C06G implements HatchPresentationData {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchMediaLayout layout;
    public final List<HatchAttachmentFile> videos;

    public final class Companion {
        public final C9hr<VideoPresentationData> serializer() {
            return VideoPresentationData$$serializer.INSTANCE;
        }

        public final VideoPresentationData fromJson(JsonElement jsonElement) {
            return HatchAttachmentPresentationJsonKt.parseVideoPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoPresentationData) {
                VideoPresentationData videoPresentationData = (VideoPresentationData) obj;
                if (!C7384Etj.areEqual(this.videos, videoPresentationData.videos) || this.layout != videoPresentationData.layout) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1W(num, AbstractC5321DgF.A02(num, VideoPresentationData$Companion$$childSerializers$1.INSTANCE), VideoPresentationData$Companion$$childSerializers$2.INSTANCE);
    }

    public static /* synthetic */ VideoPresentationData copy$default(VideoPresentationData videoPresentationData, List list, HatchMediaLayout hatchMediaLayout, int i, Object obj) {
        if ((i & 1) != 0) {
            list = videoPresentationData.videos;
        }
        if ((i & 2) != 0) {
            hatchMediaLayout = videoPresentationData.layout;
        }
        AnonymousClass003.A0u(list, hatchMediaLayout);
        return new VideoPresentationData(list, hatchMediaLayout);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(VideoPresentationData videoPresentationData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(videoPresentationData.videos, C3cH.A15(f0cArr, 0), c9iZ, 0);
        if (c9j5.AfR() || videoPresentationData.layout != HatchMediaLayout.AdaptiveGrid) {
            c9j5.AAQ(videoPresentationData.layout, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final List<HatchAttachmentFile> component1() {
        return this.videos;
    }

    public final HatchMediaLayout component2() {
        return this.layout;
    }

    public final HatchMediaLayout getLayout() {
        return this.layout;
    }

    public final List<HatchAttachmentFile> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.layout, AnonymousClass005.A0E(this.videos));
    }

    public VideoPresentationData(List<HatchAttachmentFile> list, HatchMediaLayout hatchMediaLayout) {
        AnonymousClass003.A0u(list, hatchMediaLayout);
        this.videos = list;
        this.layout = hatchMediaLayout;
    }

    public final VideoPresentationData copy(List<HatchAttachmentFile> list, HatchMediaLayout hatchMediaLayout) {
        AnonymousClass003.A0u(list, hatchMediaLayout);
        return new VideoPresentationData(list, hatchMediaLayout);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VideoPresentationData(int i, List list, HatchMediaLayout hatchMediaLayout, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VideoPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.videos = list;
        this.layout = (i & 2) == 0 ? HatchMediaLayout.AdaptiveGrid : hatchMediaLayout;
    }

    public /* synthetic */ VideoPresentationData(List list, HatchMediaLayout hatchMediaLayout, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? HatchMediaLayout.AdaptiveGrid : hatchMediaLayout);
    }
}
