package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.SpaceMenuSheetKey;
import com.facebook.aura.spaces.view.SpaceMenuSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SpaceMenuSheetEntryProviderKt$lambda$-1678968024$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SpaceMenuSheetEntryProviderKt$lambda$1678968024$1 extends AbstractC7559F3s implements G0W<SpaceMenuSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpaceMenuSheetEntryProviderKt$lambda$1678968024$1 INSTANCE = new ComposableSingletons$SpaceMenuSheetEntryProviderKt$lambda$1678968024$1();

    public ComposableSingletons$SpaceMenuSheetEntryProviderKt$lambda$1678968024$1() {
        super(3);
    }

    public final void invoke(SpaceMenuSheetKey spaceMenuSheetKey, BFM bfm, int i) {
        SpaceMenuSheetKt.SpaceMenuSheet(spaceMenuSheetKey, null, bfm, AnonymousClass006.A0E(spaceMenuSheetKey, i), 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SpaceMenuSheetKey spaceMenuSheetKey, BFM bfm, Integer num) {
        invoke(spaceMenuSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
