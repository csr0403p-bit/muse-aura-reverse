package com.facebook.aura.ageverification;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SelfieAgeStepReviewingKt {
    public static final float PTR_RING_TO_BOUNDS = 0.6f;

    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepReviewingKt$SelfieAgeStepReviewing$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieAgeStepReviewingKt.SelfieAgeStepReviewing(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SelfieAgeStepReviewing(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(611795281);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            SelfieCircleKt.SelfieCircle(C90l.A00, null, ComposableSingletons$SelfieAgeStepReviewingKt.f8lambda$594716220, bfm, 390, 1);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120076);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bs0, f, 0.0f), 0.0f, f, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SelfieAgeStepReviewingKt$SelfieAgeStepReviewing$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }
}
