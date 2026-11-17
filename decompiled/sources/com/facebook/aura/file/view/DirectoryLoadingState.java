package com.facebook.aura.file.view;

import X.AHD;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.library.repo.WorkspaceEntry;

/* loaded from: classes.dex */
public abstract class DirectoryLoadingState {
    public static final int $stable = 8;

    public final class Error extends DirectoryLoadingState {
        public static final int $stable = 0;
        public final String message;

        public Error(String str) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
        }

        public final Error copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Error(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.message, ((Error) obj).message));
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            C7384Etj.A0Y(str, 0);
            return new Error(str);
        }

        public final String component1() {
            return this.message;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading extends DirectoryLoadingState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 1161975529;
        }
    }

    public final class Success extends DirectoryLoadingState {
        public static final int $stable = 8;
        public final AHD<WorkspaceEntry> entries;

        public Success(AHD<WorkspaceEntry> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.entries = ahd;
        }

        public final Success copy(AHD<WorkspaceEntry> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Success(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.entries, ((Success) obj).entries));
        }

        public static /* synthetic */ Success copy$default(Success success, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = success.entries;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Success(ahd);
        }

        public final AHD<WorkspaceEntry> component1() {
            return this.entries;
        }

        public final AHD<WorkspaceEntry> getEntries() {
            return this.entries;
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ DirectoryLoadingState(C06H c06h) {
    }

    public DirectoryLoadingState() {
    }
}
