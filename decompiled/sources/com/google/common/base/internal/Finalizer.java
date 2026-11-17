package com.google.common.base.internal;

import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C60O;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class Finalizer implements Runnable {
    public static final Constructor<Thread> bigThreadConstructor;
    public static final Field inheritableThreadLocals;
    public static final Logger logger = BV5.A1B(Finalizer.class);
    public final WeakReference<Class<?>> finalizableReferenceClassReference;
    public final PhantomReference<Object> frqReference;
    public final ReferenceQueue<Object> queue;

    static {
        Constructor<Thread> bigThreadConstructor2 = getBigThreadConstructor();
        bigThreadConstructor = bigThreadConstructor2;
        inheritableThreadLocals = bigThreadConstructor2 == null ? getInheritableThreadLocalsField() : null;
    }

    public static Constructor<Thread> getBigThreadConstructor() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    private Method getFinalizeReferentMethod() {
        Class<?> cls = this.finalizableReferenceClassReference.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e) {
            throw BV4.A0N(e);
        }
    }

    public static Field getInheritableThreadLocalsField() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.queue.remove())) {
        }
    }

    public Finalizer(Class<?> finalizableReferenceClass, ReferenceQueue<Object> queue, PhantomReference<Object> frqReference) {
        this.queue = queue;
        this.finalizableReferenceClassReference = BV4.A0q(finalizableReferenceClass);
        this.frqReference = frqReference;
    }

    private boolean cleanUp(Reference<?> firstReference) {
        Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod != null) {
            while (finalizeReference(firstReference, finalizeReferentMethod)) {
                firstReference = this.queue.poll();
                if (firstReference == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean finalizeReference(Reference<?> reference, Method finalizeReferentMethod) {
        reference.clear();
        if (reference == this.frqReference) {
            return false;
        }
        try {
            finalizeReferentMethod.invoke(reference, null);
            return true;
        } catch (Throwable th) {
            logger.log(Level.SEVERE, "Error cleaning up after reference.", th);
            return true;
        }
    }

    public static void startFinalizer(Class<?> finalizableReferenceClass, ReferenceQueue<Object> queue, PhantomReference<Object> frqReference) {
        Thread threadNewInstance;
        if (!finalizableReferenceClass.getName().equals("com.google.common.base.FinalizableReference")) {
            throw C60O.A0i("Expected com.google.common.base.FinalizableReference.");
        }
        Finalizer finalizer = new Finalizer(finalizableReferenceClass, queue, frqReference);
        String name = Finalizer.class.getName();
        Constructor<Thread> constructor = bigThreadConstructor;
        if (constructor != null) {
            try {
                threadNewInstance = constructor.newInstance(null, finalizer, name, BV7.A0o(), AnonymousClass001.A0h());
            } catch (Throwable th) {
                logger.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th);
            }
            if (threadNewInstance == null) {
                threadNewInstance = new Thread(null, finalizer, name);
            }
        } else {
            threadNewInstance = new Thread(null, finalizer, name);
        }
        threadNewInstance.setDaemon(true);
        try {
            Field field = inheritableThreadLocals;
            if (field != null) {
                field.set(threadNewInstance, null);
            }
        } catch (Throwable th2) {
            logger.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th2);
        }
        threadNewInstance.start();
    }
}
