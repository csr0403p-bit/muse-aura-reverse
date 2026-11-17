package X;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* renamed from: X.GnY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10002GnY implements Serializable {
    public static C10002GnY A00 = new C10002GnY();
    public static final long serialVersionUID = 1;
    public final int _maxNestingDepth = 1000;
    public final long _maxDocLen = -1;
    public final int _maxNumLen = 1000;
    public final int _maxStringLen = 20000000;
    public final int _maxNameLen = 50000;
    public final long _maxTokenCount = -1;

    @Deprecated
    public C10002GnY() {
    }

    public final void A02(int i) {
        int i2 = this._maxNumLen;
        if (i <= i2) {
            return;
        }
        A00("Number value length (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Integer.valueOf(i), Integer.valueOf(i2), "getMaxNumberLength"));
        throw F60.createAndThrow();
    }

    public final void A03(int i) {
        int i2 = this._maxNumLen;
        if (i <= i2) {
            return;
        }
        A00("Number value length (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Integer.valueOf(i), Integer.valueOf(i2), "getMaxNumberLength"));
        throw F60.createAndThrow();
    }

    public final void A04(int i) throws StreamConstraintsException {
        int i2 = this._maxNameLen;
        if (i <= i2) {
            return;
        }
        A00("Name length (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Integer.valueOf(i), Integer.valueOf(i2), "getMaxNameLength"));
        throw F60.createAndThrow();
    }

    public final void A05(long j) throws StreamConstraintsException {
        long j2 = this._maxDocLen;
        if (j <= j2 || j2 <= 0) {
            return;
        }
        A00("Document length (%d) exceeds the maximum allowed (%d, from %s)", FGI.A10(Long.valueOf(j), Long.valueOf(j2), "getMaxDocumentLength"));
        throw F60.createAndThrow();
    }

    public static final void A00(String str, Object... objArr) throws StreamConstraintsException {
        throw new StreamConstraintsException(String.format(str, objArr));
    }

    public final void A01(int i) {
        if (Math.abs(i) <= 100000) {
            return;
        }
        A00("BigDecimal scale (%d) magnitude exceeds the maximum allowed (%d)", BV5.A1Z(i, 100000));
        throw F60.createAndThrow();
    }
}
