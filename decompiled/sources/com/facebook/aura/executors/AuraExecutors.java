package com.facebook.aura.executors;

import X.AbstractC5321DgF;
import X.BV4;
import X.BV5;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.F0C;
import X.FGI;
import android.os.Handler;
import com.facebook.aura.executors.NameAndPriorityThreadFactory;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class AuraExecutors {
    public static final int CORE_POOL_SIZE;
    public static final int COROUTINE_DISPATCHER_QUEUE_SIZE = Integer.MAX_VALUE;
    public static final int CPU_COUNT;
    public static final AuraExecutors INSTANCE = new AuraExecutors();
    public static final int IO_POOL_SIZE;
    public static final long KEEP_ALIVE_MSEC = 30000;
    public static final int LOW_PRIORITY_QUEUE_SIZE = 128;
    public static final long RESPONSE_STREAMING_KEEP_ALIVE_MSEC = 60000;
    public static final int RESPONSE_STREAMING_MAX_THREADS = 8;
    public static final long RESPONSE_STREAMING_OVERFLOW_LOG_INTERVAL = 100;
    public static final String TAG = "AuraExecutors";
    public static final long UPLOAD_STREAMING_KEEP_ALIVE_MSEC = 60000;
    public static final int UPLOAD_STREAMING_MAX_THREADS = 8;
    public static final int USER_BLOCKING_IO_PRIORITY = 9;
    public static final F0C backgroundThreadExecutor$delegate;
    public static final F0C fileUploadStreamingExecutor$delegate;
    public static final F0C ioExecutor$delegate;
    public static final F0C lowPriorityExecutor$delegate;
    public static final F0C responseStreamingExecutor$delegate;
    public static final AtomicLong responseStreamingOverflowCount;
    public static final F0C responseStreamingOverflowExecutor$delegate;
    public static final F0C uiThreadExecutor$delegate;
    public static final F0C uiThreadHandler$delegate;

    public final class ThreadPoolBuilder {
        public int corePoolSize;
        public long keepAliveMsec;
        public Integer maxPoolSize;
        public String nameOrNamePrefix;
        public int priority;
        public NameAndPriorityThreadFactory.ThreadInstanceCreator threadInstanceCreator;
        public int queueSize = Integer.MAX_VALUE;
        public boolean crashOnUncaughtException = true;

        private final ThreadFactory resolveThreadFactory(int i, String str, int i2, NameAndPriorityThreadFactory.ThreadInstanceCreator threadInstanceCreator) {
            NameAndPriorityThreadFactory.Companion companion = NameAndPriorityThreadFactory.Companion;
            return i > 1 ? companion.countingName(str, i2, threadInstanceCreator) : companion.fixedName(str, i2, threadInstanceCreator);
        }

        public final ThreadPoolExecutor build() {
            if (this.nameOrNamePrefix == null) {
                throw BV4.A0U();
            }
            final int i = this.corePoolSize;
            if (i <= 0) {
                throw C60O.A0i("Failed requirement.");
            }
            int i2 = this.queueSize;
            if (i2 <= 0) {
                throw C60O.A0i("Failed requirement.");
            }
            final long j = this.keepAliveMsec;
            if (j < 0) {
                throw C60O.A0i("Failed requirement.");
            }
            final int iResolveMaxPoolSize = resolveMaxPoolSize(this.maxPoolSize, i);
            final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(i2);
            String str = this.nameOrNamePrefix;
            C7384Etj.A0X(str);
            final ThreadFactory threadFactoryResolveThreadFactory = resolveThreadFactory(iResolveMaxPoolSize, str, this.priority, this.threadInstanceCreator);
            return new ThreadPoolExecutor(iResolveMaxPoolSize, i, j, timeUnit, linkedBlockingQueue, threadFactoryResolveThreadFactory) { // from class: com.facebook.aura.executors.AuraExecutors$ThreadPoolBuilder$build$1
                @Override // java.util.concurrent.ThreadPoolExecutor
                public void afterExecute(Runnable runnable, Throwable th) {
                    C7384Etj.A0Y(runnable, 0);
                    if (this.crashOnUncaughtException) {
                        if (th != null) {
                            CFK.A0B(AuraExecutors.TAG, "UncaughtException", th);
                        }
                        CrashingExecutorPolicy.INSTANCE.crashIfAppropriate(runnable, th);
                    }
                }

                @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    C7384Etj.A0Y(runnable, 0);
                    try {
                        super.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        CFK.A07(AuraExecutors.TAG, FGI.A0M("Task rejected (queue full), dropping: ", e.getMessage()));
                    }
                }
            };
        }

        public final ThreadPoolBuilder nameOrNamePrefix(String str) {
            C7384Etj.A0Y(str, 0);
            this.nameOrNamePrefix = str;
            return this;
        }

        private final int resolveMaxPoolSize(Integer num, int i) {
            if (num == null) {
                return i;
            }
            int iIntValue = num.intValue();
            if (iIntValue >= i) {
                return iIntValue;
            }
            throw BV4.A0O();
        }

        public final ScheduledThreadPoolExecutor buildScheduledExecutor() {
            String str = this.nameOrNamePrefix;
            if (str == null) {
                throw BV4.A0U();
            }
            final int i = this.corePoolSize;
            if (i <= 0) {
                throw BV4.A0O();
            }
            final ThreadFactory threadFactoryResolveThreadFactory = resolveThreadFactory(resolveMaxPoolSize(this.maxPoolSize, i), str, this.priority, this.threadInstanceCreator);
            return new ScheduledThreadPoolExecutor(i, threadFactoryResolveThreadFactory) { // from class: com.facebook.aura.executors.AuraExecutors$ThreadPoolBuilder$buildScheduledExecutor$1
                @Override // java.util.concurrent.ThreadPoolExecutor
                public void afterExecute(Runnable runnable, Throwable th) {
                    C7384Etj.A0Y(runnable, 0);
                    if (!this.this$0.crashOnUncaughtException || th == null) {
                        return;
                    }
                    CFK.A0B(AuraExecutors.TAG, "UncaughtException", th);
                    CrashingExecutorPolicy.INSTANCE.crashIfAppropriate(runnable, th);
                }

                @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    C7384Etj.A0Y(runnable, 0);
                    try {
                        super.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        CFK.A07(AuraExecutors.TAG, FGI.A0M("Task rejected (queue full), dropping: ", e.getMessage()));
                    }
                }
            };
        }

        public final ThreadPoolBuilder corePoolSize(int i) {
            this.corePoolSize = i;
            return this;
        }

        public final ThreadPoolBuilder crashOnUncaughtException(boolean z) {
            this.crashOnUncaughtException = z;
            return this;
        }

        public final ThreadPoolBuilder keepAliveMsec(long j) {
            this.keepAliveMsec = j;
            return this;
        }

        public final ThreadPoolBuilder maxPoolSize(int i) {
            this.maxPoolSize = Integer.valueOf(i);
            return this;
        }

        public final ThreadPoolBuilder priority(int i) {
            this.priority = i;
            return this;
        }

        public final ThreadPoolBuilder queueSize(int i) {
            this.queueSize = i;
            return this;
        }

        public final ThreadPoolBuilder threadInstanceCreator(NameAndPriorityThreadFactory.ThreadInstanceCreator threadInstanceCreator) {
            this.threadInstanceCreator = threadInstanceCreator;
            return this;
        }
    }

    public static /* synthetic */ void getFileUploadStreamingExecutor$annotations() {
    }

    public final ScheduledExecutorService newScheduledThreadPool(int i, String str, NameAndPriorityThreadFactory.ThreadInstanceCreator threadInstanceCreator) {
        C7384Etj.A0Y(str, 1);
        ThreadPoolBuilder threadPoolBuilder = new ThreadPoolBuilder();
        threadPoolBuilder.corePoolSize = i;
        threadPoolBuilder.threadInstanceCreator = threadInstanceCreator;
        threadPoolBuilder.nameOrNamePrefix = str;
        return threadPoolBuilder.buildScheduledExecutor();
    }

    public final ExecutorService newSingleThreadExecutor(String str) {
        C7384Etj.A0Y(str, 0);
        ThreadPoolBuilder threadPoolBuilder = new ThreadPoolBuilder();
        threadPoolBuilder.corePoolSize = 1;
        threadPoolBuilder.nameOrNamePrefix = str;
        return threadPoolBuilder.build();
    }

    public final ScheduledExecutorService newSingleThreadScheduledExecutor(String str, NameAndPriorityThreadFactory.ThreadInstanceCreator threadInstanceCreator) {
        C7384Etj.A0Y(str, 0);
        ThreadPoolBuilder threadPoolBuilder = new ThreadPoolBuilder();
        threadPoolBuilder.corePoolSize = 1;
        threadPoolBuilder.threadInstanceCreator = threadInstanceCreator;
        threadPoolBuilder.nameOrNamePrefix = str;
        return threadPoolBuilder.buildScheduledExecutor();
    }

    public final ExecutorService newThreadPool(int i, String str) {
        C7384Etj.A0Y(str, 1);
        ThreadPoolBuilder threadPoolBuilder = new ThreadPoolBuilder();
        threadPoolBuilder.corePoolSize = i;
        threadPoolBuilder.nameOrNamePrefix = str;
        return threadPoolBuilder.build();
    }

    public final class SerialExecutor implements Executor {
        public Runnable active;
        public final Executor delegate;
        public final ArrayDeque<Runnable> queue;

        public SerialExecutor(Executor executor) {
            C7384Etj.A0Y(executor, 0);
            this.delegate = executor;
            this.queue = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void scheduleNext() {
            Runnable runnablePoll = this.queue.poll();
            this.active = runnablePoll;
            if (runnablePoll != null) {
                this.delegate.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            C7384Etj.A0Y(runnable, 0);
            this.queue.add(new Runnable() { // from class: com.facebook.aura.executors.AuraExecutors$SerialExecutor$execute$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        this.scheduleNext();
                    }
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
        }
    }

    static {
        int iA00 = BV5.A00();
        CPU_COUNT = iA00;
        CORE_POOL_SIZE = Math.max(2, Math.min(iA00 - 1, 4));
        IO_POOL_SIZE = Math.max(4, iA00 * 2);
        backgroundThreadExecutor$delegate = AbstractC5321DgF.A03(AuraExecutors$backgroundThreadExecutor$2.INSTANCE);
        fileUploadStreamingExecutor$delegate = AbstractC5321DgF.A03(AuraExecutors$fileUploadStreamingExecutor$2.INSTANCE);
        responseStreamingExecutor$delegate = AbstractC5321DgF.A03(AuraExecutors$responseStreamingExecutor$2.INSTANCE);
        responseStreamingOverflowCount = new AtomicLong();
        responseStreamingOverflowExecutor$delegate = AbstractC5321DgF.A03(AuraExecutors$responseStreamingOverflowExecutor$2.INSTANCE);
        uiThreadExecutor$delegate = AbstractC5321DgF.A03(AuraExecutors$uiThreadExecutor$2.INSTANCE);
        lowPriorityExecutor$delegate = AbstractC5321DgF.A03(AuraExecutors$lowPriorityExecutor$2.INSTANCE);
        ioExecutor$delegate = AbstractC5321DgF.A03(AuraExecutors$ioExecutor$2.INSTANCE);
        uiThreadHandler$delegate = AbstractC5321DgF.A03(AuraExecutors$uiThreadHandler$2.INSTANCE);
    }

    public static final /* synthetic */ ExecutorService access$getResponseStreamingOverflowExecutor(AuraExecutors auraExecutors) {
        return (ExecutorService) responseStreamingOverflowExecutor$delegate.getValue();
    }

    private final ExecutorService getResponseStreamingExecutor() {
        return (ExecutorService) responseStreamingExecutor$delegate.getValue();
    }

    private final ExecutorService getResponseStreamingOverflowExecutor() {
        return (ExecutorService) responseStreamingOverflowExecutor$delegate.getValue();
    }

    public static /* synthetic */ ScheduledExecutorService newSingleThreadScheduledExecutor$default(AuraExecutors auraExecutors, String str, NameAndPriorityThreadFactory.ThreadInstanceCreator threadInstanceCreator, int i, Object obj) {
        if ((i & 2) != 0) {
            threadInstanceCreator = null;
        }
        return auraExecutors.newSingleThreadScheduledExecutor(str, threadInstanceCreator);
    }

    public final Executor createResponseStreamingSerialExecutor() {
        return new SerialExecutor(F0C.A06(responseStreamingExecutor$delegate));
    }

    public final Executor createSerialExecutor() {
        return new SerialExecutor((Executor) backgroundThreadExecutor$delegate.getValue());
    }

    public final ExecutorService getBackgroundThreadExecutor() {
        return (ExecutorService) backgroundThreadExecutor$delegate.getValue();
    }

    public final ExecutorService getFileUploadStreamingExecutor() {
        return (ExecutorService) fileUploadStreamingExecutor$delegate.getValue();
    }

    public final ExecutorService getIoExecutor() {
        return (ExecutorService) ioExecutor$delegate.getValue();
    }

    public final ExecutorService getLowPriorityExecutor() {
        return (ExecutorService) lowPriorityExecutor$delegate.getValue();
    }

    public final ExecutorService getUiThreadExecutor() {
        return (ExecutorService) uiThreadExecutor$delegate.getValue();
    }

    public final Executor createSerialIOExecutor() {
        return new SerialExecutor(F0C.A05());
    }

    public final Handler getUiThreadHandler() {
        return F0C.A00();
    }
}
