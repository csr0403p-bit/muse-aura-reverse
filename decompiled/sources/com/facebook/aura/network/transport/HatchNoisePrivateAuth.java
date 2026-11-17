package com.facebook.aura.network.transport;

import X.AnonymousClass003;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.C9zv;
import java.util.Arrays;

/* loaded from: classes5.dex */
public interface HatchNoisePrivateAuth {

    public final class Authenticate implements HatchNoisePrivateAuth {
        public final HatchNoiseChipBindingPolicy chipBindingPolicy;
        public final byte[] hostData;
        public final String notaryEndorsement;
        public final byte[] rvKey;

        public /* synthetic */ Authenticate(String str, byte[] bArr, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy, int i, C06H c06h) {
            this(str, bArr, (i & 4) != 0 ? null : hatchNoiseChipBindingPolicy);
        }

        @Override // com.facebook.aura.network.transport.HatchNoisePrivateAuth
        public HatchNoiseChipBindingPolicy getChipBindingPolicy() {
            return this.chipBindingPolicy;
        }

        public final byte[] getCvmHostData() {
            byte[] bArr = this.hostData;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            C7384Etj.A0U(bArrCopyOf);
            return bArrCopyOf;
        }

        public final String getNotaryEndorsement() {
            return this.notaryEndorsement;
        }

        public final byte[] getRvKey() {
            return this.rvKey;
        }

        public Authenticate(String str, byte[] bArr, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy) {
            AnonymousClass003.A0u(str, bArr);
            this.notaryEndorsement = str;
            this.rvKey = bArr;
            this.chipBindingPolicy = hatchNoiseChipBindingPolicy;
            if (bArr.length == 32) {
                this.hostData = C9zv.A00(bArr);
                return;
            }
            throw C60O.A0i("RV key must be 32 bytes");
        }
    }

    public final class Discover implements HatchNoisePrivateAuth {
        public static final Discover INSTANCE = new Discover();
        public static final HatchNoiseChipBindingPolicy chipBindingPolicy = null;

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Discover);
        }

        @Override // com.facebook.aura.network.transport.HatchNoisePrivateAuth
        public HatchNoiseChipBindingPolicy getChipBindingPolicy() {
            return chipBindingPolicy;
        }

        public String toString() {
            return "Discover";
        }

        public int hashCode() {
            return 764270587;
        }
    }

    public final class DiscoverPinned implements HatchNoisePrivateAuth {
        public final HatchNoiseChipBindingPolicy chipBindingPolicy;

        public DiscoverPinned(HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy) {
            C7384Etj.A0Y(hatchNoiseChipBindingPolicy, 0);
            this.chipBindingPolicy = hatchNoiseChipBindingPolicy;
        }

        @Override // com.facebook.aura.network.transport.HatchNoisePrivateAuth
        public HatchNoiseChipBindingPolicy getChipBindingPolicy() {
            return this.chipBindingPolicy;
        }
    }

    HatchNoiseChipBindingPolicy getChipBindingPolicy();
}
