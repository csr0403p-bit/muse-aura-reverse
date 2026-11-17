package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.G0V;
import com.facebook.aura.file.view.FileThumbnailPreviewKt;
import com.facebook.aura.library.model.RecentFile;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDocumentCardKt$DocumentThumbnail$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ RecentFile $file;
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ boolean $isVideoFile;
    public final /* synthetic */ AHD<String> $previewUris;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDocumentCardKt$DocumentThumbnail$1$4(boolean z, AHD<String> ahd, RecentFile recentFile, String str, String str2) {
        super(2);
        this.$isVideoFile = z;
        this.$previewUris = ahd;
        this.$file = recentFile;
        this.$fileExtension = str;
        this.$imageUri = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            if (this.$isVideoFile) {
                bfm.AgE(171136540);
                MediaSectionKt.VideoThumbnail(this.$previewUris, C10G.A01, null, null, bfm, 48, 12);
            } else {
                bfm.AgE(171245691);
                FileThumbnailPreviewKt.FileThumbnailPreview(this.$file.relativePath, this.$fileExtension, this.$imageUri, C10G.A01, null, null, null, bfm, 3072, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            }
            AnonymousClass002.A19(bfm);
            return;
        }
        bfm.Afo();
    }
}
