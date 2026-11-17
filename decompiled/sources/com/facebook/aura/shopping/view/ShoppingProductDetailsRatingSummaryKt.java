package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1824Aro;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.shopping.model.PdpRating;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ShoppingProductDetailsRatingSummaryKt {

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsRatingSummaryKt$ShoppingProductDetailsRatingSummary$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PdpRating $rating;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PdpRating pdpRating, BRg bRg, int i, int i2) {
            super(2);
            this.$rating = pdpRating;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            ShoppingProductDetailsRatingSummaryKt.ShoppingProductDetailsRatingSummary(this.$rating, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ShoppingProductDetailsRatingSummary(PdpRating pdpRating, BRg bRg, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pdpRating, 0);
        bfm.AgG(727620337);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pdpRating, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(pdpRating.value)}, 1));
            String strA0w = AnonymousClass006.A0w(bfm, str, Integer.valueOf(pdpRating.reviewCount), R.string._name_removed__res_0x7f120dd1);
            int i4 = pdpRating.reviewCount;
            String strA00 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100033, new Object[]{str, Integer.valueOf(i4)}, bfm, i4);
            int iA0B = C7BY.A0B(strA00, str, 0, false);
            C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA00);
            if (iA0B >= 0) {
                C1736ApY c1736ApY = C1736ApY.A03;
                long j = B6A.A07;
                long j2 = C1809ArT.A01;
                c1731ApSA0X.A0A(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, j), iA0B, str.length() + iA0B);
            }
            ApQ apQA04 = c1731ApSA0X.A04();
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA65 = bfm.A65(strA0w);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ShoppingProductDetailsRatingSummaryKt$ShoppingProductDetailsRatingSummary$1$1(strA0w);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA0R, objAaT);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.star_filled_24_wght400, 0), 14.0f, null, AnonymousClass002.A0c(bfm).ratingStar, null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2640AuraTextVmYn7U0(apQA04, null, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(pdpRating, bRg2, i, i2);
        }
    }
}
