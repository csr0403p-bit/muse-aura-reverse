package X;

import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class E0N extends E06 {
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public long A05;
    public List<E0J> A07;
    public List<E0J> A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F;
    public static final int[] A0K = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A0J = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A0O = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] A0I = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 102, 103, 104, 105, 106, 107, MinidumpReader.MODULE_FULL_SIZE, 109, 110, 111, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, HatchDeviceBleManagerKt.REQUESTED_MTU, 209, 241, 9632};
    public static final int[] A0L = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] A0M = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] A0N = {195, 227, 205, HatchWidgetWebViewKt.HTTP_NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, HatchMessageShareDocumentRenderer.CONTENT_TOP_PX, 229, HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] A0P = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final E1P A0G = BV6.A0X();
    public final ArrayList<C6312E0k> A0H = C3cG.A0h();
    public C6312E0k A06 = new C6312E0k(0, 4);
    public int A04 = 0;

    public static ArrayList A00(E0N e0n) {
        ArrayList<C6312E0k> arrayList = e0n.A0H;
        int size = arrayList.size();
        ArrayList arrayListA11 = C60O.A11(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            E0J e0jA01 = arrayList.get(i).A01(Integer.MIN_VALUE);
            arrayListA11.add(e0jA01);
            if (e0jA01 != null) {
                iMin = Math.min(iMin, e0jA01.A08);
            }
        }
        ArrayList arrayListA112 = C60O.A11(size);
        for (int i2 = 0; i2 < size; i2++) {
            E0J e0jA012 = (E0J) arrayListA11.get(i2);
            if (e0jA012 != null) {
                if (e0jA012.A08 != iMin) {
                    e0jA012 = arrayList.get(i2).A01(iMin);
                    e0jA012.getClass();
                }
                arrayListA112.add(e0jA012);
            }
        }
        return arrayListA112;
    }

    public static void A01(E0N e0n) {
        C6312E0k c6312E0k = e0n.A06;
        c6312E0k.A00 = e0n.A02;
        c6312E0k.A06.clear();
        c6312E0k.A07.clear();
        c6312E0k.A05.setLength(0);
        c6312E0k.A03 = 15;
        c6312E0k.A02 = 0;
        c6312E0k.A04 = 0;
        ArrayList<C6312E0k> arrayList = e0n.A0H;
        arrayList.clear();
        arrayList.add(e0n.A06);
    }

    public static void A02(E0N e0n, int i) {
        int i2 = e0n.A02;
        if (i2 == i) {
            return;
        }
        e0n.A02 = i;
        if (i != 3) {
            A01(e0n);
            if (i2 == 3 || i == 1 || i == 0) {
                e0n.A07 = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList<C6312E0k> arrayList = e0n.A0H;
            if (i3 >= arrayList.size()) {
                return;
            }
            arrayList.get(i3).A00 = 3;
            i3++;
        }
    }

    public E0N(String str, int i, long j) {
        if (j != -9223372036854775807L) {
            C1G.A07(C8j3.A1Q((j > 16000L ? 1 : (j == 16000L ? 0 : -1))));
            this.A0F = j * 1000;
        } else {
            this.A0F = -9223372036854775807L;
        }
        this.A0C = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.A0D = 0;
            this.A0E = 0;
        } else if (i != 2) {
            if (i == 3) {
                this.A0D = 0;
            } else if (i != 4) {
                CNC.A04("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                this.A0D = 0;
                this.A0E = 0;
            } else {
                this.A0D = 1;
            }
            this.A0E = 1;
        } else {
            this.A0D = 1;
            this.A0E = 0;
        }
        A02(this, 0);
        A01(this);
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }

    @Override // X.E06
    /* renamed from: A05 */
    public final E0M A8s() {
        E0M e0mPollFirst;
        E0M e0mA05 = super.A8s();
        if (e0mA05 != null) {
            return e0mA05;
        }
        long j = this.A0F;
        if (j != -9223372036854775807L) {
            long j2 = this.A05;
            if (j2 != -9223372036854775807L && super.A01 - j2 >= j && (e0mPollFirst = super.A05.pollFirst()) != null) {
                this.A07 = Collections.EMPTY_LIST;
                this.A05 = -9223372036854775807L;
                E0R e0rA04 = A04();
                long j3 = super.A01;
                ((AbstractC6252Dyv) e0mPollFirst).A00 = j3;
                e0mPollFirst.A01 = e0rA04;
                e0mPollFirst.A00 = j3;
                return e0mPollFirst;
            }
        }
        return null;
    }

    @Override // X.E06, X.InterfaceC6223DyE
    public final void flush() {
        super.flush();
        this.A07 = null;
        this.A08 = null;
        A02(this, 0);
        this.A03 = 4;
        this.A06.A01 = 4;
        A01(this);
        this.A09 = false;
        this.A0B = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
        this.A04 = 0;
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }
}
