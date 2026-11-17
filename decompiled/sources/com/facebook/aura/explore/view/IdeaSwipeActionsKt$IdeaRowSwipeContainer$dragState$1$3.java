package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00r;
import X.C10543Hqv;
import X.C7384Etj;
import X.F60;
import X.G0U;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$3 extends AbstractC7559F3s implements G0U<IdeaSwipeAnchor, Boolean> {
    public final /* synthetic */ C00r $measuredRowWidth;
    public final /* synthetic */ C10543Hqv<AnchoredDraggableState<IdeaSwipeAnchor>> $state;

    @Override // X.G0U
    public final Boolean invoke(IdeaSwipeAnchor ideaSwipeAnchor) {
        int iA0E = AnonymousClass001.A0E(ideaSwipeAnchor, 0);
        boolean zHasRejectTravel = true;
        if (iA0E == 2) {
            zHasRejectTravel = false;
        } else if (iA0E == 0) {
            AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState = this.$state.element;
            if (anchoredDraggableState == null) {
                C7384Etj.A0b("state");
                throw F60.createAndThrow();
            }
            zHasRejectTravel = IdeaSwipeActionsKt.hasRejectTravel(anchoredDraggableState.A08.AFn(), this.$measuredRowWidth.AGd());
        } else if (iA0E != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(zHasRejectTravel);
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdeaSwipeAnchor.values().length];
            try {
                AnonymousClass002.A13(IdeaSwipeAnchor.MORE_LIKE_THIS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(IdeaSwipeAnchor.NOT_INTERESTED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(IdeaSwipeAnchor.CLOSED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$3(C10543Hqv<AnchoredDraggableState<IdeaSwipeAnchor>> c10543Hqv, C00r c00r) {
        super(1);
        this.$state = c10543Hqv;
        this.$measuredRowWidth = c00r;
    }
}
