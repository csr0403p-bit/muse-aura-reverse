package X;

import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* renamed from: X.Gns, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10020Gns {
    public int A00;
    public int A01;
    public int A02;

    public final AbstractC10020Gns A01() {
        return this instanceof C10038GoI ? ((C10038GoI) this).A03 : this instanceof C10018Gnq ? ((C10018Gnq) this).A05 : this instanceof C10019Gnr ? ((C10019Gnr) this).A06 : ((C10001GnX) this).A05;
    }

    public final String A02() {
        return this instanceof C10038GoI ? ((C10038GoI) this).A01 : this instanceof C10018Gnq ? ((C10018Gnq) this).A02 : this instanceof C10019Gnr ? ((C10019Gnr) this).A05 : ((C10001GnX) this).A01;
    }

    public final String A03() {
        int i = this.A02;
        return i != 0 ? i != 1 ? i != 2 ? HatchOpenGraphRepository.UNKNOWN_HOST : "Object" : "Array" : "root";
    }

    public String toString() {
        char c;
        StringBuilder sbA0p = BV4.A0p(64);
        int i = this.A02;
        if (i != 0) {
            if (i != 1) {
                sbA0p.append('{');
                String strA02 = A02();
                char c2 = '?';
                if (strA02 != null) {
                    c2 = '\"';
                    sbA0p.append('\"');
                    int[] iArr = AbstractC10006Gne.A07;
                    int length = strA02.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = strA02.charAt(i2);
                        if (cCharAt < '\u0080' && iArr[cCharAt] != 0) {
                            sbA0p.append('\\');
                            int i3 = iArr[cCharAt];
                            if (i3 < 0) {
                                sbA0p.append('u');
                                sbA0p.append('0');
                                sbA0p.append('0');
                                char[] cArr = AbstractC10006Gne.A00;
                                sbA0p.append(cArr[cCharAt >> 4]);
                                cCharAt = cArr[cCharAt & 15];
                            } else {
                                cCharAt = (char) i3;
                            }
                        }
                        sbA0p.append(cCharAt);
                    }
                }
                sbA0p.append(c2);
                c = '}';
            } else {
                sbA0p.append('[');
                int i4 = this.A00;
                if (i4 < 0) {
                    i4 = 0;
                }
                sbA0p.append(i4);
                c = ']';
            }
            sbA0p.append(c);
        } else {
            sbA0p.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        }
        return sbA0p.toString();
    }
}
