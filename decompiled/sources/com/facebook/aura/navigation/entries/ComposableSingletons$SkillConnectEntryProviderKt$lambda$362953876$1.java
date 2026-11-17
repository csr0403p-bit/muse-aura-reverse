package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.SkillAlreadyConnectedOrDisconnectedSheetKey;
import com.facebook.aura.skills.connect.SkillAlreadyConnectedOrDisconnectedSheetKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$SkillConnectEntryProviderKt$lambda$362953876$1 extends AbstractC7559F3s implements G0W<SkillAlreadyConnectedOrDisconnectedSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SkillConnectEntryProviderKt$lambda$362953876$1 INSTANCE = new ComposableSingletons$SkillConnectEntryProviderKt$lambda$362953876$1();

    public ComposableSingletons$SkillConnectEntryProviderKt$lambda$362953876$1() {
        super(3);
    }

    public final void invoke(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey, BFM bfm, int i) {
        SkillAlreadyConnectedOrDisconnectedSheetKt.SkillAlreadyConnectedOrDisconnectedSheet(skillAlreadyConnectedOrDisconnectedSheetKey, null, bfm, AnonymousClass006.A0E(skillAlreadyConnectedOrDisconnectedSheetKey, i), 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey, BFM bfm, Integer num) {
        invoke(skillAlreadyConnectedOrDisconnectedSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
