package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.C10G;
import X.C3U4;
import X.G0W;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.feed.view.ComposableSingletons$FeedTabScreenKt$lambda$-142558602$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$FeedTabScreenKt$lambda$142558602$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$FeedTabScreenKt$lambda$142558602$1 INSTANCE = new ComposableSingletons$FeedTabScreenKt$lambda$142558602$1();

    public ComposableSingletons$FeedTabScreenKt$lambda$142558602$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C3U4.A09(C10G.A02, AuraDimensKt.SpacingMedium), null, 0L, bfm, 0, 6);
        } else {
            bfm.Afo();
        }
    }
}
