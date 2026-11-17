package com.facebook.aura.pairs;

import X.AKQ;
import X.AVy;
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
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraBrandIconTintsKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsComponentsKt {
    public static final int MENU_CANCEL_REQUEST = 1;
    public static final int MENU_SHARE_LINK = 0;

    /* renamed from: com.facebook.aura.pairs.ConnectionsComponentsKt$ConnectionsSearchEntry$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
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
            ConnectionsComponentsKt.ConnectionsSearchEntry(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsComponentsKt$ConnectionsSentMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C128212 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isBusy;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancelRequest;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ Function0<Unit> $onShareLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128212(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$isBusy = z;
            this.$onOpen = function0;
            this.$onShareLink = function02;
            this.$onCancelRequest = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsComponentsKt.ConnectionsSentMenu(this.$isBusy, this.$onOpen, this.$onShareLink, this.$onCancelRequest, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsComponentsKt$ConnectionsSuggestionAction$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isBusy;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PairsSuggestion, Unit> $onConnect;
        public final /* synthetic */ PairsSuggestion $person;
        public final /* synthetic */ int $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(PairsSuggestion pairsSuggestion, boolean z, ConnectionsLogContext connectionsLogContext, int i, G0U<? super PairsSuggestion, Unit> g0u, BRg bRg, int i2, int i3) {
            super(2);
            this.$person = pairsSuggestion;
            this.$isBusy = z;
            this.$log = connectionsLogContext;
            this.$position = i;
            this.$onConnect = g0u;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsComponentsKt.ConnectionsSuggestionAction(this.$person, this.$isBusy, this.$log, this.$position, this.$onConnect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsComponentsKt$ConnectionsSuggestionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C128222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isBusy;
        public final /* synthetic */ boolean $isSent;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PairsSuggestion, Unit> $onCancelRequest;
        public final /* synthetic */ G0U<PairsSuggestion, Unit> $onConnect;
        public final /* synthetic */ G0U<PairsSuggestion, Unit> $onShareLink;
        public final /* synthetic */ PairsSuggestion $person;
        public final /* synthetic */ int $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128222(PairsSuggestion pairsSuggestion, ConnectionsLogContext connectionsLogContext, int i, boolean z, boolean z2, G0U<? super PairsSuggestion, Unit> g0u, G0U<? super PairsSuggestion, Unit> g0u2, G0U<? super PairsSuggestion, Unit> g0u3, BRg bRg, int i2, int i3) {
            super(2);
            this.$person = pairsSuggestion;
            this.$log = connectionsLogContext;
            this.$position = i;
            this.$isSent = z;
            this.$isBusy = z2;
            this.$onConnect = g0u;
            this.$onShareLink = g0u2;
            this.$onCancelRequest = g0u3;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsComponentsKt.ConnectionsSuggestionRow(this.$person, this.$log, this.$position, this.$isSent, this.$isBusy, this.$onConnect, this.$onShareLink, this.$onCancelRequest, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsComponentsKt$ConnectionsSuggestionSubtitle$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSent;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PairsSuggestion $person;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PairsSuggestion pairsSuggestion, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$person = pairsSuggestion;
            this.$isSent = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsComponentsKt.ConnectionsSuggestionSubtitle(this.$person, this.$isSent, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* renamed from: ConnectionsGroupAvatar-Dt02yhY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1649ConnectionsGroupAvatarDt02yhY(float r11, X.BRg r12, long r13, X.BFM r15, int r16, int r17) {
        /*
            r2 = r12
            r0 = r13
            r3 = -219251235(0xfffffffff2ee7ddd, float:-9.447628E30)
            r14 = r15
            r15.AgG(r3)
            r3 = r16
            r5 = r16 & 6
            r4 = r11
            if (r5 != 0) goto Lb2
            int r8 = X.AnonymousClass004.A04(r15, r11)
            r8 = r8 | r16
        L16:
            r9 = r17 & 2
            if (r9 == 0) goto La7
            r8 = r8 | 48
        L1c:
            r5 = r3 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L2f
            r5 = r17 & 4
            if (r5 != 0) goto L2c
            boolean r6 = r15.A64(r0)
            r5 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L2e
        L2c:
            r5 = 128(0x80, float:1.794E-43)
        L2e:
            r8 = r8 | r5
        L2f:
            r6 = r8 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r7 = 0
            boolean r5 = X.AnonymousClass002.A1P(r6, r5)
            boolean r5 = X.AnonymousClass001.A1b(r5, r15, r8)
            if (r5 == 0) goto La3
            r15.Afy()
            r5 = r16 & 1
            r6 = 6
            if (r5 == 0) goto L92
            boolean r5 = r15.AEk()
            if (r5 != 0) goto L92
            r15.Afo()
        L4f:
            r15.AAb()
            r5 = 2131231422(0x7f0802be, float:1.8078925E38)
            X.AVy r8 = X.BOf.A00(r15, r5, r7)
            r9 = 1103101952(0x41c00000, float:24.0)
            com.facebook.aura.vds.compose.theme.AuraTheme r5 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            long r11 = X.C3cH.A05(r15, r5)
            X.BRg r6 = X.C10G.A07(r2, r4)
            X.1D3 r5 = X.C1D8.A00
            X.BRg r7 = X.C1b8.A03(r6, r5, r0)
            float r6 = r4 - r9
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r5
            X.BRg r7 = X.C3U4.A09(r7, r6)
            int r15 = X.AnonymousClass001.A04()
            r16 = 32
            r10 = 0
            r13 = r10
            com.facebook.aura.vds.compose.icons.AuraIconKt.m2568AuraIconFyETyZw(r7, r8, r9, r10, r11, r13, r14, r15, r16)
        L7f:
            X.BBb r5 = r14.AAc()
            if (r5 == 0) goto L91
            com.facebook.aura.pairs.ConnectionsComponentsKt$ConnectionsGroupAvatar$1 r11 = new com.facebook.aura.pairs.ConnectionsComponentsKt$ConnectionsGroupAvatar$1
            r16 = r3
            r14 = r0
            r13 = r2
            r12 = r4
            r11.<init>(r12, r13, r14, r16, r17)
            r5.A06 = r11
        L91:
            return
        L92:
            if (r9 == 0) goto L96
            X.BS0 r2 = X.BRg.A00
        L96:
            r5 = r17 & 4
            if (r5 == 0) goto L4f
            com.facebook.aura.vds.compose.theme.AuraTheme r0 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            com.facebook.aura.vds.compose.theme.AuraColors r0 = r0.getColors(r15, r6)
            long r0 = r0.highlight
            goto L4f
        La3:
            r15.Afo()
            goto L7f
        La7:
            r5 = r16 & 48
            if (r5 != 0) goto L1c
            int r5 = X.AnonymousClass004.A0e(r15, r12)
            r8 = r8 | r5
            goto L1c
        Lb2:
            r8 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsComponentsKt.m1649ConnectionsGroupAvatarDt02yhY(float, X.BRg, long, X.BFM, int, int):void");
    }

    public static final int channelName(ConnectionsGroupProvider connectionsGroupProvider) {
        int iA0E = AnonymousClass001.A0E(connectionsGroupProvider, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f1207e0;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f1207df;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f1207de;
        }
        if (iA0E == 3) {
            return R.string._name_removed__res_0x7f1207dd;
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConnectionsGroupProvider.values().length];
            try {
                AnonymousClass005.A0v(ConnectionsGroupProvider.WHATSAPP, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsGroupProvider.TELEGRAM, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsGroupProvider.IMESSAGE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsGroupProvider.OTHER, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PairsSuggestionSource.values().length];
            try {
                AnonymousClass005.A0v(PairsSuggestionSource.FACEBOOK, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(PairsSuggestionSource.MESSENGER, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(PairsSuggestionSource.INSTAGRAM, iArr2, 3);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(PairsSuggestionSource.THREADS, iArr2, 4);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* renamed from: ConnectionsOverflowButton-xfPyhaw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1650ConnectionsOverflowButtonxfPyhaw(kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.BRg r27, boolean r28, float r29, long r30, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsComponentsKt.m1650ConnectionsOverflowButtonxfPyhaw(kotlin.jvm.functions.Function0, X.BRg, boolean, float, long, X.BFM, int, int):void");
    }

    public static final void ConnectionsSearchEntry(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-624607740);
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
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 48.0f);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C11U.A03(bRgA0U, c1d3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA07 = C3U4.A07(C0v5.A04(C1DI.A02(C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).card), c1d3, 1.0f, auraTheme.getColors(bfm, 6).fillDivider), C3cG.A0A(0), null, function0, true), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 10.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA02);
            AuraIconKt.m2568AuraIconFyETyZw(C3U4.A09(BRg.A00, 4.0f), BOf.A00(bfm, R.drawable.userbadgesearch_outline_24_wght400, 0), 24.0f, null, C3cH.A05(bfm, auraTheme), null, bfm, (AVy.$stable << 3) | 3462, 32);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120818), null, C3cH.A05(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsSentMenu(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1562003603);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d8d);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.link_outline_24_wght400, 0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d56);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.x_wght400_outline_24, 0);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            AVy aVyA003 = BOf.A00(bfm, R.drawable.check_outline_24_wght400, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            B6A b6aA04 = C60P.A04(auraTheme.getColors(bfm, 6).link);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d89);
            boolean zA1C = AnonymousClass003.A1C(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new ConnectionsComponentsKt$ConnectionsSentMenu$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA003, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, b6aA04, strA013, (Function0) objAaT2, null, !z, C60P.A04(auraTheme.getColors(bfm, 6).card), new C1DG(20.0f), null, null, bfm, (AVy.$stable << 3) | 28032, 48, 12545);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1K = AnonymousClass004.A1K(iA0n) | AnonymousClass006.A1X(iA0n);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == obj) {
                objAaT3 = new ConnectionsComponentsKt$ConnectionsSentMenu$1$2$1(function02, function03, mutableState);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new ConnectionsComponentsKt$ConnectionsSentMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT4, zA0A, null, 0L, null, false, new ConnectionsComponentsKt$ConnectionsSentMenu$1$4(strA01, aVyA00, strA012, aVyA002), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128212(z, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final void ConnectionsSuggestionAction(PairsSuggestion pairsSuggestion, boolean z, ConnectionsLogContext connectionsLogContext, int i, G0U<? super PairsSuggestion, Unit> g0u, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1335504583);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsSuggestion, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, i);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u);
        }
        int i4 = i3 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        boolean z2 = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 74899, 74898), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (pairsSuggestion.isOnMuse) {
                bfm.AgE(-775308412);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0);
                String strA0t = AnonymousClass001.A0t(bfm, pairsSuggestion.name, R.string._name_removed__res_0x7f1207e6);
                boolean zA1M = ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass004.A1M(iA05) | AnonymousClass002.A1Q(iA05 & 57344, 16384);
                if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(pairsSuggestion))) {
                    z2 = false;
                }
                boolean z3 = zA1M | z2;
                Object objAaT = bfm.AaT();
                if (z3 || objAaT == C78N.A00) {
                    objAaT = new ConnectionsComponentsKt$ConnectionsSuggestionAction$1$1(connectionsLogContext, i, g0u, pairsSuggestion);
                    bfm.Ai0(objAaT);
                }
                AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA0t, (Function0) objAaT, bRg2, !z, 0.0f, AuraIconSize.X_SMALL, C60P.A04(C3cH.A06(bfm, AuraTheme.INSTANCE)), null, false, false, bfm, AVy.$stable | 1572864 | ((iA05 >> 6) & 7168), 0, 1824);
            } else {
                bfm.AgE(-775286227);
                Function0 function0 = null;
                if (z) {
                    bfm.AgE(1735973521);
                } else {
                    bfm.AgE(1736030840);
                    if ((iA05 & 896) != 256 && ((iA05 & 512) == 0 || !bfm.A67(connectionsLogContext))) {
                        z2 = false;
                    }
                    boolean zA1M2 = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(pairsSuggestion))) | z2 | AnonymousClass004.A1M(iA05) | AnonymousClass002.A1Q(iA05 & 57344, 16384);
                    Object objAaT2 = bfm.AaT();
                    if (zA1M2 || objAaT2 == C78N.A00) {
                        objAaT2 = new ConnectionsComponentsKt$ConnectionsSuggestionAction$2$1(connectionsLogContext, i, g0u, pairsSuggestion);
                        bfm.Ai0(objAaT2);
                    }
                    function0 = (Function0) objAaT2;
                }
                AnonymousClass001.A1D(bfm);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = ConnectionsComponentsKt$ConnectionsSuggestionAction$3$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                AuraElevatedButtonKt.m2420AuraPillButtonq88KkHs(function0, AnonymousClass001.A0Y(bRg2, objAaT3, false), false, 0.0f, 0.0f, 0.0f, false, ComposableSingletons$ConnectionsComponentsKt.lambda$895556522, bfm, 12582912, 124);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(pairsSuggestion, z, connectionsLogContext, i, g0u, bRg2, i2, i3);
        }
    }

    public static final void ConnectionsSuggestionRow(PairsSuggestion pairsSuggestion, ConnectionsLogContext connectionsLogContext, int i, boolean z, boolean z2, G0U<? super PairsSuggestion, Unit> g0u, G0U<? super PairsSuggestion, Unit> g0u2, G0U<? super PairsSuggestion, Unit> g0u3, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(pairsSuggestion, 0);
        AnonymousClass002.A1D(connectionsLogContext, 1, g0u);
        C60O.A1M(g0u2, 6, g0u3);
        bfm.AgG(-1258434517);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsSuggestion, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsLogContext, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z2);
        }
        if ((i2 & 196608) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((i2 & 1572864) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if ((i2 & 12582912) == 0) {
            iA05 |= AnonymousClass004.A0a(bfm, g0u3);
        }
        int i4 = i3 & 256;
        int iA0l = 100663296;
        if (i4 != 0) {
            iA05 |= iA0l;
        } else if ((i2 & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRgA0Q);
            iA05 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            HatchComponent hatchComponent = HatchComponent.CONNECTION_SUGGESTION;
            HatchSubsurface hatchSubsurface = HatchSubsurface.CONNECTIONS_SUGGESTIONS;
            Integer numValueOf = Integer.valueOf(i);
            String str = pairsSuggestion.id;
            int i5 = ConnectionsLogContext.$stable;
            int i6 = iA05 >> 3;
            boolean z3 = true;
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0U(bRgA0R.then(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, hatchComponent, hatchSubsurface, null, numValueOf, str, bfm, i5 | 432 | (i6 & 14) | ((iA05 << 6) & 57344), 8)), 68.0f), 16.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u4 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u4);
            C90m c90m = C90m.A00;
            int i7 = PairsSuggestion.$stable;
            int i8 = iA05 & 14;
            m1652PairsSuggestionAvatar6a0pyJM(pairsSuggestion, null, 44.0f, bfm, i7 | 384 | i8, 2);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 2.0f, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u4, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str2 = pairsSuggestion.name;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            int i9 = i7 | i8;
            ConnectionsSuggestionSubtitle(pairsSuggestion, z, null, bfm, i9 | ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
            BBI.A0R(bbi, true);
            if (z) {
                bfm.AgE(266470219);
                int i10 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                boolean zA1K = (i10 == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass004.A1K(iA05);
                Object objAaT = bfm.AaT();
                if (zA1K || objAaT == C78N.A00) {
                    objAaT = new ConnectionsComponentsKt$ConnectionsSuggestionRow$1$2$1(connectionsLogContext, i);
                    bfm.Ai0(objAaT);
                }
                Function0 function02 = (Function0) objAaT;
                boolean zA1B = (i10 == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass005.A1B(iA05) | (i8 == 4 || ((iA05 & 8) != 0 && bfm.A67(pairsSuggestion)));
                Object objAaT2 = bfm.AaT();
                if (zA1B || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsComponentsKt$ConnectionsSuggestionRow$1$3$1(connectionsLogContext, g0u2, pairsSuggestion);
                    bfm.Ai0(objAaT2);
                }
                Function0 function03 = (Function0) objAaT2;
                boolean zA1J = (i10 == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass005.A1J(iA05);
                if (i8 != 4 && ((iA05 & 8) == 0 || !bfm.A67(pairsSuggestion))) {
                    z3 = false;
                }
                boolean z4 = zA1J | z3;
                Object objAaT3 = bfm.AaT();
                if (z4 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConnectionsComponentsKt$ConnectionsSuggestionRow$1$4$1(connectionsLogContext, g0u3, pairsSuggestion);
                    bfm.Ai0(objAaT3);
                }
                ConnectionsSentMenu(z2, function02, function03, (Function0) objAaT3, null, bfm, (iA05 >> 12) & 14, 16);
            } else {
                bfm.AgE(267081694);
                ConnectionsSuggestionAction(pairsSuggestion, z2, connectionsLogContext, i, g0u, null, bfm, AnonymousClass002.A08(iA05 << 3, i9 | ((iA05 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i5 << 6)) | (i6 & 57344), 32);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128222(pairsSuggestion, connectionsLogContext, i, z, z2, g0u, g0u2, g0u3, bRgA0Q, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConnectionsSuggestionSubtitle(com.facebook.aura.pairs.PairsSuggestion r24, boolean r25, X.BRg r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsComponentsKt.ConnectionsSuggestionSubtitle(com.facebook.aura.pairs.PairsSuggestion, boolean, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* renamed from: PairsSearchField-wBJOh4Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1651PairsSearchFieldwBJOh4Y(java.lang.String r38, X.G0U<? super java.lang.String, kotlin.Unit> r39, X.BRg r40, java.lang.String r41, long r42, long r44, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsComponentsKt.m1651PairsSearchFieldwBJOh4Y(java.lang.String, X.G0U, X.BRg, java.lang.String, long, long, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[PHI: r20
  0x0052: PHI (r20v1 boolean) = (r20v0 boolean), (r20v5 boolean) binds: [B:18:0x0048, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: PairsSuggestionAvatar-6a0pyJM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1652PairsSuggestionAvatar6a0pyJM(com.facebook.aura.pairs.PairsSuggestion r25, X.BRg r26, float r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsComponentsKt.m1652PairsSuggestionAvatar6a0pyJM(com.facebook.aura.pairs.PairsSuggestion, X.BRg, float, X.BFM, int, int):void");
    }

    public static final PairsSourceBadge badge(PairsSuggestionSource pairsSuggestionSource) {
        B6A b6aA04;
        int i;
        int iOrdinal = pairsSuggestionSource.ordinal();
        if (iOrdinal == 0) {
            b6aA04 = C60P.A04(AuraBrandIconTintsKt.MetaBlue);
            i = R.drawable.facebook_outline_24_wght400;
        } else if (iOrdinal == 2) {
            b6aA04 = C60P.A04(AuraBrandIconTintsKt.MetaBlue);
            i = R.drawable.messenger_outline_24_wght400;
        } else {
            if (iOrdinal == 1) {
                return new PairsSourceBadge(R.drawable.instagram_outline_24_wght400, null, true, 11.0f);
            }
            if (iOrdinal != 3) {
                throw C3cG.A0q();
            }
            b6aA04 = null;
            i = R.drawable.instagramthreads_outline_24_wght400;
        }
        return new PairsSourceBadge(i, b6aA04, false, 11.0f);
    }
}
