package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass003;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkPayload;
import java.util.List;

/* loaded from: classes4.dex */
public final class MarkdownMedia {
    public static final int $stable = 0;
    public final List<AuraInline.Image> images;
    public final List<FileLinkPayload> videos;

    public final List<AuraInline.Image> getImages() {
        return this.images;
    }

    public final List<FileLinkPayload> getVideos() {
        return this.videos;
    }

    public MarkdownMedia(List<AuraInline.Image> list, List<FileLinkPayload> list2) {
        AnonymousClass003.A0u(list, list2);
        this.images = list;
        this.videos = list2;
    }
}
