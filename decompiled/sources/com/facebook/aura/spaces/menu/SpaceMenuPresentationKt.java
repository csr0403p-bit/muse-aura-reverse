package com.facebook.aura.spaces.menu;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC07539Wl;
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
import X.B18;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C08R;
import X.C0953AJg;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SpaceMenuPresentationKt {
    public static final long SpaceMenuRowLineHeight = C19U.A03(24);

    /* renamed from: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt$SpaceMenuAction$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraContextMenuItem $item;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraContextMenuItem auraContextMenuItem, Function0<Unit> function0, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$item = auraContextMenuItem;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$loading = z;
            this.$trailingContent = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceMenuPresentationKt.SpaceMenuAction(this.$item, this.$onClick, this.$modifier, this.$loading, this.$trailingContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt$SpaceMenuCardAction$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraContextMenuItem $item;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraContextMenuItem auraContextMenuItem, Function0<Unit> function0, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$item = auraContextMenuItem;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$loading = z;
            this.$trailingContent = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceMenuPresentationKt.SpaceMenuCardAction(this.$item, this.$onClick, this.$modifier, this.$loading, this.$trailingContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt$SpaceMenuHeading$2, reason: invalid class name and case insensitive filesystem */
    public final class C138992 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $multiplayer;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138992(String str, String str2, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$imageUrl = str2;
            this.$multiplayer = z;
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
            SpaceMenuPresentationKt.SpaceMenuHeading(this.$title, this.$imageUrl, this.$multiplayer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt$SpaceMenuLoadingSpinner$2, reason: invalid class name and case insensitive filesystem */
    public final class C139002 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139002(BRg bRg, int i, int i2) {
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
            SpaceMenuPresentationKt.SpaceMenuLoadingSpinner(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt$SpaceMenuSheetContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C139013 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ G0U<AuraContextMenuItem, G0V<BFM, Integer, Unit>> $itemTrailingContent;
        public final /* synthetic */ AHD<AuraContextMenuItem> $items;
        public final /* synthetic */ Integer $loadingItemId;
        public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C139013(String str, String str2, AHD<AuraContextMenuItem> ahd, G0U<? super AuraContextMenuItem, Unit> g0u, Integer num, G0U<? super AuraContextMenuItem, ? extends G0V<? super BFM, ? super Integer, Unit>> g0u2) {
            super(3);
            this.$title = str;
            this.$imageUrl = str2;
            this.$items = ahd;
            this.$onItemClick = g0u;
            this.$loadingItemId = num;
            this.$itemTrailingContent = g0u2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r21, X.BFM r22, int r23) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt.C139013.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt$SpaceMenuSheetContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ G0U<AuraContextMenuItem, G0V<BFM, Integer, Unit>> $itemTrailingContent;
        public final /* synthetic */ AHD<AuraContextMenuItem> $items;
        public final /* synthetic */ Integer $loadingItemId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, String str2, AHD<AuraContextMenuItem> ahd, G0U<? super AuraContextMenuItem, Unit> g0u, Function0<Unit> function0, BRg bRg, Integer num, G0U<? super AuraContextMenuItem, ? extends G0V<? super BFM, ? super Integer, Unit>> g0u2, int i, int i2) {
            super(2);
            this.$title = str;
            this.$imageUrl = str2;
            this.$items = ahd;
            this.$onItemClick = g0u;
            this.$onDismissRequest = function0;
            this.$modifier = bRg;
            this.$loadingItemId = num;
            this.$itemTrailingContent = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceMenuPresentationKt.SpaceMenuSheetContent(this.$title, this.$imageUrl, this.$items, this.$onItemClick, this.$onDismissRequest, this.$modifier, this.$loadingItemId, this.$itemTrailingContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SpaceMenuAction(AuraContextMenuItem auraContextMenuItem, Function0<Unit> function0, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        AKH<AuraColors> akh;
        long jA0L;
        long j;
        BRg bRg2 = bRg;
        boolean z2 = z;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        bfm.AgG(1982175192);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraContextMenuItem) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                g0v2 = null;
            }
            if (auraContextMenuItem.isDestructive) {
                bfm.AgE(-2095111289);
                akh = AuraColorsKt.LocalAuraColors;
                jA0L = AnonymousClass001.A0f(bfm, akh).destructiveText;
            } else {
                bfm.AgE(-2095110077);
                akh = AuraColorsKt.LocalAuraColors;
                jA0L = C06G.A0L(bfm, akh);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BRg bRgA01 = C11U.A01(AnonymousClass007.A0I(bRg2), 24.0f);
            boolean z3 = auraContextMenuItem.isEnabled;
            BRg bRgA0B = C3U4.A0B(C11S.A00(C0v5.A05(bRgA01, null, function0, z3), z3 ? 1.0f : 0.3f), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 10.0f);
            long j2 = bbi.A06;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, 32.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AVy aVy = auraContextMenuItem.startIconPainter;
            if (aVy == null) {
                bfm.AgE(344046277);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(344046278);
                if (auraContextMenuItem.isDestructive) {
                    j = AnonymousClass006.A0i(bfm, akh, -1898195665).destructiveIcon.enabled;
                } else {
                    bfm.AgE(1285506632);
                    B6A b6a = auraContextMenuItem.startIconTint;
                    if (b6a == null) {
                        j = AnonymousClass006.A0i(bfm, akh, -1898193485).primaryText;
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(-1898194694);
                        BBI.A0R(bbi, false);
                        j = b6a.A00;
                    }
                }
                BBI.A0R(bbi, false);
                AuraIconKt.m2568AuraIconFyETyZw(null, aVy, 24.0f, null, j, null, bfm, AnonymousClass001.A03(), 41);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(auraContextMenuItem.label, AnonymousClass001.A0O(c90m, bs0, true), jA0L, C1822Arm.A00(null, C06G.A0W(bfm), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, SpaceMenuRowLineHeight), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            if (z2) {
                bfm.AgE(-976132843);
                SpaceMenuLoadingSpinner(null, bfm, 0, 1);
            } else {
                bfm.AgE(-195299970);
                if (g0v2 == null) {
                    bfm.AgE(-195299971);
                } else {
                    bfm.AgE(-976131324);
                    AnonymousClass003.A13(bfm, g0v2, iA0d >> 12);
                }
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(auraContextMenuItem, function0, bRg2, z2, g0v2, i, i2);
        }
    }

    public static final void SpaceMenuCardAction(AuraContextMenuItem auraContextMenuItem, Function0<Unit> function0, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        G0W<C08R, BFM, Integer, Unit> g0wA00;
        BBI bbiA0M;
        B1U b1uA00;
        boolean z2 = z;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        BRg bRg2 = bRg;
        bfm.AgG(-1948110968);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraContextMenuItem) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                g0v2 = null;
            }
            BRg bRgA0I = AnonymousClass007.A0I(bRg2);
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(C2VU.A04, B6A.A06, new C1DG(AuraDimensKt.SpacingSmall), bfm, 3126, 0);
            String str = auraContextMenuItem.label;
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(str, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
            boolean z3 = auraContextMenuItem.isDestructive;
            boolean z4 = auraContextMenuItem.isEnabled;
            if (z2) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1719966883);
                g0wA00 = ComposableSingletons$SpaceMenuPresentationKt.lambda$1109623021;
            } else {
                bfm.AgE(1720043546);
                if (g0v2 == null) {
                    bfm.AgE(1720043545);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                    g0wA00 = null;
                } else {
                    bfm.AgE(1720043546);
                    g0wA00 = B1V.A00(bfm, new SpaceMenuPresentationKt$SpaceMenuCardAction$1$1(g0v2), -1778592528);
                    bbiA0M = (BBI) bfm;
                    BBI.A0R(bbiA0M, false);
                }
                BBI.A0R(bbiA0M, false);
            }
            AVy aVy = auraContextMenuItem.startIconPainter;
            if (aVy == null) {
                bfm.AgE(1720135925);
                BBI.A0R(bbiA0M, false);
                b1uA00 = null;
            } else {
                bfm.AgE(1720135926);
                b1uA00 = B1V.A00(bfm, new SpaceMenuPresentationKt$SpaceMenuCardAction$2$1(aVy, auraContextMenuItem), 1561908544);
                BBI.A0R(bbiA0M, false);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0I, auraCardStyleM2500listoAWOtXo, auraCardContent, clickable, b1uA00, g0wA00, function0, null, null, null, z4, false, null, null, 0L, z3, null, null, bfm, ((iA0d << 15) & 3670016) | 3072, 0, 228224);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraContextMenuItem, function0, bRg2, z2, g0v2, i, i2);
        }
    }

    public static final void SpaceMenuHeading(String str, String str2, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1800989967);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
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
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(-744350167);
            } else {
                bfm.AgE(-744540631);
                AuraImageKt.m2573AuraImageXRP3Ue8(str2, C11U.A03(C10G.A07(BRg.A00, 64.0f), AnonymousClass002.A0e(bfm).media), B18.A00, null, null, false, new C1DG(64.0f), 0L, false, false, false, null, null, null, null, bfm, ((iA0d >> 3) & 14) | 1573248, 0, 32696);
            }
            BBI.A0R(bbi, false);
            C1822Arm c1822ArmA00 = z ? C1822Arm.A00(null, AnonymousClass006.A0k(bfm, -744265413).title3Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C19U.A03(20), 0L, C19U.A03(25)) : AnonymousClass006.A0k(bfm, -744151674).title3Emphasized;
            BBI.A0R(bbi, false);
            BRg bRgA0A = C3U4.A0A(c1062ATq, AuraDimensKt.SpacingMicro, AuraDimensKt.SpacingMedium);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceMenuPresentationKt$SpaceMenuHeading$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA0A, objAaT, false), 0L, c1822ArmA00, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16308);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138992(str, str2, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* renamed from: SpaceMenuPresentation-rSEfpyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2180SpaceMenuPresentationrSEfpyU(java.lang.String r33, java.lang.String r34, boolean r35, boolean r36, long r37, kotlin.jvm.functions.Function0<kotlin.Unit> r39, X.G0U<? super com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem, kotlin.Unit> r40, X.G0V<? super X.BFM, ? super java.lang.Integer, ? extends X.AHD<com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem>> r41, X.BRg r42, java.lang.Integer r43, X.G0U<? super com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem, ? extends X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit>> r44, X.BFM r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpaceMenuPresentationKt.m2180SpaceMenuPresentationrSEfpyU(java.lang.String, java.lang.String, boolean, boolean, long, kotlin.jvm.functions.Function0, X.G0U, X.G0V, X.BRg, java.lang.Integer, X.G0U, X.BFM, int, int, int):void");
    }

    public static final void SpaceMenuSheetContent(String str, String str2, AHD<AuraContextMenuItem> ahd, G0U<? super AuraContextMenuItem, Unit> g0u, Function0<Unit> function0, BRg bRg, Integer num, G0U<? super AuraContextMenuItem, ? extends G0V<? super BFM, ? super Integer, Unit>> g0u2, BFM bfm, int i, int i2) {
        Integer num2 = num;
        BRg bRg2 = bRg;
        G0U<? super AuraContextMenuItem, ? extends G0V<? super BFM, ? super Integer, Unit>> g0u3 = g0u2;
        bfm.AgG(1928549046);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, ahd);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, num2);
            iA0d |= iA0j;
        }
        int i5 = i2 & 128;
        int iA0a = 12582912;
        if (i5 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0u3);
            iA0d |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                num2 = null;
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = SpaceMenuPresentationKt$SpaceMenuSheetContent$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                g0u3 = (G0U) objAaT;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), "hatch-space-menu-sheet");
            boolean zA1F = AnonymousClass004.A1F(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1F || objAaT2 == C78N.A00) {
                objAaT2 = new SpaceMenuPresentationKt$SpaceMenuSheetContent$2$1(str);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, ARD.A01(bRgA00, (G0U) objAaT2, false), null, null, null, null, function0, false, false, false, null, B1V.A00(bfm, new C139013(str, str2, ahd, g0u, num2, g0u3), -2132782861), bfm, (3670016 & (iA0d << 6)) | 6, 48, 1980);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, str2, ahd, g0u, function0, bRg2, num2, g0u3, i, i2);
        }
    }

    public static final long getSpaceMenuRowLineHeight() {
        return SpaceMenuRowLineHeight;
    }

    public static final void SpaceMenuLoadingSpinner(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1103888412);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new SpaceMenuPresentationKt$SpaceMenuLoadingSpinner$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRg, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139002(bRg, i, i2);
        }
    }
}
