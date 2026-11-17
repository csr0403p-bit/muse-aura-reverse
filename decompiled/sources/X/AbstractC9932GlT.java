package X;

import com.facebook.aura.markdown.parser.custom.extensions.IndexedInlineEntityExtension;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;

/* renamed from: X.GlT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9932GlT extends AbstractC9919GlE {
    public static final int A06 = (EnumC9998GnS.WRITE_NUMBERS_AS_STRINGS._mask | EnumC9998GnS.ESCAPE_NON_ASCII._mask) | EnumC9998GnS.STRICT_DUPLICATE_DETECTION._mask;
    public int A00;
    public AbstractC9794GhC A01;
    public C10018Gnq A02;
    public boolean A03;
    public boolean A04;
    public final C9984Gn6 A05;

    @Override // X.AbstractC9919GlE
    public void A0b(EnumC9998GnS enumC9998GnS) {
        int i = enumC9998GnS._mask;
        this.A00 &= i ^ (-1);
        if ((i & A06) != 0) {
            if (enumC9998GnS == EnumC9998GnS.WRITE_NUMBERS_AS_STRINGS) {
                this.A03 = false;
                return;
            }
            if (enumC9998GnS == EnumC9998GnS.ESCAPE_NON_ASCII) {
                if (!(this instanceof AbstractC9979Gmv)) {
                    throw F60.createAndThrow();
                }
                ((AbstractC9979Gmv) this).A00 = 0;
            } else if (enumC9998GnS == EnumC9998GnS.STRICT_DUPLICATE_DETECTION) {
                C10018Gnq c10018Gnq = this.A02;
                c10018Gnq.A00 = null;
                this.A02 = c10018Gnq;
            }
        }
    }

    public final String A10(BigDecimal bigDecimal) {
        if ((this.A00 & EnumC9998GnS.WRITE_BIGDECIMAL_AS_PLAIN._mask) == 0) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        Integer numValueOf = Integer.valueOf(iScale);
        Integer numValueOf2 = Integer.valueOf(IndexedInlineEntityExtension.MAX_SENTINEL_INDEX);
        throw new JsonGenerationException(this, String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", numValueOf, numValueOf2, numValueOf2));
    }

    public void A11(int i, int i2) {
        C10086GpA c10086GpA;
        if ((A06 & i2) != 0) {
            this.A03 = AbstractC7609F5w.A1U(i, EnumC9998GnS.WRITE_NUMBERS_AS_STRINGS._mask);
            int i3 = EnumC9998GnS.ESCAPE_NON_ASCII._mask;
            if ((i2 & i3) != 0) {
                int i4 = (i & i3) != 0 ? 127 : 0;
                if (!(this instanceof AbstractC9979Gmv)) {
                    throw F60.createAndThrow();
                }
                ((AbstractC9979Gmv) this).A00 = i4;
            }
            int i5 = EnumC9998GnS.STRICT_DUPLICATE_DETECTION._mask;
            if ((i2 & i5) != 0) {
                boolean zA1L = AnonymousClass002.A1L(i & i5);
                C10018Gnq c10018Gnq = this.A02;
                if (!zA1L) {
                    c10086GpA = null;
                } else if (c10018Gnq.A00 != null) {
                    return;
                } else {
                    c10086GpA = new C10086GpA(this);
                }
                c10018Gnq.A00 = c10086GpA;
                this.A02 = c10018Gnq;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A12(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.Gn0
            if (r0 == 0) goto L25
            X.Gn0 r2 = (X.Gn0) r2
            X.Gnq r0 = r2.A02
            int r1 = r0.A04()
            X.GoT r0 = r2.A00
            if (r0 != 0) goto L70
            r0 = 1
            if (r1 == r0) goto L56
            r0 = 2
            if (r1 == r0) goto L59
            r0 = 3
            if (r1 != r0) goto L4b
            X.Gqq r0 = r2.A01
            if (r0 == 0) goto L24
            X.Go0 r0 = (X.C10026Go0) r0
            java.lang.String r0 = r0._value
            r2.A0q(r0)
        L24:
            return
        L25:
            X.Gmz r2 = (X.C9983Gmz) r2
            X.Gnq r0 = r2.A02
            int r1 = r0.A04()
            X.GoT r0 = r2.A00
            if (r0 != 0) goto L70
            r0 = 1
            if (r1 == r0) goto L67
            r0 = 2
            if (r1 == r0) goto L64
            r0 = 3
            if (r1 != r0) goto L4b
            X.Gqq r0 = r2.A01
            if (r0 == 0) goto L24
            X.Go0 r0 = (X.C10026Go0) r0
            byte[] r1 = X.AbstractC9919GlE.A0I(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L24
            X.C9983Gmz.A0N(r2, r1)
            return
        L4b:
            r0 = 5
            if (r1 != r0) goto L24
            r2.A14(r3)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L56:
            r1 = 44
            goto L5b
        L59:
            r1 = 58
        L5b:
            int r0 = r2.A03
            X.AbstractC9919GlE.A0G(r2, r0)
            X.AbstractC9919GlE.A0F(r2, r1)
            return
        L64:
            r0 = 58
            goto L69
        L67:
            r0 = 44
        L69:
            X.AbstractC9919GlE.A0D(r2)
            X.AbstractC9919GlE.A0E(r2, r0)
            return
        L70:
            r2.A15(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9932GlT.A12(java.lang.String):void");
    }

    public final void A13(byte[] bArr, int i, int i2) {
        String str;
        if (bArr == null) {
            str = "Invalid `byte[]` argument: `null`";
        } else {
            int length = bArr.length;
            int i3 = i + i2;
            if (((length - i3) | i | i2 | i3) >= 0) {
                return;
            } else {
                str = String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", BV8.A1b(Integer.valueOf(i), i2, length));
            }
        }
        throw new JsonGenerationException(this, str);
    }

    @Override // X.AbstractC9919GlE, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A04) {
            return;
        }
        C9984Gn6 c9984Gn6 = this.A05;
        if (c9984Gn6 != null) {
            c9984Gn6.close();
        }
        this.A04 = true;
    }

    @Override // X.AbstractC9919GlE, java.io.Flushable
    public final void flush() throws IOException {
        if (this instanceof Gn0) {
            Gn0 gn0 = (Gn0) this;
            Gn0.A03(gn0);
            Writer writer = gn0.A06;
            if (writer == null || !gn0.A0z(EnumC9998GnS.FLUSH_PASSED_TO_STREAM)) {
                return;
            }
            writer.flush();
            return;
        }
        C9983Gmz c9983Gmz = (C9983Gmz) this;
        C9983Gmz.A05(c9983Gmz);
        OutputStream outputStream = c9983Gmz.A07;
        if (outputStream == null || !c9983Gmz.A0z(EnumC9998GnS.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        outputStream.flush();
    }

    public AbstractC9932GlT(AbstractC9794GhC abstractC9794GhC, C9984Gn6 c9984Gn6, int i) {
        this.A00 = i;
        this.A01 = abstractC9794GhC;
        this.A05 = c9984Gn6;
        this.A02 = new C10018Gnq((EnumC9998GnS.STRICT_DUPLICATE_DETECTION._mask & i) != 0 ? new C10086GpA(this) : null, null, 0);
        this.A03 = AbstractC7609F5w.A1U(i, EnumC9998GnS.WRITE_NUMBERS_AS_STRINGS._mask);
    }
}
