package X;

import android.util.JsonToken;

/* renamed from: X.CEr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3326CEr {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[JsonToken.values().length];
        try {
            AnonymousClass002.A13(JsonToken.NULL, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(JsonToken.STRING, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass002.A15(JsonToken.NUMBER, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            AnonymousClass002.A16(JsonToken.BOOLEAN, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AnonymousClass002.A17(JsonToken.BEGIN_ARRAY, iArr);
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AnonymousClass002.A18(JsonToken.BEGIN_OBJECT, iArr);
        } catch (NoSuchFieldError unused6) {
        }
        A00 = iArr;
    }
}
