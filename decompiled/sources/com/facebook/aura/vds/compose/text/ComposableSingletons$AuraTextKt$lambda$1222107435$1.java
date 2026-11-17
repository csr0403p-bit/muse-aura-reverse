package com.facebook.aura.vds.compose.text;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C3U4;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* renamed from: com.facebook.aura.vds.compose.text.ComposableSingletons$AuraTextKt$lambda$-1222107435$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AuraTextKt$lambda$1222107435$1 extends AbstractC7559F3s implements G0W<String, BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraTextKt$lambda$1222107435$1 INSTANCE = new ComposableSingletons$AuraTextKt$lambda$1222107435$1();

    public ComposableSingletons$AuraTextKt$lambda$1222107435$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, BFM bfm, Integer num) {
        invoke(str, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A07(BRg.A00, AuraDimensKt.SpacingMicro), BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_ic_export, 0), AuraIconSize.TINY, null, C06G.A07(bfm), null, bfm, AnonymousClass001.A03(), 40);
        } else {
            bfm.Afo();
        }
    }
}
