package com.facebook.aura.partners.voice.session.impl;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;

/* loaded from: classes2.dex */
public interface CompletedCallAvatar {

    public final class AwaitPrepared implements CompletedCallAvatar {
        public static final AwaitPrepared INSTANCE = new AwaitPrepared();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AwaitPrepared);
        }

        public String toString() {
            return "AwaitPrepared";
        }

        public int hashCode() {
            return -531660768;
        }
    }

    public final class CallStart extends C06G implements CompletedCallAvatar {
        public final CallStartAvatar start;

        public CallStart(CallStartAvatar callStartAvatar) {
            C7384Etj.A0Y(callStartAvatar, 0);
            this.start = callStartAvatar;
        }

        public final CallStart copy(CallStartAvatar callStartAvatar) {
            C7384Etj.A0Y(callStartAvatar, 0);
            return new CallStart(callStartAvatar);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CallStart) && C7384Etj.areEqual(this.start, ((CallStart) obj).start));
        }

        public static /* synthetic */ CallStart copy$default(CallStart callStart, CallStartAvatar callStartAvatar, int i, Object obj) {
            if ((i & 1) != 0) {
                callStartAvatar = callStart.start;
            }
            C7384Etj.A0Y(callStartAvatar, 0);
            return new CallStart(callStartAvatar);
        }

        public final CallStartAvatar component1() {
            return this.start;
        }

        public final CallStartAvatar getStart() {
            return this.start;
        }

        public int hashCode() {
            return this.start.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Remembered extends C06G implements CompletedCallAvatar {
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

    public final class Unchanged implements CompletedCallAvatar {
        public static final Unchanged INSTANCE = new Unchanged();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unchanged);
        }

        public String toString() {
            return "Unchanged";
        }

        public int hashCode() {
            return 1888446696;
        }
    }
}
