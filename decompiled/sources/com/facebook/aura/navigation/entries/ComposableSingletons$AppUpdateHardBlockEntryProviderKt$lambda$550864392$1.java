package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C78N;
import X.G0W;
import com.facebook.aura.appupdate.AppUpdateHardBlockScreenKt;
import com.facebook.aura.navigation.key.AppUpdateHardBlockOverlayScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AppUpdateHardBlockEntryProviderKt$lambda$-550864392$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AppUpdateHardBlockEntryProviderKt$lambda$550864392$1 extends AbstractC7559F3s implements G0W<AppUpdateHardBlockOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AppUpdateHardBlockEntryProviderKt$lambda$550864392$1 INSTANCE = new ComposableSingletons$AppUpdateHardBlockEntryProviderKt$lambda$550864392$1();

    public ComposableSingletons$AppUpdateHardBlockEntryProviderKt$lambda$550864392$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AppUpdateHardBlockOverlayScreenKey appUpdateHardBlockOverlayScreenKey, BFM bfm, Integer num) {
        invoke(appUpdateHardBlockOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AppUpdateHardBlockOverlayScreenKey appUpdateHardBlockOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BRg bRgA0N = C06G.A0N(bfm, C10G.A01);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$AppUpdateHardBlockEntryProviderKt$lambda$550864392$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AppUpdateHardBlockScreenKt.AppUpdateHardBlockScreen(bRgA0N, (Function0) objAaT, bfm, 48, 0);
            return;
        }
        bfm.Afo();
    }
}
