package com.facebook.aura.file.actions;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import android.net.Uri;

/* loaded from: classes.dex */
public interface HatchFileRef {

    public final class Local extends C06G implements HatchFileRef {
        public final String displayName;
        public final Uri uri;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Local) {
                    Local local = (Local) obj;
                    if (!C7384Etj.areEqual(this.uri, local.uri) || !C7384Etj.areEqual(this.displayName, local.displayName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Local copy$default(Local local, Uri uri, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = local.uri;
            }
            if ((i & 2) != 0) {
                str = local.displayName;
            }
            AnonymousClass003.A0u(uri, str);
            return new Local(uri, str);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final String component2() {
            return this.displayName;
        }

        @Override // com.facebook.aura.file.actions.HatchFileRef
        public String getDisplayName() {
            return this.displayName;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.displayName, AnonymousClass005.A0E(this.uri));
        }

        public Local(Uri uri, String str) {
            AnonymousClass003.A0u(uri, str);
            this.uri = uri;
            this.displayName = str;
        }

        public final Local copy(Uri uri, String str) {
            AnonymousClass003.A0u(uri, str);
            return new Local(uri, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Workspace extends C06G implements HatchFileRef {
        public final String displayName;
        public final String relativePath;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Workspace) {
                    Workspace workspace = (Workspace) obj;
                    if (!C7384Etj.areEqual(this.relativePath, workspace.relativePath) || !C7384Etj.areEqual(this.displayName, workspace.displayName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Workspace copy$default(Workspace workspace, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = workspace.relativePath;
            }
            if ((i & 2) != 0) {
                str2 = workspace.displayName;
            }
            AnonymousClass003.A0u(str, str2);
            return new Workspace(str, str2);
        }

        public final String component1() {
            return this.relativePath;
        }

        public final String component2() {
            return this.displayName;
        }

        @Override // com.facebook.aura.file.actions.HatchFileRef
        public String getDisplayName() {
            return this.displayName;
        }

        public final String getRelativePath() {
            return this.relativePath;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.displayName, AnonymousClass001.A0G(this.relativePath));
        }

        public Workspace(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.relativePath = str;
            this.displayName = str2;
        }

        public final Workspace copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Workspace(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    String getDisplayName();
}
