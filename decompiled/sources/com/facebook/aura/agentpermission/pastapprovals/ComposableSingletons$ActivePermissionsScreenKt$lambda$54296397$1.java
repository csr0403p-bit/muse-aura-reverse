package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.C10G;
import X.G0W;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ActivePermissionsScreenKt$lambda$54296397$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$ActivePermissionsScreenKt$lambda$54296397$1 INSTANCE = new ComposableSingletons$ActivePermissionsScreenKt$lambda$54296397$1();

    public ComposableSingletons$ActivePermissionsScreenKt$lambda$54296397$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchScreenLoadingStateKt.HatchScreenLoadingState(C10G.A04(C10G.A02, 240.0f), bfm, 6, 0);
        } else {
            bfm.Afo();
        }
    }
}
