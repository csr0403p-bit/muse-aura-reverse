package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C06G;
import X.G0V;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.feed.view.ComposableSingletons$FeedUnitRowKt$lambda$-761962852$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$FeedUnitRowKt$lambda$761962852$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$FeedUnitRowKt$lambda$761962852$1 INSTANCE = new ComposableSingletons$FeedUnitRowKt$lambda$761962852$1();

    public ComposableSingletons$FeedUnitRowKt$lambda$761962852$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, C06G.A08(bfm), bfm, 0, 3);
        } else {
            bfm.Afo();
        }
    }
}
