package com.facebook.aura.conversation.view;

import X.AHD;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class InlineContentCallbacks extends C06G {
    public static final int $stable = 0;
    public final G0U<String, Unit> onArtifactVisible;
    public final G0V<String, String, Unit> onFileClick;
    public final G0V<String, String, Unit> onImageClick;
    public final G0U<ContentItem, Unit> onImageCopy;
    public final G0U<String, Unit> onImageError;
    public final G0V<AHD<HatchInlineImageData>, Integer, Unit> onImageGridClick;
    public final G0U<HatchContentViewModelData, Unit> onRichFormatOpenCTAClick;
    public final G0V<String, String, Unit> onSlidesClick;
    public final G0V<String, String, Unit> onVideoClick;

    public static /* synthetic */ InlineContentCallbacks copy$default(InlineContentCallbacks inlineContentCallbacks, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0U g0u, G0U g0u2, G0U g0u3, G0U g0u4, int i, Object obj) {
        G0V g0v6 = g0v;
        G0V g0v7 = g0v2;
        G0V g0v8 = g0v3;
        G0V g0v9 = g0v4;
        G0V g0v10 = g0v5;
        G0U g0u5 = g0u;
        G0U g0u6 = g0u2;
        G0U g0u7 = g0u3;
        G0U g0u8 = g0u4;
        if ((i & 1) != 0) {
            g0v6 = inlineContentCallbacks.onImageClick;
        }
        if ((i & 2) != 0) {
            g0v7 = inlineContentCallbacks.onImageGridClick;
        }
        if ((i & 4) != 0) {
            g0v8 = inlineContentCallbacks.onFileClick;
        }
        if ((i & 8) != 0) {
            g0v9 = inlineContentCallbacks.onSlidesClick;
        }
        if ((i & 16) != 0) {
            g0v10 = inlineContentCallbacks.onVideoClick;
        }
        if ((i & 32) != 0) {
            g0u5 = inlineContentCallbacks.onRichFormatOpenCTAClick;
        }
        if ((i & 64) != 0) {
            g0u6 = inlineContentCallbacks.onImageError;
        }
        if ((i & 128) != 0) {
            g0u7 = inlineContentCallbacks.onArtifactVisible;
        }
        if ((i & 256) != 0) {
            g0u8 = inlineContentCallbacks.onImageCopy;
        }
        return new InlineContentCallbacks(g0v6, g0v7, g0v8, g0v9, g0v10, g0u5, g0u6, g0u7, g0u8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineContentCallbacks) {
                InlineContentCallbacks inlineContentCallbacks = (InlineContentCallbacks) obj;
                if (!C7384Etj.areEqual(this.onImageClick, inlineContentCallbacks.onImageClick) || !C7384Etj.areEqual(this.onImageGridClick, inlineContentCallbacks.onImageGridClick) || !C7384Etj.areEqual(this.onFileClick, inlineContentCallbacks.onFileClick) || !C7384Etj.areEqual(this.onSlidesClick, inlineContentCallbacks.onSlidesClick) || !C7384Etj.areEqual(this.onVideoClick, inlineContentCallbacks.onVideoClick) || !C7384Etj.areEqual(this.onRichFormatOpenCTAClick, inlineContentCallbacks.onRichFormatOpenCTAClick) || !C7384Etj.areEqual(this.onImageError, inlineContentCallbacks.onImageError) || !C7384Etj.areEqual(this.onArtifactVisible, inlineContentCallbacks.onArtifactVisible) || !C7384Etj.areEqual(this.onImageCopy, inlineContentCallbacks.onImageCopy)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ InlineContentCallbacks(G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0U g0u, G0U g0u2, G0U g0u3, G0U g0u4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : g0v, (i & 2) != 0 ? null : g0v2, (i & 4) != 0 ? null : g0v3, (i & 8) != 0 ? null : g0v4, (i & 16) != 0 ? null : g0v5, (i & 32) != 0 ? null : g0u, (i & 64) != 0 ? null : g0u2, (i & 128) != 0 ? null : g0u3, (i & 256) != 0 ? null : g0u4);
    }

    public final G0V<String, String, Unit> component1() {
        return this.onImageClick;
    }

    public final G0V<AHD<HatchInlineImageData>, Integer, Unit> component2() {
        return this.onImageGridClick;
    }

    public final G0V<String, String, Unit> component3() {
        return this.onFileClick;
    }

    public final G0V<String, String, Unit> component4() {
        return this.onSlidesClick;
    }

    public final G0V<String, String, Unit> component5() {
        return this.onVideoClick;
    }

    public final G0U<HatchContentViewModelData, Unit> component6() {
        return this.onRichFormatOpenCTAClick;
    }

    public final G0U<String, Unit> component7() {
        return this.onImageError;
    }

    public final G0U<String, Unit> component8() {
        return this.onArtifactVisible;
    }

    public final G0U<ContentItem, Unit> component9() {
        return this.onImageCopy;
    }

    public final InlineContentCallbacks copy(G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0U<? super HatchContentViewModelData, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4) {
        return new InlineContentCallbacks(g0v, g0v2, g0v3, g0v4, g0v5, g0u, g0u2, g0u3, g0u4);
    }

    public final G0U<String, Unit> getOnArtifactVisible() {
        return this.onArtifactVisible;
    }

    public final G0V<String, String, Unit> getOnFileClick() {
        return this.onFileClick;
    }

    public final G0V<String, String, Unit> getOnImageClick() {
        return this.onImageClick;
    }

    public final G0U<ContentItem, Unit> getOnImageCopy() {
        return this.onImageCopy;
    }

    public final G0U<String, Unit> getOnImageError() {
        return this.onImageError;
    }

    public final G0V<AHD<HatchInlineImageData>, Integer, Unit> getOnImageGridClick() {
        return this.onImageGridClick;
    }

    public final G0U<HatchContentViewModelData, Unit> getOnRichFormatOpenCTAClick() {
        return this.onRichFormatOpenCTAClick;
    }

    public final G0V<String, String, Unit> getOnSlidesClick() {
        return this.onSlidesClick;
    }

    public final G0V<String, String, Unit> getOnVideoClick() {
        return this.onVideoClick;
    }

    public int hashCode() {
        return (((((((((((((((AnonymousClass006.A0D(this.onImageClick) * 31) + AnonymousClass006.A0D(this.onImageGridClick)) * 31) + AnonymousClass006.A0D(this.onFileClick)) * 31) + AnonymousClass006.A0D(this.onSlidesClick)) * 31) + AnonymousClass006.A0D(this.onVideoClick)) * 31) + AnonymousClass006.A0D(this.onRichFormatOpenCTAClick)) * 31) + AnonymousClass006.A0D(this.onImageError)) * 31) + AnonymousClass006.A0D(this.onArtifactVisible)) * 31) + C06G.A04(this.onImageCopy);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InlineContentCallbacks(G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0U<? super HatchContentViewModelData, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, G0U<? super ContentItem, Unit> g0u4) {
        this.onImageClick = g0v;
        this.onImageGridClick = g0v2;
        this.onFileClick = g0v3;
        this.onSlidesClick = g0v4;
        this.onVideoClick = g0v5;
        this.onRichFormatOpenCTAClick = g0u;
        this.onImageError = g0u2;
        this.onArtifactVisible = g0u3;
        this.onImageCopy = g0u4;
    }

    public InlineContentCallbacks() {
        this(null, null, null, null, null, null, null, null, null);
    }
}
