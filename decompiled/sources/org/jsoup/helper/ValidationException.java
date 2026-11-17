package org.jsoup.helper;

import X.C10293Gtx;
import X.C3cG;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class ValidationException extends IllegalArgumentException {
    public static final String A00 = C10293Gtx.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        super.fillInStackTrace();
        StackTraceElement[] stackTrace = getStackTrace();
        ArrayList arrayListA0h = C3cG.A0h();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().equals(A00)) {
                arrayListA0h.add(stackTraceElement);
            }
        }
        setStackTrace((StackTraceElement[]) arrayListA0h.toArray(new StackTraceElement[0]));
        return this;
    }
}
