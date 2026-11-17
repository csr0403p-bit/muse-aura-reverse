package com.facebook.aura.agentpermission.pastapprovals;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ActivePermissionRowKt {

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionAction$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $menuExpanded;
        public final /* synthetic */ ConnectorPermissionMode $mode;
        public final /* synthetic */ String $modeLabel;
        public final /* synthetic */ AHD<ConnectorPermissionMode> $modeOptions;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDismissMenu;
        public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;
        public final /* synthetic */ Function0<Unit> $onRevoke;
        public final /* synthetic */ String $permissionTitle;
        public final /* synthetic */ boolean $revocable;
        public final /* synthetic */ boolean $showSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, boolean z, boolean z2, boolean z3, boolean z4, Function0<Unit> function0, Function0<Unit> function02, G0U<? super ConnectorPermissionMode, Unit> g0u, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$permissionTitle = str;
            this.$modeLabel = str2;
            this.$mode = connectorPermissionMode;
            this.$modeOptions = ahd;
            this.$revocable = z;
            this.$enabled = z2;
            this.$showSpinner = z3;
            this.$menuExpanded = z4;
            this.$onClick = function0;
            this.$onDismissMenu = function02;
            this.$onModeSelected = g0u;
            this.$onRevoke = function03;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionRowKt.ActivePermissionAction(this.$permissionTitle, this.$modeLabel, this.$mode, this.$modeOptions, this.$revocable, this.$enabled, this.$showSpinner, this.$menuExpanded, this.$onClick, this.$onDismissMenu, this.$onModeSelected, this.$onRevoke, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionActionSpinner$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionRowKt.ActivePermissionActionSpinner(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionDetails$2, reason: invalid class name and case insensitive filesystem */
    public final class C108632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $caption;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108632(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$caption = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionRowKt.ActivePermissionDetails(this.$title, this.$caption, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionModeControl$2, reason: invalid class name and case insensitive filesystem */
    public final class C108642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $label;
        public final /* synthetic */ boolean $menuExpanded;
        public final /* synthetic */ ConnectorPermissionMode $mode;
        public final /* synthetic */ AHD<ConnectorPermissionMode> $modes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDismissMenu;
        public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;
        public final /* synthetic */ Function0<Unit> $onRevoke;
        public final /* synthetic */ String $permissionTitle;
        public final /* synthetic */ boolean $showSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108642(String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, G0U<? super ConnectorPermissionMode, Unit> g0u, Function0<Unit> function03, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$permissionTitle = str;
            this.$label = str2;
            this.$mode = connectorPermissionMode;
            this.$modes = ahd;
            this.$enabled = z;
            this.$showSpinner = z2;
            this.$menuExpanded = z3;
            this.$onClick = function0;
            this.$onDismissMenu = function02;
            this.$onModeSelected = g0u;
            this.$onRevoke = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionRowKt.ActivePermissionModeControl(this.$permissionTitle, this.$label, this.$mode, this.$modes, this.$enabled, this.$showSpinner, this.$menuExpanded, this.$onClick, this.$onDismissMenu, this.$onModeSelected, this.$onRevoke, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionModeLabel$1, reason: invalid class name and case insensitive filesystem */
    public final class C108651 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $label;
        public final /* synthetic */ ConnectorPermissionMode $mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108651(String str, ConnectorPermissionMode connectorPermissionMode, int i) {
            super(2);
            this.$label = str;
            this.$mode = connectorPermissionMode;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionRowKt.ActivePermissionModeLabel(this.$label, this.$mode, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorIconUrl;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isRevoking;
        public final /* synthetic */ boolean $isUpdatingMode;
        public final /* synthetic */ boolean $menuExpanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissMenu;
        public final /* synthetic */ Function0<Unit> $onMenuRequested;
        public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;
        public final /* synthetic */ Function0<Unit> $onRevoke;
        public final /* synthetic */ ActivePermission $permission;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108662(ActivePermission activePermission, String str, boolean z, boolean z2, boolean z3, boolean z4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super ConnectorPermissionMode, Unit> g0u, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$permission = activePermission;
            this.$connectorIconUrl = str;
            this.$enabled = z;
            this.$isRevoking = z2;
            this.$isUpdatingMode = z3;
            this.$menuExpanded = z4;
            this.$onRevoke = function0;
            this.$onMenuRequested = function02;
            this.$onDismissMenu = function03;
            this.$onModeSelected = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionRowKt.ActivePermissionRow(this.$permission, this.$connectorIconUrl, this.$enabled, this.$isRevoking, this.$isUpdatingMode, this.$menuExpanded, this.$onRevoke, this.$onMenuRequested, this.$onDismissMenu, this.$onModeSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionRowContainer$2, reason: invalid class name and case insensitive filesystem */
    public final class C108672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ int $index;
        public final /* synthetic */ int $lastIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108672(int i, int i2, G0V<? super BFM, ? super Integer, Unit> g0v, int i3) {
            super(2);
            this.$index = i;
            this.$lastIndex = i2;
            this.$content = g0v;
            this.$$changed = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionRowKt.ActivePermissionRowContainer(this.$index, this.$lastIndex, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivePermissionRowContainer(int r10, int r11, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r12, X.BFM r13, int r14) {
        /*
            r0 = 2
            X.C7384Etj.A0Y(r12, r0)
            r0 = -1653678222(0xffffffff9d6edf72, float:-3.1614556E-21)
            r13.AgG(r0)
            r0 = r14 & 6
            if (r0 != 0) goto Lb7
            int r7 = X.AnonymousClass004.A0D(r13, r10)
            r7 = r7 | r14
        L13:
            r0 = r14 & 48
            if (r0 != 0) goto L1c
            int r0 = X.AnonymousClass004.A0E(r13, r11)
            r7 = r7 | r0
        L1c:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L25
            int r0 = X.AnonymousClass004.A0V(r13, r12)
            r7 = r7 | r0
        L25:
            r1 = r7 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r4 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r13, r7)
            if (r0 == 0) goto Le1
            X.BS0 r5 = X.BRg.A00
            X.ATq r6 = X.C10G.A02
            com.facebook.aura.vds.compose.theme.AuraTheme r9 = com.facebook.aura.vds.compose.theme.AuraTheme.INSTANCE
            r3 = 6
            com.facebook.aura.vds.compose.theme.AuraColors r0 = r9.getColors(r13, r3)
            long r0 = r0.elevated
            if (r10 != 0) goto L93
            if (r11 != 0) goto L7b
            r2 = -46859250(0xfffffffffd34fc0e, float:-1.5035611E37)
            r13.AgE(r2)
            com.facebook.aura.vds.compose.theme.AuraDimensions r2 = r9.getDimensions(r13, r3)
            float r2 = r2.sectionCornerRadius
            X.1D3 r3 = X.C1D8.A00(r2)
        L55:
            X.BBI r2 = X.C3cG.A07(r13)
        L59:
            X.BRg r0 = X.C1b8.A03(r6, r3, r0)
            X.AiA r9 = X.AnonymousClass002.A0U(r13)
            int r8 = X.AnonymousClass003.A0J(r2)
            X.AKQ r6 = X.BBI.A04(r2)
            X.BRg r3 = X.AxM.A01(r13, r0)
            kotlin.jvm.functions.Function0<X.AkQ> r1 = X.C1515AkP.A00
            X.Ahw<?> r0 = r2.A0V
            if (r0 != 0) goto Lba
            X.C00x.A00()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L7b:
            r2 = -46855029(0xfffffffffd350c8b, float:-1.5040962E37)
            r13.AgE(r2)
            com.facebook.aura.vds.compose.theme.AuraDimensions r2 = r9.getDimensions(r13, r3)
            float r8 = r2.sectionCornerRadius
            com.facebook.aura.vds.compose.theme.AuraDimensions r2 = r9.getDimensions(r13, r3)
            float r3 = r2.sectionCornerRadius
            r2 = 0
            X.1D3 r3 = X.C1D8.A01(r8, r3, r2, r2)
            goto L55
        L93:
            if (r10 != r11) goto Lad
            r2 = -1452216047(0xffffffffa970f111, float:-5.3499797E-14)
            r13.AgE(r2)
            com.facebook.aura.vds.compose.theme.AuraDimensions r2 = r9.getDimensions(r13, r3)
            float r8 = r2.sectionCornerRadius
            com.facebook.aura.vds.compose.theme.AuraDimensions r2 = r9.getDimensions(r13, r3)
            float r3 = r2.sectionCornerRadius
            r2 = 0
            X.1D3 r3 = X.C1D8.A01(r2, r2, r3, r8)
            goto L55
        Lad:
            r2 = -46837696(0xfffffffffd355040, float:-1.5062934E37)
            X.BBI r2 = X.AnonymousClass002.A0M(r13, r2)
            X.1DM r3 = X.C1OM.A00
            goto L59
        Lb7:
            r7 = r14
            goto L13
        Lba:
            X.AnonymousClass005.A0n(r13, r2, r1)
            X.AnonymousClass005.A0p(r13, r9, r6, r3, r8)
            int r0 = r7 >> 6
            X.AnonymousClass003.A13(r13, r12, r0)
            if (r10 >= r11) goto Lda
            r0 = -1209149179(0xffffffffb7edd905, float:-2.835366E-5)
            r13.AgE(r0)
            float r0 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingMedium
            X.BRg r0 = X.C3U4.A07(r5, r0)
            com.facebook.aura.vds.compose.divider.AuraDividerKt.AuraRowDivider(r0, r13, r4, r4)
        Ld6:
            X.AnonymousClass003.A0q(r2)
            goto Le4
        Lda:
            r0 = -1209067494(0xffffffffb7ef181a, float:-2.8502243E-5)
            r13.AgE(r0)
            goto Ld6
        Le1:
            r13.Afo()
        Le4:
            X.BBb r1 = r13.AAc()
            if (r1 == 0) goto Lf1
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionRowContainer$2 r0 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt$ActivePermissionRowContainer$2
            r0.<init>(r10, r11, r12, r14)
            r1.A06 = r0
        Lf1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt.ActivePermissionRowContainer(int, int, X.G0V, X.BFM, int):void");
    }

    public static final boolean isWebsitePermission(ActivePermission activePermission) {
        C7384Etj.A0Y(activePermission, 0);
        ActivePermissionKind activePermissionKind = activePermission.kind;
        return activePermissionKind == ActivePermissionKind.NETWORK_RULE || activePermissionKind == ActivePermissionKind.TRANSIENT_NETWORK_GRANT;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivePermissionIconKey.values().length];
            try {
                AnonymousClass002.A13(ActivePermissionIconKey.NETWORK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ActivePermissionIconKey.BROWSER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ActivePermissionIconKey.DEVICE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ActivePermissionIconKey.MEDIA, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ActivePermissionIconKey.CONNECTOR, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ActivePermissionIconKey.TOOL, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ActivePermissionIconKey.CHECKOUT, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ActivePermissionDetails(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1033434075);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(2.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (str2 == null) {
                bfm.AgE(1217254305);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A05(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1217254306).footnoteRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108632(str, str2, bRg2, i, i2);
        }
    }

    public static final long permissionModeTextColor(ConnectorPermissionMode connectorPermissionMode, BFM bfm, int i) {
        long j = connectorPermissionMode == ConnectorPermissionMode.DENY ? C3cI.A0K(bfm, -1925634706).destructiveText : C3cI.A0K(bfm, -1925633364).secondaryText;
        AnonymousClass002.A19(bfm);
        return j;
    }

    public static final void ActivePermissionActionSpinner(BFM bfm, int i) {
        bfm.AgG(-1948500515);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120133);
            BRg bRgA07 = C10G.A07(BRg.A00, 20.0f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ActivePermissionRowKt$ActivePermissionActionSpinner$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA07, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }

    public static final void ActivePermissionModeLabel(String str, ConnectorPermissionMode connectorPermissionMode, BFM bfm, int i) {
        bfm.AgG(-1166197561);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(connectorPermissionMode));
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, permissionModeTextColor(connectorPermissionMode, bfm, (iA0d >> 3) & 14), C3cH.A0B(bfm, AuraTheme.INSTANCE), null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108651(str, connectorPermissionMode, i);
        }
    }

    public static final int fallbackIconRes(ActivePermission activePermission) {
        if (isWebsitePermission(activePermission)) {
            return R.drawable.globe_search_outline_28;
        }
        ActivePermissionIconKey activePermissionIconKey = activePermission.display.iconKey;
        if (activePermissionIconKey == null) {
            return R.drawable.four_squares_grid_outline_28;
        }
        switch (activePermissionIconKey.ordinal()) {
            case -1:
            case 1:
            case 3:
            case 4:
                return R.drawable.four_squares_grid_outline_28;
            case 0:
                return R.drawable.globe_search_outline_28;
            case 2:
                return R.drawable.globe_outline_28;
            case 5:
                return R.drawable.media_play_wght400_filled_24;
            case 6:
                return R.drawable.phone_android_wght400_outline_24;
            default:
                throw C3cG.A0q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivePermissionAction(java.lang.String r16, java.lang.String r17, com.facebook.aura.agentpermission.ConnectorPermissionMode r18, X.AHD<? extends com.facebook.aura.agentpermission.ConnectorPermissionMode> r19, boolean r20, boolean r21, boolean r22, boolean r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, X.G0U<? super com.facebook.aura.agentpermission.ConnectorPermissionMode, kotlin.Unit> r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt.ActivePermissionAction(java.lang.String, java.lang.String, com.facebook.aura.agentpermission.ConnectorPermissionMode, X.AHD, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivePermissionModeControl(java.lang.String r43, java.lang.String r44, com.facebook.aura.agentpermission.ConnectorPermissionMode r45, X.AHD<? extends com.facebook.aura.agentpermission.ConnectorPermissionMode> r46, boolean r47, boolean r48, boolean r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.G0U<? super com.facebook.aura.agentpermission.ConnectorPermissionMode, kotlin.Unit> r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, X.BRg r54, X.BFM r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt.ActivePermissionModeControl(java.lang.String, java.lang.String, com.facebook.aura.agentpermission.ConnectorPermissionMode, X.AHD, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivePermissionRow(com.facebook.aura.agentpermission.pastapprovals.ActivePermission r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, boolean r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.G0U<? super com.facebook.aura.agentpermission.ConnectorPermissionMode, kotlin.Unit> r36, X.BRg r37, X.BFM r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionRowKt.ActivePermissionRow(com.facebook.aura.agentpermission.pastapprovals.ActivePermission, java.lang.String, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.BRg, X.BFM, int, int, int):void");
    }
}
