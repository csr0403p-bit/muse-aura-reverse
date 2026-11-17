package com.facebook.aura.graduation;

import X.AKH;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B18;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1D3;
import X.C1D8;
import X.C1DP;
import X.C1SA;
import X.C1YD;
import X.C1b8;
import X.C3U4;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchInlineBannerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class GraduationChatBannerKt {
    public static final float ICON_SIZE = 32.0f;
    public static final C1D3 BANNER_SHAPE = C1D8.A00(78.0f);
    public static final C1D3 ACTION_SHAPE = C1D8.A00(78.0f);

    /* renamed from: com.facebook.aura.graduation.GraduationChatBannerKt$GraduationBannerAction$1, reason: invalid class name */
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
            GraduationChatBannerKt.GraduationBannerAction(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationChatBannerKt$GraduationBannerIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C121731 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121731(BRg bRg, int i, int i2) {
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
            GraduationChatBannerKt.GraduationBannerIcon(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationChatBannerKt$GraduationChatBanner$1, reason: invalid class name and case insensitive filesystem */
    public final class C121741 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121741(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            GraduationChatBannerKt.GraduationChatBanner(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void GraduationBannerIcon(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1844857892);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1SA.A00(bfm, null, C10G.A07(bRg2, ICON_SIZE), null, BOf.A00(bfm, R.drawable.aura_graduation_cap, 0), B18.A02, null, 0.0f, AVy.$stable | 24624, 104);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121731(bRg2, i, i2);
        }
    }

    public static final void GraduationBannerAction(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1654271903);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202ac), C3U4.A08(C1b8.A01(C11U.A03(bRg2, ACTION_SHAPE), AnonymousClass002.A0c(bfm).primaryButtonBackground), 12.0f), AnonymousClass002.A0c(bfm).onMedia, AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15856);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void GraduationChatBanner(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(244636175);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202ae);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$GraduationChatBannerKt.lambda$1323663030;
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), new C1YD(0), null, function0, true);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202ad);
            G0V<BFM, Integer, Unit> g0v2 = ComposableSingletons$GraduationChatBannerKt.lambda$1274609785;
            C1D3 c1d3 = BANNER_SHAPE;
            long j = AnonymousClass002.A0c(bfm).elevated;
            C1DP c1dp = new C1DP(16.0f, 10.0f, 10.0f, 10.0f);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            HatchInlineBannerKt.m2318HatchInlineBannerKBbEK2Q(strA01, g0v, bRgA04, strA012, g0v2, c1d3, j, 10.0f, c1dp, 8.0f, 10.0f, AnonymousClass001.A0g(bfm, akh).caption1Emphasized, 0L, 0, AnonymousClass001.A0g(bfm, akh).caption1Regular, 0L, 2, bfm, 918773808, 1572870, 45056);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121741(function0, bRg2, i, i2);
        }
    }
}
