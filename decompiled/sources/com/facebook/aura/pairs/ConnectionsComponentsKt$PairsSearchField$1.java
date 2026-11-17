package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConnectionsComponentsKt$PairsSearchField$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $placeholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsComponentsKt$PairsSearchField$1(String str) {
        super(2);
        this.$placeholder = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(this.$placeholder, null, C06G.A09(bfm), c1822ArmA0T, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            return;
        }
        bfm.Afo();
    }
}
