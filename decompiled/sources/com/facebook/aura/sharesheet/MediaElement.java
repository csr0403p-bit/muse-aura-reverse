package com.facebook.aura.sharesheet;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import java.util.List;

/* loaded from: classes4.dex */
public final class MediaElement implements ShareElement {
    public final boolean isVideo;
    public final List<String> labels;
    public final List<String> urls;

    public final List<String> getLabels() {
        return this.labels;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public MediaElement(List<String> list, List<String> list2, boolean z) {
        AnonymousClass003.A0u(list, list2);
        this.urls = list;
        this.labels = list2;
        this.isVideo = z;
    }

    public /* synthetic */ MediaElement(List list, List list2, boolean z, int i, C06H c06h) {
        this(list, list2, AnonymousClass005.A1O(i, z));
    }
}
