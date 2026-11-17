package com.facebook.aura.vds.compose.toast;

import X.AKH;
import X.AKQ;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0z7;
import X.C1515AkP;
import X.C15N;
import X.C1BO;
import X.C1D3;
import X.C1D9;
import X.C1DE;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.EnumC1820Arj;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraToastSwipeToDismissBackgroundProvider implements AuraSwipeableCardBackgroundProvider {
    public static final int $stable = 0;
    public static final float BannerOffset = 6.0f;
    public static final AuraToastSwipeToDismissBackgroundProvider INSTANCE = new AuraToastSwipeToDismissBackgroundProvider();

    /* renamed from: com.facebook.aura.vds.compose.toast.AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, AuraSwipeableMenuState auraSwipeableMenuState, int i) {
            super(2);
            this.$modifier = bRg;
            this.$swipeableMenuState = auraSwipeableMenuState;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraToastSwipeToDismissBackgroundProvider.this.SwipeToRevealBackground(this.$modifier, this.$swipeableMenuState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.toast.AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, AuraSwipeableMenuState auraSwipeableMenuState, int i) {
            super(2);
            this.$modifier = bRg;
            this.$swipeableMenuState = auraSwipeableMenuState;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraToastSwipeToDismissBackgroundProvider.this.SwipeToRevealBackground(this.$modifier, this.$swipeableMenuState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider
    public void SwipeToRevealBackground(BRg bRg, AuraSwipeableMenuState auraSwipeableMenuState, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        boolean zA1a = AnonymousClass002.A1a(bRg, auraSwipeableMenuState);
        bfm.AgG(1156861748);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, auraSwipeableMenuState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, this);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            bfm.Afo();
        } else {
            if (!auraSwipeableMenuState.isActive()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(bRg, auraSwipeableMenuState, i);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            boolean zA1Z = AnonymousClass002.A1Z(bfm.A6v(Am0.A0A), EnumC1820Arj.A03);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass003.A0R(bfm, new AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$isInitialSwipe$2$1(auraSwipeableMenuState));
            }
            C1BO c1bo = (C1BO) objAaT;
            C1DM c1dm = AnonymousClass002.A0e(bfm).toast;
            C7384Etj.A0Z(c1dm, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            C1DE c1de = (C1DE) c1dm;
            BRg bRgA0C = C3U4.A0C(bRg, C1BO.A0F(c1bo) ? BannerOffset : 0.0f, 0.0f, BannerOffset, 0.0f);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA03 = C1b8.A03(bRgA0C, new C1D3(C1BO.A0F(c1bo) ? c1de.A03 : new C1D9(0.0f), c1de.A02, c1de.A00, C1BO.A0F(c1bo) ? c1de.A01 : new C1D9(0.0f)), C06G.A0K(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i2);
            BRg bRgA4C = C0z7.A00.A4C(C2VU.A0A, BRg.A00);
            boolean zA66 = bfm.A66(zA1Z) | AnonymousClass003.A1C(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA66 || objAaT2 == obj) {
                objAaT2 = new AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$2$1$1(zA1Z, auraSwipeableMenuState);
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(C15N.A00(bfm, R.string._name_removed__res_0x7f12110b), AnonymousClass001.A0W(bRgA4C, objAaT2), C06G.A0G(bfm, akh), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, zA1a);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(bRg, auraSwipeableMenuState, i);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    /* renamed from: getBannerOffset-D9Ej5fM, reason: not valid java name */
    public final float m3088getBannerOffsetD9Ej5fM() {
        return BannerOffset;
    }
}
