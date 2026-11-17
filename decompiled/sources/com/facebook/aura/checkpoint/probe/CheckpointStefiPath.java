package com.facebook.aura.checkpoint.probe;

import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes2.dex */
public interface CheckpointStefiPath extends StefiHatchPath.Extension {

    public final class CheckpointStatus implements CheckpointStefiPath {
        public static final CheckpointStatus INSTANCE = new CheckpointStatus();
        public static final String value = "/hatch/checkpoint/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckpointStatus);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CheckpointStatus";
        }

        public int hashCode() {
            return 660684312;
        }
    }
}
