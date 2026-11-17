package com.facebook.fresco.animation.factory;

import X.AbstractC7151EhM;
import X.AnonymousClass005;
import X.C7169Ehe;
import X.CCV;
import X.EhF;
import X.InterfaceC7064EfB;
import X.InterfaceC7127Egh;
import X.InterfaceC7147EhG;
import X.InterfaceC7153EhO;
import X.InterfaceExecutorServiceC3053BtV;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameLoaderListener;
import com.facebook.fresco.vito.core.AnimatedImagePerfLoggingListener;

/* loaded from: classes5.dex */
public final class AnimatedFactoryV2Impl {
    public int A00;
    public int A01;
    public InterfaceExecutorServiceC3053BtV A02;
    public C7169Ehe A03;
    public InterfaceC7153EhO A04;
    public EhF A05;
    public final AbstractC7151EhM A06;
    public final InterfaceC7127Egh<CCV, InterfaceC7064EfB> A07;
    public final InterfaceC7147EhG A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final FrameLoaderListener A0F;
    public final AnimatedImagePerfLoggingListener A0G;

    public AnimatedFactoryV2Impl(AbstractC7151EhM abstractC7151EhM, InterfaceC7147EhG interfaceC7147EhG, InterfaceC7127Egh<CCV, InterfaceC7064EfB> interfaceC7127Egh, boolean z, boolean z2, int i, int i2, InterfaceExecutorServiceC3053BtV interfaceExecutorServiceC3053BtV, boolean z3, FrameLoaderListener frameLoaderListener, boolean z4, AnimatedImagePerfLoggingListener animatedImagePerfLoggingListener, boolean z5, boolean z6) {
        AnonymousClass005.A0x(abstractC7151EhM, interfaceC7147EhG, interfaceC7127Egh);
        this.A06 = abstractC7151EhM;
        this.A08 = interfaceC7147EhG;
        this.A07 = interfaceC7127Egh;
        this.A09 = z;
        this.A0E = z2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = interfaceExecutorServiceC3053BtV;
        this.A0A = z3;
        this.A0F = frameLoaderListener;
        this.A0B = z4;
        this.A0G = animatedImagePerfLoggingListener;
        this.A0C = z5;
        this.A0D = z6;
    }
}
