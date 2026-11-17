package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.C1062ATq;
import X.C10G;
import X.C3U4;
import X.G0W;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.feed.view.ComposableSingletons$FeedTabScreenKt$lambda$-900963074$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$FeedTabScreenKt$lambda$900963074$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$FeedTabScreenKt$lambda$900963074$1 INSTANCE = new ComposableSingletons$FeedTabScreenKt$lambda$900963074$1();

    public ComposableSingletons$FeedTabScreenKt$lambda$900963074$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingMedium;
            FeedEmptyStateKt.FeedSetupStatus(C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, f, 0.0f, f), bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
