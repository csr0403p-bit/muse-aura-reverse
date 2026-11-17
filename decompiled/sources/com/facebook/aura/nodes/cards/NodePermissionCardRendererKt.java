package com.facebook.aura.nodes.cards;

import X.AbstractC2271BQs;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFM;
import X.C3cG;
import com.facebook.aura.R;
import com.facebook.aura.navigation.key.DevicePermissionRowId;
import com.facebook.aura.nodes.hitldisplay.NodeHitlCapability;
import com.facebook.aura.nudge.NudgeContent;
import com.facebook.aura.nudge.NudgePresentation;

/* loaded from: classes3.dex */
public abstract class NodePermissionCardRendererKt {

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

    public static final NudgeContent backgroundLocationCardContent(BFM bfm, int i) {
        return new NudgeContent(HatchPermissionCardKt.iconResForRow(DevicePermissionRowId.LOCATION), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f16), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ef), 2, AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f15), Integer.MAX_VALUE, true, null, NudgePresentation.CARD, null);
    }

    public static final int permissionTitleRes(DevicePermissionRowId devicePermissionRowId) {
        NodeHitlCapability nodeHitlCapability;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (devicePermissionRowId.ordinal()) {
            case 0:
                nodeHitlCapability = NodeHitlCapability.CONTACTS;
                break;
            case 1:
                return R.string._name_removed__res_0x7f120b04;
            case 2:
                nodeHitlCapability = NodeHitlCapability.CALENDAR;
                break;
            case 3:
                nodeHitlCapability = NodeHitlCapability.MESSAGES;
                break;
            case 4:
                nodeHitlCapability = NodeHitlCapability.CALL_HISTORY;
                break;
            case 5:
                nodeHitlCapability = NodeHitlCapability.NOTIFICATIONS;
                break;
            case 6:
                nodeHitlCapability = NodeHitlCapability.HEALTH;
                break;
            case 7:
                nodeHitlCapability = NodeHitlCapability.PHONE;
                break;
            case 8:
                nodeHitlCapability = NodeHitlCapability.PHOTOS;
                break;
            default:
                throw C3cG.A0q();
        }
        return nodeHitlCapability.getDisplayTitleRes();
    }

    public static final NudgeContent nodePermissionCardContent(DevicePermissionRowId devicePermissionRowId, BFM bfm, int i) {
        return new NudgeContent(HatchPermissionCardKt.iconResForRow(devicePermissionRowId), AbstractC2271BQs.A01(bfm, permissionTitleRes(devicePermissionRowId)), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ef), 1, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b6d), 3, true, null, NudgePresentation.CARD, null);
    }
}
