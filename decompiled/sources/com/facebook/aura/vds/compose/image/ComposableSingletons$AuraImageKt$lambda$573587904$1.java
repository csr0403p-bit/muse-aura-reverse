package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.vds.compose.image.ComposableSingletons$AuraImageKt$lambda$-573587904$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AuraImageKt$lambda$573587904$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraImageKt$lambda$573587904$1 INSTANCE = new ComposableSingletons$AuraImageKt$lambda$573587904$1();

    public ComposableSingletons$AuraImageKt$lambda$573587904$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        AnonymousClass007.A1C(AnonymousClass002.A1P(i & 3, 2), bfm, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
