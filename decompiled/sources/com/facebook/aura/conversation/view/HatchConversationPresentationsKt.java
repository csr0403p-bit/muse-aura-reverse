package com.facebook.aura.conversation.view;

import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C1D3;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardContext;
import com.facebook.aura.model.HatchWidgetPresentation;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchConversationPresentationsKt {
    public static final String COMPLIMENTARY_CARD_DEDUPE_PREFIX = "chat_complimentary_card:";
    public static final float GroupedPresentationSpacing = 4.0f;
    public static final String INVITE_CARD_DEDUPE_PREFIX = "chat_invite_card:";
    public static final String INVITE_INVOKE_URL_PREFIX = "hatch://devices/invoke/invite.upsell";
    public static final String INVITE_ROUTE_URL_PREFIX = "hatch://invite_friends";
    public static final String IN_THREAD_TAP_ORIGIN = "in_thread";
    public static final String SUBSCRIPTIONS_INVOKE_URL_PREFIX = "hatch://devices/invoke/subscriptions.";
    public static final String UPGRADE_CARD_DEDUPE_PREFIX = "chat_upgrade_card:";

    public static final boolean isInviteEntryPointUrl(String str) {
        if (str != null) {
            return str.startsWith(INVITE_INVOKE_URL_PREFIX) || str.startsWith("hatch://invite_friends");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0V<java.lang.String, java.lang.String, kotlin.Unit> presentationActionHandler(java.lang.String r15, java.lang.String r16, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r17, X.BFM r18, int r19) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r15, r0)
            r3 = r18
            android.content.Context r10 = X.AnonymousClass003.A0O(r3)
            X.CGz r9 = X.AnonymousClass002.A0g(r3)
            com.facebook.aura.navigation.AuraNavigator r11 = X.AnonymousClass003.A0b(r3)
            X.AKH<X.AHD<com.facebook.aura.conversation.widget.api.ConversationPresentationAction>> r0 = com.facebook.aura.conversation.widget.api.ConversationPresentationActionsKt.LocalConversationPresentationActions
            java.lang.Object r13 = r3.A6v(r0)
            X.AHD r13 = (X.AHD) r13
            java.lang.Object r0 = r3.AaT()
            java.lang.Object r2 = X.C78N.A00
            java.lang.Object r12 = X.AnonymousClass004.A15(r3, r0, r2)
            X.3UX r12 = (X.C3UX) r12
            r4 = r19
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            r7 = 0
            r8 = r17
            if (r0 <= r5) goto L39
            boolean r0 = r3.A65(r8)
            if (r0 != 0) goto L3e
        L39:
            r1 = r4 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r5) goto L3f
        L3e:
            r0 = 1
        L3f:
            boolean r0 = X.AnonymousClass005.A1V(r3, r9, r10, r11, r0)
            boolean r0 = X.AnonymousClass001.A1T(r3, r12, r0)
            boolean r6 = X.AnonymousClass001.A1T(r3, r13, r0)
            r0 = r19 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r5 = 32
            r14 = r16
            if (r0 <= r5) goto L5b
            boolean r0 = r3.A65(r14)
            if (r0 != 0) goto L60
        L5b:
            r1 = r19 & 48
            r0 = 0
            if (r1 != r5) goto L61
        L60:
            r0 = 1
        L61:
            r6 = r6 | r0
            r0 = r19 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto L6f
            boolean r0 = r3.A65(r15)
            if (r0 != 0) goto L73
        L6f:
            r0 = r19 & 6
            if (r0 != r1) goto L74
        L73:
            r7 = 1
        L74:
            r6 = r6 | r7
            java.lang.Object r7 = r3.AaT()
            if (r6 != 0) goto L7d
            if (r7 != r2) goto L85
        L7d:
            com.facebook.aura.conversation.view.HatchConversationPresentationsKt$presentationActionHandler$1$1 r7 = new com.facebook.aura.conversation.view.HatchConversationPresentationsKt$presentationActionHandler$1$1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r3.Ai0(r7)
        L85:
            X.G0V r7 = (X.G0V) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationPresentationsKt.presentationActionHandler(java.lang.String, java.lang.String, X.G0U, X.BFM, int):X.G0V");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* renamed from: presentationShape-JTrpX9M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1D3 m565presentationShapeJTrpX9M(com.facebook.aura.model.HatchMessageRole r5, com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r6, int r7, int r8, boolean r9, float r10) {
        /*
            r4 = 0
            boolean r3 = X.AnonymousClass002.A1a(r5, r6)
            r2 = 0
            if (r7 > 0) goto L13
            if (r9 != 0) goto L13
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.MIDDLE
            if (r6 == r0) goto L13
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.LAST
            r1 = 0
            if (r6 != r0) goto L14
        L13:
            r1 = 1
        L14:
            int r8 = r8 - r3
            if (r7 < r8) goto L1f
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.MIDDLE
            if (r6 == r0) goto L1f
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.FIRST
            if (r6 != r0) goto L20
        L1f:
            r2 = 1
        L20:
            if (r1 == 0) goto L2e
            if (r2 == 0) goto L2b
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.MIDDLE
        L26:
            X.1D3 r0 = com.facebook.aura.conversation.view.HatchMessageBubbleKt.m637bubbleShapeTDGSqEk(r5, r0, r10, r4, r4)
            return r0
        L2b:
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.LAST
            goto L26
        L2e:
            if (r2 == 0) goto L33
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.FIRST
            goto L26
        L33:
            com.facebook.aura.conversation.viewmodel.BubbleGroupPosition r0 = com.facebook.aura.conversation.viewmodel.BubbleGroupPosition.STANDALONE
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationPresentationsKt.m565presentationShapeJTrpX9M(com.facebook.aura.model.HatchMessageRole, com.facebook.aura.conversation.viewmodel.BubbleGroupPosition, int, int, boolean, float):X.1D3");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* renamed from: HatchPresentation-9EmdrwA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m562HatchPresentation9EmdrwA(com.facebook.aura.model.HatchWidgetPresentation r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r55, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, X.G0U<? super java.lang.String, java.lang.Integer> r58, X.G0V<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r59, long r60, X.C1D3 r62, com.facebook.aura.conversation.view.InlineContentCallbacks r63, X.BRg r64, X.BFM r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationPresentationsKt.m562HatchPresentation9EmdrwA(com.facebook.aura.model.HatchWidgetPresentation, java.lang.String, java.lang.String, java.lang.String, X.G0U, X.G0W, kotlin.jvm.functions.Function0, X.G0U, X.G0V, long, X.1D3, com.facebook.aura.conversation.view.InlineContentCallbacks, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018c  */
    /* renamed from: WidgetPresentations--sx27Oc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m563WidgetPresentationssx27Oc(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r46, java.util.List<com.facebook.aura.model.HatchWidgetPresentation> r47, boolean r48, java.lang.String r49, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r50, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r51, kotlin.jvm.functions.Function0<kotlin.Unit> r52, X.G0U<? super java.lang.String, java.lang.Integer> r53, X.G0V<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r54, long r55, com.facebook.aura.conversation.view.InlineContentCallbacks r57, boolean r58, X.BRg r59, X.C3TH r60, X.G0U<? super X.BLU, kotlin.Unit> r61, X.BFM r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationPresentationsKt.m563WidgetPresentationssx27Oc(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, java.util.List, boolean, java.lang.String, X.G0U, X.G0W, kotlin.jvm.functions.Function0, X.G0U, X.G0V, long, com.facebook.aura.conversation.view.InlineContentCallbacks, boolean, X.BRg, X.3TH, X.G0U, X.BFM, int, int, int):void");
    }

    public static final Map<String, String> entrypointViewerData(String str) {
        Map<String, String> mapA10;
        return (str == null || (mapA10 = AnonymousClass006.A10(HatchMetadataKey.CTA_ACTION.getValue(), HatchConversationKt.subscriptionCtaAction(str))) == null) ? AGH.A0E() : mapA10;
    }

    public static final float getGroupedPresentationSpacing() {
        return GroupedPresentationSpacing;
    }

    /* renamed from: presentationCardContext-Bx497Mc, reason: not valid java name */
    public static final ConversationPresentationCardContext m564presentationCardContextBx497Mc(HatchWidgetPresentation hatchWidgetPresentation, String str, String str2, long j, C1D3 c1d3, G0U<? super String, Unit> g0u) {
        AnonymousClass003.A0u(hatchWidgetPresentation, str);
        AnonymousClass003.A0y(c1d3, g0u);
        return new ConversationPresentationCardContext(hatchWidgetPresentation.presentationId, hatchWidgetPresentation.presentationEventId, hatchWidgetPresentation.fromHistory, str, str2, j, c1d3, g0u);
    }
}
