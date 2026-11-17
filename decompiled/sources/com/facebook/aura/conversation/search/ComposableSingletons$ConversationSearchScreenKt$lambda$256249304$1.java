package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C01N;
import X.G0W;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.conversation.search.ComposableSingletons$ConversationSearchScreenKt$lambda$-256249304$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConversationSearchScreenKt$lambda$256249304$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConversationSearchScreenKt$lambda$256249304$1 INSTANCE = new ComposableSingletons$ConversationSearchScreenKt$lambda$256249304$1();

    public ComposableSingletons$ConversationSearchScreenKt$lambda$256249304$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            C01N.A08(bfm, BRg.A00, AuraDimensKt.SpacingLarge);
        } else {
            bfm.Afo();
        }
    }
}
