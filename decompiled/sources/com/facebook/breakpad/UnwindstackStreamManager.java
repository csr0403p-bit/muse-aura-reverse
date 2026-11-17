package com.facebook.breakpad;

import X.BV4;
import X.BV5;
import X.C3cG;
import X.C60O;
import X.CFK;
import X.ETi;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public class UnwindstackStreamManager {
    public static volatile boolean isRegistered;
    public static boolean isUnwindstackJniLoaded;

    public static native void nativeRegister(String str, String str2);

    public static native void nativeUnregister();

    public static boolean register() {
        String strA04;
        boolean z;
        synchronized (UnwindstackStreamManager.class) {
            if (!isRegistered) {
                if (isUnwindstackJniLoaded) {
                    try {
                        strA04 = ETi.A04("libunwindstack_binary.so");
                    } catch (IOException e) {
                        CFK.A08("unwindstack", "Error registering unwindstack stream", e);
                    }
                    if (strA04 == null) {
                        CFK.A04("unwindstack", "Unable to find libunwindstack_binary.so");
                    } else {
                        ArrayList arrayListA0u = BV5.A0u("libunwindstack_binary.so");
                        ArrayList arrayListA0h = C3cG.A0h();
                        File parentFile = BV4.A0G(strA04).getParentFile();
                        if (parentFile != null) {
                            arrayListA0h.add(parentFile.getCanonicalPath());
                        }
                        for (int i = 0; i < arrayListA0u.size(); i++) {
                            String str = (String) arrayListA0u.get(i);
                            ReentrantReadWriteLock reentrantReadWriteLock = ETi.A0A;
                            reentrantReadWriteLock.readLock().lock();
                            try {
                                String[] strArrA06 = null;
                                if (ETi.A0E != null) {
                                    int i2 = 0;
                                    while (i2 < ETi.A0E.length) {
                                        strArrA06 = ETi.A0E[i2].A06(str);
                                        i2++;
                                        if (strArrA06 != null) {
                                            break;
                                        }
                                    }
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                if (strArrA06 == null) {
                                    CFK.A0H("unwindstack", "unable to find dependencies for %s, but it's okay for SystemLoadWrapperSoSource", arrayListA0u.get(i));
                                } else {
                                    for (String str2 : strArrA06) {
                                        String strA042 = ETi.A04(str2);
                                        if (strA042 == null) {
                                            CFK.A0H("unwindstack", "unable to find path for %s", str2);
                                        } else if (!arrayListA0u.contains(str2) && !strA042.startsWith("/system") && !strA042.startsWith("/vendor") && !strA042.startsWith("/apex") && !strA042.startsWith("/odm")) {
                                            arrayListA0u.add(str2);
                                            File parentFile2 = new File(strA042).getParentFile();
                                            if (parentFile2 != null) {
                                                String canonicalPath = parentFile2.getCanonicalPath();
                                                if (!arrayListA0h.contains(canonicalPath)) {
                                                    arrayListA0h.add(canonicalPath);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                BV4.A1R(reentrantReadWriteLock);
                                throw th;
                            }
                        }
                        StringBuilder sbA0x = C60O.A0x((String) arrayListA0h.get(0));
                        for (int i3 = 1; i3 < arrayListA0h.size(); i3++) {
                            sbA0x.append(":");
                            sbA0x.append((String) arrayListA0h.get(i3));
                        }
                        nativeRegister(strA04, sbA0x.toString());
                        z = true;
                        isRegistered = z;
                    }
                } else {
                    CFK.A04("unwindstack", "Loading unwindstack jni native library failed. Cannot register unwindstack stream to breakpad");
                }
                z = false;
                isRegistered = z;
            }
        }
        return isRegistered;
    }

    static {
        try {
            ETi.loadLibrary("unwindstack_stream");
            isUnwindstackJniLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            CFK.A08("unwindstack", "Failed to load unwindstack jni library: ", e);
        }
    }
}
