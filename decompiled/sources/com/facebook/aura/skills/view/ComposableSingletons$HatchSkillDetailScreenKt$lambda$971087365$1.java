package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.skills.view.ComposableSingletons$HatchSkillDetailScreenKt$lambda$-971087365$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchSkillDetailScreenKt$lambda$971087365$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchSkillDetailScreenKt$lambda$971087365$1 INSTANCE = new ComposableSingletons$HatchSkillDetailScreenKt$lambda$971087365$1();

    public ComposableSingletons$HatchSkillDetailScreenKt$lambda$971087365$1() {
        super(3);
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchSkillDetailScreenKt.LinkedAccountsLoadingRow(bfm, 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
