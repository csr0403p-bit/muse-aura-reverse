package com.facebook.aura.feed.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.feed.repo.FeedRpcMethod;
import com.facebook.aura.gateway.intf.GatewayEventHandler;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class FeedGatewayEventHandler implements GatewayEventHandler {
    public static final int $stable = 0;
    public static final FeedGatewayEventHandler INSTANCE = new FeedGatewayEventHandler();

    @Override // com.facebook.aura.gateway.intf.GatewayEventHandler
    public boolean handle(String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Z = AnonymousClass005.A1Z(str, jsonObject, abstractC3358CGz);
        if (!str.equals(FeedRpcMethod.Updated.INSTANCE.getValue()) && !str.equals(FeedRpcMethod.Changed.INSTANCE.getValue())) {
            return false;
        }
        handleChanged(jsonObject, abstractC3358CGz);
        return zA1Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[PHI: r2 r3 r4
  0x0039: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:23:0x0058, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r3v3 com.facebook.aura.feed.repo.FeedEditionKind) = (r3v1 com.facebook.aura.feed.repo.FeedEditionKind), (r3v4 com.facebook.aura.feed.repo.FeedEditionKind) binds: [B:23:0x0058, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:23:0x0058, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[PHI: r4
  0x0053: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v6 java.lang.String) binds: [B:17:0x0050, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[PHI: r3 r4
  0x0057: PHI (r3v1 com.facebook.aura.feed.repo.FeedEditionKind) = (r3v0 com.facebook.aura.feed.repo.FeedEditionKind), (r3v4 com.facebook.aura.feed.repo.FeedEditionKind) binds: [B:20:0x0054, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x0057: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String) binds: [B:20:0x0054, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[PHI: r4
  0x001b: PHI (r4v6 java.lang.String) = (r4v0 java.lang.String), (r4v7 java.lang.String) binds: [B:17:0x0050, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleChanged(kotlinx.serialization.json.JsonObject r7, X.AbstractC3358CGz r8) {
        /*
            r6 = this;
            kotlinx.serialization.json.JsonObject r7 = X.C60O.A1J(r7)
            com.facebook.aura.feed.repo.FeedGatewayEvents$Companion r0 = com.facebook.aura.feed.repo.FeedGatewayEvents.Companion
            com.facebook.aura.feed.repo.FeedGatewayEvents r6 = r0.getInstance(r8)
            java.lang.String r8 = ""
            r5 = 0
            if (r7 == 0) goto L4f
            java.lang.String r0 = "prompt_id"
            java.lang.String r4 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r7, r0, r8)
            int r0 = r4.length()
            if (r0 <= 0) goto L4f
        L1b:
            java.lang.String r0 = "kind"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r7, r0, r8)
            int r0 = r1.length()
            if (r0 <= 0) goto L53
            com.facebook.aura.feed.repo.FeedEditionKind$Companion r0 = com.facebook.aura.feed.repo.FeedEditionKind.Companion
            com.facebook.aura.feed.repo.FeedEditionKind r3 = r0.fromWire(r1)
        L2d:
            java.lang.String r0 = "local_date"
            java.lang.String r2 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r7, r0, r8)
            int r0 = r2.length()
            if (r0 <= 0) goto L57
        L39:
            java.lang.String r0 = "run_id"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r7, r0, r8)
            int r0 = r1.length()
            if (r0 <= 0) goto L46
            r5 = r1
        L46:
            com.facebook.aura.feed.repo.FeedUpdatedEvent r0 = new com.facebook.aura.feed.repo.FeedUpdatedEvent
            r0.<init>(r4, r3, r2, r5)
            r6.emitUpdate$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(r0)
            return
        L4f:
            r4 = r5
            if (r7 == 0) goto L53
            goto L1b
        L53:
            r3 = r5
            if (r7 == 0) goto L57
            goto L2d
        L57:
            r2 = r5
            if (r7 == 0) goto L46
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedGatewayEventHandler.handleChanged(kotlinx.serialization.json.JsonObject, X.CGz):void");
    }
}
