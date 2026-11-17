package X;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import meta.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* loaded from: classes5.dex */
public abstract class Dl2 {
    public static C5507Djj A00(Context context, InterfaceC6133Dwb interfaceC6133Dwb, DlP dlP, C5580Dky c5580Dky, InterfaceC2356BVg interfaceC2356BVg, boolean z) {
        int length;
        if (c5580Dky == null || C5580Dky.A00(c5580Dky) < 1) {
            return null;
        }
        int i = 0;
        C5585DlC c5585DlC = c5580Dky.A0R.get(0);
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator<Dl9> it = c5585DlC.A03.iterator();
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            int i2 = dl9A0b.A06;
            if (i2 == 1) {
                Iterator itA02 = Dl9.A02(dl9A0b);
                while (itA02.hasNext()) {
                    BV6.A1S(arrayListA0h2, itA02);
                }
            } else if (i2 == 2) {
                Iterator itA022 = Dl9.A02(dl9A0b);
                while (itA022.hasNext()) {
                    BV6.A1S(arrayListA0h, itA022);
                }
            }
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        ArrayList arrayListA0h4 = C3cG.A0h();
        if (!arrayListA0h3.isEmpty()) {
            arrayListA0h = arrayListA0h3;
        }
        if (!arrayListA0h4.isEmpty()) {
            arrayListA0h2 = arrayListA0h4;
        }
        if (!arrayListA0h.isEmpty() && context != null) {
            int[] iArrA02 = A02(context, interfaceC6133Dwb, dlP, c5580Dky, arrayListA0h, interfaceC2356BVg, z, false);
            ArrayList arrayListA0h5 = C3cG.A0h();
            if (iArrA02 != null && (length = iArrA02.length) > 0) {
                do {
                    arrayListA0h5.add(arrayListA0h.get(iArrA02[i]));
                    i++;
                } while (i < length);
            }
            arrayListA0h = arrayListA0h5;
        }
        if (arrayListA0h.isEmpty()) {
            arrayListA0h = null;
        }
        if (arrayListA0h2.isEmpty()) {
            arrayListA0h2 = null;
        }
        if (arrayListA0h == null && arrayListA0h2 == null) {
            return null;
        }
        return new C5507Djj(arrayListA0h, arrayListA0h2);
    }

    public static List<AbstractC5553DkW> A01(C5580Dky c5580Dky) {
        C5585DlC c5585DlC;
        List<Dl9> list;
        if (c5580Dky == null || C5580Dky.A00(c5580Dky) < 1 || (c5585DlC = c5580Dky.A0R.get(0)) == null || (list = c5585DlC.A03) == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Dl9> it = list.iterator();
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            if (dl9A0b.A06 == 3) {
                arrayListA0h.add(dl9A0b);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            List<AbstractC5553DkW> list2 = BV6.A0b(it2).A0E;
            if (list2 != null && !list2.isEmpty()) {
                arrayListA0h2.add(list2.get(0));
            }
        }
        return arrayListA0h2;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Ljava/util/List<LX/DkW;>;LX/BVg;ZZLX/DlP;LX/Dky;LX/Dwb;)[I */
    public static int[] A02(Context context, InterfaceC6133Dwb interfaceC6133Dwb, DlP dlP, C5580Dky c5580Dky, List list, InterfaceC2356BVg interfaceC2356BVg, boolean z, boolean z2) {
        Display defaultDisplay;
        Point point;
        boolean z3;
        int i;
        int i2;
        int i3;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                point = new Point(-1, -1);
            } else {
                point = new Point();
                Display.Mode mode = defaultDisplay.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            }
            ArrayList arrayListA0h = C3cG.A0h();
            int size = list.size();
            ArrayList arrayListA0h2 = C3cG.A0h();
            if ((!AbstractC5653Dmh.A03(EnumC5618Dlz.A2B) || !AbstractC5653Dmh.A03(EnumC5618Dlz.A2E)) && !AbstractC5653Dmh.A03(EnumC5618Dlz.A2C)) {
                z3 = AbstractC5653Dmh.A03(EnumC5618Dlz.A2F);
            }
            AbstractC5653Dmh.A03(EnumC5618Dlz.A28);
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                C6154Dwx c6154DwxA00 = AbstractC5553DkW.A00(list, i5);
                int iA00 = (BV6.A1W(c6154DwxA00, "video/av01") && z2) ? 4 : z3 ? C6149Dwr.A00(context, c6154DwxA00, interfaceC6133Dwb, interfaceC2356BVg, false, z, false) : C6150Dws.A04(c6154DwxA00, interfaceC2356BVg, false, false);
                if (BV7.A1T(iA00 & 7, 4)) {
                    C60Q.A1P(arrayListA0h, i5);
                    if (c6154DwxA00.A0Q > 0 && c6154DwxA00.A0D > 0 && (i2 = point.x) > 0 && (i3 = point.y) > 0) {
                        int i6 = c6154DwxA00.A0Q;
                        int i7 = c6154DwxA00.A0D;
                        int i8 = i3;
                        if (C8j4.A1V(i6, i7) == (i2 > i3)) {
                            i8 = i2;
                            i2 = i3;
                        }
                        Point point2 = i6 * i2 >= i7 * i8 ? new Point(i8, ((r0 + i6) - 1) / i6) : new Point(((r1 + i7) - 1) / i7, i2);
                        int i9 = c6154DwxA00.A0Q * c6154DwxA00.A0D;
                        if (c6154DwxA00.A0Q >= ((int) (point2.x * 0.98f)) && c6154DwxA00.A0D >= ((int) (point2.y * 0.98f)) && i9 < i4) {
                            i4 = i9;
                        }
                    }
                } else {
                    String str = "";
                    if (iA00 == 0) {
                        str = "FORMAT_UNSUPPORTED_TYPE";
                    } else if (iA00 == 1) {
                        str = "FORMAT_UNSUPPORTED_SUBTYPE";
                    } else if (iA00 == 2) {
                        str = "FORMAT_UNSUPPORTED_DRM";
                    } else if (iA00 == 3) {
                        str = "FORMAT_EXCEEDS_CAPABILITIES";
                    }
                    arrayListA0h2.add(String.format("rendererSupportsFormatResult=%s, Format=%s", str, c6154DwxA00.toString()));
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size2 = arrayListA0h.size() - 1; size2 >= 0; size2--) {
                    C6154Dwx c6154DwxA002 = AbstractC5553DkW.A00(list, AnonymousClass001.A0F(arrayListA0h.get(size2)));
                    int i10 = c6154DwxA002.A0Q;
                    int i11 = -1;
                    if (i10 != -1 && (i = c6154DwxA002.A0D) != -1) {
                        i11 = i10 * i;
                    }
                    if (i11 == -1 || i11 > i4) {
                        arrayListA0h.remove(size2);
                    }
                }
            }
            if (arrayListA0h.isEmpty()) {
                dlP.APy(String.format("manifestId=%s, errors=%s", c5580Dky.A0L, arrayListA0h2.toString()));
            }
            int size3 = arrayListA0h.size();
            int[] iArr = new int[size3];
            for (int i12 = 0; i12 < size3; i12++) {
                iArr[i12] = AnonymousClass001.A0F(arrayListA0h.get(i12));
            }
            return iArr;
        } catch (MediaCodecUtil$DecoderQueryException e) {
            dlP.APy(String.format("manifestId=%s, exception=%s", c5580Dky.A0L, e.toString()));
            return null;
        }
    }

    public static long[] A03(C5580Dky c5580Dky) {
        long[] jArr = {-1, -1, -1};
        if (c5580Dky != null) {
            try {
                int iA00 = C5580Dky.A00(c5580Dky);
                if (iA00 != 0) {
                    List<C5585DlC> list = c5580Dky.A0R;
                    C5585DlC c5585DlC = list.get(0);
                    int i = iA00 - 1;
                    C5585DlC c5585DlC2 = list.get(i);
                    int iA002 = c5585DlC.A00(2);
                    int iA003 = c5585DlC2.A00(2);
                    if (iA002 >= 0 && iA003 >= 0) {
                        List<Dl9> list2 = c5585DlC.A03;
                        if (!Dl9.A03(list2, iA002).isEmpty()) {
                            List<Dl9> list3 = c5585DlC2.A03;
                            if (!Dl9.A03(list3, iA003).isEmpty()) {
                                AbstractC5553DkW abstractC5553DkW = (AbstractC5553DkW) Dl9.A03(list2, iA002).get(0);
                                AbstractC5553DkW abstractC5553DkW2 = (AbstractC5553DkW) Dl9.A03(list3, iA003).get(0);
                                if ((abstractC5553DkW instanceof C5582Dl1) && (abstractC5553DkW2 instanceof C5582Dl1)) {
                                    Dl3 dl3 = ((C5582Dl1) abstractC5553DkW).A00;
                                    long j = dl3.A05;
                                    long jA01 = C5580Dky.A01(c5580Dky, i);
                                    Dl3 dl32 = ((C5582Dl1) abstractC5553DkW2).A00;
                                    long jA012 = (dl32.A01(jA01) + j) - 1;
                                    return new long[]{dl3.A02(j) / 1000, (dl32.A02(jA012) + dl32.A04(jA012, -9223372036854775807L)) / 1000, (jA012 - j) + 1};
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("DashManifestHelper2", "Could not get segment range from manifest", e);
                return jArr;
            }
        }
        return jArr;
    }
}
