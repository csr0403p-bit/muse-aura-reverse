package com.facebook.aura.settings;

import X.AFz;
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
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C0v5;
import X.C1515AkP;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAppsSectionKt {

    /* renamed from: com.facebook.aura.settings.HatchAppsSectionKt$AppDeviceRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NodeListEntry $device;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NodeListEntry nodeListEntry) {
            super(2);
            this.$device = nodeListEntry;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            String strA0g;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                NodeListEntry nodeListEntry = this.$device;
                Integer numAppPlatformNameRes = HatchConnectedDeviceSectionsKt.appPlatformNameRes(nodeListEntry.platform);
                if (numAppPlatformNameRes == null) {
                    AnonymousClass003.A0l(bfm, 670140797);
                    strA0g = null;
                } else {
                    strA0g = AnonymousClass003.A0g(bfm, numAppPlatformNameRes, 670140798);
                    AnonymousClass001.A1D(bfm);
                }
                HatchDeviceRowPartsKt.DeviceStatusLine(nodeListEntry, strA0g, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchAppsSectionKt$AppDeviceRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NodeListEntry $device;
        public final /* synthetic */ boolean $isCurrentDevice;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(NodeListEntry nodeListEntry, boolean z, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$device = nodeListEntry;
            this.$isCurrentDevice = z;
            this.$onDeviceClick = g0u;
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
            HatchAppsSectionKt.AppDeviceRow(this.$device, this.$isCurrentDevice, this.$onDeviceClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchAppsSectionKt$AppsSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
        public final /* synthetic */ ConnectedDeviceSections $sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ConnectedDeviceSections connectedDeviceSections, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sections = connectedDeviceSections;
            this.$onDeviceClick = g0u;
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
            HatchAppsSectionKt.AppsSection(this.$sections, this.$onDeviceClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchAppsSectionKt$AppsSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
        public final /* synthetic */ ConnectedDeviceSections $sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ConnectedDeviceSections connectedDeviceSections, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sections = connectedDeviceSections;
            this.$onDeviceClick = g0u;
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
            HatchAppsSectionKt.AppsSection(this.$sections, this.$onDeviceClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchAppsSectionKt$ShowInactiveAppsRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C134742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $inactiveCount;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134742(int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$inactiveCount = i;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAppsSectionKt.ShowInactiveAppsRow(this.$inactiveCount, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchAppsSectionKt$ThisDeviceSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C134752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<NodeListEntry> $devices;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C134752(AHD<NodeListEntry> ahd, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$devices = ahd;
            this.$onDeviceClick = g0u;
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
            HatchAppsSectionKt.ThisDeviceSection(this.$devices, this.$onDeviceClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AppDeviceRow(NodeListEntry nodeListEntry, boolean z, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-88225459);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, nodeListEntry) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int iDeviceIconRes = HatchDeviceRowPartsKt.deviceIconRes(nodeListEntry);
            String str = nodeListEntry.displayName;
            if (str.length() == 0) {
                str = nodeListEntry.nodeId;
            }
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass2(nodeListEntry), 1071493638);
            boolean zA1C = AnonymousClass003.A1C(iA0T) | bfm.A67(nodeListEntry) | ((iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchAppsSectionKt$AppDeviceRow$3$1(nodeListEntry, z, g0u);
                bfm.Ai0(objAaT);
            }
            HatchDeviceRowPartsKt.DeviceRowCard(iDeviceIconRes, str, b1uA00, AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(bRg2, (Function0) objAaT, null, 0, null), false, bfm, 384, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(nodeListEntry, z, g0u, bRg2, i, i2);
        }
    }

    public static final void AppsSection(ConnectedDeviceSections connectedDeviceSections, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(connectedDeviceSections, g0u);
        bfm.AgG(-1326720864);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectedDeviceSections, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (connectedDeviceSections.apps.isEmpty() && connectedDeviceSections.inactiveApps.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(connectedDeviceSections, g0u, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchAppsSectionKt$AppsSection$showInactive$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT, objArr);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i4);
            C90l c90l = C90l.A00;
            AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207ad), null, null, bfm, 48, 4);
            boolean zA65 = bfm.A65(mutableState) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(connectedDeviceSections))) | AnonymousClass001.A1N(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchAppsSectionKt$AppsSection$2$1$1(connectedDeviceSections, mutableState, g0u);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass007.A0o(c90l, bfm, objAaT2);
            C01N.A04(bfm, bbi, BRg.A00, AuraDimensKt.SpacingMedium, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(connectedDeviceSections, g0u, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final void ShowInactiveAppsRow(int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(281670542);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass006.A0O(C0v5.A04(AnonymousClass001.A0R(bRg2), new C1YD(0), null, function0, true)), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingMicroPlusNano), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f100023), null, C06G.A07(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207b0), AnonymousClass001.A0O(c90m, BRg.A00, false), C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134742(i, function0, bRg2, i2, i3);
        }
    }

    public static final void ThisDeviceSection(AHD<NodeListEntry> ahd, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        boolean zA1a = AnonymousClass002.A1a(ahd, g0u);
        bfm.AgG(-2102539855);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            AnonymousClass007.A0j(bfm, R.string._name_removed__res_0x7f1207c4);
            boolean zA67 = bfm.A67(ahd) | AnonymousClass001.A1N(iA0T);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchAppsSectionKt$ThisDeviceSection$1$1$1(ahd, g0u);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0o(c90l, bfm, objAaT);
            C01N.A04(bfm, bbi, BRg.A00, AuraDimensKt.SpacingMedium, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134752(ahd, g0u, bRg, i, i2);
        }
    }
}
