package com.facebook.aura.spaces.view;

import X.C06G;

/* loaded from: classes.dex */
public interface SpaceMenuEffect {

    public final class Failed extends C06G implements SpaceMenuEffect {
        public static final int $stable = 0;
        public final int message;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.message == ((Failed) obj).message);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failed.message;
            }
            return new Failed(i);
        }

        public final int component1() {
            return this.message;
        }

        public final Failed copy(int i) {
            return new Failed(i);
        }

        public final int getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message;
        }

        public Failed(int i) {
            this.message = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Moved extends C06G implements SpaceMenuEffect {
        public static final int $stable = 0;
        public final boolean toLibrary;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Moved) && this.toLibrary == ((Moved) obj).toLibrary);
        }

        public static /* synthetic */ Moved copy$default(Moved moved, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = moved.toLibrary;
            }
            return new Moved(z);
        }

        public final boolean component1() {
            return this.toLibrary;
        }

        public final Moved copy(boolean z) {
            return new Moved(z);
        }

        public final boolean getToLibrary() {
            return this.toLibrary;
        }

        public int hashCode() {
            return this.toLibrary ? 1231 : 1237;
        }

        public Moved(boolean z) {
            this.toLibrary = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Pinned extends C06G implements SpaceMenuEffect {
        public static final int $stable = 0;
        public final boolean pinned;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Pinned) && this.pinned == ((Pinned) obj).pinned);
        }

        public static /* synthetic */ Pinned copy$default(Pinned pinned, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pinned.pinned;
            }
            return new Pinned(z);
        }

        public final boolean component1() {
            return this.pinned;
        }

        public final Pinned copy(boolean z) {
            return new Pinned(z);
        }

        public final boolean getPinned() {
            return this.pinned;
        }

        public int hashCode() {
            return this.pinned ? 1231 : 1237;
        }

        public Pinned(boolean z) {
            this.pinned = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Renamed implements SpaceMenuEffect {
        public static final int $stable = 0;
        public static final Renamed INSTANCE = new Renamed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Renamed);
        }

        public String toString() {
            return "Renamed";
        }

        public int hashCode() {
            return 1178892790;
        }
    }
}
