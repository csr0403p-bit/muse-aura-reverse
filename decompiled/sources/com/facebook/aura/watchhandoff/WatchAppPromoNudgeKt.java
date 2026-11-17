package com.facebook.aura.watchhandoff;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AYD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C78N;
import X.F60;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.nudge.NudgePresentation;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WatchAppPromoNudgeKt {
    public static final float AVATAR_CIRCLE_CORNER_INSET_RATIO = 0.1464f;
    public static final int INSTALLED_USERS_MARK_SEEN = 1;
    public static final int INSTALLED_USERS_SHOW = 2;
    public static final String LOG_KEY_WATCH_APP_INSTALLED = "watch_app_installed";
    public static final long SHEET_VISIBLE_FOR_MS = 600000;
    public static final String TAG = "WatchAppPromoNudge";
    public static final long WATCH_LAUNCH_DEADLINE_MS = 8000;
    public static final long WEAR_TIMEOUT_MS = 5000;
    public static final String WATCH_APP_PROMO_NUDGE_ID = "watch_app_promo";
    public static final WatchAppPromoNudge WatchAppPromoCard = new WatchAppPromoNudge(WATCH_APP_PROMO_NUDGE_ID, NudgePresentation.CARD);
    public static final String WATCH_APP_PROMO_SHEET_NUDGE_ID = "watch_app_promo_sheet";
    public static final WatchAppPromoNudge WatchAppPromoSheet = new WatchAppPromoNudge(WATCH_APP_PROMO_SHEET_NUDGE_ID, NudgePresentation.SHEET);

    /* renamed from: WatchBadge-if577FI, reason: not valid java name */
    public static final void m3150WatchBadgeif577FI(float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-1521978122);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            float f3 = (f2 / 2.0f) - (0.1464f * f);
            BRg bRgA07 = C10G.A07(AYD.A01(bRgA0P, f3, f3), f2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = WatchAppPromoNudgeKt$WatchBadge$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA07, objAaT);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA03 = C1b8.A03(bRgA0W, C1D8.A00, AnonymousClass001.A0f(bfm, akh).secondaryElevated);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, com.facebook.aura.R.drawable.smartwatch, 0), 0.55f * f2, null, C06G.A0L(bfm, akh), null, bfm, (AVy.$stable << 3) | 3072, 33);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WatchAppPromoNudgeKt$WatchBadge$3(f, f2, bRgA0P, i, i2);
        }
    }

    /* renamed from: WatchAppPromoAvatar-if577FI, reason: not valid java name */
    public static final void m3149WatchAppPromoAvatarif577FI(float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1678686684);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraDrawableSource auraDrawableSourceRememberDefaultAvatarSource = AnonymousClass007.A0N(bfm).rememberDefaultAvatarSource(null, bfm, HatchIdentityProvider.$stable << 3, 1);
            BRg bRgA07 = C10G.A07(bRg2, f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            AuraImageKt.AuraImage(auraDrawableSourceRememberDefaultAvatarSource, C11U.A02(bs0, f), null, null, false, false, null, false, null, bfm, 384, 504);
            m3150WatchBadgeif577FI(f, f2, c0z7.A4C(C2VU.A07, bs0), bfm, iA04 & 126, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WatchAppPromoNudgeKt$WatchAppPromoAvatar$2(f, f2, bRg2, i, i2);
        }
    }
}
