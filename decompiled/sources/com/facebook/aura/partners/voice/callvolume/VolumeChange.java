package com.facebook.aura.partners.voice.callvolume;

import X.C06G;

/* loaded from: classes2.dex */
public interface VolumeChange {

    public final class Level extends C06G implements VolumeChange {
        public final int percent;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Level) && this.percent == ((Level) obj).percent);
        }

        public static /* synthetic */ Level copy$default(Level level, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = level.percent;
            }
            return new Level(i);
        }

        public final int component1() {
            return this.percent;
        }

        public final Level copy(int i) {
            return new Level(i);
        }

        public final int getPercent() {
            return this.percent;
        }

        public int hashCode() {
            return this.percent;
        }

        public Level(int i) {
            this.percent = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Step extends C06G implements VolumeChange {
        public final boolean raise;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Step) && this.raise == ((Step) obj).raise);
        }

        public static /* synthetic */ Step copy$default(Step step, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = step.raise;
            }
            return new Step(z);
        }

        public final boolean component1() {
            return this.raise;
        }

        public final Step copy(boolean z) {
            return new Step(z);
        }

        public final boolean getRaise() {
            return this.raise;
        }

        public int hashCode() {
            return this.raise ? 1231 : 1237;
        }

        public Step(boolean z) {
            this.raise = z;
        }

        public String toString() {
            return super.toString();
        }
    }
}
