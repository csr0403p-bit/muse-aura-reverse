package com.facebook.aura.conversation.search;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C0v5;
import X.C10G;
import X.C1YD;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$2$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $clearContentDescription;
    public final /* synthetic */ Function0<Unit> $onClear;
    public final /* synthetic */ G0U<String, Unit> $onQueryChange;
    public final /* synthetic */ long $searchIconColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchScreenKt$SearchTextField$2$1$3(String str, Function0<Unit> function0, G0U<? super String, Unit> g0u, long j) {
        super(2);
        this.$clearContentDescription = str;
        this.$onClear = function0;
        this.$onQueryChange = g0u;
        this.$searchIconColor = j;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraDrawableSourceResource auraDrawableSourceResource = new AuraDrawableSourceResource(R.drawable.circle_x_wght400_outline_24);
            BRg bRgA07 = C10G.A07(BRg.A00, 20.0f);
            String strA01 = this.$clearContentDescription;
            if (strA01 == null) {
                bfm.AgE(-1116063343);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e80);
            } else {
                bfm.AgE(-1116065358);
            }
            AnonymousClass001.A1D(bfm);
            C1YD c1yd = new C1YD(0);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onQueryChange, bfm.A65(this.$onClear));
            Function0<Unit> function0 = this.$onClear;
            G0U<String, Unit> g0u = this.$onQueryChange;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new ConversationSearchScreenKt$SearchTextField$2$1$3$1$1(function0, g0u);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA07, c1yd, strA01, (Function0) objAaT, true);
            C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
            AuraImageKt.m2576auraTintColor4WTKRHQ(c7196Ei8, this.$searchIconColor);
            AuraImageKt.AuraImage(auraDrawableSourceResource, bRgA04, null, new C7197Ei9(c7196Ei8), false, false, null, false, null, bfm, 0, 500);
            return;
        }
        bfm.Afo();
    }
}
