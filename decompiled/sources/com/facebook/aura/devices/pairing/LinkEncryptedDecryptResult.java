package com.facebook.aura.devices.pairing;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes4.dex */
public interface LinkEncryptedDecryptResult {

    public final class Failure extends C06G implements LinkEncryptedDecryptResult {
        public static final int $stable = 0;
        public final Long actualCounter;
        public final Long expectedCounter;
        public final LinkEncryptedDecryptFailure reason;

        public Failure(LinkEncryptedDecryptFailure linkEncryptedDecryptFailure, Long l, Long l2) {
            C7384Etj.A0Y(linkEncryptedDecryptFailure, 0);
            this.reason = linkEncryptedDecryptFailure;
            this.expectedCounter = l;
            this.actualCounter = l2;
        }

        public final Failure copy(LinkEncryptedDecryptFailure linkEncryptedDecryptFailure, Long l, Long l2) {
            C7384Etj.A0Y(linkEncryptedDecryptFailure, 0);
            return new Failure(linkEncryptedDecryptFailure, l, l2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failure) {
                    Failure failure = (Failure) obj;
                    if (this.reason != failure.reason || !C7384Etj.areEqual(this.expectedCounter, failure.expectedCounter) || !C7384Etj.areEqual(this.actualCounter, failure.actualCounter)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, LinkEncryptedDecryptFailure linkEncryptedDecryptFailure, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                linkEncryptedDecryptFailure = failure.reason;
            }
            if ((i & 2) != 0) {
                l = failure.expectedCounter;
            }
            if ((i & 4) != 0) {
                l2 = failure.actualCounter;
            }
            return failure.copy(linkEncryptedDecryptFailure, l, l2);
        }

        public final LinkEncryptedDecryptFailure component1() {
            return this.reason;
        }

        public final Long component2() {
            return this.expectedCounter;
        }

        public final Long component3() {
            return this.actualCounter;
        }

        public final Long getActualCounter() {
            return this.actualCounter;
        }

        public final Long getExpectedCounter() {
            return this.expectedCounter;
        }

        public final LinkEncryptedDecryptFailure getReason() {
            return this.reason;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0E(this.reason) + AnonymousClass006.A0D(this.expectedCounter)) * 31) + C3cH.A02(this.actualCounter);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Failure(LinkEncryptedDecryptFailure linkEncryptedDecryptFailure, Long l, Long l2, int i, C06H c06h) {
            this(linkEncryptedDecryptFailure, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
        }
    }

    public final class Success extends C06G implements LinkEncryptedDecryptResult {
        public static final int $stable = 8;
        public final byte[] plaintext;

        public Success(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            this.plaintext = bArr;
        }

        public final Success copy(byte[] bArr) {
            C7384Etj.A0Y(bArr, 0);
            return new Success(bArr);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.plaintext, ((Success) obj).plaintext));
        }

        public static /* synthetic */ Success copy$default(Success success, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = success.plaintext;
            }
            C7384Etj.A0Y(bArr, 0);
            return new Success(bArr);
        }

        public final byte[] component1() {
            return this.plaintext;
        }

        public final byte[] getPlaintext() {
            return this.plaintext;
        }

        public int hashCode() {
            return Arrays.hashCode(this.plaintext);
        }

        public String toString() {
            return super.toString();
        }
    }
}
