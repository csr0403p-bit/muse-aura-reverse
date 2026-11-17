package com.facebook.aura.conversation.view;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.B6A;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C10G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchScheduledTaskCreatedCardKt$lambda$588655323$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchScheduledTaskCreatedCardKt$lambda$588655323$1 INSTANCE = new ComposableSingletons$HatchScheduledTaskCreatedCardKt$lambda$588655323$1();

    public ComposableSingletons$HatchScheduledTaskCreatedCardKt$lambda$588655323$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_file_types_calendar_40, 0);
            long j = B6A.A07;
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(BRg.A00, 44.0f), aVyA00, AuraIconSize.LARGE, null, j, null, bfm, (AVy.$stable << 3) | 28038, 32);
            return;
        }
        bfm.Afo();
    }
}
