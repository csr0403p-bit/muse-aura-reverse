package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDocumentCardKt$DocumentThumbnail$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $fileFormat;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ boolean $isSpace;
    public final /* synthetic */ String $xmdsIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDocumentCardKt$DocumentThumbnail$1$2(boolean z, String str, String str2, String str3) {
        super(2);
        this.$isSpace = z;
        this.$iconUrl = str;
        this.$xmdsIcon = str2;
        this.$fileFormat = str3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchDocumentCardKt.DocumentArtifactIcon(this.$isSpace, this.$iconUrl, this.$xmdsIcon, this.$fileFormat, null, bfm, 0, 16);
        } else {
            bfm.Afo();
        }
    }
}
