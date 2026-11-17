package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.shopping.model.PdpSellerReview;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchProductDetailsSellerReviewsSectionKt {
    public static final int MAX_REVIEW_TAGS = 5;
    public static final float ReviewAvatarSize = 40.0f;
    public static final float ReviewPillCorner = 16.0f;
    public static final float ReviewRatingStarSize = 12.0f;

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsSellerReviewsSectionKt$HatchProductDetailsSellerReviewsSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<PdpSellerReview> $reviews;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<PdpSellerReview> list, BRg bRg, int i, int i2) {
            super(2);
            this.$reviews = list;
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
            HatchProductDetailsSellerReviewsSectionKt.HatchProductDetailsSellerReviewsSection(this.$reviews, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsSellerReviewsSectionKt$HatchProductDetailsSellerReviewsSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<PdpSellerReview> $reviews;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<PdpSellerReview> list, BRg bRg, int i, int i2) {
            super(2);
            this.$reviews = list;
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
            HatchProductDetailsSellerReviewsSectionKt.HatchProductDetailsSellerReviewsSection(this.$reviews, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsSellerReviewsSectionKt$SellerReviewRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PdpSellerReview $review;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PdpSellerReview pdpSellerReview, BRg bRg, int i, int i2) {
            super(2);
            this.$review = pdpSellerReview;
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
            HatchProductDetailsSellerReviewsSectionKt.SellerReviewRow(this.$review, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchProductDetailsSellerReviewsSection(List<PdpSellerReview> list, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(list, 0);
        bfm.AgG(-1100846198);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(list, bRgA0Q, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMedium, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ddf);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchProductDetailsSellerReviewsSectionKt$HatchProductDetailsSellerReviewsSection$2$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), auraColorsA0c.primaryText, C06G.A0W(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, -1107399583);
            while (itA0w.hasNext()) {
                SellerReviewRow((PdpSellerReview) itA0w.next(), null, bfm, PdpSellerReview.$stable, 2);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(list, bRgA0Q, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0173 A[PHI: r17
  0x0173: PHI (r17v2 boolean) = (r17v1 boolean), (r17v0 boolean) binds: [B:34:0x0154, B:32:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SellerReviewRow(com.facebook.aura.shopping.model.PdpSellerReview r60, X.BRg r61, X.BFM r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductDetailsSellerReviewsSectionKt.SellerReviewRow(com.facebook.aura.shopping.model.PdpSellerReview, X.BRg, X.BFM, int, int):void");
    }
}
