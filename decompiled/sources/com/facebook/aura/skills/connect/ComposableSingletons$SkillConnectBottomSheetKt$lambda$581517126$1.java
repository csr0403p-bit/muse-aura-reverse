package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.skills.connect.ComposableSingletons$SkillConnectBottomSheetKt$lambda$-581517126$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SkillConnectBottomSheetKt$lambda$581517126$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$SkillConnectBottomSheetKt$lambda$581517126$1 INSTANCE = new ComposableSingletons$SkillConnectBottomSheetKt$lambda$581517126$1();

    public ComposableSingletons$SkillConnectBottomSheetKt$lambda$581517126$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            SkillConnectBottomSheetKt.LinkedAccountsLoadingRow(bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
