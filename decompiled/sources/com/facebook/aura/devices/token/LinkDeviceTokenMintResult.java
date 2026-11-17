package com.facebook.aura.devices.token;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface LinkDeviceTokenMintResult {

    public final class Failed implements LinkDeviceTokenMintResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -696390183;
        }
    }

    public final class Minted extends C06G implements LinkDeviceTokenMintResult {
        public final LinkDeviceTokenPair tokenPair;

        public Minted(LinkDeviceTokenPair linkDeviceTokenPair) {
            C7384Etj.A0Y(linkDeviceTokenPair, 0);
            this.tokenPair = linkDeviceTokenPair;
        }

        public final Minted copy(LinkDeviceTokenPair linkDeviceTokenPair) {
            C7384Etj.A0Y(linkDeviceTokenPair, 0);
            return new Minted(linkDeviceTokenPair);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Minted) && C7384Etj.areEqual(this.tokenPair, ((Minted) obj).tokenPair));
        }

        public static /* synthetic */ Minted copy$default(Minted minted, LinkDeviceTokenPair linkDeviceTokenPair, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceTokenPair = minted.tokenPair;
            }
            C7384Etj.A0Y(linkDeviceTokenPair, 0);
            return new Minted(linkDeviceTokenPair);
        }

        public final LinkDeviceTokenPair component1() {
            return this.tokenPair;
        }

        public final LinkDeviceTokenPair getTokenPair() {
            return this.tokenPair;
        }

        public int hashCode() {
            return this.tokenPair.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class RevokeUnknown implements LinkDeviceTokenMintResult {
        public static final RevokeUnknown INSTANCE = new RevokeUnknown();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RevokeUnknown);
        }

        public String toString() {
            return "RevokeUnknown";
        }

        public int hashCode() {
            return -999632440;
        }
    }

    public final class SdkTokenRejected extends C06G implements LinkDeviceTokenMintResult {
        public final LinkSdkTokenFailure failure;

        public SdkTokenRejected(LinkSdkTokenFailure linkSdkTokenFailure) {
            C7384Etj.A0Y(linkSdkTokenFailure, 0);
            this.failure = linkSdkTokenFailure;
        }

        public final SdkTokenRejected copy(LinkSdkTokenFailure linkSdkTokenFailure) {
            C7384Etj.A0Y(linkSdkTokenFailure, 0);
            return new SdkTokenRejected(linkSdkTokenFailure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SdkTokenRejected) && this.failure == ((SdkTokenRejected) obj).failure);
        }

        public static /* synthetic */ SdkTokenRejected copy$default(SdkTokenRejected sdkTokenRejected, LinkSdkTokenFailure linkSdkTokenFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                linkSdkTokenFailure = sdkTokenRejected.failure;
            }
            C7384Etj.A0Y(linkSdkTokenFailure, 0);
            return new SdkTokenRejected(linkSdkTokenFailure);
        }

        public final LinkSdkTokenFailure component1() {
            return this.failure;
        }

        public final LinkSdkTokenFailure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
