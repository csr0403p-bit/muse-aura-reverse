package com.facebook.aura.partners.voice.gating;

import com.facebook.aura.memory.AuraMemory;

/* loaded from: classes2.dex */
public final class DefaultEmbodimentMemoryPolicy implements EmbodimentMemoryPolicy {
    public static final DefaultEmbodimentMemoryPolicy INSTANCE;
    public static final boolean blocksLowRamDevices;
    public static final long minAvailableMemoryBytes;
    public static final long resumeAvailableMemoryBytes;

    static {
        DefaultEmbodimentMemoryPolicy defaultEmbodimentMemoryPolicy = new DefaultEmbodimentMemoryPolicy();
        INSTANCE = defaultEmbodimentMemoryPolicy;
        blocksLowRamDevices = true;
        minAvailableMemoryBytes = AuraMemory.DEFAULT_MIN_AVAILABLE_MEMORY_BYTES;
        resumeAvailableMemoryBytes = defaultEmbodimentMemoryPolicy.getMinAvailableMemoryBytes() + 157286400;
    }

    @Override // com.facebook.aura.partners.voice.gating.EmbodimentMemoryPolicy
    public boolean getBlocksLowRamDevices() {
        return blocksLowRamDevices;
    }

    @Override // com.facebook.aura.partners.voice.gating.EmbodimentMemoryPolicy
    public long getMinAvailableMemoryBytes() {
        return minAvailableMemoryBytes;
    }

    @Override // com.facebook.aura.partners.voice.gating.EmbodimentMemoryPolicy
    public long getResumeAvailableMemoryBytes() {
        return resumeAvailableMemoryBytes;
    }
}
