package com.facebook.aura.vds.compose.dialog;

import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
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
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.ext.StringExtKt;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraAlertDialogKt {

    /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$AuraAlertDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $defaultTheme;
        public final /* synthetic */ BA2 $dialogProperties;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ boolean $screenshotTest;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BRg bRg, String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, Function0<Unit> function0, BA2 ba2, boolean z, boolean z2, G0U<? super String, Unit> g0u, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$title = str;
            this.$body = str2;
            this.$illustration = g0v;
            this.$content = g0v2;
            this.$buttons = g0v3;
            this.$onDismissRequest = function0;
            this.$dialogProperties = ba2;
            this.$defaultTheme = z;
            this.$screenshotTest = z2;
            this.$bodyTextOnUrlClick = g0u;
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
            AuraAlertDialogKt.AuraAlertDialog(this.$modifier, this.$title, this.$body, this.$illustration, this.$content, this.$buttons, this.$onDismissRequest, this.$dialogProperties, this.$defaultTheme, this.$screenshotTest, this.$bodyTextOnUrlClick, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$AuraAlertDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $inner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$inner = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AnonymousClass006.A1Q(bfm, this.$inner);
                AppFloatingLayerKt.AppFloatingLayers(null, false, bfm, 0, 3);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$AuraAlertDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $bodyList;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $defaultTheme;
        public final /* synthetic */ BA2 $dialogProperties;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ boolean $screenshotTest;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BRg bRg, String str, AHD<String> ahd, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, Function0<Unit> function0, BA2 ba2, boolean z, boolean z2, G0U<? super String, Unit> g0u, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$title = str;
            this.$bodyList = ahd;
            this.$illustration = g0v;
            this.$content = g0v2;
            this.$buttons = g0v3;
            this.$onDismissRequest = function0;
            this.$dialogProperties = ba2;
            this.$defaultTheme = z;
            this.$screenshotTest = z2;
            this.$bodyTextOnUrlClick = g0u;
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
            AuraAlertDialogKt.AuraAlertDialog(this.$modifier, this.$title, this.$bodyList, this.$illustration, this.$content, this.$buttons, this.$onDismissRequest, this.$dialogProperties, this.$defaultTheme, this.$screenshotTest, this.$bodyTextOnUrlClick, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$DialogThemeWrapper$1, reason: invalid class name and case insensitive filesystem */
    public final class C142771 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $defaultTheme;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142771(boolean z, AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$defaultTheme = z;
            this.$modeOverride = auraThemeMode;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraAlertDialogKt.DialogThemeWrapper(this.$defaultTheme, this.$modeOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$InnerAuraAlertDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C142781 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<String> $bodyList;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ float $horizontalPadding;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ String $title;

        /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$InnerAuraAlertDialog$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04241 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ AHD<String> $bodyList;
            public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
            public final /* synthetic */ float $horizontalPadding;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
            public final /* synthetic */ String $title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04241(AHD<String> ahd, float f, String str, G0U<? super String, Unit> g0u, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3) {
                super(2);
                this.$bodyList = ahd;
                this.$horizontalPadding = f;
                this.$title = str;
                this.$bodyTextOnUrlClick = g0u;
                this.$illustration = g0v;
                this.$content = g0v2;
                this.$buttons = g0v3;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                AHD ahdA07;
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    C3TH c3th = C2VU.A00;
                    AHD<String> ahd = this.$bodyList;
                    float f = this.$horizontalPadding;
                    String str = this.$title;
                    G0U<String, Unit> g0u = this.$bodyTextOnUrlClick;
                    G0V<BFM, Integer, Unit> g0v = this.$illustration;
                    G0V<BFM, Integer, Unit> g0v2 = this.$content;
                    G0V<BFM, Integer, Unit> g0v3 = this.$buttons;
                    BS0 bs0 = BRg.A00;
                    InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                    InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
                    BBI bbi = (BBI) bfm;
                    long j = bbi.A06;
                    int i2 = (int) (j ^ (j >>> 32));
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bs0);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v4 = C1515AkP.A04;
                    BPg.A02(bfm, interfaceC1380AiAA00, g0v4);
                    G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v5 = C1515AkP.A06;
                    G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v5, i2);
                    G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
                    G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
                    C90l c90l = C90l.A00;
                    float f2 = AuraDimensKt.SpacingLargePlusMicro;
                    ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f2, bfm, 0);
                    if (ahd == null) {
                        bfm.AgE(15377344);
                        BBI.A0R(bbi, false);
                        ahdA07 = null;
                    } else {
                        bfm.AgE(15377345);
                        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                        Iterator it = ahd.iterator();
                        while (it.hasNext()) {
                            arrayListA0i.add(StringExtKt.annotatedString(AnonymousClass005.A0j(it), false, null, null, bfm, 0, 14));
                        }
                        BBI.A0R(bbi, false);
                        ahdA07 = AGI.A07(arrayListA0i);
                    }
                    AuraHeadlineAndBodyKt.m3097AuraHeadlineAndBodyZSrRDQQ(C3U4.A0B(bs0, f, AuraDimensKt.SpacingXsmall), AuraHeadlineAndBodyStyle.B1_EMPHASIZED_B2, str, null, null, ahdA07, null, g0u, 0, 0, g0v, null, null, null, null, 0.0f, null, null, bfm, 48, 14155776, 64344);
                    if (g0v2 == null) {
                        bfm.AgE(15752816);
                    } else {
                        bfm.AgE(15752817);
                        BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0N(c90l, AnonymousClass005.A0T(bfm, bs0), false), f, 0.0f);
                        InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
                        int iA0D = AnonymousClass001.A0D(bbi);
                        AKQ akqA042 = BBI.A04(bbi);
                        BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA002, g0v4);
                        BPg.A02(bfm, akqA042, g0v5);
                        AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA012, g0vA0u);
                        g0v2.invoke(bfm, 0);
                        BBI.A0R(bbi, true);
                    }
                    BBI.A0R(bbi, false);
                    g0v3.invoke(bfm, 0);
                    ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f2, bfm, 0);
                    BBI.A0R(bbi, true);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142781(AHD<String> ahd, float f, String str, G0U<? super String, Unit> g0u, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3) {
            super(3);
            this.$bodyList = ahd;
            this.$horizontalPadding = f;
            this.$title = str;
            this.$bodyTextOnUrlClick = g0u;
            this.$illustration = g0v;
            this.$content = g0v2;
            this.$buttons = g0v3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
                AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
                AuraDimensionsKt.AuraDimensionsOverride(AuraDimensions.m2859copyyE26SOY$default((AuraDimensions) bfm.A6v(akh), null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, ((AuraDimensions) bfm.A6v(akh)).dialogButtonGroupButtonSize, null, null, 0.0f, 0.0f, null, 0.0f, null, 0.0f, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, null, null, null, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, -32769, 65535, null), B1V.A00(bfm, new C04241(this.$bodyList, this.$horizontalPadding, this.$title, this.$bodyTextOnUrlClick, this.$illustration, this.$content, this.$buttons), 1714569427), bfm, 48);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$InnerAuraAlertDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C142792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $bodyList;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142792(String str, AHD<String> ahd, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$bodyList = ahd;
            this.$illustration = g0v;
            this.$content = g0v2;
            this.$buttons = g0v3;
            this.$bodyTextOnUrlClick = g0u;
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
            AuraAlertDialogKt.InnerAuraAlertDialog(this.$title, this.$bodyList, this.$illustration, this.$content, this.$buttons, this.$bodyTextOnUrlClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DialogThemeWrapper(boolean z, AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        boolean z2 = z;
        AuraThemeMode auraThemeMode2 = auraThemeMode;
        bfm.AgG(-1192415916);
        int i3 = i2 & 1;
        int iA0n = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(auraThemeMode2));
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                z2 = false;
            }
            if (i4 != 0) {
                auraThemeMode2 = null;
            }
            if (z2) {
                bfm.AgE(412113947);
                AnonymousClass003.A13(bfm, g0v, iA0n >> 6);
            } else {
                bfm.AgE(412141971);
                AnonymousClass002.A0x(bfm, auraThemeMode2 == null ? AuraThemeMode.DEFAULT : auraThemeMode2, g0v, iA0n & 896);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142771(z2, auraThemeMode2, g0v, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraAlertDialog(X.BRg r36, java.lang.String r37, X.AHD<java.lang.String> r38, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r39, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r40, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, X.BA2 r43, boolean r44, boolean r45, X.G0U<? super java.lang.String, kotlin.Unit> r46, X.BFM r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt.AuraAlertDialog(X.BRg, java.lang.String, X.AHD, X.G0V, X.G0V, X.G0V, kotlin.jvm.functions.Function0, X.BA2, boolean, boolean, X.G0U, X.BFM, int, int, int):void");
    }

    public static final void InnerAuraAlertDialog(String str, AHD<String> ahd, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        AHD<String> ahd2 = ahd;
        G0U<? super String, Unit> g0u2 = g0u;
        BRg bRg2 = bRg;
        bfm.AgG(-1611734211);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, ahd2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v3);
        }
        int i4 = i2 & 32;
        int iA0Y = 196608;
        if (i4 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u2);
            iA0d |= iA0Y;
        }
        int i5 = i2 & 64;
        int iA0j = 1572864;
        if (i5 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                ahd2 = null;
            }
            if (i4 != 0) {
                g0u2 = null;
            }
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            AuraSurfaceKt.m2623AuraSurface1esR5Hs(C10G.A0D(bRg2, Float.NaN, 285.0f), AnonymousClass002.A0e(bfm).modal, false, AnonymousClass002.A0c(bfm).modal, null, 0L, null, false, B1V.A00(bfm, new C142781(ahd2, AuraDimensKt.SpacingLargePlusMicro, str, g0u2, g0v, g0v2, g0v3), -69565923), bfm, 100663296, 244);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142792(str, ahd2, g0v, g0v2, g0v3, g0u2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraAlertDialog(X.BRg r35, java.lang.String r36, java.lang.String r37, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r38, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r39, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.BA2 r42, boolean r43, boolean r44, X.G0U<? super java.lang.String, kotlin.Unit> r45, X.BFM r46, int r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt.AuraAlertDialog(X.BRg, java.lang.String, java.lang.String, X.G0V, X.G0V, X.G0V, kotlin.jvm.functions.Function0, X.BA2, boolean, boolean, X.G0U, X.BFM, int, int, int):void");
    }
}
