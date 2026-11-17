package com.hatch.browser.core;

/* loaded from: classes6.dex */
public interface UniffiCleaner {
    public static final Companion Companion = Companion.$$INSTANCE;

    public interface Cleanable {
        void clean();
    }

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Cleanable register(Object obj, Runnable runnable);
}
