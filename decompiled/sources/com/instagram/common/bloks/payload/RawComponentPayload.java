package com.instagram.common.bloks.payload;

import X.AbstractC0903AHf;
import X.AnonymousClass002;
import X.C06H;
import X.C3330CEv;
import X.C60O;
import X.C6793Ea3;
import X.C6795Ea6;
import X.C7384Etj;
import X.F94;
import android.util.JsonReader;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class RawComponentPayload implements Serializable {
    public static final long serialVersionUID = 1;

    public final class Json extends RawComponentPayload {
        public static final long serialVersionUID = 1;
        public final String text;

        public Json(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final Json copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Json(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Json) && C7384Etj.areEqual(this.text, ((Json) obj).text));
        }

        public static /* synthetic */ Json copy$default(Json json, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = json.text;
            }
            C7384Etj.A0Y(str, 0);
            return new Json(str);
        }

        public final String component1() {
            return this.text;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @Override // com.instagram.common.bloks.payload.RawComponentPayload
        public boolean isEmpty() {
            return AnonymousClass002.A1M(this.text.length());
        }

        public String toString() {
            return C60O.A0r("Json(text=", this.text);
        }

        @Override // com.instagram.common.bloks.payload.RawComponentPayload
        public F94 tokenizer() {
            return new C3330CEv(new JsonReader(new StringReader(this.text)));
        }
    }

    public final class TokenStream extends RawComponentPayload {
        public static final long serialVersionUID = 1;
        public final byte[] bytes;
        public final int length;
        public final int offset;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TokenStream(byte[] bArr) {
            this(bArr, 0, bArr.length);
            C7384Etj.A0Y(bArr, 0);
        }

        private final ByteBuffer slice() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.bytes, this.offset, this.length);
            C7384Etj.A0U(byteBufferWrap);
            return byteBufferWrap;
        }

        private final Object writeReplace() {
            int i = this.offset;
            return (i == 0 && this.length == this.bytes.length) ? this : new TokenStream(AbstractC0903AHf.A06(this.bytes, i, this.length + i));
        }

        public boolean equals(Object obj) {
            return (obj instanceof TokenStream) && slice().equals(((TokenStream) obj).slice());
        }

        @Override // com.instagram.common.bloks.payload.RawComponentPayload
        public boolean isEmpty() {
            return AnonymousClass002.A1M(this.length);
        }

        @Override // com.instagram.common.bloks.payload.RawComponentPayload
        public F94 tokenizer() {
            return new C6793Ea3(this.bytes, this.offset, this.length);
        }

        public int hashCode() {
            return slice().hashCode();
        }

        public TokenStream(byte[] bArr, int i, int i2) {
            C7384Etj.A0Y(bArr, 0);
            this.bytes = bArr;
            this.offset = i;
            this.length = i2;
        }
    }

    public static final RawComponentPayload A00(F94 f94) {
        C6793Ea3 c6793Ea3;
        C6795Ea6 c6795Ea6;
        C7384Etj.A0Y(f94, 0);
        if ((f94 instanceof C6793Ea3) && (c6793Ea3 = (C6793Ea3) f94) != null && (c6795Ea6 = c6793Ea3.A01) != null) {
            return new TokenStream(c6795Ea6.A02, c6795Ea6.A01, c6795Ea6.A00);
        }
        String strAgW = f94.AXm().AgW();
        C7384Etj.A0U(strAgW);
        return new Json(strAgW);
    }

    public abstract boolean isEmpty();

    public abstract F94 tokenizer();

    public /* synthetic */ RawComponentPayload(C06H c06h) {
    }

    public static final RawComponentPayload read(F94 f94) {
        return A00(f94);
    }

    public RawComponentPayload() {
    }
}
