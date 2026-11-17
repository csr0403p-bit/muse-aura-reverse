package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.SavedSpaceAudienceScreenKey;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SpaceInviteEntryProviderKt$lambda$-1301694497$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SpaceInviteEntryProviderKt$lambda$1301694497$1 extends AbstractC7559F3s implements G0W<SavedSpaceAudienceScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpaceInviteEntryProviderKt$lambda$1301694497$1 INSTANCE = new ComposableSingletons$SpaceInviteEntryProviderKt$lambda$1301694497$1();

    public ComposableSingletons$SpaceInviteEntryProviderKt$lambda$1301694497$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SavedSpaceAudienceScreenKey savedSpaceAudienceScreenKey, BFM bfm, Integer num) {
        invoke(savedSpaceAudienceScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SavedSpaceAudienceScreenKey savedSpaceAudienceScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(savedSpaceAudienceScreenKey, 0);
        SavedSpaceAudienceScreenKt.SavedSpaceAudienceScreen(savedSpaceAudienceScreenKey.shortcode, null, bfm, 0, 2);
    }
}
