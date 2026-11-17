package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.io.File;

/* loaded from: classes.dex */
public interface AuraVmLogOutcome {

    public final class Success extends C06G implements AuraVmLogOutcome {
        public static final int $stable = 8;
        public final File file;
        public final int omittedRows;
        public final boolean truncated;

        public Success(File file, boolean z, int i) {
            C7384Etj.A0Y(file, 0);
            this.file = file;
            this.truncated = z;
            this.omittedRows = i;
        }

        public final Success copy(File file, boolean z, int i) {
            C7384Etj.A0Y(file, 0);
            return new Success(file, z, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (!C7384Etj.areEqual(this.file, success.file) || this.truncated != success.truncated || this.omittedRows != success.omittedRows) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Success copy$default(Success success, File file, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                file = success.file;
            }
            if ((i2 & 2) != 0) {
                z = success.truncated;
            }
            if ((i2 & 4) != 0) {
                i = success.omittedRows;
            }
            return success.copy(file, z, i);
        }

        public final File component1() {
            return this.file;
        }

        public final boolean component2() {
            return this.truncated;
        }

        public final int component3() {
            return this.omittedRows;
        }

        public final File getFile() {
            return this.file;
        }

        public final int getOmittedRows() {
            return this.omittedRows;
        }

        public final boolean getTruncated() {
            return this.truncated;
        }

        public int hashCode() {
            return C0KA.A01(AnonymousClass005.A0E(this.file), this.truncated) + this.omittedRows;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unavailable extends C06G implements AuraVmLogOutcome {
        public static final int $stable = 0;
        public final String diagnostic;
        public final int messageRes;
        public final boolean retryable;

        public Unavailable(int i, boolean z, String str) {
            C7384Etj.A0Y(str, 2);
            this.messageRes = i;
            this.retryable = z;
            this.diagnostic = str;
        }

        public final Unavailable copy(int i, boolean z, String str) {
            C7384Etj.A0Y(str, 2);
            return new Unavailable(i, z, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Unavailable) {
                    Unavailable unavailable = (Unavailable) obj;
                    if (this.messageRes != unavailable.messageRes || this.retryable != unavailable.retryable || !C7384Etj.areEqual(this.diagnostic, unavailable.diagnostic)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, int i, boolean z, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = unavailable.messageRes;
            }
            if ((i2 & 2) != 0) {
                z = unavailable.retryable;
            }
            if ((i2 & 4) != 0) {
                str = unavailable.diagnostic;
            }
            return unavailable.copy(i, z, str);
        }

        public final int component1() {
            return this.messageRes;
        }

        public final boolean component2() {
            return this.retryable;
        }

        public final String component3() {
            return this.diagnostic;
        }

        public final String getDiagnostic() {
            return this.diagnostic;
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.diagnostic, C0KA.A01(this.messageRes * 31, this.retryable));
        }

        public String toString() {
            return super.toString();
        }
    }
}
