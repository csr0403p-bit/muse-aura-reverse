package com.facebook.aura.activation.view;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.B6A;
import X.BFM;
import X.BOf;
import X.C06G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import kotlin.Unit;

/* renamed from: com.facebook.aura.activation.view.ComposableSingletons$AuraDisclosureInfoBannerKt$lambda$-1032673300$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AuraDisclosureInfoBannerKt$lambda$1032673300$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraDisclosureInfoBannerKt$lambda$1032673300$1 INSTANCE = new ComposableSingletons$AuraDisclosureInfoBannerKt$lambda$1032673300$1();

    public ComposableSingletons$AuraDisclosureInfoBannerKt$lambda$1032673300$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AuraCardDefaults.INSTANCE.m2478LeadingIcongKt5lHk(null, BOf.A00(bfm, R.drawable.circle_info_wght400_outline_24, 0), new B6A(C06G.A06(bfm)), bfm, (AVy.$stable << 3) | 3072, 1);
        } else {
            bfm.Afo();
        }
    }
}
