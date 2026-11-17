package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.skills.view.ComposableSingletons$HatchConnectorPermissionsListScreenKt$lambda$-39988686$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchConnectorPermissionsListScreenKt$lambda$39988686$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchConnectorPermissionsListScreenKt$lambda$39988686$1 INSTANCE = new ComposableSingletons$HatchConnectorPermissionsListScreenKt$lambda$39988686$1();

    public ComposableSingletons$HatchConnectorPermissionsListScreenKt$lambda$39988686$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            ConnectorRowKt.ConnectedSkillChevron(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
