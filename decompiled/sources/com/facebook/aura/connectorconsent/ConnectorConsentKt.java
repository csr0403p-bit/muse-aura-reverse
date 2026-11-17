package com.facebook.aura.connectorconsent;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC1754Apr;
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
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C7VF;
import X.C7mU;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.navigation.MetaWebUrlLocalizerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectorConsentKt {

    /* renamed from: com.facebook.aura.connectorconsent.ConnectorConsentKt$ConnectorConsentBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorConsentUiModel $model;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectorConsentUiModel connectorConsentUiModel, Function0<Unit> function0, Function0<Unit> function02) {
            super(3);
            this.$model = connectorConsentUiModel;
            this.$onConnect = function0;
            this.$onCancel = function02;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ConnectorConsentKt.ConnectorConsentContent(this.$model, this.$onConnect, this.$onCancel, AbstractC1754Apr.A01(BRg.A00), false, false, null, null, null, bfm, 0, 496);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.connectorconsent.ConnectorConsentKt$ConnectorConsentBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectorConsentUiModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConnect;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectorConsentUiModel connectorConsentUiModel, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$model = connectorConsentUiModel;
            this.$onConnect = function0;
            this.$onCancel = function02;
            this.$onDismiss = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorConsentKt.ConnectorConsentBottomSheet(this.$model, this.$onConnect, this.$onCancel, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.connectorconsent.ConnectorConsentKt$ConnectorConsentBulletRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, String str, String str2, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$text = str;
            this.$title = str2;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorConsentKt.ConnectorConsentBulletRow(this.$iconRes, this.$text, this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.connectorconsent.ConnectorConsentKt$ConnectorConsentCallout$3, reason: invalid class name and case insensitive filesystem */
    public final class C113333 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, String, Unit> $onLinkClick;
        public final /* synthetic */ AHD<String> $paragraphs;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C113333(AHD<String> ahd, String str, G0V<? super String, ? super String, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$paragraphs = ahd;
            this.$title = str;
            this.$onLinkClick = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorConsentKt.ConnectorConsentCallout(this.$paragraphs, this.$title, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.connectorconsent.ConnectorConsentKt$ConnectorConsentContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C113342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $connectEnabled;
        public final /* synthetic */ boolean $connectLoading;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $extraContent;
        public final /* synthetic */ ConnectorConsentUiModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConnect;
        public final /* synthetic */ G0V<String, String, Unit> $onLinkClick;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $titleAccessory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C113342(ConnectorConsentUiModel connectorConsentUiModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, G0V<? super String, ? super String, Unit> g0v, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, int i, int i2) {
            super(2);
            this.$model = connectorConsentUiModel;
            this.$onConnect = function0;
            this.$onCancel = function02;
            this.$modifier = bRg;
            this.$connectEnabled = z;
            this.$connectLoading = z2;
            this.$onLinkClick = g0v;
            this.$titleAccessory = g0w;
            this.$extraContent = g0w2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorConsentKt.ConnectorConsentContent(this.$model, this.$onConnect, this.$onCancel, this.$modifier, this.$connectEnabled, this.$connectLoading, this.$onLinkClick, this.$titleAccessory, this.$extraContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.connectorconsent.ConnectorConsentKt$ConnectorConsentFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C113352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, String, Unit> $onLinkClick;
        public final /* synthetic */ AHD<String> $paragraphs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C113352(AHD<String> ahd, G0V<? super String, ? super String, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$paragraphs = ahd;
            this.$onLinkClick = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorConsentKt.ConnectorConsentFooter(this.$paragraphs, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.connectorconsent.ConnectorConsentKt$ConnectorConsentIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C113362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $iconRes;
        public final /* synthetic */ boolean $iconTinted;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113362(String str, Integer num, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$iconUrl = str;
            this.$iconRes = num;
            this.$iconTinted = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorConsentKt.ConnectorConsentIcon(this.$iconUrl, this.$iconRes, this.$iconTinted, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ConnectorConsentBottomSheet(ConnectorConsentUiModel connectorConsentUiModel, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectorConsentUiModel, 0);
        AnonymousClass005.A11(function0, function02, function03, 1);
        bfm.AgG(-445991358);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, connectorConsentUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(bRg2, function03, null, null, AuraTheme.INSTANCE.getColors(bfm, 6).modal, false, false, B1V.A00(bfm, new AnonymousClass1(connectorConsentUiModel, function0, function02), -1197568631), bfm, ((iA0d >> 12) & 14) | 12582912 | ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), MinidumpReader.MODULE_FULL_SIZE);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(connectorConsentUiModel, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final void ConnectorConsentBulletRow(int i, String str, String str2, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1934153335);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectorConsentKt$ConnectorConsentBulletRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, AuraIconSize.X_SMALL, null, C3cH.A06(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, 12.0f);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (str2 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A06(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 161013177).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 6) & 14, 0, 16370);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingMicro, false);
            } else {
                bfm.AgE(161234207);
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 3) & 14, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i, str, str2, bRg2, i2, i3);
        }
    }

    public static final void ConnectorConsentCallout(AHD<String> ahd, String str, G0V<? super String, ? super String, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1577085021);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A03(bRgA0R, auraTheme.getShapes(bfm, 6).banner), C60R.A04(bfm, auraTheme)), AuraDimensKt.SpacingSmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectorConsentKt$ConnectorConsentCallout$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingMicro), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            if (str != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -716654598).subheadlineMedium, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16306);
            } else {
                bfm.AgE(-716468939);
            }
            BBI.A0R(bbi, false);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1824226421);
            while (itA0w.hasNext()) {
                m489ConnectorConsentParagraph8V94_ZQ((String) itA0w.next(), C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).caption1Regular, null, null, null, null, null, null, null, null, 3, 0, 0, 16744447, 0L, 0L, 0L, 0L), g0v, null, bfm, (iA0d << 3) & 7168, 16);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C113333(ahd, str, g0v, bRg2, i, i2);
        }
    }

    public static final void ConnectorConsentContent(ConnectorConsentUiModel connectorConsentUiModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, G0V<? super String, ? super String, Unit> g0v, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Q = z;
        boolean zA1K = z2;
        G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w3 = g0w;
        G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w4 = g0w2;
        boolean zA1Z = AnonymousClass005.A1Z(connectorConsentUiModel, function0, function02);
        bfm.AgG(2064562293);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, connectorConsentUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1Q);
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            iA0d |= 196608;
        } else if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, zA1K);
        }
        int i6 = i2 & 64;
        int iA0Z = 1572864;
        if (i6 != 0) {
            iA0d |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v);
            iA0d |= iA0Z;
        }
        int i7 = i2 & 128;
        int iA0a = 12582912;
        if (i7 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0w3);
            iA0d |= iA0a;
        }
        int i8 = i2 & 256;
        int iA0b = 100663296;
        if (i8 != 0) {
            iA0d |= iA0b;
        } else if ((i & 100663296) == 0) {
            i8 = 0;
            iA0b = AnonymousClass004.A0b(bfm, g0w4);
            iA0d |= iA0b;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            zA1K = C3cG.A1K(i5, zA1K);
            if (i6 != 0) {
                g0v = null;
            }
            if (i7 != 0) {
                g0w3 = ComposableSingletons$ConnectorConsentKt.lambda$1983557133;
            }
            if (i8 != 0) {
                g0w4 = ComposableSingletons$ConnectorConsentKt.lambda$1375690492;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function03);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                C90l c90l = C90l.A00;
                BS0 bs0 = BRg.A00;
                int iA00 = C01N.A00(bfm, bs0, 24.0f);
                ConnectorConsentIcon(connectorConsentUiModel.iconUrl, connectorConsentUiModel.iconRes, connectorConsentUiModel.iconTinted, null, bfm, 0, 8);
                C01N.A08(bfm, bs0, 12.0f);
                String str = connectorConsentUiModel.title;
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822Arm = auraTheme.getTypography(bfm, iA00).title3Emphasized;
                long jA06 = C3cH.A06(bfm, auraTheme);
                float f = AuraDimensKt.SpacingLargePlusMicro;
                AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(bs0, f, 0.0f), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                AnonymousClass001.A1G(c90l, bfm, g0w3, ((iA0d >> 18) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
                String str2 = connectorConsentUiModel.description;
                if (str2 == null || str2.length() == 0) {
                    bfm.AgE(-1564584361);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-1564924555);
                    C01N.A08(bfm, bs0, 12.0f);
                    AuraTextKt.m2639AuraTextUY9GdpU(connectorConsentUiModel.description, C3U4.A0B(c1062ATq, f, 0.0f), C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                    BBI.A0R(bbi, false);
                }
                C01N.A08(bfm, bs0, 16.0f);
                AnonymousClass001.A1G(c90l, bfm, g0w4, ((iA0d >> 21) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
                if (connectorConsentUiModel.calloutParagraphs.isEmpty()) {
                    bfm.AgE(-1564173673);
                } else {
                    bfm.AgE(-1564461012);
                    ConnectorConsentCallout(connectorConsentUiModel.calloutParagraphs, connectorConsentUiModel.calloutTitle, g0v, C3U4.A0B(bs0, f, 0.0f), bfm, (iA0d >> 12) & 896, 0);
                    C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
                }
                BBI.A0R(bbi, false);
                if (connectorConsentUiModel.bullets.isEmpty()) {
                    bfm.AgE(-1563661801);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-1564121159);
                    BRg bRgA0B = C3U4.A0B(c1062ATq, f, 4.0f);
                    InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                    AnonymousClass005.A0n(bfm, bbi, function03);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    bfm.AgE(-128628645);
                    int i9 = 0;
                    for (Object obj : connectorConsentUiModel.bullets) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            ConnectorConsentBullet connectorConsentBullet = (ConnectorConsentBullet) obj;
                            if (i9 > 0) {
                                bfm.AgE(793489699);
                                C01N.A04(bfm, bbi, bs0, 12.0f, false);
                            } else {
                                bfm.AgE(793554086);
                                BBI.A0R(bbi, false);
                            }
                            ConnectorConsentBulletRow(connectorConsentBullet.iconRes, connectorConsentBullet.text, connectorConsentBullet.title, null, bfm, 0, 8);
                            i9 = i10;
                        }
                    }
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, zA1Z);
                    BBI.A0R(bbi, false);
                }
                if (connectorConsentUiModel.footerParagraphs.isEmpty()) {
                    bfm.AgE(-1563515977);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-1563612077);
                    ConnectorConsentFooter(connectorConsentUiModel.footerParagraphs, g0v, null, bfm, (iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
                    BBI.A0R(bbi, false);
                }
                C01N.A08(bfm, bs0, 16.0f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d38);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, zA1Z ? 1 : 0);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, C3U4.A0B(c1062ATq, f, 0.0f), auraLabelButtonStylePrimary, auraButtonSize, null, false, false, zA1Q, zA1K, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 15) & 1879048192) | 196608, ((iA0d >> 15) & 14) | ((iA0d << 9) & 57344), 0, 134199749);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12117e), null, C3U4.A0B(c1062ATq, f, 0.0f), auraButtonStyles.tertiary(null, bfm, 48, zA1Z ? 1 : 0), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0d << 6) & 57344, 0, 134201285);
                BBI.A0R(bbi, zA1Z);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C113342(connectorConsentUiModel, function0, function02, bRg2, zA1Q, zA1K, g0v, g0w3, g0w4, i, i2);
        }
    }

    public static final void ConnectorConsentFooter(AHD<String> ahd, G0V<? super String, ? super String, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-708862783);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                BS0 bs0 = BRg.A00;
                int iA00 = C01N.A00(bfm, bs0, 24.0f);
                BRg bRgA04 = C10G.A04(c1062ATq, 1.0f);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                long jA07 = C3cH.A07(bfm, auraTheme);
                C1b8.A04(bfm, bRgA04, HxS.A04(HDi.A0O[(int) (jA07 & 63)], B6A.A03(jA07), B6A.A02(jA07), B6A.A01(jA07), 0.2f));
                C01N.A08(bfm, bs0, 12.0f);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1642944006);
                int i4 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        String str = (String) next;
                        if (i4 > 0) {
                            bfm.AgE(1657104186);
                            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmall);
                        } else {
                            bfm.AgE(1657168573);
                        }
                        BBI.A0R(bbi, false);
                        m489ConnectorConsentParagraph8V94_ZQ(str, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, iA00).caption1Regular, g0v, C3U4.A0B(bs0, AuraDimensKt.SpacingLargePlusMicro, 0.0f), bfm, (iA0d << 6) & 7168, 0);
                        i4 = i5;
                    }
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C113352(ahd, g0v, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConnectorConsentIcon(java.lang.String r31, java.lang.Integer r32, boolean r33, X.BRg r34, X.BFM r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.connectorconsent.ConnectorConsentKt.ConnectorConsentIcon(java.lang.String, java.lang.Integer, boolean, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: ConnectorConsentParagraph-8V94_ZQ, reason: not valid java name */
    public static final void m489ConnectorConsentParagraph8V94_ZQ(String str, long j, C1822Arm c1822Arm, G0V<? super String, ? super String, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-892971608);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            long j2 = C3cH.A0W(bfm).link;
            long j3 = C1809ArT.A01;
            C1824Aro c1824Aro = new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j2, j3, j3, B6A.A07);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1824Aro, AnonymousClass003.A1B(iA0d), AnonymousClass003.A1C(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                m491appendInlineLinks9LQNqLg(c1731ApSA0W, str, j, c1824Aro);
                objAaT = c1731ApSA0W.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1V = AnonymousClass002.A1V(bfm, contextA0H, bfm.A65(apQ), AnonymousClass006.A1X(iA0d));
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectorConsentKt$ConnectorConsentParagraph$1$1(apQ, g0v, contextA0H);
                bfm.Ai0(objAaT2);
            }
            C7VF.A00(bfm, bRgA0R, apQ, c1822Arm, null, (G0U) objAaT2, 0, 0, iA0d & 896, 120, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConnectorConsentKt$ConnectorConsentParagraph$2(str, j, c1822Arm, g0v, bRg2, i, i2);
        }
    }

    /* renamed from: appendInlineLinks-9LQNqLg, reason: not valid java name */
    public static final void m491appendInlineLinks9LQNqLg(C1731ApS c1731ApS, String str, long j, C1824Aro c1824Aro) {
        int iA02;
        int iA022;
        String strSubstring;
        String strSubstring2 = str;
        while (true) {
            int iA08 = C7BY.A08(strSubstring2, '[', 0);
            if (iA08 < 0) {
                break;
            }
            int i = iA08 + 1;
            int iA082 = C7BY.A08(strSubstring2, ']', i);
            int i2 = iA082 + 1;
            if (iA082 < 0 || i2 >= strSubstring2.length() || strSubstring2.charAt(i2) != '(') {
                long j2 = C1809ArT.A01;
                iA022 = c1731ApS.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07));
                strSubstring = strSubstring2.substring(0, i);
                c1731ApS.A0E(strSubstring);
                c1731ApS.A06(iA022);
                strSubstring2 = strSubstring2.substring(i);
            } else {
                int i3 = iA082 + 2;
                int iA083 = C7BY.A08(strSubstring2, ')', i3);
                if (iA083 < 0) {
                    long j3 = C1809ArT.A01;
                    iA022 = c1731ApS.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j3, j3, B6A.A07));
                    try {
                        strSubstring = strSubstring2.substring(0, i);
                        c1731ApS.A0E(strSubstring);
                        c1731ApS.A06(iA022);
                        strSubstring2 = strSubstring2.substring(i);
                    } catch (Throwable th) {
                        c1731ApS.A06(iA022);
                        throw th;
                    }
                } else {
                    if (iA08 > 0) {
                        long j4 = C1809ArT.A01;
                        iA02 = c1731ApS.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j4, j4, B6A.A07));
                        try {
                            c1731ApS.A0E(strSubstring2.substring(0, iA08));
                        } finally {
                        }
                    }
                    String strSubstring3 = strSubstring2.substring(i, iA082);
                    Uri uriA01 = null;
                    try {
                        uriA01 = C7Je.A01(strSubstring2.substring(i3, iA083));
                    } catch (SecurityException | UnsupportedOperationException unused) {
                    }
                    if (uriA01 != null) {
                        c1731ApS.A0F("URL", C60O.A0o(uriA01));
                        iA02 = c1731ApS.A02(c1824Aro);
                        try {
                            c1731ApS.A0E(strSubstring3);
                            c1731ApS.A06(iA02);
                            c1731ApS.A05();
                        } finally {
                        }
                    } else {
                        long j5 = C1809ArT.A01;
                        iA02 = c1731ApS.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j5, j5, B6A.A07));
                        c1731ApS.A0E(strSubstring3);
                    }
                    strSubstring2 = strSubstring2.substring(iA083 + 1);
                }
            }
            c1731ApS.A06(iA022);
            throw th;
        }
        if (strSubstring2.length() > 0) {
            long j6 = C1809ArT.A01;
            iA02 = c1731ApS.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j6, j6, B6A.A07));
            c1731ApS.A0E(strSubstring2);
        }
    }

    public static final void launchConsentLink(Context context, Uri uri) {
        C7mU.A00().A02().A05(context, new Intent("android.intent.action.VIEW", MetaWebUrlLocalizerKt.localizedForDevice(uri, context)));
    }

    public static final void openConnectorConsentLink(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(str);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 != null) {
            launchConsentLink(context, uriA01);
        }
    }
}
