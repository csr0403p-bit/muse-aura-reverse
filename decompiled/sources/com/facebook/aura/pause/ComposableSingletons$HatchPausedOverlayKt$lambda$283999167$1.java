package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C06G;
import X.G0V;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.pause.ComposableSingletons$HatchPausedOverlayKt$lambda$-283999167$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchPausedOverlayKt$lambda$283999167$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchPausedOverlayKt$lambda$283999167$1 INSTANCE = new ComposableSingletons$HatchPausedOverlayKt$lambda$283999167$1();

    public ComposableSingletons$HatchPausedOverlayKt$lambda$283999167$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraTextKt.m2639AuraTextUY9GdpU(HatchAppName.value, null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 6, 0, 16370);
        } else {
            bfm.Afo();
        }
    }
}
