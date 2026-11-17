package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1YL;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.FXS;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.commands.core.TelephonyFeatureUtils;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.nodes.json.DevicePresence;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.settings.ConnectedDevicesUiState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupSize;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchDeviceDetailsScreenKt {
    public static final String DEVICE_DETAILS_TAG = "HatchDeviceDetails";
    public static final String WEARABLES_CONNECTOR_ID = "wearables";

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$DeviceInfoSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NodeListEntry $device;
        public final /* synthetic */ boolean $isCurrentDevice;
        public final /* synthetic */ boolean $showOs;
        public final /* synthetic */ C07C $this_DeviceInfoSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C07C c07c, NodeListEntry nodeListEntry, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$this_DeviceInfoSection = c07c;
            this.$device = nodeListEntry;
            this.$isCurrentDevice = z;
            this.$showOs = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.DeviceInfoSection(this.$this_DeviceInfoSection, this.$device, this.$isCurrentDevice, this.$showOs, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ NodeListEntry $device;
        public final /* synthetic */ String $displayName;
        public final /* synthetic */ boolean $isCurrentDevice;
        public final /* synthetic */ ConnectedDevicesUiState.Loaded $loadedState;
        public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;
        public final /* synthetic */ boolean $needsRepair;
        public final /* synthetic */ String $nodeId;
        public final /* synthetic */ String $normalizedNodeId;
        public final /* synthetic */ Function0<Unit> $onPairAgainClick;
        public final /* synthetic */ G0U<PermissionDestination, Unit> $onPermissionClick;
        public final /* synthetic */ boolean $showHatchLinks;
        public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(NodeListEntry nodeListEntry, boolean z, boolean z2, Function0<Unit> function0, String str, boolean z3, ConnectedDevicesUiState.Loaded loaded, G0U<? super PermissionDestination, Unit> g0u, G0U<? super PermissionDestination, Unit> g0u2, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, String str2, String str3) {
            super(4);
            this.$device = nodeListEntry;
            this.$showHatchLinks = z;
            this.$needsRepair = z2;
            this.$onPairAgainClick = function0;
            this.$nodeId = str;
            this.$isCurrentDevice = z3;
            this.$loadedState = loaded;
            this.$managePermission = g0u;
            this.$onPermissionClick = g0u2;
            this.$viewModel = hatchConnectedDevicesViewModel;
            this.$normalizedNodeId = str2;
            this.$displayName = str3;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1950invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x026b  */
        /* JADX WARN: Type inference failed for: r44v0, types: [X.BFM] */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1950invokei1RSzL4(float r42, float r43, X.BFM r44, int r45) {
            /*
                Method dump skipped, instructions count: 657
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceDetailsScreenKt.AnonymousClass7.m1950invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $displayName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $nodeId;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onPairAgainClick;
        public final /* synthetic */ G0U<PermissionDestination, Unit> $onPermissionClick;
        public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(String str, String str2, Function0<Unit> function0, G0U<? super PermissionDestination, Unit> g0u, Function0<Unit> function02, BRg bRg, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, int i, int i2) {
            super(2);
            this.$nodeId = str;
            this.$displayName = str2;
            this.$onBack = function0;
            this.$onPermissionClick = g0u;
            this.$onPairAgainClick = function02;
            this.$modifier = bRg;
            this.$viewModel = hatchConnectedDevicesViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.HatchDeviceDetailsScreen(this.$nodeId, this.$displayName, this.$onBack, this.$onPermissionClick, this.$onPairAgainClick, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchLinkRepairSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135252 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onRepairClick;
        public final /* synthetic */ C07C $this_HatchLinkRepairSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135252(C07C c07c, Function0<Unit> function0, int i) {
            super(2);
            this.$this_HatchLinkRepairSection = c07c;
            this.$onRepairClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.HatchLinkRepairSection(this.$this_HatchLinkRepairSection, this.$onRepairClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchLinkUnpairSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ String $disconnectLabel;
        public final /* synthetic */ Function0<Unit> $onConfirmUnpair;
        public final /* synthetic */ MutableState<Boolean> $showConfirm$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135262(String str, Function0<Unit> function0, String str2, MutableState<Boolean> mutableState) {
            super(2);
            this.$disconnectLabel = str;
            this.$onConfirmUnpair = function0;
            this.$cancelLabel = str2;
            this.$showConfirm$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1R(bfm, this.$onConfirmUnpair, bfm.A65(this.$disconnectLabel)));
                String str = this.$disconnectLabel;
                String str2 = this.$cancelLabel;
                Function0<Unit> function0 = this.$onConfirmUnpair;
                MutableState<Boolean> mutableState = this.$showConfirm$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchDeviceDetailsScreenKt$HatchLinkUnpairSection$2$1$1(str, str2, function0, mutableState);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchLinkUnpairSection$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $deviceName;
        public final /* synthetic */ Function0<Unit> $onConfirmUnpair;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$deviceName = str;
            this.$onConfirmUnpair = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.HatchLinkUnpairSection(this.$deviceName, this.$onConfirmUnpair, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchSettingsValueRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$title = str;
            this.$value = str2;
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.HatchSettingsValueRow(this.$title, this.$value, this.$modifier, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$ManageDeviceSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $nodeId;
        public final /* synthetic */ C07C $this_ManageDeviceSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135272(C07C c07c, String str, int i) {
            super(2);
            this.$this_ManageDeviceSection = c07c;
            this.$nodeId = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.ManageDeviceSection(this.$this_ManageDeviceSection, this.$nodeId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$PermissionSummaryRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LocationSharingMode $locationMode;
        public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;
        public final /* synthetic */ G0U<Boolean, Unit> $onRunInBackgroundChange;
        public final /* synthetic */ Function0<Unit> $onSecondaryClick;
        public final /* synthetic */ BO6<PermissionDestination, Boolean> $permissionStates;
        public final /* synthetic */ PermissionSummaryRowModel $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(PermissionSummaryRowModel permissionSummaryRowModel, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, G0U<? super PermissionDestination, Unit> g0u, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u2, int i) {
            super(2);
            this.$row = permissionSummaryRowModel;
            this.$permissionStates = bo6;
            this.$locationMode = locationSharingMode;
            this.$managePermission = g0u;
            this.$onSecondaryClick = function0;
            this.$onRunInBackgroundChange = g0u2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.PermissionSummaryRow(this.$row, this.$permissionStates, this.$locationMode, this.$managePermission, this.$onSecondaryClick, this.$onRunInBackgroundChange, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$PermissionSummarySection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LocationSharingMode $locationMode;
        public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;
        public final /* synthetic */ G0U<PermissionDestination, Unit> $onPermissionClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onRunInBackgroundChange;
        public final /* synthetic */ BO6<PermissionDestination, Boolean> $permissionStates;
        public final /* synthetic */ C07C $this_PermissionSummarySection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135282(C07C c07c, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, G0U<? super PermissionDestination, Unit> g0u, G0U<? super PermissionDestination, Unit> g0u2, G0U<? super Boolean, Unit> g0u3, int i) {
            super(2);
            this.$this_PermissionSummarySection = c07c;
            this.$permissionStates = bo6;
            this.$locationMode = locationSharingMode;
            this.$managePermission = g0u;
            this.$onPermissionClick = g0u2;
            this.$onRunInBackgroundChange = g0u3;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceDetailsScreenKt.PermissionSummarySection(this.$this_PermissionSummarySection, this.$permissionStates, this.$locationMode, this.$managePermission, this.$onPermissionClick, this.$onRunInBackgroundChange, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$SettingsValueRowContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C135292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showChevron;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135292(String str, String str2, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$value = str2;
            this.$showChevron = z;
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
            HatchDeviceDetailsScreenKt.SettingsValueRowContent(this.$title, this.$value, this.$showChevron, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LocationSharingMode.values().length];
            try {
                AnonymousClass005.A0v(LocationSharingMode.NEVER, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocationSharingMode.WHEN_CHATTING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocationSharingMode.ALWAYS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PermissionDestination.values().length];
            try {
                AnonymousClass005.A0v(PermissionDestination.LOCATION, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DeviceInfoSection(X.C07C r21, com.facebook.aura.nodes.json.NodeListEntry r22, boolean r23, boolean r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceDetailsScreenKt.DeviceInfoSection(X.07C, com.facebook.aura.nodes.json.NodeListEntry, boolean, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchDeviceDetailsScreen(java.lang.String r60, java.lang.String r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.G0U<? super com.facebook.aura.navigation.key.PermissionDestination, kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, X.BRg r65, com.facebook.aura.settings.HatchConnectedDevicesViewModel r66, X.BFM r67, int r68, int r69) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceDetailsScreenKt.HatchDeviceDetailsScreen(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.settings.HatchConnectedDevicesViewModel, X.BFM, int, int):void");
    }

    public static final void SettingsValueRowContent(String str, String str2, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1734980605);
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
            iA0d |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0V = AnonymousClass001.A0V(AnonymousClass001.A0R(bRgA0Q), 56.0f);
            float f = AuraDimensKt.SpacingLarge;
            float f2 = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgA0V, f, f2, f2, f2);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f2);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, bRgAiP, C06G.A0I(bfm, akh), c1822ArmA0T, null, null, new C1YL(6), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16304);
            if (z) {
                bfm.AgE(-715833318);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24, 0), AuraIconSize.TINY, null, ColorExtKt.m2544applyContentAlphaek8zF_U(AnonymousClass001.A0f(bfm, akh).tertiaryText, bfm, 0), null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(-715518885);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135292(str, str2, z, bRgA0Q, i, i2);
        }
    }

    public static final String permissionDestinationSummary(PermissionDestination permissionDestination, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, BFM bfm, int i) {
        String strPermissionEnabledSummary;
        int i2;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        if (permissionDestination.ordinal() == 0) {
            int iA0B = AnonymousClass005.A0B(bfm, locationSharingMode, 2088760041);
            if (iA0B == 0) {
                bfm.AgE(1037212400);
                i2 = R.string._name_removed__res_0x7f120f18;
            } else if (iA0B == 1) {
                bfm.AgE(1037216184);
                i2 = R.string._name_removed__res_0x7f120f1b;
            } else {
                if (iA0B != 2) {
                    throw AnonymousClass005.A0k(bfm, 1037210681);
                }
                bfm.AgE(1037219473);
                i2 = R.string._name_removed__res_0x7f120f14;
            }
            strPermissionEnabledSummary = AnonymousClass003.A0e(bfm, i2);
        } else {
            bfm.AgE(1037222044);
            Boolean bool = bo6.get(permissionDestination);
            strPermissionEnabledSummary = permissionEnabledSummary(bool != null ? bool.booleanValue() : false, bfm, 0);
        }
        AnonymousClass001.A1D(bfm);
        return strPermissionEnabledSummary;
    }

    public static final String permissionEnabledSummary(boolean z, BFM bfm, int i) {
        int i2;
        if (z) {
            bfm.AgE(-1900694649);
            i2 = R.string._name_removed__res_0x7f120f41;
        } else {
            bfm.AgE(-1900616250);
            i2 = R.string._name_removed__res_0x7f120f40;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public static final List<PermissionSummaryRowModel> permissionSummaryRows(Context context) {
        PermissionSummaryRowModel permissionSummaryRowModel = new PermissionSummaryRowModel(PermissionDestination.BLUETOOTH, Build.VERSION.SDK_INT >= 31);
        PermissionSummaryRowModel permissionSummaryRowModel2 = new PermissionSummaryRowModel(PermissionDestination.CALENDAR, true);
        PermissionDestination permissionDestination = PermissionDestination.CALL_LOG;
        TelephonyFeatureUtils telephonyFeatureUtils = TelephonyFeatureUtils.INSTANCE;
        return Arrays.asList(permissionSummaryRowModel, permissionSummaryRowModel2, new PermissionSummaryRowModel(permissionDestination, telephonyFeatureUtils.hasCalling(context)), new PermissionSummaryRowModel(PermissionDestination.CONTACTS, true), new PermissionSummaryRowModel(PermissionDestination.LOCATION, true), new PermissionSummaryRowModel(PermissionDestination.MESSAGES, telephonyFeatureUtils.hasMessaging(context)), new PermissionSummaryRowModel(PermissionDestination.MICROPHONE, true), new PermissionSummaryRowModel(PermissionDestination.PHONE, telephonyFeatureUtils.hasCalling(context)), new PermissionSummaryRowModel(PermissionDestination.PHONE_NOTIFICATIONS, true), new PermissionSummaryRowModel(PermissionDestination.RUN_IN_BACKGROUND, true));
    }

    public static final void HatchLinkRepairSection(C07C c07c, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1968287109);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            boolean zA1O = AnonymousClass001.A1O(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchDeviceDetailsScreenKt$HatchLinkRepairSection$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135252(c07c, function0, i);
        }
    }

    public static final void HatchLinkUnpairSection(String str, Function0<Unit> function0, BFM bfm, int i) {
        String strA0t;
        bfm.AgG(-954977688);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b5a);
            AuraButtonGroupSize auraButtonGroupSize = AuraButtonGroupSize.MEDIUM;
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchDeviceDetailsScreenKt$HatchLinkUnpairSection$1$1(strA01, mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, auraButtonGroupSize, true, (G0U) objAaT2, bfm, 14155776, 63);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(123531428);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b5b);
                if (C7BY.A0j(str)) {
                    bfm.AgE(123774747);
                    strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b0b);
                } else {
                    bfm.AgE(123877977);
                    String strA04 = FXS.A03().A04(str);
                    C7384Etj.A0U(strA04);
                    strA0t = AnonymousClass001.A0t(bfm, strA04, R.string._name_removed__res_0x7f120b0a);
                }
                AnonymousClass001.A1D(bfm);
                B1U b1uA00 = B1V.A00(bfm, new C135262(strA01, function0, strA012, mutableState), 576990268);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = new HatchDeviceDetailsScreenKt$HatchLinkUnpairSection$3$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA013, strA0t, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT3, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 1769472, 0, 1945);
            } else {
                bfm.AgE(124444378);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[PHI: r13
  0x0062: PHI (r13v3 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r13v2 kotlin.jvm.functions.Function0<kotlin.Unit>), (r13v5 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:19:0x003a, B:21:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSettingsValueRow(java.lang.String r10, java.lang.String r11, X.BRg r12, kotlin.jvm.functions.Function0<kotlin.Unit> r13, X.BFM r14, int r15, int r16) {
        /*
            r0 = -1141373126(0xffffffffbbf8073a, float:-0.007569221)
            r9 = r14
            r14.AgG(r0)
            r14 = r15
            r0 = r15 & 6
            r5 = r10
            if (r0 != 0) goto L7d
            int r2 = X.AnonymousClass004.A0d(r9, r10)
            r2 = r2 | r15
        L12:
            r0 = r15 & 48
            r6 = r11
            if (r0 != 0) goto L1c
            int r0 = X.AnonymousClass004.A0e(r9, r11)
            r2 = r2 | r0
        L1c:
            r15 = r16
            r3 = r16 & 4
            if (r3 == 0) goto L73
            r2 = r2 | 384(0x180, float:5.38E-43)
        L24:
            r1 = r16 & 8
            r4 = r13
            if (r1 == 0) goto L69
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L2b:
            boolean r0 = X.AnonymousClass004.A1L(r2)
            boolean r0 = X.AnonymousClass001.A1b(r0, r9, r2)
            if (r0 == 0) goto L65
            if (r3 == 0) goto L39
            X.BS0 r12 = X.BRg.A00
        L39:
            r13 = 0
            if (r1 != 0) goto L62
            r13 = r4
            if (r4 == 0) goto L62
            r0 = 0
            X.1YD r3 = new X.1YD
            r3.<init>(r0)
            r1 = 0
            r0 = 1
            X.BRg r8 = X.C0v5.A04(r12, r3, r1, r4, r0)
            r7 = 1
        L4c:
            r10 = r2 & 126(0x7e, float:1.77E-43)
            r11 = 0
            SettingsValueRowContent(r5, r6, r7, r8, r9, r10, r11)
        L52:
            X.BBb r0 = r9.AAc()
            if (r0 == 0) goto L61
            com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchSettingsValueRow$1 r9 = new com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchSettingsValueRow$1
            r10 = r5
            r11 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A06 = r9
        L61:
            return
        L62:
            r8 = r12
            r7 = 0
            goto L4c
        L65:
            r9.Afo()
            goto L52
        L69:
            r0 = r14 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L2b
            int r0 = X.AnonymousClass004.A0W(r9, r13)
            r2 = r2 | r0
            goto L2b
        L73:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L24
            int r0 = X.AnonymousClass004.A0f(r9, r12)
            r2 = r2 | r0
            goto L24
        L7d:
            r2 = r15
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceDetailsScreenKt.HatchSettingsValueRow(java.lang.String, java.lang.String, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void ManageDeviceSection(C07C c07c, String str, BFM bfm, int i) {
        bfm.AgG(-67898694);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA1S = AnonymousClass001.A1S(bfm, contextA0H, AnonymousClass001.A1O(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new HatchDeviceDetailsScreenKt$ManageDeviceSection$1$1(str, contextA0H);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135272(c07c, str, i);
        }
    }

    public static final void PermissionSummaryRow(PermissionSummaryRowModel permissionSummaryRowModel, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, G0U<? super PermissionDestination, Unit> g0u, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u2, BFM bfm, int i) {
        bfm.AgG(174580492);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, permissionSummaryRowModel) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bo6);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, locationSharingMode);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            PermissionDestination permissionDestination = permissionSummaryRowModel.destination;
            if (permissionDestination == PermissionDestination.LOCATION) {
                bfm.AgE(-277383883);
                String strPermissionDestinationTitle = PermissionDetailScreenKt.permissionDestinationTitle(permissionDestination, bfm, 0);
                String strPermissionDestinationSummary = permissionDestinationSummary(permissionDestination, bo6, locationSharingMode, bfm, iA0d & 1008);
                C1062ATq c1062ATq = C10G.A02;
                boolean zA1U = AnonymousClass002.A1U(bfm, permissionDestination) | ((iA0d & 57344) == 16384);
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new HatchDeviceDetailsScreenKt$PermissionSummaryRow$1$1(permissionDestination, function0);
                    bfm.Ai0(objAaT);
                }
                HatchSettingsValueRow(strPermissionDestinationTitle, strPermissionDestinationSummary, c1062ATq, (Function0) objAaT, bfm, 384, 0);
            } else {
                bfm.AgE(-276693141);
                AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
                C1062ATq c1062ATq2 = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                String strPermissionDestinationTitle2 = PermissionDetailScreenKt.permissionDestinationTitle(permissionDestination, bfm, 0);
                C0953AJg c0953AJgA00 = C0953AJg.A00();
                long j = B6A.A07;
                AuraCardContent auraCardContent = new AuraCardContent(strPermissionDestinationTitle2, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null);
                Boolean bool = bo6.get(permissionDestination);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                boolean zA1U2 = AnonymousClass002.A1U(bfm, permissionDestination) | AnonymousClass007.A1H(iA0d) | AnonymousClass004.A1M(iA0d);
                Object objAaT2 = bfm.AaT();
                if (zA1U2 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchDeviceDetailsScreenKt$PermissionSummaryRow$2$1(permissionDestination, g0u2, g0u);
                    bfm.Ai0(objAaT2);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq2, auraCardStyleCardStyleForSettings, auraCardContent, toggle, null, null, null, boolValueOf, (G0U) objAaT2, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 261744);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(permissionSummaryRowModel, bo6, locationSharingMode, g0u, function0, g0u2, i);
        }
    }

    public static final void PermissionSummarySection(C07C c07c, BO6<PermissionDestination, Boolean> bo6, LocationSharingMode locationSharingMode, G0U<? super PermissionDestination, Unit> g0u, G0U<? super PermissionDestination, Unit> g0u2, G0U<? super Boolean, Unit> g0u3, BFM bfm, int i) {
        bfm.AgG(198601228);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bo6);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, locationSharingMode);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = permissionSummaryRows(contextA0H);
                bfm.Ai0(objAaT);
            }
            List list = (List) objAaT;
            boolean zA67 = bfm.A67(list) | AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1F(57344, iA0d, 16384) | ((458752 & iA0d) == 131072);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchDeviceDetailsScreenKt$PermissionSummarySection$1$1(list, bo6, locationSharingMode, g0u, g0u2, g0u3);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT2, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135282(c07c, bo6, locationSharingMode, g0u, g0u2, g0u3, i);
        }
    }

    public static final String formatLastSeen(NodeListEntry nodeListEntry, BFM bfm, int i) {
        BBI bbi;
        boolean z;
        String string;
        bfm.AgE(-1286011596);
        if ((nodeListEntry != null ? nodeListEntry.getPresence() : null) == DevicePresence.ONLINE) {
            bfm.AgE(-463072636);
            string = AbstractC2271BQs.A01(bfm, R.string.device_details_last_seen_now);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
        } else {
            bfm.AgE(-463001522);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
            if (nodeListEntry == null || (string = nodeListEntry.lastSeenAt) == null) {
                BBI.A0R(bbi, false);
                return "\u2014";
            }
            Long lastSeenMs = nodeListEntry.getLastSeenMs();
            if (lastSeenMs != null) {
                string = DateUtils.getRelativeTimeSpanString(lastSeenMs.longValue(), System.currentTimeMillis(), 60000L).toString();
            }
        }
        BBI.A0R(bbi, z);
        return string;
    }
}
