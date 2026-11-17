package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.InterfaceC05011Yg;

/* loaded from: classes.dex */
public final class AuraModeOverride extends C06G {
    public static final int $stable = 0;
    public final AuraBrushes brushes;
    public final AuraColors colors;
    public final long contentColor;
    public final InterfaceC05011Yg indication;

    /* renamed from: copy-9LQNqLg$default, reason: not valid java name */
    public static /* synthetic */ AuraModeOverride m2947copy9LQNqLg$default(AuraModeOverride auraModeOverride, AuraBrushes auraBrushes, AuraColors auraColors, long j, InterfaceC05011Yg interfaceC05011Yg, int i, Object obj) {
        AuraBrushes auraBrushes2 = auraBrushes;
        AuraColors auraColors2 = auraColors;
        long j2 = j;
        InterfaceC05011Yg interfaceC05011Yg2 = interfaceC05011Yg;
        if ((i & 1) != 0) {
            auraBrushes2 = auraModeOverride.brushes;
        }
        if ((i & 2) != 0) {
            auraColors2 = auraModeOverride.colors;
        }
        if ((i & 4) != 0) {
            j2 = auraModeOverride.contentColor;
        }
        if ((i & 8) != 0) {
            interfaceC05011Yg2 = auraModeOverride.indication;
        }
        AnonymousClass005.A0y(auraBrushes2, auraColors2, interfaceC05011Yg2);
        return new AuraModeOverride(auraBrushes2, auraColors2, j2, interfaceC05011Yg2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraModeOverride) {
                AuraModeOverride auraModeOverride = (AuraModeOverride) obj;
                if (C7384Etj.areEqual(this.brushes, auraModeOverride.brushes) && C7384Etj.areEqual(this.colors, auraModeOverride.colors)) {
                    long j = this.contentColor;
                    long j2 = auraModeOverride.contentColor;
                    long j3 = B6A.A01;
                    if (j != j2 || !C7384Etj.areEqual(this.indication, auraModeOverride.indication)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final AuraBrushes component1() {
        return this.brushes;
    }

    public final AuraColors component2() {
        return this.colors;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m2948component30d7_KjU() {
        return this.contentColor;
    }

    public final InterfaceC05011Yg component4() {
        return this.indication;
    }

    public final AuraBrushes getBrushes() {
        return this.brushes;
    }

    public final AuraColors getColors() {
        return this.colors;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2950getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final InterfaceC05011Yg getIndication() {
        return this.indication;
    }

    public int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.colors, AnonymousClass005.A0E(this.brushes));
        long j = this.contentColor;
        long j2 = B6A.A01;
        return AnonymousClass005.A0G(this.indication, AnonymousClass006.A06(j, iA0F));
    }

    public /* synthetic */ AuraModeOverride(AuraBrushes auraBrushes, AuraColors auraColors, long j, InterfaceC05011Yg interfaceC05011Yg, C06H c06h) {
        this(auraBrushes, auraColors, j, interfaceC05011Yg);
    }

    /* renamed from: copy-9LQNqLg, reason: not valid java name */
    public final AuraModeOverride m2949copy9LQNqLg(AuraBrushes auraBrushes, AuraColors auraColors, long j, InterfaceC05011Yg interfaceC05011Yg) {
        AnonymousClass005.A0y(auraBrushes, auraColors, interfaceC05011Yg);
        return new AuraModeOverride(auraBrushes, auraColors, j, interfaceC05011Yg);
    }

    public String toString() {
        return super.toString();
    }

    public AuraModeOverride(AuraBrushes auraBrushes, AuraColors auraColors, long j, InterfaceC05011Yg interfaceC05011Yg) {
        AnonymousClass005.A0y(auraBrushes, auraColors, interfaceC05011Yg);
        this.brushes = auraBrushes;
        this.colors = auraColors;
        this.contentColor = j;
        this.indication = interfaceC05011Yg;
    }
}
