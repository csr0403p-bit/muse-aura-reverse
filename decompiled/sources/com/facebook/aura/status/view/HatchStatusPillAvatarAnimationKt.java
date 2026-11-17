package com.facebook.aura.status.view;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C1BO;
import X.G0U;
import X.G0V;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.tabs.AuraTabBarHostState;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchStatusPillAvatarAnimationKt {
    public static final long TAB_CONTENT_DRAW_TIMEOUT_MS = 1000;

    /* renamed from: com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AT5<Float, AOW> $avatarSize;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ boolean $isTakeoverAvatar;
        public final /* synthetic */ G0U<Boolean, Unit> $onRetainingTakeoverAvatarChanged;
        public final /* synthetic */ float $targetSize;
        public final /* synthetic */ boolean $useTakeoverLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AT5<Float, AOW> at5, float f, boolean z, boolean z2, boolean z3, G0U<? super Boolean, Unit> g0u, int i) {
            super(2);
            this.$avatarSize = at5;
            this.$targetSize = f;
            this.$isTakeoverAvatar = z;
            this.$isExpanded = z2;
            this.$useTakeoverLayout = z3;
            this.$onRetainingTakeoverAvatarChanged = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusPillAvatarAnimationKt.StatusPillAvatarAnimation(this.$avatarSize, this.$targetSize, this.$isTakeoverAvatar, this.$isExpanded, this.$useTakeoverLayout, this.$onRetainingTakeoverAvatarChanged, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void StatusPillAvatarAnimation(X.AT5<java.lang.Float, X.AOW> r13, float r14, boolean r15, boolean r16, boolean r17, X.G0U<? super java.lang.Boolean, kotlin.Unit> r18, X.BFM r19, int r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt.StatusPillAvatarAnimation(X.AT5, float, boolean, boolean, boolean, X.G0U, X.BFM, int):void");
    }

    public static final /* synthetic */ AuraNavKey access$StatusPillAvatarAnimation$lambda$0(C1BO c1bo) {
        return (AuraNavKey) c1bo.getValue();
    }

    public static final /* synthetic */ AuraTabBarHostState access$StatusPillAvatarAnimation$lambda$1(C1BO c1bo) {
        return (AuraTabBarHostState) c1bo.getValue();
    }
}
