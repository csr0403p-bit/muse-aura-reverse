package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.sharesheet.ComposableSingletons$HatchShareSheetKt$lambda$-160432371$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchShareSheetKt$lambda$160432371$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchShareSheetKt$lambda$160432371$1 INSTANCE = new ComposableSingletons$HatchShareSheetKt$lambda$160432371$1();

    public ComposableSingletons$HatchShareSheetKt$lambda$160432371$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchMessageShareReviewKt.HatchMessageShareReviewWarning(C3U4.A0A(BRg.A00, 24.0f, 16.0f), bfm, 6, 0);
        } else {
            bfm.Afo();
        }
    }
}
