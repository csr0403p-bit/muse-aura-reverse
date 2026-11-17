package com.facebook.aura.email.viewmodel;

import X.C7384Etj;
import com.facebook.aura.email.model.EmailAttachmentFile;

/* loaded from: classes3.dex */
public interface EmailAttachmentUiState {

    public final class Error implements EmailAttachmentUiState {
        public static final Error INSTANCE = new Error();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public String toString() {
            return "Error";
        }

        public int hashCode() {
            return -1106423228;
        }
    }

    public final class Loaded implements EmailAttachmentUiState {
        public final EmailAttachmentFile file;

        public Loaded(EmailAttachmentFile emailAttachmentFile) {
            C7384Etj.A0Y(emailAttachmentFile, 0);
            this.file = emailAttachmentFile;
        }

        public final EmailAttachmentFile getFile() {
            return this.file;
        }
    }

    public final class Loading implements EmailAttachmentUiState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -600161672;
        }
    }
}
