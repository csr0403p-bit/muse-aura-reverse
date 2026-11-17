package X;

import android.util.JsonToken;

/* renamed from: X.CEu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3329CEu {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[JsonToken.values().length];
        A00 = iArr;
        try {
            AnonymousClass002.A13(JsonToken.NAME, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            AnonymousClass002.A14(JsonToken.NUMBER, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            AnonymousClass002.A15(JsonToken.NULL, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        try {
            AnonymousClass002.A16(JsonToken.BEGIN_ARRAY, iArr);
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AnonymousClass002.A17(JsonToken.END_ARRAY, iArr);
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AnonymousClass002.A18(JsonToken.BEGIN_OBJECT, iArr);
        } catch (NoSuchFieldError unused6) {
        }
        try {
            AnonymousClass006.A1G(JsonToken.END_OBJECT, iArr);
        } catch (NoSuchFieldError unused7) {
        }
        try {
            AnonymousClass006.A1H(JsonToken.END_DOCUMENT, iArr);
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[JsonToken.BOOLEAN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[JsonToken.STRING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
