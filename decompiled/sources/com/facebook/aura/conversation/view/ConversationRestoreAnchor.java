package com.facebook.aura.conversation.view;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C00r;
import X.C06H;
import X.HtJ;
import X.HzP;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class ConversationRestoreAnchor {
    public static final int $stable = 0;
    public final C00r restoreCount$delegate;
    public final MutableState restoringKey$delegate;
    public final String savedKey;
    public final int savedOffsetPx;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.ConversationRestoreAnchor", f = "HatchConversationRestoreAnchor.kt", l = {R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "restore", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.ConversationRestoreAnchor$restore$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationRestoreAnchor.this.restore(null, null, this);
        }
    }

    public final void stopRestoring() {
        setRestoringKey(null);
    }

    private final void setRestoreCount(int i) {
        this.restoreCount$delegate.AdX(i);
    }

    private final void setRestoringKey(String str) {
        this.restoringKey$delegate.Af8(str);
    }

    public final int getRestoreCount() {
        return this.restoreCount$delegate.AGd();
    }

    public final String getRestoringKey() {
        return MutableState.A05(this.restoringKey$delegate);
    }

    public final String getSavedKey() {
        return this.savedKey;
    }

    public final int getSavedOffsetPx() {
        return this.savedOffsetPx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        if (r2 > 10) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object restore(androidx.compose.foundation.lazy.LazyListState r8, java.util.List<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.view.ConversationRestoreAnchor.AnonymousClass1
            if (r0 == 0) goto L9e
            r5 = r10
            com.facebook.aura.conversation.view.ConversationRestoreAnchor$restore$1 r5 = (com.facebook.aura.conversation.view.ConversationRestoreAnchor.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 != r3) goto La5
            X.Hwg.A00(r1)
        L20:
            java.lang.String r0 = r7.savedKey
            r7.setRestoringKey(r0)
            X.00r r0 = r7.restoreCount$delegate
            int r0 = r0.AGd()
            int r0 = r0 + 1
            r7.setRestoreCount(r0)
        L30:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L35:
            X.Hwg.A00(r1)
            java.lang.String r2 = r7.savedKey
            if (r2 == 0) goto L9c
            java.util.Iterator r1 = r9.iterator()
            r6 = 0
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9c
            boolean r0 = X.AnonymousClass007.A1P(r2, r1)
            if (r0 == 0) goto L95
            if (r6 < 0) goto L9c
            int r0 = r9.size()
            java.util.List r1 = r9.subList(r6, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L76
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L76
            r2 = 0
        L62:
            int r1 = r7.savedOffsetPx
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.I$0 = r6
            r5.I$1 = r2
            r5.label = r3
            java.lang.Object r0 = r8.A06(r6, r1, r5)
            if (r0 != r4) goto L20
            return r4
        L76:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L7b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationListItem.Message
            if (r0 == 0) goto L7b
            int r2 = r2 + 1
            if (r2 >= 0) goto L7b
            X.AbstractC0885AGm.A13()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L95:
            int r6 = r6 + 1
            goto L41
        L98:
            r0 = 10
            if (r2 <= r0) goto L62
        L9c:
            r3 = 0
            goto L30
        L9e:
            com.facebook.aura.conversation.view.ConversationRestoreAnchor$restore$1 r5 = new com.facebook.aura.conversation.view.ConversationRestoreAnchor$restore$1
            r5.<init>(r10)
            goto L12
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.ConversationRestoreAnchor.restore(androidx.compose.foundation.lazy.LazyListState, java.util.List, X.HtJ):java.lang.Object");
    }

    public ConversationRestoreAnchor(String str, int i, String str2) {
        this.savedKey = str;
        this.savedOffsetPx = i;
        this.restoringKey$delegate = AnonymousClass002.A0P(str2);
        this.restoreCount$delegate = new ParcelableSnapshotMutableIntState(0);
    }

    public /* synthetic */ ConversationRestoreAnchor(String str, int i, String str2, int i2, C06H c06h) {
        this(str, i, AnonymousClass006.A0t(i2, str2));
    }
}
