package com.facebook.aura.globaleffects;

import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C78N;
import X.EnumC10573Huf;
import X.G0V;
import android.app.Activity;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchVmRestartEffectKt {

    /* renamed from: com.facebook.aura.globaleffects.HatchVmRestartEffectKt$HatchVmRestartEffect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVmRestartEffectKt.HatchVmRestartEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchVmRestartEffectKt$HatchVmRestartEffect$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVmRestartEffectKt.HatchVmRestartEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchVmRestartEffectKt$HatchVmRestartToastEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVmRestartEffectKt.HatchVmRestartToastEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchVmRestartEffect(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass3;
        bfm.AgG(355975249);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            HatchVmRestartRequest companion = HatchVmRestartRequest.Companion.getInstance(AnonymousClass002.A0h(bfm));
            C1BO c1boA01 = C2CK.A01(bfm, EnumC10573Huf.A05, false, companion.isPending, 3120, 10);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            if (!C1BO.A0F(c1boA01) || activity == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(i);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            Unit unit = Unit.INSTANCE;
            boolean zA1M = AnonymousClass003.A1M(bfm, companion, activity);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchVmRestartEffectKt$HatchVmRestartEffect$2$1(companion, activity);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(i);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void HatchVmRestartToastEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 2067506358, i), bfm, i)) {
            HatchVmRestartRequest companion = HatchVmRestartRequest.Companion.getInstance(AnonymousClass002.A0h(bfm));
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120636);
            boolean zA1N = AnonymousClass003.A1N(bfm, companion, strA0v);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1(companion, strA0v, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, companion);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
