package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* renamed from: com.facebook.aura.library.view.ComposableSingletons$GoalsCompletedScreenKt$lambda$-1661463012$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$GoalsCompletedScreenKt$lambda$1661463012$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$GoalsCompletedScreenKt$lambda$1661463012$1 INSTANCE = new ComposableSingletons$GoalsCompletedScreenKt$lambda$1661463012$1();

    public ComposableSingletons$GoalsCompletedScreenKt$lambda$1661463012$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C06G.A0f(bfm, R.string._name_removed__res_0x7f120a71);
        } else {
            bfm.Afo();
        }
    }
}
