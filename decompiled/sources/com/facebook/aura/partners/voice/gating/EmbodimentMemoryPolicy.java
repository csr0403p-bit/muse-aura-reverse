package com.facebook.aura.partners.voice.gating;

/* loaded from: classes6.dex */
public interface EmbodimentMemoryPolicy {
    boolean getBlocksLowRamDevices();

    long getMinAvailableMemoryBytes();

    long getResumeAvailableMemoryBytes();

    /* renamed from: com.facebook.aura.partners.voice.gating.EmbodimentMemoryPolicy$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static long getResumeAvailableMemoryBytes(EmbodimentMemoryPolicy embodimentMemoryPolicy) {
            return embodimentMemoryPolicy.getMinAvailableMemoryBytes();
        }
    }
}
