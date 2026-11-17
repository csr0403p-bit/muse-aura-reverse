package X;

import java.util.Arrays;

/* renamed from: X.CeP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3781CeP {
    public C3783CeR A01;
    public Object[] A02 = new Object[8];
    public int A00 = 0;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r6v0 ??, r6v4 ??, r6v1 ??, r6v2 short[], r6v3 ??, r6v8 byte[], r6v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:553)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public final X.C3772CeF A00() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3781CeP.A00():X.CeF");
    }

    public final void A01(Object obj, Object obj2) {
        int i = this.A00 + 1;
        Object[] objArrCopyOf = this.A02;
        int length = objArrCopyOf.length;
        int i2 = i + i;
        if (i2 > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, BV8.A02(length, i2));
            this.A02 = objArrCopyOf;
        }
        int i3 = this.A00;
        int i4 = i3 + i3;
        objArrCopyOf[i4] = obj;
        objArrCopyOf[i4 + 1] = obj2;
        this.A00 = i3 + 1;
    }
}
