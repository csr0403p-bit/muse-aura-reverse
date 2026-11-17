package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.PairsStatusSheetKey;
import com.facebook.aura.pairs.PairsStatusScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$1524526828$1 extends AbstractC7559F3s implements G0W<PairsStatusSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$1524526828$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$1524526828$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$1524526828$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PairsStatusSheetKey pairsStatusSheetKey, BFM bfm, Integer num) {
        invoke(pairsStatusSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(PairsStatusSheetKey pairsStatusSheetKey, BFM bfm, int i) {
        PairsStatusScreenKt.PairsStatusScreen(pairsStatusSheetKey, null, bfm, AnonymousClass006.A0E(pairsStatusSheetKey, i), 2);
    }
}
