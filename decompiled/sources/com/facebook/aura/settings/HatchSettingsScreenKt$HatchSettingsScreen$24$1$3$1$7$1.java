package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C10G;
import X.G0W;
import com.facebook.aura.settings.api.SettingsConnectionsRowContributor;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$7$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ SettingsConnectionsRowContributor $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$3$1$7$1(SettingsConnectionsRowContributor settingsConnectionsRowContributor) {
        super(3);
        this.$row = settingsConnectionsRowContributor;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            this.$row.Row(C10G.A02, bfm, 6);
        } else {
            bfm.Afo();
        }
    }
}
