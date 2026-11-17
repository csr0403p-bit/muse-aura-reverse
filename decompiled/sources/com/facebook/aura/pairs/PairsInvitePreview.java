package com.facebook.aura.pairs;

import X.C06H;

/* loaded from: classes3.dex */
public final class PairsInvitePreview {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String agentName;
    public final String displayName;
    public final String inviterMuseId;
    public final boolean isSupportedVersion;
    public final PairsLevel offeredLevel;
    public final String photoSha256;
    public final String relationshipGenerationId;
    public final Long requestExpiresAtMs;

    public final String getAgentName() {
        return this.agentName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getInviterMuseId() {
        return this.inviterMuseId;
    }

    public final PairsLevel getOfferedLevel() {
        return this.offeredLevel;
    }

    public final String getPhotoSha256() {
        return this.photoSha256;
    }

    public final String getRelationshipGenerationId() {
        return this.relationshipGenerationId;
    }

    public final Long getRequestExpiresAtMs() {
        return this.requestExpiresAtMs;
    }

    public final boolean isSupportedVersion() {
        return this.isSupportedVersion;
    }

    public final class Companion {
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>, still in use, count: 2, list:
              (r4v2 java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>) from 0x0046: IF  (r4v2 java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>) == (null java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>)  -> B:18:0x0048 A[HIDDEN] (LINE:70)
              (r4v2 java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>) from 0x004b: PHI (r4v1 java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>) = 
              (r4v0 java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>)
              (r4v2 java.util.Map<java.lang.Long, com.facebook.aura.pairs.WireValue>)
             binds: [B:19:0x0049, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.pairs.PairsInvitePreview parse(java.lang.String r16) {
            /*
                Method dump skipped, instructions count: 345
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInvitePreview.Companion.parse(java.lang.String):com.facebook.aura.pairs.PairsInvitePreview");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PairsInvitePreview(String str, String str2, PairsLevel pairsLevel, Long l, String str3, String str4, boolean z, String str5) {
        this.displayName = str;
        this.agentName = str2;
        this.offeredLevel = pairsLevel;
        this.requestExpiresAtMs = l;
        this.relationshipGenerationId = str3;
        this.inviterMuseId = str4;
        this.isSupportedVersion = z;
        this.photoSha256 = str5;
    }
}
