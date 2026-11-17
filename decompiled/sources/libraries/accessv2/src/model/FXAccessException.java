package libraries.accessv2.src.model;

import X.ENz;

/* loaded from: classes5.dex */
public final class FXAccessException extends Exception {
    public final ENz code;
    public final String message;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public FXAccessException(String str, ENz eNz) {
        super(str);
        this.code = eNz;
        this.message = str;
    }
}
