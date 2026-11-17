package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes5.dex */
public abstract class C42 {
    public static final List A01(ClassLoader classLoader) {
        List<String> listA00;
        try {
            ArrayList list = Collections.list(classLoader.getResources(FGI.A0M("META-INF/services/", AndroidDispatcherFactory.class.getName())));
            C7384Etj.A0U(list);
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                URL url = (URL) it.next();
                String string = url.toString();
                if (AnonymousClass005.A1a(string, "jar")) {
                    String strA0U = C7BY.A0U(string, "jar:file:", string);
                    String strA0S = C7BY.A0S(strA0U, strA0U, PublicSuffixDatabase.EXCEPTION_MARKER);
                    String strA0U2 = C7BY.A0U(string, "!/", string);
                    JarFile jarFile = new JarFile(strA0S, false);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strA0U2)), HatchWebPageParserKt.UTF_8));
                        try {
                            listA00 = A00(bufferedReader);
                            bufferedReader.close();
                            jarFile.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC7531Ezs.A00(bufferedReader, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            try {
                                jarFile.close();
                                throw th4;
                            } catch (Throwable th5) {
                                CU7.A01(th3, th5);
                                throw th3;
                            }
                        }
                    }
                } else {
                    BufferedReader bufferedReaderA0J = BV5.A0J(url.openStream());
                    try {
                        listA00 = A00(bufferedReaderA0J);
                        bufferedReaderA0J.close();
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            AbstractC7531Ezs.A00(bufferedReaderA0J, th6);
                            throw th7;
                        }
                    }
                }
                AbstractC0882AGj.A0r(listA00, arrayListA0h);
            }
            Set setA0g = AbstractC0878AGe.A0g(arrayListA0h);
            if (setA0g.isEmpty()) {
                throw C60O.A0i("No providers were loaded with FastServiceLoader");
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(setA0g);
            Iterator it2 = setA0g.iterator();
            while (it2.hasNext()) {
                Class<?> cls = Class.forName(AnonymousClass005.A0j(it2), false, classLoader);
                if (!AndroidDispatcherFactory.class.isAssignableFrom(cls)) {
                    throw BV5.A0P(cls, ", but found ", C3cG.A0f(AndroidDispatcherFactory.class, "Expected service of class "));
                }
                arrayListA0i.add((AndroidDispatcherFactory) BV5.A0b(cls));
            }
            return arrayListA0i;
        } catch (Throwable unused) {
            return AbstractC0878AGe.A0X(ServiceLoader.load(AndroidDispatcherFactory.class, classLoader));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r4.add(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> A00(java.io.BufferedReader r5) throws java.io.IOException {
        /*
            java.util.LinkedHashSet r4 = X.C3cG.A0k()
        L4:
            java.lang.String r1 = r5.readLine()
            if (r1 != 0) goto Lf
            java.util.List r0 = X.AbstractC0878AGe.A0X(r4)
            return r0
        Lf:
            java.lang.String r0 = "#"
            java.lang.String r0 = X.C7BY.A0W(r1, r0, r1)
            java.lang.String r3 = X.AnonymousClass002.A0l(r0)
            r2 = 0
        L1a:
            int r0 = r3.length()
            if (r2 >= r0) goto L38
            char r1 = r3.charAt(r2)
            r0 = 46
            if (r1 == r0) goto L35
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = "Illegal service provider class name: "
            java.lang.IllegalArgumentException r0 = X.C60Q.A0U(r0, r3)
            throw r0
        L35:
            int r2 = r2 + 1
            goto L1a
        L38:
            if (r0 <= 0) goto L4
            r4.add(r3)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42.A00(java.io.BufferedReader):java.util.List");
    }
}
