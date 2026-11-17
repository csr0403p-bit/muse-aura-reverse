package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.skills.view.HatchSkillDetailScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$HatchSkillDetailEntryProviderKt$lambda$-1271814836$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchSkillDetailEntryProviderKt$lambda$1271814836$1 extends AbstractC7559F3s implements G0W<HatchSkillDetailScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchSkillDetailEntryProviderKt$lambda$1271814836$1 INSTANCE = new ComposableSingletons$HatchSkillDetailEntryProviderKt$lambda$1271814836$1();

    public ComposableSingletons$HatchSkillDetailEntryProviderKt$lambda$1271814836$1() {
        super(3);
    }

    public final void invoke(HatchSkillDetailScreenKey hatchSkillDetailScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchSkillDetailScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = hatchSkillDetailScreenKey.connectorId;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$HatchSkillDetailEntryProviderKt$lambda$1271814836$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchSkillDetailScreenKt.HatchSkillDetailScreen(str, (Function0) objAaT, null, hatchSkillDetailScreenKey, null, bfm, (i << 9) & 7168, 20);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchSkillDetailScreenKey hatchSkillDetailScreenKey, BFM bfm, Integer num) {
        invoke(hatchSkillDetailScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
