package com.facebook.aura.conversation.view;

import X.AnonymousClass003;
import X.C1160Acs;
import X.C16C;
import androidx.compose.foundation.lazy.LazyListState;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class HatchConversationRestoreAnchorKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.view.ConversationRestoreAnchor rememberConversationRestoreAnchor(androidx.compose.foundation.lazy.LazyListState r9, kotlin.jvm.functions.Function0<? extends java.util.List<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r10, kotlin.jvm.functions.Function0<java.lang.Boolean> r11, kotlin.jvm.functions.Function0<java.lang.Boolean> r12, kotlin.jvm.functions.Function0<kotlin.Unit> r13, X.BFM r14, int r15) {
        /*
            r2 = 0
            X.C7384Etj.A0Y(r9, r2)
            r0 = 1
            X.AnonymousClass005.A11(r10, r11, r12, r0)
            r3 = 4
            X.C7384Etj.A0Y(r13, r3)
            androidx.compose.runtime.MutableState r10 = X.C1er.A00(r14, r10)
            androidx.compose.runtime.MutableState r7 = X.C1er.A00(r14, r11)
            androidx.compose.runtime.MutableState r8 = X.C1er.A00(r14, r12)
            androidx.compose.runtime.MutableState r11 = X.C1er.A00(r14, r13)
            r0 = r15 & 14
            r5 = r0 ^ 6
            r4 = 1
            if (r5 <= r3) goto L29
            boolean r0 = r14.A65(r9)
            if (r0 != 0) goto L2e
        L29:
            r1 = r15 & 6
            r0 = 0
            if (r1 != r3) goto L2f
        L2e:
            r0 = 1
        L2f:
            java.lang.Object r6 = r14.AaT()
            if (r0 != 0) goto L39
            java.lang.Object r0 = X.C78N.A00
            if (r6 != r0) goto L47
        L39:
            com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$1 r1 = new com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$1
            r1.<init>(r9, r7, r8)
            com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$2 r0 = com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$2.INSTANCE
            X.AFu r6 = X.AbstractC0871AFr.A00(r0, r1)
            r14.Ai0(r6)
        L47:
            X.AFs r6 = (X.AFs) r6
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r14.AaT()
            java.lang.Object r2 = X.C78N.A00
            if (r0 != r2) goto L58
            com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$anchor$1$1 r0 = com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$anchor$1$1.INSTANCE
            r14.Ai0(r0)
        L58:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            java.lang.Object r8 = X.AFz.A01(r14, r6, r0, r1)
            com.facebook.aura.conversation.view.ConversationRestoreAnchor r8 = (com.facebook.aura.conversation.view.ConversationRestoreAnchor) r8
            boolean r1 = X.AnonymousClass003.A1K(r14, r8, r10)
            if (r5 <= r3) goto L6c
            boolean r0 = r14.A65(r9)
            if (r0 != 0) goto L71
        L6c:
            r0 = r15 & 6
            if (r0 == r3) goto L71
            r4 = 0
        L71:
            boolean r0 = X.AnonymousClass002.A1W(r14, r11, r1, r4)
            java.lang.Object r7 = r14.AaT()
            if (r0 != 0) goto L7d
            if (r7 != r2) goto L86
        L7d:
            r12 = 0
            com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1 r7 = new com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$1$1
            r7.<init>(r8, r9, r10, r11, r12)
            r14.Ai0(r7)
        L86:
            X.AnonymousClass001.A18(r14, r7, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt.rememberConversationRestoreAnchor(androidx.compose.foundation.lazy.LazyListState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int):com.facebook.aura.conversation.view.ConversationRestoreAnchor");
    }

    public static final String firstLaidOutKey(LazyListState lazyListState) {
        Object next;
        Iterator it = AnonymousClass003.A0j(lazyListState).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C1160Acs) ((C16C) next)).A07 == lazyListState.A02()) {
                break;
            }
        }
        C16C c16c = (C16C) next;
        Object obj = c16c != null ? ((C1160Acs) c16c).A0B : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
