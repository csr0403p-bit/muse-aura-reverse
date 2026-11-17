package X;

import java.lang.ref.SoftReference;

@Deprecated
/* renamed from: X.El8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7330El8 {
    public static final C7328El6 A00;
    public static final ThreadLocal<SoftReference<HjR>> A01;

    static {
        A00 = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? AbstractC7329El7.A00 : null;
        A01 = new ThreadLocal<>();
    }
}
