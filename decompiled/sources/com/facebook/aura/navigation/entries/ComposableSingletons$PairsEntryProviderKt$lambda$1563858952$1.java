package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.SpaceInviteScreenKey;
import com.facebook.aura.pairs.SpaceCollaboratorsSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PairsEntryProviderKt$lambda$-1563858952$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PairsEntryProviderKt$lambda$1563858952$1 extends AbstractC7559F3s implements G0W<SpaceInviteScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PairsEntryProviderKt$lambda$1563858952$1 INSTANCE = new ComposableSingletons$PairsEntryProviderKt$lambda$1563858952$1();

    public ComposableSingletons$PairsEntryProviderKt$lambda$1563858952$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SpaceInviteScreenKey spaceInviteScreenKey, BFM bfm, Integer num) {
        invoke(spaceInviteScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SpaceInviteScreenKey spaceInviteScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(spaceInviteScreenKey, 0);
        SpaceCollaboratorsSheetKt.SpaceCollaboratorsSheet(spaceInviteScreenKey.slug, null, bfm, 0, 2);
    }
}
