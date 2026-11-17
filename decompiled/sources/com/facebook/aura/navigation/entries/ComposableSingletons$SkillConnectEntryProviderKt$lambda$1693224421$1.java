package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.FirstPartyManageAccountsSheetKey;
import com.facebook.aura.skills.connect.SkillManageAccountsBottomSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SkillConnectEntryProviderKt$lambda$-1693224421$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SkillConnectEntryProviderKt$lambda$1693224421$1 extends AbstractC7559F3s implements G0W<FirstPartyManageAccountsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SkillConnectEntryProviderKt$lambda$1693224421$1 INSTANCE = new ComposableSingletons$SkillConnectEntryProviderKt$lambda$1693224421$1();

    public ComposableSingletons$SkillConnectEntryProviderKt$lambda$1693224421$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FirstPartyManageAccountsSheetKey firstPartyManageAccountsSheetKey, BFM bfm, Integer num) {
        invoke(firstPartyManageAccountsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FirstPartyManageAccountsSheetKey firstPartyManageAccountsSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(firstPartyManageAccountsSheetKey, 0);
        SkillManageAccountsBottomSheetKt.SkillManageAccountsScreen(firstPartyManageAccountsSheetKey.connectorId, bfm, 0);
    }
}
