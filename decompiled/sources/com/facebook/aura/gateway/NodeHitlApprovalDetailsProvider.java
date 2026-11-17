package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C0881AGi;
import X.C3cG;
import X.C4JM;
import X.C60Q;
import X.C7384Etj;
import X.FGI;
import X.HxE;
import android.app.Application;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeHitlAccess;
import com.facebook.aura.nodes.core.NodeHitlGroup;
import com.facebook.aura.nodes.core.NodeHitlRequest;
import com.facebook.aura.nodes.core.NodeHitlRequestKind;
import com.facebook.aura.nodes.core.NodeHitlSpec;
import com.facebook.aura.nodes.hitldisplay.NodeHitlCapability;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class NodeHitlApprovalDetailsProvider {
    public static final int $stable = 0;
    public static final NodeHitlApprovalDetailsProvider INSTANCE = new NodeHitlApprovalDetailsProvider();
    public static final Set<NodeCommandId> IN_APP_REVIEW_COMMANDS = BFI.A0H(new NodeCommandId[]{NodeCommandId.APP_OPEN_LINK, NodeCommandId.NAVIGATION_START});

    public final String actionPhrase(NodeHitlRequest nodeHitlRequest) {
        C7384Etj.A0Y(nodeHitlRequest, 0);
        return C4JM.A00().getString(AnonymousClass001.A0F(copyResIds(nodeHitlRequest).first));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[NodeCommandId.values().length];
            try {
                AnonymousClass005.A0v(NodeCommandId.APP_LIST, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.BUG_REPORT_CREATE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.APP_OPEN, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.NAVIGATION_START, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.APP_OPEN_LINK, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.PHONE_CALL, iArr, 6);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.MESSAGE_SEND, iArr, 7);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(NodeCommandId.CONTACTS_CREATE, iArr, 8);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(NodeCommandId.CONTACTS_UPDATE, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(NodeCommandId.CONTACTS_DELETE, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(NodeCommandId.CALENDAR_EVENTS_CREATE, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(NodeCommandId.CALENDAR_EVENTS_UPDATE, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(NodeCommandId.CALENDAR_EVENTS_DELETE, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(NodeCommandId.CALENDAR_REMINDERS_SET, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                C60Q.A1E(NodeCommandId.NOTIFICATIONS_ACTION, iArr);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NodeCommandId.TIMER_CANCEL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NodeCommandId.MEDIA_PLAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NodeCommandId.MEDIA_NOW_PLAYING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NodeCommandId.DND_SET.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NodeCommandId.DISPLAY_BRIGHTNESS_SET.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NodeHitlCapability.values().length];
            try {
                AnonymousClass005.A0v(NodeHitlCapability.CALENDAR, iArr2, 1);
            } catch (NoSuchFieldError unused21) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlCapability.CONTACTS, iArr2, 2);
            } catch (NoSuchFieldError unused22) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlCapability.MESSAGES, iArr2, 3);
            } catch (NoSuchFieldError unused23) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlCapability.PHONE, iArr2, 4);
            } catch (NoSuchFieldError unused24) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlCapability.NOTIFICATIONS, iArr2, 5);
            } catch (NoSuchFieldError unused25) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlCapability.CALL_HISTORY, iArr2, 6);
            } catch (NoSuchFieldError unused26) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlCapability.HEALTH, iArr2, 7);
            } catch (NoSuchFieldError unused27) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlCapability.PHOTOS, iArr2, 8);
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NodeHitlRequestKind.values().length];
            try {
                AnonymousClass005.A0v(NodeHitlRequestKind.DATA_SOURCE_BACKFILL, iArr3, 1);
            } catch (NoSuchFieldError unused29) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlRequestKind.COMMAND, iArr3, 2);
            } catch (NoSuchFieldError unused30) {
            }
            try {
                AnonymousClass005.A0v(NodeHitlRequestKind.PROACTIVE_SYNC, iArr3, 3);
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.HxE<java.lang.Integer, java.lang.Integer> commandCopy(com.facebook.aura.nodes.core.NodeCommandId r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L9
            int r0 = r1.ordinal()
            switch(r0) {
                case 2: goto L9d;
                case 3: goto L91;
                case 4: goto L86;
                case 10: goto L4f;
                case 12: goto L23;
                case 19: goto L7b;
                case 20: goto L70;
                case 21: goto L65;
                case 22: goto L5a;
                case 31: goto La9;
                case 32: goto Lb5;
                case 40: goto L44;
                case 61: goto L2e;
                case 63: goto L39;
                case 65: goto L18;
                case 66: goto Lf1;
                case 67: goto Ld9;
                case 68: goto Lc1;
                case 69: goto Lcd;
                case 70: goto Le5;
                default: goto L9;
            }
        L9:
            r0 = 2131886805(0x7f1202d5, float:1.94082E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886804(0x7f1202d4, float:1.9408197E38)
        L13:
            X.HxE r0 = X.AnonymousClass002.A0p(r1, r0)
            return r0
        L18:
            r0 = 2131886783(0x7f1202bf, float:1.9408155E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886782(0x7f1202be, float:1.9408153E38)
            goto L13
        L23:
            r0 = 2131886803(0x7f1202d3, float:1.9408195E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886802(0x7f1202d2, float:1.9408193E38)
            goto L13
        L2e:
            r0 = 2131886807(0x7f1202d7, float:1.9408203E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886806(0x7f1202d6, float:1.9408201E38)
            goto L13
        L39:
            r0 = 2131886809(0x7f1202d9, float:1.9408207E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886808(0x7f1202d8, float:1.9408205E38)
            goto L13
        L44:
            r0 = 2131886882(0x7f120322, float:1.9408355E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886881(0x7f120321, float:1.9408353E38)
            goto L13
        L4f:
            r0 = 2131886815(0x7f1202df, float:1.940822E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886814(0x7f1202de, float:1.9408217E38)
            goto L13
        L5a:
            r0 = 2131886793(0x7f1202c9, float:1.9408175E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886792(0x7f1202c8, float:1.9408173E38)
            goto L13
        L65:
            r0 = 2131886789(0x7f1202c5, float:1.9408167E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886788(0x7f1202c4, float:1.9408165E38)
            goto L13
        L70:
            r0 = 2131886791(0x7f1202c7, float:1.940817E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886790(0x7f1202c6, float:1.9408169E38)
            goto L13
        L7b:
            r0 = 2131886787(0x7f1202c3, float:1.9408163E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886786(0x7f1202c2, float:1.940816E38)
            goto L13
        L86:
            r0 = 2131886797(0x7f1202cd, float:1.9408183E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886796(0x7f1202cc, float:1.940818E38)
            goto L13
        L91:
            r0 = 2131886799(0x7f1202cf, float:1.9408187E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886798(0x7f1202ce, float:1.9408185E38)
            goto L13
        L9d:
            r0 = 2131886795(0x7f1202cb, float:1.9408179E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886794(0x7f1202ca, float:1.9408177E38)
            goto L13
        La9:
            r0 = 2131886811(0x7f1202db, float:1.9408211E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886810(0x7f1202da, float:1.940821E38)
            goto L13
        Lb5:
            r0 = 2131886823(0x7f1202e7, float:1.9408236E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886822(0x7f1202e6, float:1.9408234E38)
            goto L13
        Lc1:
            r0 = 2131886817(0x7f1202e1, float:1.9408224E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886816(0x7f1202e0, float:1.9408222E38)
            goto L13
        Lcd:
            r0 = 2131886813(0x7f1202dd, float:1.9408215E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886812(0x7f1202dc, float:1.9408213E38)
            goto L13
        Ld9:
            r0 = 2131886781(0x7f1202bd, float:1.940815E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886780(0x7f1202bc, float:1.9408149E38)
            goto L13
        Le5:
            r0 = 2131886785(0x7f1202c1, float:1.9408159E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886784(0x7f1202c0, float:1.9408157E38)
            goto L13
        Lf1:
            r0 = 2131886779(0x7f1202bb, float:1.9408146E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886778(0x7f1202ba, float:1.9408144E38)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.NodeHitlApprovalDetailsProvider.commandCopy(com.facebook.aura.nodes.core.NodeCommandId):X.HxE");
    }

    private final HxE<Integer, Integer> copyResIds(NodeHitlRequest nodeHitlRequest) {
        int iOrdinal = nodeHitlRequest.kind.ordinal();
        if (iOrdinal == 1) {
            return dataSourceCopy(nodeHitlRequest.subjectId);
        }
        if (iOrdinal == 0) {
            return commandCopy(NodeCommandId.Companion.fromId(nodeHitlRequest.subjectId));
        }
        if (iOrdinal == 2) {
            return AnonymousClass002.A0p(Integer.valueOf(R.string._name_removed__res_0x7f1202d5), R.string._name_removed__res_0x7f1202d4);
        }
        throw C3cG.A0q();
    }

    private final List<AgentPermissionDecisionOption> localDecisionOptions(Context context, NodeHitlGroup nodeHitlGroup) {
        AgentPermissionDecisionOption agentPermissionDecisionOption = new AgentPermissionDecisionOption(AgentPermissionDecision.ALLOW_ONCE.getWireValue(), context.getString(R.string._name_removed__res_0x7f1202b9), null);
        AgentPermissionDecisionOption agentPermissionDecisionOption2 = new AgentPermissionDecisionOption(AgentPermissionDecision.ALLOW_ALWAYS.getWireValue(), context.getString(R.string._name_removed__res_0x7f1202b8), null);
        if (HatchNodeHitlGateKt.NO_ALLOW_ALWAYS_GROUPS.contains(nodeHitlGroup)) {
            agentPermissionDecisionOption2 = null;
        }
        return BFI.A0F(new AgentPermissionDecisionOption[]{agentPermissionDecisionOption, agentPermissionDecisionOption2, new AgentPermissionDecisionOption(AgentPermissionDecision.DENY.getWireValue(), context.getString(R.string._name_removed__res_0x7f1202d1), null)});
    }

    private final int summaryResId(NodeHitlSpec nodeHitlSpec, NodeHitlRequest nodeHitlRequest) {
        NodeCommandId nodeCommandIdFromId;
        NodeHitlGroup nodeHitlGroup = nodeHitlSpec.group;
        if (nodeHitlGroup == NodeHitlGroup.DO_NOT_DISTURB) {
            return R.string._name_removed__res_0x7f120314;
        }
        if (nodeHitlGroup == NodeHitlGroup.DISPLAY) {
            return R.string._name_removed__res_0x7f120313;
        }
        if (nodeHitlRequest.kind == NodeHitlRequestKind.COMMAND && (nodeCommandIdFromId = NodeCommandId.Companion.fromId(nodeHitlRequest.subjectId)) != null) {
            int iOrdinal = nodeCommandIdFromId.ordinal();
            if (iOrdinal == 66) {
                return R.string._name_removed__res_0x7f12030b;
            }
            if (iOrdinal == 70) {
                return R.string._name_removed__res_0x7f12030d;
            }
            if (iOrdinal == 67) {
                return R.string._name_removed__res_0x7f12030c;
            }
            if (iOrdinal == 69) {
                return R.string._name_removed__res_0x7f12031a;
            }
            if (iOrdinal == 68) {
                return R.string._name_removed__res_0x7f12031d;
            }
        }
        boolean z = nodeHitlSpec.access == NodeHitlAccess.READ;
        NodeHitlCapability nodeHitlCapabilityForGroup = NodeHitlCapability.Companion.forGroup(nodeHitlSpec.group);
        if (nodeHitlCapabilityForGroup != null) {
            switch (nodeHitlCapabilityForGroup.ordinal()) {
                case -1:
                    break;
                case 0:
                    return z ? R.string._name_removed__res_0x7f12030e : R.string._name_removed__res_0x7f12030f;
                case 1:
                    return z ? R.string._name_removed__res_0x7f120311 : R.string._name_removed__res_0x7f120312;
                case 2:
                    return z ? R.string._name_removed__res_0x7f120318 : R.string._name_removed__res_0x7f120319;
                case 3:
                    return R.string._name_removed__res_0x7f12031e;
                case 4:
                    return z ? R.string._name_removed__res_0x7f12031b : R.string._name_removed__res_0x7f12031c;
                case 5:
                    return R.string._name_removed__res_0x7f120310;
                case 6:
                    return R.string._name_removed__res_0x7f120317;
                case 7:
                    return R.string._name_removed__res_0x7f12031f;
                default:
                    throw C3cG.A0q();
            }
        }
        return z ? R.string._name_removed__res_0x7f120315 : R.string._name_removed__res_0x7f120316;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionApproval buildApproval(NodeHitlSpec nodeHitlSpec, NodeHitlRequest nodeHitlRequest, String str) {
        String string;
        String strA0b;
        AnonymousClass005.A10(nodeHitlSpec, nodeHitlRequest, str);
        Application applicationA00 = C4JM.A00();
        NodeHitlCapability nodeHitlCapabilityForGroup = NodeHitlCapability.Companion.forGroup(nodeHitlSpec.group);
        String string2 = nodeHitlCapabilityForGroup != null ? applicationA00.getString(nodeHitlCapabilityForGroup.getDisplayTitleRes()) : null;
        NodeHitlAccess nodeHitlAccess = nodeHitlSpec.access;
        NodeHitlAccess nodeHitlAccess2 = NodeHitlAccess.READ;
        boolean z = false;
        int i = R.string._name_removed__res_0x7f1202e5;
        int i2 = R.string._name_removed__res_0x7f1202e3;
        if (nodeHitlAccess == nodeHitlAccess2) {
            i = R.string._name_removed__res_0x7f1202e4;
            i2 = R.string._name_removed__res_0x7f1202e2;
        }
        int iA0F = AnonymousClass001.A0F(copyResIds(nodeHitlRequest).second);
        String string3 = iA0F == R.string._name_removed__res_0x7f1202d4 ? null : applicationA00.getString(iA0F);
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocumentLocalRequestPreviewDocument = HatchNodeHitlGateKt.localRequestPreviewDocument(nodeHitlRequest);
        String strA0K = nodeHitlRequest.requestId;
        if (strA0K == null) {
            strA0K = FGI.A0K(nodeHitlRequest.subjectId, System.nanoTime(), "_");
        }
        String strA0j = FGI.A0j("local_node_hitl:", strA0K, ":", nodeHitlSpec.group.getWireValue(), ":", nodeHitlSpec.access.getWireValue());
        if (nodeHitlRequest.kind == NodeHitlRequestKind.COMMAND && AbstractC0878AGe.A0k(IN_APP_REVIEW_COMMANDS, NodeCommandId.Companion.fromId(nodeHitlRequest.subjectId))) {
            z = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA0b2 = C60Q.A0b(applicationA00, str, summaryResId(nodeHitlSpec, nodeHitlRequest));
        if (string2 != null) {
            string = applicationA00.getString(i, str, string2);
            strA0b = C60Q.A0b(applicationA00, string2, i2);
        } else {
            string = null;
            strA0b = null;
        }
        return new HatchAgentPermissionsRepository.AgentPermissionApproval(strA0j, z, ApprovalAttentionMode.FOREGROUND, jCurrentTimeMillis, null, null, null, null, string3, strA0b2, string, strA0b, null, (agentPermissionRequestPreviewDocumentLocalRequestPreviewDocument == null || !(nodeHitlRequest.kind == NodeHitlRequestKind.DATA_SOURCE_BACKFILL || nodeHitlSpec.access == NodeHitlAccess.WRITE)) ? AgentPermissionRequestPresentation.DETAILS : AgentPermissionRequestPresentation.INLINE, agentPermissionRequestPreviewDocumentLocalRequestPreviewDocument, false, null, C0881AGi.A00, AgentPermissionPayloadType.DEVICE, null, nodeHitlCapabilityForGroup != null ? Integer.valueOf(nodeHitlCapabilityForGroup.getIconRes()) : null, string2, null, null, null, ApprovalOrigin.LOCAL_HITL, null, localDecisionOptions(applicationA00, nodeHitlSpec.group), null, false, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.HxE<java.lang.Integer, java.lang.Integer> dataSourceCopy(java.lang.String r1) {
        /*
            r0 = this;
            int r0 = r1.hashCode()
            switch(r0) {
                case -1221262756: goto L62;
                case -567451565: goto L4f;
                case -178324674: goto L3c;
                case 114009: goto L29;
                case 1272354024: goto L16;
                default: goto L7;
            }
        L7:
            r0 = 2131886805(0x7f1202d5, float:1.94082E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886804(0x7f1202d4, float:1.9408197E38)
        L11:
            X.HxE r0 = X.AnonymousClass002.A0p(r1, r0)
            return r0
        L16:
            java.lang.String r0 = "notifications"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131886856(0x7f120308, float:1.9408303E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886855(0x7f120307, float:1.94083E38)
            goto L11
        L29:
            java.lang.String r0 = "sms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131886858(0x7f12030a, float:1.9408307E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886857(0x7f120309, float:1.9408305E38)
            goto L11
        L3c:
            java.lang.String r0 = "calendar"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131886850(0x7f120302, float:1.940829E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886849(0x7f120301, float:1.9408288E38)
            goto L11
        L4f:
            java.lang.String r0 = "contacts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131886852(0x7f120304, float:1.9408295E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886851(0x7f120303, float:1.9408293E38)
            goto L11
        L62:
            java.lang.String r0 = "health"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131886854(0x7f120306, float:1.9408299E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131886853(0x7f120305, float:1.9408297E38)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.NodeHitlApprovalDetailsProvider.dataSourceCopy(java.lang.String):X.HxE");
    }
}
