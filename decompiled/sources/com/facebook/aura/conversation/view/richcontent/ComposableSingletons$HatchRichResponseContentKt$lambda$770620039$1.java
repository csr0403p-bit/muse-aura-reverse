package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchRichResponseContentKt$lambda$770620039$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchRichResponseContentKt$lambda$770620039$1 INSTANCE = new ComposableSingletons$HatchRichResponseContentKt$lambda$770620039$1();

    public ComposableSingletons$HatchRichResponseContentKt$lambda$770620039$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
        } else {
            bfm.Afo();
        }
    }
}
