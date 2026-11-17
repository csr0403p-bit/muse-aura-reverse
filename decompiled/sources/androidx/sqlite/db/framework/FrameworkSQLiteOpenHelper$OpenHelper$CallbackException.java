package androidx.sqlite.db.framework;

import X.EnumC2385BYa;

/* loaded from: classes5.dex */
public final class FrameworkSQLiteOpenHelper$OpenHelper$CallbackException extends RuntimeException {
    public final EnumC2385BYa callbackName;
    public final Throwable cause;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(EnumC2385BYa enumC2385BYa, Throwable th) {
        super(th);
        this.callbackName = enumC2385BYa;
        this.cause = th;
    }
}
