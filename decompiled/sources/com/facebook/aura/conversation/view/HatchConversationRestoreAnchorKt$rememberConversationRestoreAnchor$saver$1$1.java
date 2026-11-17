package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C1bi;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$1 extends AbstractC7559F3s implements G0V<C1bi, ConversationRestoreAnchor, List<? extends Object>> {
    public final /* synthetic */ C1BO<Function0<Boolean>> $currentCanRecord$delegate;
    public final /* synthetic */ C1BO<Function0<Boolean>> $currentIsAtNewest$delegate;
    public final /* synthetic */ LazyListState $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$1(LazyListState lazyListState, C1BO<? extends Function0<Boolean>> c1bo, C1BO<? extends Function0<Boolean>> c1bo2) {
        super(2);
        this.$listState = lazyListState;
        this.$currentCanRecord$delegate = c1bo;
        this.$currentIsAtNewest$delegate = c1bo2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    @Override // X.G0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.Object> invoke(X.C1bi r4, com.facebook.aura.conversation.view.ConversationRestoreAnchor r5) {
        /*
            r3 = this;
            r0 = 1
            X.C7384Etj.A0Y(r5, r0)
            X.1BO<kotlin.jvm.functions.Function0<java.lang.Boolean>> r0 = r3.$currentCanRecord$delegate
            kotlin.jvm.functions.Function0 r0 = X.C1BO.A0A(r0)
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            r1 = 0
            if (r0 == 0) goto L3a
            X.1BO<kotlin.jvm.functions.Function0<java.lang.Boolean>> r0 = r3.$currentIsAtNewest$delegate
            kotlin.jvm.functions.Function0 r0 = X.C1BO.A0A(r0)
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 == 0) goto L2b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = 0
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
        L2b:
            androidx.compose.foundation.lazy.LazyListState r0 = r3.$listState
            java.lang.String r2 = com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt.firstLaidOutKey(r0)
            if (r2 == 0) goto L3a
            androidx.compose.foundation.lazy.LazyListState r0 = r3.$listState
            int r0 = r0.A03()
            goto L3e
        L3a:
            java.lang.String r2 = r5.savedKey
            int r0 = r5.savedOffsetPx
        L3e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            androidx.compose.runtime.MutableState r0 = r5.restoringKey$delegate
            java.lang.String r0 = androidx.compose.runtime.MutableState.A05(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationRestoreAnchorKt$rememberConversationRestoreAnchor$saver$1$1.invoke(X.1bi, com.facebook.aura.conversation.view.ConversationRestoreAnchor):java.util.List");
    }
}
