package X;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public abstract class CAL extends AppComponentFactory {
    static {
        CCR.A01 = SystemClock.uptimeMillis();
    }

    private final Object loadClass(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException {
        Object objNewInstance = classLoader.loadClass(str).newInstance();
        C7384Etj.A0U(objNewInstance);
        return objNewInstance;
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        AnonymousClass003.A0u(classLoader, str);
        return (Activity) loadClass(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        AnonymousClass003.A0u(classLoader, str);
        return (ContentProvider) loadClass(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        AnonymousClass003.A0u(classLoader, str);
        return (BroadcastReceiver) loadClass(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        AnonymousClass003.A0u(classLoader, str);
        return (Service) loadClass(classLoader, str);
    }
}
