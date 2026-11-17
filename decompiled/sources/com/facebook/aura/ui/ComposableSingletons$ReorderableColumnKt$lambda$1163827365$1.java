package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.BRg;
import X.G2j;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ReorderableColumnKt$lambda$1163827365$1 extends AbstractC7559F3s implements G2j<Integer, BRg, BFM, Integer, Unit> {
    public static final ComposableSingletons$ReorderableColumnKt$lambda$1163827365$1 INSTANCE = new ComposableSingletons$ReorderableColumnKt$lambda$1163827365$1();

    public ComposableSingletons$ReorderableColumnKt$lambda$1163827365$1() {
        super(4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BRg bRg, BFM bfm, Integer num2) {
        invoke(AnonymousClass001.A0F(num), bRg, bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, BRg bRg, BFM bfm, int i2) {
        AnonymousClass007.A1D(AnonymousClass002.A1P(i2 & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, i2);
    }
}
