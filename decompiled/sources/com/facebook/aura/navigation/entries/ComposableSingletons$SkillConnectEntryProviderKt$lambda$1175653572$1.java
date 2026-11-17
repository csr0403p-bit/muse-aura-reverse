package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.SkillConnectSheetKey;
import com.facebook.aura.skills.connect.SkillConnectScreenKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$SkillConnectEntryProviderKt$lambda$1175653572$1 extends AbstractC7559F3s implements G0W<SkillConnectSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SkillConnectEntryProviderKt$lambda$1175653572$1 INSTANCE = new ComposableSingletons$SkillConnectEntryProviderKt$lambda$1175653572$1();

    public ComposableSingletons$SkillConnectEntryProviderKt$lambda$1175653572$1() {
        super(3);
    }

    public final void invoke(SkillConnectSheetKey skillConnectSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(skillConnectSheetKey, 0);
        SkillConnectScreenKt.SkillConnectScreen(skillConnectSheetKey.skillId, null, skillConnectSheetKey.origin, skillConnectSheetKey.sourceSessionId, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SkillConnectSheetKey skillConnectSheetKey, BFM bfm, Integer num) {
        invoke(skillConnectSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
