package com.sun.jna.internal;

import X.BV4;
import X.BV5;
import X.C60O;
import X.C8j3;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class Cleaner {
    public static final Cleaner INSTANCE = new Cleaner();
    public Thread cleanerThread;
    public CleanerRef firstCleanable;
    public final ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();

    public interface Cleanable {
        void clean();
    }

    public class CleanerRef extends PhantomReference<Object> implements Cleanable {
        public final Cleaner cleaner;
        public final Runnable cleanupTask;
        public CleanerRef next;
        public CleanerRef previous;

        @Override // com.sun.jna.internal.Cleaner.Cleanable
        public void clean() {
            if (this.cleaner.remove(this)) {
                this.cleanupTask.run();
            }
        }

        public CleanerRef getNext() {
            return this.next;
        }

        public CleanerRef getPrevious() {
            return this.previous;
        }

        public CleanerRef(Cleaner cleaner, Object obj, ReferenceQueue<? super Object> referenceQueue, Runnable runnable) {
            super(obj, referenceQueue);
            this.cleaner = cleaner;
            this.cleanupTask = runnable;
        }

        public void setNext(CleanerRef cleanerRef) {
            this.next = cleanerRef;
        }

        public void setPrevious(CleanerRef cleanerRef) {
            this.previous = cleanerRef;
        }
    }

    public class CleanerThread extends Thread {
        public static final long CLEANER_LINGER_TIME = 30000;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException, IllegalArgumentException {
            while (true) {
                try {
                    Reference<? extends Object> referenceRemove = Cleaner.this.referenceQueue.remove(30000L);
                    if (referenceRemove instanceof CleanerRef) {
                        ((CleanerRef) referenceRemove).clean();
                    } else if (referenceRemove == null) {
                        synchronized (Cleaner.this.referenceQueue) {
                            Logger loggerA1B = BV5.A1B(Cleaner.class);
                            Cleaner cleaner = Cleaner.this;
                            if (cleaner.firstCleanable == null) {
                                cleaner.cleanerThread = null;
                                loggerA1B.log(Level.FINE, "Shutting down CleanerThread");
                                return;
                            }
                            Level level = Level.FINER;
                            if (loggerA1B.isLoggable(level)) {
                                StringBuilder sbA0w = C60O.A0w();
                                for (CleanerRef cleanerRef = Cleaner.this.firstCleanable; cleanerRef != null; cleanerRef = cleanerRef.next) {
                                    if (sbA0w.length() != 0) {
                                        C8j3.A1K(sbA0w);
                                    }
                                    BV4.A1O(sbA0w, cleanerRef.cleanupTask);
                                }
                                loggerA1B.log(level, "Registered Cleaners: {0}", sbA0w.toString());
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    BV5.A1B(Cleaner.class).log(Level.SEVERE, (String) null, (Throwable) e);
                }
            }
        }

        public CleanerThread() {
            super("JNA Cleaner");
            setDaemon(true);
        }
    }

    private synchronized CleanerRef add(CleanerRef cleanerRef) {
        synchronized (this.referenceQueue) {
            CleanerRef cleanerRef2 = this.firstCleanable;
            if (cleanerRef2 != null) {
                cleanerRef.next = cleanerRef2;
                cleanerRef2.previous = cleanerRef;
            }
            this.firstCleanable = cleanerRef;
            if (this.cleanerThread == null) {
                BV5.A1B(Cleaner.class).log(Level.FINE, "Starting CleanerThread");
                CleanerThread cleanerThread = new CleanerThread();
                this.cleanerThread = cleanerThread;
                cleanerThread.start();
            }
        }
        return cleanerRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean remove(CleanerRef cleanerRef) {
        boolean z;
        boolean z2;
        synchronized (this.referenceQueue) {
            z = true;
            if (cleanerRef == this.firstCleanable) {
                this.firstCleanable = cleanerRef.next;
                z2 = true;
            } else {
                z2 = false;
            }
            CleanerRef cleanerRef2 = cleanerRef.previous;
            if (cleanerRef2 != null) {
                cleanerRef2.next = cleanerRef.next;
            }
            CleanerRef cleanerRef3 = cleanerRef.next;
            if (cleanerRef3 != null) {
                cleanerRef3.previous = cleanerRef2;
            }
            if (cleanerRef.previous == null && cleanerRef3 == null) {
                z = z2;
            }
            cleanerRef.next = null;
            cleanerRef.previous = null;
        }
        return z;
    }

    public synchronized Cleanable register(Object obj, Runnable runnable) {
        CleanerRef cleanerRef;
        cleanerRef = new CleanerRef(this, obj, this.referenceQueue, runnable);
        add(cleanerRef);
        return cleanerRef;
    }

    public static Cleaner getCleaner() {
        return INSTANCE;
    }
}
