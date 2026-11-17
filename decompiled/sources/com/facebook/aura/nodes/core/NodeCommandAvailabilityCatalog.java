package com.facebook.aura.nodes.core;

import X.AnonymousClass002;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class NodeCommandAvailabilityCatalog {
    public static final NodeCommandAvailabilityCatalog INSTANCE = new NodeCommandAvailabilityCatalog();

    public final NodeCommandDeviceRequirement deviceRequirementForCommand(NodeCommandId nodeCommandId) {
        C7384Etj.A0Y(nodeCommandId, 0);
        switch (nodeCommandId.ordinal()) {
            case 1:
            case 32:
                return NodeCommandDeviceRequirement.TELEPHONY_CALLING;
            case 25:
            case 29:
            case 30:
            case 31:
                return NodeCommandDeviceRequirement.TELEPHONY_MESSAGING;
            default:
                return NodeCommandDeviceRequirement.NONE;
        }
    }

    public final NodeCommandAvailability forCommand(NodeCommandId nodeCommandId) {
        C7384Etj.A0Y(nodeCommandId, 0);
        int iOrdinal = nodeCommandId.ordinal();
        return iOrdinal != 30 ? iOrdinal != 31 ? NodeCommandAvailability.ALWAYS : NodeCommandAvailability.DEFAULT_ASSISTANT_ONLY : NodeCommandAvailability.NON_DEFAULT_ASSISTANT_ONLY;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeCommandId.values().length];
            try {
                AnonymousClass002.A13(NodeCommandId.MESSAGE_DRAFT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeCommandId.MESSAGE_SEND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeCommandId.MESSAGE_SEARCH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NodeCommandId.MESSAGE_ATTACHMENT_GET, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(NodeCommandId.CALL_LOG_SEARCH, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(NodeCommandId.PHONE_CALL, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
