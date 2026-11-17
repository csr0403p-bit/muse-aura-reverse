package com.facebook.aura.agentpermission;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AII;
import X.AIM;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class PermissionModeContextMenuKt {
    public static final AHH<ConnectorPermissionMode> DEFAULT_PERMISSION_MODE_OPTIONS = AGI.A0E(ConnectorPermissionMode.ALLOW, ConnectorPermissionMode.ASK, ConnectorPermissionMode.DENY);
    public static final int RESET_MENU_ITEM_ID = -2;
    public static final int REVOKE_MENU_ITEM_ID = -1;

    /* renamed from: com.facebook.aura.agentpermission.PermissionModeContextMenuKt$PermissionModeContextMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHD<ConnectorPermissionMode> $modes;
        public final /* synthetic */ Function0<Unit> $onResetToDefault;
        public final /* synthetic */ Function0<Unit> $onRevoke;
        public final /* synthetic */ String $resetLabel;
        public final /* synthetic */ String $revokeLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<? extends ConnectorPermissionMode> ahd, Function0<Unit> function0, String str, Function0<Unit> function02, String str2) {
            super(2);
            this.$modes = ahd;
            this.$onResetToDefault = function0;
            this.$resetLabel = str;
            this.$onRevoke = function02;
            this.$revokeLabel = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(1246925892);
            Iterable<ConnectorPermissionMode> iterable = this.$modes;
            Function0<Unit> function0 = this.$onResetToDefault;
            String str = this.$resetLabel;
            Function0<Unit> function02 = this.$onRevoke;
            String str2 = this.$revokeLabel;
            AII aiiA17 = AIM.A17();
            bfm.AgE(-90757);
            if (iterable == null) {
                iterable = PermissionModeContextMenuKt.DEFAULT_PERMISSION_MODE_OPTIONS;
            }
            for (ConnectorPermissionMode connectorPermissionMode : iterable) {
                aiiA17.add(new AuraContextMenuItem(connectorPermissionMode.ordinal(), PermissionModeContextMenuKt.permissionModeShortLabel(connectorPermissionMode, bfm, 0), null, null, null, null, false, false, false, true, false, BRg.A00, 1, 1));
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (function0 != null) {
                aiiA17.add(new AuraContextMenuItem(-2, str, null, null, null, null, false, false, false, true, false, BRg.A00, 1, 1));
            }
            if (function02 != null) {
                aiiA17.add(new AuraContextMenuItem(-1, str2, null, null, null, null, false, false, false, true, true, BRg.A00, 1, 1));
            }
            AHH ahhA0C = AGI.A0C(AIM.A18(aiiA17));
            BBI.A0R(bbi, false);
            return ahhA0C;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PermissionModeContextMenuKt$PermissionModeContextMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ AHD<ConnectorPermissionMode> $modes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissMenu;
        public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;
        public final /* synthetic */ Function0<Unit> $onResetToDefault;
        public final /* synthetic */ Function0<Unit> $onRevoke;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BRg bRg, boolean z, AHD<? extends ConnectorPermissionMode> ahd, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super ConnectorPermissionMode, Unit> g0u, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$expanded = z;
            this.$modes = ahd;
            this.$onRevoke = function0;
            this.$onResetToDefault = function02;
            this.$onDismissMenu = function03;
            this.$onModeSelected = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PermissionModeContextMenuKt.PermissionModeContextMenu(this.$modifier, this.$expanded, this.$modes, this.$onRevoke, this.$onResetToDefault, this.$onDismissMenu, this.$onModeSelected, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String permissionModeShortLabel(ConnectorPermissionMode connectorPermissionMode, BFM bfm, int i) {
        int i2;
        int iA0M = AnonymousClass003.A0M(connectorPermissionMode);
        if (iA0M == -1) {
            bfm.AgE(969502653);
            i2 = R.string._name_removed__res_0x7f120132;
        } else if (iA0M == 0) {
            bfm.AgE(969492355);
            i2 = R.string._name_removed__res_0x7f12012e;
        } else if (iA0M == 1) {
            bfm.AgE(969496161);
            i2 = R.string._name_removed__res_0x7f12012f;
        } else {
            if (iA0M != 2) {
                throw AnonymousClass005.A0k(bfm, 969490724);
            }
            bfm.AgE(969499938);
            i2 = R.string._name_removed__res_0x7f120131;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorPermissionMode.values().length];
            try {
                AnonymousClass002.A13(ConnectorPermissionMode.ALLOW, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectorPermissionMode.ASK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectorPermissionMode.DENY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void PermissionModeContextMenu(BRg bRg, boolean z, AHD<? extends ConnectorPermissionMode> ahd, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super ConnectorPermissionMode, Unit> g0u, BFM bfm, int i, int i2) {
        AHD<? extends ConnectorPermissionMode> ahd2 = ahd;
        Function0<Unit> function04 = function0;
        Function0<Unit> function05 = function02;
        BRg bRg2 = bRg;
        AnonymousClass003.A0z(function03, g0u);
        bfm.AgG(-1682623092);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, ahd2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function04);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function05);
        }
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function03);
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                ahd2 = null;
            }
            if (i5 != 0) {
                function04 = null;
            }
            if (i6 != 0) {
                function05 = null;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120137);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120134);
            long jA0B = AnonymousClass007.A0B(0.0f, 24.0f);
            boolean zA1Y = AnonymousClass006.A1Y(3670016, iA0d) | AnonymousClass007.A1H(iA0d) | AnonymousClass004.A1M(iA0d) | AnonymousClass005.A1L(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new PermissionModeContextMenuKt$PermissionModeContextMenu$1$1(function03, function04, function05, g0u);
                bfm.Ai0(objAaT);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRg2, (G0U) objAaT, function03, z, null, jA0B, null, false, new AnonymousClass2(ahd2, function05, strA012, function04, strA01), false, null, null, null, false, bfm, (iA0d & 14) | 196608 | ((iA0d >> 9) & 896) | ((iA0d << 6) & 7168), 0, 16080);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, z, ahd2, function04, function05, function03, g0u, i, i2);
        }
    }
}
