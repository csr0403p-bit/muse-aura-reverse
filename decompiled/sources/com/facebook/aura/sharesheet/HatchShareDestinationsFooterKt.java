package com.facebook.aura.sharesheet;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0v5;
import X.C10G;
import X.C11S;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3Ue;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraBrandIconTintsKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchShareDestinationsFooterKt {
    public static final float DestinationIconButtonSize = 60.0f;
    public static final float DestinationTileWidth = 80.0f;

    /* renamed from: com.facebook.aura.sharesheet.HatchShareDestinationsFooterKt$HatchShareDestinationTile$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchShareDestination $destination;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchShareDestination hatchShareDestination, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$destination = hatchShareDestination;
            this.$isLoading = z;
            this.$enabled = z2;
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
            HatchShareDestinationsFooterKt.HatchShareDestinationTile(this.$destination, this.$isLoading, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareDestinationsFooterKt$HatchShareDestinationsFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchShareDestination> $destinations;
        public final /* synthetic */ HatchShareDestination $loadingDestination;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCopyLinkClick;
        public final /* synthetic */ Function0<Unit> $onFacebookFeedClick;
        public final /* synthetic */ Function0<Unit> $onFacebookStoriesClick;
        public final /* synthetic */ Function0<Unit> $onInstagramDirectClick;
        public final /* synthetic */ Function0<Unit> $onInstagramStoriesClick;
        public final /* synthetic */ Function0<Unit> $onMessagesClick;
        public final /* synthetic */ Function0<Unit> $onMessengerClick;
        public final /* synthetic */ Function0<Unit> $onOsShareClick;
        public final /* synthetic */ Function0<Unit> $onSaveClick;
        public final /* synthetic */ Function0<Unit> $onThreadsClick;
        public final /* synthetic */ Function0<Unit> $onWhatsAppClick;
        public final /* synthetic */ Function0<Unit> $onXClick;
        public final /* synthetic */ boolean $sharingEnabled;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<? extends HatchShareDestination> ahd, HatchShareDestination hatchShareDestination, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, boolean z, Function0<Unit> function010, Function0<Unit> function011, Function0<Unit> function012, String str, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$destinations = ahd;
            this.$loadingDestination = hatchShareDestination;
            this.$onOsShareClick = function0;
            this.$onInstagramDirectClick = function02;
            this.$onInstagramStoriesClick = function03;
            this.$onWhatsAppClick = function04;
            this.$onMessengerClick = function05;
            this.$onThreadsClick = function06;
            this.$onXClick = function07;
            this.$onMessagesClick = function08;
            this.$onCopyLinkClick = function09;
            this.$sharingEnabled = z;
            this.$onFacebookStoriesClick = function010;
            this.$onFacebookFeedClick = function011;
            this.$onSaveClick = function012;
            this.$subtitle = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShareDestinationsFooterKt.HatchShareDestinationsFooter(this.$destinations, this.$loadingDestination, this.$onOsShareClick, this.$onInstagramDirectClick, this.$onInstagramStoriesClick, this.$onWhatsAppClick, this.$onMessengerClick, this.$onThreadsClick, this.$onXClick, this.$onMessagesClick, this.$onCopyLinkClick, this.$sharingEnabled, this.$onFacebookStoriesClick, this.$onFacebookFeedClick, this.$onSaveClick, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchShareDestination.values().length];
            try {
                AnonymousClass002.A13(HatchShareDestination.OS_SHARE_TO, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchShareDestination.INSTAGRAM_DIRECT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchShareDestination.INSTAGRAM_STORIES, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchShareDestination.FACEBOOK_STORIES, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchShareDestination.FACEBOOK_FEED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchShareDestination.WHATSAPP, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchShareDestination.MESSENGER, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchShareDestination.THREADS, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchShareDestination.f315X, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchShareDestination.OS_MESSAGES, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchShareDestination.COPY_LINK, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(HatchShareDestination.SAVE, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HatchShareDestinationTile(HatchShareDestination hatchShareDestination, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        long j;
        BRg bRg2 = bRg;
        bfm.AgG(-1319710278);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchShareDestination) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C3TH c3th = C2VU.A00;
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingXsmall);
            BRg bRgA08 = C10G.A08(bRg2, 80.0f);
            C1YD c1yd = new C1YD(0);
            boolean zA1E = AnonymousClass003.A1E(iA08);
            Object objAaT = bfm.AaT();
            if (zA1E || objAaT == C78N.A00) {
                objAaT = new HatchShareDestinationsFooterKt$HatchShareDestinationTile$1$1(function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA08, c1yd, null, (Function0) objAaT, z2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            Alignment alignment = C2VU.A09;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, DestinationIconButtonSize);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA03 = C1b8.A03(bRgA07, C1D8.A00, AnonymousClass001.A0f(bfm, akh).secondaryButtonBackground);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (z) {
                bfm.AgE(1858561005);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1858621486);
                AVy aVyA00 = BOf.A00(bfm, iconResource(hatchShareDestination), 0);
                AuraIconSize auraIconSize = AuraIconSize.SMALL;
                B6A b6aIconTint = iconTint(hatchShareDestination);
                if (b6aIconTint == null) {
                    j = AnonymousClass006.A0i(bfm, akh, 337057181).primaryIcon.enabled;
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(337055476);
                    BBI.A0R(bbi, false);
                    j = b6aIconTint.A00;
                }
                AuraIconKt.m2567AuraIconFHprtrg(instagramGradientTint(C11S.A00(bs0, z2 ? 1.0f : 0.3f), hatchShareDestination), aVyA00, auraIconSize, null, j, null, bfm, AnonymousClass001.A04(), 32);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            String strA01 = AbstractC2271BQs.A01(bfm, labelResource(hatchShareDestination));
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, null, null, null, null, null, 0, 0, 131587, 14680063, 0L, 0L, 0L, 0L);
            long jA0C = C06G.A0C(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, HxS.A04(HDi.A0O[(int) (jA0C & 63)], B6A.A03(jA0C), B6A.A02(jA0C), B6A.A01(jA0C), z2 ? 1.0f : 0.3f), c1822ArmA00, null, null, new C1YL(3), false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14770);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchShareDestination, z, z2, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchShareDestinationsFooter(X.AHD<? extends com.facebook.aura.sharesheet.HatchShareDestination> r48, com.facebook.aura.sharesheet.HatchShareDestination r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, kotlin.jvm.functions.Function0<kotlin.Unit> r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, boolean r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, java.lang.String r63, X.BRg r64, X.BFM r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareDestinationsFooterKt.HatchShareDestinationsFooter(X.AHD, com.facebook.aura.sharesheet.HatchShareDestination, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, X.BRg, X.BFM, int, int, int):void");
    }

    public static final BRg instagramGradientTint(BRg bRg, HatchShareDestination hatchShareDestination) {
        return (hatchShareDestination == HatchShareDestination.INSTAGRAM_DIRECT || hatchShareDestination == HatchShareDestination.INSTAGRAM_STORIES) ? AuraBrandIconTintsKt.instagramGradientTint(bRg) : bRg;
    }

    public static final int iconResource(HatchShareDestination hatchShareDestination) {
        switch (AnonymousClass003.A0L(hatchShareDestination)) {
            case 0:
                return R.drawable.instagram_direct_prism_outline_24;
            case 1:
            case 2:
                return R.drawable.instagramstories_outline_24_wght400;
            case 3:
                return R.drawable.facebook_outline_24_wght400;
            case 4:
                return R.drawable.whatsapp_outline_24_wght400;
            case 5:
                return R.drawable.arrow_share_wght400_outline_24;
            case 6:
                return R.drawable.messenger_outline_24_wght400;
            case 7:
                return R.drawable.instagramthreads_outline_24_wght400;
            case 8:
                return R.drawable.aura_twitter_x_filled_24;
            case 9:
                return R.drawable.ai_speech_bubble_wght400_outline_24;
            case 10:
                return R.drawable.link_outline_24_wght400;
            case 11:
                return R.drawable.arrowdownload_outline_24_wght400;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final B6A iconTint(HatchShareDestination hatchShareDestination) {
        long j;
        int iA0L = AnonymousClass003.A0L(hatchShareDestination);
        if (iA0L == 2 || iA0L == 3) {
            j = AuraBrandIconTintsKt.MetaBlue;
        } else if (iA0L != 4) {
            if (iA0L != 6) {
                return null;
            }
            j = AuraBrandIconTintsKt.MetaBlue;
        } else {
            j = AuraBrandIconTintsKt.WhatsAppGreen;
        }
        return new B6A(j);
    }

    public static final int labelResource(HatchShareDestination hatchShareDestination) {
        switch (hatchShareDestination.ordinal()) {
            case 0:
                return R.string._name_removed__res_0x7f1205c8;
            case 1:
                return R.string._name_removed__res_0x7f1205c9;
            case 2:
                return R.string._name_removed__res_0x7f1205c7;
            case 3:
                return R.string._name_removed__res_0x7f1205c6;
            case 4:
                return R.string._name_removed__res_0x7f1205cf;
            case 5:
                return R.string._name_removed__res_0x7f1205cd;
            case 6:
                return R.string._name_removed__res_0x7f1205cb;
            case 7:
                return R.string._name_removed__res_0x7f1205ce;
            case 8:
                return R.string._name_removed__res_0x7f1205d0;
            case 9:
                return R.string._name_removed__res_0x7f1205ca;
            case 10:
                return R.string._name_removed__res_0x7f1205c5;
            case 11:
                return R.string._name_removed__res_0x7f1205cc;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
