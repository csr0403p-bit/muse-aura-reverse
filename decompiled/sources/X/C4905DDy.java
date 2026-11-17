package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.DDy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4905DDy extends DE1 {
    public CFS A00;
    public DDj A01;
    public Integer A02;
    public final String A03;

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
    }

    @Override // X.DE1
    public final boolean A04() {
        return (super.A01 != -1 || super.A03 == null) ? super.A04() : AnonymousClass002.A1Z(this.A02, C79.A0C);
    }

    @Override // X.C1J
    public final void close() throws IOException {
        CFS cfs = this.A00;
        if (cfs != null) {
            super.A03 = cfs.A00();
            this.A00 = null;
            this.A02.getClass();
            Integer num = this.A02;
            if (num == C79.A00 || num == C79.A01) {
                this.A02 = C79.A0K;
            }
        }
        try {
            CXK cxk = super.A02;
            if (cxk != null) {
                cxk.close();
            }
            super.A02 = null;
            this.A01 = null;
        } catch (IOException e) {
            DDj dDj = this.A01;
            if (dDj != null) {
                dDj.AWi(e);
            }
            throw e;
        }
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        String strA00;
        String strA002 = AbstractC7606F5t.A00(32);
        C7384Etj.A0Y(bArr, 0);
        int i3 = super.A01;
        if (i3 != -1) {
            int i4 = i3 - super.A00;
            if (i4 == 0) {
                return -1;
            }
            if (i2 > i4) {
                i2 = i4;
            }
        }
        if (i2 > 0) {
            try {
                CXK cxk = super.A02;
                if (cxk != null) {
                    i2 = cxk.read(bArr, i, i2);
                    if (i2 > 0) {
                        byte[] bArr2 = super.A03;
                        if (bArr2 != null) {
                            System.arraycopy(bArr, i, bArr2, super.A00, i2);
                        } else if (this.A00 != null) {
                            Integer num = this.A02;
                            Integer num2 = C79.A01;
                            if (num != num2) {
                                if (num != C79.A00) {
                                    if (num != null) {
                                        switch (num.intValue()) {
                                            case 1:
                                                strA00 = "Partial";
                                                break;
                                            case 2:
                                                strA00 = AbstractC7606F5t.A00(10);
                                                break;
                                            case 3:
                                                strA00 = "Canceled";
                                                break;
                                            default:
                                                strA00 = "Started";
                                                break;
                                        }
                                    } else {
                                        strA00 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                                    }
                                    C60O.A1P(strA002, strA00, "NonPrefetchDataSource");
                                }
                                this.A02 = num2;
                            }
                            CFS cfs = this.A00;
                            if (cfs != null) {
                                cfs.write(bArr, i, i2);
                            }
                        }
                        super.A00 += i2;
                        return i2;
                    }
                } else {
                    i2 = -1;
                }
                if (super.A01 == -1 && i2 == -1) {
                    this.A02 = C79.A0C;
                    return i2;
                }
            } catch (IOException e) {
                DDj dDj = this.A01;
                if (dDj != null) {
                    dDj.AWi(e);
                }
                throw e;
            }
        }
        return i2;
    }

    public C4905DDy(DDU ddu, DDj dDj, CXO cxo, C3159C0h c3159C0h, String str, int i, int i2, int i3) {
        super(i3);
        String str2 = c3159C0h.A04;
        C7384Etj.A0U(str2);
        this.A03 = str2;
        super.A02 = ddu.createInstance(str, dDj, cxo, i, i2, c3159C0h);
        this.A01 = dDj;
        super.A03 = null;
        this.A00 = null;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        this.A01 = (DDj) C7384Etj.A08(cxb);
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws IOException {
        DDj dDj;
        Map<String, List<String>> responseHeaders;
        String strA0n;
        C7384Etj.A0Y(c1o, 0);
        DDj dDj2 = this.A01;
        if (dDj2 != null) {
            dDj2.AWl(c1o, DEK.NOT_CACHED);
        }
        try {
            CXK cxk = super.A02;
            if (cxk == null) {
                throw BV4.A0K("No http data source.");
            }
            long jOpen = cxk.open(c1o);
            int i = (int) jOpen;
            super.A01 = i;
            super.A00 = 0;
            if (i == -1) {
                this.A00 = new CFS();
                this.A02 = C79.A00;
            } else if (i <= this.A04) {
                super.A03 = new byte[i];
            }
            if (this.A01 != null) {
                CXK cxk2 = super.A02;
                if (cxk2 != null && (responseHeaders = cxk2.getResponseHeaders()) != null) {
                    String string = c1o.A06.toString();
                    String str = this.A03;
                    String str2 = DEG.A0A;
                    List listA0z = BV4.A0z("x-fb-video-livetrace-parentsource", responseHeaders);
                    int i2 = 0;
                    String value = null;
                    if (listA0z != null) {
                        strA0n = C60Q.A0n(listA0z, 0);
                        DEG.A08.put(string, strA0n);
                    } else {
                        strA0n = null;
                    }
                    List listA0z2 = BV4.A0z("x-fb-video-livetrace-ids", responseHeaders);
                    if (listA0z2 != null) {
                        String strA0n2 = C60Q.A0n(listA0z2, 0);
                        ArrayList arrayListA0h = C3cG.A0h();
                        for (String str3 : strA0n2.split(",[\\s]*")) {
                            try {
                                String[] strArrSplit = str3.split(":");
                                arrayListA0h.add(new DED(Long.parseLong(strArrSplit[0]), Long.parseLong(strArrSplit[1]) * 1000));
                            } catch (NumberFormatException e) {
                                CNC.A06("LiveTrace", FGI.A0M("Malformed live trace id/pts pair: ", str3), e);
                            }
                        }
                        DED[] dedArr = (DED[]) arrayListA0h.toArray(new DED[arrayListA0h.size()]);
                        AbstractMap.SimpleEntry<String, String>[] simpleEntryArr = DEG.A0B;
                        while (true) {
                            AbstractMap.SimpleEntry<String, String> simpleEntry = simpleEntryArr[i2];
                            if (responseHeaders.get(simpleEntry.getKey()) != null) {
                                value = simpleEntry.getValue();
                                break;
                            }
                            i2++;
                            if (i2 >= 3) {
                                break;
                            }
                        }
                        DEG deg = new DEG(string, str, strA0n, value, "SUCCESS", null, dedArr, System.currentTimeMillis());
                        DDj dDj3 = this.A01;
                        if (dDj3 != null) {
                            dDj3.AWj("live_trace", deg);
                        }
                    }
                    A03(this.A01);
                }
                if (c1o.A07 != null) {
                    Map<String, String> map = C4890DDe.A00(c1o).A0V;
                    if (map.containsKey("x-fb-product-log") && (dDj = this.A01) != null) {
                        String strA0p = C60O.A0p("x-fb-product-log", map);
                        if (strA0p == null) {
                            strA0p = "";
                        }
                        dDj.AdN(strA0p);
                    }
                }
            }
            return jOpen;
        } catch (IOException e2) {
            DDj dDj4 = this.A01;
            if (dDj4 != null) {
                dDj4.AWi(e2);
            }
            throw e2;
        }
    }
}
