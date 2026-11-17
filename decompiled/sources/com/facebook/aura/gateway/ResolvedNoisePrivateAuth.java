package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKey;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.network.transport.HatchNoiseChipBindingPolicy;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;

/* loaded from: classes5.dex */
public interface ResolvedNoisePrivateAuth extends AutoCloseable {

    public final class Authenticate implements ResolvedNoisePrivateAuth {
        public static final int $stable = 8;
        public final NoisePrivateAuthAttempt attempt;
        public final HatchNoiseChipBindingPolicy chipBindingPolicy;
        public final HatchVmConfidentiality confidentialityBeforeAttempt;
        public final String notaryEndorsement;
        public final ConfidentialVmRvKey rvKey;

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public <T> T consume(G0U<? super HatchNoisePrivateAuth, ? extends T> g0u) {
            C7384Etj.A0Y(g0u, 0);
            return (T) this.rvKey.consume(new ResolvedNoisePrivateAuth$Authenticate$consume$1(g0u, this));
        }

        public /* synthetic */ Authenticate(String str, ConfidentialVmRvKey confidentialVmRvKey, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy, int i, C06H c06h) {
            this(str, confidentialVmRvKey, (i & 4) != 0 ? null : hatchNoiseChipBindingPolicy);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.rvKey.close();
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public NoisePrivateAuthAttempt getAttempt() {
            return this.attempt;
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public HatchVmConfidentiality getConfidentialityBeforeAttempt() {
            return this.confidentialityBeforeAttempt;
        }

        public Authenticate(String str, ConfidentialVmRvKey confidentialVmRvKey, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy) {
            AnonymousClass003.A0u(str, confidentialVmRvKey);
            this.notaryEndorsement = str;
            this.rvKey = confidentialVmRvKey;
            this.chipBindingPolicy = hatchNoiseChipBindingPolicy;
            this.attempt = NoisePrivateAuthAttempt.AUTHENTICATE;
            this.confidentialityBeforeAttempt = HatchVmConfidentiality.CONFIDENTIAL;
        }
    }

    public final class Discover extends C06G implements ResolvedNoisePrivateAuth {
        public static final int $stable = 8;
        public final NoisePrivateAuthAttempt attempt;
        public final HatchNoiseChipBindingPolicy chipBindingPolicy;
        public final HatchVmConfidentiality confidentialityBeforeAttempt;

        public Discover(HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy) {
            C7384Etj.A0Y(hatchVmConfidentiality, 0);
            this.confidentialityBeforeAttempt = hatchVmConfidentiality;
            this.chipBindingPolicy = hatchNoiseChipBindingPolicy;
            this.attempt = NoisePrivateAuthAttempt.DISCOVER;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public <T> T consume(G0U<? super HatchNoisePrivateAuth, ? extends T> g0u) {
            C7384Etj.A0Y(g0u, 0);
            HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy = this.chipBindingPolicy;
            return g0u.invoke(hatchNoiseChipBindingPolicy != null ? new HatchNoisePrivateAuth.DiscoverPinned(hatchNoiseChipBindingPolicy) : HatchNoisePrivateAuth.Discover.INSTANCE);
        }

        public final Discover copy(HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy) {
            C7384Etj.A0Y(hatchVmConfidentiality, 0);
            return new Discover(hatchVmConfidentiality, hatchNoiseChipBindingPolicy);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Discover) {
                    Discover discover = (Discover) obj;
                    if (this.confidentialityBeforeAttempt != discover.confidentialityBeforeAttempt || !C7384Etj.areEqual(this.chipBindingPolicy, discover.chipBindingPolicy)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Discover copy$default(Discover discover, HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchVmConfidentiality = discover.confidentialityBeforeAttempt;
            }
            if ((i & 2) != 0) {
                hatchNoiseChipBindingPolicy = discover.chipBindingPolicy;
            }
            C7384Etj.A0Y(hatchVmConfidentiality, 0);
            return new Discover(hatchVmConfidentiality, hatchNoiseChipBindingPolicy);
        }

        public final HatchVmConfidentiality component1() {
            return this.confidentialityBeforeAttempt;
        }

        public final HatchNoiseChipBindingPolicy component2() {
            return this.chipBindingPolicy;
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public NoisePrivateAuthAttempt getAttempt() {
            return this.attempt;
        }

        public final HatchNoiseChipBindingPolicy getChipBindingPolicy() {
            return this.chipBindingPolicy;
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public HatchVmConfidentiality getConfidentialityBeforeAttempt() {
            return this.confidentialityBeforeAttempt;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.confidentialityBeforeAttempt) + AnonymousClass006.A0D(this.chipBindingPolicy);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Discover(HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy, int i, C06H c06h) {
            this(hatchVmConfidentiality, (i & 2) != 0 ? null : hatchNoiseChipBindingPolicy);
        }
    }

    public final class Legacy implements ResolvedNoisePrivateAuth {
        public static final int $stable = 0;
        public static final Legacy INSTANCE = new Legacy();
        public static final NoisePrivateAuthAttempt attempt = NoisePrivateAuthAttempt.LEGACY;
        public static final HatchVmConfidentiality confidentialityBeforeAttempt = HatchVmConfidentiality.STANDARD;

        @Override // java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public <T> T consume(G0U<? super HatchNoisePrivateAuth, ? extends T> g0u) {
            C7384Etj.A0Y(g0u, 0);
            return g0u.invoke(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Legacy);
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public NoisePrivateAuthAttempt getAttempt() {
            return attempt;
        }

        @Override // com.facebook.aura.gateway.ResolvedNoisePrivateAuth
        public HatchVmConfidentiality getConfidentialityBeforeAttempt() {
            return confidentialityBeforeAttempt;
        }

        public String toString() {
            return "Legacy";
        }

        public int hashCode() {
            return -1769293004;
        }
    }

    <T> T consume(G0U<? super HatchNoisePrivateAuth, ? extends T> g0u);

    NoisePrivateAuthAttempt getAttempt();

    HatchVmConfidentiality getConfidentialityBeforeAttempt();
}
