package com.facebook.aura.file.view;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class FileLoadingState {
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public final class Error extends FileLoadingState {
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

    public final class Loading extends FileLoadingState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 272693478;
        }
    }

    public final class Success extends FileLoadingState {
        public static final int $stable = 8;
        public final FileContentType contentType;

        public Success(FileContentType fileContentType) {
            C7384Etj.A0Y(fileContentType, 0);
            this.contentType = fileContentType;
        }

        public final Success copy(FileContentType fileContentType) {
            C7384Etj.A0Y(fileContentType, 0);
            return new Success(fileContentType);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.contentType, ((Success) obj).contentType));
        }

        public static /* synthetic */ Success copy$default(Success success, FileContentType fileContentType, int i, Object obj) {
            if ((i & 1) != 0) {
                fileContentType = success.contentType;
            }
            C7384Etj.A0Y(fileContentType, 0);
            return new Success(fileContentType);
        }

        public final FileContentType component1() {
            return this.contentType;
        }

        public final FileContentType getContentType() {
            return this.contentType;
        }

        public int hashCode() {
            return this.contentType.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ FileLoadingState(C06H c06h) {
    }

    public FileLoadingState() {
    }
}
