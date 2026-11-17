package com.facebook.aura.conversation.view;

import X.AT5;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C3UC;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchMessageEntryAnimationsKt {
    public static final int AGENT_BUBBLE_ENTRY_DURATION_MS = 280;
    public static final int APPROVAL_ROW_TRANSITION_DURATION_MS = 280;
    public static final int LIVE_USER_ROW_ENTRY_DURATION_MS = 200;
    public static final int PRESENTATION_ENTRY_DURATION_MS = 280;
    public static final int USER_MESSAGE_ENTRY_DURATION_MS = 220;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg approvalRowTransition(X.BRg r7, boolean r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            java.lang.Object r4 = r10.AaT()
            java.lang.Object r3 = X.C78N.A00
            r6 = 0
            if (r4 != r3) goto L15
            float r0 = X.AnonymousClass003.A02(r8)
            X.AT5 r4 = X.AnonymousClass002.A0I(r10, r0)
        L15:
            X.AT5 r4 = (X.AT5) r4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L29
            boolean r0 = r10.A66(r9)
            if (r0 != 0) goto L2e
        L29:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L2f
        L2e:
            r0 = 1
        L2f:
            boolean r1 = X.AnonymousClass001.A1T(r10, r4, r0)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3b
            if (r0 != r3) goto L43
        L3b:
            com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$approvalRowTransition$1$1 r0 = new com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$approvalRowTransition$1$1
            r0.<init>(r9, r4, r6)
            r10.Ai0(r0)
        L43:
            X.AnonymousClass001.A18(r10, r0, r5)
            boolean r1 = r10.A67(r4)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L52
            if (r0 != r3) goto L5a
        L52:
            com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$approvalRowTransition$2$1 r0 = new com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$approvalRowTransition$2$1
            r0.<init>(r4)
            r10.Ai0(r0)
        L5a:
            X.BRg r2 = X.AnonymousClass001.A0W(r7, r0)
            boolean r1 = r10.A67(r4)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L6a
            if (r0 != r3) goto L72
        L6a:
            com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$approvalRowTransition$3$1 r0 = new com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$approvalRowTransition$3$1
            r0.<init>(r4)
            r10.Ai0(r0)
        L72:
            X.G0W r0 = (X.G0W) r0
            X.BRg r0 = X.C3UC.A00(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt.approvalRowTransition(X.BRg, boolean, boolean, X.BFM, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /* renamed from: messageEntryAnimation-hGBTI10, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m641messageEntryAnimationhGBTI10(X.BRg r14, com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r15, java.lang.String r16, float r17, boolean r18, boolean r19, X.BFM r20, int r21) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt.m641messageEntryAnimationhGBTI10(X.BRg, com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, java.lang.String, float, boolean, boolean, X.BFM, int):X.BRg");
    }

    public static final BRg streamingCursorEntryAnimation(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        AT5 at5 = (AT5) AnonymousClass005.A0e(bfm, objAaT, obj);
        Unit unit = Unit.INSTANCE;
        boolean zA67 = bfm.A67(at5);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj) {
            objAaT2 = new HatchMessageEntryAnimationsKt$streamingCursorEntryAnimation$1$1(at5, null);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, unit);
        boolean zA672 = bfm.A67(at5);
        Object objAaT3 = bfm.AaT();
        if (zA672 || objAaT3 == obj) {
            objAaT3 = new HatchMessageEntryAnimationsKt$streamingCursorEntryAnimation$2$1(at5);
            bfm.Ai0(objAaT3);
        }
        BRg bRgA00 = C3UC.A00(bRg, (G0W) objAaT3);
        boolean zA673 = bfm.A67(at5);
        Object objAaT4 = bfm.AaT();
        if (zA673 || objAaT4 == obj) {
            objAaT4 = new HatchMessageEntryAnimationsKt$streamingCursorEntryAnimation$3$1(at5);
            bfm.Ai0(objAaT4);
        }
        return AnonymousClass001.A0W(bRgA00, objAaT4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg presentationEntryAnimation(X.BRg r8, java.lang.String r9, boolean r10, X.BFM r11, int r12) {
        /*
            X.AnonymousClass003.A0u(r8, r9)
            r0 = 916202895(0x369c258f, float:4.6535347E-6)
            r11.AgE(r0)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r6 = 0
            if (r0 <= r1) goto L18
            boolean r0 = r11.A65(r9)
            if (r0 != 0) goto L1d
        L18:
            r0 = r12 & 48
            r2 = 0
            if (r0 != r1) goto L1e
        L1d:
            r2 = 1
        L1e:
            r0 = r12 & 896(0x380, float:1.256E-42)
            r7 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r7 <= r5) goto L2c
            boolean r0 = r11.A66(r10)
            if (r0 != 0) goto L31
        L2c:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r5) goto L32
        L31:
            r0 = 1
        L32:
            r2 = r2 | r0
            java.lang.Object r3 = r11.AaT()
            r4 = 0
            if (r2 != 0) goto L3e
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L46
        L3e:
            float r0 = X.AnonymousClass003.A02(r10)
            X.AT5 r3 = X.AnonymousClass002.A0I(r11, r0)
        L46:
            X.AT5 r3 = (X.AT5) r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            if (r7 <= r5) goto L54
            boolean r0 = r11.A66(r10)
            if (r0 != 0) goto L58
        L54:
            r0 = r12 & 384(0x180, float:5.38E-43)
            if (r0 != r5) goto L59
        L58:
            r6 = 1
        L59:
            boolean r1 = X.AnonymousClass001.A1S(r11, r3, r6)
            java.lang.Object r0 = r11.AaT()
            if (r1 != 0) goto L67
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L6f
        L67:
            com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1 r0 = new com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1
            r0.<init>(r10, r3, r4)
            r11.Ai0(r0)
        L6f:
            X.AnonymousClass001.A1A(r11, r0, r9, r2)
            if (r10 == 0) goto Laa
            boolean r1 = r11.A67(r3)
            java.lang.Object r0 = r11.AaT()
            if (r1 != 0) goto L82
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L8a
        L82:
            com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$presentationEntryAnimation$2$1 r0 = new com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$presentationEntryAnimation$2$1
            r0.<init>(r3)
            r11.Ai0(r0)
        L8a:
            X.BRg r2 = X.AnonymousClass001.A0W(r8, r0)
            boolean r1 = r11.A67(r3)
            java.lang.Object r0 = r11.AaT()
            if (r1 != 0) goto L9c
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto La4
        L9c:
            com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$presentationEntryAnimation$3$1 r0 = new com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$presentationEntryAnimation$3$1
            r0.<init>(r3)
            r11.Ai0(r0)
        La4:
            X.G0W r0 = (X.G0W) r0
            X.BRg r8 = X.C3UC.A00(r2, r0)
        Laa:
            X.AnonymousClass002.A19(r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt.presentationEntryAnimation(X.BRg, java.lang.String, boolean, X.BFM, int):X.BRg");
    }
}
