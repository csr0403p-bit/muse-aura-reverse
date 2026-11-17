package com.facebook.aura.hatchlockcrypto;

import X.AbstractC0903AHf;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.security.MessageDigest;

/* loaded from: classes6.dex */
public final class HatchArgon2Hasher implements HatchPassphraseHasher {
    public static final Companion Companion = new Companion();
    public final KDFAlgorithm algorithm;
    public final Parameters parameters;

    public final class Parameters extends C06G {
        public static final Companion Companion = new Companion();
        public static final Parameters DEFAULT = new Parameters(65536, 4, 3, 16, 32);
        public final int hashLength;
        public final int iterations;
        public final int memoryKB;
        public final int parallelism;
        public final int saltLength;

        public final class Companion {
            public final Parameters getDEFAULT() {
                return Parameters.DEFAULT;
            }

            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Parameters) {
                    Parameters parameters = (Parameters) obj;
                    if (this.memoryKB != parameters.memoryKB || this.parallelism != parameters.parallelism || this.iterations != parameters.iterations || this.saltLength != parameters.saltLength || this.hashLength != parameters.hashLength) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = parameters.memoryKB;
            }
            if ((i6 & 2) != 0) {
                i2 = parameters.parallelism;
            }
            if ((i6 & 4) != 0) {
                i3 = parameters.iterations;
            }
            if ((i6 & 8) != 0) {
                i4 = parameters.saltLength;
            }
            if ((i6 & 16) != 0) {
                i5 = parameters.hashLength;
            }
            return parameters.copy(i, i2, i3, i4, i5);
        }

        public final int component1() {
            return this.memoryKB;
        }

        public final int component2() {
            return this.parallelism;
        }

        public final int component3() {
            return this.iterations;
        }

        public final int component4() {
            return this.saltLength;
        }

        public final int component5() {
            return this.hashLength;
        }

        public final Parameters copy(int i, int i2, int i3, int i4, int i5) {
            return new Parameters(i, i2, i3, i4, i5);
        }

        public final int getHashLength() {
            return this.hashLength;
        }

        public final int getIterations() {
            return this.iterations;
        }

        public final int getMemoryKB() {
            return this.memoryKB;
        }

        public final int getParallelism() {
            return this.parallelism;
        }

        public final int getSaltLength() {
            return this.saltLength;
        }

        public int hashCode() {
            return (((((((this.memoryKB * 31) + this.parallelism) * 31) + this.iterations) * 31) + this.saltLength) * 31) + this.hashLength;
        }

        public Parameters(int i, int i2, int i3, int i4, int i5) {
            this.memoryKB = i;
            this.parallelism = i2;
            this.iterations = i3;
            this.saltLength = i4;
            this.hashLength = i5;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144 A[PHI: r24
  0x0144: PHI (r24v3 boolean) = (r24v0 boolean), (r24v4 boolean) binds: [B:57:0x0142, B:55:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147 A[PHI: r24
  0x0147: PHI (r24v2 boolean) = (r24v0 boolean), (r24v3 boolean) binds: [B:57:0x0142, B:59:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    @Override // com.facebook.aura.hatchlockcrypto.HatchPassphraseHasher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.hatchlockcrypto.PassphraseHashResult hash(byte[] r37, byte[] r38) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hatchlockcrypto.HatchArgon2Hasher.hash(byte[], byte[]):com.facebook.aura.hatchlockcrypto.PassphraseHashResult");
    }

    public HatchArgon2Hasher() {
        this(Parameters.DEFAULT);
    }

    @Override // com.facebook.aura.hatchlockcrypto.HatchPassphraseHasher
    public KDFAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final byte[] deriveSalt(String str) {
            C7384Etj.A0Y(str, 0);
            byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(C3cG.A1S(FGI.A0M("hatch-lockout://", str)));
            C7384Etj.A0X(bArrDigest);
            return AbstractC0903AHf.A06(bArrDigest, 0, 16);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchArgon2Hasher(Parameters parameters, int i, C06H c06h) {
        this((i & 1) != 0 ? Parameters.DEFAULT : parameters);
    }

    public HatchArgon2Hasher(Parameters parameters) {
        C7384Etj.A0Y(parameters, 0);
        this.parameters = parameters;
        this.algorithm = KDFAlgorithm.ARGON2ID;
    }
}
