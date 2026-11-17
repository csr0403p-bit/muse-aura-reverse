package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C7196Ei8;
import X.C7197Ei9;
import X.G0V;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$2$1$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ long $searchIconColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$SearchTextField$2$1$2$1(int i, long j) {
        super(2);
        this.$iconRes = i;
        this.$searchIconColor = j;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraDrawableSourceResource auraDrawableSourceResource = new AuraDrawableSourceResource(this.$iconRes);
            BRg bRgA07 = C10G.A07(BRg.A00, 20.0f);
            C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
            AuraImageKt.m2576auraTintColor4WTKRHQ(c7196Ei8, this.$searchIconColor);
            AuraImageKt.AuraImage(auraDrawableSourceResource, bRgA07, null, new C7197Ei9(c7196Ei8), false, false, null, false, null, bfm, 48, 500);
            return;
        }
        bfm.Afo();
    }
}
