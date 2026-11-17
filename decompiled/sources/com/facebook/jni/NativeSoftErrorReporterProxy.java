package com.facebook.jni;

import X.BV4;
import X.C7323Eky;
import X.C7324Ekz;
import X.CFK;
import X.FGI;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class NativeSoftErrorReporterProxy {
    public static final LinkedList<C7324Ekz> sSoftErrorCache = BV4.A0y();

    public static native void generateNativeSoftError();

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        try {
            String strA0U = FGI.A0U("[Native] ", i != 1 ? i != 2 ? "<level:unknown> " : "<level:mustfix> " : "<level:warning> ", str);
            synchronized (NativeSoftErrorReporterProxy.class) {
                LinkedList<C7324Ekz> linkedList = sSoftErrorCache;
                synchronized (linkedList) {
                    C7323Eky c7323Eky = new C7323Eky();
                    c7323Eky.A01 = strA0U;
                    if (str2 == null) {
                        CFK.A06("SoftError", "SoftError created with null message");
                        str2 = "[UNKNOWN_MESSAGE]";
                    }
                    c7323Eky.A02 = str2;
                    c7323Eky.A03 = th;
                    c7323Eky.A00 = i2;
                    linkedList.addLast(new C7324Ekz(c7323Eky));
                    while (linkedList.size() >= 50) {
                        linkedList.removeFirst();
                    }
                }
            }
            synchronized (NativeSoftErrorReporterProxy.class) {
            }
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, null, i2);
    }
}
