package com.facebook.aura.tabs;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BGK;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.spaces.preload.SpaceTabWebViewPreloaderKt;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.tabs.AuraFixedNavBarKt$AuraFixedNavBar$6$1$1$1", f = "AuraFixedNavBar.kt", l = {229}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$AuraFixedNavBar$6$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Set<String> $currentSpaceSlugs;
    public final /* synthetic */ AtomicReference<Set<String>> $previousPromotedSpaceSlugsRef;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ Set<String> $warmSpaceSlugs;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFixedNavBarKt$AuraFixedNavBar$6$1$1$1(AtomicReference<Set<String>> atomicReference, Set<String> set, AbstractC3358CGz abstractC3358CGz, Context context, Set<String> set2, HtJ<? super AuraFixedNavBarKt$AuraFixedNavBar$6$1$1$1> htJ) {
        super(2, htJ);
        this.$previousPromotedSpaceSlugsRef = atomicReference;
        this.$currentSpaceSlugs = set;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$warmSpaceSlugs = set2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraFixedNavBarKt$AuraFixedNavBar$6$1$1$1(this.$previousPromotedSpaceSlugsRef, this.$currentSpaceSlugs, this.$userSession, this.$context, this.$warmSpaceSlugs, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Set<String> andSet = this.$previousPromotedSpaceSlugsRef.getAndSet(this.$currentSpaceSlugs);
            SpaceTabWebViewPreloaderKt.retainSpaceTabWebViews(this.$userSession, this.$currentSpaceSlugs);
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            C7384Etj.A0X(andSet);
            SpaceTabWebViewPreloaderKt.evictRemovedSpaceTabWebViews(abstractC3358CGz, BGK.A03(this.$currentSpaceSlugs, andSet));
            AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
            Context context = this.$context;
            List listA0X = AbstractC0878AGe.A0X(this.$warmSpaceSlugs);
            this.L$0 = null;
            this.label = 1;
            if (SpaceTabWebViewPreloaderKt.preloadSpaceTabWebViews(abstractC3358CGz2, context, listA0X, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraFixedNavBarKt$AuraFixedNavBar$6$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
