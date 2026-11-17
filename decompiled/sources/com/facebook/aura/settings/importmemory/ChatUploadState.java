package com.facebook.aura.settings.importmemory;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface ChatUploadState {

    public final class Idle implements ChatUploadState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -1341651273;
        }
    }

    public final class Uploaded extends C06G implements ChatUploadState {
        public static final int $stable = 0;
        public final String fileName;
        public final String workspacePath;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Uploaded) {
                    Uploaded uploaded = (Uploaded) obj;
                    if (!C7384Etj.areEqual(this.workspacePath, uploaded.workspacePath) || !C7384Etj.areEqual(this.fileName, uploaded.fileName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Uploaded copy$default(Uploaded uploaded, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploaded.workspacePath;
            }
            if ((i & 2) != 0) {
                str2 = uploaded.fileName;
            }
            AnonymousClass003.A0u(str, str2);
            return new Uploaded(str, str2);
        }

        public final String component1() {
            return this.workspacePath;
        }

        public final String component2() {
            return this.fileName;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getWorkspacePath() {
            return this.workspacePath;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.fileName, AnonymousClass001.A0G(this.workspacePath));
        }

        public Uploaded(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.workspacePath = str;
            this.fileName = str2;
        }

        public final Uploaded copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Uploaded(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Uploading extends C06G implements ChatUploadState {
        public static final int $stable = 0;
        public final String fileName;

        public Uploading(String str) {
            C7384Etj.A0Y(str, 0);
            this.fileName = str;
        }

        public final Uploading copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Uploading(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Uploading) && C7384Etj.areEqual(this.fileName, ((Uploading) obj).fileName));
        }

        public static /* synthetic */ Uploading copy$default(Uploading uploading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploading.fileName;
            }
            C7384Etj.A0Y(str, 0);
            return new Uploading(str);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            return this.fileName.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
