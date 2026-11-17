package com.facebook.pando;

import X.C06H;

/* loaded from: classes5.dex */
public final class PandoParseConfig {
    public final boolean alwaysWriteIntsAsLongs;
    public final boolean enableUnsetFieldRemoval;
    public final PandoNodePostProcessor nodePostProcessor;

    public PandoParseConfig() {
        this(false, false, null);
    }

    public final boolean getAlwaysWriteIntsAsLongs() {
        return this.alwaysWriteIntsAsLongs;
    }

    public final boolean getEnableUnsetFieldRemoval() {
        return this.enableUnsetFieldRemoval;
    }

    public final PandoNodePostProcessor getNodePostProcessor() {
        return null;
    }

    public PandoParseConfig(boolean z, boolean z2, PandoNodePostProcessor pandoNodePostProcessor) {
        this.alwaysWriteIntsAsLongs = z;
        this.enableUnsetFieldRemoval = z2;
        this.nodePostProcessor = pandoNodePostProcessor;
    }

    public /* synthetic */ PandoParseConfig(boolean z, boolean z2, PandoNodePostProcessor pandoNodePostProcessor, int i, C06H c06h) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : pandoNodePostProcessor);
    }
}
