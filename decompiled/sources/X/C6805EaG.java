package X;

import com.airbnb.lottie.parser.moshi.JsonDataException;
import com.airbnb.lottie.parser.moshi.JsonEncodingException;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.EOFException;

/* renamed from: X.EaG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6805EaG extends AbstractC6806EaH {
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final C6818EaW A04;
    public final InterfaceC6831Eaj A05;
    public static final C6788EZx A0A = C6788EZx.A02("'\\");
    public static final C6788EZx A08 = C6788EZx.A02("\"\\");
    public static final C6788EZx A06 = C6788EZx.A02("{}[]:, \n\t\r\f/\\;#=");
    public static final C6788EZx A09 = C6788EZx.A02("\n\r");
    public static final C6788EZx A07 = C6788EZx.A02("*/");

    private int A02(boolean z) throws JsonEncodingException, EOFException {
        int i = 0;
        while (true) {
            InterfaceC6831Eaj interfaceC6831Eaj = this.A05;
            int i2 = i + 1;
            if (!interfaceC6831Eaj.Ab8(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            C6818EaW c6818EaW = this.A04;
            byte bA02 = c6818EaW.A02(i);
            if (bA02 != 10 && bA02 != 32 && bA02 != 13 && bA02 != 9) {
                c6818EaW.Afk(i);
                if (bA02 != 47 ? bA02 != 35 : !interfaceC6831Eaj.Ab8(2L)) {
                    return bA02;
                }
                A08("Use JsonReader.setLenient(true) to accept malformed JSON");
                throw F60.createAndThrow();
            }
            i = i2;
        }
    }

    private String A03(C6788EZx c6788EZx) throws JsonEncodingException, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jANX = this.A05.ANX(c6788EZx);
            if (jANX == -1) {
                A08("Unterminated string");
                throw F60.createAndThrow();
            }
            C6818EaW c6818EaW = this.A04;
            if (c6818EaW.A02(jANX) != 92) {
                String strA00 = C6818EaW.A00(DCl.A05, c6818EaW, jANX);
                if (sb == null) {
                    c6818EaW.readByte();
                    return strA00;
                }
                sb.append(strA00);
                c6818EaW.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(C6818EaW.A00(DCl.A05, c6818EaW, jANX));
            c6818EaW.readByte();
            sb.append(A00());
        }
    }

    @Override // X.AbstractC6806EaH
    public final void A0K() throws JsonEncodingException, EOFException {
        int i = 0;
        do {
            int iA01 = this.A00;
            if (iA01 == 0) {
                iA01 = A01();
            }
            if (iA01 == 3) {
                A07(1);
            } else if (iA01 == 1) {
                A07(3);
            } else {
                if (iA01 == 4) {
                    i--;
                    if (i < 0) {
                        Integer numA0C = A0C();
                        throw new JsonDataException(FGI.A0d("Expected a value but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
                    }
                } else if (iA01 == 2) {
                    i--;
                    if (i < 0) {
                        Integer numA0C2 = A0C();
                        throw new JsonDataException(FGI.A0d("Expected a value but was ", numA0C2 != null ? EY4.A00(numA0C2) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
                    }
                } else {
                    if (iA01 == 9 || iA01 == 13) {
                        A04(A08);
                    } else if (iA01 == 17) {
                        this.A04.Afk(this.A01);
                    } else if (iA01 == 18) {
                        Integer numA0C3 = A0C();
                        throw new JsonDataException(FGI.A0d("Expected a value but was ", numA0C3 != null ? EY4.A00(numA0C3) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
                    }
                    this.A00 = 0;
                }
                super.A00--;
                this.A00 = 0;
            }
            i++;
            this.A00 = 0;
        } while (i != 0);
        int[] iArr = super.A01;
        int i2 = super.A00 - 1;
        iArr[i2] = iArr[i2] + 1;
        super.A03[i2] = HatchCcvLoggingKt.NO_POSTAL_FIELD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.A00 = 0;
        super.A02[0] = 8;
        super.A00 = 1;
        C6818EaW c6818EaW = this.A04;
        c6818EaW.Afk(c6818EaW.A00);
        this.A05.close();
    }

    private char A00() throws JsonEncodingException, EOFException {
        String string;
        StringBuilder sb;
        int i;
        InterfaceC6831Eaj interfaceC6831Eaj = this.A05;
        if (interfaceC6831Eaj.Ab8(1L)) {
            C6818EaW c6818EaW = this.A04;
            byte b = c6818EaW.readByte();
            char c = '\n';
            if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return '\b';
            }
            if (b == 102) {
                return '\f';
            }
            if (b != 110) {
                if (b == 114) {
                    return '\r';
                }
                if (b == 116) {
                    return '\t';
                }
                if (b != 117) {
                    sb = new StringBuilder("Invalid escape sequence: \\");
                    sb.append((char) b);
                } else {
                    if (!interfaceC6831Eaj.Ab8(4L)) {
                        throw new EOFException(FGI.A0M("Unterminated escape sequence at path ", A06()));
                    }
                    int i2 = 0;
                    c = 0;
                    do {
                        byte bA02 = c6818EaW.A02(i2);
                        char c2 = (char) (c << 4);
                        if (bA02 >= 48) {
                            if (bA02 <= 57) {
                                i = bA02 - 48;
                            } else if (bA02 >= 97) {
                                if (bA02 <= 102) {
                                    i = bA02 - 87;
                                }
                            } else if (bA02 >= 65 && bA02 <= 70) {
                                i = bA02 - 55;
                            }
                            c = (char) (c2 + i);
                            i2++;
                        }
                        sb = new StringBuilder("\\u");
                        sb.append(C6818EaW.A00(DCl.A05, c6818EaW, 4L));
                    } while (i2 < 4);
                    c6818EaW.Afk(4L);
                }
                string = sb.toString();
            }
            return c;
        }
        string = "Unterminated escape sequence";
        A08(string);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0187, code lost:
    
        if (A05(r11) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0189, code lost:
    
        if (r12 != 2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018b, code lost:
    
        if (r19 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0191, code lost:
    
        if (r0 != Long.MIN_VALUE) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0193, code lost:
    
        if (r18 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0197, code lost:
    
        if (r0 != 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0199, code lost:
    
        if (r18 != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x019b, code lost:
    
        r0 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x019c, code lost:
    
        r20.A02 = r0;
        r4.Afk(r13);
        r11 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01a5, code lost:
    
        if (r18 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01a8, code lost:
    
        if (r12 == 4) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ac, code lost:
    
        if (r12 != 7) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ae, code lost:
    
        r20.A01 = r13;
        r11 = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01() throws com.airbnb.lottie.parser.moshi.JsonEncodingException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6805EaG.A01():int");
    }

    private void A04(C6788EZx c6788EZx) throws JsonEncodingException, EOFException {
        while (true) {
            long jANX = this.A05.ANX(c6788EZx);
            if (jANX == -1) {
                A08("Unterminated string");
                throw F60.createAndThrow();
            }
            C6818EaW c6818EaW = this.A04;
            byte bA02 = c6818EaW.A02(jANX);
            long j = jANX + 1;
            if (bA02 != 92) {
                c6818EaW.Afk(j);
                return;
            } else {
                c6818EaW.Afk(j);
                A00();
            }
        }
    }

    private boolean A05(int i) throws JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A08("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw F60.createAndThrow();
    }

    @Override // X.AbstractC6806EaH
    public final double A09() throws JsonEncodingException, NumberFormatException, EOFException {
        String strA03;
        double d;
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 == 16) {
            this.A00 = 0;
            int[] iArr = super.A01;
            int i = super.A00 - 1;
            iArr[i] = iArr[i] + 1;
            return this.A02;
        }
        try {
            if (iA01 == 17) {
                strA03 = C6818EaW.A00(DCl.A05, this.A04, this.A01);
            } else {
                if (iA01 != 9) {
                    if (iA01 != 11) {
                        Integer numA0C = A0C();
                        throw new JsonDataException(FGI.A0d("Expected a double but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
                    }
                    this.A00 = 11;
                    d = Double.parseDouble(this.A03);
                    if (!Double.isNaN(d) || Double.isInfinite(d)) {
                        StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                        sb.append(d);
                        sb.append(" at path ");
                        sb.append(A06());
                        throw new JsonEncodingException(sb.toString());
                    }
                    this.A03 = null;
                    this.A00 = 0;
                    int[] iArr2 = super.A01;
                    int i2 = super.A00 - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    return d;
                }
                strA03 = A03(A08);
            }
            d = Double.parseDouble(this.A03);
            if (Double.isNaN(d)) {
            }
            StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(d);
            sb2.append(" at path ");
            sb2.append(A06());
            throw new JsonEncodingException(sb2.toString());
        } catch (NumberFormatException unused) {
            throw new JsonDataException(FGI.A0d("Expected a double but was ", this.A03, " at path ", A06()));
        }
        this.A03 = strA03;
        this.A00 = 11;
    }

    @Override // X.AbstractC6806EaH
    public final int A0A() throws JsonEncodingException, NumberFormatException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 == 16) {
            long j = this.A02;
            int i = (int) j;
            if (j != i) {
                throw new JsonDataException(FGI.A0L("Expected an int but was ", j, " at path ", A06()));
            }
            this.A00 = 0;
            int[] iArr = super.A01;
            int i2 = super.A00 - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iA01 == 17) {
            this.A03 = C6818EaW.A00(DCl.A05, this.A04, this.A01);
        } else if (iA01 == 9) {
            String strA03 = A03(A08);
            this.A03 = strA03;
            try {
                int i3 = Integer.parseInt(strA03);
                this.A00 = 0;
                int[] iArr2 = super.A01;
                int i4 = super.A00 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iA01 != 11) {
            Integer numA0C = A0C();
            throw new JsonDataException(FGI.A0d("Expected an int but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
        }
        this.A00 = 11;
        try {
            String str = this.A03;
            double d = Double.parseDouble(str);
            int i5 = (int) d;
            if (i5 != d) {
                throw new JsonDataException(FGI.A0d("Expected an int but was ", str, " at path ", A06()));
            }
            this.A03 = null;
            this.A00 = 0;
            int[] iArr3 = super.A01;
            int i6 = super.A00 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException(FGI.A0d("Expected an int but was ", this.A03, " at path ", A06()));
        }
    }

    @Override // X.AbstractC6806EaH
    public final int A0B(C6823Eab c6823Eab) throws JsonEncodingException, EOFException {
        int i;
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 < 12 || iA01 > 15) {
            return -1;
        }
        if (iA01 == 15) {
            String str = this.A03;
            String[] strArr = c6823Eab.A01;
            int length = strArr.length;
            i = 0;
            while (i < length) {
                if (str.equals(strArr[i])) {
                    this.A00 = 0;
                    super.A03[super.A00 - 1] = str;
                } else {
                    i++;
                }
            }
            return -1;
        }
        int iAcQ = this.A05.AcQ(c6823Eab.A00);
        if (iAcQ != -1) {
            this.A00 = 0;
            super.A03[super.A00 - 1] = c6823Eab.A01[iAcQ];
            return iAcQ;
        }
        String str2 = super.A03[super.A00 - 1];
        String strA0D = A0D();
        String[] strArr2 = c6823Eab.A01;
        int length2 = strArr2.length;
        i = 0;
        while (true) {
            if (i >= length2) {
                i = -1;
                break;
            }
            if (strA0D.equals(strArr2[i])) {
                this.A00 = 0;
                super.A03[super.A00 - 1] = strA0D;
                break;
            }
            i++;
        }
        if (i == -1) {
            this.A00 = 15;
            this.A03 = strA0D;
            super.A03[super.A00 - 1] = str2;
            return i;
        }
        return i;
    }

    @Override // X.AbstractC6806EaH
    public final Integer A0C() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        switch (iA01) {
            case 1:
                return C79.A0C;
            case 2:
                return C79.A0K;
            case 3:
                return C79.A00;
            case 4:
                return C79.A01;
            case 5:
            case 6:
                return C79.A0Y;
            case 7:
                return C79.A0Z;
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            default:
                return C79.A0W;
            case 9:
            case 11:
                return C79.A0T;
            case 13:
            case 15:
                return C79.A0P;
            case 18:
                return C79.A0c;
        }
    }

    @Override // X.AbstractC6806EaH
    public final String A0D() throws JsonEncodingException, EOFException {
        String strA03;
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 == 13) {
            strA03 = A03(A08);
        } else {
            if (iA01 != 15) {
                Integer numA0C = A0C();
                throw new JsonDataException(FGI.A0d("Expected a name but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
            }
            strA03 = this.A03;
        }
        this.A00 = 0;
        super.A03[super.A00 - 1] = strA03;
        return strA03;
    }

    @Override // X.AbstractC6806EaH
    public final String A0E() throws JsonEncodingException, EOFException {
        String strA00;
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 == 9) {
            strA00 = A03(A08);
        } else if (iA01 == 11) {
            strA00 = this.A03;
            this.A03 = null;
        } else if (iA01 == 16) {
            strA00 = Long.toString(this.A02);
        } else {
            if (iA01 != 17) {
                Integer numA0C = A0C();
                throw new JsonDataException(FGI.A0d("Expected a string but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
            }
            strA00 = C6818EaW.A00(DCl.A05, this.A04, this.A01);
        }
        this.A00 = 0;
        int[] iArr = super.A01;
        int i = super.A00 - 1;
        iArr[i] = iArr[i] + 1;
        return strA00;
    }

    @Override // X.AbstractC6806EaH
    public final void A0F() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 != 3) {
            Integer numA0C = A0C();
            throw new JsonDataException(FGI.A0d("Expected BEGIN_ARRAY but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
        }
        A07(1);
        super.A01[super.A00 - 1] = 0;
        this.A00 = 0;
    }

    @Override // X.AbstractC6806EaH
    public final void A0G() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 != 1) {
            Integer numA0C = A0C();
            throw new JsonDataException(FGI.A0d("Expected BEGIN_OBJECT but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
        }
        A07(3);
        this.A00 = 0;
    }

    @Override // X.AbstractC6806EaH
    public final void A0H() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 != 4) {
            Integer numA0C = A0C();
            throw new JsonDataException(FGI.A0d("Expected END_ARRAY but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
        }
        int i = super.A00 - 1;
        super.A00 = i;
        int[] iArr = super.A01;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.A00 = 0;
    }

    @Override // X.AbstractC6806EaH
    public final void A0I() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 != 2) {
            Integer numA0C = A0C();
            throw new JsonDataException(FGI.A0d("Expected END_OBJECT but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
        }
        int i = super.A00 - 1;
        super.A00 = i;
        super.A03[i] = null;
        int[] iArr = super.A01;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.A00 = 0;
    }

    @Override // X.AbstractC6806EaH
    public final void A0J() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 == 13) {
            A04(A08);
        } else if (iA01 != 15) {
            Integer numA0C = A0C();
            throw new JsonDataException(FGI.A0d("Expected a name but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
        }
        this.A00 = 0;
        super.A03[super.A00 - 1] = HatchCcvLoggingKt.NO_POSTAL_FIELD;
    }

    @Override // X.AbstractC6806EaH
    public final boolean A0L() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        return (iA01 == 2 || iA01 == 4 || iA01 == 18) ? false : true;
    }

    @Override // X.AbstractC6806EaH
    public final boolean A0M() throws JsonEncodingException, EOFException {
        int iA01 = this.A00;
        if (iA01 == 0) {
            iA01 = A01();
        }
        if (iA01 == 5) {
            this.A00 = 0;
            int[] iArr = super.A01;
            int i = super.A00 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iA01 != 6) {
            Integer numA0C = A0C();
            throw new JsonDataException(FGI.A0d("Expected a boolean but was ", numA0C != null ? EY4.A00(numA0C) : HatchCcvLoggingKt.NO_POSTAL_FIELD, " at path ", A06()));
        }
        this.A00 = 0;
        int[] iArr2 = super.A01;
        int i2 = super.A00 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("JsonReader(");
        sbA0x.append(this.A05);
        return BV7.A10(sbA0x);
    }

    public C6805EaG(InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A05 = interfaceC6831Eaj;
        this.A04 = ((C6819EaX) interfaceC6831Eaj).A01;
        A07(6);
    }
}
