package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C06G;
import X.C10G;
import X.C1DG;
import X.C3Ue;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$551692629$1 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$551692629$1 INSTANCE = new ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$551692629$1();

    public ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$551692629$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
        m727invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m727invoke8Feqmps(float f, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A04(bfm, f);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 19, 18), bfm, i)) {
            C3Ue.A04(C06G.A0N(bfm, C10G.A04(C10G.A02, f)), bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
