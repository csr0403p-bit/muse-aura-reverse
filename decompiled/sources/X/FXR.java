package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FXR {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        A00 = iArr;
        try {
            AnonymousClass002.A13(TimeUnit.NANOSECONDS, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(TimeUnit.MICROSECONDS, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass002.A15(TimeUnit.MILLISECONDS, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            AnonymousClass002.A16(TimeUnit.SECONDS, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AnonymousClass002.A17(TimeUnit.MINUTES, iArr);
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AnonymousClass002.A18(TimeUnit.HOURS, iArr);
        } catch (NoSuchFieldError unused6) {
        }
        try {
            AnonymousClass006.A1G(TimeUnit.DAYS, iArr);
        } catch (NoSuchFieldError unused7) {
        }
    }
}
