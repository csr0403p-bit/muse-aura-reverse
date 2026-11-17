package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.PairsAcceptLinkSheetKey;
import com.facebook.aura.pairs.PairsAcceptLinkScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$897644212$1 extends AbstractC7559F3s implements G0W<PairsAcceptLinkSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$897644212$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$897644212$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$897644212$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey, BFM bfm, Integer num) {
        invoke(pairsAcceptLinkSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey, BFM bfm, int i) {
        PairsAcceptLinkScreenKt.PairsAcceptLinkScreen(pairsAcceptLinkSheetKey, null, bfm, AnonymousClass006.A0E(pairsAcceptLinkSheetKey, i), 2);
    }
}
