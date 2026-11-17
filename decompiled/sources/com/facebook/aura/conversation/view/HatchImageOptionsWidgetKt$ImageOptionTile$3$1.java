package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.C78N;
import X.G0V;
import X.InterfaceC7353EnQ;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$ImageOptionTile$3$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ImageOptionTileAnchor $anchor;
    public final /* synthetic */ String $path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionsWidgetKt$ImageOptionTile$3$1(ImageOptionTileAnchor imageOptionTileAnchor, String str) {
        super(2);
        this.$anchor = imageOptionTileAnchor;
        this.$path = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            ImageOptionTileAnchor imageOptionTileAnchor = this.$anchor;
            boolean zA65 = bfm.A65(imageOptionTileAnchor);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchImageOptionsWidgetKt$ImageOptionTile$3$1$1$1(imageOptionTileAnchor);
                bfm.Ai0(objAaT);
            }
            HatchImageOptionsWidgetKt.ImageOptionImage(this.$path, null, C10G.A01, (G0V) ((InterfaceC7353EnQ) objAaT), bfm, 432, 0);
            return;
        }
        bfm.Afo();
    }
}
