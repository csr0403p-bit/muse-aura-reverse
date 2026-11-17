package com.facebook.aura.email.view;

import X.AKH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1b8;
import X.C2VU;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSwipeBackground implements AuraSwipeableCardBackgroundProvider {
    public final String trustLabel;

    /* renamed from: com.facebook.aura.email.view.EmailSwipeBackground$SwipeToRevealBackground$1, reason: invalid class name */
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
            EmailSwipeBackground.this.SwipeToRevealBackground(this.$modifier, this.$swipeableMenuState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSwipeBackground$SwipeToRevealBackground$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, AuraSwipeableMenuState auraSwipeableMenuState, int i) {
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
            EmailSwipeBackground.this.SwipeToRevealBackground(this.$modifier, this.$swipeableMenuState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public EmailSwipeBackground(String str) {
        C7384Etj.A0Y(str, 0);
        this.trustLabel = str;
    }

    @Override // com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider
    public void SwipeToRevealBackground(BRg bRg, AuraSwipeableMenuState auraSwipeableMenuState, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        boolean zA1b = AnonymousClass004.A1b(bRg, auraSwipeableMenuState);
        bfm.AgG(837300865);
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
                    anonymousClass2 = new AnonymousClass1(bRg, auraSwipeableMenuState, i);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            float fAgx = AnonymousClass002.A0Y(bfm).Agx(Math.abs(auraSwipeableMenuState.getOffset()));
            String str = this.trustLabel;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            EmailSwipeRowKt.m756EmailSwipeActioncf5BqRc(R.drawable.shield_check_wght400_outline_24, str, AnonymousClass001.A0f(bfm, akh).success, C10G.A08(C10G.A00(C2VU.A02, C1b8.A01(bRg, AnonymousClass001.A0f(bfm, akh).highlight), zA1b), fAgx), bfm, zA1b ? 1 : 0, zA1b ? 1 : 0);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(bRg, auraSwipeableMenuState, i);
            bBbAAc.A06 = anonymousClass2;
        }
    }
}
