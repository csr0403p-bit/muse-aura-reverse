package X;

import java.util.Iterator;
import kotlinx.coroutines.android.AndroidDispatcherFactory;

/* renamed from: X.Evm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7429Evm {
    public static final GB9 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.android.AndroidDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    static {
        ?? A01;
        AndroidDispatcherFactory androidDispatcherFactory;
        try {
            String property = System.getProperty("kotlinx.coroutines.fast.service.loader");
            if (property != null) {
                Boolean.parseBoolean(property);
            }
        } catch (SecurityException unused) {
        }
        Object next = null;
        try {
            A01 = C60O.A11(2);
            AndroidDispatcherFactory androidDispatcherFactory2 = null;
            try {
                androidDispatcherFactory = (AndroidDispatcherFactory) BV5.A0b(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, AndroidDispatcherFactory.class.getClassLoader()));
            } catch (ClassNotFoundException unused2) {
            }
            if (androidDispatcherFactory != null) {
                A01.add(androidDispatcherFactory);
                try {
                    androidDispatcherFactory2 = (AndroidDispatcherFactory) BV5.A0b(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, AndroidDispatcherFactory.class.getClassLoader()));
                } catch (ClassNotFoundException unused3) {
                }
                if (androidDispatcherFactory2 != null) {
                    A01.add(androidDispatcherFactory2);
                }
            } else {
                A01 = C42.A01(AndroidDispatcherFactory.class.getClassLoader());
            }
        } catch (Throwable unused4) {
            A01 = C42.A01(AndroidDispatcherFactory.class.getClassLoader());
        }
        Iterator it = A01.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                do {
                    it.next();
                } while (it.hasNext());
            }
        }
        ?? r4 = (AndroidDispatcherFactory) next;
        if (r4 != 0) {
            GB9 gb9CreateDispatcher = r4.createDispatcher(A01);
            if (gb9CreateDispatcher != null) {
                A00 = gb9CreateDispatcher;
                return;
            }
        }
        throw C3cG.A0Q("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
