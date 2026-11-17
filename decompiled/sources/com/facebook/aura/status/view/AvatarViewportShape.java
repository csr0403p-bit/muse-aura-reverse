package com.facebook.aura.status.view;

import X.AW6;
import X.AW7;
import X.AXN;
import X.AbstractC1555AlK;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C1DM;
import X.EnumC1820Arj;

/* loaded from: classes.dex */
public final class AvatarViewportShape implements C1DM {
    public static final int $stable = 0;
    public final float bottom;
    public final float bottomRadius;
    public final float horizontalInset;
    public final float topRadius;

    @Override // X.C1DM
    /* renamed from: createOutline-Pq9zytI */
    public AbstractC1555AlK mo2createOutlinePq9zytI(long j, EnumC1820Arj enumC1820Arj, AXN axn) {
        AnonymousClass003.A0x(enumC1820Arj, axn);
        float f = this.horizontalInset;
        float fA00 = AnonymousClass001.A00(j) - f;
        float f2 = this.bottom;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.topRadius);
        long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits & 4294967295L);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(this.bottomRadius);
        long j3 = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits2 << 32);
        return new AW6(new AW7(f, 0.0f, fA00, f2, j2, j2, j3, j3));
    }

    public AvatarViewportShape(float f, float f2, float f3, float f4) {
        this.bottom = f;
        this.bottomRadius = f2;
        this.topRadius = f3;
        this.horizontalInset = f4;
    }

    public /* synthetic */ AvatarViewportShape(float f, float f2, float f3, float f4, int i, C06H c06h) {
        this(f, f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
