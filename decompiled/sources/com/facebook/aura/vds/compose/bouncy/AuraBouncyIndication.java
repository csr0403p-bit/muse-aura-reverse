package com.facebook.aura.vds.compose.bouncy;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C06G;
import X.C06H;
import X.C0dy;
import X.C1Z0;
import X.C1Z3;
import X.C3UH;
import X.C7384Etj;
import X.Hs1;
import X.InterfaceC05111Yt;
import kotlin.Deprecated;

/* loaded from: classes.dex */
public final class AuraBouncyIndication extends C06G implements C3UH {
    public static final int $stable = 0;
    public final float dampingRatio;
    public final float initialClickedVelocity;
    public final float pressStiffness;
    public final float pressedScale;
    public final float unpressStiffness;

    @Override // X.C3UH
    public C1Z3 create(C0dy c0dy) {
        C7384Etj.A0Y(c0dy, 0);
        return new BouncyNode(c0dy, this.pressedScale, this.pressStiffness, this.unpressStiffness, this.initialClickedVelocity, this.dampingRatio);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBouncyIndication) {
                AuraBouncyIndication auraBouncyIndication = (AuraBouncyIndication) obj;
                if (Float.compare(this.pressedScale, auraBouncyIndication.pressedScale) != 0 || Float.compare(this.pressStiffness, auraBouncyIndication.pressStiffness) != 0 || Float.compare(this.unpressStiffness, auraBouncyIndication.unpressStiffness) != 0 || Float.compare(this.initialClickedVelocity, auraBouncyIndication.initialClickedVelocity) != 0 || Float.compare(this.dampingRatio, auraBouncyIndication.dampingRatio) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    private final float component1() {
        return this.pressedScale;
    }

    private final float component2() {
        return this.pressStiffness;
    }

    private final float component3() {
        return this.unpressStiffness;
    }

    private final float component4() {
        return this.initialClickedVelocity;
    }

    private final float component5() {
        return this.dampingRatio;
    }

    public static /* synthetic */ AuraBouncyIndication copy$default(AuraBouncyIndication auraBouncyIndication, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = auraBouncyIndication.pressedScale;
        }
        if ((i & 2) != 0) {
            f2 = auraBouncyIndication.pressStiffness;
        }
        if ((i & 4) != 0) {
            f3 = auraBouncyIndication.unpressStiffness;
        }
        if ((i & 8) != 0) {
            f4 = auraBouncyIndication.initialClickedVelocity;
        }
        if ((i & 16) != 0) {
            f5 = auraBouncyIndication.dampingRatio;
        }
        return auraBouncyIndication.copy(f, f2, f3, f4, f5);
    }

    public final AuraBouncyIndication copy(float f, float f2, float f3, float f4, float f5) {
        return new AuraBouncyIndication(f, f2, f3, f4, f5);
    }

    @Override // X.C3UH
    public int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.pressedScale) * 31, this.pressStiffness), this.unpressStiffness), this.initialClickedVelocity) + Float.floatToIntBits(this.dampingRatio);
    }

    public AuraBouncyIndication(float f, float f2, float f3, float f4, float f5) {
        this.pressedScale = f;
        this.pressStiffness = f2;
        this.unpressStiffness = f3;
        this.initialClickedVelocity = f4;
        this.dampingRatio = f5;
    }

    @Override // X.InterfaceC05011Yg
    @Deprecated(level = Hs1.A02, message = "rememberUpdatedInstance has been deprecated - implementers should instead implement IndicationNodeFactory#create for improved performance and efficiency. Callers should check if the Indication is an IndicationNodeFactory, and call that API instead. For a migration guide and background information, please visit developer.android.com")
    public /* bridge */ InterfaceC05111Yt rememberUpdatedInstance(C0dy c0dy, BFM bfm, int i) {
        bfm.AgE(1257603829);
        C1Z0 c1z0 = C1Z0.A00;
        AnonymousClass002.A19(bfm);
        return c1z0;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraBouncyIndication(float f, float f2, float f3, float f4, float f5, int i, C06H c06h) {
        this((i & 1) != 0 ? 0.95f : f, (i & 2) != 0 ? 400.0f : f2, (i & 4) != 0 ? 400.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.7f : f5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuraBouncyIndication() {
        float f = 0.0f;
        this(f, f, f, f, f, 31, null);
    }
}
