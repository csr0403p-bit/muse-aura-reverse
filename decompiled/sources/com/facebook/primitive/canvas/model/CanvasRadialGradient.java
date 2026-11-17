package com.facebook.primitive.canvas.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3054BtW;
import X.C7384Etj;
import X.C7911FKj;
import X.C8637Fhp;
import X.C8j4;
import X.InterfaceC8639Fhr;
import android.graphics.Shader;

/* loaded from: classes6.dex */
public final class CanvasRadialGradient extends C06G implements InterfaceC8639Fhr {
    public static volatile boolean A07;
    public final float A00;
    public final float A01;
    public final long A02;
    public final C8637Fhp A03;
    public final Shader.TileMode A04;
    public final C7911FKj A05;
    public final C3054BtW A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CanvasRadialGradient) {
                CanvasRadialGradient canvasRadialGradient = (CanvasRadialGradient) obj;
                if (!C7384Etj.areEqual(this.A05, canvasRadialGradient.A05) || this.A02 != canvasRadialGradient.A02 || Float.compare(this.A00, canvasRadialGradient.A00) != 0 || this.A04 != canvasRadialGradient.A04 || !C7384Etj.areEqual(this.A06, canvasRadialGradient.A06) || !C7384Etj.areEqual(this.A03, canvasRadialGradient.A03) || Float.compare(this.A01, canvasRadialGradient.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        if ((!X.AbstractC8636Fho.A04(r1, r2)) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    @Override // X.InterfaceC8639Fhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Shader Ah5() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.primitive.canvas.model.CanvasRadialGradient.Ah5():android.graphics.Shader");
    }

    public final int hashCode() {
        int i = 0;
        int iA0F = (AnonymousClass005.A0F(this.A04, AnonymousClass005.A02(AnonymousClass006.A06(this.A02, AnonymousClass005.A0E(this.A05)), this.A00)) + AnonymousClass006.A0D(this.A06)) * 31;
        C8637Fhp c8637Fhp = this.A03;
        if (c8637Fhp != null) {
            long j = c8637Fhp.A00;
            i = (int) (j ^ (j >>> 32));
        }
        return C8j4.A06((iA0F + i) * 31, this.A01);
    }

    public CanvasRadialGradient(Shader.TileMode tileMode, C7911FKj c7911FKj, C3054BtW c3054BtW, C8637Fhp c8637Fhp, float f, float f2, long j) {
        this.A05 = c7911FKj;
        this.A02 = j;
        this.A00 = f;
        this.A04 = tileMode;
        this.A06 = c3054BtW;
        this.A03 = c8637Fhp;
        this.A01 = f2;
    }
}
