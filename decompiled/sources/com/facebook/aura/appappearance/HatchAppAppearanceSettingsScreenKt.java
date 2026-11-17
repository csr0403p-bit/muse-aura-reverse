package com.facebook.aura.appappearance;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DE;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3O5;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.Ey9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HxE;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.R;
import com.facebook.aura.avatarsize.HatchAvatarSize;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepository;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepositoryKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;
import com.facebook.aura.identity.provider.HatchChatThemesState;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.AuraRadioGroupKt;
import com.facebook.aura.vds.compose.card.AuraRadioTapOption;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAppAppearanceSettingsScreenKt {
    public static final float PICKER_HEIGHT = 70.0f;
    public static final float PREVIEW_BORDER_WIDTH = 3.0f;
    public static final float PREVIEW_BUBBLE_CORNER = 10.0f;
    public static final float PREVIEW_BUBBLE_GAP = 6.0f;
    public static final float PREVIEW_BUBBLE_INSET = 8.0f;
    public static final float PREVIEW_CARD_CORNER = 32.0f;
    public static final float PREVIEW_CARD_HEIGHT = 416.0f;
    public static final float PREVIEW_CARD_WIDTH = 192.0f;
    public static final float PREVIEW_DEFAULT_AVATAR_SIZE = 25.0f;
    public static final float PREVIEW_GRADIENT_HEIGHT = 75.0f;
    public static final float PREVIEW_PILL_AVATAR_OVERLAP = 3.0f;
    public static final float PREVIEW_PILL_TOP_INSET = 11.0f;
    public static final float PREVIEW_THREAD_BOTTOM_INSET = 50.0f;
    public static final float PREVIEW_WINDOW_HEIGHT = 230.0f;
    public static final float SELECTED_INNER_SIZE = 28.0f;
    public static final float SELECTED_RING_WIDTH = 2.0f;
    public static final float SWATCH_SIZE = 36.0f;

    /* renamed from: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$AppAppearanceModeSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SnapshotStateList<AuraRadioTapOption> $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SnapshotStateList<AuraRadioTapOption> snapshotStateList, int i) {
            super(2);
            this.$options = snapshotStateList;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAppAppearanceSettingsScreenKt.AppAppearanceModeSection(this.$options, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$AvatarSizeSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C109241 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109241(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAppAppearanceSettingsScreenKt.AvatarSizeSection(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$ChatThemeSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAppAppearanceSettingsScreenKt.ChatThemeSection(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$HatchAppAppearanceSettingsScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C109251 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ SnapshotStateList<AuraRadioTapOption> $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109251(SnapshotStateList<AuraRadioTapOption> snapshotStateList) {
            super(4);
            this.$options = snapshotStateList;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m244invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m244invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = C06G.A0O(bfm, AnonymousClass006.A0M(bfm));
            SnapshotStateList<AuraRadioTapOption> snapshotStateList = this.$options;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0O);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, f);
            HatchAppAppearanceSettingsScreenKt.ChatThemeSection(bfm, 0);
            C01N.A08(bfm, bs0, 24.0f);
            AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206b2), null, null, bfm, 48, 4);
            HatchAppAppearanceSettingsScreenKt.AvatarSizeSection(bfm, 0);
            C01N.A08(bfm, bs0, 24.0f);
            AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120160), null, null, bfm, 48, 4);
            HatchAppAppearanceSettingsScreenKt.AppAppearanceModeSection(snapshotStateList, bfm, 6);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$HatchAppAppearanceSettingsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismissClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onDismissClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAppAppearanceSettingsScreenKt.HatchAppAppearanceSettingsScreen(this.$onDismissClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$PreviewAvatarPill$2, reason: invalid class name and case insensitive filesystem */
    public final class C109262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ String $botName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109262(AuraDrawableSource auraDrawableSource, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$avatarSource = auraDrawableSource;
            this.$botName = str;
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
            HatchAppAppearanceSettingsScreenKt.PreviewAvatarPill(this.$avatarSource, this.$botName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchAppAppearanceSettingsScreen(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(988693857);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ec8);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = Integer.valueOf(HatchAppAppearanceManager.INSTANCE.getSavedValue$fbandroid_express_aura_java_com_facebook_aura_appappearance_appappearance(contextA0H));
                bfm.Ai0(objAaT);
            }
            int iA0F = AnonymousClass001.A0F(objAaT);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                Ey9<AppAppearanceOption> entries = AppAppearanceOption.getEntries();
                ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
                for (AppAppearanceOption appAppearanceOption : entries) {
                    arrayListA0i.add(new AuraRadioTapOption(contextA0H.getString(appAppearanceOption.getTitleRes()), null, null, false, null, null, AnonymousClass002.A1Q(appAppearanceOption.getValue(), iA0F), true, 1.0f, new HatchAppAppearanceSettingsScreenKt$HatchAppAppearanceSettingsScreen$options$1$1$1(appAppearanceOption, contextA0H), false, new AuraCardType.Checkbox(null), true, null, null, null));
                }
                objAaT2 = AnonymousClass007.A0F(bfm, arrayListA0i);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, null, null, 0L, strA01, null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C109251((SnapshotStateList) objAaT2), -767208090), bfm, ((iA0T << 18) & 3670016) | 6, 0, 805306374, 535822254);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAvatarSize.values().length];
            try {
                AnonymousClass002.A13(HatchAvatarSize.SMALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAvatarSize.MEDIUM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAvatarSize.LARGE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchAvatarSize.XLARGE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchAvatarSize.HIDDEN, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: ChatThemePreviewCard-m5XamvU, reason: not valid java name */
    public static final void m236ChatThemePreviewCardm5XamvU(long j, long j2, long j3, long j4, AuraDrawableSource auraDrawableSource, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-1146253880);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0N(bfm, j2);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0O(bfm, j3);
        }
        if ((i & 3072) == 0) {
            iA0M |= AnonymousClass004.A0P(bfm, j4);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0M |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, auraDrawableSource, 32768, i) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA0M |= AnonymousClass004.A0i(bfm, str);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0M |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRgA0P);
            iA0M |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0M), bfm, iA0M)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            C1D3 c1d3A00 = C1D8.A00(PREVIEW_CARD_CORNER);
            BRg bRgA03 = C11U.A03(bRgA0P, c1d3A00);
            C1DM c1dm = C1OM.A00;
            BRg bRgA02 = C1DI.A02(C1b8.A03(bRgA03, c1dm, j), c1d3A00, PREVIEW_BORDER_WIDTH, j4);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
            BBI bbi = (BBI) bfm;
            long j5 = bbi.A06;
            int i4 = (int) (j5 ^ (j5 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(C10G.A01, PREVIEW_BUBBLE_INSET, 0.0f), 0.0f, 0.0f, 0.0f, PREVIEW_THREAD_BOTTOM_INSET);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A03, PREVIEW_BUBBLE_GAP), bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            int i5 = ((iA0M >> 6) & 14) | 3504;
            m238PreviewBubble9dGMCfo(j3, 120.0f, 20.0f, true, bfm, i5);
            m238PreviewBubble9dGMCfo(j3, 165.0f, 64.0f, false, bfm, i5);
            int i6 = ((iA0M >> 3) & 14) | 3504;
            m238PreviewBubble9dGMCfo(j2, 136.0f, 42.0f, true, bfm, i6);
            m238PreviewBubble9dGMCfo(j3, 156.0f, 20.0f, false, bfm, i5);
            m238PreviewBubble9dGMCfo(j2, 133.0f, 20.0f, true, bfm, i6);
            m238PreviewBubble9dGMCfo(j3, 165.0f, 76.0f, false, bfm, i5);
            m238PreviewBubble9dGMCfo(j2, 127.0f, 20.0f, true, bfm, i6);
            m238PreviewBubble9dGMCfo(j3, 165.0f, 76.0f, false, bfm, i5);
            BBI.A0R(bbi, true);
            C3Ue.A04(C1b8.A02(C10G.A04(C10G.A02, PREVIEW_GRADIENT_HEIGHT), C1EQ.A02(new HxE[]{AnonymousClass007.A0h(Float.valueOf(0.0f), 0.84f, j), AnonymousClass007.A0h(Float.valueOf(0.2143f), 0.84f, j), AnonymousClass007.A0h(Float.valueOf(0.61f), 0.6f, j), AnonymousClass007.A0h(Float.valueOf(1.0f), 0.0f, j)}, Float.POSITIVE_INFINITY), c1dm), bfm, 0);
            PreviewAvatarPill(auraDrawableSource, str, C3U4.A0C(c0z7.A4C(C2VU.A0C, bs0), 0.0f, PREVIEW_PILL_TOP_INSET, 0.0f, 0.0f), bfm, (iA0M >> 12) & 126, 0);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAppAppearanceSettingsScreenKt$ChatThemePreviewCard$2(j, j2, j3, j4, auraDrawableSource, str, bRgA0P, i, i2);
        }
    }

    public static final void PreviewAvatarPill(AuraDrawableSource auraDrawableSource, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(1449883117);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraDrawableSource, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            HatchAvatarSize hatchAvatarSizeRememberHatchAvatarSize = HatchAvatarSizeRepositoryKt.rememberHatchAvatarSize(bfm, 0);
            float fM278getBaseSizeDpD9Ej5fM = PREVIEW_DEFAULT_AVATAR_SIZE * (hatchAvatarSizeRememberHatchAvatarSize.m278getBaseSizeDpD9Ej5fM() / HatchAvatarSize.DEFAULT.m278getBaseSizeDpD9Ej5fM());
            float f = hatchAvatarSizeRememberHatchAvatarSize.isAvatarVisible() ? fM278getBaseSizeDpD9Ej5fM - PREVIEW_PILL_AVATAR_OVERLAP : 0.0f;
            float f2 = AnonymousClass002.A0d(bfm).bubbleCornerRadius;
            boolean zA62 = bfm.A62(f2);
            Object objAaT = bfm.AaT();
            if (zA62 || objAaT == C78N.A00) {
                objAaT = C1D8.A00(f2);
                bfm.Ai0(objAaT);
            }
            C1DE c1de = (C1DE) objAaT;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0C, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA03 = C11U.A03(C3U4.A04(bs0, f), c1de);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA0B = C3U4.A0B(C1DI.A02(C1b8.A01(bRgA03, AnonymousClass001.A0f(bfm, akh).elevated), c1de, 1.0f, AnonymousClass001.A0f(bfm, akh).elevatedBorder), 10.0f, 4.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C1822Arm c1822Arm = C1822Arm.A03;
            long jA03 = C19U.A03(8);
            C1736ApY c1736ApY = C1736ApY.A05;
            long jA032 = C19U.A03(11);
            long j2 = B6A.A07;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0L(bfm, akh), new C1822Arm(null, null, c1736ApY, 0, 0, j2, jA03, C1809ArT.A01, j2, jA032), null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA05 >> 3) & 14) | 3072, 0, 16370);
            BBI.A0R(bbi, true);
            if (hatchAvatarSizeRememberHatchAvatarSize.isAvatarVisible()) {
                bfm.AgE(-1161541183);
                AuraImageKt.AuraImage(auraDrawableSource, C11U.A02(bs0, fM278getBaseSizeDpD9Ej5fM), null, null, false, false, null, false, null, bfm, (iA05 & 14) | 384, 504);
            } else {
                bfm.AgE(-1161387237);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109262(auraDrawableSource, str, bRgA0Q, i, i2);
        }
    }

    public static final void AppAppearanceModeSection(SnapshotStateList<AuraRadioTapOption> snapshotStateList, BFM bfm, int i) {
        bfm.AgG(1713956989);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, snapshotStateList) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            AuraRadioGroupKt.AuraRadioGroup(C10G.A02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ec8), snapshotStateList, bfm, ((iA0d << 6) & 896) | 6, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(snapshotStateList, i);
        }
    }

    public static final void AvatarSizeSection(BFM bfm, int i) {
        bfm.AgG(-1033761222);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            HatchAvatarSizeRepository hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository = HatchAvatarSizeRepositoryKt.rememberHatchAvatarSizeRepository(bfm, 0);
            HatchAvatarSize hatchAvatarSizeRememberHatchAvatarSize = HatchAvatarSizeRepositoryKt.rememberHatchAvatarSize(bfm, 0);
            boolean zA65 = bfm.A65(hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                Ey9<HatchAvatarSize> entries = HatchAvatarSize.getEntries();
                ArrayList arrayListA0i = AnonymousClass003.A0i(entries);
                for (HatchAvatarSize hatchAvatarSize : entries) {
                    arrayListA0i.add(new AuraRadioTapOption(contextA0H.getString(getTitleRes(hatchAvatarSize)), null, null, false, null, null, AnonymousClass002.A1Z(hatchAvatarSize, hatchAvatarSizeRememberHatchAvatarSize), true, 1.0f, new HatchAppAppearanceSettingsScreenKt$AvatarSizeSection$options$1$1$1(hatchAvatarSize, hatchAvatarSizeRepositoryRememberHatchAvatarSizeRepository), false, new AuraCardType.Checkbox(null), true, null, null, null));
                }
                objAaT = AnonymousClass007.A0F(bfm, arrayListA0i);
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206b2);
            AuraRadioGroupKt.AuraRadioGroup(C10G.A02, strA01, (SnapshotStateList) objAaT, bfm, 6, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109241(i);
        }
    }

    /* renamed from: AvatarSwatch-cf5BqRc, reason: not valid java name */
    public static final void m234AvatarSwatchcf5BqRc(AuraDrawableSource auraDrawableSource, boolean z, long j, String str, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1976723420);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraDrawableSource, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, SWATCH_SIZE);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C11U.A03(bRgA07, c1d3);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            BRg bRgA01 = C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj), bRgA03, null, null, function0, true);
            boolean zA1E = AnonymousClass003.A1E(iA05) | AnonymousClass003.A1C(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1E || objAaT2 == obj) {
                objAaT2 = new HatchAppAppearanceSettingsScreenKt$AvatarSwatch$2$1(str, z);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA01, objAaT2, false);
            if (z) {
                bRgA0Y = bRgA0Y.then(C1DI.A02(bs0, c1d3, SELECTED_RING_WIDTH, j));
            }
            AuraImageKt.AuraImage(auraDrawableSource, bRgA0Y, null, null, false, false, null, false, null, bfm, (iA05 & 14) | 384, 504);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAppAppearanceSettingsScreenKt$AvatarSwatch$4(auraDrawableSource, z, j, str, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* renamed from: ChatThemePicker-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m235ChatThemePickerww6aTOc(java.lang.String r25, java.util.List<com.facebook.aura.identity.provider.HatchChatThemeOption> r26, com.facebook.aura.vds.compose.common.AuraDrawableSource r27, long r28, X.G0U<? super java.lang.String, kotlin.Unit> r30, X.BFM r31, int r32) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt.m235ChatThemePickerww6aTOc(java.lang.String, java.util.List, com.facebook.aura.vds.compose.common.AuraDrawableSource, long, X.G0U, X.BFM, int):void");
    }

    public static final void ChatThemeSection(BFM bfm, int i) {
        long j;
        long j2;
        bfm.AgG(884634293);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            HatchIdentityProvider hatchIdentityProvider = (HatchIdentityProvider) objAaT;
            C1BO c1boA02 = C2CK.A02(bfm, hatchIdentityProvider.chatThemes);
            C1BO c1boA022 = C2CK.A02(bfm, hatchIdentityProvider.aiIdentityName);
            AuraDrawableSource auraDrawableSourceRememberDefaultAvatarSource = hatchIdentityProvider.rememberDefaultAvatarSource(null, bfm, HatchIdentityProvider.$stable << 3, 1);
            boolean zA00 = C3O5.A00(bfm);
            boolean zA67 = bfm.A67(hatchIdentityProvider);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchAppAppearanceSettingsScreenKt$ChatThemeSection$1$1(hatchIdentityProvider, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, hatchIdentityProvider);
            boolean zA1K = AnonymousClass003.A1K(bfm, ((HatchChatThemesState) c1boA02.getValue()).selectedThemeId, ((HatchChatThemesState) c1boA02.getValue()).themes);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == C78N.A00) {
                objAaT3 = HatchChatThemeHelperKt.resolveConversationTheme(((HatchChatThemesState) c1boA02.getValue()).selectedThemeId, ((HatchChatThemesState) c1boA02.getValue()).themes);
                bfm.Ai0(objAaT3);
            }
            HatchConversationTheme hatchConversationTheme = (HatchConversationTheme) objAaT3;
            if (zA00) {
                j = hatchConversationTheme.userBubbleColorDark;
                j2 = hatchConversationTheme.agentBubbleColorDark;
            } else {
                j = hatchConversationTheme.userBubbleColorLight;
                j2 = hatchConversationTheme.agentBubbleColorLight;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            long j3 = j;
            long j4 = j;
            long j5 = j2;
            m236ChatThemePreviewCardm5XamvU(C06G.A0B(bfm), j4, j5, j3, auraDrawableSourceRememberDefaultAvatarSource, C1BO.A08(c1boA022), C10G.A04(C10G.A01(C2VU.A05, C11U.A00(C10G.A04(C10G.A08(bs0, PREVIEW_CARD_WIDTH), PREVIEW_WINDOW_HEIGHT)), true), PREVIEW_CARD_HEIGHT), bfm, 1572864, 0);
            C01N.A08(bfm, bs0, 20.0f);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchAppAppearanceSettingsScreenKt.lambda$1251505406;
            boolean zA1V = AnonymousClass002.A1V(bfm, hatchIdentityProvider, AnonymousClass003.A1J(bfm, c1boA02, auraDrawableSourceRememberDefaultAvatarSource), bfm.A64(j));
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == C78N.A00) {
                objAaT4 = new HatchAppAppearanceSettingsScreenKt$ChatThemeSection$2$1$1(auraDrawableSourceRememberDefaultAvatarSource, j4, hatchIdentityProvider, c1boA02);
                bfm.Ai0(objAaT4);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v, 0L, (G0U) objAaT4, bfm, 390, 5);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i);
        }
    }

    /* renamed from: ColorSwatch-KTwxG1Y, reason: not valid java name */
    public static final void m237ColorSwatchKTwxG1Y(long j, boolean z, String str, Function0<Unit> function0, BFM bfm, int i) {
        BRg bRgA07;
        bfm.AgG(775829872);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0M |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0M), bfm, iA0M)) {
            BS0 bs0 = BRg.A00;
            float f = SWATCH_SIZE;
            BRg bRgA072 = C10G.A07(bs0, f);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C11U.A03(bRgA072, c1d3);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            BRg bRgA01 = C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj), bRgA03, null, null, function0, true);
            boolean zA1C = AnonymousClass003.A1C(iA0M) | AnonymousClass003.A1D(iA0M);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new HatchAppAppearanceSettingsScreenKt$ColorSwatch$2$1(str, z);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA01, objAaT2, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0D);
            if (z) {
                bfm.AgE(-1432789510);
                C3Ue.A04(C1DI.A02(C11U.A03(C10G.A07(bs0, f), c1d3), c1d3, SELECTED_RING_WIDTH, j), bfm, 0);
                bRgA07 = C10G.A07(bs0, SELECTED_INNER_SIZE);
            } else {
                bfm.AgE(-1432505860);
                bRgA07 = C10G.A07(bs0, f);
            }
            C1b8.A04(bfm, C11U.A03(bRgA07, c1d3), j);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAppAppearanceSettingsScreenKt$ColorSwatch$4(j, z, str, function0, i);
        }
    }

    /* renamed from: PreviewBubble-9dGMCfo, reason: not valid java name */
    public static final void m238PreviewBubble9dGMCfo(long j, float f, float f2, boolean z, BFM bfm, int i) {
        bfm.AgG(-2097919668);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0M |= AnonymousClass004.A0q(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0M & 1171, 1170), bfm, iA0M)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(z ? AcQ.A00 : AcQ.A01, bfm, C2VU.A05, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C1b8.A04(bfm, C11U.A01(C10G.A0C(bs0, f, f2), PREVIEW_BUBBLE_CORNER), j);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAppAppearanceSettingsScreenKt$PreviewBubble$2(j, f, f2, z, i);
        }
    }

    public static final /* synthetic */ HatchChatThemesState access$ChatThemeSection$lambda$1(C1BO c1bo) {
        return (HatchChatThemesState) c1bo.getValue();
    }

    public static final int getTitleRes(HatchAvatarSize hatchAvatarSize) {
        int iOrdinal = hatchAvatarSize.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f1206b3;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f1206b1;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f1206b0;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f1206b4;
        }
        if (iOrdinal == 4) {
            return R.string._name_removed__res_0x7f1206af;
        }
        throw new NoWhenBranchMatchedException();
    }
}
