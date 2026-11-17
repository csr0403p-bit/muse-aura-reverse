package androidx.media3.extractor;

import X.BV5;
import X.C5470Dj5;
import X.C6154Dwx;
import X.C6349E2a;
import X.C6352E2d;
import X.C6353E2f;
import X.C6367E2u;
import X.C6386E3n;
import X.C6387E3p;
import X.E0Y;
import X.E20;
import X.E21;
import X.E24;
import X.E2B;
import X.E2S;
import X.E2e;
import X.E36;
import X.E37;
import X.E38;
import X.E3J;
import X.E40;
import X.E41;
import X.E42;
import X.E48;
import X.E49;
import X.InterfaceC5458Dit;
import X.InterfaceC5819Dq4;
import X.InterfaceC5885DrL;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes5.dex */
public final class DefaultExtractorsFactory implements InterfaceC5819Dq4 {
    public int A00;
    public InterfaceC5885DrL A01 = new E0Y();
    public boolean A02 = true;
    public ImmutableList<C6154Dwx> A03;
    public static final int[] A06 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final E24 A04 = new E24(new E2B() { // from class: X.E25
        @Override // X.E2B
        public final Constructor AE0() {
            if (Boolean.TRUE.equals(BV5.A0d("isAvailable", Class.forName("androidx.media3.decoder.flac.FlacLibrary")))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC5458Dit.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    public static final E24 A05 = new E24(new E2B() { // from class: X.E27
        @Override // X.E2B
        public final Constructor AE0() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC5458Dit.class).getConstructor(null);
        }
    });

    private void A00(int i, List<InterfaceC5458Dit> list) {
        InterfaceC5458Dit e41;
        switch (i) {
            case 0:
                e41 = new E2e();
                break;
            case 1:
                e41 = new C6353E2f();
                break;
            case 2:
                e41 = new C6352E2d(0);
                break;
            case 3:
                e41 = new E20(0);
                break;
            case 4:
                e41 = A04.A00(BV5.A1Y(0));
                if (e41 == null) {
                    e41 = new E38(0);
                    break;
                }
                break;
            case 5:
                e41 = new C6349E2a();
                break;
            case 6:
                e41 = new MatroskaExtractor(this.A01, this.A02 ? 0 : 2);
                break;
            case 7:
                e41 = new Mp3Extractor(0);
                break;
            case 8:
                InterfaceC5885DrL interfaceC5885DrL = this.A01;
                int i2 = this.A00;
                int i3 = (i2 & 1) != 0 ? 64 : 0;
                if ((i2 & 2) != 0) {
                    i3 |= 128;
                }
                int i4 = i3 | (this.A02 ? 0 : 32);
                C6154Dwx c6154Dwx = C6367E2u.A0c;
                list.add(new C6367E2u(null, interfaceC5885DrL, ImmutableList.of(), i4));
                InterfaceC5885DrL interfaceC5885DrL2 = this.A01;
                int i5 = this.A00;
                int i6 = (i5 & 1) != 0 ? 32 : 0;
                if ((i5 & 2) != 0) {
                    i6 |= 128;
                }
                e41 = new E2S(interfaceC5885DrL2, i6 | (this.A02 ? 0 : 16));
                break;
            case 9:
                e41 = new OggExtractor();
                break;
            case 10:
                e41 = new E37();
                break;
            case 11:
                if (this.A03 == null) {
                    this.A03 = ImmutableList.of();
                }
                list.add(new E36(new E3J(0L), this.A01, new E21(this.A03), !this.A02 ? 1 : 0));
                return;
            case 12:
                e41 = new C6387E3p();
                break;
            case 13:
            default:
                return;
            case 14:
                e41 = new C5470Dj5(0);
                break;
            case 15:
                e41 = A05.A00(new Object[0]);
                if (e41 == null) {
                    return;
                }
                break;
            case 16:
                e41 = new C6386E3n(this.A01, !this.A02 ? 1 : 0);
                break;
            case 17:
                e41 = new E48();
                break;
            case 18:
                e41 = new E40();
                break;
            case 19:
                e41 = new E49();
                break;
            case 20:
                e41 = new E41();
                break;
            case 21:
                e41 = new E42();
                break;
        }
        list.add(e41);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ac A[PHI: r5
  0x02ac: PHI (r5v1 int) = 
  (r5v0 int)
  (r5v4 int)
  (r5v5 int)
  (r5v6 int)
  (r5v7 int)
  (r5v8 int)
  (r5v9 int)
  (r5v10 int)
  (r5v11 int)
  (r5v12 int)
  (r5v13 int)
  (r5v14 int)
  (r5v15 int)
  (r5v16 int)
  (r5v0 int)
  (r5v17 int)
  (r5v18 int)
  (r5v19 int)
  (r5v20 int)
  (r5v21 int)
  (r5v24 int)
  (r5v25 int)
 binds: [B:55:0x0126, B:157:0x02a9, B:156:0x02a7, B:155:0x02a4, B:154:0x02a2, B:153:0x029f, B:152:0x029c, B:151:0x0299, B:150:0x0296, B:149:0x0293, B:148:0x0290, B:147:0x028d, B:146:0x028a, B:145:0x0287, B:143:0x0282, B:144:0x0284, B:133:0x0259, B:130:0x024e, B:127:0x0243, B:88:0x01ab, B:158:0x02ab, B:62:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ae A[PHI: r5
  0x02ae: PHI (r5v3 int) = (r5v1 int), (r5v22 int), (r5v23 int) binds: [B:159:0x02ac, B:75:0x0172, B:72:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b0 A[Catch: all -> 0x02cc, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0017, B:9:0x001f, B:10:0x0027, B:42:0x00ee, B:53:0x011e, B:54:0x0121, B:56:0x0128, B:58:0x0130, B:60:0x0138, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:70:0x015d, B:161:0x02b0, B:163:0x02b5, B:166:0x02bb, B:167:0x02be, B:169:0x02c2, B:73:0x0169, B:76:0x0175, B:78:0x017d, B:80:0x0185, B:82:0x018d, B:84:0x019b, B:86:0x01a3, B:89:0x01ae, B:91:0x01b6, B:93:0x01be, B:95:0x01c5, B:97:0x01cd, B:99:0x01d5, B:101:0x01dd, B:103:0x01e5, B:105:0x01ed, B:107:0x01f5, B:109:0x01fd, B:111:0x0205, B:113:0x020b, B:115:0x0213, B:117:0x021b, B:119:0x0223, B:121:0x022b, B:123:0x0233, B:125:0x023b, B:128:0x0246, B:131:0x0251, B:134:0x025c, B:136:0x0264, B:138:0x026c, B:140:0x0274, B:142:0x027c, B:13:0x0030, B:14:0x003b, B:48:0x0113, B:40:0x00e6, B:17:0x004f, B:20:0x005e, B:21:0x0066, B:22:0x0070, B:38:0x00dd, B:24:0x007d, B:25:0x008b, B:26:0x0096, B:27:0x009f, B:30:0x00ae, B:32:0x00ba, B:35:0x00c8, B:36:0x00d1, B:43:0x00f4, B:44:0x00fc, B:45:0x0105), top: B:175:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e A[Catch: all -> 0x02cc, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0017, B:9:0x001f, B:10:0x0027, B:42:0x00ee, B:53:0x011e, B:54:0x0121, B:56:0x0128, B:58:0x0130, B:60:0x0138, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:70:0x015d, B:161:0x02b0, B:163:0x02b5, B:166:0x02bb, B:167:0x02be, B:169:0x02c2, B:73:0x0169, B:76:0x0175, B:78:0x017d, B:80:0x0185, B:82:0x018d, B:84:0x019b, B:86:0x01a3, B:89:0x01ae, B:91:0x01b6, B:93:0x01be, B:95:0x01c5, B:97:0x01cd, B:99:0x01d5, B:101:0x01dd, B:103:0x01e5, B:105:0x01ed, B:107:0x01f5, B:109:0x01fd, B:111:0x0205, B:113:0x020b, B:115:0x0213, B:117:0x021b, B:119:0x0223, B:121:0x022b, B:123:0x0233, B:125:0x023b, B:128:0x0246, B:131:0x0251, B:134:0x025c, B:136:0x0264, B:138:0x026c, B:140:0x0274, B:142:0x027c, B:13:0x0030, B:14:0x003b, B:48:0x0113, B:40:0x00e6, B:17:0x004f, B:20:0x005e, B:21:0x0066, B:22:0x0070, B:38:0x00dd, B:24:0x007d, B:25:0x008b, B:26:0x0096, B:27:0x009f, B:30:0x00ae, B:32:0x00ba, B:35:0x00c8, B:36:0x00d1, B:43:0x00f4, B:44:0x00fc, B:45:0x0105), top: B:175:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128 A[Catch: all -> 0x02cc, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0017, B:9:0x001f, B:10:0x0027, B:42:0x00ee, B:53:0x011e, B:54:0x0121, B:56:0x0128, B:58:0x0130, B:60:0x0138, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:70:0x015d, B:161:0x02b0, B:163:0x02b5, B:166:0x02bb, B:167:0x02be, B:169:0x02c2, B:73:0x0169, B:76:0x0175, B:78:0x017d, B:80:0x0185, B:82:0x018d, B:84:0x019b, B:86:0x01a3, B:89:0x01ae, B:91:0x01b6, B:93:0x01be, B:95:0x01c5, B:97:0x01cd, B:99:0x01d5, B:101:0x01dd, B:103:0x01e5, B:105:0x01ed, B:107:0x01f5, B:109:0x01fd, B:111:0x0205, B:113:0x020b, B:115:0x0213, B:117:0x021b, B:119:0x0223, B:121:0x022b, B:123:0x0233, B:125:0x023b, B:128:0x0246, B:131:0x0251, B:134:0x025c, B:136:0x0264, B:138:0x026c, B:140:0x0274, B:142:0x027c, B:13:0x0030, B:14:0x003b, B:48:0x0113, B:40:0x00e6, B:17:0x004f, B:20:0x005e, B:21:0x0066, B:22:0x0070, B:38:0x00dd, B:24:0x007d, B:25:0x008b, B:26:0x0096, B:27:0x009f, B:30:0x00ae, B:32:0x00ba, B:35:0x00c8, B:36:0x00d1, B:43:0x00f4, B:44:0x00fc, B:45:0x0105), top: B:175:0x0001 }] */
    @Override // X.InterfaceC5819Dq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.InterfaceC5458Dit[] A7k(android.net.Uri r13, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.DefaultExtractorsFactory.A7k(android.net.Uri, java.util.Map):X.Dit[]");
    }

    @Override // X.InterfaceC5819Dq4
    public final /* bridge */ /* synthetic */ void ABE(int i) {
        synchronized (this) {
            this.A00 = i;
        }
    }

    @Override // X.InterfaceC5819Dq4
    @Deprecated
    public final /* bridge */ /* synthetic */ void ABG(boolean z) {
        synchronized (this) {
            this.A02 = z;
        }
    }

    @Override // X.InterfaceC5819Dq4
    public final /* bridge */ /* synthetic */ void Aeq(InterfaceC5885DrL interfaceC5885DrL) {
        synchronized (this) {
            this.A01 = interfaceC5885DrL;
        }
    }
}
