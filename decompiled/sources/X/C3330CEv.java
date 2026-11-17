package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.CEv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3330CEv implements F94 {
    public Integer A00;
    public String A01;
    public C3328CEt A02;
    public final JsonReader A03;

    @Override // X.F94
    public final Integer ARK() {
        Integer num;
        this.A01 = null;
        this.A02 = null;
        JsonReader jsonReader = this.A03;
        JsonToken jsonTokenPeek = jsonReader.peek();
        int[] iArr = AbstractC3329CEu.A00;
        switch (iArr[jsonTokenPeek.ordinal()]) {
            case 1:
                num = C79.A0P;
                break;
            case 2:
                num = C79.A0Y;
                break;
            case 3:
                num = C79.A0c;
                break;
            case 4:
                num = C79.A00;
                break;
            case 5:
                num = C79.A01;
                break;
            case 6:
                num = C79.A0C;
                break;
            case 7:
                num = C79.A0K;
                break;
            case 8:
                num = C79.A02;
                break;
            case 9:
                num = C79.A0Z;
                break;
            case 10:
                num = C79.A0T;
                break;
            default:
                throw C3cG.A0Q(AnonymousClass007.A0a("unknown JsonToken ", jsonTokenPeek));
        }
        this.A00 = num;
        switch (iArr[jsonReader.peek().ordinal()]) {
            case 1:
                this.A01 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A02 = new C3328CEt(jsonReader);
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw C3cG.A0Q("unknown JsonToken ");
        }
        return this.A00;
    }

    @Override // X.F94
    public final String AXk() {
        return this.A01;
    }

    @Override // X.F94
    public final Integer AXl() {
        return this.A00;
    }

    @Override // X.F94
    public final F95 AXm() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x000b A[SYNTHETIC] */
    @Override // X.F94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Afp() {
        /*
            r4 = this;
            java.lang.Integer r1 = r4.A00
            java.lang.Integer r3 = X.C79.A00
            if (r1 == r3) goto La
            java.lang.Integer r0 = X.C79.A0C
            if (r1 != r0) goto L21
        La:
            r2 = 1
        Lb:
            java.lang.Integer r1 = r4.ARK()
            if (r1 == r3) goto L22
            java.lang.Integer r0 = X.C79.A0C
            if (r1 == r0) goto L22
            java.lang.Integer r0 = X.C79.A01
            if (r1 == r0) goto L1d
            java.lang.Integer r0 = X.C79.A0K
            if (r1 != r0) goto Lb
        L1d:
            int r2 = r2 + (-1)
        L1f:
            if (r2 != 0) goto Lb
        L21:
            return
        L22:
            int r2 = r2 + 1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3330CEv.Afp():void");
    }

    public C3330CEv(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }
}
