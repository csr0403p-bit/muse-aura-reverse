package com.facebook.aura.navigation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.navigation.BottomSheetScene$content$1$sheetNavigator$1$1$back$1", f = "BottomSheetSceneStrategy.kt", l = {135}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class BottomSheetScene$content$1$sheetNavigator$1$1$back$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AtomicBoolean $isDismissing;
    public final /* synthetic */ AuraNavigator $outerNavigator;
    public final /* synthetic */ AuraSheetState $sheetState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScene$content$1$sheetNavigator$1$1$back$1(AuraSheetState auraSheetState, AuraNavigator auraNavigator, AtomicBoolean atomicBoolean, HtJ<? super BottomSheetScene$content$1$sheetNavigator$1$1$back$1> htJ) {
        super(2, htJ);
        this.$sheetState = auraSheetState;
        this.$outerNavigator = auraNavigator;
        this.$isDismissing = atomicBoolean;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BottomSheetScene$content$1$sheetNavigator$1$1$back$1(this.$sheetState, this.$outerNavigator, this.$isDismissing, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                AuraSheetState auraSheetState = this.$sheetState;
                this.label = 1;
                if (auraSheetState.hide(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$outerNavigator.back();
            this.$isDismissing.set(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$isDismissing.set(false);
            throw th;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((BottomSheetScene$content$1$sheetNavigator$1$1$back$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
