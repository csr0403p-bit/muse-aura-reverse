package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class I11 implements Iterator {
    public final int $t;
    public int A00;
    public int A01;
    public final Object A02;

    public I11(final GEY this$0) {
        this.$t = 2;
        this.A02 = this$0;
        this.A01 = 0;
        this.A00 = this$0.A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r4 = this;
            int r0 = r4.$t
            switch(r0) {
                case 0: goto L7;
                case 1: goto L7;
                case 2: goto L7;
                case 3: goto L7;
                case 4: goto Lf;
                default: goto L5;
            }
        L5:
            r2 = 0
        L6:
            return r2
        L7:
            int r1 = r4.A01
            int r0 = r4.A00
            r2 = 1
            if (r1 < r0) goto L6
            goto L5
        Lf:
            java.lang.Object r3 = r4.A02
            X.Gt7 r3 = (X.Gt7) r3
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 == r0) goto L21
            java.lang.String r1 = "Use Iterator#remove() instead to remove attributes while iterating."
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>(r1)
            throw r0
        L21:
            int r1 = r4.A01
            int r0 = r3.A00
            r2 = 1
            if (r1 >= r0) goto L39
            java.lang.String[] r0 = r3.A02
            r0 = r0[r1]
            boolean r0 = X.Gt7.A04(r0)
            if (r0 == 0) goto L39
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
            goto L21
        L39:
            int r1 = r4.A01
            int r0 = r3.A00
            if (r1 >= r0) goto L5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I11.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        byte[] bArr;
        byte[] bArr2;
        int i2;
        byte b;
        switch (this.$t) {
            case 0:
                i = this.A01;
                if (i >= this.A00) {
                    throw C8j3.A1D();
                }
                this.A01 = i + 1;
                C9306GDi c9306GDi = (C9306GDi) ((AbstractC9309GDl) this.A02);
                if (!(c9306GDi instanceof C9308GDk)) {
                    bArr = c9306GDi.bytes;
                    b = bArr[i];
                    return Byte.valueOf(b);
                }
                C9308GDk c9308GDk = (C9308GDk) c9306GDi;
                bArr2 = c9308GDk.bytes;
                i2 = c9308GDk.bytesOffset;
                b = bArr2[i2 + i];
                return Byte.valueOf(b);
            case 1:
                i = this.A01;
                if (i >= this.A00) {
                    throw C8j3.A1D();
                }
                this.A01 = i + 1;
                C9322GEd c9322GEd = (C9322GEd) ((AbstractC9320GEb) this.A02);
                if (!(c9322GEd instanceof C9323GEe)) {
                    bArr = c9322GEd.bytes;
                    b = bArr[i];
                    return Byte.valueOf(b);
                }
                C9323GEe c9323GEe = (C9323GEe) c9322GEd;
                bArr2 = c9323GEe.bytes;
                i2 = c9323GEe.bytesOffset;
                b = bArr2[i2 + i];
                return Byte.valueOf(b);
            case 2:
                i = this.A01;
                if (i >= this.A00) {
                    throw C8j3.A1D();
                }
                this.A01 = i + 1;
                C9319GEa c9319GEa = (C9319GEa) ((GEY) this.A02);
                if (!(c9319GEa instanceof GEZ)) {
                    bArr = c9319GEa.bytes;
                    b = bArr[i];
                    return Byte.valueOf(b);
                }
                GEZ gez = (GEZ) c9319GEa;
                bArr2 = gez.bytes;
                i2 = gez.bytesOffset;
                b = bArr2[i2 + i];
                return Byte.valueOf(b);
            case 3:
                i = this.A01;
                if (i >= this.A00) {
                    throw C8j3.A1D();
                }
                this.A01 = i + 1;
                C9324GEf c9324GEf = (C9324GEf) ((AbstractC9321GEc) this.A02);
                if (!(c9324GEf instanceof C9325GEg)) {
                    bArr = c9324GEf.bytes;
                    b = bArr[i];
                    return Byte.valueOf(b);
                }
                C9325GEg c9325GEg = (C9325GEg) c9324GEf;
                bArr2 = c9325GEg.bytes;
                i2 = c9325GEg.bytesOffset;
                b = bArr2[i2 + i];
                return Byte.valueOf(b);
            case 4:
                Gt7 gt7 = (Gt7) this.A02;
                int i3 = gt7.A00;
                if (i3 != this.A00) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                int i4 = this.A01;
                if (i4 >= i3) {
                    throw C8j3.A1D();
                }
                String str = gt7.A02[i4];
                String str2 = (String) gt7.A01[i4];
                Gt6 gt6 = new Gt6();
                C10293Gtx.A00(str);
                String strTrim = str.trim();
                C10293Gtx.A01(strTrim);
                gt6.A00 = strTrim;
                gt6.A01 = str2;
                gt6.A02 = gt7;
                this.A01 = i4 + 1;
                return gt6;
            default:
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$t) {
            case 0:
                throw C8j3.A17();
            case 1:
                throw C8j3.A17();
            case 2:
                throw C8j3.A17();
            case 3:
                throw C8j3.A17();
            case 4:
                Gt7 gt7 = (Gt7) this.A02;
                int i = this.A01 - 1;
                this.A01 = i;
                Gt7.A03(gt7, i);
                this.A00--;
                return;
            default:
                return;
        }
    }

    public I11(int i) {
        this.$t = i;
    }

    public I11(final AbstractC9320GEb this$0) {
        this.$t = 1;
        this.A02 = this$0;
        this.A01 = 0;
        this.A00 = this$0.A02();
    }

    public I11(AbstractC9309GDl abstractC9309GDl) {
        this.$t = 0;
        this.A02 = abstractC9309GDl;
        this.A01 = 0;
        this.A00 = abstractC9309GDl.A01();
    }

    public I11(Gt7 gt7) {
        this.$t = 4;
        this.A02 = gt7;
        this.A00 = gt7.A00;
        this.A01 = 0;
    }

    public I11(final AbstractC9321GEc this$0) {
        this.$t = 3;
        this.A02 = this$0;
        this.A01 = 0;
        this.A00 = this$0.A02();
    }
}
