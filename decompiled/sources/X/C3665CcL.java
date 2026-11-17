package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: X.CcL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3665CcL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public volatile Bitmap A04;
    public volatile C2I A05;
    public volatile ByteBuffer A06;

    public static void A00(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        CRy.A08(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public static void A01(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        final C3672CcW c3672CcW;
        synchronized (AbstractC3670CcU.class) {
            C3675CcZ c3675CcZ = new C3675CcZ();
            C3673CcX c3673CcX = AbstractC3670CcU.A00;
            if (c3673CcX == null) {
                c3673CcX = new C3673CcX();
                AbstractC3670CcU.A00 = c3673CcX;
            }
            c3672CcW = (C3672CcW) c3673CcX.A00(c3675CcZ);
        }
        long jA04 = C3cG.A04(j);
        final EnumC10422Hbv enumC10422Hbv = EnumC10422Hbv.A1J;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map map = c3672CcW.A07;
        if (map.get(enumC10422Hbv) == null || jElapsedRealtime - C3cG.A05(map.get(enumC10422Hbv)) > 30000) {
            BV4.A1I(enumC10422Hbv, map, jElapsedRealtime);
            C4691D2s c4691D2s = new C4691D2s(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? EnumC3666CcN.UNKNOWN_FORMAT : EnumC3666CcN.NV21 : EnumC3666CcN.NV16 : EnumC3666CcN.YV12 : EnumC3666CcN.YUV_420_888 : EnumC3666CcN.BITMAP, i2 != 1 ? i2 != 3 ? CcM.ANDROID_MEDIA_IMAGE : CcM.BYTEBUFFER : CcM.BITMAP, Integer.valueOf(BV6.A02(i5) & Integer.MAX_VALUE), Integer.valueOf(BV6.A02(i4) & Integer.MAX_VALUE), Integer.valueOf(BV6.A02(i3) & Integer.MAX_VALUE), Integer.valueOf(BV6.A02(i6) & Integer.MAX_VALUE), Long.valueOf(jA04 & LinkEncryptedPairingKt.LINK_COUNTER_MAX));
            C3691Ccp c3691Ccp = new C3691Ccp();
            c3691Ccp.A00 = c4691D2s;
            final CcQ ccQ = new CcQ(c3691Ccp);
            CSA csa = c3672CcW.A02;
            final String strA00 = csa.A0C() ? (String) csa.A08() : CA8.A01.A00(c3672CcW.A06);
            EnumC3664CcK.A01.execute(new Runnable() { // from class: X.Cck
                public static final String __redex_internal_original_name = "zzmi";

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    AbstractC3804Cen c3794Ced;
                    C3672CcW c3672CcW2 = c3672CcW;
                    InterfaceC3671CcV interfaceC3671CcV = ccQ;
                    EnumC10422Hbv enumC10422Hbv2 = enumC10422Hbv;
                    String str2 = strA00;
                    CcQ ccQ2 = (CcQ) interfaceC3671CcV;
                    C3691Ccp c3691Ccp2 = ccQ2.A01;
                    c3691Ccp2.A01 = enumC10422Hbv2;
                    C3689Ccn c3689Ccn = new C3690Cco(c3691Ccp2).A02;
                    if (c3689Ccn == null || (str = c3689Ccn.A09) == null || str.isEmpty()) {
                        str = "NA";
                    }
                    C3688Ccm c3688Ccm = new C3688Ccm();
                    c3688Ccm.A06 = "com.facebook.aura";
                    c3688Ccm.A07 = c3672CcW2.A05;
                    synchronized (C3672CcW.class) {
                        c3794Ced = C3672CcW.A09;
                        if (c3794Ced == null) {
                            C7528Ezc c7528EzcA00 = AbstractC7547F2b.A00(Resources.getSystem().getConfiguration());
                            C3687Ccl c3687Ccl = new C3687Ccl();
                            for (int i7 = 0; i7 < c7528EzcA00.A01(); i7++) {
                                c3687Ccl.A00(c7528EzcA00.A02(i7).toLanguageTag());
                            }
                            c3687Ccl.A01 = true;
                            Object[] objArr = c3687Ccl.A02;
                            int i8 = c3687Ccl.A00;
                            F0K f0k = AbstractC3804Cen.A00;
                            c3794Ced = i8 == 0 ? C3794Ced.A02 : new C3794Ced(i8, objArr);
                            C3672CcW.A09 = c3794Ced;
                        }
                    }
                    c3688Ccm.A00 = c3794Ced;
                    c3688Ccm.A02 = AnonymousClass001.A0i();
                    c3688Ccm.A09 = str;
                    c3688Ccm.A08 = str2;
                    CSA csa2 = c3672CcW2.A03;
                    c3688Ccm.A0A = csa2.A0C() ? (String) csa2.A08() : c3672CcW2.A04.A00();
                    c3688Ccm.A04 = 10;
                    c3688Ccm.A05 = Integer.valueOf(c3672CcW2.A00);
                    ccQ2.A00 = c3688Ccm;
                    c3672CcW2.A01.AjH(interfaceC3671CcV);
                }
            });
        }
    }

    public C3665CcL(int i, Bitmap bitmap) {
        CRy.A03(bitmap);
        this.A04 = bitmap;
        this.A00 = bitmap.getWidth();
        this.A01 = bitmap.getHeight();
        A00(i);
        this.A02 = i;
        this.A03 = -1;
    }

    public C3665CcL(ByteBuffer byteBuffer, int i, int i2, int i3) {
        CRy.A03(byteBuffer);
        this.A06 = byteBuffer;
        CRy.A08(byteBuffer.limit() > i * i2, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.A00 = i;
        this.A01 = i2;
        A00(i3);
        this.A02 = i3;
        this.A03 = 17;
    }

    public C3665CcL(Image image, int i, int i2, int i3) {
        this.A05 = new C2I(image);
        this.A00 = i;
        this.A01 = i2;
        A00(i3);
        this.A02 = i3;
        this.A03 = 35;
    }
}
