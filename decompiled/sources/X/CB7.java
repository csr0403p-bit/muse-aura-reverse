package X;

import android.util.Log;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.reflection.GetClassComponentRunnable;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class CB7 extends CB8 {
    public final Object A00;
    public final Field A01;
    public final Method A02;
    public static final Object A04 = C3cG.A0T();
    public static final ClassNotFoundException A03 = new ClassNotFoundException("PluginClassLoaderEmbedded");

    public static Object A00(Class<?> cls, String str, String str2, int i) throws Exception {
        GetClassComponentRunnable getClassComponentRunnable = new GetClassComponentRunnable(cls, str, str2, i);
        Object obj = null;
        try {
            Executors.callable(getClassComponentRunnable, null).call();
            obj = getClassComponentRunnable.result;
            return obj;
        } catch (Exception | NoSuchFieldError | NoSuchMethodError e) {
            StringBuilder sbA0x = C60O.A0x("Could not get ");
            BV6.A18(cls, sbA0x);
            sbA0x.append(".");
            sbA0x.append(str);
            sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            sbA0x.append(str2);
            Log.w("dextricks.reflection.Reflection", C60P.A1O(", kind = ", sbA0x, i), e);
            return obj;
        }
    }

    @Override // X.CB8
    public final void A01(Boolean bool) throws ClassNotFoundException {
        Boolean boolA0h;
        String str;
        String str2;
        Field field = this.A01;
        if (field == null) {
            str = "PCLEmbedded";
            str2 = "mSharedLibraryLoadersField is null";
        } else {
            if (!super.A01) {
                if (bool.booleanValue()) {
                    try {
                        Class.forName(ClassId.class.getName());
                        boolA0h = AnonymousClass001.A0i();
                    } catch (ClassNotFoundException unused) {
                        boolA0h = AnonymousClass001.A0h();
                    }
                    if (!boolA0h.booleanValue()) {
                        str = "PCLEmbedded";
                        str2 = "Installation failed, because that forceClassPreload failed";
                    }
                }
                try {
                    synchronized (A04) {
                        ClassLoader classLoader = this.A04;
                        ClassLoader[] classLoaderArr = (ClassLoader[]) field.get(classLoader);
                        ClassLoader[] classLoaderArr2 = new ClassLoader[1];
                        if (classLoaderArr != null) {
                            int length = classLoaderArr.length;
                            classLoaderArr2 = new ClassLoader[length + 1];
                            System.arraycopy(classLoaderArr, 0, classLoaderArr2, 1, length);
                        }
                        classLoaderArr2[0] = this;
                        field.set(classLoader, classLoaderArr2.clone());
                        super.A01 = true;
                        CFK.A06("PCLEmbedded", "Successfully installed PluginClassLoader in shared library loaders");
                    }
                    return;
                } catch (IllegalAccessException e) {
                    CFK.A0A("PCLEmbedded", "Failed to install PluginClassLoader in shared library loaders", e);
                    return;
                }
            }
            str = "PCLEmbedded";
            str2 = "Already installed";
        }
        CFK.A06(str, str2);
    }

    @Override // X.CB8, java.lang.ClassLoader
    public final Class<?> findClass(String str) {
        ThreadLocal<Boolean> threadLocal = this.A06;
        Boolean bool = threadLocal.get();
        threadLocal.set(Boolean.TRUE);
        try {
            try {
                ArrayList<CBo> arrayList = super.A00.get();
                if (arrayList == null) {
                    throw A03;
                }
                if (bool == null) {
                    Iterator<CBo> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                        C7384Etj.A0Y(str, 0);
                        ClassTracingLogger.beginClassLoad(str);
                    }
                }
                ArrayList arrayListA0h = C3cG.A0h();
                Class<?> cls = (Class) this.A02.invoke(this.A00, str, arrayListA0h);
                if (cls != null) {
                    if (bool == null) {
                        Iterator<CBo> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            ClassTracingLogger.classLoaded(cls);
                        }
                    }
                    return cls;
                }
                if (bool == null) {
                    Iterator<CBo> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                        ClassTracingLogger.classNotFound();
                    }
                }
                if (!arrayListA0h.isEmpty()) {
                    C60O.A1P("Could not load class ", str, "PCLEmbedded");
                    Iterator it4 = arrayListA0h.iterator();
                    while (it4.hasNext()) {
                        C60O.A1P("suppressed:", ((Throwable) it4.next()).getLocalizedMessage(), "PCLEmbedded");
                    }
                }
                throw A03;
            } catch (IllegalAccessException | InvocationTargetException e) {
                C3cH.A1B("Could not load class ", str, "PCLEmbedded", e);
                throw A03;
            }
        } finally {
            if (bool == null) {
                threadLocal.remove();
            }
        }
    }

    @Override // X.CB8
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PluginClassLoaderEmbeded[");
        sbA0x.append(this.A04);
        sbA0x.append(",");
        sbA0x.append(this.A05);
        sbA0x.append(",");
        return BV8.A0u(this.A01, sbA0x);
    }

    public CB7(ClassLoader classLoader) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        super(classLoader);
        Field field = (Field) A00(BaseDexClassLoader.class, "sharedLibraryLoaders", "[Ljava/lang/ClassLoader;", 2);
        this.A01 = field;
        if (field == null) {
            throw BV4.A0c("Could not get sharedLibraryLoaders field.");
        }
        field.setAccessible(true);
        Field field2 = (Field) A00(BaseDexClassLoader.class, "pathList", "Ldalvik/system/DexPathList;", 2);
        if (field2 == null) {
            throw BV4.A0c("Could not get DexPathList field.");
        }
        field2.setAccessible(true);
        Object obj = field2.get(classLoader);
        this.A00 = obj;
        if (obj == null) {
            throw BV4.A0c("DexPath list is null.");
        }
        Method method = (Method) A00(obj.getClass(), "findClass", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Class;", 0);
        this.A02 = method;
        if (method == null) {
            throw BV4.A0c("Could not get find class method in DexPathList.");
        }
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str) {
        return findClass(str);
    }
}
