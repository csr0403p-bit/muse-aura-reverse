package X;

import android.graphics.ComposeShader;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.AhN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1336AhN extends C1EQ {
    public C1338AhP A00;
    public long A01 = 9205357640488583168L;

    @Override // X.C1EQ
    public final void A07(InterfaceC1330AhH interfaceC1330AhH, float f, long j) {
        C1338AhP c1338AhP = this.A00;
        if (c1338AhP == null || this.A01 != j) {
            if (AWA.A06(j)) {
                this.A00 = null;
                this.A01 = 9205357640488583168L;
                c1338AhP = null;
            } else {
                if (c1338AhP == null) {
                    c1338AhP = new C1338AhP();
                    this.A00 = c1338AhP;
                }
                c1338AhP.A00 = A08(j);
                this.A00 = c1338AhP;
                this.A01 = j;
            }
        }
        C1776AqX c1776AqX = (C1776AqX) interfaceC1330AhH;
        long color = c1776AqX.A01.getColor() << 32;
        long j2 = B6A.A01;
        if (color != j2) {
            interfaceC1330AhH.Ad4(j2);
        }
        if (!C7384Etj.areEqual(c1776AqX.A02, c1338AhP != null ? c1338AhP.A00 : null)) {
            Shader shader = c1338AhP != null ? c1338AhP.A00 : null;
            c1776AqX.A02 = shader;
            c1776AqX.A01.setShader(shader);
        }
        if (c1776AqX.A01.getAlpha() / 255.0f != f) {
            interfaceC1330AhH.Acj(f);
        }
    }

    public Shader A08(long j) {
        float fA05;
        long j2;
        if (!(this instanceof C1334AhL)) {
            if (!(this instanceof C1420Aip)) {
                return ((C1552AlH) this).A00;
            }
            C1420Aip c1420Aip = (C1420Aip) this;
            return new ComposeShader(c1420Aip.A01.A08(j), c1420Aip.A02.A08(j), AbstractC8721FjM.A00(c1420Aip.A00));
        }
        C1334AhL c1334AhL = (C1334AhL) this;
        long j3 = c1334AhL.A02;
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            long jA01 = C1Wv.A01(j);
            fA05 = AnonymousClass001.A00(jA01);
            j2 = jA01 & 4294967295L;
        } else {
            long j4 = j3 >> 32;
            if (C8j3.A05(j4) == Float.POSITIVE_INFINITY) {
                j4 = j >> 32;
            }
            fA05 = C8j3.A05(j4);
            j2 = j3 & 4294967295L;
            if (C8j3.A05(j2) == Float.POSITIVE_INFINITY) {
                j2 = j & 4294967295L;
            }
        }
        float fA052 = C8j3.A05(j2);
        List<B6A> list = c1334AhL.A03;
        List<Float> list2 = c1334AhL.A04;
        long jA0L = AnonymousClass005.A0L(fA05, fA052);
        float fA01 = c1334AhL.A00;
        if (fA01 == Float.POSITIVE_INFINITY) {
            fA01 = AWA.A01(j) / 2.0f;
        }
        int i = c1334AhL.A01;
        AbstractC1337AhO.A00(list, list2);
        float fA00 = AnonymousClass001.A00(jA0L);
        float fA012 = AnonymousClass001.A01(jA0L, 4294967295L);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = HxS.A01(C8j4.A0P(list, i2));
        }
        return new RadialGradient(fA00, fA012, fA01, iArr, list2 != null ? AbstractC0878AGe.A0m(list2) : null, AbstractC2070Axl.A00(i));
    }
}
