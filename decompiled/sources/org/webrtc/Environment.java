package org.webrtc;

/* loaded from: classes5.dex */
public final class Environment implements AutoCloseable {
    public final long webrtcEnv;

    public class Builder {
        public String fieldTrials;

        public Environment build() {
            return new Environment(this.fieldTrials);
        }

        public Builder setFieldTrials(String str) {
            this.fieldTrials = str;
            return this;
        }
    }

    public interface Natives {
        long create(String str);

        long currentTimeNanos(long j);

        void free(long j);
    }

    public static Builder builder() {
        return new Builder();
    }

    public long ref() {
        return this.webrtcEnv;
    }

    public Environment(String str) {
        this.webrtcEnv = EnvironmentJni.get().create(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        EnvironmentJni.get().free(this.webrtcEnv);
    }

    public long getCurrentTimeNanos() {
        return EnvironmentJni.get().currentTimeNanos(this.webrtcEnv);
    }
}
