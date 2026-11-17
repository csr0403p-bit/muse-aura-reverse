package com.facebook.aura.conversation.repo;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchConversationHistoryReloader {
    public static final HatchConversationHistoryReloader INSTANCE = new HatchConversationHistoryReloader();
    public static final String TAG = "HatchConversationHistoryReloader";

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationHistoryReloader", f = "HatchConversationHistoryReloader.kt", l = {44}, m = "reload", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationHistoryReloader$reload$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationHistoryReloader.this.reload(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reload(X.AbstractC3358CGz r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.conversation.repo.HatchConversationHistoryReloader.AnonymousClass1
            if (r0 == 0) goto L22
            r4 = r7
            com.facebook.aura.conversation.repo.HatchConversationHistoryReloader$reload$1 r4 = (com.facebook.aura.conversation.repo.HatchConversationHistoryReloader.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L2c
            java.lang.Object r6 = r4.L$0
            X.CGz r6 = (X.AbstractC3358CGz) r6
            goto L28
        L22:
            com.facebook.aura.conversation.repo.HatchConversationHistoryReloader$reload$1 r4 = new com.facebook.aura.conversation.repo.HatchConversationHistoryReloader$reload$1
            r4.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r3)     // Catch: android.database.SQLException -> L45
            goto L4d
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r3)
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$Companion r0 = com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.Companion     // Catch: android.database.SQLException -> L45
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r0 = r0.getInstance(r6)     // Catch: android.database.SQLException -> L45
            r4.L$0 = r6     // Catch: android.database.SQLException -> L45
            r4.label = r1     // Catch: android.database.SQLException -> L45
            java.lang.Object r0 = r0.clearAllConversations(r4)     // Catch: android.database.SQLException -> L45
            if (r0 != r2) goto L4d
            return r2
        L45:
            r2 = move-exception
            java.lang.String r1 = "Offline conversation clear failed"
            java.lang.String r0 = "HatchConversationHistoryReloader"
            X.CFK.A0A(r0, r1, r2)
        L4d:
            com.facebook.aura.conversation.repo.HatchConversationHistoryReloads$Companion r0 = com.facebook.aura.conversation.repo.HatchConversationHistoryReloads.Companion
            com.facebook.aura.conversation.repo.HatchConversationHistoryReloads r0 = r0.getInstance(r6)
            r0.request()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationHistoryReloader.reload(X.CGz, X.HtJ):java.lang.Object");
    }
}
