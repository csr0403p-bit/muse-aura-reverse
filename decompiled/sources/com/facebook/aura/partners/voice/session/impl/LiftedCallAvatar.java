package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;

/* loaded from: classes2.dex */
public interface LiftedCallAvatar {

    public final class CallStart extends C06G implements LiftedCallAvatar {
        public final String previousImagePath;
        public final CallStartAvatar start;

        public CallStart(CallStartAvatar callStartAvatar, String str) {
            C7384Etj.A0Y(callStartAvatar, 0);
            this.start = callStartAvatar;
            this.previousImagePath = str;
        }

        public final CallStart copy(CallStartAvatar callStartAvatar, String str) {
            C7384Etj.A0Y(callStartAvatar, 0);
            return new CallStart(callStartAvatar, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CallStart) {
                    CallStart callStart = (CallStart) obj;
                    if (!C7384Etj.areEqual(this.start, callStart.start) || !C7384Etj.areEqual(this.previousImagePath, callStart.previousImagePath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CallStart copy$default(CallStart callStart, CallStartAvatar callStartAvatar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                callStartAvatar = callStart.start;
            }
            if ((i & 2) != 0) {
                str = callStart.previousImagePath;
            }
            C7384Etj.A0Y(callStartAvatar, 0);
            return new CallStart(callStartAvatar, str);
        }

        public final CallStartAvatar component1() {
            return this.start;
        }

        public final String component2() {
            return this.previousImagePath;
        }

        public final String getPreviousImagePath() {
            return this.previousImagePath;
        }

        public final CallStartAvatar getStart() {
            return this.start;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.start) + AnonymousClass006.A0G(this.previousImagePath);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Cleared extends C06G implements LiftedCallAvatar {
        public final String avatarStem;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Cleared) && C7384Etj.areEqual(this.avatarStem, ((Cleared) obj).avatarStem));
        }

        public static /* synthetic */ Cleared copy$default(Cleared cleared, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cleared.avatarStem;
            }
            return new Cleared(str);
        }

        public final String component1() {
            return this.avatarStem;
        }

        public final Cleared copy(String str) {
            return new Cleared(str);
        }

        public final String getAvatarStem() {
            return this.avatarStem;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.avatarStem);
        }

        public Cleared(String str) {
            this.avatarStem = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PreviousImage extends C06G implements LiftedCallAvatar {
        public final String avatarStem;
        public final String imagePath;

        public PreviousImage(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            this.avatarStem = str;
            this.imagePath = str2;
        }

        public final PreviousImage copy(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            return new PreviousImage(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PreviousImage) {
                    PreviousImage previousImage = (PreviousImage) obj;
                    if (!C7384Etj.areEqual(this.avatarStem, previousImage.avatarStem) || !C7384Etj.areEqual(this.imagePath, previousImage.imagePath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PreviousImage copy$default(PreviousImage previousImage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = previousImage.avatarStem;
            }
            if ((i & 2) != 0) {
                str2 = previousImage.imagePath;
            }
            C7384Etj.A0Y(str2, 1);
            return new PreviousImage(str, str2);
        }

        public final String component1() {
            return this.avatarStem;
        }

        public final String component2() {
            return this.imagePath;
        }

        public final String getAvatarStem() {
            return this.avatarStem;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.imagePath, AnonymousClass006.A0G(this.avatarStem) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Remembered extends C06G implements LiftedCallAvatar {
        public final HatchVoiceVideoConfigStore.Snapshot snapshot;

        public Remembered(HatchVoiceVideoConfigStore.Snapshot snapshot) {
            C7384Etj.A0Y(snapshot, 0);
            this.snapshot = snapshot;
        }

        public final Remembered copy(HatchVoiceVideoConfigStore.Snapshot snapshot) {
            C7384Etj.A0Y(snapshot, 0);
            return new Remembered(snapshot);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Remembered) && C7384Etj.areEqual(this.snapshot, ((Remembered) obj).snapshot));
        }

        public static /* synthetic */ Remembered copy$default(Remembered remembered, HatchVoiceVideoConfigStore.Snapshot snapshot, int i, Object obj) {
            if ((i & 1) != 0) {
                snapshot = remembered.snapshot;
            }
            C7384Etj.A0Y(snapshot, 0);
            return new Remembered(snapshot);
        }

        public final HatchVoiceVideoConfigStore.Snapshot component1() {
            return this.snapshot;
        }

        public final HatchVoiceVideoConfigStore.Snapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            return this.snapshot.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unchanged implements LiftedCallAvatar {
        public static final Unchanged INSTANCE = new Unchanged();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unchanged);
        }

        public String toString() {
            return "Unchanged";
        }

        public int hashCode() {
            return 1292344501;
        }
    }
}
