package X;

import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class CPc {
    public final C3474CPd A00 = new C3474CPd();
    public final String A01;
    public volatile Logger A02;

    public final Logger A00() {
        Logger logger;
        Logger logger2 = this.A02;
        if (logger2 != null) {
            return logger2;
        }
        synchronized (this.A00) {
            logger = this.A02;
            if (logger == null) {
                logger = Logger.getLogger(this.A01);
                this.A02 = logger;
            }
        }
        return logger;
    }

    public CPc(Class cls) {
        this.A01 = cls.getName();
    }
}
