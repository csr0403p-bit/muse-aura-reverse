package com.facebook.aura.gateway.noise.carrier;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;
import com.facebook.aura.network.transport.HatchNoisePrivateAuthKt;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class AttestationVerifierHolder {
    public static final Companion Companion = new Companion();
    public final byte[] expectedHostData;
    public final boolean isNoOp;
    public final HybridData mHybridData;

    public AttestationVerifierHolder(HybridData hybridData, boolean z, byte[] bArr) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
        this.isNoOp = z;
        this.expectedHostData = bArr;
    }

    public static final native HybridData createNoOpNative();

    public static final native HybridData createSnpNative(boolean z);

    public static final native HybridData createSnpWithChipBindingNative(String str, String str2, String[] strArr, String[] strArr2, byte[] bArr, boolean z);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final boolean bindsOwnerOf(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return HatchNoisePrivateAuthKt.isCvmHostDataFor(bArr, this.expectedHostData);
    }

    public final class Companion {
        private final HybridData createSnpWithChipBindingNative(String str, String str2, String[] strArr, String[] strArr2, byte[] bArr, boolean z) {
            return AttestationVerifierHolder.createSnpWithChipBindingNative(str, str2, strArr, strArr2, bArr, z);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final HybridData createNoOpNative() {
            return AttestationVerifierHolder.createNoOpNative();
        }

        private final HybridData createSnpNative(boolean z) {
            return AttestationVerifierHolder.createSnpNative(z);
        }

        public final AttestationVerifierHolder createNoOp() {
            return new AttestationVerifierHolder(AttestationVerifierHolder.createNoOpNative(), true, null);
        }

        public final AttestationVerifierHolder createSnp(boolean z) {
            return new AttestationVerifierHolder(AttestationVerifierHolder.createSnpNative(z), false, null);
        }

        public Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[PHI: r3
  0x0065: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:36:0x0062, B:23:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[PHI: r3 r4
  0x0069: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String), (r3v5 java.lang.String) binds: [B:39:0x0066, B:26:0x0041, B:28:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String), (r4v4 java.lang.String) binds: [B:39:0x0066, B:26:0x0041, B:28:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder createSnp(com.facebook.aura.network.transport.HatchNoisePrivateAuth r7, boolean r8) {
            /*
                r6 = this;
                r2 = 0
                X.C7384Etj.A0Y(r7, r2)
                com.facebook.aura.network.transport.HatchNoisePrivateAuth$Discover r0 = com.facebook.aura.network.transport.HatchNoisePrivateAuth.Discover.INSTANCE
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L11
                com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder r1 = r6.createSnp(r8)
                return r1
            L11:
                boolean r0 = r7 instanceof com.facebook.aura.network.transport.HatchNoisePrivateAuth.DiscoverPinned
                if (r0 != 0) goto L1e
                boolean r0 = r7 instanceof com.facebook.aura.network.transport.HatchNoisePrivateAuth.Authenticate
                if (r0 != 0) goto L1e
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L1e:
                com.facebook.aura.network.transport.HatchNoiseChipBindingPolicy r1 = r7.getChipBindingPolicy()
                boolean r0 = r7 instanceof com.facebook.aura.network.transport.HatchNoisePrivateAuth.Authenticate
                r6 = 0
                if (r0 == 0) goto L6d
                com.facebook.aura.network.transport.HatchNoisePrivateAuth$Authenticate r7 = (com.facebook.aura.network.transport.HatchNoisePrivateAuth.Authenticate) r7
                if (r7 == 0) goto L6d
                byte[] r7 = r7.getCvmHostData()
            L2f:
                com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder$Companion r0 = com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder.Companion
                if (r1 == 0) goto L61
                com.facebook.aura.network.transport.HatchNoiseChipAuthorization r0 = r1.authorization
                if (r0 == 0) goto L61
                java.lang.String r3 = r0.claimId
            L39:
                com.facebook.aura.network.transport.HatchNoiseChipAuthorization r0 = r1.authorization
                if (r0 == 0) goto L65
                java.lang.String r4 = r0.ownerNonce
            L3f:
                com.facebook.aura.network.transport.HatchNoiseChipAuthorization r0 = r1.authorization
                if (r0 == 0) goto L69
                java.util.List<java.lang.String> r0 = r0.chipIds
                if (r0 == 0) goto L69
                java.lang.String[] r5 = X.BV4.A1b(r0)
            L4b:
                java.util.List<java.lang.String> r1 = r1.selectedChipIds
                if (r1 == 0) goto L57
                java.lang.String[] r0 = new java.lang.String[r2]
                java.lang.Object[] r6 = r1.toArray(r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
            L57:
                com.facebook.jni.HybridData r0 = com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder.createSnpWithChipBindingNative(r3, r4, r5, r6, r7, r8)
                com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder r1 = new com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder
                r1.<init>(r0, r2, r7)
                return r1
            L61:
                r3 = r6
                if (r1 == 0) goto L65
                goto L39
            L65:
                r4 = r6
                if (r1 == 0) goto L69
                goto L3f
            L69:
                r5 = r6
                if (r1 == 0) goto L57
                goto L4b
            L6d:
                r7 = r6
                goto L2f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder.Companion.createSnp(com.facebook.aura.network.transport.HatchNoisePrivateAuth, boolean):com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder");
        }
    }

    static {
        NoiseGatewayCarrierSoLoader.ensureLoaded();
    }

    public static final AttestationVerifierHolder createNoOp() {
        return Companion.createNoOp();
    }

    public static final AttestationVerifierHolder createSnp(boolean z) {
        return Companion.createSnp(z);
    }

    public final boolean isNoOp() {
        return this.isNoOp;
    }

    public static final AttestationVerifierHolder createSnp(HatchNoisePrivateAuth hatchNoisePrivateAuth, boolean z) {
        return Companion.createSnp(hatchNoisePrivateAuth, z);
    }
}
