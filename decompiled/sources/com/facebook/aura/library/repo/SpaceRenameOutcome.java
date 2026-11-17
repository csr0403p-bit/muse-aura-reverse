package com.facebook.aura.library.repo;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface SpaceRenameOutcome {

    public final class Busy implements SpaceRenameOutcome {
        public static final Busy INSTANCE = new Busy();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Busy);
        }

        public String toString() {
            return "Busy";
        }

        public int hashCode() {
            return 1027418368;
        }
    }

    public final class Failed implements SpaceRenameOutcome {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -397687420;
        }
    }

    public final class Invalid implements SpaceRenameOutcome {
        public static final Invalid INSTANCE = new Invalid();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Invalid);
        }

        public String toString() {
            return "Invalid";
        }

        public int hashCode() {
            return -692000368;
        }
    }

    public final class NotFound implements SpaceRenameOutcome {
        public static final NotFound INSTANCE = new NotFound();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFound);
        }

        public String toString() {
            return "NotFound";
        }

        public int hashCode() {
            return 952353782;
        }
    }

    public final class Renamed extends C06G implements SpaceRenameOutcome {
        public final SpaceRenameResult result;

        public Renamed(SpaceRenameResult spaceRenameResult) {
            C7384Etj.A0Y(spaceRenameResult, 0);
            this.result = spaceRenameResult;
        }

        public final Renamed copy(SpaceRenameResult spaceRenameResult) {
            C7384Etj.A0Y(spaceRenameResult, 0);
            return new Renamed(spaceRenameResult);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Renamed) && C7384Etj.areEqual(this.result, ((Renamed) obj).result));
        }

        public static /* synthetic */ Renamed copy$default(Renamed renamed, SpaceRenameResult spaceRenameResult, int i, Object obj) {
            if ((i & 1) != 0) {
                spaceRenameResult = renamed.result;
            }
            C7384Etj.A0Y(spaceRenameResult, 0);
            return new Renamed(spaceRenameResult);
        }

        public final SpaceRenameResult component1() {
            return this.result;
        }

        public final SpaceRenameResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
