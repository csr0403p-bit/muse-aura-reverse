package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C1HY;
import X.EnumC10573Huf;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchForegroundHeaderState$foregroundOwner$2 extends AbstractC7559F3s implements Function0<C1HY> {
    public final /* synthetic */ HatchForegroundHeaderState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchForegroundHeaderState$foregroundOwner$2(HatchForegroundHeaderState hatchForegroundHeaderState) {
        super(0);
        this.this$0 = hatchForegroundHeaderState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C1HY invoke() {
        Object objPrevious;
        Object objPrevious2;
        C1HY c1hy;
        SnapshotStateList<ForegroundHeaderSlot> snapshotStateList = this.this$0.slots;
        ListIterator listIterator = snapshotStateList.listIterator(snapshotStateList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((ForegroundHeaderSlot) objPrevious).getLifecycleState() == EnumC10573Huf.A05) {
                break;
            }
        }
        ForegroundHeaderSlot foregroundHeaderSlot = (ForegroundHeaderSlot) objPrevious;
        if (foregroundHeaderSlot != null && (c1hy = foregroundHeaderSlot.owner) != null) {
            return c1hy;
        }
        SnapshotStateList<ForegroundHeaderSlot> snapshotStateList2 = this.this$0.slots;
        ListIterator listIterator2 = snapshotStateList2.listIterator(snapshotStateList2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                objPrevious2 = null;
                break;
            }
            objPrevious2 = listIterator2.previous();
            if (((ForegroundHeaderSlot) objPrevious2).getLifecycleState().A00(EnumC10573Huf.A06)) {
                break;
            }
        }
        ForegroundHeaderSlot foregroundHeaderSlot2 = (ForegroundHeaderSlot) objPrevious2;
        if (foregroundHeaderSlot2 != null) {
            return foregroundHeaderSlot2.owner;
        }
        return null;
    }
}
