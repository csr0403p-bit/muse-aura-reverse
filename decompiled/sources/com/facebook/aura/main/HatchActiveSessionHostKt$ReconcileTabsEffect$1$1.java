package com.facebook.aura.main;

import X.AIX;
import X.AIY;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.HatchActiveSessionHostKt$ReconcileTabsEffect$1$1", f = "HatchActiveSessionHost.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$ReconcileTabsEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $artifactsLoaded$delegate;
    public final /* synthetic */ boolean $isFeedEnabled;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ List<String> $spaceSlugs;
    public int label;

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$ReconcileTabsEffect$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AuraTabRootNavKey, Boolean> {
        public final /* synthetic */ C1BO<Boolean> $artifactsLoaded$delegate;

        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.navigation.AuraTabRootNavKey r2) {
            /*
                r1 = this;
                r0 = 0
                X.C7384Etj.A0Y(r2, r0)
                X.1BO<java.lang.Boolean> r0 = r1.$artifactsLoaded$delegate
                boolean r0 = X.C1BO.A0F(r0)
                if (r0 != 0) goto L11
                boolean r1 = r2 instanceof com.facebook.aura.navigation.key.SpaceTabScreenKey
                r0 = 0
                if (r1 != 0) goto L12
            L11:
                r0 = 1
            L12:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchActiveSessionHostKt$ReconcileTabsEffect$1$1.AnonymousClass2.invoke(com.facebook.aura.navigation.AuraTabRootNavKey):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C1BO<Boolean> c1bo) {
            super(1);
            this.$artifactsLoaded$delegate = c1bo;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$ReconcileTabsEffect$1$1(AuraNavigator auraNavigator, boolean z, List<String> list, C1BO<Boolean> c1bo, HtJ<? super HatchActiveSessionHostKt$ReconcileTabsEffect$1$1> htJ) {
        super(2, htJ);
        this.$navigator = auraNavigator;
        this.$isFeedEnabled = z;
        this.$spaceSlugs = list;
        this.$artifactsLoaded$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchActiveSessionHostKt$ReconcileTabsEffect$1$1(this.$navigator, this.$isFeedEnabled, this.$spaceSlugs, this.$artifactsLoaded$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AuraNavigator auraNavigator = this.$navigator;
        boolean z = this.$isFeedEnabled;
        List<String> list = this.$spaceSlugs;
        C1BO<Boolean> c1bo = this.$artifactsLoaded$delegate;
        AIY aiy = new AIY();
        aiy.add(ConversationTabScreenKey.INSTANCE);
        if (z) {
            aiy.add(FeedScreenKey.INSTANCE);
        }
        aiy.add(ExploreScreenKey.INSTANCE);
        aiy.add(HatchGoalsTabScreenKey.INSTANCE);
        aiy.add(LibraryScreenKey.INSTANCE);
        if (C1BO.A0F(c1bo)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                aiy.add(new SpaceTabScreenKey(it.next()));
            }
        }
        auraNavigator.reconcileTabs(AIX.A00(aiy), new AnonymousClass2(this.$artifactsLoaded$delegate));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchActiveSessionHostKt$ReconcileTabsEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
