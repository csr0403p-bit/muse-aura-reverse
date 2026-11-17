package com.facebook.aura.nodes.cards;

import X.AKQ;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.DevicePermissionManageControllerKt;
import com.facebook.aura.navigation.key.DevicePermissionRowId;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.navigation.key.PermissionDestinationKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPermissionCardKt {

    /* renamed from: com.facebook.aura.nodes.cards.HatchPermissionCardKt$HatchPermissionCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PermissionCardData $data;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PermissionCardData permissionCardData, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$data = permissionCardData;
            this.$modifier = bRg;
            this.$inBubble = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPermissionCardKt.HatchPermissionCard(this.$data, this.$modifier, this.$inBubble, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DevicePermissionRowId.values().length];
            try {
                AnonymousClass002.A13(DevicePermissionRowId.CONTACTS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DevicePermissionRowId.LOCATION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DevicePermissionRowId.CALENDAR, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(DevicePermissionRowId.SMS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(DevicePermissionRowId.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(DevicePermissionRowId.NOTIFICATIONS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(DevicePermissionRowId.HEALTH, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(DevicePermissionRowId.PHONE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(DevicePermissionRowId.PHOTOS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HatchPermissionCard(PermissionCardData permissionCardData, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(permissionCardData, 0);
        bfm.AgG(551458254);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(permissionCardData, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(permissionCardData.highlight);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = DevicePermissionRowId.Companion.fromWire(permissionCardData.highlight);
                bfm.Ai0(objAaT);
            }
            DevicePermissionRowId devicePermissionRowId = (DevicePermissionRowId) objAaT;
            boolean zA63 = bfm.A63(AnonymousClass003.A0K(devicePermissionRowId));
            Object objAaT2 = bfm.AaT();
            if (zA63 || objAaT2 == C78N.A00) {
                objAaT2 = devicePermissionRowId != null ? PermissionDestinationKt.toPermissionDestination(devicePermissionRowId) : null;
                bfm.Ai0(objAaT2);
            }
            PermissionDestination permissionDestination = (PermissionDestination) objAaT2;
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = HatchPermissionCardKt$HatchPermissionCard$managePermission$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            G0U<PermissionDestination, Unit> g0uRememberDevicePermissionManageController = DevicePermissionManageControllerKt.rememberDevicePermissionManageController((Function0) objAaT3, null, bfm, 6, 2);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq).then(NodeCardComponentsKt.hatchCardChrome(z2, bfm, (iA05 >> 6) & 14));
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 16.0f, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 8.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0L, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, iconResForRow(devicePermissionRowId), 0), AuraIconSize.SMALL, null, 0L, null, bfm, AnonymousClass001.A03(), 57);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, permissionCardData.label, R.string._name_removed__res_0x7f120b96), AnonymousClass001.A0O(c90m, bs0, true), C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 5, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b95);
            AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean zA1S = AnonymousClass004.A1S(bfm, g0uRememberDevicePermissionManageController, contextA0H, bfm.A63(AnonymousClass003.A0K(permissionDestination)));
            Object objAaT4 = bfm.AaT();
            if (zA1S || objAaT4 == obj) {
                objAaT4 = new HatchPermissionCardKt$HatchPermissionCard$1$2$1(permissionDestination, g0uRememberDevicePermissionManageController, contextA0H);
                bfm.Ai0(objAaT4);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondaryOutlined, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT4, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(permissionCardData, bRg2, z2, i, i2);
        }
    }

    public static final int iconResForRow(DevicePermissionRowId devicePermissionRowId) {
        if (devicePermissionRowId == null) {
            return R.drawable.shield_lock_wght400_outline_24;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (devicePermissionRowId.ordinal()) {
            case -1:
                return R.drawable.shield_lock_wght400_outline_24;
            case 0:
                return R.drawable.circle_user_wght400_outline_24;
            case 1:
                return R.drawable.ic_geo_location;
            case 2:
                return R.drawable.meta_brand_design_system_icons_vector_grid_calendar_clock_filled_24;
            case 3:
                return R.drawable.speech_bubble_wght400_outline_24;
            case 4:
            case 7:
                return R.drawable.voice_phone_handset_outline_24;
            case 5:
                return R.drawable.bell_wght400_outline_24;
            case 6:
                return R.drawable.health_connect_icon;
            case 8:
                return R.drawable.image_wght400_outline_24;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
