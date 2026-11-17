package com.facebook.aura.ui.sharedelement;

import X.AOP;
import X.APL;
import X.APc;
import X.APh;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C1BO;
import X.C1DM;
import X.C7384Etj;
import X.EnumC04711Bv;

/* loaded from: classes4.dex */
public final class SharedElementClipParticipant {
    public long endpointSize;
    public final String key;
    public final C1BO<Float> progressState;
    public long registrationOrder;
    public final C1BO<C1DM> shapeState;
    public final APL sharedContentState;
    public final C1BO<HatchSharedElementTransform> transformState;
    public final AOP<EnumC04711Bv> transition;

    /* renamed from: getEndpointSize-YbymL2g, reason: not valid java name */
    public final long m2373getEndpointSizeYbymL2g() {
        return this.endpointSize;
    }

    public final String getKey() {
        return this.key;
    }

    public final float getProgress() {
        return C1BO.A01(this.progressState);
    }

    public final long getRegistrationOrder() {
        return this.registrationOrder;
    }

    public final C1DM getShape() {
        return this.shapeState.getValue();
    }

    public final HatchSharedElementTransform getTransform() {
        return this.transformState.getValue();
    }

    public final boolean isMatchFound() {
        APc aPc;
        APh aPh = (APh) this.sharedContentState.A01.getValue();
        if (aPh == null || (aPc = (APc) aPh.A0B.getValue()) == null) {
            return false;
        }
        return aPc.A02();
    }

    public final boolean isTargetVisible() {
        return AnonymousClass002.A1Z(this.transition.A07.getValue(), EnumC04711Bv.A04);
    }

    /* renamed from: updateEndpointSize-ozmzZPI, reason: not valid java name */
    public final void m2374updateEndpointSizeozmzZPI(long j) {
        if (j != 0) {
            HatchSharedElementTransform transform = getTransform();
            if (transform == null || !transform.isActive()) {
                this.endpointSize = j;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedElementClipParticipant(String str, C1BO<? extends C1DM> c1bo, C1BO<Float> c1bo2, APL apl, AOP<EnumC04711Bv> aop, C1BO<? extends HatchSharedElementTransform> c1bo3) {
        AnonymousClass005.A17(str, c1bo, c1bo2, apl, aop);
        C7384Etj.A0Y(c1bo3, 5);
        this.key = str;
        this.shapeState = c1bo;
        this.progressState = c1bo2;
        this.sharedContentState = apl;
        this.transition = aop;
        this.transformState = c1bo3;
        this.endpointSize = 0L;
    }

    public final void setRegistrationOrder(long j) {
        this.registrationOrder = j;
    }
}
