package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: X.CEt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3328CEt implements F95 {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    @Override // X.F95
    public final boolean A5I() throws IOException {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw A00(this);
    }

    @Override // X.F95
    public final int ANp() throws IOException {
        String str = this.A01;
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        throw A00(this);
    }

    @Override // X.F95
    public final boolean AOn() {
        return AnonymousClass002.A1Z(this.A02, JsonToken.NULL);
    }

    @Override // X.F95
    public final long APz() throws IOException {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        throw A00(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long, java.lang.Number] */
    @Override // X.F95
    public final Number ARX() throws IOException, NumberFormatException {
        String strValueOf = this.A01;
        if (strValueOf == 0) {
            throw A00(this);
        }
        try {
            strValueOf = Long.valueOf((String) strValueOf);
            return strValueOf;
        } catch (NumberFormatException unused) {
            return Double.valueOf(strValueOf);
        }
    }

    @Override // X.F95
    public final String AgW() throws IOException {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw A00(this);
    }

    public C3328CEt(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        this.A02 = jsonTokenPeek;
        int i = AbstractC3327CEs.A00[jsonTokenPeek.ordinal()];
        if (i == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
            return;
        }
        if (i == 2) {
            jsonReader.nextNull();
        } else {
            if (i != 3 && i != 4) {
                throw C3cG.A0Q("can't read value");
            }
            this.A01 = jsonReader.nextString();
        }
    }

    public static IOException A00(C3328CEt c3328CEt) {
        StringBuilder sb = new StringBuilder("type mis matching");
        sb.append(c3328CEt.A02);
        return new IOException(sb.toString());
    }
}
