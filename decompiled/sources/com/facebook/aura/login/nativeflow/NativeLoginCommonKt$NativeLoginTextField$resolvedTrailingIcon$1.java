package com.facebook.aura.login.nativeflow;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C1AC;
import X.C2VU;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginTextField$resolvedTrailingIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $clearButtonContentDescription;
    public final /* synthetic */ G0U<String, Unit> $onChange;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCommonKt$NativeLoginTextField$resolvedTrailingIcon$1(G0U<? super String, Unit> g0u, String str, G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(2);
        this.$onChange = g0u;
        this.$clearButtonContentDescription = str;
        this.$trailingIcon = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            C1AC c1ac = C2VU.A04;
            G0U<String, Unit> g0u = this.$onChange;
            String str = this.$clearButtonContentDescription;
            G0V<BFM, Integer, Unit> g0v = this.$trailingIcon;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            AuraTextInputDefaults auraTextInputDefaults = AuraTextInputDefaults.INSTANCE;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.circle_x_wght400_outline_24, 0);
            boolean zA65 = bfm.A65(g0u);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new NativeLoginCommonKt$NativeLoginTextField$resolvedTrailingIcon$1$1$1$1(g0u);
                bfm.Ai0(objAaT);
            }
            auraTextInputDefaults.TrailingIconButton(aVyA00, (Function0) objAaT, false, str, bfm, AVy.$stable | RuntimeInternals.IOPRIO_BACKGROUND, 4);
            if (g0v == null) {
                bfm.AgE(226770981);
            } else {
                bfm.AgE(-962516132);
                AnonymousClass001.A1H(bfm, g0v, 0);
            }
            AnonymousClass003.A0q(bbi);
            return;
        }
        bfm.Afo();
    }
}
