package com.facebook.aura.playground.itch;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.C1DG;
import X.G2j;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import kotlin.Unit;

/* renamed from: com.facebook.aura.playground.itch.ComposableSingletons$ItchScreenKt$lambda$-796499763$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ItchScreenKt$lambda$796499763$1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public static final ComposableSingletons$ItchScreenKt$lambda$796499763$1 INSTANCE = new ComposableSingletons$ItchScreenKt$lambda$796499763$1();

    public ComposableSingletons$ItchScreenKt$lambda$796499763$1() {
        super(4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m1853invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    public final void m1853invokei1RSzL4(float f, float f2, BFM bfm, int i) {
        AnonymousClass007.A1D(AnonymousClass002.A1P(i & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, i);
    }
}
