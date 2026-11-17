package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.widgets.ComposableSingletons$AskBarWidgetKt$lambda$-1406885305$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$AskBarWidgetKt$lambda$1406885305$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AskBarWidgetKt$lambda$1406885305$1 INSTANCE = new ComposableSingletons$AskBarWidgetKt$lambda$1406885305$1();

    public ComposableSingletons$AskBarWidgetKt$lambda$1406885305$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AskBarWidgetKt.AskBarContent(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
