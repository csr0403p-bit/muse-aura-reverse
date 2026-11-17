package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDocumentCardKt$DocumentThumbnail$1$3 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ String $fileFormat;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ boolean $isSpace;
    public final /* synthetic */ String $xmdsIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDocumentCardKt$DocumentThumbnail$1$3(boolean z, String str, String str2, String str3) {
        super(3);
        this.$isSpace = z;
        this.$iconUrl = str;
        this.$xmdsIcon = str2;
        this.$fileFormat = str3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            HatchDocumentCardKt.DocumentArtifactIcon(this.$isSpace, this.$iconUrl, this.$xmdsIcon, this.$fileFormat, bRg, bfm, (i << 12) & 57344, 0);
        } else {
            bfm.Afo();
        }
    }
}
