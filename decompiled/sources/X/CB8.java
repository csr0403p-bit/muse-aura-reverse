package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class CB8 extends ClassLoader {
    public static volatile CB8 A07;
    public AtomicReference<ArrayList<CBo>> A00;
    public boolean A01;
    public Field A02;
    public Method A03;
    public ClassLoader A04;
    public ClassLoader A05;
    public ThreadLocal<Boolean> A06;

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A01(java.lang.Boolean r6) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.A01     // Catch: java.lang.Throwable -> L65
            monitor-exit(r5)
            java.lang.String r4 = "PluginClassLoader"
            if (r0 == 0) goto Le
            java.lang.String r0 = "PluginClassLoader: already installed"
        La:
            X.CFK.A06(r4, r0)
            return
        Le:
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L2f
            java.lang.Class<com.facebook.common.dextricks.classid.ClassId> r0 = com.facebook.common.dextricks.classid.ClassId.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.ClassNotFoundException -> L22
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L22
            java.lang.Boolean r0 = X.AnonymousClass001.A0i()     // Catch: java.lang.ClassNotFoundException -> L22
            goto L26
        L22:
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
        L26:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2f
            java.lang.String r0 = "PluginClassLoader: forceClassPreload() failed"
            goto La
        L2f:
            java.lang.ClassLoader r3 = r5.A04
            java.lang.String r2 = r3.toString()
            java.lang.ClassLoader r0 = r3.getParent()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "java.lang.BootClassLoader"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "dalvik.system.PathClassLoader"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L4e
            goto L51
        L4e:
            java.lang.String r0 = "Non-standard class loader chain. PluginClassLoader not installed"
            goto La
        L51:
            java.lang.reflect.Field r0 = r5.A02     // Catch: java.lang.IllegalAccessException -> L5f
            r0.set(r3, r5)     // Catch: java.lang.IllegalAccessException -> L5f
            r0 = 1
            r5.A01 = r0     // Catch: java.lang.IllegalAccessException -> L5f
            java.lang.String r0 = "Installed PluginClassLoader"
            X.CFK.A06(r4, r0)     // Catch: java.lang.IllegalAccessException -> L5f
            return
        L5f:
            java.lang.String r0 = "Failed to install PluginClassLoader"
            X.CFK.A06(r4, r0)
            return
        L65:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L65
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CB8.A01(java.lang.Boolean):void");
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) {
        Class<?> cls;
        ThreadLocal<Boolean> threadLocal = this.A06;
        Boolean bool = threadLocal.get();
        threadLocal.set(Boolean.TRUE);
        try {
            ArrayList<CBo> arrayList = this.A00.get();
            if (bool == null) {
                Iterator<CBo> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                    C7384Etj.A0Y(str, 0);
                    ClassTracingLogger.beginClassLoad(str);
                }
            }
            try {
                cls = (Class) this.A03.invoke(this.A04, str);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                cls = null;
            }
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
            throw new ClassNotFoundException(str);
        } finally {
            if (bool == null) {
                threadLocal.remove();
            }
        }
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("PluginClassLoader[");
        sbA0x.append(this.A04);
        sbA0x.append(",");
        return BV8.A0u(this.A05, sbA0x);
    }

    public CB8(ClassLoader classLoader) throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        super(classLoader.getParent());
        this.A04 = classLoader;
        this.A05 = classLoader.getParent();
        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findClass", String.class);
        this.A03 = declaredMethod;
        declaredMethod.setAccessible(true);
        Field declaredField = ClassLoader.class.getDeclaredField("parent");
        this.A02 = declaredField;
        declaredField.setAccessible(true);
        this.A00 = BV4.A16(C3cG.A0h());
        this.A06 = new ThreadLocal<>();
    }
}
