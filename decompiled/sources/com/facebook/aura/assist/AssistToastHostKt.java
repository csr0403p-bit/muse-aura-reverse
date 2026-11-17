package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BNH;
import X.BRg;
import X.C06G;
import X.C1743Apg;
import X.C1HY;
import X.C1Ny;
import X.C1OQ;
import X.C3P4;
import X.C3U4;
import X.C3UC;
import X.C78N;
import X.EnumC10573Huf;
import X.G0V;
import X.G0W;
import com.facebook.aura.toast.HatchGlobalToastKt;
import com.facebook.aura.toast.HatchToastHostKt;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AssistToastHostKt {

    /* renamed from: com.facebook.aura.assist.AssistToastHostKt$AssistToastHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            AssistToastHostKt.AssistToastHost(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistToastHostKt$AssistToastHost$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
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
            AssistToastHostKt.AssistToastHost(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AssistToastHost(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        bfm.AgG(-912019978);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (!((EnumC10573Huf) C3P4.A00(bfm, C1HY.A00(bfm)).getValue()).A00(EnumC10573Huf.A06)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(bRg, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            AssistIdentityState assistIdentityState = (AssistIdentityState) bfm.A6v(AssistIdentityStateKt.LocalAssistIdentityState);
            C1Ny c1Ny = C1743Apg.A01(bfm).A0E;
            HatchGlobalToastKt.HatchGlobalToast(bfm, 0);
            BRg bRgAuraContentWidth = AuraContentFrameKt.auraContentWidth(C3U4.A07(BNH.A00(new C1OQ(c1Ny, 15), bRg), C06G.A00(bfm)), AuraContentRole.Standard, bfm, 48);
            boolean zA1N = AnonymousClass003.A1N(bfm, assistIdentityState, c1Ny);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new AssistToastHostKt$AssistToastHost$2$1(assistIdentityState, c1Ny);
                bfm.Ai0(objAaT);
            }
            HatchToastHostKt.HatchToastHostOverlay(C3UC.A00(bRgAuraContentWidth, (G0W) objAaT), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(bRg, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
