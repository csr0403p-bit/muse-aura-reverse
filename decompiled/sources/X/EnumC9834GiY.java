package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.GiY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9834GiY {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL(HatchCcvLoggingKt.NO_POSTAL_FIELD, 11);

    public final int _id;
    public final boolean _isBoolean;
    public final boolean _isNumber;
    public final boolean _isScalar;
    public final boolean _isStructEnd;
    public final boolean _isStructStart;
    public final String _serialized;
    public final byte[] _serializedBytes;
    public final char[] _serializedChars;

    public static String A00(EnumC9834GiY enumC9834GiY) {
        if (enumC9834GiY == null) {
            return "<end of input>";
        }
        switch (enumC9834GiY.ordinal()) {
            case 1:
            case 2:
            case 5:
                return "Object value";
            case 3:
            case 4:
                return "Array value";
            case 6:
                return "Embedded Object value";
            case 7:
                return "String value";
            case 8:
                return "Integer value";
            case 9:
                return "Floating-point value";
            case 10:
            case 11:
                return "Boolean value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    EnumC9834GiY(java.lang.String r9, int r10) {
        /*
            r6 = this;
            r6.<init>(r7, r8)
            r5 = 0
            if (r9 != 0) goto L48
            r0 = 0
            r6._serialized = r0
            r6._serializedChars = r0
            r6._serializedBytes = r0
        Ld:
            r6._id = r10
            r0 = 10
            r2 = 1
            if (r10 == r0) goto L19
            r1 = 9
            r0 = 0
            if (r10 != r1) goto L1a
        L19:
            r0 = 1
        L1a:
            r6._isBoolean = r0
            r0 = 7
            if (r10 == r0) goto L24
            r1 = 8
            r0 = 0
            if (r10 != r1) goto L25
        L24:
            r0 = 1
        L25:
            r6._isNumber = r0
            if (r10 == r2) goto L2d
            r0 = 3
            r2 = 0
            if (r10 != r0) goto L2e
        L2d:
            r2 = 1
        L2e:
            r6._isStructStart = r2
            r0 = 2
            if (r10 == r0) goto L37
            r1 = 4
            r0 = 0
            if (r10 != r1) goto L38
        L37:
            r0 = 1
        L38:
            r6._isStructEnd = r0
            if (r2 != 0) goto L45
            if (r0 != 0) goto L45
            r0 = 5
            if (r10 == r0) goto L45
            r0 = -1
            if (r10 == r0) goto L45
            r5 = 1
        L45:
            r6._isScalar = r5
            return
        L48:
            r6._serialized = r9
            char[] r4 = r9.toCharArray()
            r6._serializedChars = r4
            int r3 = r4.length
            byte[] r2 = new byte[r3]
            r6._serializedBytes = r2
            r1 = 0
        L56:
            if (r1 >= r3) goto Ld
            char r0 = r4[r1]
            byte r0 = (byte) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC9834GiY.<init>(java.lang.String, int, java.lang.String, int):void");
    }
}
