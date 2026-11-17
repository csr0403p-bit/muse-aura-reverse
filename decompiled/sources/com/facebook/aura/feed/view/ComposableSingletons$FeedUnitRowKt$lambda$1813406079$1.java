package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.feed.view.ComposableSingletons$FeedUnitRowKt$lambda$-1813406079$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$FeedUnitRowKt$lambda$1813406079$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$FeedUnitRowKt$lambda$1813406079$1 INSTANCE = new ComposableSingletons$FeedUnitRowKt$lambda$1813406079$1();

    public ComposableSingletons$FeedUnitRowKt$lambda$1813406079$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        AnonymousClass007.A1C(AnonymousClass002.A1P(i & 3, 2), bfm, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
