package com.facebook.aura.settings;

import X.AGI;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C00x;
import X.C06H;
import X.C0881AGi;
import X.C08R;
import X.C0zJ;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraChannelsSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<ChannelUiItem, Unit> $navigateToChannel;
        public final /* synthetic */ AuraChannelsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraChannelsUiState auraChannelsUiState, G0U<? super ChannelUiItem, Unit> g0u) {
            super(4);
            this.$uiState = auraChannelsUiState;
            this.$navigateToChannel = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1897invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1897invokei1RSzL4(float r36, float r37, X.BFM r38, int r39) {
            /*
                Method dump skipped, instructions count: 515
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.AuraChannelsSettingsScreenKt.AnonymousClass2.m1897invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.AuraChannelsSettingsScreenKt$AuraChannelsSettingsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<Boolean, Unit> $onMessengerSettingsClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onTelegramSettingsClick;
        public final /* synthetic */ G0V<Boolean, Boolean, Unit> $onWhatsAppSettingsClick;
        public final /* synthetic */ AuraChannelsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, G0V<? super Boolean, ? super Boolean, Unit> g0v, G0U<? super Boolean, Unit> g0u2, BRg bRg, AuraChannelsViewModel auraChannelsViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$onTelegramSettingsClick = g0u;
            this.$onWhatsAppSettingsClick = g0v;
            this.$onMessengerSettingsClick = g0u2;
            this.$modifier = bRg;
            this.$viewModel = auraChannelsViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraChannelsSettingsScreenKt.AuraChannelsSettingsScreen(this.$onBack, this.$onTelegramSettingsClick, this.$onWhatsAppSettingsClick, this.$onMessengerSettingsClick, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.AuraChannelsSettingsScreenKt$ChannelCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MessagingChannel $channel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MessagingChannel messagingChannel) {
            super(2);
            this.$channel = messagingChannel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                if (this.$channel == MessagingChannel.MESSENGER) {
                    bfm.AgE(-2127143620);
                    BRg bRgA07 = C10G.A07(BRg.A00, 32.0f);
                    long j = B6A.A04;
                    BRg bRgA02 = C1DI.A02(bRgA07, C1D8.A00(10.0f), 0.5f, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.5f));
                    MessagingChannel messagingChannel = this.$channel;
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA02);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    AuraCardDefaults.INSTANCE.m2480LeadingImagexqIIw2o(new AuraDrawableSourceResource(messagingChannel.getIconResId()), null, null, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 14);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(-2126678000);
                    AuraCardDefaults.INSTANCE.m2480LeadingImagexqIIw2o(new AuraDrawableSourceResource(this.$channel.getIconResId()), null, null, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 14);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.AuraChannelsSettingsScreenKt$ChannelCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C134662 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $needsAttention;
        public final /* synthetic */ AuraCardStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134662(boolean z, AuraCardStyle auraCardStyle) {
            super(3);
            this.$needsAttention = z;
            this.$style = auraCardStyle;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
            invoke(c08r, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C08R c08r, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                if (this.$needsAttention) {
                    long j = AnonymousClass003.A0c(bfm, -1190008631).warning;
                    BRg bRgA0S = AnonymousClass001.A0S(C3U4.A0D(BRg.A00, this.$style.trailingItemPaddingValues()));
                    boolean zA64 = bfm.A64(j);
                    Object objAaT = bfm.AaT();
                    if (zA64 || objAaT == C78N.A00) {
                        objAaT = new AuraChannelsSettingsScreenKt$ChannelCard$2$1$1(j);
                        bfm.Ai0(objAaT);
                    }
                    C0zJ.A00(bRgA0S, (G0U) objAaT, bfm, 0);
                } else {
                    bfm.AgE(-1189802977);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.AuraChannelsSettingsScreenKt$ChannelCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C134673 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MessagingChannel $channel;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $needsAttention;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134673(MessagingChannel messagingChannel, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$channel = messagingChannel;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$needsAttention = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraChannelsSettingsScreenKt.ChannelCard(this.$channel, this.$onClick, this.$modifier, this.$enabled, this.$needsAttention, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraChannelsSettingsScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.G0U<? super java.lang.Boolean, kotlin.Unit> r46, X.G0V<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r47, X.G0U<? super java.lang.Boolean, kotlin.Unit> r48, X.BRg r49, com.facebook.aura.settings.AuraChannelsViewModel r50, X.BFM r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.AuraChannelsSettingsScreenKt.AuraChannelsSettingsScreen(kotlin.jvm.functions.Function0, X.G0U, X.G0V, X.G0U, X.BRg, com.facebook.aura.settings.AuraChannelsViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ChannelCard(MessagingChannel messagingChannel, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        ApQ apQA0Z;
        boolean z3 = z;
        boolean z4 = z2;
        BRg bRg2 = bRg;
        bfm.AgG(-1521773520);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, messagingChannel) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0q(bfm, z3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0r(bfm, z4);
        }
        int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                z4 = false;
            }
            BO6 bo6 = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            String strA01 = AbstractC2271BQs.A01(bfm, messagingChannel.getTitleResId());
            C0881AGi c0881AGi = C0881AGi.A00;
            ApQ apQ = new ApQ(strA01, c0881AGi);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            if (z4) {
                bfm.AgE(-1773555260);
                apQA0Z = AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f1206cf);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -1773381971);
                apQA0Z = null;
            }
            long j = 0;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(apQ, auraIconAndHeadlineStyle, bo6, (B6A) (objArr15 == true ? 1 : 0), apQA0Z, (G0U) (objArr14 == true ? 1 : 0), (AuraIconAndBodyStyle) (objArr13 == true ? 1 : 0), (B6A) (objArr12 == true ? 1 : 0), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i6, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j, j, (C1YL) (objArr6 == true ? 1 : 0), 2097132, (C06H) (objArr5 == true ? 1 : 0)), chevronNavigation, B1V.A00(bfm, new AnonymousClass1(messagingChannel), 1168858636), B1V.A00(bfm, new C134662(z4, auraCardStyleCardStyleForSettings), -978521469), function0, null, null, null, z3, false, null, null, 0L, false, null, null, bfm, ((iA08 << 15) & 3670016) | 224256, (iA08 >> 9) & 14, 260992);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134673(messagingChannel, function0, bRg2, z3, z4, i, i2);
        }
    }

    public static final AuraChannelsUiState withWhatsAppPreview(AuraChannelsUiState auraChannelsUiState, HatchDeveloperPrefs.WhatsAppConnectionPreview whatsAppConnectionPreview) {
        if (whatsAppConnectionPreview == HatchDeveloperPrefs.WhatsAppConnectionPreview.OFF) {
            return auraChannelsUiState;
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(auraChannelsUiState.availableChannels, auraChannelsUiState.connectedChannels);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ChannelUiItem) next).channel != MessagingChannel.WHATSAPP) {
                arrayList.add(next);
            }
        }
        ArrayList arrayListA0Q = AbstractC0878AGe.A0Q(new ChannelUiItem(MessagingChannel.WHATSAPP, AnonymousClass006.A1Z(whatsAppConnectionPreview, HatchDeveloperPrefs.WhatsAppConnectionPreview.DISCONNECTED), whatsAppConnectionPreview == HatchDeveloperPrefs.WhatsAppConnectionPreview.NEEDS_ATTENTION), arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayListA0Q.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((ChannelUiItem) next2).linked) {
                arrayList2.add(next2);
            } else {
                arrayList3.add(next2);
            }
        }
        return auraChannelsUiState.copy(AGI.A07(arrayList2), AGI.A07(arrayList3), false);
    }
}
