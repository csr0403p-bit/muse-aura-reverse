package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$1$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorAddAccountCardKt$HatchConnectorAddAccountCard$1$2$1(String str) {
        super(2);
        this.$text = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            HatchInternalLinkActionCardKt.InternalLinkCardSubtitleText(this.$text, null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }
}
