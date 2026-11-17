package com.facebook.common.dextricks.stats;

import X.BV4;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class ClassLoadingStats {
    public static final AtomicReference<ClassLoadingStats> A00 = BV4.A15();

    /* loaded from: classes6.dex */
    public abstract class SnapshotStats {
    }

    public abstract void decrementDexFileQueries();

    public abstract void incrementClassLoadsAttempted();

    public abstract void incrementClassLoadsFailed();

    public abstract void incrementDexFileQueries(int i);

    public abstract void incrementIncorrectDfaGuesses();
}
