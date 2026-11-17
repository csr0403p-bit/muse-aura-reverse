package com.facebook.aura.devices.pairing;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.devices.token.LinkDeviceKey;

/* loaded from: classes4.dex */
public interface LinkDeviceKeyMintResult {

    public final class Failed extends C06G implements LinkDeviceKeyMintResult {
        public static final int $stable = 0;
        public final LinkDeviceKeySetupFailure failure;

        public Failed(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            this.failure = linkDeviceKeySetupFailure;
        }

        public final Failed copy(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            return new Failed(linkDeviceKeySetupFailure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.failure == ((Failed) obj).failure);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, LinkDeviceKeySetupFailure linkDeviceKeySetupFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeySetupFailure = failed.failure;
            }
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            return new Failed(linkDeviceKeySetupFailure);
        }

        public final LinkDeviceKeySetupFailure component1() {
            return this.failure;
        }

        public final LinkDeviceKeySetupFailure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Minted implements LinkDeviceKeyMintResult {
        public static final int $stable = 8;
        public final LinkDeviceKey key;

        public Minted(LinkDeviceKey linkDeviceKey) {
            C7384Etj.A0Y(linkDeviceKey, 0);
            this.key = linkDeviceKey;
        }

        public final LinkDeviceKey getKey() {
            return this.key;
        }
    }
}
