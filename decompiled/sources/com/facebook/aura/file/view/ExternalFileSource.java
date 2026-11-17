package com.facebook.aura.file.view;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.file.actions.HatchFileRef;
import java.io.File;

/* loaded from: classes.dex */
public interface ExternalFileSource {

    public final class Local extends C06G implements ExternalFileSource {
        public static final int $stable = 0;
        public final HatchFileRef.Local ref;

        public Local(HatchFileRef.Local local) {
            C7384Etj.A0Y(local, 0);
            this.ref = local;
        }

        public final Local copy(HatchFileRef.Local local) {
            C7384Etj.A0Y(local, 0);
            return new Local(local);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Local) && C7384Etj.areEqual(this.ref, ((Local) obj).ref));
        }

        public static /* synthetic */ Local copy$default(Local local, HatchFileRef.Local local2, int i, Object obj) {
            if ((i & 1) != 0) {
                local2 = local.ref;
            }
            C7384Etj.A0Y(local2, 0);
            return new Local(local2);
        }

        public final HatchFileRef.Local component1() {
            return this.ref;
        }

        public final HatchFileRef.Local getRef() {
            return this.ref;
        }

        public int hashCode() {
            return this.ref.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Staged extends C06G implements ExternalFileSource {
        public static final int $stable = 0;
        public final File file;

        public Staged(File file) {
            C7384Etj.A0Y(file, 0);
            this.file = file;
        }

        public final Staged copy(File file) {
            C7384Etj.A0Y(file, 0);
            return new Staged(file);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Staged) && C7384Etj.areEqual(this.file, ((Staged) obj).file));
        }

        public static /* synthetic */ Staged copy$default(Staged staged, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                file = staged.file;
            }
            C7384Etj.A0Y(file, 0);
            return new Staged(file);
        }

        public final File component1() {
            return this.file;
        }

        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
