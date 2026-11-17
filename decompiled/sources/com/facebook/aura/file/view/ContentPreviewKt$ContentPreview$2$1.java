package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ContentPreviewKt$ContentPreview$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ String $relativePath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPreviewKt$ContentPreview$2$1(String str, String str2, String str3) {
        super(2);
        this.$relativePath = str;
        this.$fileExtension = str2;
        this.$imageUri = str3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            FileThumbnailPreviewKt.FileThumbnailPreview(this.$relativePath, this.$fileExtension, this.$imageUri, C10G.A01, null, null, null, bfm, 3072, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
    }
}
