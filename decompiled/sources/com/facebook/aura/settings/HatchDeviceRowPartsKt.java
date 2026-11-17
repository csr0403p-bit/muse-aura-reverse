package com.facebook.aura.settings;

import X.AKH;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C07C;
import X.C08R;
import X.C0953AJg;
import X.C0dm;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C2VU;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.nodes.json.DevicePresence;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchDeviceRowPartsKt {
    public static final String VANGUARD_SERIAL_PREFIX = "3Z";

    /* renamed from: com.facebook.aura.settings.HatchDeviceRowPartsKt$DeviceRowCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $iconRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$iconRes = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                int i2 = this.$iconRes;
                AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                HatchDeviceRowPartsKt.m1951DeviceIconSquareWSOZc8o(i2, HatchDeviceRowPartsKt.lineHeightsDp(new C1822Arm[]{AnonymousClass001.A0g(bfm, akh).bodyRegular, C06G.A0a(bfm, akh)}, bfm, 0), null, 0L, 0L, bfm, 0, 28);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceRowPartsKt$DeviceRowCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $showExternalLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z) {
            super(3);
            this.$showExternalLink = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
            invoke(c08r, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C08R c08r, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                boolean z = this.$showExternalLink;
                int i2 = R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24;
                if (z) {
                    i2 = R.drawable.arrow_diagonal_right_up_20;
                }
                AnonymousClass007.A0z(bfm, BOf.A00(bfm, i2, 0), AuraIconSize.TINY, ColorExtKt.m2544applyContentAlphaek8zF_U(C06G.A09(bfm), bfm, 0));
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceRowPartsKt$DeviceRowCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$status = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$status, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceRowPartsKt$DeviceRowCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showExternalLink;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $status;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(int i, String str, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, boolean z, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$title = str;
            this.$status = g0v;
            this.$modifier = bRg;
            this.$showExternalLink = z;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDeviceRowPartsKt.DeviceRowCard(this.$iconRes, this.$title, this.$status, this.$modifier, this.$showExternalLink, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceRowPartsKt$DeviceStatusLine$2, reason: invalid class name and case insensitive filesystem */
    public final class C135302 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $detail;
        public final /* synthetic */ NodeListEntry $device;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135302(NodeListEntry nodeListEntry, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$device = nodeListEntry;
            this.$detail = str;
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
            HatchDeviceRowPartsKt.DeviceStatusLine(this.$device, this.$detail, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final int deviceIconRes(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        if (HatchConnectedDeviceClassificationKt.isMuseCharm(nodeListEntry)) {
            return R.drawable.pendant_device_outline;
        }
        int iA0M = AnonymousClass003.A0M(HatchConnectedDeviceSectionsKt.getGadgetKind(nodeListEntry));
        if (iA0M == -1) {
            return BFI.A0H(new String[]{"ios", "iphone", "ipad", "android"}).contains(AnonymousClass001.A0u(AnonymousClass002.A0l(nodeListEntry.platform))) ? R.drawable.ic_phone_outline_24 : R.drawable.ic_laptop_phone_outline_24;
        }
        if (iA0M == 3) {
            return nodeListEntry.nodeId.toUpperCase(Locale.ROOT).startsWith(VANGUARD_SERIAL_PREFIX) ? R.drawable.ic_oakley_vanguard_outline : R.drawable.ic_smart_glasses_outline;
        }
        if (iA0M == 0) {
            return R.drawable.house_wght400_outline_24;
        }
        if (iA0M == 1) {
            return R.drawable.meta_icons_2_0_vector_housesignalfan_outline_24_wght400;
        }
        if (iA0M == 2) {
            return R.drawable.aura_icon_code;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float lineHeightsDp(C1822Arm[] c1822ArmArr, BFM bfm, int i) {
        C7384Etj.A0Y(c1822ArmArr, 0);
        C0dm c0dm = (C0dm) bfm.A6v(Am0.A04);
        float fAgw = 0.0f;
        for (C1822Arm c1822Arm : c1822ArmArr) {
            fAgw += c0dm.Agw(c1822Arm.A00.A04);
        }
        return fAgw;
    }

    public static final boolean opensInMetaAi(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        return nodeListEntry.isWearable() && !HatchUtil.INSTANCE.isWearableDevicePageEnabled();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GadgetKind.values().length];
            try {
                AnonymousClass005.A0v(GadgetKind.GLASSES, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(GadgetKind.HOME_LINK, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(GadgetKind.WIFI_GADGET, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(GadgetKind.LINUX_GADGET, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DevicePresence.values().length];
            try {
                AnonymousClass005.A0v(DevicePresence.ONLINE, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(DevicePresence.WAKEABLE, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(DevicePresence.OFFLINE, iArr2, 3);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* renamed from: DeviceIconSquare-WSOZc8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1951DeviceIconSquareWSOZc8o(int r15, float r16, X.BRg r17, long r18, long r20, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceRowPartsKt.m1951DeviceIconSquareWSOZc8o(int, float, X.BRg, long, long, X.BFM, int, int):void");
    }

    public static final void DeviceRowCard(int i, String str, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, boolean z, BFM bfm, int i2, int i3) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 1, g0v);
        bfm.AgG(1162016419);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, g0v);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0r(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 9363, 9362), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                z2 = false;
            }
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(C2VU.A04, bfm, 6, 0);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(str, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, 1, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), none, B1V.A00(bfm, new AnonymousClass1(i), 1133208903), B1V.A00(bfm, new AnonymousClass2(z2), 1769316080), null, null, null, null, false, false, null, null, 0L, false, B1V.A00(bfm, new AnonymousClass3(g0v), -1472088560), null, bfm, 224256, 1572864, 196544);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(i, str, g0v, bRg2, z2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DeviceStatusLine(com.facebook.aura.nodes.json.NodeListEntry r30, java.lang.String r31, X.BRg r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceRowPartsKt.DeviceStatusLine(com.facebook.aura.nodes.json.NodeListEntry, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String deviceStatusText(com.facebook.aura.nodes.json.NodeListEntry r7, X.BFM r8, int r9) {
        /*
            com.facebook.aura.nodes.json.DevicePresence r0 = r7.getPresence()
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L54
            r0 = 1
            if (r1 == r0) goto L5e
            r0 = 2
            if (r1 != r0) goto L6c
            r0 = -767137228(0xffffffffd2466a34, float:-2.13046329E11)
            r8.AgE(r0)
            java.lang.Long r0 = r7.getLastSeenMs()
            if (r0 == 0) goto L46
            long r1 = r0.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r1 = r3
        L2a:
            r5 = 60000(0xea60, double:2.9644E-319)
            r7 = 262144(0x40000, float:3.67342E-40)
            java.lang.CharSequence r0 = android.text.format.DateUtils.getRelativeTimeSpanString(r1, r3, r5, r7)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L46
            r0 = 252348302(0xf0a878e, float:6.830032E-30)
            r8.AgE(r0)
        L3f:
            X.AnonymousClass001.A1D(r8)
        L42:
            X.AnonymousClass001.A1D(r8)
            return r1
        L46:
            r0 = 252359152(0xf0ab1f0, float:6.838195E-30)
            r8.AgE(r0)
            r0 = 2131888065(0x7f1207c1, float:1.9410755E38)
            java.lang.String r1 = X.AbstractC2271BQs.A01(r8, r0)
            goto L3f
        L54:
            r0 = 252341583(0xf0a6d4f, float:6.8249774E-30)
            r8.AgE(r0)
            r0 = 2131888064(0x7f1207c0, float:1.9410753E38)
            goto L67
        L5e:
            r0 = 252344593(0xf0a7911, float:6.827242E-30)
            r8.AgE(r0)
            r0 = 2131888066(0x7f1207c2, float:1.9410757E38)
        L67:
            java.lang.String r1 = X.AbstractC2271BQs.A01(r8, r0)
            goto L42
        L6c:
            r0 = 252340403(0xf0a68b3, float:6.82409E-30)
            kotlin.NoWhenBranchMatchedException r0 = X.AnonymousClass005.A0k(r8, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchDeviceRowPartsKt.deviceStatusText(com.facebook.aura.nodes.json.NodeListEntry, X.BFM, int):java.lang.String");
    }

    public static final void logDeviceRowClick(NodeListEntry nodeListEntry, boolean z) {
        AnonymousClass006.A0b(nodeListEntry).logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICES, HatchComponent.DEVICE_ROW, nodeListEntry.nodeId, AnonymousClass006.A10(HatchMetadataKey.IS_CURRENT_DEVICE.getValue(), String.valueOf(z)), null);
    }
}
