package com.facebook.aura.tabs;

import X.A3q;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$AuraFixedNavBar$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AtomicReference<Set<String>> $previousPromotedSpaceSlugsRef;
    public final /* synthetic */ boolean $sortingEnabled;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFixedNavBarKt$AuraFixedNavBar$4$1(boolean z, AbstractC3358CGz abstractC3358CGz, AtomicReference<Set<String>> atomicReference) {
        super(1);
        this.$sortingEnabled = z;
        this.$userSession = abstractC3358CGz;
        this.$previousPromotedSpaceSlugsRef = atomicReference;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$sortingEnabled) {
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Set<String> andSet = this.$previousPromotedSpaceSlugsRef.getAndSet(A3q.A00);
            C7384Etj.A0U(andSet);
            SpaceTabWebViewPreloaderKt.evictRemovedSpaceTabWebViews(abstractC3358CGz, andSet);
        }
        return new C78g() { // from class: com.facebook.aura.tabs.AuraFixedNavBarKt$AuraFixedNavBar$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
