package com.facebook.aura.vds.compose.card;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCardKt$AuraCard$1$6$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AuraCardType $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCardKt$AuraCard$1$6$1$1(AuraCardType auraCardType) {
        super(2);
        this.$type = auraCardType;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraTextKt.m2639AuraTextUY9GdpU(((AuraCardType.TextInput) this.$type).placeholder, null, 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16382);
        } else {
            bfm.Afo();
        }
    }
}
