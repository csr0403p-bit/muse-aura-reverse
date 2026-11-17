package com.facebook.aura.agentpermission;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.gateway.AgentPermissionPayloadType;
import com.facebook.aura.gateway.ApprovalIconKey;
import com.facebook.aura.gateway.ApprovalRecord;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public abstract class AgentPermissionIconsKt {
    public static final float ApprovalIconCornerRadius = 12.0f;
    public static final float ApprovalIconGlyphSize = 28.0f;
    public static final float ApprovalIconSize = 44.0f;

    public static final Integer approvalCapabilityIconRes(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        return agentPermissionApproval.iconRes;
    }

    public static final int approvalFallbackIconRes(AgentPermissionPayloadType agentPermissionPayloadType, ApprovalIconKey approvalIconKey) {
        C7384Etj.A0Y(agentPermissionPayloadType, 0);
        if (approvalIconKey != null) {
            switch (approvalIconKey.ordinal()) {
                case -1:
                    break;
                case 0:
                    return R.drawable.globe_search_outline_28;
                case 1:
                    return R.drawable.exclamation_triangle_outline_svg;
                case 2:
                case 4:
                case 5:
                    return R.drawable.four_squares_grid_outline_28;
                case 3:
                    return R.drawable.globe_outline_28;
                case 6:
                    return R.drawable.media_play_wght400_filled_24;
                case 7:
                    return R.drawable.phone_android_wght400_outline_24;
                default:
                    throw C3cG.A0q();
            }
        }
        return payloadFallbackIconRes(agentPermissionPayloadType);
    }

    public static final int approvalGlyphRes(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        AgentPermissionPayloadType agentPermissionPayloadType = agentPermissionApproval.payloadType;
        ApprovalRecord approvalRecord = agentPermissionApproval.approvalRecord;
        return approvalFallbackIconRes(agentPermissionPayloadType, approvalRecord != null ? approvalRecord.iconKey : null);
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApprovalIconKey.values().length];
            try {
                AnonymousClass005.A0v(ApprovalIconKey.NETWORK, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ApprovalIconKey.BROWSER, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(ApprovalIconKey.DEVICE, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ApprovalIconKey.MEDIA, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(ApprovalIconKey.WARNING, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(ApprovalIconKey.CONNECTOR, iArr, 6);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(ApprovalIconKey.TOOL, iArr, 7);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(ApprovalIconKey.CHECKOUT, iArr, 8);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AgentPermissionPayloadType.values().length];
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.NETWORK, iArr2, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.BROWSER_ACTION, iArr2, 2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.BROWSER_TASK_CONFIRMATION, iArr2, 3);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.BROWSER_CHECKOUT, iArr2, 4);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.STRIPE_LINK_CHECKOUT, iArr2, 5);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.RESERVATION_CHECKOUT, iArr2, 6);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.SHOPIFY_CHECKOUT, iArr2, 7);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass005.A0v(AgentPermissionPayloadType.FLIGHT_CHECKOUT, iArr2, 8);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass006.A1I(AgentPermissionPayloadType.DEVICE, iArr2);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AnonymousClass006.A1J(AgentPermissionPayloadType.OUTGOING_MEDIA, iArr2);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AnonymousClass006.A1K(AgentPermissionPayloadType.DELIVERY_CHECKOUT, iArr2);
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AnonymousClass006.A1L(AgentPermissionPayloadType.PURCHASE_PREAPPROVAL, iArr2);
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[AgentPermissionPayloadType.CAR_RENTAL_RESERVATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[AgentPermissionPayloadType.CONNECTOR.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[AgentPermissionPayloadType.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ int approvalFallbackIconRes$default(AgentPermissionPayloadType agentPermissionPayloadType, ApprovalIconKey approvalIconKey, int i, Object obj) {
        if ((i & 2) != 0) {
            approvalIconKey = null;
        }
        return approvalFallbackIconRes(agentPermissionPayloadType, approvalIconKey);
    }

    public static final float getApprovalIconCornerRadius() {
        return ApprovalIconCornerRadius;
    }

    public static final float getApprovalIconGlyphSize() {
        return ApprovalIconGlyphSize;
    }

    public static final float getApprovalIconSize() {
        return ApprovalIconSize;
    }

    public static final int payloadFallbackIconRes(AgentPermissionPayloadType agentPermissionPayloadType) {
        switch (agentPermissionPayloadType.ordinal()) {
            case 0:
                return R.drawable.shoppingcart_outline_24_wght400;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 10:
                return R.drawable.globe_outline_28;
            case 5:
                return R.drawable.airplane_wght400_outline_24;
            case 7:
            case 13:
            case 14:
                return R.drawable.four_squares_grid_outline_28;
            case 8:
                return R.drawable.truck_outline_24;
            case 9:
                return R.drawable.media_play_wght400_filled_24;
            case 11:
                return R.drawable.globe_search_outline_28;
            case 12:
                return R.drawable.phone_android_wght400_outline_24;
            default:
                throw C3cG.A0q();
        }
    }
}
