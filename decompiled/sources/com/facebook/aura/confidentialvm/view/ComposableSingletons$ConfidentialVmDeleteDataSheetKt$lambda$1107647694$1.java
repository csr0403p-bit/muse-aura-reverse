package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.BOf;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmDeleteDataSheetKt$lambda$1107647694$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmDeleteDataSheetKt$lambda$1107647694$1 INSTANCE = new ComposableSingletons$ConfidentialVmDeleteDataSheetKt$lambda$1107647694$1();

    public ComposableSingletons$ConfidentialVmDeleteDataSheetKt$lambda$1107647694$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.arrowdownload_outline_24_wght400, 0), AuraIconSize.SMALL, null, 0L, null, bfm, AnonymousClass001.A03(), 57);
        } else {
            bfm.Afo();
        }
    }
}
