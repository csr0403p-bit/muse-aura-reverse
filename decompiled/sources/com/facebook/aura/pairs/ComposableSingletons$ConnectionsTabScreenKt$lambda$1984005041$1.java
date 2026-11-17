package com.facebook.aura.pairs;

import X.AKH;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C10G;
import X.C1D8;
import X.C1b8;
import X.C3U4;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.pairs.ComposableSingletons$ConnectionsTabScreenKt$lambda$-1984005041$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectionsTabScreenKt$lambda$1984005041$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectionsTabScreenKt$lambda$1984005041$1 INSTANCE = new ComposableSingletons$ConnectionsTabScreenKt$lambda$1984005041$1();

    public ComposableSingletons$ConnectionsTabScreenKt$lambda$1984005041$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AVy aVyA00 = BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0L = C06G.A0L(bfm, akh);
            BS0 bs0 = BRg.A00;
            float f = ConnectionsTabScreenKt.AVATAR_SIZE;
            AuraIconKt.m2568AuraIconFyETyZw(C3U4.A09(C1b8.A03(C10G.A07(bs0, f), C1D8.A00, AnonymousClass001.A0f(bfm, akh).highlight), (f - 20.0f) / 2.0f), aVyA00, 20.0f, null, jA0L, null, bfm, AnonymousClass001.A04(), 32);
            return;
        }
        bfm.Afo();
    }
}
