package com.facebook.aura.executors;

import X.BV5;
import X.C06H;
import X.C7384Etj;
import X.F18;
import X.FGI;
import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class NameAndPriorityThreadFactory implements ThreadFactory {
    public static final Companion Companion = new Companion();
    public final int androidPriority;
    public final String name;
    public final F18<String> nameProvider;
    public ThreadInstanceCreator threadInstanceCreator;

    public final class PrioritySetter implements Runnable {
        public final Runnable delegate;
        public final int priority;

        public PrioritySetter(Runnable runnable, int i) {
            C7384Etj.A0Y(runnable, 0);
            this.delegate = runnable;
            this.priority = i;
        }

        @Override // java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(this.priority);
            this.delegate.run();
        }
    }

    public interface ThreadInstanceCreator {
        Thread createThreadInstance(Runnable runnable, String str);
    }

    public NameAndPriorityThreadFactory(F18<String> f18, int i, ThreadInstanceCreator threadInstanceCreator) {
        C7384Etj.A0Y(f18, 0);
        this.name = null;
        this.nameProvider = f18;
        this.androidPriority = i;
        this.threadInstanceCreator = threadInstanceCreator;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        int i = this.androidPriority;
        if (i != 0) {
            runnable = new PrioritySetter(runnable, i);
        }
        String strAMN = this.name;
        if (strAMN == null) {
            F18<String> f18 = this.nameProvider;
            if (f18 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            strAMN = f18.AMN();
        }
        ThreadInstanceCreator threadInstanceCreator = this.threadInstanceCreator;
        if (threadInstanceCreator != null) {
            C7384Etj.A0X(strAMN);
            Thread threadCreateThreadInstance = threadInstanceCreator.createThreadInstance(runnable, strAMN);
            if (threadCreateThreadInstance != null) {
                return threadCreateThreadInstance;
            }
        }
        return new Thread(runnable, strAMN);
    }

    public final class Companion {
        public final NameAndPriorityThreadFactory countingName(final String str, int i, ThreadInstanceCreator threadInstanceCreator) {
            C7384Etj.A0Y(str, 0);
            final AtomicInteger atomicIntegerA18 = BV5.A18();
            return new NameAndPriorityThreadFactory((F18<String>) new F18() { // from class: com.facebook.aura.executors.NameAndPriorityThreadFactory$Companion$countingName$1
                @Override // X.F18
                /* renamed from: get */
                public final String AMN() {
                    return FGI.A0H(str, atomicIntegerA18.getAndIncrement());
                }
            }, i, threadInstanceCreator);
        }

        public final NameAndPriorityThreadFactory fixedName(String str, int i, ThreadInstanceCreator threadInstanceCreator) {
            C7384Etj.A0Y(str, 0);
            return new NameAndPriorityThreadFactory(str, i, threadInstanceCreator);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NameAndPriorityThreadFactory(String str, int i, ThreadInstanceCreator threadInstanceCreator) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.nameProvider = null;
        this.androidPriority = i;
        this.threadInstanceCreator = threadInstanceCreator;
    }
}
