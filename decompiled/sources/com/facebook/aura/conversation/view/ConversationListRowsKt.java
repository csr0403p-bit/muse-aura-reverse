package com.facebook.aura.conversation.view;

import X.AbstractC07539Wl;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3O5;
import X.C3U4;
import X.C7384Etj;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes.dex */
public abstract class ConversationListRowsKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* renamed from: ConversationAgentPermissionRow-uFdPcIQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m519ConversationAgentPermissionRowuFdPcIQ(java.lang.String r12, float r13, X.BRg r14, X.BFM r15, int r16, int r17) {
        /*
            r1 = r14
            r11 = 0
            r10 = r12
            X.C7384Etj.A0Y(r12, r11)
            r0 = -1330927605(0xffffffffb0aba80b, float:-1.2489648E-9)
            r14 = r15
            r15.AgG(r0)
            r2 = r16
            r0 = r16 & 6
            if (r0 != 0) goto Lc5
            int r4 = X.AnonymousClass004.A0d(r15, r12)
            r4 = r4 | r16
        L19:
            r0 = r16 & 48
            r3 = r13
            if (r0 != 0) goto L23
            int r0 = X.AnonymousClass004.A05(r15, r13)
            r4 = r4 | r0
        L23:
            r6 = r17 & 4
            if (r6 == 0) goto Lba
            r4 = r4 | 384(0x180, float:5.38E-43)
        L29:
            r5 = r4 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r7 = 1
            boolean r0 = X.AnonymousClass002.A1P(r5, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r15, r4)
            if (r0 == 0) goto Lb6
            if (r6 == 0) goto L3c
            X.BS0 r1 = X.BRg.A00
        L3c:
            X.AKH<com.facebook.aura.conversation.view.PresentationEntryTracker> r0 = com.facebook.aura.conversation.view.HatchPresentationEntryTrackerKt.LocalPresentationEntryTracker
            java.lang.Object r9 = r15.A6v(r0)
            com.facebook.aura.conversation.view.PresentationEntryTracker r9 = (com.facebook.aura.conversation.view.PresentationEntryTracker) r9
            r0 = r4 & 14
            r0 = r0 | 48
            java.lang.String r8 = com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.rememberPendingApprovalBatchKey(r12, r11, r15, r0, r11)
            boolean r0 = r15.A65(r8)
            java.lang.Object r5 = r15.AaT()
            if (r0 != 0) goto L5a
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L6a
        L5a:
            if (r8 == 0) goto L65
            if (r9 == 0) goto L65
            boolean r5 = r9.shouldAnimate(r8)
            r0 = 1
            if (r5 == r7) goto L66
        L65:
            r0 = 0
        L66:
            java.lang.Boolean r5 = X.AnonymousClass001.A0j(r15, r0)
        L6a:
            boolean r6 = X.AnonymousClass001.A1X(r5)
            boolean r5 = X.AnonymousClass003.A1J(r15, r8, r9)
            java.lang.Object r0 = r15.AaT()
            if (r5 != 0) goto L7c
            java.lang.Object r5 = X.C78N.A00
            if (r0 != r5) goto L84
        L7c:
            com.facebook.aura.conversation.view.ConversationListRowsKt$ConversationAgentPermissionRow$1$1 r0 = new com.facebook.aura.conversation.view.ConversationListRowsKt$ConversationAgentPermissionRow$1$1
            r0.<init>(r8, r9)
            r15.Ai0(r0)
        L84:
            X.AnonymousClass001.A17(r15, r0, r8)
            if (r8 != 0) goto L8a
            r7 = 0
        L8a:
            int r0 = r4 >> 6
            r0 = r0 & 14
            X.BRg r0 = com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt.approvalRowTransition(r1, r6, r7, r15, r0)
            r12 = 0
            X.BRg r9 = X.C3U4.A0C(r0, r12, r13, r12, r12)
            int r0 = r4 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r15 = r0 | 28032(0x6d80, float:3.9281E-41)
            r13 = 1
            r16 = r11
            com.facebook.aura.agentpermission.AgentPermissionPendingCardKt.m170AgentPermissionPendingCardhGBTI10(r9, r10, r11, r12, r13, r14, r15, r16)
        La3:
            X.BBb r0 = r14.AAc()
            if (r0 == 0) goto Lb5
            com.facebook.aura.conversation.view.ConversationListRowsKt$ConversationAgentPermissionRow$2 r12 = new com.facebook.aura.conversation.view.ConversationListRowsKt$ConversationAgentPermissionRow$2
            r13 = r10
            r16 = r2
            r15 = r1
            r14 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            r0.A06 = r12
        Lb5:
            return
        Lb6:
            r15.Afo()
            goto La3
        Lba:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L29
            int r0 = X.AnonymousClass004.A0f(r15, r1)
            r4 = r4 | r0
            goto L29
        Lc5:
            r4 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.ConversationListRowsKt.m519ConversationAgentPermissionRowuFdPcIQ(java.lang.String, float, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: ConversationTypingCursorRow-DzVHIIc, reason: not valid java name */
    public static final void m520ConversationTypingCursorRowDzVHIIc(String str, float f, HatchConversationTheme hatchConversationTheme, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchConversationTheme, 2);
        bfm.AgG(-1234093078);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchConversationTheme, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A0B(C3U4.A0C(HatchMessageEntryAnimationsKt.streamingCursorEntryAnimation(bRg2, bfm, (iA0d >> 9) & 14), 0.0f, f, 0.0f, 0.0f), 16.0f, 0.0f), "hatch-streaming-cursor");
            int i4 = HatchConversationTheme.$stable;
            float f2 = HatchMessageBubbleKt.BubbleHorizontalPadding;
            HatchAgentIndicatorsKt.m526HatchStreamingCursorKTwxG1Y(C3O5.A00(bfm) ? hatchConversationTheme.agentBubbleColorDark : hatchConversationTheme.agentBubbleColorLight, str, bRgA00, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConversationListRowsKt$ConversationTypingCursorRow$1(str, f, hatchConversationTheme, bRg2, i, i2);
        }
    }
}
