package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.SpaceCollaboratorPickerSheetKey;
import com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PairsEntryProviderKt$lambda$-1734728937$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$1734728937$1 extends AbstractC7559F3s implements G0W<SpaceCollaboratorPickerSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$1734728937$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$1734728937$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$1734728937$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SpaceCollaboratorPickerSheetKey spaceCollaboratorPickerSheetKey, BFM bfm, Integer num) {
        invoke(spaceCollaboratorPickerSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SpaceCollaboratorPickerSheetKey spaceCollaboratorPickerSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(spaceCollaboratorPickerSheetKey, 0);
        SpaceCollaboratorPickerScreenKt.SpaceCollaboratorPickerScreen(spaceCollaboratorPickerSheetKey.slug, null, bfm, 0, 2);
    }
}
