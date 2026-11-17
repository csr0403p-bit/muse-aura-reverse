package com.facebook.aura.pairs;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C10G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.pairs.ComposableSingletons$ConnectionsComponentsKt$lambda$-2117883274$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectionsComponentsKt$lambda$2117883274$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectionsComponentsKt$lambda$2117883274$1 INSTANCE = new ComposableSingletons$ConnectionsComponentsKt$lambda$2117883274$1();

    public ComposableSingletons$ConnectionsComponentsKt$lambda$2117883274$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AuraIconKt.m2568AuraIconFyETyZw(C10G.A06(BRg.A00, 24.0f), BOf.A00(bfm, R.drawable.userbadgesearch_outline_24_wght400, 0), 24.0f, null, C06G.A09(bfm), null, bfm, (AVy.$stable << 3) | 390, 40);
            return;
        }
        bfm.Afo();
    }
}
