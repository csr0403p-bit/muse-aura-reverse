package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.skills.connect.SkillConnectDisconnectRouterScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SkillConnectEntryProviderKt$lambda$-1866969450$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SkillConnectEntryProviderKt$lambda$1866969450$1 extends AbstractC7559F3s implements G0W<SkillConnectDisconnectRouterScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SkillConnectEntryProviderKt$lambda$1866969450$1 INSTANCE = new ComposableSingletons$SkillConnectEntryProviderKt$lambda$1866969450$1();

    public ComposableSingletons$SkillConnectEntryProviderKt$lambda$1866969450$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, BFM bfm, Integer num) {
        invoke(skillConnectDisconnectRouterScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, BFM bfm, int i) {
        SkillConnectDisconnectRouterScreenKt.SkillConnectDisconnectRouterScreen(skillConnectDisconnectRouterScreenKey, null, bfm, AnonymousClass006.A0E(skillConnectDisconnectRouterScreenKey, i), 2);
    }
}
