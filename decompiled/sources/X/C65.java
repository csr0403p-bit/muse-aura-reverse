package X;

import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class C65 {
    public final File A00;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r10v0 X.C65) */
    public static synchronized C3259C6c A00(C65 c65, String str, long j) {
        C3259C6c c3259C6c;
        synchronized (c65) {
            if (j < 0) {
                throw BV4.A0P();
            }
            File file = c65.A00;
            if (!file.exists() || file.length() <= j) {
                return null;
            }
            try {
                try {
                    RandomAccessFile randomAccessFileA0L = BV4.A0L(file);
                    try {
                        if (BV4.A00(randomAccessFileA0L, j) == 1) {
                            c3259C6c = new C3259C6c(-425L);
                        } else {
                            long j2 = randomAccessFileA0L.readLong();
                            if (j2 < 0) {
                                c3259C6c = new C3259C6c(-869L);
                            } else {
                                long j3 = randomAccessFileA0L.readLong();
                                c3259C6c = j3 < 0 ? new C3259C6c(-869L) : (j2 == 0 || j3 == 0) ? new C3259C6c(-758L) : new C3259C6c(j2, j3);
                            }
                        }
                        randomAccessFileA0L.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFileA0L.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (NumberFormatException e) {
                    C2Q.A00().AT9("AppStateParserRelAbs", e, null);
                    CFK.A0D(C9Y.TAG, "Could not read %s", e, str);
                    c3259C6c = new C3259C6c(-647L);
                }
            } catch (IOException e2) {
                C2Q.A00().AT9("AppStateParserRelAbs", e2, null);
                CFK.A0D(C9Y.TAG, "Could not read %s due to IO issue", e2, str);
                c3259C6c = new C3259C6c(-536L);
            }
            return c3259C6c;
        }
    }

    public final synchronized char A01() {
        char cA00;
        File file = this.A00;
        if (!file.exists() || file.length() <= 1) {
            cA00 = '?';
        } else {
            try {
                RandomAccessFile randomAccessFileA0L = BV4.A0L(file);
                try {
                    cA00 = (char) BV4.A00(randomAccessFileA0L, 1L);
                    randomAccessFileA0L.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFileA0L.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C2Q.A00().AT9("AppStateParserForegroundState", e, null);
                CFK.A0A(C9Y.TAG, "Could not read activity state", e);
            }
        }
        return cA00;
    }

    public final synchronized char A02() {
        char cA00;
        File file = this.A00;
        if (!file.exists() || file.length() <= 0) {
            cA00 = C68.A0D.mSymbol;
        } else {
            try {
                RandomAccessFile randomAccessFileA0L = BV4.A0L(file);
                try {
                    cA00 = (char) BV4.A00(randomAccessFileA0L, 0L);
                    randomAccessFileA0L.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFileA0L.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C2Q.A00().AT9("AppStateParserStatus", e, null);
                CFK.A0A(C9Y.TAG, "Could not read status", e);
            }
        }
        return cA00;
    }

    public final synchronized int A03(boolean z) {
        int i = HatchWidgetWebViewKt.HTTP_NO_CONTENT;
        if (z) {
            i = 203;
        }
        File file = this.A00;
        if (file.exists()) {
            long j = i;
            if (file.length() > j) {
                try {
                    RandomAccessFile randomAccessFileA0L = BV4.A0L(file);
                    try {
                        byte bA00 = BV4.A00(randomAccessFileA0L, j);
                        randomAccessFileA0L.close();
                        return bA00;
                    } catch (Throwable th) {
                        try {
                            randomAccessFileA0L.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C2Q.A00().AT9("AppStateParserNumActivities", e, null);
                    CFK.A0A(C9Y.TAG, "Could not read number of activities byte", e);
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String A04() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.io.File r3 = r8.A00     // Catch: java.io.IOException -> La9 java.lang.Throwable -> Lb8
            java.lang.String r4 = r3.getCanonicalPath()     // Catch: java.io.IOException -> La9 java.lang.Throwable -> Lb8
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L40
            long r1 = r3.length()     // Catch: java.lang.Throwable -> La7
            r5 = 2
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L40
            java.io.RandomAccessFile r2 = X.BV4.A0L(r3)     // Catch: java.io.IOException -> L2e java.lang.Throwable -> La7
            byte r0 = X.BV4.A00(r2, r5)     // Catch: java.lang.Throwable -> L24
            char r7 = (char) r0     // Catch: java.lang.Throwable -> L24
            r2.close()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> La7
            goto L42
        L24:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            X.AbstractC7486Exp.A00(r1, r0)     // Catch: java.io.IOException -> L2e java.lang.Throwable -> La7
        L2d:
            throw r1     // Catch: java.io.IOException -> L2e java.lang.Throwable -> La7
        L2e:
            r3 = move-exception
            X.C4r r2 = X.C2Q.A00()     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "AppStateParserForegroundEntitySymbol"
            r0 = 0
            r2.AT9(r1, r3, r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read foreground entity"
            X.CFK.A0A(r1, r0, r3)     // Catch: java.lang.Throwable -> La7
        L40:
            r7 = 32
        L42:
            java.lang.String r0 = "_entity"
            java.io.File r1 = X.BV5.A0K(r4, r0)     // Catch: java.lang.Throwable -> Lb8
            r0 = 32
            if (r7 != r0) goto L4f
            java.lang.String r6 = "NONE"
            goto La2
        L4f:
            r0 = 33
            if (r7 != r0) goto L56
            java.lang.String r6 = "OTHERS"
            goto La2
        L56:
            java.util.Properties r5 = new java.util.Properties     // Catch: java.lang.Throwable -> Lb8
            r5.<init>()     // Catch: java.lang.Throwable -> Lb8
            r6 = 0
            r4 = 0
            java.io.FileInputStream r0 = X.BV4.A0H(r1)     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lb8
            r5.load(r0)     // Catch: java.lang.Throwable -> L8a
            r0.close()     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lb8
            java.util.Set r0 = r5.stringPropertyNames()     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> Lb8
        L6f:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto La2
            java.lang.String r2 = X.AnonymousClass005.A0j(r3)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r5.getProperty(r2)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L6f
            char r0 = r1.charAt(r4)     // Catch: java.lang.Throwable -> Lb8
            if (r7 != r0) goto L6f
            goto La1
        L8a:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r0 = move-exception
            X.AbstractC7486Exp.A00(r1, r0)     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lb8
        L93:
            throw r1     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lb8
        L94:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "ForegroundEntityMapper"
            java.lang.String r0 = "Failed to load entity mapping file"
            X.BzX.A00(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb8
            goto La2
        La1:
            r6 = r2
        La2:
            if (r6 != 0) goto Lb6
            java.lang.String r6 = ""
            goto Lb6
        La7:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb8
        La9:
            r3 = move-exception
            X.C4r r2 = X.C2Q.A00()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "AppStateParserForegroundEntityName"
            r0 = 0
            r2.AT9(r1, r3, r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r6 = ""
        Lb6:
            monitor-exit(r8)
            return r6
        Lb8:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65.A04():java.lang.String");
    }

    public C65(File file) {
        this.A00 = file;
    }
}
