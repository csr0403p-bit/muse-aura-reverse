package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AudioRelease {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Available extends AudioRelease {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final List<AudioClip> clips;

        public Available(List<AudioClip> list) {
            C7384Etj.A0Y(list, 0);
            this.clips = list;
        }

        public final Available copy(List<AudioClip> list) {
            C7384Etj.A0Y(list, 0);
            return new Available(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Available) && C7384Etj.areEqual(this.clips, ((Available) obj).clips));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Available copy$default(Available available, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = available.clips;
            }
            C7384Etj.A0Y(list, 0);
            return new Available(list);
        }

        public final List<AudioClip> component1() {
            return this.clips;
        }

        public final List<AudioClip> getClips() {
            return this.clips;
        }

        public int hashCode() {
            return this.clips.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Available(clips=", this.clips);
        }
    }

    public final class Withheld extends AudioRelease {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final ReleaseReason reason;

        public Withheld(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            this.reason = releaseReason;
        }

        public final Withheld copy(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            return new Withheld(releaseReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Withheld) && this.reason == ((Withheld) obj).reason);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Withheld copy$default(Withheld withheld, ReleaseReason releaseReason, int i, Object obj) {
            if ((i & 1) != 0) {
                releaseReason = withheld.reason;
            }
            C7384Etj.A0Y(releaseReason, 0);
            return new Withheld(releaseReason);
        }

        public final ReleaseReason component1() {
            return this.reason;
        }

        public final ReleaseReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Withheld(reason=", this.reason);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public AudioRelease() {
    }

    public /* synthetic */ AudioRelease(C06H c06h) {
    }
}
