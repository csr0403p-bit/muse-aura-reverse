package com.facebook.aura.browsertask.view;

import X.AKH;
import X.AVy;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1D8;
import X.C1b8;
import X.C3U4;
import X.G0V;
import X.HDi;
import X.HxS;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$OtherDeviceBannerKt {
    public static final ComposableSingletons$OtherDeviceBannerKt INSTANCE = new ComposableSingletons$OtherDeviceBannerKt();

    /* renamed from: lambda$-1973410734, reason: not valid java name */
    public static G0V<BFM, Integer, Unit> f11lambda$1973410734 = B1V.A01(new G0V() { // from class: com.facebook.aura.browsertask.view.ComposableSingletons$OtherDeviceBannerKt$$ExternalSyntheticLambda0
        @Override // X.G0V
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$OtherDeviceBannerKt.lambda__1973410734$lambda$0((BFM) obj, AnonymousClass001.A0F(obj2));
        }
    }, -1973410734, false);

    public static final Unit lambda__1973410734$lambda$0(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AVy aVyA00 = BOf.A00(bfm, R.drawable.laptop_outline_24_wght600, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0L = C06G.A0L(bfm, akh);
            BRg bRgA07 = C10G.A07(BRg.A00, 36.0f);
            long jA0L2 = C06G.A0L(bfm, akh);
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C1b8.A03(bRgA07, C1D8.A00, HxS.A04(HDi.A0O[(int) (jA0L2 & 63)], B6A.A03(jA0L2), B6A.A02(jA0L2), B6A.A01(jA0L2), 0.1f)), 8.0f), aVyA00, auraIconSize, null, jA0L, null, bfm, AnonymousClass001.A04(), 32);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1973410734$fbandroid_express_aura_java_com_facebook_aura_browsertask_view_view, reason: not valid java name */
    public final G0V<BFM, Integer, Unit> m322x7f66499b() {
        return f11lambda$1973410734;
    }
}
