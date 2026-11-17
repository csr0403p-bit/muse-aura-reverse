package com.facebook.aura.webview;

import X.C06H;

/* loaded from: classes3.dex */
public abstract class LoadingState {
    public static final int $stable = 8;

    public final class Finished extends LoadingState {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();
    }

    public final class Initializing extends LoadingState {
        public static final int $stable = 0;
        public static final Initializing INSTANCE = new Initializing();
    }

    public final class Loading extends LoadingState {
        public static final int $stable = 0;
        public final float progress;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Loading) && Float.compare(this.progress, ((Loading) obj).progress) == 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = loading.progress;
            }
            return new Loading(f);
        }

        public final float component1() {
            return this.progress;
        }

        public final Loading copy(float f) {
            return new Loading(f);
        }

        public final float getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.progress);
        }

        public Loading(float f) {
            this.progress = f;
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ LoadingState(C06H c06h) {
    }

    public LoadingState() {
    }
}
