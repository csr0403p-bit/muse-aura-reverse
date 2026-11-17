package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C06G;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.devices.pairing.ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$-38131195$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$38131195$1 extends AbstractC7559F3s implements G0W<String, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$38131195$1 INSTANCE = new ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$38131195$1();

    public ComposableSingletons$HatchDevicePairingBottomSheetsKt$lambda$38131195$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, BFM bfm, Integer num) {
        invoke(str, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(str, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14834);
        } else {
            bfm.Afo();
        }
    }
}
