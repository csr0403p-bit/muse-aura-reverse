package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.Hua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10569Hua implements F94 {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack<EnumC10588HxC> A03;
    public final Stack<Iterator> A04;
    public final HsI A05;
    public final F6L A06;

    @Override // X.F94
    public final Integer ARK() {
        EnumC10588HxC enumC10588HxC;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack<EnumC10588HxC> stack = this.A03;
        EnumC10588HxC enumC10588HxCPeek = stack.peek();
        Stack<Iterator> stack2 = this.A04;
        Iterator itPeek = stack2.peek();
        int iOrdinal = enumC10588HxCPeek.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    stack.pop();
                    stack.push(EnumC10588HxC.ObjectReadName);
                } else if (iOrdinal == 3) {
                    this.A00 = C79.A00;
                    stack.pop();
                    enumC10588HxC = EnumC10588HxC.ArrayReadValue;
                } else if (iOrdinal == 4) {
                    this.A01 = null;
                    if (itPeek.hasNext()) {
                        this.A01 = itPeek.next();
                    } else {
                        this.A00 = C79.A01;
                        stack2.pop();
                        stack.pop();
                    }
                }
                Object obj = this.A01;
                if (obj == null) {
                    num = C79.A0c;
                } else if (obj instanceof Boolean) {
                    num = C79.A0Z;
                } else if (obj instanceof Number) {
                    num = C79.A0Y;
                } else if (obj instanceof HsM) {
                    num = C79.A0W;
                } else if (obj instanceof String) {
                    num = C79.A0T;
                } else if (obj instanceof List) {
                    stack2.push(AbstractC7607F5u.A13(obj));
                    stack.push(EnumC10588HxC.ArrayReadValue);
                    num = C79.A00;
                } else {
                    if (!(obj instanceof Map)) {
                        throw BV5.A0U("unknown value type", String.valueOf(obj));
                    }
                    stack2.push(AnonymousClass002.A0n((Map) obj));
                    stack.push(EnumC10588HxC.ObjectReadName);
                    num = C79.A0C;
                }
                this.A00 = num;
            } else {
                this.A01 = null;
                if (itPeek.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itPeek);
                    this.A02 = C60O.A0t(entryA0l);
                    this.A01 = entryA0l.getValue();
                    this.A00 = C79.A0P;
                    stack.pop();
                    enumC10588HxC = EnumC10588HxC.ObjectReadValue;
                } else {
                    this.A00 = C79.A0K;
                    stack.pop();
                    stack2.pop();
                }
            }
            return this.A00;
        }
        this.A00 = C79.A0C;
        stack.pop();
        enumC10588HxC = EnumC10588HxC.ObjectReadName;
        stack.push(enumC10588HxC);
        return this.A00;
    }

    @Override // X.F94
    public final String AXk() {
        return this.A02;
    }

    @Override // X.F94
    public final Integer AXl() {
        return this.A00;
    }

    @Override // X.F94
    public final F95 AXm() {
        HsI hsI = this.A05;
        hsI.A00 = this.A01;
        return hsI;
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
        throw new UnsupportedOperationException("Method not decompiled: X.C10569Hua.Afp():void");
    }

    public C10569Hua(F6L f6l, Iterator it) {
        Stack<Iterator> stack = new Stack<>();
        this.A04 = stack;
        Stack<EnumC10588HxC> stack2 = new Stack<>();
        this.A03 = stack2;
        this.A05 = new HsI();
        this.A06 = f6l;
        stack.add(it);
        stack2.add(EnumC10588HxC.ReadObject);
    }
}
