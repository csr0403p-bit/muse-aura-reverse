package com.facebook.common.dextricks;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public class ClassLoadsNotifier {
    public final CopyOnWriteArraySet<ClassLoadsListener> mClassLoadsListenerSet = new CopyOnWriteArraySet<>();

    public synchronized void addListener(ClassLoadsListener classLoadsListener) {
        this.mClassLoadsListenerSet.add(classLoadsListener);
    }

    public void notifyClassLoadBegin(String str) {
        Iterator<ClassLoadsListener> it = this.mClassLoadsListenerSet.iterator();
        while (it.hasNext()) {
            it.next().onClassLoadBegin(str);
        }
    }

    public void notifyClassLoaded(Class<?> cls) {
        Iterator<ClassLoadsListener> it = this.mClassLoadsListenerSet.iterator();
        while (it.hasNext()) {
            it.next().onClassLoaded(cls);
        }
    }

    public void notifyClassNotFound(String str) {
        Iterator<ClassLoadsListener> it = this.mClassLoadsListenerSet.iterator();
        while (it.hasNext()) {
            it.next().onClassNotFound(str);
        }
    }
}
