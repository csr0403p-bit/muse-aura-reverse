package com.google.common.base;

import X.BV4;
import X.BV5;
import X.BV7;
import X.BV8;
import X.C60O;
import X.FGI;

/* loaded from: classes5.dex */
public abstract class Preconditions {
    public static String badPositionIndex(int index, int size, String desc) {
        Object[] objArrA1b;
        String str;
        if (index < 0) {
            objArrA1b = BV5.A1a(desc, index);
            str = "%s (%s) must not be negative";
        } else {
            if (size < 0) {
                throw BV5.A0Q("negative size: ", size);
            }
            objArrA1b = BV8.A1b(desc, index, size);
            str = "%s (%s) must not be greater than size (%s)";
        }
        return Strings.lenientFormat(str, objArrA1b);
    }

    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw BV4.A0P();
        }
    }

    public static int checkElementIndex(int index, int size) {
        Object[] objArr;
        String str;
        if (index < 0) {
            objArr = new Object[]{"index", Integer.valueOf(index)};
            str = "%s (%s) must not be negative";
        } else {
            if (index < size) {
                return index;
            }
            if (size < 0) {
                throw new IllegalArgumentException(FGI.A0H("negative size: ", size));
            }
            objArr = new Object[]{"index", Integer.valueOf(index), Integer.valueOf(size)};
            str = "%s (%s) must be less than size (%s)";
        }
        throw new IndexOutOfBoundsException(Strings.lenientFormat(str, objArr));
    }

    public static <T> T checkNotNull(T reference, Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static int checkPositionIndex(int index, int size) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(badPositionIndex(index, size, "index"));
        }
        return index;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkPositionIndexes(int r1, int r2, int r3) {
        /*
            if (r1 < 0) goto L7
            if (r2 < r1) goto Lf
            if (r2 > r3) goto Lf
            return
        L7:
            java.lang.String r0 = "start index"
            java.lang.String r0 = badPositionIndex(r1, r3, r0)
            goto L1f
        Lf:
            if (r1 > r3) goto L7
            if (r2 < 0) goto L24
            if (r2 > r3) goto L24
            java.lang.Object[] r1 = X.BV5.A1Z(r2, r1)
            java.lang.String r0 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r0 = com.google.common.base.Strings.lenientFormat(r0, r1)
        L1f:
            java.lang.IndexOutOfBoundsException r0 = X.BV6.A0g(r0)
            throw r0
        L24:
            java.lang.String r0 = "end index"
            java.lang.String r0 = badPositionIndex(r2, r3, r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Preconditions.checkPositionIndexes(int, int, int):void");
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p1) {
        if (expression) {
        } else {
            throw BV7.A0k(errorMessageTemplate, BV4.A1X(p1));
        }
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p1) {
        if (expression) {
        } else {
            throw BV7.A0m(errorMessageTemplate, BV4.A1X(p1));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, Object p1, Object p2) {
        if (expression) {
        } else {
            throw BV7.A0k(errorMessageTemplate, new Object[]{p1, p2});
        }
    }

    public static void checkState(boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p1) {
        if (expression) {
        } else {
            throw BV7.A0k(errorMessageTemplate, BV5.A1Y(p1));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, Object p1) {
        if (expression) {
        } else {
            throw BV7.A0k(errorMessageTemplate, new Object[]{p1});
        }
    }

    public static void checkArgument(boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw C60O.A0i(String.valueOf(errorMessage));
        }
    }
}
