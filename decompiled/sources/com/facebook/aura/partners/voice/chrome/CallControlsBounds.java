package com.facebook.aura.partners.voice.chrome;

import X.ATD;
import X.AaC;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CallControlsBounds {
    public static final int $stable = 8;
    public final AaC area;
    public final float controlHeight;
    public final float controlWidth;
    public final float gap;
    public final List<AaC> headers;
    public final boolean ltr;

    public final AaC getArea() {
        return this.area;
    }

    public final CallControlsCorner getDefaultCorner() {
        return this.ltr ? CallControlsCorner.TOP_RIGHT : CallControlsCorner.TOP_LEFT;
    }

    /* renamed from: getDefaultPosition-F1C5BW0, reason: not valid java name */
    public final long m1690getDefaultPositionF1C5BW0() {
        boolean z = this.ltr;
        AaC aaC = this.area;
        return m1688constrainMKHz9U(AnonymousClass005.A0J(z ? aaC.A02 : aaC.A01, aaC.A03));
    }

    public final boolean getHasSpace() {
        float f = this.area.A01;
        float f2 = topAlongPath(f, f);
        AaC aaC = this.area;
        if (f2 > aaC.A00) {
            float f3 = aaC.A02;
            if (topAlongPath(f3, f3) > this.area.A00) {
                return false;
            }
        }
        return true;
    }

    public final float nearestSide(float f) {
        Object next;
        AaC aaC = this.area;
        List listAsList = Arrays.asList(Float.valueOf(aaC.A01), Float.valueOf(aaC.A02));
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listAsList) {
            float fA02 = AnonymousClass001.A02(obj);
            if (topAlongPath(fA02, fA02) <= this.area.A00) {
                arrayListA0h.add(obj);
            }
        }
        Iterator it = arrayListA0h.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(AnonymousClass001.A02(next) - f);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(AnonymousClass001.A02(next2) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Number number = (Number) next;
        if (number != null) {
            return number.floatValue();
        }
        AaC aaC2 = this.area;
        return ATD.A03(f, aaC2.A01, aaC2.A02);
    }

    public final float topAlongPath(float f, float f2) {
        float fFloatValue;
        float f3 = this.area.A03;
        List<AaC> list = this.headers;
        ArrayList arrayListA0h = C3cG.A0h();
        for (AaC aaC : list) {
            AaC aaC2 = aaC;
            float f4 = aaC2.A01;
            float fMax = Math.max(f, f2) + this.controlWidth;
            float f5 = this.gap;
            if (f4 < fMax + f5 && aaC2.A02 > Math.min(f, f2) - f5) {
                arrayListA0h.add(aaC);
            }
        }
        Iterator it = arrayListA0h.iterator();
        if (it.hasNext()) {
            float fMax2 = ((AaC) it.next()).A00 + this.gap;
            while (it.hasNext()) {
                fMax2 = Math.max(fMax2, ((AaC) it.next()).A00 + this.gap);
            }
            fFloatValue = Float.valueOf(fMax2).floatValue();
        } else {
            fFloatValue = this.area.A03;
        }
        return Math.max(f3, fFloatValue);
    }

    public final CallControlsBounds withControlHeight(float f) {
        float f2 = this.controlHeight;
        if (f == f2) {
            return this;
        }
        AaC aaC = this.area;
        float f3 = (aaC.A00 + f2) - f;
        float f4 = aaC.A03;
        if (f3 < f4) {
            f3 = f4;
        }
        return new CallControlsBounds(new AaC(aaC.A01, f4, aaC.A02, f3), this.headers, this.controlWidth, this.gap, f, this.ltr);
    }

    public CallControlsBounds(AaC aaC, List<AaC> list, float f, float f2, float f3, boolean z) {
        AnonymousClass003.A0u(aaC, list);
        this.area = aaC;
        this.headers = list;
        this.controlWidth = f;
        this.gap = f2;
        this.controlHeight = f3;
        this.ltr = z;
    }

    private final float topAt(float f) {
        return topAlongPath(f, f);
    }

    /* renamed from: constrain-MK-Hz9U, reason: not valid java name */
    public final long m1688constrainMKHz9U(long j) {
        float fA00 = AnonymousClass001.A00(j);
        AaC aaC = this.area;
        float fA03 = ATD.A03(fA00, aaC.A01, aaC.A02);
        if (topAlongPath(fA03, fA03) > this.area.A00) {
            fA03 = nearestSide(fA03);
        }
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        float f = topAlongPath(fA03, fA03);
        float f2 = this.area.A00;
        if (f > f2) {
            f = f2;
        }
        return AnonymousClass005.A0M(fA03, ATD.A03(fA01, f, f2));
    }

    /* renamed from: constrainToArea-MK-Hz9U, reason: not valid java name */
    public final long m1689constrainToAreaMKHz9U(long j) {
        float fA00 = AnonymousClass001.A00(j);
        AaC aaC = this.area;
        float fA03 = ATD.A03(fA00, aaC.A01, aaC.A02);
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        AaC aaC2 = this.area;
        return AnonymousClass005.A0M(fA03, ATD.A03(fA01, aaC2.A03, aaC2.A00));
    }
}
