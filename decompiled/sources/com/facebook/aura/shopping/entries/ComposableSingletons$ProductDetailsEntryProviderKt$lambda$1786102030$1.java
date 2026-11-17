package com.facebook.aura.shopping.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.shopping.view.InstacartProductDetailsSheetKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductDetailsEntryProviderKt$lambda$1786102030$1 extends AbstractC7559F3s implements G0W<InstacartProductDetailsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ProductDetailsEntryProviderKt$lambda$1786102030$1 INSTANCE = new ComposableSingletons$ProductDetailsEntryProviderKt$lambda$1786102030$1();

    public ComposableSingletons$ProductDetailsEntryProviderKt$lambda$1786102030$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, BFM bfm, Integer num) {
        invoke(instacartProductDetailsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, BFM bfm, int i) {
        InstacartProductDetailsSheetKt.InstacartProductDetailsSheet(instacartProductDetailsSheetKey, null, bfm, AnonymousClass006.A0E(instacartProductDetailsSheetKey, i), 2);
    }
}
