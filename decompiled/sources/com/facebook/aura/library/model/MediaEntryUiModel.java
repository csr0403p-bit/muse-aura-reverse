package com.facebook.aura.library.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaEntryUiModel extends C06G {
    public static final int $stable = 0;
    public final String galleryImageUri;
    public final String imageUri;
    public final boolean isVideo;
    public final String name;
    public final List<String> previewUris;
    public final String relativePath;
    public final String tileImageUri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaEntryUiModel) {
                MediaEntryUiModel mediaEntryUiModel = (MediaEntryUiModel) obj;
                if (!C7384Etj.areEqual(this.name, mediaEntryUiModel.name) || !C7384Etj.areEqual(this.relativePath, mediaEntryUiModel.relativePath) || !C7384Etj.areEqual(this.imageUri, mediaEntryUiModel.imageUri) || !C7384Etj.areEqual(this.tileImageUri, mediaEntryUiModel.tileImageUri) || !C7384Etj.areEqual(this.galleryImageUri, mediaEntryUiModel.galleryImageUri) || this.isVideo != mediaEntryUiModel.isVideo || !C7384Etj.areEqual(this.previewUris, mediaEntryUiModel.previewUris)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaEntryUiModel copy$default(MediaEntryUiModel mediaEntryUiModel, String str, String str2, String str3, String str4, String str5, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaEntryUiModel.name;
        }
        if ((i & 2) != 0) {
            str2 = mediaEntryUiModel.relativePath;
        }
        if ((i & 4) != 0) {
            str3 = mediaEntryUiModel.imageUri;
        }
        if ((i & 8) != 0) {
            str4 = mediaEntryUiModel.tileImageUri;
        }
        if ((i & 16) != 0) {
            str5 = mediaEntryUiModel.galleryImageUri;
        }
        if ((i & 32) != 0) {
            z = mediaEntryUiModel.isVideo;
        }
        if ((i & 64) != 0) {
            list = mediaEntryUiModel.previewUris;
        }
        return mediaEntryUiModel.copy(str, str2, str3, str4, str5, z, list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.relativePath;
    }

    public final String component3() {
        return this.imageUri;
    }

    public final String component4() {
        return this.tileImageUri;
    }

    public final String component5() {
        return this.galleryImageUri;
    }

    public final boolean component6() {
        return this.isVideo;
    }

    public final List<String> component7() {
        return this.previewUris;
    }

    public final String getGalleryImageUri() {
        return this.galleryImageUri;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getPreviewUris() {
        return this.previewUris;
    }

    public final String getRelativePath() {
        return this.relativePath;
    }

    public final String getTileImageUri() {
        return this.tileImageUri;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.previewUris, C0KA.A01((((((AnonymousClass005.A0I(this.relativePath, AnonymousClass001.A0G(this.name)) + AnonymousClass006.A0G(this.imageUri)) * 31) + AnonymousClass006.A0G(this.tileImageUri)) * 31) + AnonymousClass005.A0H(this.galleryImageUri)) * 31, this.isVideo));
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public MediaEntryUiModel(String str, String str2, String str3, String str4, String str5, boolean z, List<String> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 6);
        this.name = str;
        this.relativePath = str2;
        this.imageUri = str3;
        this.tileImageUri = str4;
        this.galleryImageUri = str5;
        this.isVideo = z;
        this.previewUris = list;
    }

    public final MediaEntryUiModel copy(String str, String str2, String str3, String str4, String str5, boolean z, List<String> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 6);
        return new MediaEntryUiModel(str, str2, str3, str4, str5, z, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MediaEntryUiModel(String str, String str2, String str3, String str4, String str5, boolean z, List list, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? C0881AGi.A00 : list);
    }
}
