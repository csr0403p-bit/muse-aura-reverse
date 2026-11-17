package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7609F5w;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AnonymousClass002;
import X.BV6;
import X.C60O;
import X.C60Q;
import X.C79;
import X.EnumC10072Got;
import X.EnumC9834GiY;
import X.F60;
import X.FGI;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.net.MalformedURLException;

/* loaded from: classes6.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public class StringBufferDeserializer extends FromStringDeserializer<Object> {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
            String strA27 = abstractC9916Gl7.A27();
            return strA27 != null ? new StringBuffer(strA27) : super.A0i(abstractC9916Gl7, abstractC9904Gkk);
        }
    }

    public class StringBuilderDeserializer extends FromStringDeserializer<Object> {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
            String strA27 = abstractC9916Gl7.A27();
            return strA27 != null ? C60O.A0x(strA27) : super.A0i(abstractC9916Gl7, abstractC9904Gkk);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x0419, code lost:
    
        if (r8 == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x041b, code lost:
    
        if (r9 == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x041d, code lost:
    
        r0 = r16.lastIndexOf(58) + 1;
        r8 = r16.substring(0, r0);
        r9 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.A00(r16.substring(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0432, code lost:
    
        if (r9 == null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0434, code lost:
    
        r12 = X.FGI.A0d(r8, java.lang.Integer.toHexString(((r9[0] & 255) << 8) | (r9[1] & 255)), ":", java.lang.Integer.toHexString((r9[3] & 255) | ((r9[2] & 255) << 8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x045a, code lost:
    
        if (r7 == (-1)) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x045c, code lost:
    
        r12 = r12.substring(0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0460, code lost:
    
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0462, code lost:
    
        r11 = r12.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0468, code lost:
    
        if (r2 >= r11) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x046e, code lost:
    
        if (r12.charAt(r2) != ':') goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0470, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0472, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0476, code lost:
    
        if (r1 < 2) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x047a, code lost:
    
        if (r1 > 8) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x047c, code lost:
    
        r14 = 1;
        r1 = r1 + 1;
        r9 = 8 - r1;
        r15 = 0;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0484, code lost:
    
        r8 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0486, code lost:
    
        if (r15 >= r8) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x048c, code lost:
    
        if (r12.charAt(r15) != ':') goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0494, code lost:
    
        if (r12.charAt(r15 + 1) != ':') goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0496, code lost:
    
        if (r16 != false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0498, code lost:
    
        r8 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x049a, code lost:
    
        if (r15 != 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x049c, code lost:
    
        r8 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04a0, code lost:
    
        if (r15 != (r11 - 2)) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04a2, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04a4, code lost:
    
        r9 = r8;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04a7, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04ae, code lost:
    
        if (r12.charAt(0) != ':') goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04b4, code lost:
    
        if (r12.charAt(1) == ':') goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04bc, code lost:
    
        if (r12.charAt(r8) != ':') goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04c4, code lost:
    
        if (r12.charAt(r11 - 2) == ':') goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04c7, code lost:
    
        if (r16 == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04c9, code lost:
    
        if (r9 > 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x04cc, code lost:
    
        if (r1 == 8) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04cf, code lost:
    
        r7 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04d9, code lost:
    
        if (r12.charAt(0) == ':') goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04db, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04dc, code lost:
    
        if (r14 >= r11) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04de, code lost:
    
        r2 = r12.indexOf(58, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04e2, code lost:
    
        if (r2 != (-1)) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04e4, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04e5, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ea, code lost:
    
        if (r12.charAt(r14) == ':') goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04ec, code lost:
    
        r1 = r2 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04ee, code lost:
    
        if (r1 <= 0) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04f1, code lost:
    
        if (r1 > 4) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04f3, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04f4, code lost:
    
        if (r14 >= r2) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04f6, code lost:
    
        r1 = r1 << 4;
        r15 = r12.charAt(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04fe, code lost:
    
        if (r15 <= '\u007f') goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0501, code lost:
    
        r0 = java.lang.Character.digit(r15, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0506, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0507, code lost:
    
        r1 = r1 | r0;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x050b, code lost:
    
        r7.putShort((short) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0510, code lost:
    
        if (r0 >= r9) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0512, code lost:
    
        r7.putShort(0);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0518, code lost:
    
        r14 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0520, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0521, code lost:
    
        r0 = r7.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0526, code lost:
    
        if (r9 == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0528, code lost:
    
        if (r7 != (-1)) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x052a, code lost:
    
        r0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std.A00(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x052e, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x052f, code lost:
    
        if (r0 != null) goto L316;
     */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Gkk;)TT; */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0551  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1M(X.AbstractC9904Gkk r15, java.lang.String r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.A1M(X.Gkk, java.lang.String):java.lang.Object");
    }

    public class Std extends FromStringDeserializer<Object> {
        public static final long serialVersionUID = 1;
        public final int _kind;

        public static byte[] A00(String str) {
            int length;
            int iDigit;
            int i = 0;
            int i2 = 0;
            while (true) {
                length = str.length();
                if (i >= length) {
                    break;
                }
                if (str.charAt(i) == '.') {
                    i2++;
                }
                i++;
            }
            if (i2 + 1 != 4) {
                return null;
            }
            byte[] bArr = new byte[4];
            int i3 = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                int iIndexOf = str.indexOf(46, i3);
                if (iIndexOf == -1) {
                    iIndexOf = length;
                }
                int i5 = iIndexOf - i3;
                if (i5 <= 0 || i5 > 3) {
                    throw new NumberFormatException();
                }
                if (i5 > 1 && str.charAt(i3) == '0') {
                    throw new NumberFormatException();
                }
                int i6 = 0;
                while (i3 < iIndexOf) {
                    try {
                        int i7 = i6 * 10;
                        char cCharAt = str.charAt(i3);
                        if (cCharAt > '\u007f' || (iDigit = Character.digit(cCharAt, 10)) < 0) {
                            throw new NumberFormatException();
                        }
                        i6 = i7 + iDigit;
                        i3++;
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                }
                if (i6 > 255) {
                    throw new NumberFormatException();
                }
                bArr[i4] = (byte) i6;
                i3 = iIndexOf + 1;
                return null;
            }
            return bArr;
        }

        public Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws InvalidFormatException {
        String strA27 = abstractC9916Gl7.A27();
        if (strA27 == null) {
            EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
            if (enumC9834GiYA1N != EnumC9834GiY.START_OBJECT) {
                if (enumC9834GiYA1N == EnumC9834GiY.START_ARRAY) {
                    return A16(abstractC9916Gl7, abstractC9904Gkk);
                }
                if (enumC9834GiYA1N == EnumC9834GiY.VALUE_EMBEDDED_OBJECT) {
                    T t = (T) abstractC9916Gl7.A1V();
                    if (t == null) {
                        return null;
                    }
                    return !BV6.A1Y(this._valueClass, t) ? A1L(abstractC9904Gkk, t) : t;
                }
            }
            JsonDeserializer.A0T(abstractC9916Gl7, abstractC9904Gkk, this);
            throw F60.createAndThrow();
        }
        if (!strA27.isEmpty()) {
            if (this instanceof Std ? AnonymousClass002.A1P(((Std) this)._kind, 7) : true) {
                String strTrim = strA27.trim();
                if (strTrim == strA27 || !strTrim.isEmpty()) {
                    strA27 = strTrim;
                }
            }
            try {
                return (T) A1M(abstractC9904Gkk, strA27);
            } catch (IllegalArgumentException | MalformedURLException e) {
                String message = e.getMessage();
                InvalidFormatException invalidFormatExceptionA0Q = abstractC9904Gkk.A0Q(this._valueClass, strA27, message != null ? FGI.A0M("not a valid textual representation, problem: ", message) : "not a valid textual representation");
                invalidFormatExceptionA0Q.initCause(e);
                throw invalidFormatExceptionA0Q;
            }
        }
        return (T) A1K(abstractC9904Gkk);
    }

    public Object A1K(AbstractC9904Gkk abstractC9904Gkk) {
        EnumC10072Got enumC10072GotA0O = abstractC9904Gkk.A0O(A0e(), this._valueClass, C79.A0c);
        if (enumC10072GotA0O != EnumC10072Got.Fail) {
            return (enumC10072GotA0O == EnumC10072Got.AsNull || !(enumC10072GotA0O == EnumC10072Got.AsEmpty || (this instanceof Std))) ? AIA(abstractC9904Gkk) : A0m(abstractC9904Gkk);
        }
        abstractC9904Gkk.A0c(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", A19());
        throw F60.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T A1L(Object obj, AbstractC9904Gkk abstractC9904Gkk) {
        obj.A0c(this, "Don't know how to convert embedded Object of type %s into %s", AbstractC7609F5w.A1b(this._valueClass, C60Q.A0e(abstractC9904Gkk)));
        throw F60.createAndThrow();
    }
}
